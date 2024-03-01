package com.rigol.scope.databinding;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.rigol.scope.R;
import com.rigol.scope.data.HorizontalParam;
import com.rigol.scope.data.MappingObject;
import com.rigol.scope.data.MeasureSettingParam;
import com.rigol.scope.data.SharedParam;
import com.rigol.scope.data.VerticalParam;
import com.rigol.scope.generated.callback.OnClickListener;
import com.rigol.scope.views.SwitchButton;
/* loaded from: classes2.dex */
public class PopupviewResultMeasureBindingImpl extends PopupviewResultMeasureBinding implements OnClickListener.Listener {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private final View.OnClickListener mCallback41;
    private final View.OnClickListener mCallback42;
    private final View.OnClickListener mCallback43;
    private final View.OnClickListener mCallback44;
    private final View.OnClickListener mCallback45;
    private final View.OnClickListener mCallback46;
    private final View.OnClickListener mCallback47;
    private final View.OnClickListener mCallback48;
    private final View.OnClickListener mCallback49;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.guideline_center, 31);
        sViewsWithIds.put(R.id.guideline_left, 32);
        sViewsWithIds.put(R.id.guideline_right, 33);
        sViewsWithIds.put(R.id.guideline_right2, 34);
        sViewsWithIds.put(R.id.mode, 35);
        sViewsWithIds.put(R.id.mode_radio_group, 36);
        sViewsWithIds.put(R.id.histo_en, 37);
        sViewsWithIds.put(R.id.stat, 38);
        sViewsWithIds.put(R.id.stat_count, 39);
        sViewsWithIds.put(R.id.stat_reset, 40);
        sViewsWithIds.put(R.id.divider, 41);
        sViewsWithIds.put(R.id.threshold_display_type, 42);
        sViewsWithIds.put(R.id.threshold_source, 43);
        sViewsWithIds.put(R.id.threshold_diagram, 44);
        sViewsWithIds.put(R.id.high, 45);
        sViewsWithIds.put(R.id.mid, 46);
        sViewsWithIds.put(R.id.low, 47);
        sViewsWithIds.put(R.id.amp_method, 48);
        sViewsWithIds.put(R.id.region, 49);
    }

    public PopupviewResultMeasureBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 50, sIncludes, sViewsWithIds));
    }

    private PopupviewResultMeasureBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 8, (TextView) objArr[48], (SwitchButton) objArr[17], (TextView) objArr[20], (SwitchButton) objArr[21], (TextView) objArr[25], (EditText) objArr[26], (TextView) objArr[23], (SwitchButton) objArr[24], (TextView) objArr[27], (EditText) objArr[28], (Button) objArr[30], (Button) objArr[29], (View) objArr[41], (Guideline) objArr[31], (Guideline) objArr[32], (Guideline) objArr[33], (Guideline) objArr[34], (TextView) objArr[45], (EditText) objArr[14], (TextView) objArr[37], (SwitchButton) objArr[4], (TextView) objArr[5], (SwitchButton) objArr[6], (TextView) objArr[47], (EditText) objArr[16], (TextView) objArr[46], (EditText) objArr[15], (TextView) objArr[35], (RadioGroup) objArr[36], (RadioButton) objArr[1], (TextView) objArr[49], (TextView) objArr[22], (CheckBox) objArr[12], (TextView) objArr[38], (TextView) objArr[39], (EditText) objArr[8], (TextView) objArr[40], (Button) objArr[9], (SwitchButton) objArr[7], (SwitchButton) objArr[3], (TextView) objArr[2], (Button) objArr[11], (ImageView) objArr[44], (TextView) objArr[42], (SwitchButton) objArr[10], (TextView) objArr[43], (TextView) objArr[13], (TextView) objArr[18], (SwitchButton) objArr[19]);
        this.mDirtyFlags = -1L;
        this.ampMethodSwitch.setTag(null);
        this.baseMethod.setTag(null);
        this.baseMethodSwitch.setTag(null);
        this.cursorA.setTag(null);
        this.cursorAEditText.setTag(null);
        this.cursorAb.setTag(null);
        this.cursorAbSwitch.setTag(null);
        this.cursorB.setTag(null);
        this.cursorBEditText.setTag(null);
        this.deleteAllButton.setTag(null);
        this.deleteButton.setTag(null);
        this.highEditText.setTag(null);
        this.histoEnSwitch.setTag(null);
        this.indicator.setTag(null);
        this.indicatorSwitch.setTag(null);
        this.lowEditText.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        this.midEditText.setTag(null);
        this.precisionRadioButton.setTag(null);
        this.regionSpinner.setTag(null);
        this.showLine.setTag(null);
        this.statCountEditText.setTag(null);
        this.statResetButton.setTag(null);
        this.statSwitch.setTag(null);
        this.threSwitch.setTag(null);
        this.threText.setTag(null);
        this.thresholdDefaultButton.setTag(null);
        this.thresholdDisplayTypeSwitch.setTag(null);
        this.thresholdSourceSpinner.setTag(null);
        this.topMethod.setTag(null);
        this.topMethodSwitch.setTag(null);
        setRootTag(view);
        this.mCallback43 = new OnClickListener(this, 3);
        this.mCallback42 = new OnClickListener(this, 2);
        this.mCallback44 = new OnClickListener(this, 4);
        this.mCallback49 = new OnClickListener(this, 9);
        this.mCallback41 = new OnClickListener(this, 1);
        this.mCallback47 = new OnClickListener(this, 7);
        this.mCallback48 = new OnClickListener(this, 8);
        this.mCallback45 = new OnClickListener(this, 5);
        this.mCallback46 = new OnClickListener(this, 6);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 4294967296L;
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
        if (1015 == i) {
            setVerticalParam((VerticalParam) obj);
        } else if (589 == i) {
            setParam((MeasureSettingParam) obj);
        } else if (564 == i) {
            setOnClickListener((View.OnClickListener) obj);
        } else if (375 == i) {
            setHorizontal((HorizontalParam) obj);
        } else if (647 == i) {
            setPrecisionMapping((MappingObject) obj);
        } else if (815 == i) {
            setSharedParam((SharedParam) obj);
        } else if (555 != i) {
            return false;
        } else {
            setNormalMapping((MappingObject) obj);
        }
        return true;
    }

    @Override // com.rigol.scope.databinding.PopupviewResultMeasureBinding
    public void setVerticalParam(VerticalParam verticalParam) {
        updateRegistration(0, verticalParam);
        this.mVerticalParam = verticalParam;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(1015);
        super.requestRebind();
    }

    @Override // com.rigol.scope.databinding.PopupviewResultMeasureBinding
    public void setParam(MeasureSettingParam measureSettingParam) {
        updateRegistration(1, measureSettingParam);
        this.mParam = measureSettingParam;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(589);
        super.requestRebind();
    }

    @Override // com.rigol.scope.databinding.PopupviewResultMeasureBinding
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.mOnClickListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 256;
        }
        notifyPropertyChanged(564);
        super.requestRebind();
    }

    @Override // com.rigol.scope.databinding.PopupviewResultMeasureBinding
    public void setHorizontal(HorizontalParam horizontalParam) {
        updateRegistration(3, horizontalParam);
        this.mHorizontal = horizontalParam;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(375);
        super.requestRebind();
    }

    @Override // com.rigol.scope.databinding.PopupviewResultMeasureBinding
    public void setPrecisionMapping(MappingObject mappingObject) {
        updateRegistration(4, mappingObject);
        this.mPrecisionMapping = mappingObject;
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        notifyPropertyChanged(647);
        super.requestRebind();
    }

    @Override // com.rigol.scope.databinding.PopupviewResultMeasureBinding
    public void setSharedParam(SharedParam sharedParam) {
        updateRegistration(5, sharedParam);
        this.mSharedParam = sharedParam;
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        notifyPropertyChanged(815);
        super.requestRebind();
    }

    @Override // com.rigol.scope.databinding.PopupviewResultMeasureBinding
    public void setNormalMapping(MappingObject mappingObject) {
        this.mNormalMapping = mappingObject;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return onChangeVerticalParam((VerticalParam) obj, i2);
            case 1:
                return onChangeParam((MeasureSettingParam) obj, i2);
            case 2:
                return onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgAppMeasThSrcParamThresholdSourceValue1((MappingObject) obj, i2);
            case 3:
                return onChangeHorizontal((HorizontalParam) obj, i2);
            case 4:
                return onChangePrecisionMapping((MappingObject) obj, i2);
            case 5:
                return onChangeSharedParam((SharedParam) obj, i2);
            case 6:
                return onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgAppMeasRegionParamRegion((MappingObject) obj, i2);
            case 7:
                return onChangeNormalMapping((MappingObject) obj, i2);
            default:
                return false;
        }
    }

    private boolean onChangeVerticalParam(VerticalParam verticalParam, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 1;
            }
            return true;
        } else if (i == 976) {
            synchronized (this) {
                this.mDirtyFlags |= 512;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangeParam(MeasureSettingParam measureSettingParam, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 2;
            }
            return true;
        } else if (i == 539) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            }
            return true;
        } else if (i == 203) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
            }
            return true;
        } else if (i == 369) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            }
            return true;
        } else if (i == 200) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            }
            return true;
        } else if (i == 897) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE;
            }
            return true;
        } else if (i == 892) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
            }
            return true;
        } else if (i == 921) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
            }
            return true;
        } else if (i == 830) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
            }
            return true;
        } else if (i == 920) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
            }
            return true;
        } else if (i == 917) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
            }
            return true;
        } else if (i == 919) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            }
            return true;
        } else if (i == 918) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
            }
            return true;
        } else if (i == 530) {
            synchronized (this) {
                this.mDirtyFlags |= 4194304;
            }
            return true;
        } else if (i == 930) {
            synchronized (this) {
                this.mDirtyFlags |= 8388608;
            }
            return true;
        } else if (i == 69) {
            synchronized (this) {
                this.mDirtyFlags |= 16777216;
            }
            return true;
        } else if (i == 727) {
            synchronized (this) {
                this.mDirtyFlags |= 33554432;
            }
            return true;
        } else if (i == 195) {
            synchronized (this) {
                this.mDirtyFlags |= 67108864;
            }
            return true;
        } else if (i == 197) {
            synchronized (this) {
                this.mDirtyFlags |= 134217728;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgAppMeasThSrcParamThresholdSourceValue1(MappingObject mappingObject, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 4;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeHorizontal(HorizontalParam horizontalParam, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 8;
            }
            return true;
        } else if (i == 28) {
            synchronized (this) {
                this.mDirtyFlags |= 268435456;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangePrecisionMapping(MappingObject mappingObject, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 16;
            }
            return true;
        } else if (i == 904) {
            synchronized (this) {
                this.mDirtyFlags |= 536870912;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangeSharedParam(SharedParam sharedParam, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 32;
            }
            return true;
        } else if (i == 824) {
            synchronized (this) {
                this.mDirtyFlags |= 1073741824;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgAppMeasRegionParamRegion(MappingObject mappingObject, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 64;
            }
            return true;
        } else if (i == 904) {
            synchronized (this) {
                this.mDirtyFlags |= 2147483648L;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangeNormalMapping(MappingObject mappingObject, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 128;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ec, code lost:
        if (r15 != false) goto L387;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:405:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0168  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            Method dump skipped, instructions count: 2045
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rigol.scope.databinding.PopupviewResultMeasureBindingImpl.executeBindings():void");
    }

    @Override // com.rigol.scope.generated.callback.OnClickListener.Listener
    public final void _internalCallbackOnClick(int i, View view) {
        switch (i) {
            case 1:
                View.OnClickListener onClickListener = this.mOnClickListener;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 2:
                View.OnClickListener onClickListener2 = this.mOnClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                    return;
                }
                return;
            case 3:
                View.OnClickListener onClickListener3 = this.mOnClickListener;
                if (onClickListener3 != null) {
                    onClickListener3.onClick(view);
                    return;
                }
                return;
            case 4:
                View.OnClickListener onClickListener4 = this.mOnClickListener;
                if (onClickListener4 != null) {
                    onClickListener4.onClick(view);
                    return;
                }
                return;
            case 5:
                View.OnClickListener onClickListener5 = this.mOnClickListener;
                if (onClickListener5 != null) {
                    onClickListener5.onClick(view);
                    return;
                }
                return;
            case 6:
                View.OnClickListener onClickListener6 = this.mOnClickListener;
                if (onClickListener6 != null) {
                    onClickListener6.onClick(view);
                    return;
                }
                return;
            case 7:
                View.OnClickListener onClickListener7 = this.mOnClickListener;
                if (onClickListener7 != null) {
                    onClickListener7.onClick(view);
                    return;
                }
                return;
            case 8:
                View.OnClickListener onClickListener8 = this.mOnClickListener;
                if (onClickListener8 != null) {
                    onClickListener8.onClick(view);
                    return;
                }
                return;
            case 9:
                View.OnClickListener onClickListener9 = this.mOnClickListener;
                if (onClickListener9 != null) {
                    onClickListener9.onClick(view);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
