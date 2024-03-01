package com.rigol.scope.databinding;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.rigol.scope.R;
import com.rigol.scope.data.DiskManageParam;
import com.rigol.scope.data.DiskParam;
import com.rigol.scope.data.SharedParam;
import com.rigol.scope.generated.callback.OnClickListener;
import com.rigol.scope.utilities.ContextUtil;
/* loaded from: classes2.dex */
public class PopupviewDiskManageBindingImpl extends PopupviewDiskManageBinding implements OnClickListener.Listener {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private final View.OnClickListener mCallback71;
    private final View.OnClickListener mCallback72;
    private final View.OnClickListener mCallback73;
    private final View.OnClickListener mCallback74;
    private final View.OnClickListener mCallback75;
    private final View.OnClickListener mCallback76;
    private final View.OnClickListener mCallback77;
    private final View.OnClickListener mCallback78;
    private final View.OnClickListener mCallback79;
    private final View.OnClickListener mCallback80;
    private final View.OnClickListener mCallback81;
    private final View.OnClickListener mCallback82;
    private final View.OnClickListener mCallback83;
    private final View.OnClickListener mCallback84;
    private final View.OnClickListener mCallback85;
    private final View.OnClickListener mCallback86;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.dividing_line, 20);
        sViewsWithIds.put(R.id.bottom_layout, 21);
        sViewsWithIds.put(R.id.bottom_dividing_line, 22);
    }

    public PopupviewDiskManageBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 23, sIncludes, sViewsWithIds));
    }

    private PopupviewDiskManageBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (ImageView) objArr[1], (View) objArr[22], (ConstraintLayout) objArr[21], (Button) objArr[15], (Button) objArr[19], (Button) objArr[10], (Button) objArr[13], (Button) objArr[14], (TextView) objArr[3], (Button) objArr[11], (Button) objArr[16], (ImageView) objArr[4], (View) objArr[20], (TextView) objArr[8], (RecyclerView) objArr[7], (ImageView) objArr[2], (TextView) objArr[9], (Button) objArr[18], (Button) objArr[12], (Button) objArr[17], (ImageButton) objArr[5], (ImageButton) objArr[6]);
        this.mDirtyFlags = -1L;
        this.backward.setTag(null);
        this.cancel.setTag(null);
        this.cleanAll.setTag(null);
        this.copy.setTag(null);
        this.createFile.setTag(null);
        this.createFolder.setTag(null);
        this.currentPath.setTag(null);
        this.cut.setTag(null);
        this.delete.setTag(null);
        this.diskListArrow.setTag(null);
        this.empty.setTag(null);
        this.fileList.setTag(null);
        this.forward.setTag(null);
        this.loading.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        this.ok.setTag(null);
        this.paste.setTag(null);
        this.rename.setTag(null);
        this.selectAll.setTag(null);
        this.selectCancel.setTag(null);
        setRootTag(view);
        this.mCallback79 = new OnClickListener(this, 9);
        this.mCallback82 = new OnClickListener(this, 12);
        this.mCallback83 = new OnClickListener(this, 13);
        this.mCallback71 = new OnClickListener(this, 1);
        this.mCallback77 = new OnClickListener(this, 7);
        this.mCallback80 = new OnClickListener(this, 10);
        this.mCallback78 = new OnClickListener(this, 8);
        this.mCallback81 = new OnClickListener(this, 11);
        this.mCallback74 = new OnClickListener(this, 4);
        this.mCallback86 = new OnClickListener(this, 16);
        this.mCallback76 = new OnClickListener(this, 6);
        this.mCallback75 = new OnClickListener(this, 5);
        this.mCallback72 = new OnClickListener(this, 2);
        this.mCallback84 = new OnClickListener(this, 14);
        this.mCallback85 = new OnClickListener(this, 15);
        this.mCallback73 = new OnClickListener(this, 3);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.mDirtyFlags != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        if (238 == i) {
            setDiskParam((DiskManageParam) obj);
        } else if (176 == i) {
            setClickListener((View.OnClickListener) obj);
        } else if (500 == i) {
            setLoadingFiles((ObservableBoolean) obj);
        } else if (814 != i) {
            return false;
        } else {
            setShareParam((SharedParam) obj);
        }
        return true;
    }

    @Override // com.rigol.scope.databinding.PopupviewDiskManageBinding
    public void setDiskParam(DiskManageParam diskManageParam) {
        updateRegistration(0, diskManageParam);
        this.mDiskParam = diskManageParam;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(238);
        super.requestRebind();
    }

    @Override // com.rigol.scope.databinding.PopupviewDiskManageBinding
    public void setClickListener(View.OnClickListener onClickListener) {
        this.mClickListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        notifyPropertyChanged(176);
        super.requestRebind();
    }

    @Override // com.rigol.scope.databinding.PopupviewDiskManageBinding
    public void setLoadingFiles(ObservableBoolean observableBoolean) {
        updateRegistration(1, observableBoolean);
        this.mLoadingFiles = observableBoolean;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(500);
        super.requestRebind();
    }

    @Override // com.rigol.scope.databinding.PopupviewDiskManageBinding
    public void setShareParam(SharedParam sharedParam) {
        updateRegistration(2, sharedParam);
        this.mShareParam = sharedParam;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(814);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i, Object obj, int i2) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    return onChangeDiskParamDiskParam((DiskParam) obj, i2);
                }
                return onChangeShareParam((SharedParam) obj, i2);
            }
            return onChangeLoadingFiles((ObservableBoolean) obj, i2);
        }
        return onChangeDiskParam((DiskManageParam) obj, i2);
    }

    private boolean onChangeDiskParam(DiskManageParam diskManageParam, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 1;
            }
            return true;
        } else if (i == 238) {
            synchronized (this) {
                this.mDirtyFlags |= 8;
            }
            return true;
        } else if (i == 186) {
            synchronized (this) {
                this.mDirtyFlags |= 32;
            }
            return true;
        } else if (i == 895) {
            synchronized (this) {
                this.mDirtyFlags |= 64;
            }
            return true;
        } else if (i == 787) {
            synchronized (this) {
                this.mDirtyFlags |= 128;
            }
            return true;
        } else if (i == 788) {
            synchronized (this) {
                this.mDirtyFlags |= 256;
            }
            return true;
        } else if (i == 596) {
            synchronized (this) {
                this.mDirtyFlags |= 512;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangeLoadingFiles(ObservableBoolean observableBoolean, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeShareParam(SharedParam sharedParam, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 4;
            }
            return true;
        } else if (i == 833) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangeDiskParamDiskParam(DiskParam diskParam, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 8;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:356:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0136  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void executeBindings() {
        long j;
        float f;
        DiskManageParam.State state;
        String str;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        int i5;
        int i6;
        boolean z5;
        boolean z6;
        int i7;
        int i8;
        int i9;
        long j2;
        boolean z7;
        boolean z8;
        DiskManageParam.SelectionMode selectionMode;
        boolean z9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        float f2;
        boolean z11;
        int i15;
        int i16;
        int i17;
        boolean z12;
        int i18;
        boolean z13;
        int i19;
        int i20;
        int i21;
        int i22;
        float f3;
        int i23;
        int i24;
        int i25;
        long j3;
        long j4;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        DiskManageParam diskManageParam = this.mDiskParam;
        View.OnClickListener onClickListener = this.mClickListener;
        ObservableBoolean observableBoolean = this.mLoadingFiles;
        SharedParam sharedParam = this.mShareParam;
        if ((3049 & j) != 0) {
            if ((j & 3009) != 0) {
                state = diskManageParam != null ? diskManageParam.getState() : null;
                if ((j & 2497) != 0) {
                    z = state == DiskManageParam.State.SELECTING;
                    if ((j & 2369) != 0) {
                        j = z ? j | PlaybackStateCompat.ACTION_PLAY_FROM_URI : j | PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                    }
                    if ((j & 2113) != 0) {
                        if (z) {
                            j3 = j | PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
                            j4 = 536870912;
                        } else {
                            j3 = j | PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
                            j4 = 268435456;
                        }
                        j = j3 | j4;
                    }
                    if ((j & 2241) != 0) {
                        j = z ? j | 35184372088832L : j | 17592186044416L;
                    }
                    if ((j & 2113) != 0) {
                        i21 = z ? 0 : 8;
                        if (z) {
                            i22 = 8;
                            i24 = ((j & 2881) > 0L ? 1 : ((j & 2881) == 0L ? 0 : -1));
                            if (i24 != 0) {
                                z2 = state == DiskManageParam.State.DEFAULT;
                                if (i24 != 0) {
                                    j = z2 ? j | PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE : j | PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                                }
                            } else {
                                z2 = false;
                            }
                            i25 = ((j & 2113) > 0L ? 1 : ((j & 2113) == 0L ? 0 : -1));
                            if (i25 != 0) {
                                boolean z14 = state == DiskManageParam.State.PASTING;
                                if (i25 != 0) {
                                    j |= z14 ? 8589934592L : 4294967296L;
                                }
                                if (!z14) {
                                    i3 = 8;
                                }
                            }
                            i3 = 0;
                        }
                        i22 = 0;
                        i24 = ((j & 2881) > 0L ? 1 : ((j & 2881) == 0L ? 0 : -1));
                        if (i24 != 0) {
                        }
                        i25 = ((j & 2113) > 0L ? 1 : ((j & 2113) == 0L ? 0 : -1));
                        if (i25 != 0) {
                        }
                        i3 = 0;
                    }
                } else {
                    z = false;
                }
                i21 = 0;
                i22 = 0;
                i24 = ((j & 2881) > 0L ? 1 : ((j & 2881) == 0L ? 0 : -1));
                if (i24 != 0) {
                }
                i25 = ((j & 2113) > 0L ? 1 : ((j & 2113) == 0L ? 0 : -1));
                if (i25 != 0) {
                }
                i3 = 0;
            } else {
                state = null;
                z = false;
                i3 = 0;
                z2 = false;
                i21 = 0;
                i22 = 0;
            }
            if ((j & 2177) != 0) {
                i4 = diskManageParam != null ? diskManageParam.getSelectedCount() : 0;
                z3 = i4 == 1;
                f3 = ContextUtil.getAlpha(z3);
            } else {
                f3 = 0.0f;
                i4 = 0;
                z3 = false;
            }
            if ((j & 2057) != 0) {
                DiskParam diskParam = diskManageParam != null ? diskManageParam.getDiskParam() : null;
                updateRegistration(3, diskParam);
                if (diskParam != null) {
                    str = diskParam.getFormattedPath();
                    i23 = ((j & 2081) > 0L ? 1 : ((j & 2081) == 0L ? 0 : -1));
                    if (i23 == 0) {
                        i2 = diskManageParam != null ? diskManageParam.getCount() : 0;
                        z4 = i2 == 0;
                        if (i23 != 0) {
                            j = z4 ? j | 33554432 : j | 16777216;
                        }
                        i = z4 ? 8 : 0;
                        i5 = i21;
                        i6 = i22;
                        f = f3;
                    } else {
                        i5 = i21;
                        i6 = i22;
                        f = f3;
                        i = 0;
                        i2 = 0;
                        z4 = false;
                    }
                }
            }
            str = null;
            i23 = ((j & 2081) > 0L ? 1 : ((j & 2081) == 0L ? 0 : -1));
            if (i23 == 0) {
            }
        } else {
            f = 0.0f;
            state = null;
            str = null;
            i = 0;
            i2 = 0;
            z = false;
            i3 = 0;
            i4 = 0;
            z2 = false;
            z3 = false;
            z4 = false;
            i5 = 0;
            i6 = 0;
        }
        int i26 = ((j & 2083) > 0L ? 1 : ((j & 2083) == 0L ? 0 : -1));
        if (i26 != 0) {
            z5 = observableBoolean != null ? observableBoolean.get() : false;
            if (i26 != 0) {
                j |= z5 ? PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID : PlaybackStateCompat.ACTION_PREPARE;
            }
            if ((j & 2050) != 0) {
                j |= z5 ? 8796093022208L : 4398046511104L;
            }
            z6 = !z5;
            if ((j & 2083) != 0) {
                j |= z6 ? 8388608L : 4194304L;
            }
            if ((j & 2050) != 0) {
                i7 = z5 ? 0 : 8;
                i8 = ((j & 3076) > 0L ? 1 : ((j & 3076) == 0L ? 0 : -1));
                if (i8 != 0) {
                    boolean showUsb = sharedParam != null ? sharedParam.getShowUsb() : false;
                    if (i8 != 0) {
                        j |= showUsb ? 549755813888L : 274877906944L;
                    }
                    if (!showUsb) {
                        i9 = 8;
                        if ((j & 35184380502016L) != 0) {
                            if ((j & 35184372088832L) != 0) {
                                if (diskManageParam != null) {
                                    i4 = diskManageParam.getSelectedCount();
                                }
                                z7 = true;
                                z3 = i4 == 1;
                            } else {
                                z7 = true;
                            }
                            if ((j & PlaybackStateCompat.ACTION_PLAY_FROM_URI) != 0) {
                                selectionMode = diskManageParam != null ? diskManageParam.getSelectionMode() : null;
                                if (selectionMode != DiskManageParam.SelectionMode.NONE) {
                                    z9 = z7;
                                    j2 = 0;
                                    if ((j & 8404992) != 0) {
                                        if (diskManageParam != null) {
                                            i2 = diskManageParam.getCount();
                                        }
                                        z4 = i2 == 0 ? z7 : false;
                                        if ((j & 2081) != 0) {
                                            j = z4 ? j | 33554432 : j | 16777216;
                                        }
                                    }
                                    z8 = z3;
                                }
                            } else {
                                selectionMode = null;
                            }
                            z9 = false;
                            j2 = 0;
                            if ((j & 8404992) != 0) {
                            }
                            z8 = z3;
                        } else {
                            j2 = 0;
                            z7 = true;
                            z8 = z3;
                            selectionMode = null;
                            z9 = false;
                        }
                        i10 = ((j & 2369) > j2 ? 1 : ((j & 2369) == j2 ? 0 : -1));
                        if (i10 != 0) {
                            if (!z) {
                                z9 = false;
                            }
                            if (i10 != 0) {
                                j |= z9 ? 2199023255552L : 1099511627776L;
                            }
                        } else {
                            z9 = false;
                        }
                        i11 = ((j & 2083) > 0L ? 1 : ((j & 2083) == 0L ? 0 : -1));
                        if (i11 != 0) {
                            boolean z15 = z5 ? z7 : z4;
                            if (!z6) {
                                z4 = false;
                            }
                            if (i11 != 0) {
                                j |= z15 ? PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED : PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                            }
                            if ((j & 2083) != 0) {
                                j |= z4 ? 140737488355328L : 70368744177664L;
                            }
                            i13 = z15 ? 8 : 0;
                            i12 = z4 ? 0 : 8;
                        } else {
                            i12 = 0;
                            i13 = 0;
                        }
                        i14 = ((j & 2241) > 0L ? 1 : ((j & 2241) == 0L ? 0 : -1));
                        if (i14 != 0) {
                            z10 = z ? z8 : false;
                            if (i14 != 0) {
                                j |= z10 ? 2147483648L : 1073741824L;
                            }
                        } else {
                            z10 = false;
                        }
                        if ((j & 1100585369600L) != 0) {
                            z2 = state == DiskManageParam.State.DEFAULT;
                            if ((j & 2881) != 0) {
                                j = z2 ? j | PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE : j | PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                            }
                        }
                        if ((j & 2241) != 0) {
                            z11 = z10 ? true : z2;
                            f2 = ContextUtil.getAlpha(z11);
                        } else {
                            f2 = 0.0f;
                            z11 = false;
                        }
                        i15 = ((j & 2369) > 0L ? 1 : ((j & 2369) == 0L ? 0 : -1));
                        if (i15 != 0) {
                            boolean z16 = z9 ? true : z2;
                            if (i15 != 0) {
                                j |= z16 ? 34359738368L : 17179869184L;
                            }
                            if (!z16) {
                                i16 = 8;
                                if ((j & PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) == 0) {
                                    if (diskManageParam != null) {
                                        selectionMode = diskManageParam.getSelectionMode();
                                    }
                                    i17 = i;
                                    if (selectionMode == DiskManageParam.SelectionMode.ALL) {
                                        z12 = true;
                                        i18 = ((j & 2881) > 0L ? 1 : ((j & 2881) == 0L ? 0 : -1));
                                        if (i18 != 0) {
                                            if (!z2) {
                                                z12 = false;
                                            }
                                            if (i18 != 0) {
                                                j |= z12 ? 134217728L : 67108864L;
                                            }
                                        } else {
                                            z12 = false;
                                        }
                                        if ((j & 134217728) != 0) {
                                            String path = diskManageParam != null ? diskManageParam.getPath() : null;
                                            if (path != null) {
                                                z13 = path.startsWith(DiskManageParam.DEFAULT_PATH);
                                                i19 = ((j & 2881) > 0L ? 1 : ((j & 2881) == 0L ? 0 : -1));
                                                if (i19 == 0) {
                                                    if (!z12) {
                                                        z13 = false;
                                                    }
                                                    if (i19 != 0) {
                                                        j |= z13 ? 137438953472L : 68719476736L;
                                                    }
                                                    i20 = z13 ? 0 : 8;
                                                } else {
                                                    i20 = 0;
                                                }
                                                if ((j & PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) != 0) {
                                                    this.backward.setOnClickListener(this.mCallback71);
                                                    this.cancel.setOnClickListener(this.mCallback82);
                                                    this.cleanAll.setOnClickListener(this.mCallback86);
                                                    this.copy.setOnClickListener(this.mCallback77);
                                                    this.createFile.setOnClickListener(this.mCallback80);
                                                    this.createFolder.setOnClickListener(this.mCallback81);
                                                    this.currentPath.setOnClickListener(this.mCallback73);
                                                    this.cut.setOnClickListener(this.mCallback78);
                                                    this.delete.setOnClickListener(this.mCallback83);
                                                    this.diskListArrow.setOnClickListener(this.mCallback74);
                                                    this.forward.setOnClickListener(this.mCallback72);
                                                    this.ok.setOnClickListener(this.mCallback85);
                                                    this.paste.setOnClickListener(this.mCallback79);
                                                    this.rename.setOnClickListener(this.mCallback84);
                                                    this.selectAll.setOnClickListener(this.mCallback75);
                                                    this.selectCancel.setOnClickListener(this.mCallback76);
                                                }
                                                if ((j & 2113) != 0) {
                                                    this.cancel.setVisibility(i3);
                                                    int i27 = i5;
                                                    this.copy.setVisibility(i27);
                                                    this.createFolder.setVisibility(i6);
                                                    this.cut.setVisibility(i27);
                                                    this.delete.setVisibility(i27);
                                                    this.paste.setVisibility(i3);
                                                    this.rename.setVisibility(i27);
                                                }
                                                if ((j & 2881) != 0) {
                                                    this.cleanAll.setVisibility(i20);
                                                }
                                                if ((j & 2057) != 0) {
                                                    TextViewBindingAdapter.setText(this.currentPath, str);
                                                }
                                                if ((j & 3076) != 0) {
                                                    this.diskListArrow.setVisibility(i9);
                                                }
                                                if ((j & 2083) != 0) {
                                                    this.empty.setVisibility(i12);
                                                    this.fileList.setVisibility(i13);
                                                }
                                                if ((j & 2050) != 0) {
                                                    this.loading.setVisibility(i7);
                                                }
                                                if ((j & 2241) != 0) {
                                                    if (getBuildSdkInt() >= 11) {
                                                        this.ok.setAlpha(f2);
                                                    }
                                                    this.ok.setEnabled(z11);
                                                }
                                                if ((j & 2369) != 0) {
                                                    this.ok.setVisibility(i16);
                                                }
                                                if ((j & 2177) != 0) {
                                                    if (getBuildSdkInt() >= 11) {
                                                        this.rename.setAlpha(f);
                                                    }
                                                    this.rename.setEnabled(z8);
                                                }
                                                if ((j & 2081) == 0) {
                                                    int i28 = i17;
                                                    this.selectAll.setVisibility(i28);
                                                    this.selectCancel.setVisibility(i28);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        z13 = false;
                                        i19 = ((j & 2881) > 0L ? 1 : ((j & 2881) == 0L ? 0 : -1));
                                        if (i19 == 0) {
                                        }
                                        if ((j & PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) != 0) {
                                        }
                                        if ((j & 2113) != 0) {
                                        }
                                        if ((j & 2881) != 0) {
                                        }
                                        if ((j & 2057) != 0) {
                                        }
                                        if ((j & 3076) != 0) {
                                        }
                                        if ((j & 2083) != 0) {
                                        }
                                        if ((j & 2050) != 0) {
                                        }
                                        if ((j & 2241) != 0) {
                                        }
                                        if ((j & 2369) != 0) {
                                        }
                                        if ((j & 2177) != 0) {
                                        }
                                        if ((j & 2081) == 0) {
                                        }
                                    }
                                } else {
                                    i17 = i;
                                }
                                z12 = false;
                                i18 = ((j & 2881) > 0L ? 1 : ((j & 2881) == 0L ? 0 : -1));
                                if (i18 != 0) {
                                }
                                if ((j & 134217728) != 0) {
                                }
                                z13 = false;
                                i19 = ((j & 2881) > 0L ? 1 : ((j & 2881) == 0L ? 0 : -1));
                                if (i19 == 0) {
                                }
                                if ((j & PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) != 0) {
                                }
                                if ((j & 2113) != 0) {
                                }
                                if ((j & 2881) != 0) {
                                }
                                if ((j & 2057) != 0) {
                                }
                                if ((j & 3076) != 0) {
                                }
                                if ((j & 2083) != 0) {
                                }
                                if ((j & 2050) != 0) {
                                }
                                if ((j & 2241) != 0) {
                                }
                                if ((j & 2369) != 0) {
                                }
                                if ((j & 2177) != 0) {
                                }
                                if ((j & 2081) == 0) {
                                }
                            }
                        }
                        i16 = 0;
                        if ((j & PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) == 0) {
                        }
                        z12 = false;
                        i18 = ((j & 2881) > 0L ? 1 : ((j & 2881) == 0L ? 0 : -1));
                        if (i18 != 0) {
                        }
                        if ((j & 134217728) != 0) {
                        }
                        z13 = false;
                        i19 = ((j & 2881) > 0L ? 1 : ((j & 2881) == 0L ? 0 : -1));
                        if (i19 == 0) {
                        }
                        if ((j & PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) != 0) {
                        }
                        if ((j & 2113) != 0) {
                        }
                        if ((j & 2881) != 0) {
                        }
                        if ((j & 2057) != 0) {
                        }
                        if ((j & 3076) != 0) {
                        }
                        if ((j & 2083) != 0) {
                        }
                        if ((j & 2050) != 0) {
                        }
                        if ((j & 2241) != 0) {
                        }
                        if ((j & 2369) != 0) {
                        }
                        if ((j & 2177) != 0) {
                        }
                        if ((j & 2081) == 0) {
                        }
                    }
                }
                i9 = 0;
                if ((j & 35184380502016L) != 0) {
                }
                i10 = ((j & 2369) > j2 ? 1 : ((j & 2369) == j2 ? 0 : -1));
                if (i10 != 0) {
                }
                i11 = ((j & 2083) > 0L ? 1 : ((j & 2083) == 0L ? 0 : -1));
                if (i11 != 0) {
                }
                i14 = ((j & 2241) > 0L ? 1 : ((j & 2241) == 0L ? 0 : -1));
                if (i14 != 0) {
                }
                if ((j & 1100585369600L) != 0) {
                }
                if ((j & 2241) != 0) {
                }
                i15 = ((j & 2369) > 0L ? 1 : ((j & 2369) == 0L ? 0 : -1));
                if (i15 != 0) {
                }
                i16 = 0;
                if ((j & PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) == 0) {
                }
                z12 = false;
                i18 = ((j & 2881) > 0L ? 1 : ((j & 2881) == 0L ? 0 : -1));
                if (i18 != 0) {
                }
                if ((j & 134217728) != 0) {
                }
                z13 = false;
                i19 = ((j & 2881) > 0L ? 1 : ((j & 2881) == 0L ? 0 : -1));
                if (i19 == 0) {
                }
                if ((j & PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) != 0) {
                }
                if ((j & 2113) != 0) {
                }
                if ((j & 2881) != 0) {
                }
                if ((j & 2057) != 0) {
                }
                if ((j & 3076) != 0) {
                }
                if ((j & 2083) != 0) {
                }
                if ((j & 2050) != 0) {
                }
                if ((j & 2241) != 0) {
                }
                if ((j & 2369) != 0) {
                }
                if ((j & 2177) != 0) {
                }
                if ((j & 2081) == 0) {
                }
            }
        } else {
            z5 = false;
            z6 = false;
        }
        i7 = 0;
        i8 = ((j & 3076) > 0L ? 1 : ((j & 3076) == 0L ? 0 : -1));
        if (i8 != 0) {
        }
        i9 = 0;
        if ((j & 35184380502016L) != 0) {
        }
        i10 = ((j & 2369) > j2 ? 1 : ((j & 2369) == j2 ? 0 : -1));
        if (i10 != 0) {
        }
        i11 = ((j & 2083) > 0L ? 1 : ((j & 2083) == 0L ? 0 : -1));
        if (i11 != 0) {
        }
        i14 = ((j & 2241) > 0L ? 1 : ((j & 2241) == 0L ? 0 : -1));
        if (i14 != 0) {
        }
        if ((j & 1100585369600L) != 0) {
        }
        if ((j & 2241) != 0) {
        }
        i15 = ((j & 2369) > 0L ? 1 : ((j & 2369) == 0L ? 0 : -1));
        if (i15 != 0) {
        }
        i16 = 0;
        if ((j & PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) == 0) {
        }
        z12 = false;
        i18 = ((j & 2881) > 0L ? 1 : ((j & 2881) == 0L ? 0 : -1));
        if (i18 != 0) {
        }
        if ((j & 134217728) != 0) {
        }
        z13 = false;
        i19 = ((j & 2881) > 0L ? 1 : ((j & 2881) == 0L ? 0 : -1));
        if (i19 == 0) {
        }
        if ((j & PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) != 0) {
        }
        if ((j & 2113) != 0) {
        }
        if ((j & 2881) != 0) {
        }
        if ((j & 2057) != 0) {
        }
        if ((j & 3076) != 0) {
        }
        if ((j & 2083) != 0) {
        }
        if ((j & 2050) != 0) {
        }
        if ((j & 2241) != 0) {
        }
        if ((j & 2369) != 0) {
        }
        if ((j & 2177) != 0) {
        }
        if ((j & 2081) == 0) {
        }
    }

    @Override // com.rigol.scope.generated.callback.OnClickListener.Listener
    public final void _internalCallbackOnClick(int i, View view) {
        switch (i) {
            case 1:
                View.OnClickListener onClickListener = this.mClickListener;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 2:
                View.OnClickListener onClickListener2 = this.mClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                    return;
                }
                return;
            case 3:
                View.OnClickListener onClickListener3 = this.mClickListener;
                if (onClickListener3 != null) {
                    onClickListener3.onClick(view);
                    return;
                }
                return;
            case 4:
                View.OnClickListener onClickListener4 = this.mClickListener;
                if (onClickListener4 != null) {
                    onClickListener4.onClick(view);
                    return;
                }
                return;
            case 5:
                View.OnClickListener onClickListener5 = this.mClickListener;
                if (onClickListener5 != null) {
                    onClickListener5.onClick(view);
                    return;
                }
                return;
            case 6:
                View.OnClickListener onClickListener6 = this.mClickListener;
                if (onClickListener6 != null) {
                    onClickListener6.onClick(view);
                    return;
                }
                return;
            case 7:
                View.OnClickListener onClickListener7 = this.mClickListener;
                if (onClickListener7 != null) {
                    onClickListener7.onClick(view);
                    return;
                }
                return;
            case 8:
                View.OnClickListener onClickListener8 = this.mClickListener;
                if (onClickListener8 != null) {
                    onClickListener8.onClick(view);
                    return;
                }
                return;
            case 9:
                View.OnClickListener onClickListener9 = this.mClickListener;
                if (onClickListener9 != null) {
                    onClickListener9.onClick(view);
                    return;
                }
                return;
            case 10:
                View.OnClickListener onClickListener10 = this.mClickListener;
                if (onClickListener10 != null) {
                    onClickListener10.onClick(view);
                    return;
                }
                return;
            case 11:
                View.OnClickListener onClickListener11 = this.mClickListener;
                if (onClickListener11 != null) {
                    onClickListener11.onClick(view);
                    return;
                }
                return;
            case 12:
                View.OnClickListener onClickListener12 = this.mClickListener;
                if (onClickListener12 != null) {
                    onClickListener12.onClick(view);
                    return;
                }
                return;
            case 13:
                View.OnClickListener onClickListener13 = this.mClickListener;
                if (onClickListener13 != null) {
                    onClickListener13.onClick(view);
                    return;
                }
                return;
            case 14:
                View.OnClickListener onClickListener14 = this.mClickListener;
                if (onClickListener14 != null) {
                    onClickListener14.onClick(view);
                    return;
                }
                return;
            case 15:
                View.OnClickListener onClickListener15 = this.mClickListener;
                if (onClickListener15 != null) {
                    onClickListener15.onClick(view);
                    return;
                }
                return;
            case 16:
                View.OnClickListener onClickListener16 = this.mClickListener;
                if (onClickListener16 != null) {
                    onClickListener16.onClick(view);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
