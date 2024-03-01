package com.rigol.scope.databinding;

import android.graphics.drawable.Drawable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.rigol.scope.R;
import com.rigol.scope.cil.ServiceEnum;
import com.rigol.scope.data.AfgParam;
import com.rigol.scope.data.MappingObject;
import com.rigol.scope.data.StorageLoadParam;
import com.rigol.scope.utilities.UnitFormat;
import com.rigol.scope.utilities.ViewUtil;
import com.rigol.scope.views.SwitchButton;
import com.rigol.scope.views.baseview.BaseEditText;
/* loaded from: classes2.dex */
public class AdapterAfgBindingImpl extends AdapterAfgBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.left_guideline, 24);
        sViewsWithIds.put(R.id.left_guideline1, 25);
        sViewsWithIds.put(R.id.left_guideline2, 26);
        sViewsWithIds.put(R.id.sweep_out_text, 27);
        sViewsWithIds.put(R.id.source_type_text, 28);
        sViewsWithIds.put(R.id.basic_deviation_text, 29);
    }

    public AdapterAfgBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 30, sIncludes, sViewsWithIds));
    }

    private AdapterAfgBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (BaseEditText) objArr[11], (TextView) objArr[10], (TextView) objArr[18], (TextView) objArr[16], (BaseEditText) objArr[23], (TextView) objArr[29], (BaseEditText) objArr[13], (TextView) objArr[12], (BaseEditText) objArr[19], (BaseEditText) objArr[22], (TextView) objArr[21], (BaseEditText) objArr[15], (TextView) objArr[14], (BaseEditText) objArr[17], (TextView) objArr[5], (TextView) objArr[3], (ImageView) objArr[8], (BaseEditText) objArr[7], (BaseEditText) objArr[9], (BaseEditText) objArr[6], (SwitchButton) objArr[1], (Guideline) objArr[24], (Guideline) objArr[25], (Guideline) objArr[26], (Button) objArr[20], (TextView) objArr[4], (TextView) objArr[2], (TextView) objArr[28], (TextView) objArr[27]);
        this.mDirtyFlags = -1L;
        this.basicAmpEdit.setTag(null);
        this.basicAmpText.setTag(null);
        this.basicBasicPathText.setTag(null);
        this.basicBasicWidthText.setTag(null);
        this.basicDeviationEdit.setTag(null);
        this.basicDutycycleEdit.setTag(null);
        this.basicDutycycleText.setTag(null);
        this.basicPathEdit.setTag(null);
        this.basicPhaseEdit.setTag(null);
        this.basicPhaseText.setTag(null);
        this.basicSymmetryEdit.setTag(null);
        this.basicSymmetryText.setTag(null);
        this.basicWidthEdit.setTag(null);
        this.declineText.setTag(null);
        this.fraguencyText.setTag(null);
        this.iconAfg.setTag(null);
        this.labelDeclineText.setTag(null);
        this.labelEditText.setTag(null);
        this.labelRiseedgeText.setTag(null);
        this.labelSwitch.setTag(null);
        this.loadBtn.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        this.riseText.setTag(null);
        this.sourceTypeSpinner.setTag(null);
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
        if (589 == i) {
            setParam((AfgParam) obj);
        } else if (902 != i) {
            return false;
        } else {
            setStorageLoadParam((StorageLoadParam) obj);
        }
        return true;
    }

    @Override // com.rigol.scope.databinding.AdapterAfgBinding
    public void setParam(AfgParam afgParam) {
        updateRegistration(0, afgParam);
        this.mParam = afgParam;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(589);
        super.requestRebind();
    }

    @Override // com.rigol.scope.databinding.AdapterAfgBinding
    public void setStorageLoadParam(StorageLoadParam storageLoadParam) {
        this.mStorageLoadParam = storageLoadParam;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i, Object obj, int i2) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    return onChangeStorageLoadParam((StorageLoadParam) obj, i2);
                }
                return onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgAfgWaveFunction1ParamWaveFunction((MappingObject) obj, i2);
            }
            return onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgAfgWaveFunctionParamWaveFunction((MappingObject) obj, i2);
        }
        return onChangeParam((AfgParam) obj, i2);
    }

    private boolean onChangeParam(AfgParam afgParam, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 1;
            }
            return true;
        } else if (i == 78) {
            synchronized (this) {
                this.mDirtyFlags |= 16;
            }
            return true;
        } else if (i == 1028) {
            synchronized (this) {
                this.mDirtyFlags |= 32;
            }
            return true;
        } else if (i == 82) {
            synchronized (this) {
                this.mDirtyFlags |= 64;
            }
            return true;
        } else if (i == 73) {
            synchronized (this) {
                this.mDirtyFlags |= 128;
            }
            return true;
        } else if (i == 74) {
            synchronized (this) {
                this.mDirtyFlags |= 256;
            }
            return true;
        } else if (i == 72) {
            synchronized (this) {
                this.mDirtyFlags |= 512;
            }
            return true;
        } else if (i == 83) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            }
            return true;
        } else if (i == 71) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
            }
            return true;
        } else if (i == 81) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            }
            return true;
        } else if (i == 1036) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            }
            return true;
        } else if (i == 80) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE;
            }
            return true;
        } else if (i == 77) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgAfgWaveFunctionParamWaveFunction(MappingObject mappingObject, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 2;
            }
            return true;
        } else if (i == 904) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
            }
            return true;
        } else if (i == 1003) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgAfgWaveFunction1ParamWaveFunction(MappingObject mappingObject, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 4;
            }
            return true;
        } else if (i == 632) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangeStorageLoadParam(StorageLoadParam storageLoadParam, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 8;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Drawable drawable;
        String str8;
        String str9;
        String str10;
        String str11;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        int i7;
        String str12;
        Drawable drawable2;
        String str13;
        boolean z4;
        int i8;
        int i9;
        Drawable drawable3;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        boolean z5;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        AfgParam afgParam = this.mParam;
        String str31 = null;
        if ((1048567 & j) != 0) {
            if ((j & 983079) != 0) {
                int wave_function = afgParam != null ? afgParam.getWave_function() : 0;
                if ((j & 720931) != 0) {
                    MappingObject mappingObject = ViewUtil.getMappingObject(R.array.msg_afg_wave_function, wave_function);
                    updateRegistration(1, mappingObject);
                    int i10 = ((j & 655395) > 0L ? 1 : ((j & 655395) == 0L ? 0 : -1));
                    if (i10 != 0) {
                        int value = mappingObject != null ? mappingObject.getValue() : 0;
                        boolean z6 = value == 1;
                        boolean z7 = value == 2;
                        z = value != 4;
                        z4 = value != 5;
                        boolean z8 = value == 100;
                        boolean z9 = value == 3;
                        boolean z10 = value == 6;
                        if (i10 != 0) {
                            j |= z6 ? 34359738368L : 17179869184L;
                        }
                        if ((j & 655395) != 0) {
                            j |= z7 ? 8388608L : 4194304L;
                        }
                        if ((j & 655395) != 0) {
                            j |= z ? 536870912L : 268435456L;
                        }
                        if ((j & 655395) != 0) {
                            j |= z4 ? 2147483648L : 1073741824L;
                        }
                        if ((j & 655395) != 0) {
                            j |= z8 ? 134217728L : 67108864L;
                        }
                        if ((j & 655395) != 0) {
                            j |= z9 ? 8589934592L : 4294967296L;
                        }
                        if ((j & 655395) != 0) {
                            j |= z10 ? 33554432L : 16777216L;
                        }
                        i5 = z6 ? 0 : 8;
                        i6 = z7 ? 0 : 8;
                        i8 = z4 ? 0 : 8;
                        i3 = z8 ? 0 : 8;
                        i4 = z9 ? 0 : 8;
                        i9 = z10 ? 0 : 8;
                    } else {
                        z = false;
                        z4 = false;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        i6 = 0;
                        i8 = 0;
                        i9 = 0;
                    }
                    str13 = ((j & 589859) == 0 || mappingObject == null) ? null : mappingObject.getStr();
                } else {
                    str13 = null;
                    z = false;
                    z4 = false;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    i6 = 0;
                    i8 = 0;
                    i9 = 0;
                }
                if ((j & 786469) != 0) {
                    MappingObject mappingObject2 = ViewUtil.getMappingObject(R.array.msg_afg_wave_function1, wave_function);
                    updateRegistration(2, mappingObject2);
                    Drawable pic = mappingObject2 != null ? mappingObject2.getPic() : null;
                    Drawable.ConstantState constantState = pic != null ? pic.getConstantState() : null;
                    Drawable newDrawable = constantState != null ? constantState.newDrawable() : null;
                    if (newDrawable != null) {
                        drawable2 = newDrawable.mutate();
                    }
                }
                drawable2 = null;
            } else {
                drawable2 = null;
                str13 = null;
                z = false;
                z4 = false;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                i8 = 0;
                i9 = 0;
            }
            boolean basic_output_enable = ((j & 524305) == 0 || afgParam == null) ? false : afgParam.getBasic_output_enable();
            if ((j & 525313) != 0) {
                drawable3 = drawable2;
                str14 = UnitFormat.newBuilder().convert(afgParam != null ? afgParam.getBasic_squ_duty() : 0, ServiceEnum.Unit.Unit_percent);
            } else {
                drawable3 = drawable2;
                str14 = null;
            }
            if ((j & 532481) != 0) {
                str15 = ViewUtil.getDiskUIPathName(afgParam != null ? afgParam.getWave_path() : null);
            } else {
                str15 = null;
            }
            if ((j & 526337) != 0) {
                str16 = str14;
                str17 = str15;
                str18 = UnitFormat.newBuilder().convert(afgParam != null ? afgParam.getBasic_SYMM() : 0, ServiceEnum.Unit.Unit_percent);
            } else {
                str16 = str14;
                str17 = str15;
                str18 = null;
            }
            if ((j & 524801) != 0) {
                str19 = str18;
                str20 = UnitFormat.newBuilder(UnitFormat.SI.NANO).convert(afgParam != null ? afgParam.getBasic_amp() : 0L, ServiceEnum.Unit.Unit_V);
            } else {
                str19 = str18;
                str20 = null;
            }
            if ((j & 524353) != 0) {
                str21 = str20;
                str22 = UnitFormat.newBuilder(UnitFormat.SI.FEMTO).convert(afgParam != null ? afgParam.getBasic_riseedge() : 0L, ServiceEnum.Unit.Unit_s);
            } else {
                str21 = str20;
                str22 = null;
            }
            if ((j & 528385) != 0) {
                str23 = str22;
                z5 = basic_output_enable;
                str24 = UnitFormat.newBuilder().convert(afgParam != null ? afgParam.getBasic_pul_duty() : 0, ServiceEnum.Unit.Unit_percent);
            } else {
                str23 = str22;
                z5 = basic_output_enable;
                str24 = null;
            }
            if ((j & 540673) != 0) {
                str25 = str24;
                str26 = UnitFormat.newBuilder(UnitFormat.SI.MILLI).convert(afgParam != null ? afgParam.getBasic_phase() : 0, ServiceEnum.Unit.Unit_degree);
            } else {
                str25 = str24;
                str26 = null;
            }
            if ((j & 524417) != 0) {
                str27 = str26;
                str28 = UnitFormat.newBuilder(UnitFormat.SI.FEMTO).convert(afgParam != null ? afgParam.getBasic_falledge() : 0L, ServiceEnum.Unit.Unit_s);
            } else {
                str27 = str26;
                str28 = null;
            }
            if ((j & 524545) != 0) {
                str29 = str28;
                str30 = ViewUtil.subNumber(UnitFormat.newBuilder("0.##########", UnitFormat.SI.MICRO).convert(afgParam != null ? afgParam.getBasic_freq() : 0L) + ServiceEnum.Unit.Unit_hz.value2, 6);
            } else {
                str29 = str28;
                str30 = null;
            }
            if ((j & 557057) != 0) {
                str31 = UnitFormat.newBuilder(UnitFormat.SI.NANO).convert(afgParam != null ? afgParam.getBasic_offset() : 0L, ServiceEnum.Unit.Unit_V);
            }
            str9 = str30;
            str11 = str13;
            str10 = str23;
            i = i8;
            str3 = str31;
            i2 = i9;
            drawable = drawable3;
            str = str16;
            str4 = str17;
            str2 = str21;
            z3 = z5;
            str7 = str25;
            str5 = str27;
            str8 = str29;
            z2 = z4;
            str6 = str19;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            drawable = null;
            str8 = null;
            str9 = null;
            str10 = null;
            str11 = null;
            i = 0;
            i2 = 0;
            z = false;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            z2 = false;
            z3 = false;
        }
        int i11 = ((j & 655395) > 0L ? 1 : ((j & 655395) == 0L ? 0 : -1));
        if (i11 != 0) {
            if (!z) {
                z2 = false;
            }
            if (i11 != 0) {
                j |= z2 ? PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            }
            i7 = z2 ? 0 : 8;
        } else {
            i7 = 0;
        }
        if ((j & 655395) != 0) {
            str12 = str6;
            this.basicAmpEdit.setVisibility(i);
            this.basicAmpText.setVisibility(i);
            this.basicBasicPathText.setVisibility(i2);
            this.basicBasicWidthText.setVisibility(i4);
            this.basicDutycycleEdit.setVisibility(i5);
            this.basicDutycycleText.setVisibility(i5);
            this.basicPathEdit.setVisibility(i2);
            this.basicPhaseEdit.setVisibility(i7);
            this.basicPhaseText.setVisibility(i7);
            this.basicSymmetryEdit.setVisibility(i6);
            this.basicSymmetryText.setVisibility(i6);
            this.basicWidthEdit.setVisibility(i4);
            this.declineText.setVisibility(i3);
            this.fraguencyText.setVisibility(i7);
            this.labelDeclineText.setVisibility(i3);
            this.labelEditText.setVisibility(i7);
            this.labelRiseedgeText.setVisibility(i3);
            this.loadBtn.setVisibility(i2);
            this.riseText.setVisibility(i3);
        } else {
            str12 = str6;
        }
        if ((j & 524801) != 0) {
            TextViewBindingAdapter.setText(this.basicAmpEdit, str2);
        }
        if ((j & 557057) != 0) {
            TextViewBindingAdapter.setText(this.basicDeviationEdit, str3);
        }
        if ((j & 525313) != 0) {
            TextViewBindingAdapter.setText(this.basicDutycycleEdit, str);
        }
        if ((j & 532481) != 0) {
            TextViewBindingAdapter.setText(this.basicPathEdit, str4);
        }
        if ((540673 & j) != 0) {
            TextViewBindingAdapter.setText(this.basicPhaseEdit, str5);
        }
        if ((j & 526337) != 0) {
            TextViewBindingAdapter.setText(this.basicSymmetryEdit, str12);
        }
        if ((528385 & j) != 0) {
            TextViewBindingAdapter.setText(this.basicWidthEdit, str7);
        }
        if ((j & 786469) != 0) {
            ImageViewBindingAdapter.setImageDrawable(this.iconAfg, drawable);
        }
        if ((524417 & j) != 0) {
            TextViewBindingAdapter.setText(this.labelDeclineText, str8);
        }
        if ((524545 & j) != 0) {
            TextViewBindingAdapter.setText(this.labelEditText, str9);
        }
        if ((524353 & j) != 0) {
            TextViewBindingAdapter.setText(this.labelRiseedgeText, str10);
        }
        if ((j & 524305) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.labelSwitch, z3);
        }
        if ((j & 589859) != 0) {
            TextViewBindingAdapter.setText(this.sourceTypeSpinner, str11);
        }
    }
}
