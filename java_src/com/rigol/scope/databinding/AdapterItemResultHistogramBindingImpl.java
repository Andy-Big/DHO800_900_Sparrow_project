package com.rigol.scope.databinding;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.rigol.scope.R;
import com.rigol.scope.cil.ServiceEnum;
import com.rigol.scope.utilities.ContextUtil;
import com.rigol.scope.utilities.ViewUtil;
import com.rigol.scope.views.DisableTouchEventRecyclerView;
import com.rigol.scope.views.histogram.HistogramResultParam;
import com.rigol.scope.views.resultItem.ResultItemConstraintLayout;
/* loaded from: classes2.dex */
public class AdapterItemResultHistogramBindingImpl extends AdapterItemResultHistogramBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ResultItemConstraintLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.title_layout, 3);
        sViewsWithIds.put(R.id.result_list, 4);
    }

    public AdapterItemResultHistogramBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, sIncludes, sViewsWithIds));
    }

    private AdapterItemResultHistogramBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ImageView) objArr[1], (DisableTouchEventRecyclerView) objArr[4], (TextView) objArr[2], (ConstraintLayout) objArr[3]);
        this.mDirtyFlags = -1L;
        this.icon.setTag(null);
        ResultItemConstraintLayout resultItemConstraintLayout = (ResultItemConstraintLayout) objArr[0];
        this.mboundView0 = resultItemConstraintLayout;
        resultItemConstraintLayout.setTag(null);
        this.title.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 16L;
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
        if (589 == i) {
            setParam((HistogramResultParam) obj);
            return true;
        }
        return false;
    }

    @Override // com.rigol.scope.databinding.AdapterItemResultHistogramBinding
    public void setParam(HistogramResultParam histogramResultParam) {
        updateRegistration(0, histogramResultParam);
        this.mParam = histogramResultParam;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(589);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return onChangeParam((HistogramResultParam) obj, i2);
    }

    private boolean onChangeParam(HistogramResultParam histogramResultParam, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 1;
            }
            return true;
        } else if (i == 523) {
            synchronized (this) {
                this.mDirtyFlags |= 2;
            }
            return true;
        } else if (i == 928) {
            synchronized (this) {
                this.mDirtyFlags |= 4;
            }
            return true;
        } else if (i == 851) {
            synchronized (this) {
                this.mDirtyFlags |= 8;
            }
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void executeBindings() {
        long j;
        boolean z;
        SpannableString spannableString;
        Drawable drawable;
        int i;
        String str;
        ServiceEnum.Chan chan;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        HistogramResultParam histogramResultParam = this.mParam;
        int i2 = 0;
        if ((31 & j) != 0) {
            if ((j & 29) != 0) {
                if (histogramResultParam != null) {
                    str = histogramResultParam.getTitle();
                    chan = histogramResultParam.getSourceA();
                } else {
                    str = null;
                    chan = null;
                }
                spannableString = ViewUtil.getTitleWithSrc(getRoot().getContext(), str, chan);
            } else {
                spannableString = null;
            }
            int i3 = ((j & 19) > 0L ? 1 : ((j & 19) == 0L ? 0 : -1));
            if (i3 != 0) {
                ServiceEnum.MeasType measType = histogramResultParam != null ? histogramResultParam.getMeasType() : null;
                boolean z2 = measType != null;
                if (i3 != 0) {
                    j = z2 ? j | 64 : j | 32;
                }
                boolean z3 = z2;
                drawable = ContextUtil.getDrawable(getRoot().getContext(), measType != null ? measType.pic1 : null);
                z = z3;
                boolean z4 = (64 & j) == 0 && drawable != null;
                i = ((j & 19) > 0L ? 1 : ((j & 19) == 0L ? 0 : -1));
                if (i != 0) {
                    if (!z) {
                        z4 = false;
                    }
                    if (i != 0) {
                        j |= z4 ? 256L : 128L;
                    }
                    if (!z4) {
                        i2 = 8;
                    }
                }
                if ((j & 19) != 0) {
                    ImageViewBindingAdapter.setImageDrawable(this.icon, drawable);
                    this.icon.setVisibility(i2);
                }
                if ((j & 29) == 0) {
                    TextViewBindingAdapter.setText(this.title, spannableString);
                    return;
                }
                return;
            }
            z = false;
        } else {
            z = false;
            spannableString = null;
        }
        drawable = null;
        if ((64 & j) == 0) {
        }
        i = ((j & 19) > 0L ? 1 : ((j & 19) == 0L ? 0 : -1));
        if (i != 0) {
        }
        if ((j & 19) != 0) {
        }
        if ((j & 29) == 0) {
        }
    }
}
