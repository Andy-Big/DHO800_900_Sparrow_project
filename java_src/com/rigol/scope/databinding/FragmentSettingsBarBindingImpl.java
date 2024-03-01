package com.rigol.scope.databinding;

import android.graphics.drawable.Drawable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.rigol.scope.R;
import com.rigol.scope.cil.ServiceEnum;
import com.rigol.scope.data.AfgParam;
import com.rigol.scope.data.LaParam;
import com.rigol.scope.data.MappingObject;
import com.rigol.scope.data.SharedParam;
import com.rigol.scope.data.UtilityParam;
import com.rigol.scope.utilities.ColorUtil;
import com.rigol.scope.utilities.ContextUtil;
import com.rigol.scope.utilities.DrawView1;
import com.rigol.scope.utilities.MRefreshHeader;
import com.rigol.scope.utilities.UnitFormat;
import com.rigol.scope.utilities.ViewUtil;
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

    /* JADX WARN: Code restructure failed: missing block: B:254:0x041b, code lost:
        if (r21 != false) goto L201;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:318:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0116  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void executeBindings() {
        long j;
        String str;
        String str2;
        Drawable drawable;
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        String str3;
        int i8;
        int i9;
        Drawable drawable2;
        Drawable drawable3;
        String str4;
        String str5;
        int i10;
        int i11;
        int i12;
        boolean z2;
        int i13;
        Drawable drawable4;
        int i14;
        int i15;
        boolean z3;
        int i16;
        int i17;
        int i18;
        Drawable drawable5;
        String str6;
        String str7;
        String str8;
        String str9;
        boolean z4;
        int i19;
        Drawable drawable6;
        long j2;
        int color;
        long j3;
        long j4;
        long j5;
        int i20;
        boolean z5;
        String str10;
        long j6;
        long j7;
        int i21;
        int i22;
        int i23;
        long j8;
        long j9;
        int i24;
        int i25;
        long j10;
        long j11;
        boolean z6;
        synchronized (this) {
            j = this.mDirtyFlags + 2;
            this.mDirtyFlags = 0L;
        }
        UtilityParam utilityParam = this.mUtilityParam;
        LaParam laParam = this.mLaParam;
        ObservableBoolean observableBoolean = this.mHasUpdate;
        SharedParam sharedParam = this.mSharedParam;
        AfgParam afgParam = this.mAfgParam;
        if ((526210 & j) != 0) {
            str2 = ((j & 524546) == 0 || utilityParam == null) ? null : utilityParam.getTime();
            int i26 = ((j & 524802) > 0L ? 1 : ((j & 524802) == 0L ? 0 : -1));
            if (i26 != 0) {
                if (utilityParam != null) {
                    utilityParam.getShowTime();
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (i26 != 0) {
                    j |= z6 ? 2147483648L : 1073741824L;
                }
                if (!z6) {
                    i2 = 8;
                    i24 = ((j & 524418) > 0L ? 1 : ((j & 524418) == 0L ? 0 : -1));
                    if (i24 == 0) {
                        boolean beeper = utilityParam != null ? utilityParam.getBeeper() : false;
                        if (i24 != 0) {
                            j |= beeper ? 8388608L : 4194304L;
                        }
                        drawable = beeper ? AppCompatResources.getDrawable(this.beeper.getContext(), R.drawable.beeper_on) : AppCompatResources.getDrawable(this.beeper.getContext(), R.drawable.beeper_off);
                    } else {
                        drawable = null;
                    }
                    i25 = ((j & 524290) > 0L ? 1 : ((j & 524290) == 0L ? 0 : -1));
                    if (i25 == 0) {
                        boolean z7 = (utilityParam != null ? utilityParam.getSeries() : 0) == 800;
                        if (i25 != 0) {
                            if (z7) {
                                j10 = j | 134217728;
                                j11 = 34359738368L;
                            } else {
                                j10 = j | 67108864;
                                j11 = 17179869184L;
                            }
                            j = j10 | j11;
                        }
                        boolean checkModelEDU = z7 ? ViewUtil.checkModelEDU() : false;
                        boolean checkModel = z7 ? true : ViewUtil.checkModel();
                        if ((j & 524290) != 0) {
                            j |= checkModelEDU ? 33554432L : 16777216L;
                        }
                        if ((j & 524290) != 0) {
                            j |= checkModel ? 137438953472L : 68719476736L;
                        }
                        i3 = checkModelEDU ? 8 : 0;
                        i = checkModel ? 8 : 0;
                    } else {
                        i = 0;
                        i3 = 0;
                    }
                    str = ((j & 525314) != 0 || utilityParam == null) ? null : utilityParam.getDate();
                }
            }
            i2 = 0;
            i24 = ((j & 524418) > 0L ? 1 : ((j & 524418) == 0L ? 0 : -1));
            if (i24 == 0) {
            }
            i25 = ((j & 524290) > 0L ? 1 : ((j & 524290) == 0L ? 0 : -1));
            if (i25 == 0) {
            }
            if ((j & 525314) != 0) {
            }
        } else {
            str = null;
            str2 = null;
            drawable = null;
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        int i27 = ((j & 526340) > 0L ? 1 : ((j & 526340) == 0L ? 0 : -1));
        if (i27 != 0) {
            z = laParam != null ? laParam.getLaEnable() : false;
            if (i27 != 0) {
                if (z) {
                    j8 = j | 8796093022208L;
                    j9 = 562949953421312L;
                } else {
                    j8 = j | 4398046511104L;
                    j9 = 281474976710656L;
                }
                j = j8 | j9;
            }
        } else {
            z = false;
        }
        int i28 = ((j & 524296) > 0L ? 1 : ((j & 524296) == 0L ? 0 : -1));
        if (i28 != 0) {
            boolean z8 = observableBoolean != null ? observableBoolean.get() : false;
            if (i28 != 0) {
                j |= z8 ? 2199023255552L : 1099511627776L;
            }
            if (!z8) {
                i4 = 8;
                if ((j & 552976) == 0) {
                    int i29 = ((j & 528400) > 0L ? 1 : ((j & 528400) == 0L ? 0 : -1));
                    if (i29 != 0) {
                        boolean showUsb = sharedParam != null ? sharedParam.getShowUsb() : false;
                        if (i29 != 0) {
                            j |= showUsb ? 9007199254740992L : 4503599627370496L;
                        }
                        if (!showUsb) {
                            i6 = 8;
                            i21 = ((j & 540688) > 0L ? 1 : ((j & 540688) == 0L ? 0 : -1));
                            if (i21 != 0) {
                                boolean showRMT = sharedParam != null ? sharedParam.getShowRMT() : false;
                                if (i21 != 0) {
                                    j |= showRMT ? 140737488355328L : 70368744177664L;
                                }
                                if (!showRMT) {
                                    i22 = 8;
                                    i23 = ((j & 532496) > 0L ? 1 : ((j & 532496) == 0L ? 0 : -1));
                                    if (i23 != 0) {
                                        boolean showNetwork = sharedParam != null ? sharedParam.getShowNetwork() : false;
                                        if (i23 != 0) {
                                            j |= showNetwork ? PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                                        }
                                        i5 = showNetwork ? 0 : 8;
                                        i7 = i22;
                                    } else {
                                        i7 = i22;
                                        i5 = 0;
                                    }
                                }
                            }
                            i22 = 0;
                            i23 = ((j & 532496) > 0L ? 1 : ((j & 532496) == 0L ? 0 : -1));
                            if (i23 != 0) {
                            }
                        }
                    }
                    i6 = 0;
                    i21 = ((j & 540688) > 0L ? 1 : ((j & 540688) == 0L ? 0 : -1));
                    if (i21 != 0) {
                    }
                    i22 = 0;
                    i23 = ((j & 532496) > 0L ? 1 : ((j & 532496) == 0L ? 0 : -1));
                    if (i23 != 0) {
                    }
                } else {
                    i5 = 0;
                    i6 = 0;
                    i7 = 0;
                }
                if ((j & 1015905) == 0) {
                    if ((j & 786464) != 0) {
                        if (afgParam != null) {
                            j7 = afgParam.getBasic_freq();
                            i8 = i6;
                        } else {
                            i8 = i6;
                            j7 = 0;
                        }
                        str3 = str2;
                        str7 = ViewUtil.subNumber(UnitFormat.newBuilder("0.##########", UnitFormat.SI.MICRO).convert(j7) + ServiceEnum.Unit.Unit_hz.value2, 6);
                    } else {
                        str3 = str2;
                        i8 = i6;
                        str7 = null;
                    }
                    if ((j & 655392) != 0) {
                        if (afgParam != null) {
                            str10 = str7;
                            j6 = afgParam.getBasic_amp();
                        } else {
                            str10 = str7;
                            j6 = 0;
                        }
                        str8 = str10;
                        str9 = UnitFormat.newBuilder(UnitFormat.SI.NANO).convert(j6, ServiceEnum.Unit.Unit_V);
                    } else {
                        str8 = str7;
                        str9 = null;
                    }
                    if ((j & 589921) != 0) {
                        int wave_function = afgParam != null ? afgParam.getWave_function() : 0;
                        int i30 = ((j & 589856) > 0L ? 1 : ((j & 589856) == 0L ? 0 : -1));
                        if (i30 != 0) {
                            z5 = wave_function == 5;
                            if (i30 != 0) {
                                j = z5 ? j | 536870912 | 8589934592L : j | 268435456 | 4294967296L;
                            }
                            i20 = z5 ? 4 : 0;
                            j5 = j;
                        } else {
                            j5 = j;
                            i20 = 0;
                            z5 = false;
                        }
                        MappingObject mappingObject = ViewUtil.getMappingObject(R.array.msg_afg_wave_function, wave_function);
                        updateRegistration(0, mappingObject);
                        Drawable pic = mappingObject != null ? mappingObject.getPic() : null;
                        Drawable.ConstantState constantState = pic != null ? pic.getConstantState() : null;
                        Drawable newDrawable = constantState != null ? constantState.newDrawable() : null;
                        if (newDrawable != null) {
                            i19 = i20;
                            drawable6 = newDrawable.mutate();
                        } else {
                            i19 = i20;
                            drawable6 = null;
                        }
                        int i31 = wave_function;
                        z4 = false;
                        j = j5;
                        z2 = z5;
                        i12 = i31;
                    } else {
                        z4 = false;
                        i12 = 0;
                        i19 = 0;
                        z2 = false;
                        drawable6 = null;
                    }
                    int i32 = ((j & 557088) > 0L ? 1 : ((j & 557088) == 0L ? 0 : -1));
                    if (i32 != 0) {
                        boolean basic_output_enable = afgParam != null ? afgParam.getBasic_output_enable() : z4;
                        if (i32 != 0) {
                            if (basic_output_enable) {
                                j3 = j | 549755813888L;
                                j4 = 35184372088832L;
                            } else {
                                j3 = j | 274877906944L;
                                j4 = 17592186044416L;
                            }
                            j = j3 | j4;
                        }
                        if (basic_output_enable) {
                            j2 = j;
                            color = ColorUtil.getColor(getRoot().getContext(), 63);
                        } else {
                            j2 = j;
                            color = ColorUtil.getColor(getRoot().getContext(), 71);
                        }
                        int i33 = color;
                        Drawable selectedBackground = basic_output_enable ? ContextUtil.getSelectedBackground(R.drawable.bg_item_vertical, ColorUtil.getColor(getRoot().getContext(), 63)) : ContextUtil.getDrawable(R.drawable.bg_item_vertical);
                        i10 = i33;
                        str5 = str9;
                        i11 = i19;
                        drawable2 = selectedBackground;
                        i9 = i4;
                        drawable3 = drawable6;
                        str4 = str8;
                        j = j2;
                    } else {
                        str5 = str9;
                        i11 = i19;
                        drawable2 = null;
                        i10 = 0;
                        i9 = i4;
                        drawable3 = drawable6;
                        str4 = str8;
                    }
                } else {
                    str3 = str2;
                    i8 = i6;
                    i9 = i4;
                    drawable2 = null;
                    drawable3 = null;
                    str4 = null;
                    str5 = null;
                    i10 = 0;
                    i11 = 0;
                    i12 = 0;
                    z2 = false;
                }
                if ((j & 571746046443520L) == 0) {
                    i13 = i11;
                    i14 = ColorUtil.getColor(getRoot().getContext(), laParam != null ? laParam.getServiceId() : 0);
                    drawable4 = (j & 8796093022208L) != 0 ? ContextUtil.getSelectedBackground(R.drawable.bg_item_vertical, i14) : null;
                } else {
                    i13 = i11;
                    drawable4 = null;
                    i14 = 0;
                }
                if ((j & 4294967296L) == 0) {
                    i15 = 4;
                    if (i12 == 4) {
                        z3 = true;
                        i16 = ((j & 589856) > 0L ? 1 : ((j & 589856) == 0L ? 0 : -1));
                        if (i16 != 0) {
                            boolean z9 = z2 ? true : z3;
                            if (i16 != 0) {
                                j |= z9 ? 2251799813685248L : 1125899906842624L;
                            }
                        }
                        i15 = 0;
                        i17 = ((j & 526340) > 0L ? 1 : ((j & 526340) == 0L ? 0 : -1));
                        if (i17 != 0) {
                            Drawable drawable7 = z ? drawable4 : ContextUtil.getDrawable(R.drawable.bg_item_vertical);
                            if (z) {
                                i18 = i15;
                            } else {
                                i18 = i15;
                                i14 = ColorUtil.getColor(getRoot().getContext(), 71);
                            }
                            drawable5 = drawable7;
                        } else {
                            i18 = i15;
                            drawable5 = null;
                            i14 = 0;
                        }
                        if ((j & 524418) != 0) {
                            str6 = str4;
                            ImageViewBindingAdapter.setImageDrawable(this.beeper, drawable);
                        } else {
                            str6 = str4;
                        }
                        if ((j & 525314) != 0) {
                            TextViewBindingAdapter.setText(this.date, str);
                        }
                        if ((j & 524802) != 0) {
                            this.date.setVisibility(i2);
                            this.time.setVisibility(i2);
                        }
                        if ((j & 532496) != 0) {
                            this.lxi.setVisibility(i5);
                        }
                        if (i17 != 0) {
                            ViewBindingAdapter.setBackground(this.mboundView2, drawable5);
                            this.mboundView3.setTextColor(i14);
                        }
                        if ((j & 524290) != 0) {
                            this.mboundView2.setVisibility(i3);
                            this.mboundView3.setVisibility(i3);
                            this.verticalGView.setVisibility(i);
                        }
                        if ((589921 & j) != 0) {
                            ViewBindingAdapter.setBackground(this.mboundView5, drawable3);
                        }
                        if ((557088 & j) != 0) {
                            this.mboundView7.setTextColor(i10);
                            ViewBindingAdapter.setBackground(this.verticalGView, drawable2);
                        }
                        if ((j & 786464) != 0) {
                            TextViewBindingAdapter.setText(this.mboundView8, str6);
                        }
                        if ((j & 589856) != 0) {
                            this.mboundView8.setVisibility(i18);
                            this.verticalGText.setVisibility(i13);
                        }
                        if ((j & 540688) != 0) {
                            this.rmt.setVisibility(i7);
                        }
                        if ((j & 524296) != 0) {
                            this.starterMessage.setVisibility(i9);
                        }
                        if ((j & 524546) != 0) {
                            TextViewBindingAdapter.setText(this.time, str3);
                        }
                        if ((j & 528400) != 0) {
                            this.usb.setVisibility(i8);
                        }
                        if ((j & 655392) != 0) {
                            TextViewBindingAdapter.setText(this.verticalGText, str5);
                            return;
                        }
                        return;
                    }
                } else {
                    i15 = 4;
                }
                z3 = false;
                i16 = ((j & 589856) > 0L ? 1 : ((j & 589856) == 0L ? 0 : -1));
                if (i16 != 0) {
                }
                i15 = 0;
                i17 = ((j & 526340) > 0L ? 1 : ((j & 526340) == 0L ? 0 : -1));
                if (i17 != 0) {
                }
                if ((j & 524418) != 0) {
                }
                if ((j & 525314) != 0) {
                }
                if ((j & 524802) != 0) {
                }
                if ((j & 532496) != 0) {
                }
                if (i17 != 0) {
                }
                if ((j & 524290) != 0) {
                }
                if ((589921 & j) != 0) {
                }
                if ((557088 & j) != 0) {
                }
                if ((j & 786464) != 0) {
                }
                if ((j & 589856) != 0) {
                }
                if ((j & 540688) != 0) {
                }
                if ((j & 524296) != 0) {
                }
                if ((j & 524546) != 0) {
                }
                if ((j & 528400) != 0) {
                }
                if ((j & 655392) != 0) {
                }
            }
        }
        i4 = 0;
        if ((j & 552976) == 0) {
        }
        if ((j & 1015905) == 0) {
        }
        if ((j & 571746046443520L) == 0) {
        }
        if ((j & 4294967296L) == 0) {
        }
        z3 = false;
        i16 = ((j & 589856) > 0L ? 1 : ((j & 589856) == 0L ? 0 : -1));
        if (i16 != 0) {
        }
        i15 = 0;
        i17 = ((j & 526340) > 0L ? 1 : ((j & 526340) == 0L ? 0 : -1));
        if (i17 != 0) {
        }
        if ((j & 524418) != 0) {
        }
        if ((j & 525314) != 0) {
        }
        if ((j & 524802) != 0) {
        }
        if ((j & 532496) != 0) {
        }
        if (i17 != 0) {
        }
        if ((j & 524290) != 0) {
        }
        if ((589921 & j) != 0) {
        }
        if ((557088 & j) != 0) {
        }
        if ((j & 786464) != 0) {
        }
        if ((j & 589856) != 0) {
        }
        if ((j & 540688) != 0) {
        }
        if ((j & 524296) != 0) {
        }
        if ((j & 524546) != 0) {
        }
        if ((j & 528400) != 0) {
        }
        if ((j & 655392) != 0) {
        }
    }
}
