package com.rigol.scope.databinding;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.rigol.scope.R;
import com.rigol.scope.cil.ServiceEnum;
import com.rigol.scope.data.MappingObject;
import com.rigol.scope.data.RefParam;
import com.rigol.scope.utilities.ColorUtil;
import com.rigol.scope.utilities.ContextUtil;
import com.rigol.scope.utilities.UnitFormat;
import com.rigol.scope.utilities.ViewUtil;
import com.rigol.scope.views.SwitchButton;
import com.rigol.scope.views.baseview.BaseEditText;
/* loaded from: classes2.dex */
public class PopupviewRefBindingImpl extends PopupviewRefBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.math_guideline_center, 17);
        sViewsWithIds.put(R.id.ref_channel, 18);
        sViewsWithIds.put(R.id.source, 19);
        sViewsWithIds.put(R.id.save, 20);
        sViewsWithIds.put(R.id.save_btn, 21);
        sViewsWithIds.put(R.id.clean, 22);
        sViewsWithIds.put(R.id.math_dividing_line, 23);
        sViewsWithIds.put(R.id.ref_import, 24);
        sViewsWithIds.put(R.id.import_btn, 25);
        sViewsWithIds.put(R.id.ref_export, 26);
        sViewsWithIds.put(R.id.label, 27);
        sViewsWithIds.put(R.id.ref_color, 28);
        sViewsWithIds.put(R.id.ref_reset, 29);
    }

    public PopupviewRefBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 30, sIncludes, sViewsWithIds));
    }

    private PopupviewRefBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 6, (TextView) objArr[22], (Button) objArr[3], (Button) objArr[25], (TextView) objArr[27], (BaseEditText) objArr[13], (SwitchButton) objArr[14], (ImageButton) objArr[7], (ImageButton) objArr[6], (View) objArr[23], (Guideline) objArr[17], (ImageButton) objArr[11], (ImageButton) objArr[10], (TextView) objArr[8], (EditText) objArr[9], (TextView) objArr[18], (TextView) objArr[1], (TextView) objArr[28], (TextView) objArr[15], (TextView) objArr[26], (Button) objArr[12], (TextView) objArr[24], (TextView) objArr[29], (Button) objArr[16], (TextView) objArr[20], (Button) objArr[21], (TextView) objArr[4], (EditText) objArr[5], (TextView) objArr[19], (TextView) objArr[2]);
        this.mDirtyFlags = -1L;
        this.cleanBtn.setTag(null);
        this.labelEditText.setTag(null);
        this.labelSwitch.setTag(null);
        this.mainScaleNomal.setTag(null);
        this.mainScaleVertical.setTag(null);
        this.mathOffsetDown.setTag(null);
        this.mathOffsetUp.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        this.offset.setTag(null);
        this.offsetEditText.setTag(null);
        this.refChannelSpinner.setTag(null);
        this.refColorSpinner.setTag(null);
        this.refExportBtn.setTag(null);
        this.refResetBtn.setTag(null);
        this.scale.setTag(null);
        this.scaleEditText.setTag(null);
        this.sourceSpinner.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
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
            setParam((RefParam) obj);
            return true;
        }
        return false;
    }

    @Override // com.rigol.scope.databinding.PopupviewRefBinding
    public void setParam(RefParam refParam) {
        updateRegistration(4, refParam);
        this.mParam = refParam;
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        notifyPropertyChanged(589);
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
                            return onChangeParamParam1((RefParam.Param) obj, i2);
                        }
                        return onChangeParam((RefParam) obj, i2);
                    }
                    return onChangeParamParam((RefParam.Param) obj, i2);
                }
                return onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgRefSourceParamParamSrcChanValue1((MappingObject) obj, i2);
            }
            return onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgRefColorParamParamRefColorValue1((MappingObject) obj, i2);
        }
        return onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgRefChannelParamRefChan((MappingObject) obj, i2);
    }

    private boolean onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgRefChannelParamRefChan(MappingObject mappingObject, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgRefColorParamParamRefColorValue1(MappingObject mappingObject, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgRefSourceParamParamSrcChanValue1(MappingObject mappingObject, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 4;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeParamParam(RefParam.Param param, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 8;
            }
            return true;
        } else if (i == 886) {
            synchronized (this) {
                this.mDirtyFlags |= 64;
            }
            return true;
        } else if (i == 1008) {
            synchronized (this) {
                this.mDirtyFlags |= 128;
            }
            return true;
        } else if (i == 976) {
            synchronized (this) {
                this.mDirtyFlags |= 256;
            }
            return true;
        } else if (i == 1007) {
            synchronized (this) {
                this.mDirtyFlags |= 512;
            }
            return true;
        } else if (i == 470) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            }
            return true;
        } else if (i == 709) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangeParam(RefParam refParam, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 16;
            }
            return true;
        } else if (i == 707) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            }
            return true;
        } else if (i == 589) {
            synchronized (this) {
                this.mDirtyFlags |= 40;
            }
            return true;
        } else if (i == 820) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangeParamParam1(RefParam.Param param, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 32;
            }
            return true;
        } else if (i == 565) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE;
            }
            return true;
        } else if (i == 886) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
            }
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0183 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0191  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void executeBindings() {
        long j;
        RefParam.Param param;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        boolean z;
        float f;
        boolean z2;
        boolean z3;
        int i2;
        float f2;
        boolean z4;
        String str7;
        int i3;
        String str8;
        int i4;
        String str9;
        String str10;
        String str11;
        String str12;
        long j2;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        RefParam refParam = this.mParam;
        if ((131071 & j) != 0) {
            if ((j & 69649) != 0) {
                MappingObject mappingObject = ViewUtil.getMappingObject(R.array.msg_ref_channel, refParam != null ? refParam.getRefChan() : 0);
                updateRegistration(0, mappingObject);
                if (mappingObject != null) {
                    str = mappingObject.getStr();
                    if ((69598 & j) == 0) {
                        RefParam.Param param2 = refParam != null ? refParam.getParam() : null;
                        updateRegistration(3, param2);
                        String label = ((j & 66584) == 0 || param2 == null) ? null : param2.getLabel();
                        if ((j & 67610) != 0) {
                            ServiceEnum.RefColor refColor = param2 != null ? param2.getRefColor() : null;
                            MappingObject mappingObject2 = ViewUtil.getMappingObject(R.array.msg_ref_color, refColor != null ? refColor.value1 : 0);
                            updateRegistration(1, mappingObject2);
                            if (mappingObject2 != null) {
                                str8 = mappingObject2.getStr();
                                i4 = ((j & 66328) > 0L ? 1 : ((j & 66328) == 0L ? 0 : -1));
                                if (i4 == 0) {
                                    if (param2 != null) {
                                        str9 = str8;
                                        j2 = param2.getVerOffset();
                                    } else {
                                        str9 = str8;
                                        j2 = 0;
                                    }
                                    str10 = UnitFormat.newBuilder(UnitFormat.SI.NANO).convert(j2);
                                } else {
                                    str9 = str8;
                                    str10 = null;
                                }
                                if ((66456 & j) == 0) {
                                    ServiceEnum.Unit unit = param2 != null ? param2.getUnit() : null;
                                    str11 = unit != null ? unit.value2 : null;
                                    if (i4 != 0) {
                                        str2 = str10 + str11;
                                    } else {
                                        str2 = null;
                                    }
                                } else {
                                    str2 = null;
                                    str11 = null;
                                }
                                if ((j & 65944) == 0) {
                                    str12 = UnitFormat.newBuilder(UnitFormat.SI.NANO).convert(param2 != null ? param2.getVerScale() : 0L) + str11;
                                } else {
                                    str12 = null;
                                }
                                if ((j & 65628) == 0) {
                                    ServiceEnum.Chan srcChan = param2 != null ? param2.getSrcChan() : null;
                                    MappingObject mappingObject3 = ViewUtil.getMappingObject(R.array.msg_ref_source, srcChan != null ? srcChan.value1 : 0);
                                    updateRegistration(2, mappingObject3);
                                    String str13 = mappingObject3 != null ? mappingObject3.getStr() : null;
                                    if ((j & 65624) != 0) {
                                        str6 = str13;
                                        str5 = label;
                                        i = ColorUtil.getColor(getRoot().getContext(), srcChan);
                                        str4 = str12;
                                        str3 = str9;
                                        z2 = ((j & 73744) != 0 || refParam == null) ? false : refParam.isShowLabel();
                                        i3 = ((j & 114736) > 0L ? 1 : ((j & 114736) == 0L ? 0 : -1));
                                        if (i3 != 0) {
                                            param = refParam != null ? refParam.getParam() : null;
                                            updateRegistration(5, param);
                                            z = param != null ? param.isOnOff() : false;
                                            if (i3 != 0) {
                                                j = z ? j | PlaybackStateCompat.ACTION_SET_REPEAT_MODE : j | PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
                                            }
                                            if ((j & 81968) != 0) {
                                                f = ContextUtil.getAlpha(z);
                                            }
                                        } else {
                                            param = null;
                                            z = false;
                                        }
                                        f = 0.0f;
                                    } else {
                                        str4 = str12;
                                        str6 = str13;
                                        str3 = str9;
                                        str5 = label;
                                    }
                                } else {
                                    str4 = str12;
                                    str5 = label;
                                    str6 = null;
                                    str3 = str9;
                                }
                            }
                        }
                        str8 = null;
                        i4 = ((j & 66328) > 0L ? 1 : ((j & 66328) == 0L ? 0 : -1));
                        if (i4 == 0) {
                        }
                        if ((66456 & j) == 0) {
                        }
                        if ((j & 65944) == 0) {
                        }
                        if ((j & 65628) == 0) {
                        }
                    } else {
                        str2 = null;
                        str3 = null;
                        str4 = null;
                        str5 = null;
                        str6 = null;
                    }
                    i = 0;
                    if ((j & 73744) != 0) {
                    }
                    i3 = ((j & 114736) > 0L ? 1 : ((j & 114736) == 0L ? 0 : -1));
                    if (i3 != 0) {
                    }
                    f = 0.0f;
                }
            }
            str = null;
            if ((69598 & j) == 0) {
            }
            i = 0;
            if ((j & 73744) != 0) {
            }
            i3 = ((j & 114736) > 0L ? 1 : ((j & 114736) == 0L ? 0 : -1));
            if (i3 != 0) {
            }
            f = 0.0f;
        } else {
            param = null;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            i = 0;
            z = false;
            f = 0.0f;
            z2 = false;
        }
        if ((j & PlaybackStateCompat.ACTION_SET_REPEAT_MODE) != 0) {
            ServiceEnum.Chan srcChan2 = param != null ? param.getSrcChan() : null;
            if ((srcChan2 != null ? srcChan2.value1 : 0) < ServiceEnum.Chan.d0.value1) {
                z3 = true;
                i2 = ((j & 114736) > 0L ? 1 : ((j & 114736) == 0L ? 0 : -1));
                if (i2 == 0) {
                    if (!z) {
                        z3 = false;
                    }
                    f2 = ContextUtil.getAlpha(z3);
                    z4 = z3;
                } else {
                    f2 = 0.0f;
                    z4 = false;
                }
                int i5 = i;
                if ((j & 81968) == 0) {
                    str7 = str6;
                    if (getBuildSdkInt() >= 11) {
                        this.cleanBtn.setAlpha(f);
                        this.mathOffsetDown.setAlpha(f);
                        this.mathOffsetUp.setAlpha(f);
                        this.offset.setAlpha(f);
                        this.offsetEditText.setAlpha(f);
                        this.refExportBtn.setAlpha(f);
                        this.refResetBtn.setAlpha(f);
                        this.scale.setAlpha(f);
                    }
                    this.cleanBtn.setEnabled(z);
                    this.mathOffsetDown.setEnabled(z);
                    this.mathOffsetUp.setEnabled(z);
                    this.offsetEditText.setEnabled(z);
                    this.refExportBtn.setEnabled(z);
                    this.refResetBtn.setEnabled(z);
                } else {
                    str7 = str6;
                }
                if ((j & 66584) != 0) {
                    TextViewBindingAdapter.setText(this.labelEditText, str5);
                }
                if ((j & 73744) != 0) {
                    CompoundButtonBindingAdapter.setChecked(this.labelSwitch, z2);
                }
                if (i2 != 0) {
                    if (getBuildSdkInt() >= 11) {
                        this.mainScaleNomal.setAlpha(f2);
                        this.mainScaleVertical.setAlpha(f2);
                        this.scaleEditText.setAlpha(f2);
                    }
                    this.mainScaleNomal.setEnabled(z4);
                    this.mainScaleVertical.setEnabled(z4);
                    this.scaleEditText.setEnabled(z4);
                }
                if ((66328 & j) != 0) {
                    TextViewBindingAdapter.setText(this.offsetEditText, str2);
                }
                if ((j & 69649) != 0) {
                    TextViewBindingAdapter.setText(this.refChannelSpinner, str);
                }
                if ((67610 & j) != 0) {
                    TextViewBindingAdapter.setText(this.refColorSpinner, str3);
                }
                if ((65944 & j) != 0) {
                    TextViewBindingAdapter.setText(this.scaleEditText, str4);
                }
                if ((65628 & j) != 0) {
                    TextViewBindingAdapter.setText(this.sourceSpinner, str7);
                }
                if ((j & 65624) == 0) {
                    this.sourceSpinner.setTextColor(i5);
                    return;
                }
                return;
            }
        }
        z3 = false;
        i2 = ((j & 114736) > 0L ? 1 : ((j & 114736) == 0L ? 0 : -1));
        if (i2 == 0) {
        }
        int i52 = i;
        if ((j & 81968) == 0) {
        }
        if ((j & 66584) != 0) {
        }
        if ((j & 73744) != 0) {
        }
        if (i2 != 0) {
        }
        if ((66328 & j) != 0) {
        }
        if ((j & 69649) != 0) {
        }
        if ((67610 & j) != 0) {
        }
        if ((65944 & j) != 0) {
        }
        if ((65628 & j) != 0) {
        }
        if ((j & 65624) == 0) {
        }
    }
}
