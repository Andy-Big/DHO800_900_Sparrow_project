package com.rigol.scope.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.rigol.scope.R;
import com.rigol.scope.data.SharedParam;
/* loaded from: classes2.dex */
public abstract class ActivityMainBinding extends ViewDataBinding {
    @Bindable
    protected SharedParam mSharedParam;
    public final ConstraintLayout mainLayout;
    public final FragmentContainerView navigationBar;
    public final FragmentContainerView resultsBar;
    public final ImageView resultsBarIcon;
    public final FragmentContainerView settingsBar;
    public final FragmentContainerView waveform;

    public abstract void setSharedParam(SharedParam sharedParam);

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityMainBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, FragmentContainerView fragmentContainerView, FragmentContainerView fragmentContainerView2, ImageView imageView, FragmentContainerView fragmentContainerView3, FragmentContainerView fragmentContainerView4) {
        super(obj, view, i);
        this.mainLayout = constraintLayout;
        this.navigationBar = fragmentContainerView;
        this.resultsBar = fragmentContainerView2;
        this.resultsBarIcon = imageView;
        this.settingsBar = fragmentContainerView3;
        this.waveform = fragmentContainerView4;
    }

    public SharedParam getSharedParam() {
        return this.mSharedParam;
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ActivityMainBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_main, viewGroup, z, obj);
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMainBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ActivityMainBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_main, null, false, obj);
    }

    public static ActivityMainBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMainBinding bind(View view, Object obj) {
        return (ActivityMainBinding) bind(obj, view, R.layout.activity_main);
    }
}
