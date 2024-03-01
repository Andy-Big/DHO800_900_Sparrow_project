package com.rigol.scope.databinding;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.rigol.scope.R;
import com.rigol.scope.data.HorizontalParam;
import com.rigol.scope.data.MappingObject;
import com.rigol.scope.data.VerticalParam;
import com.rigol.scope.generated.callback.OnClickListener;
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
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            Method dump skipped, instructions count: 2529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rigol.scope.databinding.AdapterItemPopupviewVerticalBindingImpl.executeBindings():void");
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
