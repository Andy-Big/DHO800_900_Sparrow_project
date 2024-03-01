package androidx.databinding;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.CallbackRegistry;
import androidx.databinding.Observable;
import androidx.databinding.ObservableList;
import androidx.databinding.ObservableMap;
import androidx.databinding.library.R;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.viewbinding.ViewBinding;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class ViewDataBinding extends BaseObservable implements ViewBinding {
    private static final int BINDING_NUMBER_START;
    public static final String BINDING_TAG_PREFIX = "binding_";
    private static final CreateWeakListener CREATE_LIST_LISTENER;
    private static final CreateWeakListener CREATE_LIVE_DATA_LISTENER;
    private static final CreateWeakListener CREATE_MAP_LISTENER;
    private static final CreateWeakListener CREATE_PROPERTY_LISTENER;
    private static final int HALTED = 2;
    private static final int REBIND = 1;
    private static final CallbackRegistry.NotifierCallback<OnRebindCallback, ViewDataBinding, Void> REBIND_NOTIFIER;
    private static final int REBOUND = 3;
    private static final View.OnAttachStateChangeListener ROOT_REATTACHED_LISTENER;
    static int SDK_INT;
    private static final boolean USE_CHOREOGRAPHER;
    private static final ReferenceQueue<ViewDataBinding> sReferenceQueue;
    protected final DataBindingComponent mBindingComponent;
    private Choreographer mChoreographer;
    private ViewDataBinding mContainingBinding;
    private final Choreographer.FrameCallback mFrameCallback;
    private boolean mInLiveDataRegisterObserver;
    private boolean mIsExecutingPendingBindings;
    private LifecycleOwner mLifecycleOwner;
    private WeakListener[] mLocalFieldObservers;
    private OnStartListener mOnStartListener;
    private boolean mPendingRebind;
    private CallbackRegistry<OnRebindCallback, ViewDataBinding, Void> mRebindCallbacks;
    private boolean mRebindHalted;
    private final Runnable mRebindRunnable;
    private final View mRoot;
    private Handler mUIThreadHandler;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface CreateWeakListener {
        WeakListener create(ViewDataBinding viewDataBinding, int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface ObservableReference<T> {
        void addListener(T t);

        WeakListener<T> getListener();

        void removeListener(T t);

        void setLifecycleOwner(LifecycleOwner lifecycleOwner);
    }

    protected abstract void executeBindings();

    public abstract boolean hasPendingBindings();

    public abstract void invalidateAll();

    protected abstract boolean onFieldChange(int i, Object obj, int i2);

    public abstract boolean setVariable(int i, Object obj);

    static {
        int i = Build.VERSION.SDK_INT;
        SDK_INT = i;
        BINDING_NUMBER_START = 8;
        USE_CHOREOGRAPHER = i >= 16;
        CREATE_PROPERTY_LISTENER = new CreateWeakListener() { // from class: androidx.databinding.ViewDataBinding.1
            @Override // androidx.databinding.ViewDataBinding.CreateWeakListener
            public WeakListener create(ViewDataBinding viewDataBinding, int i2) {
                return new WeakPropertyListener(viewDataBinding, i2).getListener();
            }
        };
        CREATE_LIST_LISTENER = new CreateWeakListener() { // from class: androidx.databinding.ViewDataBinding.2
            @Override // androidx.databinding.ViewDataBinding.CreateWeakListener
            public WeakListener create(ViewDataBinding viewDataBinding, int i2) {
                return new WeakListListener(viewDataBinding, i2).getListener();
            }
        };
        CREATE_MAP_LISTENER = new CreateWeakListener() { // from class: androidx.databinding.ViewDataBinding.3
            @Override // androidx.databinding.ViewDataBinding.CreateWeakListener
            public WeakListener create(ViewDataBinding viewDataBinding, int i2) {
                return new WeakMapListener(viewDataBinding, i2).getListener();
            }
        };
        CREATE_LIVE_DATA_LISTENER = new CreateWeakListener() { // from class: androidx.databinding.ViewDataBinding.4
            @Override // androidx.databinding.ViewDataBinding.CreateWeakListener
            public WeakListener create(ViewDataBinding viewDataBinding, int i2) {
                return new LiveDataListener(viewDataBinding, i2).getListener();
            }
        };
        REBIND_NOTIFIER = new CallbackRegistry.NotifierCallback<OnRebindCallback, ViewDataBinding, Void>() { // from class: androidx.databinding.ViewDataBinding.5
            @Override // androidx.databinding.CallbackRegistry.NotifierCallback
            public void onNotifyCallback(OnRebindCallback onRebindCallback, ViewDataBinding viewDataBinding, int i2, Void r4) {
                if (i2 == 1) {
                    if (onRebindCallback.onPreBind(viewDataBinding)) {
                        return;
                    }
                    viewDataBinding.mRebindHalted = true;
                } else if (i2 == 2) {
                    onRebindCallback.onCanceled(viewDataBinding);
                } else if (i2 != 3) {
                } else {
                    onRebindCallback.onBound(viewDataBinding);
                }
            }
        };
        sReferenceQueue = new ReferenceQueue<>();
        if (Build.VERSION.SDK_INT < 19) {
            ROOT_REATTACHED_LISTENER = null;
        } else {
            ROOT_REATTACHED_LISTENER = new View.OnAttachStateChangeListener() { // from class: androidx.databinding.ViewDataBinding.6
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    ViewDataBinding.getBinding(view).mRebindRunnable.run();
                    view.removeOnAttachStateChangeListener(this);
                }
            };
        }
    }

    protected ViewDataBinding(DataBindingComponent dataBindingComponent, View view, int i) {
        this.mRebindRunnable = new Runnable() { // from class: androidx.databinding.ViewDataBinding.7
            @Override // java.lang.Runnable
            public void run() {
                synchronized (this) {
                    ViewDataBinding.this.mPendingRebind = false;
                }
                ViewDataBinding.processReferenceQueue();
                if (Build.VERSION.SDK_INT >= 19 && !ViewDataBinding.this.mRoot.isAttachedToWindow()) {
                    ViewDataBinding.this.mRoot.removeOnAttachStateChangeListener(ViewDataBinding.ROOT_REATTACHED_LISTENER);
                    ViewDataBinding.this.mRoot.addOnAttachStateChangeListener(ViewDataBinding.ROOT_REATTACHED_LISTENER);
                    return;
                }
                ViewDataBinding.this.executePendingBindings();
            }
        };
        this.mPendingRebind = false;
        this.mRebindHalted = false;
        this.mBindingComponent = dataBindingComponent;
        this.mLocalFieldObservers = new WeakListener[i];
        this.mRoot = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (USE_CHOREOGRAPHER) {
            this.mChoreographer = Choreographer.getInstance();
            this.mFrameCallback = new Choreographer.FrameCallback() { // from class: androidx.databinding.ViewDataBinding.8
                @Override // android.view.Choreographer.FrameCallback
                public void doFrame(long j) {
                    ViewDataBinding.this.mRebindRunnable.run();
                }
            };
            return;
        }
        this.mFrameCallback = null;
        this.mUIThreadHandler = new Handler(Looper.myLooper());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ViewDataBinding(Object obj, View view, int i) {
        this(checkAndCastToBindingComponent(obj), view, i);
    }

    private static DataBindingComponent checkAndCastToBindingComponent(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof DataBindingComponent)) {
            throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
        }
        return (DataBindingComponent) obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setRootTag(View view) {
        view.setTag(R.id.dataBinding, this);
    }

    protected void setRootTag(View[] viewArr) {
        for (View view : viewArr) {
            view.setTag(R.id.dataBinding, this);
        }
    }

    public static int getBuildSdkInt() {
        return SDK_INT;
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        WeakListener[] weakListenerArr;
        LifecycleOwner lifecycleOwner2 = this.mLifecycleOwner;
        if (lifecycleOwner2 == lifecycleOwner) {
            return;
        }
        if (lifecycleOwner2 != null) {
            lifecycleOwner2.getLifecycle().removeObserver(this.mOnStartListener);
        }
        this.mLifecycleOwner = lifecycleOwner;
        if (lifecycleOwner != null) {
            if (this.mOnStartListener == null) {
                this.mOnStartListener = new OnStartListener();
            }
            lifecycleOwner.getLifecycle().addObserver(this.mOnStartListener);
        }
        for (WeakListener weakListener : this.mLocalFieldObservers) {
            if (weakListener != null) {
                weakListener.setLifecycleOwner(lifecycleOwner);
            }
        }
    }

    public LifecycleOwner getLifecycleOwner() {
        return this.mLifecycleOwner;
    }

    public void addOnRebindCallback(OnRebindCallback onRebindCallback) {
        if (this.mRebindCallbacks == null) {
            this.mRebindCallbacks = new CallbackRegistry<>(REBIND_NOTIFIER);
        }
        this.mRebindCallbacks.add(onRebindCallback);
    }

    public void removeOnRebindCallback(OnRebindCallback onRebindCallback) {
        CallbackRegistry<OnRebindCallback, ViewDataBinding, Void> callbackRegistry = this.mRebindCallbacks;
        if (callbackRegistry != null) {
            callbackRegistry.remove(onRebindCallback);
        }
    }

    public void executePendingBindings() {
        ViewDataBinding viewDataBinding = this.mContainingBinding;
        if (viewDataBinding == null) {
            executeBindingsInternal();
        } else {
            viewDataBinding.executePendingBindings();
        }
    }

    private void executeBindingsInternal() {
        if (this.mIsExecutingPendingBindings) {
            requestRebind();
        } else if (hasPendingBindings()) {
            this.mIsExecutingPendingBindings = true;
            this.mRebindHalted = false;
            CallbackRegistry<OnRebindCallback, ViewDataBinding, Void> callbackRegistry = this.mRebindCallbacks;
            if (callbackRegistry != null) {
                callbackRegistry.notifyCallbacks(this, 1, null);
                if (this.mRebindHalted) {
                    this.mRebindCallbacks.notifyCallbacks(this, 2, null);
                }
            }
            if (!this.mRebindHalted) {
                executeBindings();
                CallbackRegistry<OnRebindCallback, ViewDataBinding, Void> callbackRegistry2 = this.mRebindCallbacks;
                if (callbackRegistry2 != null) {
                    callbackRegistry2.notifyCallbacks(this, 3, null);
                }
            }
            this.mIsExecutingPendingBindings = false;
        }
    }

    protected static void executeBindingsOn(ViewDataBinding viewDataBinding) {
        viewDataBinding.executeBindingsInternal();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void forceExecuteBindings() {
        executeBindings();
    }

    public void unbind() {
        WeakListener[] weakListenerArr;
        for (WeakListener weakListener : this.mLocalFieldObservers) {
            if (weakListener != null) {
                weakListener.unregister();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ViewDataBinding getBinding(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(R.id.dataBinding);
        }
        return null;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.mRoot;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleFieldChange(int i, Object obj, int i2) {
        if (!this.mInLiveDataRegisterObserver && onFieldChange(i, obj, i2)) {
            requestRebind();
        }
    }

    protected boolean unregisterFrom(int i) {
        WeakListener weakListener = this.mLocalFieldObservers[i];
        if (weakListener != null) {
            return weakListener.unregister();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void requestRebind() {
        ViewDataBinding viewDataBinding = this.mContainingBinding;
        if (viewDataBinding != null) {
            viewDataBinding.requestRebind();
            return;
        }
        LifecycleOwner lifecycleOwner = this.mLifecycleOwner;
        if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            synchronized (this) {
                if (this.mPendingRebind) {
                    return;
                }
                this.mPendingRebind = true;
                if (USE_CHOREOGRAPHER) {
                    this.mChoreographer.postFrameCallback(this.mFrameCallback);
                } else {
                    this.mUIThreadHandler.post(this.mRebindRunnable);
                }
            }
        }
    }

    protected Object getObservedField(int i) {
        WeakListener weakListener = this.mLocalFieldObservers[i];
        if (weakListener == null) {
            return null;
        }
        return weakListener.getTarget();
    }

    private boolean updateRegistration(int i, Object obj, CreateWeakListener createWeakListener) {
        if (obj == null) {
            return unregisterFrom(i);
        }
        WeakListener weakListener = this.mLocalFieldObservers[i];
        if (weakListener == null) {
            registerTo(i, obj, createWeakListener);
            return true;
        } else if (weakListener.getTarget() == obj) {
            return false;
        } else {
            unregisterFrom(i);
            registerTo(i, obj, createWeakListener);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean updateRegistration(int i, Observable observable) {
        return updateRegistration(i, observable, CREATE_PROPERTY_LISTENER);
    }

    protected boolean updateRegistration(int i, ObservableList observableList) {
        return updateRegistration(i, observableList, CREATE_LIST_LISTENER);
    }

    protected boolean updateRegistration(int i, ObservableMap observableMap) {
        return updateRegistration(i, observableMap, CREATE_MAP_LISTENER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean updateLiveDataRegistration(int i, LiveData<?> liveData) {
        this.mInLiveDataRegisterObserver = true;
        try {
            return updateRegistration(i, liveData, CREATE_LIVE_DATA_LISTENER);
        } finally {
            this.mInLiveDataRegisterObserver = false;
        }
    }

    protected void ensureBindingComponentIsNotNull(Class<?> cls) {
        if (this.mBindingComponent != null) {
            return;
        }
        throw new IllegalStateException("Required DataBindingComponent is null in class " + getClass().getSimpleName() + ". A BindingAdapter in " + cls.getCanonicalName() + " is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.");
    }

    protected void registerTo(int i, Object obj, CreateWeakListener createWeakListener) {
        if (obj == null) {
            return;
        }
        WeakListener weakListener = this.mLocalFieldObservers[i];
        if (weakListener == null) {
            weakListener = createWeakListener.create(this, i);
            this.mLocalFieldObservers[i] = weakListener;
            LifecycleOwner lifecycleOwner = this.mLifecycleOwner;
            if (lifecycleOwner != null) {
                weakListener.setLifecycleOwner(lifecycleOwner);
            }
        }
        weakListener.setTarget(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static ViewDataBinding bind(Object obj, View view, int i) {
        return DataBindingUtil.bind(checkAndCastToBindingComponent(obj), view, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object[] mapBindings(DataBindingComponent dataBindingComponent, View view, int i, IncludedLayouts includedLayouts, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        mapBindings(dataBindingComponent, view, objArr, includedLayouts, sparseIntArray, true);
        return objArr;
    }

    protected static boolean parse(String str, boolean z) {
        return str == null ? z : Boolean.parseBoolean(str);
    }

    protected static byte parse(String str, byte b) {
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b;
        }
    }

    protected static short parse(String str, short s) {
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s;
        }
    }

    protected static int parse(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    protected static long parse(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    protected static float parse(String str, float f) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f;
        }
    }

    protected static double parse(String str, double d) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    protected static char parse(String str, char c) {
        return (str == null || str.isEmpty()) ? c : str.charAt(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int getColorFromResource(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return view.getContext().getColor(i);
        }
        return view.getResources().getColor(i);
    }

    protected static ColorStateList getColorStateListFromResource(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return view.getContext().getColorStateList(i);
        }
        return view.getResources().getColorStateList(i);
    }

    protected static Drawable getDrawableFromResource(View view, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getContext().getDrawable(i);
        }
        return view.getResources().getDrawable(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T> T getFromArray(T[] tArr, int i) {
        if (tArr == null || i < 0 || i >= tArr.length) {
            return null;
        }
        return tArr[i];
    }

    protected static <T> void setTo(T[] tArr, int i, T t) {
        if (tArr == null || i < 0 || i >= tArr.length) {
            return;
        }
        tArr[i] = t;
    }

    protected static boolean getFromArray(boolean[] zArr, int i) {
        if (zArr == null || i < 0 || i >= zArr.length) {
            return false;
        }
        return zArr[i];
    }

    protected static void setTo(boolean[] zArr, int i, boolean z) {
        if (zArr == null || i < 0 || i >= zArr.length) {
            return;
        }
        zArr[i] = z;
    }

    protected static byte getFromArray(byte[] bArr, int i) {
        if (bArr == null || i < 0 || i >= bArr.length) {
            return (byte) 0;
        }
        return bArr[i];
    }

    protected static void setTo(byte[] bArr, int i, byte b) {
        if (bArr == null || i < 0 || i >= bArr.length) {
            return;
        }
        bArr[i] = b;
    }

    protected static short getFromArray(short[] sArr, int i) {
        if (sArr == null || i < 0 || i >= sArr.length) {
            return (short) 0;
        }
        return sArr[i];
    }

    protected static void setTo(short[] sArr, int i, short s) {
        if (sArr == null || i < 0 || i >= sArr.length) {
            return;
        }
        sArr[i] = s;
    }

    protected static char getFromArray(char[] cArr, int i) {
        if (cArr == null || i < 0 || i >= cArr.length) {
            return (char) 0;
        }
        return cArr[i];
    }

    protected static void setTo(char[] cArr, int i, char c) {
        if (cArr == null || i < 0 || i >= cArr.length) {
            return;
        }
        cArr[i] = c;
    }

    protected static int getFromArray(int[] iArr, int i) {
        if (iArr == null || i < 0 || i >= iArr.length) {
            return 0;
        }
        return iArr[i];
    }

    protected static void setTo(int[] iArr, int i, int i2) {
        if (iArr == null || i < 0 || i >= iArr.length) {
            return;
        }
        iArr[i] = i2;
    }

    protected static long getFromArray(long[] jArr, int i) {
        if (jArr == null || i < 0 || i >= jArr.length) {
            return 0L;
        }
        return jArr[i];
    }

    protected static void setTo(long[] jArr, int i, long j) {
        if (jArr == null || i < 0 || i >= jArr.length) {
            return;
        }
        jArr[i] = j;
    }

    protected static float getFromArray(float[] fArr, int i) {
        if (fArr == null || i < 0 || i >= fArr.length) {
            return 0.0f;
        }
        return fArr[i];
    }

    protected static void setTo(float[] fArr, int i, float f) {
        if (fArr == null || i < 0 || i >= fArr.length) {
            return;
        }
        fArr[i] = f;
    }

    protected static double getFromArray(double[] dArr, int i) {
        if (dArr == null || i < 0 || i >= dArr.length) {
            return 0.0d;
        }
        return dArr[i];
    }

    protected static void setTo(double[] dArr, int i, double d) {
        if (dArr == null || i < 0 || i >= dArr.length) {
            return;
        }
        dArr[i] = d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T> T getFromList(List<T> list, int i) {
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    protected static <T> void setTo(List<T> list, int i, T t) {
        if (list == null || i < 0 || i >= list.size()) {
            return;
        }
        list.set(i, t);
    }

    protected static <T> T getFromList(SparseArray<T> sparseArray, int i) {
        if (sparseArray == null || i < 0) {
            return null;
        }
        return sparseArray.get(i);
    }

    protected static <T> void setTo(SparseArray<T> sparseArray, int i, T t) {
        if (sparseArray == null || i < 0 || i >= sparseArray.size()) {
            return;
        }
        sparseArray.put(i, t);
    }

    protected static <T> T getFromList(LongSparseArray<T> longSparseArray, int i) {
        if (longSparseArray == null || i < 0) {
            return null;
        }
        return longSparseArray.get(i);
    }

    protected static <T> void setTo(LongSparseArray<T> longSparseArray, int i, T t) {
        if (longSparseArray == null || i < 0 || i >= longSparseArray.size()) {
            return;
        }
        longSparseArray.put(i, t);
    }

    protected static <T> T getFromList(androidx.collection.LongSparseArray<T> longSparseArray, int i) {
        if (longSparseArray == null || i < 0) {
            return null;
        }
        return longSparseArray.get(i);
    }

    protected static <T> void setTo(androidx.collection.LongSparseArray<T> longSparseArray, int i, T t) {
        if (longSparseArray == null || i < 0 || i >= longSparseArray.size()) {
            return;
        }
        longSparseArray.put(i, t);
    }

    protected static boolean getFromList(SparseBooleanArray sparseBooleanArray, int i) {
        if (sparseBooleanArray == null || i < 0) {
            return false;
        }
        return sparseBooleanArray.get(i);
    }

    protected static void setTo(SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        if (sparseBooleanArray == null || i < 0 || i >= sparseBooleanArray.size()) {
            return;
        }
        sparseBooleanArray.put(i, z);
    }

    protected static int getFromList(SparseIntArray sparseIntArray, int i) {
        if (sparseIntArray == null || i < 0) {
            return 0;
        }
        return sparseIntArray.get(i);
    }

    protected static void setTo(SparseIntArray sparseIntArray, int i, int i2) {
        if (sparseIntArray == null || i < 0 || i >= sparseIntArray.size()) {
            return;
        }
        sparseIntArray.put(i, i2);
    }

    protected static long getFromList(SparseLongArray sparseLongArray, int i) {
        if (sparseLongArray == null || i < 0) {
            return 0L;
        }
        return sparseLongArray.get(i);
    }

    protected static void setTo(SparseLongArray sparseLongArray, int i, long j) {
        if (sparseLongArray == null || i < 0 || i >= sparseLongArray.size()) {
            return;
        }
        sparseLongArray.put(i, j);
    }

    protected static <K, T> T getFrom(Map<K, T> map, K k) {
        if (map == null) {
            return null;
        }
        return map.get(k);
    }

    protected static <K, T> void setTo(Map<K, T> map, K k, T t) {
        if (map == null) {
            return;
        }
        map.put(k, t);
    }

    protected static void setBindingInverseListener(ViewDataBinding viewDataBinding, InverseBindingListener inverseBindingListener, PropertyChangedInverseListener propertyChangedInverseListener) {
        if (inverseBindingListener != propertyChangedInverseListener) {
            if (inverseBindingListener != null) {
                viewDataBinding.removeOnPropertyChangedCallback((PropertyChangedInverseListener) inverseBindingListener);
            }
            if (propertyChangedInverseListener != null) {
                viewDataBinding.addOnPropertyChangedCallback(propertyChangedInverseListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int safeUnbox(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static long safeUnbox(Long l) {
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    protected static short safeUnbox(Short sh) {
        if (sh == null) {
            return (short) 0;
        }
        return sh.shortValue();
    }

    protected static byte safeUnbox(Byte b) {
        if (b == null) {
            return (byte) 0;
        }
        return b.byteValue();
    }

    protected static char safeUnbox(Character ch2) {
        if (ch2 == null) {
            return (char) 0;
        }
        return ch2.charValue();
    }

    protected static double safeUnbox(Double d) {
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    protected static float safeUnbox(Float f) {
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean safeUnbox(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    protected void setContainedBinding(ViewDataBinding viewDataBinding) {
        if (viewDataBinding != null) {
            viewDataBinding.mContainingBinding = this;
        }
    }

    protected static Object[] mapBindings(DataBindingComponent dataBindingComponent, View[] viewArr, int i, IncludedLayouts includedLayouts, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        for (View view : viewArr) {
            mapBindings(dataBindingComponent, view, objArr, includedLayouts, sparseIntArray, true);
        }
        return objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void mapBindings(DataBindingComponent dataBindingComponent, View view, Object[] objArr, IncludedLayouts includedLayouts, SparseIntArray sparseIntArray, boolean z) {
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int findIncludeIndex;
        int id;
        int i5;
        int i6;
        if (getBinding(view) != null) {
            return;
        }
        Object tag = view.getTag();
        String str = tag instanceof String ? (String) tag : null;
        int i7 = 1;
        if (z && str != null && str.startsWith("layout")) {
            int lastIndexOf = str.lastIndexOf(95);
            if (lastIndexOf > 0) {
                int i8 = lastIndexOf + 1;
                if (isNumeric(str, i8)) {
                    i6 = parseTagInt(str, i8);
                    if (objArr[i6] == null) {
                        objArr[i6] = view;
                    }
                    if (includedLayouts == null) {
                        i6 = -1;
                    }
                    z2 = true;
                    i = i6;
                }
            }
            i6 = -1;
            z2 = false;
            i = i6;
        } else if (str == null || !str.startsWith(BINDING_TAG_PREFIX)) {
            i = -1;
            z2 = false;
        } else {
            int parseTagInt = parseTagInt(str, BINDING_NUMBER_START);
            if (objArr[parseTagInt] == null) {
                objArr[parseTagInt] = view;
            }
            if (includedLayouts == null) {
                parseTagInt = -1;
            }
            i = parseTagInt;
            z2 = true;
        }
        if (!z2 && (id = view.getId()) > 0 && sparseIntArray != null && (i5 = sparseIntArray.get(id, -1)) >= 0 && objArr[i5] == null) {
            objArr[i5] = view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            int i9 = 0;
            int i10 = 0;
            while (i9 < childCount) {
                View childAt = viewGroup.getChildAt(i9);
                if (i >= 0 && (childAt.getTag() instanceof String)) {
                    String str2 = (String) childAt.getTag();
                    if (str2.endsWith("_0") && str2.startsWith("layout") && str2.indexOf(47) > 0 && (findIncludeIndex = findIncludeIndex(str2, i10, includedLayouts, i)) >= 0) {
                        int i11 = findIncludeIndex + 1;
                        int i12 = includedLayouts.indexes[i][findIncludeIndex];
                        int i13 = includedLayouts.layoutIds[i][findIncludeIndex];
                        int findLastMatching = findLastMatching(viewGroup, i9);
                        if (findLastMatching == i9) {
                            objArr[i12] = DataBindingUtil.bind(dataBindingComponent, childAt, i13);
                            i2 = i9;
                            i4 = i7;
                            i3 = i11;
                        } else {
                            int i14 = (findLastMatching - i9) + i7;
                            View[] viewArr = new View[i14];
                            for (int i15 = 0; i15 < i14; i15++) {
                                viewArr[i15] = viewGroup.getChildAt(i9 + i15);
                            }
                            objArr[i12] = DataBindingUtil.bind(dataBindingComponent, viewArr, i13);
                            i2 = i9 + (i14 - 1);
                            i3 = i11;
                            i4 = 1;
                        }
                        if (i4 != 0) {
                            mapBindings(dataBindingComponent, childAt, objArr, includedLayouts, sparseIntArray, false);
                        }
                        int i16 = i3;
                        i7 = 1;
                        i9 = i2 + 1;
                        i10 = i16;
                    }
                }
                i2 = i9;
                i3 = i10;
                i4 = 0;
                if (i4 != 0) {
                }
                int i162 = i3;
                i7 = 1;
                i9 = i2 + 1;
                i10 = i162;
            }
        }
    }

    private static int findIncludeIndex(String str, int i, IncludedLayouts includedLayouts, int i2) {
        CharSequence subSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = includedLayouts.layouts[i2];
        int length = strArr.length;
        while (i < length) {
            if (TextUtils.equals(subSequence, strArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private static int findLastMatching(ViewGroup viewGroup, int i) {
        String str = (String) viewGroup.getChildAt(i).getTag();
        String substring = str.substring(0, str.length() - 1);
        int length = substring.length();
        int childCount = viewGroup.getChildCount();
        for (int i2 = i + 1; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(substring)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    return i;
                }
                if (isNumeric(str2, length)) {
                    i = i2;
                }
            }
        }
        return i;
    }

    private static boolean isNumeric(String str, int i) {
        int length = str.length();
        if (length == i) {
            return false;
        }
        while (i < length) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    private static int parseTagInt(String str, int i) {
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            i2 = (i2 * 10) + (str.charAt(i) - '0');
            i++;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void processReferenceQueue() {
        while (true) {
            Reference<? extends ViewDataBinding> poll = sReferenceQueue.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof WeakListener) {
                ((WeakListener) poll).unregister();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends ViewDataBinding> T inflateInternal(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z, Object obj) {
        return (T) DataBindingUtil.inflate(layoutInflater, i, viewGroup, z, checkAndCastToBindingComponent(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class WeakListener<T> extends WeakReference<ViewDataBinding> {
        protected final int mLocalFieldId;
        private final ObservableReference<T> mObservable;
        private T mTarget;

        public WeakListener(ViewDataBinding viewDataBinding, int i, ObservableReference<T> observableReference) {
            super(viewDataBinding, ViewDataBinding.sReferenceQueue);
            this.mLocalFieldId = i;
            this.mObservable = observableReference;
        }

        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
            this.mObservable.setLifecycleOwner(lifecycleOwner);
        }

        public void setTarget(T t) {
            unregister();
            this.mTarget = t;
            if (t != null) {
                this.mObservable.addListener(t);
            }
        }

        public boolean unregister() {
            boolean z;
            T t = this.mTarget;
            if (t != null) {
                this.mObservable.removeListener(t);
                z = true;
            } else {
                z = false;
            }
            this.mTarget = null;
            return z;
        }

        public T getTarget() {
            return this.mTarget;
        }

        protected ViewDataBinding getBinder() {
            ViewDataBinding viewDataBinding = (ViewDataBinding) get();
            if (viewDataBinding == null) {
                unregister();
            }
            return viewDataBinding;
        }
    }

    /* loaded from: classes.dex */
    private static class WeakPropertyListener extends Observable.OnPropertyChangedCallback implements ObservableReference<Observable> {
        final WeakListener<Observable> mListener;

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        }

        public WeakPropertyListener(ViewDataBinding viewDataBinding, int i) {
            this.mListener = new WeakListener<>(viewDataBinding, i, this);
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public WeakListener<Observable> getListener() {
            return this.mListener;
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void addListener(Observable observable) {
            observable.addOnPropertyChangedCallback(this);
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void removeListener(Observable observable) {
            observable.removeOnPropertyChangedCallback(this);
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(Observable observable, int i) {
            ViewDataBinding binder = this.mListener.getBinder();
            if (binder != null && this.mListener.getTarget() == observable) {
                binder.handleFieldChange(this.mListener.mLocalFieldId, observable, i);
            }
        }
    }

    /* loaded from: classes.dex */
    private static class WeakListListener extends ObservableList.OnListChangedCallback implements ObservableReference<ObservableList> {
        final WeakListener<ObservableList> mListener;

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        }

        public WeakListListener(ViewDataBinding viewDataBinding, int i) {
            this.mListener = new WeakListener<>(viewDataBinding, i, this);
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public WeakListener<ObservableList> getListener() {
            return this.mListener;
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void addListener(ObservableList observableList) {
            observableList.addOnListChangedCallback(this);
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void removeListener(ObservableList observableList) {
            observableList.removeOnListChangedCallback(this);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onChanged(ObservableList observableList) {
            ObservableList target;
            ViewDataBinding binder = this.mListener.getBinder();
            if (binder != null && (target = this.mListener.getTarget()) == observableList) {
                binder.handleFieldChange(this.mListener.mLocalFieldId, target, 0);
            }
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeChanged(ObservableList observableList, int i, int i2) {
            onChanged(observableList);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeInserted(ObservableList observableList, int i, int i2) {
            onChanged(observableList);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeMoved(ObservableList observableList, int i, int i2, int i3) {
            onChanged(observableList);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeRemoved(ObservableList observableList, int i, int i2) {
            onChanged(observableList);
        }
    }

    /* loaded from: classes.dex */
    private static class WeakMapListener extends ObservableMap.OnMapChangedCallback implements ObservableReference<ObservableMap> {
        final WeakListener<ObservableMap> mListener;

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        }

        public WeakMapListener(ViewDataBinding viewDataBinding, int i) {
            this.mListener = new WeakListener<>(viewDataBinding, i, this);
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public WeakListener<ObservableMap> getListener() {
            return this.mListener;
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void addListener(ObservableMap observableMap) {
            observableMap.addOnMapChangedCallback(this);
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void removeListener(ObservableMap observableMap) {
            observableMap.removeOnMapChangedCallback(this);
        }

        @Override // androidx.databinding.ObservableMap.OnMapChangedCallback
        public void onMapChanged(ObservableMap observableMap, Object obj) {
            ViewDataBinding binder = this.mListener.getBinder();
            if (binder == null || observableMap != this.mListener.getTarget()) {
                return;
            }
            binder.handleFieldChange(this.mListener.mLocalFieldId, observableMap, 0);
        }
    }

    /* loaded from: classes.dex */
    private static class LiveDataListener implements Observer, ObservableReference<LiveData<?>> {
        LifecycleOwner mLifecycleOwner;
        final WeakListener<LiveData<?>> mListener;

        public LiveDataListener(ViewDataBinding viewDataBinding, int i) {
            this.mListener = new WeakListener<>(viewDataBinding, i, this);
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
            LiveData<?> target = this.mListener.getTarget();
            if (target != null) {
                if (this.mLifecycleOwner != null) {
                    target.removeObserver(this);
                }
                if (lifecycleOwner != null) {
                    target.observe(lifecycleOwner, this);
                }
            }
            this.mLifecycleOwner = lifecycleOwner;
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public WeakListener<LiveData<?>> getListener() {
            return this.mListener;
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void addListener(LiveData<?> liveData) {
            LifecycleOwner lifecycleOwner = this.mLifecycleOwner;
            if (lifecycleOwner != null) {
                liveData.observe(lifecycleOwner, this);
            }
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void removeListener(LiveData<?> liveData) {
            liveData.removeObserver(this);
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Object obj) {
            ViewDataBinding binder = this.mListener.getBinder();
            if (binder != null) {
                binder.handleFieldChange(this.mListener.mLocalFieldId, this.mListener.getTarget(), 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class IncludedLayouts {
        public final int[][] indexes;
        public final int[][] layoutIds;
        public final String[][] layouts;

        public IncludedLayouts(int i) {
            this.layouts = new String[i];
            this.indexes = new int[i];
            this.layoutIds = new int[i];
        }

        public void setIncludes(int i, String[] strArr, int[] iArr, int[] iArr2) {
            this.layouts[i] = strArr;
            this.indexes[i] = iArr;
            this.layoutIds[i] = iArr2;
        }
    }

    /* loaded from: classes.dex */
    protected static abstract class PropertyChangedInverseListener extends Observable.OnPropertyChangedCallback implements InverseBindingListener {
        final int mPropertyId;

        public PropertyChangedInverseListener(int i) {
            this.mPropertyId = i;
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(Observable observable, int i) {
            if (i == this.mPropertyId || i == 0) {
                onChange();
            }
        }
    }

    /* loaded from: classes.dex */
    static class OnStartListener implements LifecycleObserver {
        final WeakReference<ViewDataBinding> mBinding;

        private OnStartListener(ViewDataBinding viewDataBinding) {
            this.mBinding = new WeakReference<>(viewDataBinding);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = this.mBinding.get();
            if (viewDataBinding != null) {
                viewDataBinding.executePendingBindings();
            }
        }
    }
}
