package com.rigol.scope.databinding;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.rigol.scope.R;
import com.rigol.scope.data.AfgParam;
import com.rigol.scope.data.LaParam;
import com.rigol.scope.data.MappingObject;
import com.rigol.scope.data.SharedParam;
import com.rigol.scope.data.UtilityParam;
import com.rigol.scope.utilities.DrawView1;
import com.rigol.scope.utilities.MRefreshHeader;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
/* loaded from: classes2.dex */
public class FragmentSettingsBarBindingImpl extends FragmentSettingsBarBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;
    private final ConstraintLayout mboundView2;
    private final TextView mboundView3;
    private final ImageView mboundView5;
    private final TextView mboundView7;
    private final TextView mboundView8;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.starter_layout, 15);
        sViewsWithIds.put(R.id.starter_button, 16);
        sViewsWithIds.put(R.id.vertical_list_system_time_layout, 17);
        sViewsWithIds.put(R.id.vertical_list, 18);
        sViewsWithIds.put(R.id.vertical_d, 19);
        sViewsWithIds.put(R.id.d_item_list, 20);
        sViewsWithIds.put(R.id.nothing_view, 21);
        sViewsWithIds.put(R.id.vertical_d_two, 22);
        sViewsWithIds.put(R.id.vertical_g, 23);
        sViewsWithIds.put(R.id.msRefreshHeader, 24);
        sViewsWithIds.put(R.id.vertical_m, 25);
        sViewsWithIds.put(R.id.math_item_list, 26);
        sViewsWithIds.put(R.id.math_list, 27);
        sViewsWithIds.put(R.id.other_layout, 28);
        sViewsWithIds.put(R.id.system_time_layout, 29);
        sViewsWithIds.put(R.id.power_icon_view, 30);
    }

    public FragmentSettingsBarBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 31, sIncludes, sViewsWithIds));
    }

    private FragmentSettingsBarBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 6, (ImageView) objArr[11], (RecyclerView) objArr[20], (TextView) objArr[14], (ImageView) objArr[10], (RecyclerView) objArr[26], (RecyclerView) objArr[27], (MRefreshHeader) objArr[24], (View) objArr[21], (RecyclerView) objArr[28], (DrawView1) objArr[30], (ImageView) objArr[12], (ImageButton) objArr[16], (LinearLayoutCompat) objArr[15], (TextView) objArr[1], (ConstraintLayout) objArr[29], (TextView) objArr[13], (ImageView) objArr[9], (SmartRefreshLayout) objArr[19], (ConstraintLayout) objArr[22], (SmartRefreshLayout) objArr[23], (TextView) objArr[6], (ConstraintLayout) objArr[4], (RecyclerView) objArr[18], (ConstraintLayout) objArr[17], (ConstraintLayout) objArr[25]);
        this.mDirtyFlags = -1L;
        this.beeper.setTag(null);
        this.date.setTag(null);
        this.lxi.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[2];
        this.mboundView2 = constraintLayout2;
        constraintLayout2.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.mboundView3 = textView;
        textView.setTag(null);
        ImageView imageView = (ImageView) objArr[5];
        this.mboundView5 = imageView;
        imageView.setTag(null);
        TextView textView2 = (TextView) objArr[7];
        this.mboundView7 = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[8];
        this.mboundView8 = textView3;
        textView3.setTag(null);
        this.rmt.setTag(null);
        this.starterMessage.setTag(null);
        this.time.setTag(null);
        this.usb.setTag(null);
        this.verticalGText.setTag(null);
        this.verticalGView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
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
        if (1001 == i) {
            setUtilityParam((UtilityParam) obj);
        } else if (449 == i) {
            setLaParam((LaParam) obj);
        } else if (362 == i) {
            setHasUpdate((ObservableBoolean) obj);
        } else if (815 == i) {
            setSharedParam((SharedParam) obj);
        } else if (38 != i) {
            return false;
        } else {
            setAfgParam((AfgParam) obj);
        }
        return true;
    }

    @Override // com.rigol.scope.databinding.FragmentSettingsBarBinding
    public void setUtilityParam(UtilityParam utilityParam) {
        updateRegistration(1, utilityParam);
        this.mUtilityParam = utilityParam;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(1001);
        super.requestRebind();
    }

    @Override // com.rigol.scope.databinding.FragmentSettingsBarBinding
    public void setLaParam(LaParam laParam) {
        updateRegistration(2, laParam);
        this.mLaParam = laParam;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(449);
        super.requestRebind();
    }

    @Override // com.rigol.scope.databinding.FragmentSettingsBarBinding
    public void setHasUpdate(ObservableBoolean observableBoolean) {
        updateRegistration(3, observableBoolean);
        this.mHasUpdate = observableBoolean;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(362);
        super.requestRebind();
    }

    @Override // com.rigol.scope.databinding.FragmentSettingsBarBinding
    public void setSharedParam(SharedParam sharedParam) {
        updateRegistration(4, sharedParam);
        this.mSharedParam = sharedParam;
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        notifyPropertyChanged(815);
        super.requestRebind();
    }

    @Override // com.rigol.scope.databinding.FragmentSettingsBarBinding
    public void setAfgParam(AfgParam afgParam) {
        updateRegistration(5, afgParam);
        this.mAfgParam = afgParam;
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        notifyPropertyChanged(38);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i, Object obj, int i2) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return false;
                            }
                            return onChangeAfgParam((AfgParam) obj, i2);
                        }
                        return onChangeSharedParam((SharedParam) obj, i2);
                    }
                    return onChangeHasUpdate((ObservableBoolean) obj, i2);
                }
                return onChangeLaParam((LaParam) obj, i2);
            }
            return onChangeUtilityParam((UtilityParam) obj, i2);
        }
        return onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgAfgWaveFunctionAfgParamWaveFunction((MappingObject) obj, i2);
    }

    private boolean onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgAfgWaveFunctionAfgParamWaveFunction(MappingObject mappingObject, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 1;
            }
            return true;
        } else if (i == 632) {
            synchronized (this) {
                this.mDirtyFlags |= 64;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangeUtilityParam(UtilityParam utilityParam, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 2;
            }
            return true;
        } else if (i == 85) {
            synchronized (this) {
                this.mDirtyFlags |= 128;
            }
            return true;
        } else if (i == 923) {
            synchronized (this) {
                this.mDirtyFlags |= 256;
            }
            return true;
        } else if (i == 831) {
            synchronized (this) {
                this.mDirtyFlags |= 512;
            }
            return true;
        } else if (i == 218) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangeLaParam(LaParam laParam, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 4;
            }
            return true;
        } else if (i == 448) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangeHasUpdate(ObservableBoolean observableBoolean, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 8;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeSharedParam(SharedParam sharedParam, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 16;
            }
            return true;
        } else if (i == 833) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            }
            return true;
        } else if (i == 821) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            }
            return true;
        } else if (i == 823) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangeAfgParam(AfgParam afgParam, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 32;
            }
            return true;
        } else if (i == 78) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
            }
            return true;
        } else if (i == 1028) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
            }
            return true;
        } else if (i == 72) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
            }
            return true;
        } else if (i == 74) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
            }
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:254:0x0415, code lost:
        if (r21 != false) goto L201;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:318:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0110  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            Method dump skipped, instructions count: 1335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rigol.scope.databinding.FragmentSettingsBarBindingImpl.executeBindings():void");
    }
}
