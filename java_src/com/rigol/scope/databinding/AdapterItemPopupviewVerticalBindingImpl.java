package com.rigol.scope.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.rigol.scope.R;
import com.rigol.scope.cil.ServiceEnum;
import com.rigol.scope.data.HorizontalParam;
import com.rigol.scope.data.MappingObject;
import com.rigol.scope.data.VerticalParam;
import com.rigol.scope.generated.callback.OnClickListener;
import com.rigol.scope.utilities.ContextUtil;
import com.rigol.scope.utilities.UnitFormat;
import com.rigol.scope.utilities.ViewUtil;
import com.rigol.scope.views.SwitchButton;
import com.rigol.scope.views.baseview.BaseEditText;
/* loaded from: classes2.dex */
public class AdapterItemPopupviewVerticalBindingImpl extends AdapterItemPopupviewVerticalBinding implements OnClickListener.Listener {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private final View.OnClickListener mCallback10;
    private final View.OnClickListener mCallback11;
    private final View.OnClickListener mCallback12;
    private final View.OnClickListener mCallback13;
    private final View.OnClickListener mCallback14;
    private final View.OnClickListener mCallback15;
    private final View.OnClickListener mCallback16;
    private final View.OnClickListener mCallback17;
    private final View.OnClickListener mCallback18;
    private final View.OnClickListener mCallback19;
    private final View.OnClickListener mCallback20;
    private final View.OnClickListener mCallback21;
    private final View.OnClickListener mCallback22;
    private final View.OnClickListener mCallback23;
    private final View.OnClickListener mCallback24;
    private final View.OnClickListener mCallback25;
    private final View.OnClickListener mCallback26;
    private final View.OnClickListener mCallback27;
    private final View.OnClickListener mCallback28;
    private final View.OnClickListener mCallback29;
    private final View.OnClickListener mCallback4;
    private final View.OnClickListener mCallback5;
    private final View.OnClickListener mCallback6;
    private final View.OnClickListener mCallback7;
    private final View.OnClickListener mCallback8;
    private final View.OnClickListener mCallback9;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;
    private final TextView mboundView10;
    private final TextView mboundView13;
    private final TextView mboundView19;
    private final TextView mboundView23;
    private final TextView mboundView25;
    private final TextView mboundView27;
    private final ImageView mboundView3;
    private final TextView mboundView31;
    private final TextView mboundView33;
    private final TextView mboundView35;
    private final TextView mboundView39;
    private final ImageView mboundView4;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.diagram, 43);
        sViewsWithIds.put(R.id.display, 44);
    }

    public AdapterItemPopupviewVerticalBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 45, sIncludes, sViewsWithIds));
    }

    private AdapterItemPopupviewVerticalBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 6, (Button) objArr[6], (Button) objArr[17], (TextView) objArr[32], (TextView) objArr[20], (EditText) objArr[34], (ImageView) objArr[43], (TextView) objArr[44], (SwitchButton) objArr[9], (SwitchButton) objArr[26], (Button) objArr[5], (TextView) objArr[21], (SwitchButton) objArr[22], (SwitchButton) objArr[24], (ImageView) objArr[2], (ImageView) objArr[1], (ImageView) objArr[8], (ImageView) objArr[7], (BaseEditText) objArr[12], (SwitchButton) objArr[14], (Button) objArr[18], (EditText) objArr[40], (ImageButton) objArr[41], (ImageButton) objArr[42], (EditText) objArr[36], (ImageButton) objArr[37], (ImageButton) objArr[38], (Button) objArr[15], (EditText) objArr[28], (ImageButton) objArr[29], (ImageButton) objArr[30], (Button) objArr[16], (TextView) objArr[11]);
        this.mDirtyFlags = -1L;
        this.acButton.setTag(null);
        this.acquireBtn.setTag(null);
        this.bandwidthLimitSpinner.setTag(null);
        this.couplingSpinner.setTag(null);
        this.delayEditText.setTag(null);
        this.displaySwitch.setTag(null);
        this.fineSwitch.setTag(null);
        this.gudButton.setTag(null);
        this.impedance.setTag(null);
        this.impedanceSwitch.setTag(null);
        this.invertSwitch.setTag(null);
        this.ivImpedance1.setTag(null);
        this.ivImpedance50.setTag(null);
        this.ivLineImpedance1.setTag(null);
        this.ivLineImpedance50.setTag(null);
        this.labelEditText.setTag(null);
        this.labelSwitch.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[10];
        this.mboundView10 = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[13];
        this.mboundView13 = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[19];
        this.mboundView19 = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) objArr[23];
        this.mboundView23 = textView4;
        textView4.setTag(null);
        TextView textView5 = (TextView) objArr[25];
        this.mboundView25 = textView5;
        textView5.setTag(null);
        TextView textView6 = (TextView) objArr[27];
        this.mboundView27 = textView6;
        textView6.setTag(null);
        ImageView imageView = (ImageView) objArr[3];
        this.mboundView3 = imageView;
        imageView.setTag(null);
        TextView textView7 = (TextView) objArr[31];
        this.mboundView31 = textView7;
        textView7.setTag(null);
        TextView textView8 = (TextView) objArr[33];
        this.mboundView33 = textView8;
        textView8.setTag(null);
        TextView textView9 = (TextView) objArr[35];
        this.mboundView35 = textView9;
        textView9.setTag(null);
        TextView textView10 = (TextView) objArr[39];
        this.mboundView39 = textView10;
        textView10.setTag(null);
        ImageView imageView2 = (ImageView) objArr[4];
        this.mboundView4 = imageView2;
        imageView2.setTag(null);
        this.measureBtn.setTag(null);
        this.offsetEditText.setTag(null);
        this.offsetLeft.setTag(null);
        this.offsetRight.setTag(null);
        this.positionEditText.setTag(null);
        this.positionLeft.setTag(null);
        this.positionRight.setTag(null);
        this.probeSettingBtn.setTag(null);
        this.scaleEditText.setTag(null);
        this.scaleLeft.setTag(null);
        this.scaleRight.setTag(null);
        this.triggerBtn.setTag(null);
        this.unitSpinner.setTag(null);
        setRootTag(view);
        this.mCallback27 = new OnClickListener(this, 24);
        this.mCallback15 = new OnClickListener(this, 12);
        this.mCallback16 = new OnClickListener(this, 13);
        this.mCallback28 = new OnClickListener(this, 25);
        this.mCallback9 = new OnClickListener(this, 6);
        this.mCallback25 = new OnClickListener(this, 22);
        this.mCallback13 = new OnClickListener(this, 10);
        this.mCallback8 = new OnClickListener(this, 5);
        this.mCallback14 = new OnClickListener(this, 11);
        this.mCallback26 = new OnClickListener(this, 23);
        this.mCallback7 = new OnClickListener(this, 4);
        this.mCallback23 = new OnClickListener(this, 20);
        this.mCallback11 = new OnClickListener(this, 8);
        this.mCallback19 = new OnClickListener(this, 16);
        this.mCallback6 = new OnClickListener(this, 3);
        this.mCallback12 = new OnClickListener(this, 9);
        this.mCallback24 = new OnClickListener(this, 21);
        this.mCallback5 = new OnClickListener(this, 2);
        this.mCallback17 = new OnClickListener(this, 14);
        this.mCallback21 = new OnClickListener(this, 18);
        this.mCallback29 = new OnClickListener(this, 26);
        this.mCallback4 = new OnClickListener(this, 1);
        this.mCallback20 = new OnClickListener(this, 17);
        this.mCallback10 = new OnClickListener(this, 7);
        this.mCallback22 = new OnClickListener(this, 19);
        this.mCallback18 = new OnClickListener(this, 15);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 1073741824L;
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
            setParam((VerticalParam) obj);
        } else if (564 == i) {
            setOnClickListener((View.OnClickListener) obj);
        } else if (377 != i) {
            return false;
        } else {
            setHorizontalParam((HorizontalParam) obj);
        }
        return true;
    }

    @Override // com.rigol.scope.databinding.AdapterItemPopupviewVerticalBinding
    public void setParam(VerticalParam verticalParam) {
        updateRegistration(3, verticalParam);
        this.mParam = verticalParam;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(589);
        super.requestRebind();
    }

    @Override // com.rigol.scope.databinding.AdapterItemPopupviewVerticalBinding
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.mOnClickListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        notifyPropertyChanged(564);
        super.requestRebind();
    }

    @Override // com.rigol.scope.databinding.AdapterItemPopupviewVerticalBinding
    public void setHorizontalParam(HorizontalParam horizontalParam) {
        updateRegistration(5, horizontalParam);
        this.mHorizontalParam = horizontalParam;
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        notifyPropertyChanged(377);
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
                            return onChangeHorizontalParam((HorizontalParam) obj, i2);
                        }
                        return onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgChanBwlimitParamBandLimitValue1((MappingObject) obj, i2);
                    }
                    return onChangeParam((VerticalParam) obj, i2);
                }
                return onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgChanCoupParamCouplingValue1((MappingObject) obj, i2);
            }
            return onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgChanUnitParamUnitValue1((MappingObject) obj, i2);
        }
        return onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgChanProbeParamProbeRatioValue1((MappingObject) obj, i2);
    }

    private boolean onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgChanProbeParamProbeRatioValue1(MappingObject mappingObject, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 1;
            }
            return true;
        } else if (i == 904) {
            synchronized (this) {
                this.mDirtyFlags |= 128;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgChanUnitParamUnitValue1(MappingObject mappingObject, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 2;
            }
            return true;
        } else if (i == 904) {
            synchronized (this) {
                this.mDirtyFlags |= 256;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgChanCoupParamCouplingValue1(MappingObject mappingObject, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 4;
            }
            return true;
        } else if (i == 904) {
            synchronized (this) {
                this.mDirtyFlags |= 512;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangeParam(VerticalParam verticalParam, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 8;
            }
            return true;
        } else if (i == 426) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            }
            return true;
        } else if (i == 189) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
            }
            return true;
        } else if (i == 898) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            }
            return true;
        } else if (i == 976) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            }
            return true;
        } else if (i == 470) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE;
            }
            return true;
        } else if (i == 820) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
            }
            return true;
        } else if (i == 660) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
            }
            return true;
        } else if (i == 656) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
            }
            return true;
        } else if (i == 663) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
            }
            return true;
        } else if (i == 659) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
            }
            return true;
        } else if (i == 427) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            }
            return true;
        } else if (i == 439) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
            }
            return true;
        } else if (i == 309) {
            synchronized (this) {
                this.mDirtyFlags |= 4194304;
            }
            return true;
        } else if (i == 767) {
            synchronized (this) {
                this.mDirtyFlags |= 8388608;
            }
            return true;
        } else if (i == 68) {
            synchronized (this) {
                this.mDirtyFlags |= 16777216;
            }
            return true;
        } else if (i == 160) {
            synchronized (this) {
                this.mDirtyFlags |= 33554432;
            }
            return true;
        } else if (i == 640) {
            synchronized (this) {
                this.mDirtyFlags |= 67108864;
            }
            return true;
        } else if (i == 560) {
            synchronized (this) {
                this.mDirtyFlags |= 134217728;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgChanBwlimitParamBandLimitValue1(MappingObject mappingObject, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 16;
            }
            return true;
        } else if (i == 904) {
            synchronized (this) {
                this.mDirtyFlags |= 268435456;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangeHorizontalParam(HorizontalParam horizontalParam, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 32;
            }
            return true;
        } else if (i == 924) {
            synchronized (this) {
                this.mDirtyFlags |= 536870912;
            }
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0276 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0670 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0895  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x097e  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x099c  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x09ab  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x09b8  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x09d6  */
    /* JADX WARN: Removed duplicated region for block: B:476:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0138  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void executeBindings() {
        long j;
        int i;
        float f;
        float f2;
        float f3;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        ServiceEnum.Coupling coupling;
        ServiceEnum.enChanStatus enchanstatus;
        Drawable drawable;
        String str9;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        boolean z6;
        boolean z7;
        int i3;
        int i4;
        boolean z8;
        boolean z9;
        int i5;
        boolean z10;
        float f4;
        boolean z11;
        boolean z12;
        float f5;
        Drawable drawable2;
        boolean z13;
        boolean z14;
        boolean z15;
        int i6;
        String str10;
        Drawable drawable3;
        int i7;
        String str11;
        Drawable drawable4;
        float f6;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        int i8;
        boolean z20;
        boolean z21;
        int i9;
        float f7;
        boolean z22;
        boolean z23;
        float f8;
        Drawable drawable5;
        Drawable drawable6;
        Context context;
        int i10;
        ServiceEnum.HoriTimeMode horiTimeMode;
        Drawable drawable7;
        int i11;
        boolean z24;
        boolean z25;
        int i12;
        String str12;
        ServiceEnum.Coupling coupling2;
        int i13;
        int i14;
        int i15;
        String str13;
        int i16;
        float f9;
        float f10;
        float f11;
        ServiceEnum.enChanStatus enchanstatus2;
        boolean z26;
        boolean z27;
        boolean z28;
        int i17;
        boolean z29;
        float f12;
        long j2;
        int i18;
        boolean z30;
        Drawable drawable8;
        boolean z31;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        boolean z32;
        String str20;
        String str21;
        String str22;
        ServiceEnum.Unit unit;
        int i19;
        boolean z33;
        long j3;
        long j4;
        int i20;
        int i21;
        ServiceEnum.Bandwidth bandwidth;
        int i22;
        long j5;
        ServiceEnum.enChanStatus enchanstatus3;
        float f13;
        float f14;
        boolean z34;
        int i23;
        long j6;
        long j7;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        VerticalParam verticalParam = this.mParam;
        View.OnClickListener onClickListener = this.mOnClickListener;
        HorizontalParam horizontalParam = this.mHorizontalParam;
        int i24 = ((j & 1073741824) > 0L ? 1 : ((j & 1073741824) == 0L ? 0 : -1));
        if (i24 != 0) {
            boolean z35 = ViewUtil.serialize == ServiceEnum.ProductSeries.SERIES_1000.value1;
            if (i24 != 0) {
                j |= z35 ? 4503599627370496L : 2251799813685248L;
            }
            if (!z35) {
                i = 8;
                if ((1610612639 & j) == 0) {
                    boolean fine = ((j & 1077936136) == 0 || verticalParam == null) ? false : verticalParam.getFine();
                    if ((j & 1073749000) != 0) {
                        ServiceEnum.Impedance impedance = verticalParam != null ? verticalParam.getImpedance() : null;
                        int i25 = ((j & 1073742856) > 0L ? 1 : ((j & 1073742856) == 0L ? 0 : -1));
                        if (i25 != 0) {
                            boolean z36 = impedance == ServiceEnum.Impedance.IMP_1M;
                            if (i25 != 0) {
                                j |= z36 ? 274877906944L : 137438953472L;
                            }
                            if (!z36) {
                                i11 = 8;
                                i23 = ((j & 1073746952) > 0L ? 1 : ((j & 1073746952) == 0L ? 0 : -1));
                                if (i23 == 0) {
                                    z25 = impedance != ServiceEnum.Impedance.IMP_50;
                                    if (i23 != 0) {
                                        j = z25 ? j | 18014398509481984L : j | 9007199254740992L;
                                    }
                                } else {
                                    z25 = false;
                                }
                                if ((j & 1073744904) == 0) {
                                    z24 = impedance == ServiceEnum.Impedance.IMP_50;
                                    if ((j & 1073742856) != 0) {
                                        if (z24) {
                                            j6 = j | 4294967296L;
                                            j7 = 281474976710656L;
                                        } else {
                                            j6 = j | 2147483648L;
                                            j7 = 140737488355328L;
                                        }
                                        j = j6 | j7;
                                    }
                                    if ((j & 1073744904) != 0) {
                                        j = z24 ? j | 17179869184L : j | 8589934592L;
                                    }
                                    if ((j & 1073742856) != 0) {
                                        drawable7 = AppCompatResources.getDrawable(this.ivImpedance50.getContext(), z24 ? R.drawable.ic_50_ohm : R.drawable.ic_50_ohm_close);
                                        if (!z24) {
                                            i12 = 8;
                                            if ((j & 1073744396) == 0) {
                                                coupling2 = verticalParam != null ? verticalParam.getCoupling() : null;
                                                MappingObject mappingObject = ViewUtil.getMappingObject(R.array.msg_chan_coup, coupling2 != null ? coupling2.value1 : 0);
                                                updateRegistration(2, mappingObject);
                                                str12 = mappingObject != null ? mappingObject.getStr() : null;
                                                int i26 = ((j & 1073743880) > 0L ? 1 : ((j & 1073743880) == 0L ? 0 : -1));
                                                if (i26 != 0) {
                                                    String str23 = str12;
                                                    boolean z37 = coupling2 != ServiceEnum.Coupling.GND;
                                                    boolean z38 = coupling2 == ServiceEnum.Coupling.GND;
                                                    if (i26 != 0) {
                                                        j |= z37 ? 68719476736L : 34359738368L;
                                                    }
                                                    if ((j & 1073743880) != 0) {
                                                        j |= z38 ? 1099511627776L : 549755813888L;
                                                    }
                                                    i13 = z37 ? 0 : 8;
                                                    i14 = z38 ? 0 : 8;
                                                    str12 = str23;
                                                    boolean showLabel = ((j & 1073774600) != 0 || verticalParam == null) ? false : verticalParam.getShowLabel();
                                                    i15 = ((j & 1074794504) > 0L ? 1 : ((j & 1074794504) == 0L ? 0 : -1));
                                                    if (i15 != 0) {
                                                        if (verticalParam != null) {
                                                            i16 = i13;
                                                            str13 = str12;
                                                            enchanstatus3 = verticalParam.getStatus();
                                                        } else {
                                                            str13 = str12;
                                                            i16 = i13;
                                                            enchanstatus3 = null;
                                                        }
                                                        boolean z39 = enchanstatus3 != ServiceEnum.enChanStatus.CHAN_OFF;
                                                        if (i15 != 0) {
                                                            j = z39 ? j | 17592186044416L : j | 8796093022208L;
                                                        }
                                                        if ((j & 1073745928) != 0) {
                                                            j |= z39 ? 1125899906842624L : 562949953421312L;
                                                        }
                                                        int i27 = ((j & 1073745928) > 0L ? 1 : ((j & 1073745928) == 0L ? 0 : -1));
                                                        if (i27 != 0) {
                                                            z34 = z39 && !ViewUtil.isDoubleChan();
                                                            f13 = ContextUtil.getAlpha(z39);
                                                            f14 = ContextUtil.getAlpha(z34);
                                                        } else {
                                                            f13 = 0.0f;
                                                            f14 = 0.0f;
                                                            z34 = false;
                                                        }
                                                        long j8 = j;
                                                        if (i27 != 0) {
                                                            boolean z40 = !(enchanstatus3 == ServiceEnum.enChanStatus.CHAN_OFF);
                                                            enchanstatus2 = enchanstatus3;
                                                            z26 = z40;
                                                            boolean z41 = z39;
                                                            f9 = ContextUtil.getAlpha(z40);
                                                            j = j8;
                                                            f11 = f14;
                                                            f10 = f13;
                                                            z28 = z34;
                                                            z27 = z41;
                                                        } else {
                                                            enchanstatus2 = enchanstatus3;
                                                            z26 = false;
                                                            f11 = f14;
                                                            f10 = f13;
                                                            z28 = z34;
                                                            z27 = z39;
                                                            f9 = 0.0f;
                                                        }
                                                    } else {
                                                        str13 = str12;
                                                        i16 = i13;
                                                        f9 = 0.0f;
                                                        f10 = 0.0f;
                                                        f11 = 0.0f;
                                                        enchanstatus2 = null;
                                                        z26 = false;
                                                        z27 = false;
                                                        z28 = false;
                                                    }
                                                    i17 = ((j & 1140858888) > 0L ? 1 : ((j & 1140858888) == 0L ? 0 : -1));
                                                    if (i17 != 0 || verticalParam == null) {
                                                        z29 = z26;
                                                        f12 = f9;
                                                        j2 = 0;
                                                    } else {
                                                        z29 = z26;
                                                        f12 = f9;
                                                        j2 = verticalParam.getPosition();
                                                    }
                                                    if ((j & 1107296264) != 0) {
                                                        if (verticalParam != null) {
                                                            i18 = i11;
                                                            z30 = z24;
                                                            j5 = verticalParam.getChanDelay();
                                                        } else {
                                                            i18 = i11;
                                                            z30 = z24;
                                                            j5 = 0;
                                                        }
                                                        drawable8 = drawable7;
                                                        z31 = showLabel;
                                                        str14 = UnitFormat.newBuilder(UnitFormat.SI.FEMTO).convert(j5, ServiceEnum.Unit.Unit_s);
                                                    } else {
                                                        i18 = i11;
                                                        z30 = z24;
                                                        drawable8 = drawable7;
                                                        z31 = showLabel;
                                                        str14 = null;
                                                    }
                                                    int i28 = ((1082138632 & j) > 0L ? 1 : ((1082138632 & j) == 0L ? 0 : -1));
                                                    long scale = (i28 != 0 || verticalParam == null) ? 0L : verticalParam.getScale();
                                                    if ((j & 1358954520) != 0) {
                                                        if (verticalParam != null) {
                                                            str15 = str14;
                                                            bandwidth = verticalParam.getBandLimit();
                                                        } else {
                                                            str15 = str14;
                                                            bandwidth = null;
                                                        }
                                                        if (bandwidth != null) {
                                                            i22 = bandwidth.value1;
                                                            z8 = z25;
                                                        } else {
                                                            z8 = z25;
                                                            i22 = 0;
                                                        }
                                                        MappingObject mappingObject2 = ViewUtil.getMappingObject(R.array.msg_chan_bwlimit, i22);
                                                        updateRegistration(4, mappingObject2);
                                                        if (mappingObject2 != null) {
                                                            str16 = mappingObject2.getStr();
                                                            if ((j & 1074266249) == 0) {
                                                                ServiceEnum.ProbeX probeRatio = verticalParam != null ? verticalParam.getProbeRatio() : null;
                                                                if (probeRatio != null) {
                                                                    i21 = probeRatio.value1;
                                                                    str17 = str16;
                                                                } else {
                                                                    str17 = str16;
                                                                    i21 = 0;
                                                                }
                                                                MappingObject mappingObject3 = ViewUtil.getMappingObject(R.array.msg_chan_probe, i21);
                                                                updateRegistration(0, mappingObject3);
                                                                if (mappingObject3 != null) {
                                                                    str18 = mappingObject3.getStr();
                                                                    if ((j & 1283465482) != 0) {
                                                                        unit = verticalParam != null ? verticalParam.getUnit() : null;
                                                                        if ((j & 1073750282) != 0) {
                                                                            str19 = str18;
                                                                            if (unit != null) {
                                                                                i20 = unit.value1;
                                                                                z32 = fine;
                                                                            } else {
                                                                                z32 = fine;
                                                                                i20 = 0;
                                                                            }
                                                                            MappingObject mappingObject4 = ViewUtil.getMappingObject(R.array.msg_chan_unit, i20);
                                                                            updateRegistration(1, mappingObject4);
                                                                            if (mappingObject4 != null) {
                                                                                str22 = mappingObject4.getStr();
                                                                                str20 = i17 == 0 ? UnitFormat.newBuilder(UnitFormat.SI.NANO).convert(j2, unit) : null;
                                                                                str21 = i28 == 0 ? UnitFormat.newBuilder(UnitFormat.SI.NANO).convert(scale, unit) : null;
                                                                            }
                                                                        } else {
                                                                            str19 = str18;
                                                                            z32 = fine;
                                                                        }
                                                                        str22 = null;
                                                                        if (i17 == 0) {
                                                                        }
                                                                        if (i28 == 0) {
                                                                        }
                                                                    } else {
                                                                        str19 = str18;
                                                                        z32 = fine;
                                                                        str20 = null;
                                                                        str21 = null;
                                                                        str22 = null;
                                                                        unit = null;
                                                                    }
                                                                    i19 = ((1074200584 & j) > 0L ? 1 : ((1074200584 & j) == 0L ? 0 : -1));
                                                                    if (i19 != 0) {
                                                                        z33 = verticalParam != null ? verticalParam.getProbeRatioEnable() : false;
                                                                        if (i19 != 0) {
                                                                            j = z33 ? j | 288230376151711744L : j | 144115188075855872L;
                                                                        }
                                                                    } else {
                                                                        z33 = false;
                                                                    }
                                                                    boolean invert = ((j & 1075838984) != 0 || verticalParam == null) ? false : verticalParam.getInvert();
                                                                    String label = ((j & 1073758216) != 0 || verticalParam == null) ? null : verticalParam.getLabel();
                                                                    if ((j & 1207967752) != 0) {
                                                                        if (verticalParam != null) {
                                                                            long j9 = j;
                                                                            j4 = verticalParam.getOffset();
                                                                            j3 = j9;
                                                                        } else {
                                                                            j3 = j;
                                                                            j4 = 0;
                                                                        }
                                                                        String convert = UnitFormat.newBuilder(UnitFormat.SI.NANO).convert(j4, unit);
                                                                        str9 = str22;
                                                                        i5 = i14;
                                                                        str = str13;
                                                                        z4 = z30;
                                                                        z9 = z31;
                                                                        drawable = drawable8;
                                                                        str2 = str17;
                                                                        str5 = str19;
                                                                        str4 = str21;
                                                                        z5 = z33;
                                                                        z = z29;
                                                                        f2 = f12;
                                                                        i4 = i18;
                                                                        i3 = i12;
                                                                        enchanstatus = enchanstatus2;
                                                                        z7 = z27;
                                                                        str3 = str15;
                                                                        str6 = str20;
                                                                        i2 = i16;
                                                                        f = f11;
                                                                        str7 = convert;
                                                                        coupling = coupling2;
                                                                        f3 = f10;
                                                                        j = j3;
                                                                    } else {
                                                                        str9 = str22;
                                                                        i5 = i14;
                                                                        str = str13;
                                                                        z4 = z30;
                                                                        z9 = z31;
                                                                        drawable = drawable8;
                                                                        str2 = str17;
                                                                        str5 = str19;
                                                                        str4 = str21;
                                                                        z5 = z33;
                                                                        z = z29;
                                                                        f2 = f12;
                                                                        i4 = i18;
                                                                        i3 = i12;
                                                                        enchanstatus = enchanstatus2;
                                                                        z7 = z27;
                                                                        str3 = str15;
                                                                        str6 = str20;
                                                                        i2 = i16;
                                                                        f = f11;
                                                                        coupling = coupling2;
                                                                        str7 = null;
                                                                        f3 = f10;
                                                                    }
                                                                    z6 = invert;
                                                                    z2 = z28;
                                                                    str8 = label;
                                                                    z3 = z32;
                                                                }
                                                            } else {
                                                                str17 = str16;
                                                            }
                                                            str18 = null;
                                                            if ((j & 1283465482) != 0) {
                                                            }
                                                            i19 = ((1074200584 & j) > 0L ? 1 : ((1074200584 & j) == 0L ? 0 : -1));
                                                            if (i19 != 0) {
                                                            }
                                                            if ((j & 1075838984) != 0) {
                                                            }
                                                            if ((j & 1073758216) != 0) {
                                                            }
                                                            if ((j & 1207967752) != 0) {
                                                            }
                                                            z6 = invert;
                                                            z2 = z28;
                                                            str8 = label;
                                                            z3 = z32;
                                                        }
                                                    } else {
                                                        str15 = str14;
                                                        z8 = z25;
                                                    }
                                                    str16 = null;
                                                    if ((j & 1074266249) == 0) {
                                                    }
                                                    str18 = null;
                                                    if ((j & 1283465482) != 0) {
                                                    }
                                                    i19 = ((1074200584 & j) > 0L ? 1 : ((1074200584 & j) == 0L ? 0 : -1));
                                                    if (i19 != 0) {
                                                    }
                                                    if ((j & 1075838984) != 0) {
                                                    }
                                                    if ((j & 1073758216) != 0) {
                                                    }
                                                    if ((j & 1207967752) != 0) {
                                                    }
                                                    z6 = invert;
                                                    z2 = z28;
                                                    str8 = label;
                                                    z3 = z32;
                                                }
                                            } else {
                                                str12 = null;
                                                coupling2 = null;
                                            }
                                            i13 = 0;
                                            i14 = 0;
                                            if ((j & 1073774600) != 0) {
                                            }
                                            i15 = ((j & 1074794504) > 0L ? 1 : ((j & 1074794504) == 0L ? 0 : -1));
                                            if (i15 != 0) {
                                            }
                                            i17 = ((j & 1140858888) > 0L ? 1 : ((j & 1140858888) == 0L ? 0 : -1));
                                            if (i17 != 0) {
                                            }
                                            z29 = z26;
                                            f12 = f9;
                                            j2 = 0;
                                            if ((j & 1107296264) != 0) {
                                            }
                                            int i282 = ((1082138632 & j) > 0L ? 1 : ((1082138632 & j) == 0L ? 0 : -1));
                                            if (i282 != 0) {
                                            }
                                            if ((j & 1358954520) != 0) {
                                            }
                                            str16 = null;
                                            if ((j & 1074266249) == 0) {
                                            }
                                            str18 = null;
                                            if ((j & 1283465482) != 0) {
                                            }
                                            i19 = ((1074200584 & j) > 0L ? 1 : ((1074200584 & j) == 0L ? 0 : -1));
                                            if (i19 != 0) {
                                            }
                                            if ((j & 1075838984) != 0) {
                                            }
                                            if ((j & 1073758216) != 0) {
                                            }
                                            if ((j & 1207967752) != 0) {
                                            }
                                            z6 = invert;
                                            z2 = z28;
                                            str8 = label;
                                            z3 = z32;
                                        }
                                    } else {
                                        drawable7 = null;
                                    }
                                } else {
                                    drawable7 = null;
                                    z24 = false;
                                }
                            }
                        }
                        i11 = 0;
                        i23 = ((j & 1073746952) > 0L ? 1 : ((j & 1073746952) == 0L ? 0 : -1));
                        if (i23 == 0) {
                        }
                        if ((j & 1073744904) == 0) {
                        }
                    } else {
                        drawable7 = null;
                        i11 = 0;
                        z24 = false;
                        z25 = false;
                    }
                    i12 = 0;
                    if ((j & 1073744396) == 0) {
                    }
                    i13 = 0;
                    i14 = 0;
                    if ((j & 1073774600) != 0) {
                    }
                    i15 = ((j & 1074794504) > 0L ? 1 : ((j & 1074794504) == 0L ? 0 : -1));
                    if (i15 != 0) {
                    }
                    i17 = ((j & 1140858888) > 0L ? 1 : ((j & 1140858888) == 0L ? 0 : -1));
                    if (i17 != 0) {
                    }
                    z29 = z26;
                    f12 = f9;
                    j2 = 0;
                    if ((j & 1107296264) != 0) {
                    }
                    int i2822 = ((1082138632 & j) > 0L ? 1 : ((1082138632 & j) == 0L ? 0 : -1));
                    if (i2822 != 0) {
                    }
                    if ((j & 1358954520) != 0) {
                    }
                    str16 = null;
                    if ((j & 1074266249) == 0) {
                    }
                    str18 = null;
                    if ((j & 1283465482) != 0) {
                    }
                    i19 = ((1074200584 & j) > 0L ? 1 : ((1074200584 & j) == 0L ? 0 : -1));
                    if (i19 != 0) {
                    }
                    if ((j & 1075838984) != 0) {
                    }
                    if ((j & 1073758216) != 0) {
                    }
                    if ((j & 1207967752) != 0) {
                    }
                    z6 = invert;
                    z2 = z28;
                    str8 = label;
                    z3 = z32;
                } else {
                    f = 0.0f;
                    f2 = 0.0f;
                    f3 = 0.0f;
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                    str8 = null;
                    coupling = null;
                    enchanstatus = null;
                    drawable = null;
                    str9 = null;
                    z = false;
                    z2 = false;
                    z3 = false;
                    z4 = false;
                    z5 = false;
                    i2 = 0;
                    z6 = false;
                    z7 = false;
                    i3 = 0;
                    i4 = 0;
                    z8 = false;
                    z9 = false;
                    i5 = 0;
                }
                if ((j & 1610612768) == 0) {
                    if (horizontalParam != null) {
                        horiTimeMode = horizontalParam.getTimeMode();
                        z10 = z3;
                    } else {
                        z10 = z3;
                        horiTimeMode = null;
                    }
                    z11 = horiTimeMode != ServiceEnum.HoriTimeMode.Horizontal_ROLL;
                    f4 = ContextUtil.getAlpha(z11);
                } else {
                    z10 = z3;
                    f4 = 0.0f;
                    z11 = false;
                }
                if ((j & 306244783251128320L) == 0) {
                    int i29 = ((j & 8589934592L) > 0L ? 1 : ((j & 8589934592L) == 0L ? 0 : -1));
                    if (i29 != 0) {
                        if (verticalParam != null) {
                            coupling = verticalParam.getCoupling();
                        }
                        z12 = z11;
                        ServiceEnum.Coupling coupling3 = coupling;
                        f5 = f4;
                        boolean z42 = coupling3 == ServiceEnum.Coupling.AC;
                        if (i29 != 0) {
                            j |= z42 ? 72057594037927936L : 36028797018963968L;
                        }
                        if (z42) {
                            context = this.ivImpedance1.getContext();
                            i10 = R.drawable.ic_1m_ohm_ac;
                        } else {
                            context = this.ivImpedance1.getContext();
                            i10 = R.drawable.ic_1m_ohm_dc;
                        }
                        drawable5 = AppCompatResources.getDrawable(context, i10);
                    } else {
                        z12 = z11;
                        f5 = f4;
                        drawable5 = null;
                    }
                    if ((j & 18014398509481984L) != 0) {
                        if (verticalParam != null) {
                            enchanstatus = verticalParam.getStatus();
                        }
                        drawable6 = drawable5;
                        boolean z43 = enchanstatus != ServiceEnum.enChanStatus.CHAN_OFF;
                        if ((j & 1074794504) != 0) {
                            j = z43 ? j | 17592186044416L : j | 8796093022208L;
                        }
                        if ((j & 1073745928) != 0) {
                            j |= z43 ? 1125899906842624L : 562949953421312L;
                        }
                        z7 = z43;
                    } else {
                        drawable6 = drawable5;
                    }
                    if ((j & 288230376151711744L) != 0) {
                        boolean probeInsert = verticalParam != null ? verticalParam.getProbeInsert() : false;
                        if ((j & 2199023255552L) != 0) {
                            j |= probeInsert ? 70368744177664L : 35184372088832L;
                        }
                        boolean z44 = !probeInsert;
                        if ((j & 288230376151711744L) != 0) {
                            j = z44 ? j | 4398046511104L : j | 2199023255552L;
                        }
                        drawable2 = drawable6;
                        z15 = z44;
                        z14 = probeInsert;
                        z13 = z7;
                        i6 = ((j & 1073744904) > 0L ? 1 : ((j & 1073744904) == 0L ? 0 : -1));
                        boolean z45 = z4;
                        if (i6 != 0) {
                            if (z4) {
                                str10 = str3;
                                drawable2 = AppCompatResources.getDrawable(this.ivImpedance1.getContext(), R.drawable.ic_1m_ohm_dc_close);
                            } else {
                                str10 = str3;
                            }
                            drawable3 = drawable2;
                        } else {
                            str10 = str3;
                            drawable3 = null;
                        }
                        i7 = ((j & 1073746952) > 0L ? 1 : ((j & 1073746952) == 0L ? 0 : -1));
                        if (i7 != 0) {
                            boolean z46 = z8 ? z13 : false;
                            str11 = str;
                            f6 = ContextUtil.getAlpha(z46);
                            boolean z47 = z46;
                            drawable4 = drawable3;
                            z16 = z47;
                        } else {
                            str11 = str;
                            drawable4 = drawable3;
                            f6 = 0.0f;
                            z16 = false;
                        }
                        if ((j & 87960930222080L) != 0) {
                            z19 = ((j & 17592186044416L) == 0 || verticalParam == null) ? false : verticalParam.getImpedanceEnable();
                            if ((j & 70368744177664L) != 0) {
                                z17 = z16;
                                if ((verticalParam != null ? verticalParam.getProbeType() : null) != ServiceEnum.ProbeType.Probe_BNC) {
                                    z18 = true;
                                }
                            } else {
                                z17 = z16;
                            }
                            z18 = false;
                        } else {
                            z17 = z16;
                            z18 = false;
                            z19 = false;
                        }
                        i8 = ((j & 1074794504) > 0L ? 1 : ((j & 1074794504) == 0L ? 0 : -1));
                        if (i8 != 0) {
                            if (!z13) {
                                z19 = false;
                            }
                            boolean z48 = z19;
                            z20 = z18;
                            z21 = z48;
                        } else {
                            z20 = z18;
                            z21 = false;
                        }
                        boolean z49 = (j & 288230376151711744L) != 0 ? z15 ? true : ((j & 2199023255552L) == 0 && z14) ? false : false : false;
                        i9 = ((j & 1074200584) > 0L ? 1 : ((j & 1074200584) == 0L ? 0 : -1));
                        if (i9 != 0) {
                            boolean z50 = z5 ? z49 : false;
                            f7 = ContextUtil.getAlpha(z50);
                            z22 = z50;
                        } else {
                            f7 = 0.0f;
                            z22 = false;
                        }
                        if ((j & 1073741824) != 0) {
                            f8 = f7;
                            z23 = z21;
                            this.acButton.setOnClickListener(this.mCallback7);
                            this.acquireBtn.setOnClickListener(this.mCallback14);
                            this.bandwidthLimitSpinner.setOnClickListener(this.mCallback20);
                            this.couplingSpinner.setOnClickListener(this.mCallback16);
                            this.delayEditText.setOnClickListener(this.mCallback21);
                            this.gudButton.setOnClickListener(this.mCallback6);
                            this.impedance.setVisibility(i);
                            this.impedanceSwitch.setVisibility(i);
                            this.ivImpedance1.setOnClickListener(this.mCallback5);
                            this.ivImpedance50.setOnClickListener(this.mCallback4);
                            this.ivLineImpedance1.setOnClickListener(this.mCallback9);
                            this.ivLineImpedance50.setOnClickListener(this.mCallback8);
                            this.labelEditText.setOnClickListener(this.mCallback11);
                            this.mboundView35.setOnClickListener(this.mCallback22);
                            this.mboundView39.setOnClickListener(this.mCallback26);
                            this.measureBtn.setOnClickListener(this.mCallback15);
                            this.offsetEditText.setOnClickListener(this.mCallback27);
                            this.offsetLeft.setOnClickListener(this.mCallback28);
                            this.offsetRight.setOnClickListener(this.mCallback29);
                            this.positionEditText.setOnClickListener(this.mCallback23);
                            this.positionLeft.setOnClickListener(this.mCallback24);
                            this.positionRight.setOnClickListener(this.mCallback25);
                            this.probeSettingBtn.setOnClickListener(this.mCallback12);
                            this.scaleEditText.setOnClickListener(this.mCallback17);
                            this.scaleLeft.setOnClickListener(this.mCallback18);
                            this.scaleRight.setOnClickListener(this.mCallback19);
                            this.triggerBtn.setOnClickListener(this.mCallback13);
                            this.unitSpinner.setOnClickListener(this.mCallback10);
                        } else {
                            z23 = z21;
                            f8 = f7;
                        }
                        if ((j & 1073745928) != 0) {
                            if (getBuildSdkInt() >= 11) {
                                this.bandwidthLimitSpinner.setAlpha(f2);
                                this.delayEditText.setAlpha(f3);
                                this.fineSwitch.setAlpha(f3);
                                this.impedance.setAlpha(f);
                                this.impedanceSwitch.setAlpha(f);
                                this.invertSwitch.setAlpha(f3);
                                this.labelEditText.setAlpha(f3);
                                this.labelSwitch.setAlpha(f3);
                                this.mboundView10.setAlpha(f3);
                                this.mboundView13.setAlpha(f3);
                                this.mboundView23.setAlpha(f3);
                                this.mboundView25.setAlpha(f3);
                                this.mboundView27.setAlpha(f3);
                                this.mboundView31.setAlpha(f2);
                                this.mboundView33.setAlpha(f3);
                                this.mboundView35.setAlpha(f3);
                                this.mboundView39.setAlpha(f3);
                                this.offsetEditText.setAlpha(f3);
                                this.offsetLeft.setAlpha(f3);
                                this.offsetRight.setAlpha(f3);
                                this.positionEditText.setAlpha(f3);
                                this.positionLeft.setAlpha(f3);
                                this.positionRight.setAlpha(f3);
                                this.scaleEditText.setAlpha(f3);
                                this.scaleLeft.setAlpha(f3);
                                this.scaleRight.setAlpha(f3);
                                this.unitSpinner.setAlpha(f3);
                            }
                            this.bandwidthLimitSpinner.setEnabled(z);
                            this.delayEditText.setEnabled(z13);
                            CompoundButtonBindingAdapter.setChecked(this.displaySwitch, z13);
                            this.fineSwitch.setEnabled(z13);
                            this.impedanceSwitch.setEnabled(z2);
                            this.invertSwitch.setEnabled(z13);
                            this.labelEditText.setEnabled(z13);
                            this.labelSwitch.setEnabled(z13);
                            this.mboundView10.setEnabled(z13);
                            this.mboundView13.setEnabled(z13);
                            this.mboundView23.setEnabled(z13);
                            this.mboundView25.setEnabled(z13);
                            this.mboundView27.setEnabled(z13);
                            this.mboundView31.setEnabled(z);
                            this.mboundView35.setEnabled(z13);
                            this.mboundView39.setEnabled(z13);
                            this.offsetEditText.setEnabled(z13);
                            this.offsetLeft.setEnabled(z13);
                            this.offsetRight.setEnabled(z13);
                            this.positionEditText.setEnabled(z13);
                            this.positionLeft.setEnabled(z13);
                            this.positionRight.setEnabled(z13);
                            this.scaleEditText.setEnabled(z13);
                            this.scaleLeft.setEnabled(z13);
                            this.scaleRight.setEnabled(z13);
                            this.unitSpinner.setEnabled(z13);
                        }
                        if ((1358954520 & j) != 0) {
                            TextViewBindingAdapter.setText(this.bandwidthLimitSpinner, str2);
                        }
                        if (i7 != 0) {
                            if (getBuildSdkInt() >= 11) {
                                this.couplingSpinner.setAlpha(f6);
                                this.mboundView19.setAlpha(f6);
                            }
                            boolean z51 = z17;
                            this.couplingSpinner.setEnabled(z51);
                            this.mboundView19.setEnabled(z51);
                        }
                        if ((j & 1073744396) != 0) {
                            TextViewBindingAdapter.setText(this.couplingSpinner, str11);
                        }
                        if ((1107296264 & j) != 0) {
                            TextViewBindingAdapter.setText(this.delayEditText, str10);
                        }
                        if ((j & 1077936136) != 0) {
                            CompoundButtonBindingAdapter.setChecked(this.fineSwitch, z10);
                        }
                        if (i8 != 0) {
                            this.impedance.setEnabled(z23);
                        }
                        if ((j & 1073742856) != 0) {
                            CompoundButtonBindingAdapter.setChecked(this.impedanceSwitch, z45);
                            ImageViewBindingAdapter.setImageDrawable(this.ivImpedance50, drawable);
                            this.ivLineImpedance1.setVisibility(i4);
                            this.ivLineImpedance50.setVisibility(i3);
                        }
                        if ((1075838984 & j) != 0) {
                            CompoundButtonBindingAdapter.setChecked(this.invertSwitch, z6);
                        }
                        if (i6 != 0) {
                            ImageViewBindingAdapter.setImageDrawable(this.ivImpedance1, drawable4);
                        }
                        if ((1073758216 & j) != 0) {
                            TextViewBindingAdapter.setText(this.labelEditText, str8);
                        }
                        if ((1073774600 & j) != 0) {
                            CompoundButtonBindingAdapter.setChecked(this.labelSwitch, z9);
                        }
                        if ((j & 1073743880) != 0) {
                            this.mboundView3.setVisibility(i2);
                            this.mboundView4.setVisibility(i5);
                        }
                        if ((1207967752 & j) != 0) {
                            TextViewBindingAdapter.setText(this.offsetEditText, str7);
                        }
                        if ((1140858888 & j) != 0) {
                            TextViewBindingAdapter.setText(this.positionEditText, str6);
                        }
                        if (i9 != 0) {
                            if (getBuildSdkInt() >= 11) {
                                this.probeSettingBtn.setAlpha(f8);
                            }
                            this.probeSettingBtn.setEnabled(z22);
                        }
                        if ((1074266249 & j) != 0) {
                            TextViewBindingAdapter.setText(this.probeSettingBtn, str5);
                        }
                        if ((1082138632 & j) != 0) {
                            TextViewBindingAdapter.setText(this.scaleEditText, str4);
                        }
                        if ((j & 1610612768) != 0) {
                            if (getBuildSdkInt() >= 11) {
                                this.triggerBtn.setAlpha(f5);
                            }
                            this.triggerBtn.setEnabled(z12);
                        }
                        if ((j & 1073750282) != 0) {
                            TextViewBindingAdapter.setText(this.unitSpinner, str9);
                            return;
                        }
                        return;
                    }
                    drawable2 = drawable6;
                } else {
                    z12 = z11;
                    f5 = f4;
                    drawable2 = null;
                }
                z13 = z7;
                z14 = false;
                z15 = false;
                i6 = ((j & 1073744904) > 0L ? 1 : ((j & 1073744904) == 0L ? 0 : -1));
                boolean z452 = z4;
                if (i6 != 0) {
                }
                i7 = ((j & 1073746952) > 0L ? 1 : ((j & 1073746952) == 0L ? 0 : -1));
                if (i7 != 0) {
                }
                if ((j & 87960930222080L) != 0) {
                }
                i8 = ((j & 1074794504) > 0L ? 1 : ((j & 1074794504) == 0L ? 0 : -1));
                if (i8 != 0) {
                }
                if ((j & 288230376151711744L) != 0) {
                }
                i9 = ((j & 1074200584) > 0L ? 1 : ((j & 1074200584) == 0L ? 0 : -1));
                if (i9 != 0) {
                }
                if ((j & 1073741824) != 0) {
                }
                if ((j & 1073745928) != 0) {
                }
                if ((1358954520 & j) != 0) {
                }
                if (i7 != 0) {
                }
                if ((j & 1073744396) != 0) {
                }
                if ((1107296264 & j) != 0) {
                }
                if ((j & 1077936136) != 0) {
                }
                if (i8 != 0) {
                }
                if ((j & 1073742856) != 0) {
                }
                if ((1075838984 & j) != 0) {
                }
                if (i6 != 0) {
                }
                if ((1073758216 & j) != 0) {
                }
                if ((1073774600 & j) != 0) {
                }
                if ((j & 1073743880) != 0) {
                }
                if ((1207967752 & j) != 0) {
                }
                if ((1140858888 & j) != 0) {
                }
                if (i9 != 0) {
                }
                if ((1074266249 & j) != 0) {
                }
                if ((1082138632 & j) != 0) {
                }
                if ((j & 1610612768) != 0) {
                }
                if ((j & 1073750282) != 0) {
                }
            }
        }
        i = 0;
        if ((1610612639 & j) == 0) {
        }
        if ((j & 1610612768) == 0) {
        }
        if ((j & 306244783251128320L) == 0) {
        }
        z13 = z7;
        z14 = false;
        z15 = false;
        i6 = ((j & 1073744904) > 0L ? 1 : ((j & 1073744904) == 0L ? 0 : -1));
        boolean z4522 = z4;
        if (i6 != 0) {
        }
        i7 = ((j & 1073746952) > 0L ? 1 : ((j & 1073746952) == 0L ? 0 : -1));
        if (i7 != 0) {
        }
        if ((j & 87960930222080L) != 0) {
        }
        i8 = ((j & 1074794504) > 0L ? 1 : ((j & 1074794504) == 0L ? 0 : -1));
        if (i8 != 0) {
        }
        if ((j & 288230376151711744L) != 0) {
        }
        i9 = ((j & 1074200584) > 0L ? 1 : ((j & 1074200584) == 0L ? 0 : -1));
        if (i9 != 0) {
        }
        if ((j & 1073741824) != 0) {
        }
        if ((j & 1073745928) != 0) {
        }
        if ((1358954520 & j) != 0) {
        }
        if (i7 != 0) {
        }
        if ((j & 1073744396) != 0) {
        }
        if ((1107296264 & j) != 0) {
        }
        if ((j & 1077936136) != 0) {
        }
        if (i8 != 0) {
        }
        if ((j & 1073742856) != 0) {
        }
        if ((1075838984 & j) != 0) {
        }
        if (i6 != 0) {
        }
        if ((1073758216 & j) != 0) {
        }
        if ((1073774600 & j) != 0) {
        }
        if ((j & 1073743880) != 0) {
        }
        if ((1207967752 & j) != 0) {
        }
        if ((1140858888 & j) != 0) {
        }
        if (i9 != 0) {
        }
        if ((1074266249 & j) != 0) {
        }
        if ((1082138632 & j) != 0) {
        }
        if ((j & 1610612768) != 0) {
        }
        if ((j & 1073750282) != 0) {
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
            case 10:
                View.OnClickListener onClickListener10 = this.mOnClickListener;
                if (onClickListener10 != null) {
                    onClickListener10.onClick(view);
                    return;
                }
                return;
            case 11:
                View.OnClickListener onClickListener11 = this.mOnClickListener;
                if (onClickListener11 != null) {
                    onClickListener11.onClick(view);
                    return;
                }
                return;
            case 12:
                View.OnClickListener onClickListener12 = this.mOnClickListener;
                if (onClickListener12 != null) {
                    onClickListener12.onClick(view);
                    return;
                }
                return;
            case 13:
                View.OnClickListener onClickListener13 = this.mOnClickListener;
                if (onClickListener13 != null) {
                    onClickListener13.onClick(view);
                    return;
                }
                return;
            case 14:
                View.OnClickListener onClickListener14 = this.mOnClickListener;
                if (onClickListener14 != null) {
                    onClickListener14.onClick(view);
                    return;
                }
                return;
            case 15:
                View.OnClickListener onClickListener15 = this.mOnClickListener;
                if (onClickListener15 != null) {
                    onClickListener15.onClick(view);
                    return;
                }
                return;
            case 16:
                View.OnClickListener onClickListener16 = this.mOnClickListener;
                if (onClickListener16 != null) {
                    onClickListener16.onClick(view);
                    return;
                }
                return;
            case 17:
                View.OnClickListener onClickListener17 = this.mOnClickListener;
                if (onClickListener17 != null) {
                    onClickListener17.onClick(view);
                    return;
                }
                return;
            case 18:
                View.OnClickListener onClickListener18 = this.mOnClickListener;
                if (onClickListener18 != null) {
                    onClickListener18.onClick(view);
                    return;
                }
                return;
            case 19:
                View.OnClickListener onClickListener19 = this.mOnClickListener;
                if (onClickListener19 != null) {
                    onClickListener19.onClick(view);
                    return;
                }
                return;
            case 20:
                View.OnClickListener onClickListener20 = this.mOnClickListener;
                if (onClickListener20 != null) {
                    onClickListener20.onClick(view);
                    return;
                }
                return;
            case 21:
                View.OnClickListener onClickListener21 = this.mOnClickListener;
                if (onClickListener21 != null) {
                    onClickListener21.onClick(view);
                    return;
                }
                return;
            case 22:
                View.OnClickListener onClickListener22 = this.mOnClickListener;
                if (onClickListener22 != null) {
                    onClickListener22.onClick(view);
                    return;
                }
                return;
            case 23:
                View.OnClickListener onClickListener23 = this.mOnClickListener;
                if (onClickListener23 != null) {
                    onClickListener23.onClick(view);
                    return;
                }
                return;
            case 24:
                View.OnClickListener onClickListener24 = this.mOnClickListener;
                if (onClickListener24 != null) {
                    onClickListener24.onClick(view);
                    return;
                }
                return;
            case 25:
                View.OnClickListener onClickListener25 = this.mOnClickListener;
                if (onClickListener25 != null) {
                    onClickListener25.onClick(view);
                    return;
                }
                return;
            case 26:
                View.OnClickListener onClickListener26 = this.mOnClickListener;
                if (onClickListener26 != null) {
                    onClickListener26.onClick(view);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
