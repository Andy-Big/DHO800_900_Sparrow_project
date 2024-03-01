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
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.rigol.scope.R;
import com.rigol.scope.cil.ServiceEnum;
import com.rigol.scope.data.HorizontalParam;
import com.rigol.scope.data.MappingObject;
import com.rigol.scope.data.MeasureSettingParam;
import com.rigol.scope.data.SharedParam;
import com.rigol.scope.data.VerticalParam;
import com.rigol.scope.generated.callback.OnClickListener;
import com.rigol.scope.utilities.ColorUtil;
import com.rigol.scope.utilities.ContextUtil;
import com.rigol.scope.utilities.UnitFormat;
import com.rigol.scope.utilities.ViewUtil;
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
    */
    protected void executeBindings() {
        long j;
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        int i3;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z11;
        float f;
        boolean z12;
        int i4;
        boolean z13;
        ServiceEnum.Unit unit;
        ServiceEnum.Unit unit2;
        float f2;
        float f3;
        boolean z14;
        int i5;
        boolean z15;
        boolean z16;
        boolean z17;
        String str7;
        long j2;
        long j3;
        long j4;
        String str8;
        String str9;
        int i6;
        String str10;
        boolean z18;
        int i7;
        boolean z19;
        boolean z20;
        String str11;
        String str12;
        String str13;
        int i8;
        String str14;
        int i9;
        int i10;
        ServiceEnum.Unit unit3;
        String str15;
        long j5;
        boolean z21;
        long j6;
        long j7;
        ServiceEnum.AcquireMode acquireMode;
        boolean z22;
        int i11;
        int i12;
        boolean z23;
        String str16;
        String str17;
        String str18;
        boolean z24;
        boolean z25;
        int i13;
        String str19;
        int i14;
        String str20;
        boolean z26;
        boolean z27;
        boolean z28;
        String str21;
        boolean z29;
        long j8;
        int i15;
        int i16;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        VerticalParam verticalParam = this.mVerticalParam;
        MeasureSettingParam measureSettingParam = this.mParam;
        View.OnClickListener onClickListener = this.mOnClickListener;
        HorizontalParam horizontalParam = this.mHorizontal;
        MappingObject mappingObject = this.mPrecisionMapping;
        SharedParam sharedParam = this.mSharedParam;
        boolean z30 = false;
        if ((6710875719L & j) != 0) {
            if ((j & 4303355906L) != 0) {
                if ((measureSettingParam != null ? measureSettingParam.getTopMethod() : 0) == 1) {
                    z22 = true;
                    boolean showThresLine = ((j & 4295098370L) != 0 || measureSettingParam == null) ? false : measureSettingParam.getShowThresLine();
                    i11 = ((j & 4299161602L) > 0L ? 1 : ((j & 4299161602L) == 0L ? 0 : -1));
                    int i17 = 8;
                    if (i11 == 0) {
                        z23 = measureSettingParam != null ? measureSettingParam.getMethodState() : false;
                        if (i11 != 0) {
                            j |= z23 ? 1099511627776L : 549755813888L;
                        }
                        i12 = z23 ? 0 : 8;
                    } else {
                        i12 = 0;
                        z23 = false;
                    }
                    if ((j & 4295000066L) == 0) {
                        str16 = String.valueOf(measureSettingParam != null ? measureSettingParam.getStatCount() : 0);
                    } else {
                        str16 = null;
                    }
                    boolean statisticState = ((j & 4294983682L) != 0 || measureSettingParam == null) ? false : measureSettingParam.getStatisticState();
                    if ((j & 6476005442L) == 0) {
                        int region = measureSettingParam != null ? measureSettingParam.getRegion() : 0;
                        int i18 = ((j & 4328521730L) > 0L ? 1 : ((j & 4328521730L) == 0L ? 0 : -1));
                        if (i18 != 0) {
                            boolean z31 = region == 2;
                            if (i18 != 0) {
                                j |= z31 ? 4398046511104L : 2199023255552L;
                            }
                        }
                        i17 = 0;
                        MappingObject mappingObject2 = ViewUtil.getMappingObject(R.array.msg_app_meas_region, region);
                        updateRegistration(6, mappingObject2);
                        if (mappingObject2 != null) {
                            str17 = mappingObject2.getStr();
                            if ((j & 4362076162L) != 0) {
                                str18 = UnitFormat.newBuilder(UnitFormat.SI.FEMTO).convert(measureSettingParam != null ? measureSettingParam.getCursorA() : 0L, ServiceEnum.Unit.Unit_s);
                            } else {
                                str18 = null;
                            }
                            if ((4295032834L & j) != 0) {
                                if ((measureSettingParam != null ? measureSettingParam.getThresholdType() : null) == ServiceEnum.ThreType.TH_TYPE_ABS) {
                                    z24 = true;
                                    if ((4294967298L & j) != 0) {
                                        if ((measureSettingParam != null ? measureSettingParam.readCursorBothAB() : 0L) == 2) {
                                            z25 = true;
                                            if ((j & 4295229446L) != 0) {
                                                ServiceEnum.Chan thresholdSource = measureSettingParam != null ? measureSettingParam.getThresholdSource() : null;
                                                i13 = (j & 4295229442L) != 0 ? ColorUtil.getColor(getRoot().getContext(), thresholdSource) : 0;
                                                MappingObject mappingObject3 = ViewUtil.getMappingObject(R.array.msg_app_meas_th_src, thresholdSource != null ? thresholdSource.value1 : 0);
                                                updateRegistration(2, mappingObject3);
                                                if (mappingObject3 != null) {
                                                    str19 = mappingObject3.getStr();
                                                    boolean histoEnable = ((j & 4294971394L) != 0 || measureSettingParam == null) ? false : measureSettingParam.getHistoEnable();
                                                    if ((j & 4311744514L) == 0) {
                                                        if (measureSettingParam != null) {
                                                            str20 = str19;
                                                            i16 = 1;
                                                            i14 = i13;
                                                            i15 = measureSettingParam.getBaseMethod();
                                                        } else {
                                                            i14 = i13;
                                                            str20 = str19;
                                                            i15 = 0;
                                                            i16 = 1;
                                                        }
                                                        if (i15 == i16) {
                                                            z26 = true;
                                                            if ((j & 4429185026L) != 0) {
                                                                if (measureSettingParam != null) {
                                                                    z27 = z26;
                                                                    j8 = measureSettingParam.getCursorB();
                                                                } else {
                                                                    z27 = z26;
                                                                    j8 = 0;
                                                                }
                                                                z28 = z22;
                                                                str21 = str18;
                                                                str = UnitFormat.newBuilder(UnitFormat.SI.FEMTO).convert(j8, ServiceEnum.Unit.Unit_s);
                                                            } else {
                                                                z27 = z26;
                                                                z28 = z22;
                                                                str21 = str18;
                                                                str = null;
                                                            }
                                                            if ((4294968322L & j) != 0) {
                                                                if ((measureSettingParam != null ? measureSettingParam.getMode() : 0) == 1) {
                                                                    z29 = true;
                                                                    if ((j & 4298637827L) == 0) {
                                                                        boolean z32 = (measureSettingParam != null ? measureSettingParam.readThresholdType() : null) == ServiceEnum.ThreType.TH_TYPE_PER;
                                                                        if ((j & 4295492099L) != 0) {
                                                                            j |= z32 ? 17179869184L : 8589934592L;
                                                                        }
                                                                        if ((j & 4297064963L) != 0) {
                                                                            j |= z32 ? 70368744177664L : 35184372088832L;
                                                                        }
                                                                        if ((j & 4296016387L) != 0) {
                                                                            j |= z32 ? 281474976710656L : 140737488355328L;
                                                                        }
                                                                        z9 = showThresLine;
                                                                        i = i17;
                                                                        str5 = str16;
                                                                        z10 = statisticState;
                                                                        str3 = str20;
                                                                        z5 = z28;
                                                                        z7 = z29;
                                                                        str4 = str17;
                                                                        z3 = z25;
                                                                        i2 = i12;
                                                                        z = z23;
                                                                        i3 = i14;
                                                                        z6 = z24;
                                                                        z8 = histoEnable;
                                                                        str2 = str21;
                                                                        z4 = z32;
                                                                        z2 = z27;
                                                                    } else {
                                                                        z9 = showThresLine;
                                                                        i = i17;
                                                                        str5 = str16;
                                                                        z10 = statisticState;
                                                                        str3 = str20;
                                                                        z2 = z27;
                                                                        z5 = z28;
                                                                        z7 = z29;
                                                                        str4 = str17;
                                                                        z3 = z25;
                                                                        i2 = i12;
                                                                        z = z23;
                                                                        i3 = i14;
                                                                        z6 = z24;
                                                                        z8 = histoEnable;
                                                                        z4 = false;
                                                                        str2 = str21;
                                                                    }
                                                                }
                                                            }
                                                            z29 = false;
                                                            if ((j & 4298637827L) == 0) {
                                                            }
                                                        }
                                                    } else {
                                                        i14 = i13;
                                                        str20 = str19;
                                                    }
                                                    z26 = false;
                                                    if ((j & 4429185026L) != 0) {
                                                    }
                                                    if ((4294968322L & j) != 0) {
                                                    }
                                                    z29 = false;
                                                    if ((j & 4298637827L) == 0) {
                                                    }
                                                }
                                            } else {
                                                i13 = 0;
                                            }
                                            str19 = null;
                                            if ((j & 4294971394L) != 0) {
                                            }
                                            if ((j & 4311744514L) == 0) {
                                            }
                                            z26 = false;
                                            if ((j & 4429185026L) != 0) {
                                            }
                                            if ((4294968322L & j) != 0) {
                                            }
                                            z29 = false;
                                            if ((j & 4298637827L) == 0) {
                                            }
                                        }
                                    }
                                    z25 = false;
                                    if ((j & 4295229446L) != 0) {
                                    }
                                    str19 = null;
                                    if ((j & 4294971394L) != 0) {
                                    }
                                    if ((j & 4311744514L) == 0) {
                                    }
                                    z26 = false;
                                    if ((j & 4429185026L) != 0) {
                                    }
                                    if ((4294968322L & j) != 0) {
                                    }
                                    z29 = false;
                                    if ((j & 4298637827L) == 0) {
                                    }
                                }
                            }
                            z24 = false;
                            if ((4294967298L & j) != 0) {
                            }
                            z25 = false;
                            if ((j & 4295229446L) != 0) {
                            }
                            str19 = null;
                            if ((j & 4294971394L) != 0) {
                            }
                            if ((j & 4311744514L) == 0) {
                            }
                            z26 = false;
                            if ((j & 4429185026L) != 0) {
                            }
                            if ((4294968322L & j) != 0) {
                            }
                            z29 = false;
                            if ((j & 4298637827L) == 0) {
                            }
                        }
                    } else {
                        i17 = 0;
                    }
                    str17 = null;
                    if ((j & 4362076162L) != 0) {
                    }
                    if ((4295032834L & j) != 0) {
                    }
                    z24 = false;
                    if ((4294967298L & j) != 0) {
                    }
                    z25 = false;
                    if ((j & 4295229446L) != 0) {
                    }
                    str19 = null;
                    if ((j & 4294971394L) != 0) {
                    }
                    if ((j & 4311744514L) == 0) {
                    }
                    z26 = false;
                    if ((j & 4429185026L) != 0) {
                    }
                    if ((4294968322L & j) != 0) {
                    }
                    z29 = false;
                    if ((j & 4298637827L) == 0) {
                    }
                }
            }
            z22 = false;
            if ((j & 4295098370L) != 0) {
            }
            i11 = ((j & 4299161602L) > 0L ? 1 : ((j & 4299161602L) == 0L ? 0 : -1));
            int i172 = 8;
            if (i11 == 0) {
            }
            if ((j & 4295000066L) == 0) {
            }
            if ((j & 4294983682L) != 0) {
            }
            if ((j & 6476005442L) == 0) {
            }
            str17 = null;
            if ((j & 4362076162L) != 0) {
            }
            if ((4295032834L & j) != 0) {
            }
            z24 = false;
            if ((4294967298L & j) != 0) {
            }
            z25 = false;
            if ((j & 4295229446L) != 0) {
            }
            str19 = null;
            if ((j & 4294971394L) != 0) {
            }
            if ((j & 4311744514L) == 0) {
            }
            z26 = false;
            if ((j & 4429185026L) != 0) {
            }
            if ((4294968322L & j) != 0) {
            }
            z29 = false;
            if ((j & 4298637827L) == 0) {
            }
        } else {
            z = false;
            z2 = false;
            i = 0;
            z3 = false;
            z4 = false;
            i2 = 0;
            z5 = false;
            i3 = 0;
            z6 = false;
            z7 = false;
            z8 = false;
            z9 = false;
            z10 = false;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
        }
        float f4 = 0.0f;
        if ((j & 4563413002L) != 0) {
            if (horizontalParam != null) {
                acquireMode = horizontalParam.getAcquireMode();
                str6 = str;
            } else {
                str6 = str;
                acquireMode = null;
            }
            z11 = acquireMode != ServiceEnum.AcquireMode.Acquire_Ultra;
            if ((j & 4563410954L) != 0) {
                j = z11 ? j | 68719476736L : j | 34359738368L;
            }
            if ((j & 4563404810L) != 0) {
                j = z11 ? j | 274877906944L : j | 137438953472L;
            }
            if ((j & 4563402760L) != 0) {
                j |= z11 ? 17592186044416L : 8796093022208L;
            }
            if ((j & 4563402760L) != 0) {
                f = z11 ? 1.0f : 0.5f;
                String str22 = ((j & 4831838224L) != 0 || mappingObject == null) ? null : mappingObject.getStr();
                if ((j & 5368709152L) == 0) {
                    z12 = sharedParam != null ? sharedParam.getShowResultBar() : false;
                    f4 = ContextUtil.getAlpha(z12);
                } else {
                    z12 = false;
                }
                float f5 = f4;
                String str23 = str22;
                i4 = ((j & 175930450378752L) > 0L ? 1 : ((j & 175930450378752L) == 0L ? 0 : -1));
                if (i4 == 0) {
                    unit = verticalParam != null ? verticalParam.getUnit() : null;
                    z13 = unit == null;
                    if (i4 != 0) {
                        j |= z13 ? 1125899906842624L : 562949953421312L;
                    }
                } else {
                    z13 = false;
                    unit = null;
                }
                if ((j & 528134948519936L) == 0) {
                    boolean cursorIndicator = ((j & 68719476736L) == 0 || measureSettingParam == null) ? false : measureSettingParam.getCursorIndicator();
                    unit2 = unit;
                    if ((j & 25769803776L) != 0) {
                        j5 = measureSettingParam != null ? measureSettingParam.getThresholdHigh() : 0L;
                        if ((j & 17179869184L) != 0) {
                            f2 = f;
                            str15 = String.valueOf(j5) + '%';
                        } else {
                            f2 = f;
                            str15 = null;
                        }
                    } else {
                        f2 = f;
                        str15 = null;
                        j5 = 0;
                    }
                    boolean cursorThreshold = ((j & 274877906944L) == 0 || measureSettingParam == null) ? false : measureSettingParam.getCursorThreshold();
                    if ((j & 105553116266496L) != 0) {
                        j6 = measureSettingParam != null ? measureSettingParam.getThresholdLow() : 0L;
                        if ((j & 70368744177664L) != 0) {
                            str9 = str15;
                            z21 = cursorThreshold;
                            str7 = String.valueOf(j6) + '%';
                        } else {
                            str9 = str15;
                            z21 = cursorThreshold;
                            str7 = null;
                        }
                    } else {
                        str9 = str15;
                        z21 = cursorThreshold;
                        str7 = null;
                        j6 = 0;
                    }
                    if ((j & 422212465065984L) != 0) {
                        long thresholdMiddle = measureSettingParam != null ? measureSettingParam.getThresholdMiddle() : 0L;
                        if ((j & 281474976710656L) != 0) {
                            String str24 = str7;
                            j7 = thresholdMiddle;
                            f3 = f5;
                            j2 = j6;
                            z16 = z21;
                            str8 = String.valueOf(thresholdMiddle) + '%';
                            z17 = cursorIndicator;
                            str7 = str24;
                        } else {
                            j7 = thresholdMiddle;
                            f3 = f5;
                            j2 = j6;
                            z16 = z21;
                            str8 = null;
                            z17 = cursorIndicator;
                        }
                        z14 = z12;
                        j3 = j7;
                    } else {
                        f3 = f5;
                        j2 = j6;
                        z16 = z21;
                        str8 = null;
                        z17 = cursorIndicator;
                        z14 = z12;
                        j3 = 0;
                    }
                    long j9 = j5;
                    i5 = i;
                    z15 = z3;
                    j4 = j9;
                } else {
                    unit2 = unit;
                    f2 = f;
                    f3 = f5;
                    z14 = z12;
                    i5 = i;
                    z15 = z3;
                    z16 = false;
                    z17 = false;
                    str7 = null;
                    j2 = 0;
                    j3 = 0;
                    j4 = 0;
                    str8 = null;
                    str9 = null;
                }
                i6 = ((j & 4563410954L) > 0L ? 1 : ((j & 4563410954L) == 0L ? 0 : -1));
                if (i6 == 0) {
                    if (!z11) {
                        z17 = false;
                    }
                    str10 = str7;
                    z18 = z17;
                } else {
                    str10 = str7;
                    z18 = false;
                }
                i7 = ((j & 4563404810L) > 0L ? 1 : ((j & 4563404810L) == 0L ? 0 : -1));
                if (i7 != 0 && z11) {
                    z30 = z16;
                }
                boolean z33 = z30;
                if ((j & 175930450378752L) == 0) {
                    if (z13) {
                        z19 = z18;
                        unit3 = ServiceEnum.Unit.Unit_V;
                    } else {
                        z19 = z18;
                        unit3 = unit2;
                    }
                    if ((j & 35184372088832L) != 0) {
                        z20 = z11;
                        str12 = UnitFormat.newBuilder(UnitFormat.SI.NANO).convert(j2, unit3);
                    } else {
                        z20 = z11;
                        str12 = null;
                    }
                    str13 = (140737488355328L & j) != 0 ? UnitFormat.newBuilder(UnitFormat.SI.NANO).convert(j3, unit3) : null;
                    str11 = (8589934592L & j) != 0 ? UnitFormat.newBuilder(UnitFormat.SI.NANO).convert(j4, unit3) : null;
                } else {
                    z19 = z18;
                    z20 = z11;
                    str11 = null;
                    str12 = null;
                    str13 = null;
                }
                i8 = ((4295492099L & j) > 0L ? 1 : ((4295492099L & j) == 0L ? 0 : -1));
                if (i8 == 0) {
                    if (!z4) {
                        str9 = str11;
                    }
                    str14 = str9;
                } else {
                    str14 = null;
                }
                i9 = ((4297064963L & j) > 0L ? 1 : ((4297064963L & j) == 0L ? 0 : -1));
                if (i9 != 0) {
                    str12 = null;
                } else if (z4) {
                    str12 = str10;
                }
                i10 = ((4296016387L & j) > 0L ? 1 : ((4296016387L & j) == 0L ? 0 : -1));
                String str25 = i10 == 0 ? z4 ? str8 : str13 : null;
                if ((j & 4299161602L) != 0) {
                    CompoundButtonBindingAdapter.setChecked(this.ampMethodSwitch, z);
                    this.baseMethod.setVisibility(i2);
                    this.baseMethodSwitch.setVisibility(i2);
                    this.topMethod.setVisibility(i2);
                    this.topMethodSwitch.setVisibility(i2);
                }
                if ((4311744514L & j) != 0) {
                    CompoundButtonBindingAdapter.setChecked(this.baseMethodSwitch, z2);
                }
                if ((4328521730L & j) != 0) {
                    int i19 = i5;
                    this.cursorA.setVisibility(i19);
                    this.cursorAEditText.setVisibility(i19);
                    this.cursorAb.setVisibility(i19);
                    this.cursorAbSwitch.setVisibility(i19);
                    this.cursorB.setVisibility(i19);
                    this.cursorBEditText.setVisibility(i19);
                }
                if ((4294967296L & j) != 0) {
                    this.cursorAEditText.setOnClickListener(this.mCallback48);
                    this.cursorBEditText.setOnClickListener(this.mCallback49);
                    this.highEditText.setOnClickListener(this.mCallback45);
                    this.lowEditText.setOnClickListener(this.mCallback47);
                    this.midEditText.setOnClickListener(this.mCallback46);
                    this.statCountEditText.setOnClickListener(this.mCallback41);
                    this.statResetButton.setOnClickListener(this.mCallback42);
                    this.thresholdDefaultButton.setOnClickListener(this.mCallback43);
                    this.thresholdSourceSpinner.setOnClickListener(this.mCallback44);
                }
                if ((4362076162L & j) != 0) {
                    TextViewBindingAdapter.setText(this.cursorAEditText, str2);
                }
                if ((4294967298L & j) != 0) {
                    CompoundButtonBindingAdapter.setChecked(this.cursorAbSwitch, z15);
                }
                if ((4429185026L & j) != 0) {
                    TextViewBindingAdapter.setText(this.cursorBEditText, str6);
                }
                if ((j & 5368709152L) != 0) {
                    if (getBuildSdkInt() >= 11) {
                        float f6 = f3;
                        this.deleteAllButton.setAlpha(f6);
                        this.deleteButton.setAlpha(f6);
                    }
                    boolean z34 = z14;
                    this.deleteAllButton.setEnabled(z34);
                    this.deleteButton.setEnabled(z34);
                }
                if (i8 != 0) {
                    TextViewBindingAdapter.setText(this.highEditText, str14);
                }
                if ((4294971394L & j) != 0) {
                    CompoundButtonBindingAdapter.setChecked(this.histoEnSwitch, z8);
                }
                if ((j & 4563402760L) != 0) {
                    if (getBuildSdkInt() >= 11) {
                        float f7 = f2;
                        this.indicator.setAlpha(f7);
                        this.indicatorSwitch.setAlpha(f7);
                        this.threSwitch.setAlpha(f7);
                        this.threText.setAlpha(f7);
                    }
                    boolean z35 = z20;
                    this.indicatorSwitch.setEnabled(z35);
                    this.precisionRadioButton.setEnabled(z35);
                    this.threSwitch.setEnabled(z35);
                }
                if (i6 != 0) {
                    CompoundButtonBindingAdapter.setChecked(this.indicatorSwitch, z19);
                }
                if (i9 != 0) {
                    TextViewBindingAdapter.setText(this.lowEditText, str12);
                }
                if (i10 != 0) {
                    TextViewBindingAdapter.setText(this.midEditText, str25);
                }
                if ((4294968322L & j) != 0) {
                    CompoundButtonBindingAdapter.setChecked(this.precisionRadioButton, z7);
                }
                if ((j & 4831838224L) != 0) {
                    TextViewBindingAdapter.setText(this.precisionRadioButton, str23);
                }
                if ((6476005442L & j) != 0) {
                    TextViewBindingAdapter.setText(this.regionSpinner, str4);
                }
                if ((j & 4295098370L) != 0) {
                    CompoundButtonBindingAdapter.setChecked(this.showLine, z9);
                }
                if ((j & 4295000066L) != 0) {
                    TextViewBindingAdapter.setText(this.statCountEditText, str5);
                }
                if ((4294983682L & j) != 0) {
                    CompoundButtonBindingAdapter.setChecked(this.statSwitch, z10);
                }
                if (i7 != 0) {
                    CompoundButtonBindingAdapter.setChecked(this.threSwitch, z33);
                }
                if ((4295032834L & j) != 0) {
                    CompoundButtonBindingAdapter.setChecked(this.thresholdDisplayTypeSwitch, z6);
                }
                if ((4295229446L & j) != 0) {
                    TextViewBindingAdapter.setText(this.thresholdSourceSpinner, str3);
                }
                if ((4295229442L & j) != 0) {
                    this.thresholdSourceSpinner.setTextColor(i3);
                }
                if ((j & 4303355906L) == 0) {
                    CompoundButtonBindingAdapter.setChecked(this.topMethodSwitch, z5);
                    return;
                }
                return;
            }
        } else {
            str6 = str;
            z11 = false;
        }
        f = 0.0f;
        if ((j & 4831838224L) != 0) {
        }
        if ((j & 5368709152L) == 0) {
        }
        float f52 = f4;
        String str232 = str22;
        i4 = ((j & 175930450378752L) > 0L ? 1 : ((j & 175930450378752L) == 0L ? 0 : -1));
        if (i4 == 0) {
        }
        if ((j & 528134948519936L) == 0) {
        }
        i6 = ((j & 4563410954L) > 0L ? 1 : ((j & 4563410954L) == 0L ? 0 : -1));
        if (i6 == 0) {
        }
        i7 = ((j & 4563404810L) > 0L ? 1 : ((j & 4563404810L) == 0L ? 0 : -1));
        if (i7 != 0) {
            z30 = z16;
        }
        boolean z332 = z30;
        if ((j & 175930450378752L) == 0) {
        }
        i8 = ((4295492099L & j) > 0L ? 1 : ((4295492099L & j) == 0L ? 0 : -1));
        if (i8 == 0) {
        }
        i9 = ((4297064963L & j) > 0L ? 1 : ((4297064963L & j) == 0L ? 0 : -1));
        if (i9 != 0) {
        }
        i10 = ((4296016387L & j) > 0L ? 1 : ((4296016387L & j) == 0L ? 0 : -1));
        if (i10 == 0) {
        }
        if ((j & 4299161602L) != 0) {
        }
        if ((4311744514L & j) != 0) {
        }
        if ((4328521730L & j) != 0) {
        }
        if ((4294967296L & j) != 0) {
        }
        if ((4362076162L & j) != 0) {
        }
        if ((4294967298L & j) != 0) {
        }
        if ((4429185026L & j) != 0) {
        }
        if ((j & 5368709152L) != 0) {
        }
        if (i8 != 0) {
        }
        if ((4294971394L & j) != 0) {
        }
        if ((j & 4563402760L) != 0) {
        }
        if (i6 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if ((4294968322L & j) != 0) {
        }
        if ((j & 4831838224L) != 0) {
        }
        if ((6476005442L & j) != 0) {
        }
        if ((j & 4295098370L) != 0) {
        }
        if ((j & 4295000066L) != 0) {
        }
        if ((4294983682L & j) != 0) {
        }
        if (i7 != 0) {
        }
        if ((4295032834L & j) != 0) {
        }
        if ((4295229446L & j) != 0) {
        }
        if ((4295229442L & j) != 0) {
        }
        if ((j & 4303355906L) == 0) {
        }
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
