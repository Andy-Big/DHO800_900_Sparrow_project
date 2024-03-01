package com.rigol.scope.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.fragment.app.FragmentContainerView;
import com.rigol.scope.R;
import com.rigol.scope.data.SharedParam;
/* loaded from: classes2.dex */
public class ActivityMainBindingImpl extends ActivityMainBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.navigation_bar, 3);
        sViewsWithIds.put(R.id.settings_bar, 4);
        sViewsWithIds.put(R.id.waveform, 5);
    }

    public ActivityMainBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, sIncludes, sViewsWithIds));
    }

    private ActivityMainBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ConstraintLayout) objArr[0], (FragmentContainerView) objArr[3], (FragmentContainerView) objArr[2], (ImageView) objArr[1], (FragmentContainerView) objArr[4], (FragmentContainerView) objArr[5]);
        this.mDirtyFlags = -1L;
        this.mainLayout.setTag(null);
        this.resultsBar.setTag(null);
        this.resultsBarIcon.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 4L;
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
        if (815 == i) {
            setSharedParam((SharedParam) obj);
            return true;
        }
        return false;
    }

    @Override // com.rigol.scope.databinding.ActivityMainBinding
    public void setSharedParam(SharedParam sharedParam) {
        updateRegistration(0, sharedParam);
        this.mSharedParam = sharedParam;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(815);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return onChangeSharedParam((SharedParam) obj, i2);
    }

    private boolean onChangeSharedParam(SharedParam sharedParam, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 1;
            }
            return true;
        } else if (i == 824) {
            synchronized (this) {
                this.mDirtyFlags |= 2;
            }
            return true;
        } else {
            return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        long j2;
        long j3;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        SharedParam sharedParam = this.mSharedParam;
        Drawable drawable = null;
        int i = ((j & 7) > 0L ? 1 : ((j & 7) == 0L ? 0 : -1));
        int i2 = 0;
        if (i != 0) {
            boolean showResultBar = sharedParam != null ? sharedParam.getShowResultBar() : false;
            if (i != 0) {
                if (showResultBar) {
                    j2 = j | 16;
                    j3 = 64;
                } else {
                    j2 = j | 8;
                    j3 = 32;
                }
                j = j2 | j3;
            }
            drawable = AppCompatResources.getDrawable(this.resultsBarIcon.getContext(), showResultBar ? R.drawable.ic_menu_close : R.drawable.ic_menu_open);
            if (!showResultBar) {
                i2 = 8;
            }
        }
        if ((j & 7) != 0) {
            this.resultsBar.setVisibility(i2);
            ImageViewBindingAdapter.setImageDrawable(this.resultsBarIcon, drawable);
        }
    }
}
