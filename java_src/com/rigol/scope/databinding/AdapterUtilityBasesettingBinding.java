package com.rigol.scope.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.rigol.scope.R;
import com.rigol.scope.data.MaskParam;
import com.rigol.scope.data.UtilityParam;
import com.rigol.scope.views.SwitchButton;
/* loaded from: classes2.dex */
public abstract class AdapterUtilityBasesettingBinding extends ViewDataBinding {
    public final ConstraintLayout auxoutLayout;
    public final ConstraintLayout beeperLayout;
    public final ConstraintLayout contentLayout;
    public final ConstraintLayout languageLayout;
    public final ConstraintLayout loadLastLayout;
    @Bindable
    protected MaskParam mMaskParam;
    @Bindable
    protected UtilityParam mParam;
    public final ConstraintLayout openzoomLayout;
    public final ConstraintLayout powerLayout;
    public final ConstraintLayout screenLockLayout;
    public final ConstraintLayout settimeLayout;
    public final ConstraintLayout showtimeLayout;
    public final TextView spLanguage;
    public final Space space;
    public final SwitchButton switchButtonAuxout;
    public final SwitchButton switchButtonBeeper;
    public final SwitchButton switchButtonLoadLast;
    public final SwitchButton switchButtonOpenzoom;
    public final SwitchButton switchButtonPower;
    public final SwitchButton switchButtonScreenLock;
    public final SwitchButton switchButtonShowtime;
    public final SwitchButton switchButtonVerticalExpand;
    public final SwitchButton switchButtonVibration;
    public final ConstraintLayout timeLayout;
    public final TextView tvAuxout;
    public final TextView tvBeeper;
    public final TextView tvLanguage;
    public final TextView tvLoadLast;
    public final TextView tvPowerstate;
    public final TextView tvScreenLock;
    public final TextView tvShowtime;
    public final TextView tvSopenzoom;
    public final TextView tvTime;
    public final TextView tvTimevalue;
    public final TextView tvVibration;
    public final TextView tvYear;
    public final TextView tvYearvalue;
    public final TextView verticalExpand;
    public final ConstraintLayout verticalExpandLayout;
    public final ConstraintLayout vibrationLayout;
    public final View view3;
    public final View view4;
    public final ConstraintLayout yearLayout;

    public abstract void setMaskParam(MaskParam maskParam);

    public abstract void setParam(UtilityParam utilityParam);

    /* JADX INFO: Access modifiers changed from: protected */
    public AdapterUtilityBasesettingBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, ConstraintLayout constraintLayout6, ConstraintLayout constraintLayout7, ConstraintLayout constraintLayout8, ConstraintLayout constraintLayout9, ConstraintLayout constraintLayout10, TextView textView, Space space, SwitchButton switchButton, SwitchButton switchButton2, SwitchButton switchButton3, SwitchButton switchButton4, SwitchButton switchButton5, SwitchButton switchButton6, SwitchButton switchButton7, SwitchButton switchButton8, SwitchButton switchButton9, ConstraintLayout constraintLayout11, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, ConstraintLayout constraintLayout12, ConstraintLayout constraintLayout13, View view2, View view3, ConstraintLayout constraintLayout14) {
        super(obj, view, i);
        this.auxoutLayout = constraintLayout;
        this.beeperLayout = constraintLayout2;
        this.contentLayout = constraintLayout3;
        this.languageLayout = constraintLayout4;
        this.loadLastLayout = constraintLayout5;
        this.openzoomLayout = constraintLayout6;
        this.powerLayout = constraintLayout7;
        this.screenLockLayout = constraintLayout8;
        this.settimeLayout = constraintLayout9;
        this.showtimeLayout = constraintLayout10;
        this.spLanguage = textView;
        this.space = space;
        this.switchButtonAuxout = switchButton;
        this.switchButtonBeeper = switchButton2;
        this.switchButtonLoadLast = switchButton3;
        this.switchButtonOpenzoom = switchButton4;
        this.switchButtonPower = switchButton5;
        this.switchButtonScreenLock = switchButton6;
        this.switchButtonShowtime = switchButton7;
        this.switchButtonVerticalExpand = switchButton8;
        this.switchButtonVibration = switchButton9;
        this.timeLayout = constraintLayout11;
        this.tvAuxout = textView2;
        this.tvBeeper = textView3;
        this.tvLanguage = textView4;
        this.tvLoadLast = textView5;
        this.tvPowerstate = textView6;
        this.tvScreenLock = textView7;
        this.tvShowtime = textView8;
        this.tvSopenzoom = textView9;
        this.tvTime = textView10;
        this.tvTimevalue = textView11;
        this.tvVibration = textView12;
        this.tvYear = textView13;
        this.tvYearvalue = textView14;
        this.verticalExpand = textView15;
        this.verticalExpandLayout = constraintLayout12;
        this.vibrationLayout = constraintLayout13;
        this.view3 = view2;
        this.view4 = view3;
        this.yearLayout = constraintLayout14;
    }

    public UtilityParam getParam() {
        return this.mParam;
    }

    public MaskParam getMaskParam() {
        return this.mMaskParam;
    }

    public static AdapterUtilityBasesettingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterUtilityBasesettingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterUtilityBasesettingBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.adapter_utility_basesetting, viewGroup, z, obj);
    }

    public static AdapterUtilityBasesettingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterUtilityBasesettingBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterUtilityBasesettingBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.adapter_utility_basesetting, null, false, obj);
    }

    public static AdapterUtilityBasesettingBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterUtilityBasesettingBinding bind(View view, Object obj) {
        return (AdapterUtilityBasesettingBinding) bind(obj, view, R.layout.adapter_utility_basesetting);
    }
}
