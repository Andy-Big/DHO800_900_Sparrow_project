package com.rigol.scope.databinding;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.rigol.scope.R;
import com.rigol.scope.data.MappingObject;
import com.rigol.scope.data.MaskParam;
import com.rigol.scope.data.UtilityParam;
import com.rigol.scope.utilities.ContextUtil;
import com.rigol.scope.utilities.ViewUtil;
import com.rigol.scope.views.SwitchButton;
/* loaded from: classes2.dex */
public class AdapterUtilityBasesettingBindingImpl extends AdapterUtilityBasesettingBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.content_layout, 15);
        sViewsWithIds.put(R.id.language_layout, 16);
        sViewsWithIds.put(R.id.tv_language, 17);
        sViewsWithIds.put(R.id.view3, 18);
        sViewsWithIds.put(R.id.load_last_layout, 19);
        sViewsWithIds.put(R.id.tv_load_last, 20);
        sViewsWithIds.put(R.id.power_layout, 21);
        sViewsWithIds.put(R.id.tv_powerstate, 22);
        sViewsWithIds.put(R.id.beeper_layout, 23);
        sViewsWithIds.put(R.id.tv_beeper, 24);
        sViewsWithIds.put(R.id.vibration_layout, 25);
        sViewsWithIds.put(R.id.tv_vibration, 26);
        sViewsWithIds.put(R.id.screen_lock_layout, 27);
        sViewsWithIds.put(R.id.tv_screen_lock, 28);
        sViewsWithIds.put(R.id.vertical_expand_layout, 29);
        sViewsWithIds.put(R.id.vertical_expand, 30);
        sViewsWithIds.put(R.id.view4, 31);
        sViewsWithIds.put(R.id.showtime_layout, 32);
        sViewsWithIds.put(R.id.tv_showtime, 33);
        sViewsWithIds.put(R.id.openzoom_layout, 34);
        sViewsWithIds.put(R.id.tv_sopenzoom, 35);
        sViewsWithIds.put(R.id.space, 36);
        sViewsWithIds.put(R.id.settime_layout, 37);
        sViewsWithIds.put(R.id.year_layout, 38);
        sViewsWithIds.put(R.id.tv_year, 39);
        sViewsWithIds.put(R.id.time_layout, 40);
        sViewsWithIds.put(R.id.tv_time, 41);
    }

    public AdapterUtilityBasesettingBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 42, sIncludes, sViewsWithIds));
    }

    private AdapterUtilityBasesettingBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (ConstraintLayout) objArr[5], (ConstraintLayout) objArr[23], (ConstraintLayout) objArr[15], (ConstraintLayout) objArr[16], (ConstraintLayout) objArr[19], (ConstraintLayout) objArr[34], (ConstraintLayout) objArr[21], (ConstraintLayout) objArr[27], (ConstraintLayout) objArr[37], (ConstraintLayout) objArr[32], (TextView) objArr[1], (Space) objArr[36], (SwitchButton) objArr[7], (SwitchButton) objArr[4], (SwitchButton) objArr[2], (SwitchButton) objArr[12], (SwitchButton) objArr[3], (SwitchButton) objArr[9], (SwitchButton) objArr[11], (SwitchButton) objArr[10], (SwitchButton) objArr[8], (ConstraintLayout) objArr[40], (TextView) objArr[6], (TextView) objArr[24], (TextView) objArr[17], (TextView) objArr[20], (TextView) objArr[22], (TextView) objArr[28], (TextView) objArr[33], (TextView) objArr[35], (TextView) objArr[41], (TextView) objArr[14], (TextView) objArr[26], (TextView) objArr[39], (TextView) objArr[13], (TextView) objArr[30], (ConstraintLayout) objArr[29], (ConstraintLayout) objArr[25], (View) objArr[18], (View) objArr[31], (ConstraintLayout) objArr[38]);
        this.mDirtyFlags = -1L;
        this.auxoutLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        this.spLanguage.setTag(null);
        this.switchButtonAuxout.setTag(null);
        this.switchButtonBeeper.setTag(null);
        this.switchButtonLoadLast.setTag(null);
        this.switchButtonOpenzoom.setTag(null);
        this.switchButtonPower.setTag(null);
        this.switchButtonScreenLock.setTag(null);
        this.switchButtonShowtime.setTag(null);
        this.switchButtonVerticalExpand.setTag(null);
        this.switchButtonVibration.setTag(null);
        this.tvAuxout.setTag(null);
        this.tvTimevalue.setTag(null);
        this.tvYearvalue.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
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
            setParam((UtilityParam) obj);
        } else if (517 != i) {
            return false;
        } else {
            setMaskParam((MaskParam) obj);
        }
        return true;
    }

    @Override // com.rigol.scope.databinding.AdapterUtilityBasesettingBinding
    public void setParam(UtilityParam utilityParam) {
        updateRegistration(1, utilityParam);
        this.mParam = utilityParam;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(589);
        super.requestRebind();
    }

    @Override // com.rigol.scope.databinding.AdapterUtilityBasesettingBinding
    public void setMaskParam(MaskParam maskParam) {
        updateRegistration(2, maskParam);
        this.mMaskParam = maskParam;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(517);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i, Object obj, int i2) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                return onChangeMaskParam((MaskParam) obj, i2);
            }
            return onChangeParam((UtilityParam) obj, i2);
        }
        return onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgAppUtilityLanguageParamLanguage((MappingObject) obj, i2);
    }

    private boolean onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgAppUtilityLanguageParamLanguage(MappingObject mappingObject, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 1;
            }
            return true;
        } else if (i == 904) {
            synchronized (this) {
                this.mDirtyFlags |= 8;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangeParam(UtilityParam utilityParam, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 2;
            }
            return true;
        } else if (i == 473) {
            synchronized (this) {
                this.mDirtyFlags |= 16;
            }
            return true;
        } else if (i == 645) {
            synchronized (this) {
                this.mDirtyFlags |= 32;
            }
            return true;
        } else if (i == 646) {
            synchronized (this) {
                this.mDirtyFlags |= 64;
            }
            return true;
        } else if (i == 85) {
            synchronized (this) {
                this.mDirtyFlags |= 128;
            }
            return true;
        } else if (i == 60) {
            synchronized (this) {
                this.mDirtyFlags |= 256;
            }
            return true;
        } else if (i == 1016) {
            synchronized (this) {
                this.mDirtyFlags |= 512;
            }
            return true;
        } else if (i == 501) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            }
            return true;
        } else if (i == 1013) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
            }
            return true;
        } else if (i == 831) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            }
            return true;
        } else if (i == 835) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            }
            return true;
        } else if (i == 218) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE;
            }
            return true;
        } else if (i == 923) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangeMaskParam(MaskParam maskParam, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 4;
            }
            return true;
        } else if (i == 567) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
            }
            return true;
        } else {
            return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        String str;
        String str2;
        String str3;
        boolean z10;
        float f;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        UtilityParam utilityParam = this.mParam;
        MaskParam maskParam = this.mMaskParam;
        String str4 = null;
        if ((196603 & j) != 0) {
            z2 = ((j & 131330) == 0 || utilityParam == null) ? false : utilityParam.getAuxOut();
            boolean powerOnSet = ((j & 131106) == 0 || utilityParam == null) ? false : utilityParam.getPowerOnSet();
            if ((j & 131099) != 0) {
                MappingObject mappingObject = ViewUtil.getMappingObject(R.array.msg_app_utility_language, utilityParam != null ? utilityParam.getLanguage() : 0);
                updateRegistration(0, mappingObject);
                if (mappingObject != null) {
                    str2 = mappingObject.getStr();
                    z3 = ((j & 132098) != 0 || utilityParam == null) ? false : utilityParam.getLockKeyboard();
                    boolean showzoom = ((j & 139266) != 0 || utilityParam == null) ? false : utilityParam.getShowzoom();
                    String time = ((j & 163842) != 0 || utilityParam == null) ? null : utilityParam.getTime();
                    if ((j & 147458) != 0 && utilityParam != null) {
                        str4 = utilityParam.getDate();
                    }
                    boolean showTime = ((j & 135170) != 0 || utilityParam == null) ? false : utilityParam.getShowTime();
                    boolean vibration = ((j & 131586) != 0 || utilityParam == null) ? false : utilityParam.getVibration();
                    boolean beeper = ((j & 131202) != 0 || utilityParam == null) ? false : utilityParam.getBeeper();
                    boolean powerStatus = ((j & 131138) != 0 || utilityParam == null) ? false : utilityParam.getPowerStatus();
                    z = ((j & 133122) != 0 || utilityParam == null) ? false : utilityParam.getVerticalExpand();
                    str3 = str4;
                    z4 = powerOnSet;
                    z5 = showzoom;
                    str = time;
                    z8 = showTime;
                    z9 = vibration;
                    z6 = beeper;
                    z7 = powerStatus;
                }
            }
            str2 = null;
            if ((j & 132098) != 0) {
            }
            if ((j & 139266) != 0) {
            }
            if ((j & 163842) != 0) {
            }
            if ((j & 147458) != 0) {
                str4 = utilityParam.getDate();
            }
            if ((j & 135170) != 0) {
            }
            if ((j & 131586) != 0) {
            }
            if ((j & 131202) != 0) {
            }
            if ((j & 131138) != 0) {
            }
            if ((j & 133122) != 0) {
            }
            str3 = str4;
            z4 = powerOnSet;
            z5 = showzoom;
            str = time;
            z8 = showTime;
            z9 = vibration;
            z6 = beeper;
            z7 = powerStatus;
        } else {
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
            z7 = false;
            z8 = false;
            z9 = false;
            str = null;
            str2 = null;
            str3 = null;
        }
        int i = ((j & 196612) > 0L ? 1 : ((j & 196612) == 0L ? 0 : -1));
        if (i != 0) {
            z10 = !(maskParam != null ? maskParam.isOperate() : false);
            f = ContextUtil.getAlpha(z10);
        } else {
            z10 = false;
            f = 0.0f;
        }
        if (i != 0) {
            this.auxoutLayout.setEnabled(z10);
            this.switchButtonAuxout.setEnabled(z10);
            if (getBuildSdkInt() >= 11) {
                this.switchButtonAuxout.setAlpha(f);
                this.tvAuxout.setAlpha(f);
            }
        }
        if ((j & 131099) != 0) {
            TextViewBindingAdapter.setText(this.spLanguage, str2);
        }
        if ((j & 131330) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.switchButtonAuxout, z2);
        }
        if ((j & 131202) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.switchButtonBeeper, z6);
        }
        if ((j & 131106) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.switchButtonLoadLast, z4);
        }
        if ((j & 139266) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.switchButtonOpenzoom, z5);
        }
        if ((131138 & j) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.switchButtonPower, z7);
        }
        if ((j & 132098) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.switchButtonScreenLock, z3);
        }
        if ((135170 & j) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.switchButtonShowtime, z8);
        }
        if ((133122 & j) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.switchButtonVerticalExpand, z);
        }
        if ((131586 & j) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.switchButtonVibration, z9);
        }
        if ((j & 163842) != 0) {
            TextViewBindingAdapter.setText(this.tvTimevalue, str);
        }
        if ((j & 147458) != 0) {
            TextViewBindingAdapter.setText(this.tvYearvalue, str3);
        }
    }
}
