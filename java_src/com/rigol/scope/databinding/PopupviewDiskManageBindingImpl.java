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
import androidx.recyclerview.widget.RecyclerView;
import com.rigol.scope.R;
import com.rigol.scope.data.DiskManageParam;
import com.rigol.scope.data.DiskParam;
import com.rigol.scope.data.SharedParam;
import com.rigol.scope.generated.callback.OnClickListener;
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
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            Method dump skipped, instructions count: 1295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rigol.scope.databinding.PopupviewDiskManageBindingImpl.executeBindings():void");
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
