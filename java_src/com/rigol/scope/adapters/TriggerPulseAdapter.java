package com.rigol.scope.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.rigol.scope.R;
import com.rigol.scope.cil.API;
import com.rigol.scope.cil.MessageID;
import com.rigol.scope.cil.ServiceEnum;
import com.rigol.scope.data.AorBParam;
import com.rigol.scope.data.MappingObject;
import com.rigol.scope.data.TriggerParam;
import com.rigol.scope.databinding.AdapterTriggerPulseBinding;
import com.rigol.scope.databinding.PopupviewTriggerBinding;
import com.rigol.scope.utilities.AorBManager;
import com.rigol.scope.utilities.ContextUtil;
import com.rigol.scope.utilities.PopupViewManager;
import com.rigol.scope.utilities.ViewUtil;
import com.rigol.scope.viewmodels.PanelKeyViewModel;
import com.rigol.scope.viewmodels.TriggerViewModel;
import com.rigol.scope.views.baseview.BasePopupView;
import com.rigol.scope.views.keyboard.KeyboardListener;
import com.rigol.scope.views.keyboard.KeyboardPopupView;
import com.rigol.scope.views.spinner.PopupSpinner;
import com.rigol.scope.views.trigger.TriggerPopupView;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class TriggerPulseAdapter extends RecyclerView.Adapter<TriggerPulseHolder> implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, AorBManager.OnSetTextById, AorBManager.OnTextReset {
    private View anchorView;
    private AorBManager aorBManager;
    private AdapterTriggerPulseBinding binding;
    private View clickedView;
    private Context context;
    private boolean isMove;
    private KeyboardPopupView keyboardPopupView;
    private List<AorBParam> list_aorbParam = new ArrayList();
    private AorBManager.OnOutOrInAdapterClickChangeListener listener;
    private List<MappingObject> mappingObjects;
    private PanelKeyViewModel panelKeyViewModel;
    private TriggerParam param;
    private PopupSpinner popupSpinner;
    private BasePopupView popupView;
    private PopupviewTriggerBinding popviewTriggerBinding;
    private int serviceId;
    private SpinnerAdapter spinnerAdapter;
    private TriggerViewModel triggerViewModel;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 1;
    }

    public boolean isMove() {
        return this.isMove;
    }

    public void setMove(boolean z) {
        this.isMove = z;
    }

    public AorBManager getAorBManager() {
        return this.aorBManager;
    }

    public void setListener(PopupviewTriggerBinding popupviewTriggerBinding, AorBManager.OnOutOrInAdapterClickChangeListener onOutOrInAdapterClickChangeListener) {
        this.popviewTriggerBinding = popupviewTriggerBinding;
        this.listener = onOutOrInAdapterClickChangeListener;
    }

    public TriggerPulseAdapter(Context context, BasePopupView basePopupView, TriggerParam triggerParam, TriggerViewModel triggerViewModel) {
        this.triggerViewModel = triggerViewModel;
        this.param = triggerParam;
        this.popupView = basePopupView;
        this.context = context;
        this.serviceId = triggerParam.getServiceId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public TriggerPulseHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        this.binding = AdapterTriggerPulseBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        if (this.list_aorbParam.size() > 0) {
            this.list_aorbParam.clear();
        }
        this.list_aorbParam.add(new AorBParam(this.binding.triggerLevelValue, 0, true, ViewUtil.KEY_A, 3));
        this.list_aorbParam.add(new AorBParam(this.binding.lowerLimitValue, 0, true, ViewUtil.KEY_A, 3));
        this.list_aorbParam.add(new AorBParam(this.binding.upperLimitValue, 0, false, ViewUtil.KEY_A, 3));
        this.list_aorbParam.add(new AorBParam(this.binding.triggerHoldoff, 0, false, ViewUtil.KEY_A, 0));
        this.list_aorbParam.add(new AorBParam(this.binding.triggerSource, 0, false, "", 2));
        this.aorBManager = null;
        AorBManager aorBManager = new AorBManager(this.context, this.list_aorbParam, this, this) { // from class: com.rigol.scope.adapters.TriggerPulseAdapter.1
            @Override // com.rigol.scope.utilities.AorBManager
            protected void setSwitch_num(int i2) {
                showKey(TriggerPulseAdapter.this.context, ((AorBParam) TriggerPulseAdapter.this.list_aorbParam.get(i2)).getEditText(), true, ((AorBParam) TriggerPulseAdapter.this.list_aorbParam.get(i2)).getAorb());
            }

            @Override // com.rigol.scope.utilities.AorBManager
            protected void setrecovery_num(int i2) {
                showKey(TriggerPulseAdapter.this.context, ((AorBParam) TriggerPulseAdapter.this.list_aorbParam.get(i2)).getEditText(), false, ((AorBParam) TriggerPulseAdapter.this.list_aorbParam.get(i2)).getAorb());
            }
        };
        this.aorBManager = aorBManager;
        aorBManager.showKey(this.context, this.binding.triggerLevelValue, true, ViewUtil.KEY_A);
        this.aorBManager.showKey(this.context, this.binding.lowerLimitValue, true, ViewUtil.KEY_B);
        PopupViewManager.getInstance().setParamAOrBManager(this.param, this.aorBManager);
        if (this.panelKeyViewModel == null) {
            PanelKeyViewModel panelKeyViewModel = (PanelKeyViewModel) ContextUtil.getAppViewModel(PanelKeyViewModel.class);
            this.panelKeyViewModel = panelKeyViewModel;
            if (panelKeyViewModel != null) {
                panelKeyViewModel.getOnKeyUpData().observe((LifecycleOwner) this.context, new Observer() { // from class: com.rigol.scope.adapters.-$$Lambda$TriggerPulseAdapter$6W76ncJdmu__vAtjEN-0CgofM3w
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        TriggerPulseAdapter.this.lambda$onCreateViewHolder$2$TriggerPulseAdapter((KeyEvent) obj);
                    }
                });
            }
        }
        return new TriggerPulseHolder(this.binding);
    }

    public /* synthetic */ void lambda$onCreateViewHolder$2$TriggerPulseAdapter(KeyEvent keyEvent) {
        if (PopupViewManager.getInstance().isShowing(TriggerPopupView.class) && (this.popviewTriggerBinding.triggerView.getAdapter() instanceof TriggerPulseAdapter)) {
            this.panelKeyViewModel.abSwitch(keyEvent, this.clickedView, this.popupSpinner, this.mappingObjects, this.spinnerAdapter, this.aorBManager, this.keyboardPopupView, new AorBManager.OnKeyboardItemChangeListener() { // from class: com.rigol.scope.adapters.-$$Lambda$TriggerPulseAdapter$mfQLe08Jdj_4RHfaPac3BjX8Z28
                @Override // com.rigol.scope.utilities.AorBManager.OnKeyboardItemChangeListener
                public final void onCall(KeyboardPopupView keyboardPopupView) {
                    TriggerPulseAdapter.this.lambda$onCreateViewHolder$0$TriggerPulseAdapter(keyboardPopupView);
                }
            }, new AorBManager.OnSpinnerItemChangeListener() { // from class: com.rigol.scope.adapters.-$$Lambda$TriggerPulseAdapter$AdZYhigjkMJzBwrNpp2ubQgccPs
                @Override // com.rigol.scope.utilities.AorBManager.OnSpinnerItemChangeListener
                public final void onCall(int i, MappingObject mappingObject) {
                    TriggerPulseAdapter.this.lambda$onCreateViewHolder$1$TriggerPulseAdapter(i, mappingObject);
                }
            });
        }
    }

    public /* synthetic */ void lambda$onCreateViewHolder$0$TriggerPulseAdapter(KeyboardPopupView keyboardPopupView) {
        this.keyboardPopupView = keyboardPopupView;
    }

    public /* synthetic */ void lambda$onCreateViewHolder$1$TriggerPulseAdapter(int i, MappingObject mappingObject) {
        if (this.clickedView.getId() == R.id.trigger_source) {
            selectSource(mappingObject);
        }
    }

    private void selectSource(MappingObject mappingObject) {
        TriggerParam triggerParam = this.param;
        if (triggerParam != null) {
            triggerParam.savePulseSource(mappingObject.getValue());
            this.param.setChannel(mappingObject.getValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(TriggerPulseHolder triggerPulseHolder, int i) {
        ShowTriggerPulse();
        triggerPulseHolder.binding.executePendingBindings();
    }

    public void ShowTriggerPulse() {
        ServiceEnum.Chan chan = this.param.getChan();
        if (chan == ServiceEnum.Chan.acline || chan == ServiceEnum.Chan.ext) {
            this.param.savePulseSource(ServiceEnum.Chan.chan1.value1);
            this.param.setChannel(ServiceEnum.Chan.chan1.value1);
        } else {
            this.param.setChan(ServiceEnum.getChanFromValue1(chan.value1));
        }
        this.param.setChanColor(this.binding.triggerSource, chan);
        this.binding.setSweepAutoMapping(ViewUtil.getMappingObject(R.array.msg_trigger_sweep, ServiceEnum.TriggerSweep.Trigger_Sweep_Auto.value1));
        this.binding.setSweepNormalMapping(ViewUtil.getMappingObject(R.array.msg_trigger_sweep, ServiceEnum.TriggerSweep.Trigger_Sweep_Normal.value1));
        this.binding.setSweepSingleMapping(ViewUtil.getMappingObject(R.array.msg_trigger_sweep, ServiceEnum.TriggerSweep.Trigger_Sweep_Single.value1));
        this.binding.setPolarityPositiveMapping(ViewUtil.getMappingObject(R.array.msg_trigger_polarity, ServiceEnum.TriggerPulsePolarity.Trigger_pulse_positive.value1));
        this.binding.setPolarityNegativeMapping(ViewUtil.getMappingObject(R.array.msg_trigger_polarity, ServiceEnum.TriggerPulsePolarity.Trigger_pulse_negative.value1));
        this.param.readPulseWhen();
        this.param.readPulsePolarity();
        this.binding.setParam(this.param);
        ViewUtil.setSwitchButton(this.binding.triggerNoiseSwitch);
        this.binding.triggerNoiseSwitch.setOnCheckedChangeListener(this);
        this.binding.moreThan.setOnCheckedChangeListener(this);
        this.binding.lessMore.setOnCheckedChangeListener(this);
        this.binding.lessThan.setOnCheckedChangeListener(this);
        this.binding.polarityP.setOnCheckedChangeListener(this);
        this.binding.polarityN.setOnCheckedChangeListener(this);
        this.binding.buttonLevel.setOnClickListener(this);
        this.binding.imageView2.setOnClickListener(this);
        this.binding.triggerSource.setOnClickListener(this);
        this.binding.triggerHoldoff.setOnClickListener(this);
        this.binding.triggerLevelValue.setOnClickListener(this);
        this.binding.upperLimitValue.setOnClickListener(this);
        this.binding.lowerLimitValue.setOnClickListener(this);
        this.binding.triggerLevelView.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.rigol.scope.adapters.TriggerPulseAdapter.2
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (z) {
                    TriggerPulseAdapter.this.param.saveLevelSync((long) ((((seekBar.getProgress() / 100.0d) * (TriggerPulseAdapter.this.param.getChanScale() * TriggerPulseAdapter.this.param.getScaleNum())) - TriggerPulseAdapter.this.param.getChanOffset()) - ((TriggerPulseAdapter.this.param.getChanScale() * TriggerPulseAdapter.this.param.getScaleNum()) / 2)));
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                TriggerPulseAdapter.this.param.saveLevelSync((long) ((((seekBar.getProgress() / 100.0d) * (TriggerPulseAdapter.this.param.getChanScale() * TriggerPulseAdapter.this.param.getScaleNum())) - TriggerPulseAdapter.this.param.getChanOffset()) - ((TriggerPulseAdapter.this.param.getChanScale() * TriggerPulseAdapter.this.param.getScaleNum()) / 2)));
            }
        });
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            switch (compoundButton.getId()) {
                case R.id.auto_radio_button /* 2131361987 */:
                    if (z) {
                        this.param.saveSweep(ServiceEnum.TriggerSweep.Trigger_Sweep_Auto.value1);
                        return;
                    }
                    return;
                case R.id.less_more /* 2131363304 */:
                    this.aorBManager.set_RadioButton(0, 1);
                    this.aorBManager.set_RadioButton(0, 1);
                    if (this.param != null) {
                        this.param.savePulseWhen(ServiceEnum.getEMoreThanFromValue1(z ? 3 : 0));
                        return;
                    }
                    return;
                case R.id.less_than /* 2131363305 */:
                    this.aorBManager.set_RadioButton(0, 2);
                    this.aorBManager.set_RadioButton(0, 2);
                    if (this.param != null) {
                        this.param.savePulseWhen(ServiceEnum.getEMoreThanFromValue1(z ? 2 : 0));
                        return;
                    }
                    return;
                case R.id.more_than /* 2131363410 */:
                    this.aorBManager.set_RadioButton(0, 1);
                    this.aorBManager.set_RadioButton(0, 1);
                    this.aorBManager.set_RadioButton();
                    TriggerParam triggerParam = this.param;
                    if (triggerParam != null) {
                        triggerParam.savePulseWhen(ServiceEnum.getEMoreThanFromValue1(z ? 1 : 0));
                        return;
                    }
                    return;
                case R.id.normal_radio_button /* 2131363472 */:
                    if (z) {
                        this.param.saveSweep(ServiceEnum.TriggerSweep.Trigger_Sweep_Normal.value1);
                        return;
                    }
                    return;
                case R.id.polarity_n /* 2131363595 */:
                    TriggerParam triggerParam2 = this.param;
                    if (triggerParam2 != null) {
                        triggerParam2.savePulsePolarity(ServiceEnum.getTriggerPulsePolarityFromValue1(z ? 1 : 0));
                        return;
                    }
                    return;
                case R.id.polarity_p /* 2131363596 */:
                    if (this.param != null) {
                        this.param.savePulsePolarity(ServiceEnum.getTriggerPulsePolarityFromValue1(0));
                        return;
                    }
                    return;
                case R.id.single_radio_button /* 2131363841 */:
                    if (z) {
                        this.param.saveSweep(ServiceEnum.TriggerSweep.Trigger_Sweep_Single.value1);
                        return;
                    }
                    return;
                case R.id.trigger_noise_switch /* 2131364282 */:
                    if (this.param != null) {
                        API.getInstance().UI_PostBool(this.serviceId, MessageID.MSG_TRIGGER_NOISE, z);
                        this.param.setIsNoise(z);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        switch (view.getId()) {
            case R.id.auto_radio_button /* 2131361987 */:
                this.param.saveSweep(ServiceEnum.TriggerSweep.Trigger_Sweep_Auto.value1);
                break;
            case R.id.button_level /* 2131362192 */:
                if (this.context instanceof Activity) {
                    this.param.saveButtonLevel();
                    break;
                }
                break;
            case R.id.imageView2 /* 2131363092 */:
                if (this.param.getPolarity() == ServiceEnum.TriggerPulsePolarity.Trigger_pulse_positive) {
                    this.param.savePulsePolarity(ServiceEnum.TriggerPulsePolarity.Trigger_pulse_negative);
                    break;
                } else if (this.param.getPolarity() == ServiceEnum.TriggerPulsePolarity.Trigger_pulse_negative) {
                    this.param.savePulsePolarity(ServiceEnum.TriggerPulsePolarity.Trigger_pulse_positive);
                    break;
                }
                break;
            case R.id.lower_limit_value /* 2131363333 */:
                if (this.aorBManager.setClick_showab(id) && (this.context instanceof Activity)) {
                    this.param.readPulseLowerLimitAttr();
                    ViewUtil.showKeyboard(this.popupView.getAnchor(), view, ServiceEnum.Unit.Unit_s, this.param.getLowerAttr().getMaxLongValue(), this.param.getLowerAttr().getMinLongValue(), this.param.getLowerAttr().getDefLongValue(), this.param.getLowerLimit(), new KeyboardListener() { // from class: com.rigol.scope.adapters.TriggerPulseAdapter.6
                        @Override // com.rigol.scope.views.keyboard.KeyboardListener
                        public <T> void resultMinUnitValueListener(T t) {
                            TriggerPulseAdapter.this.param.savePulseLowerLimit(((Long) t).longValue());
                        }

                        @Override // com.rigol.scope.views.keyboard.KeyboardListener
                        public void onCall(KeyboardPopupView keyboardPopupView) {
                            TriggerPulseAdapter.this.keyboardPopupView = keyboardPopupView;
                        }
                    });
                    break;
                }
                break;
            case R.id.normal_radio_button /* 2131363472 */:
                this.param.saveSweep(ServiceEnum.TriggerSweep.Trigger_Sweep_Normal.value1);
                break;
            case R.id.single_radio_button /* 2131363841 */:
                this.param.saveSweep(ServiceEnum.TriggerSweep.Trigger_Sweep_Single.value1);
                break;
            case R.id.trigger_holdoff /* 2131364204 */:
                if (this.aorBManager.setClick_showab(id) && (this.context instanceof Activity)) {
                    ViewUtil.showKeyboard(this.popupView.getAnchor(), view, ServiceEnum.Unit.Unit_s, this.param.getHoldOffAttr().getMaxLongValue(), this.param.getHoldOffAttr().getMinLongValue(), this.param.getHoldOffAttr().getDefLongValue(), this.param.getHoldOff(), new KeyboardListener() { // from class: com.rigol.scope.adapters.TriggerPulseAdapter.3
                        @Override // com.rigol.scope.views.keyboard.KeyboardListener
                        public <T> void resultMinUnitValueListener(T t) {
                            TriggerPulseAdapter.this.param.saveholdOff(((Long) t).longValue());
                        }

                        @Override // com.rigol.scope.views.keyboard.KeyboardListener
                        public void onCall(KeyboardPopupView keyboardPopupView) {
                            TriggerPulseAdapter.this.keyboardPopupView = keyboardPopupView;
                        }
                    });
                    break;
                }
                break;
            case R.id.trigger_level_value /* 2131364253 */:
                if (this.aorBManager.setClick_showab(id) && (this.context instanceof Activity)) {
                    this.param.readLevelAttr();
                    TriggerParam triggerParam = this.param;
                    ViewUtil.showKeyboard(this.popupView.getAnchor(), view, triggerParam.getChanUnit(triggerParam.getChannel()), this.param.getLevelAttr().getMaxLongValue(), this.param.getLevelAttr().getMinLongValue(), this.param.getLevelAttr().getDefLongValue(), this.param.getLevel(), new KeyboardListener() { // from class: com.rigol.scope.adapters.TriggerPulseAdapter.4
                        @Override // com.rigol.scope.views.keyboard.KeyboardListener
                        public <T> void resultMinUnitValueListener(T t) {
                            TriggerPulseAdapter.this.param.saveLevelSync(((Long) t).longValue());
                        }

                        @Override // com.rigol.scope.views.keyboard.KeyboardListener
                        public void onCall(KeyboardPopupView keyboardPopupView) {
                            TriggerPulseAdapter.this.keyboardPopupView = keyboardPopupView;
                        }
                    });
                    break;
                }
                break;
            case R.id.trigger_source /* 2131364309 */:
                if (this.popupView != null) {
                    ViewUtil.showChanSpinner(this.popupView.getAnchor(), view, ViewUtil.filterChan(ViewUtil.getList((int) R.array.msg_trigger_source_la)), new AorBManager.OnSpinnerAdapterListener() { // from class: com.rigol.scope.adapters.-$$Lambda$TriggerPulseAdapter$k4CxSuP9tUZIZcTy3ISEAwkJdg0
                        @Override // com.rigol.scope.utilities.AorBManager.OnSpinnerAdapterListener
                        public final void onSpinnerAdapter(PopupSpinner popupSpinner, SpinnerAdapter spinnerAdapter, List list, View view2) {
                            TriggerPulseAdapter.this.lambda$onClick$3$TriggerPulseAdapter(popupSpinner, spinnerAdapter, list, view2);
                        }
                    }, new PopupSpinner.OnItemClickListener() { // from class: com.rigol.scope.adapters.-$$Lambda$TriggerPulseAdapter$mOd74qFKTRenXpINb0I8qhekCJU
                        @Override // com.rigol.scope.views.spinner.PopupSpinner.OnItemClickListener
                        public final void onItemClick(View view2, RecyclerView.ViewHolder viewHolder, int i, Object obj) {
                            TriggerPulseAdapter.this.lambda$onClick$4$TriggerPulseAdapter(view2, viewHolder, i, (MappingObject) obj);
                        }
                    });
                    break;
                }
                break;
            case R.id.upper_limit_value /* 2131364497 */:
                if (this.aorBManager.setClick_showab(id) && (this.context instanceof Activity)) {
                    this.param.readPulseUpperLimitAttr();
                    ViewUtil.showKeyboard(this.popupView.getAnchor(), view, ServiceEnum.Unit.Unit_s, this.param.getUpperAttr().getMaxLongValue(), this.param.getUpperAttr().getMinLongValue(), this.param.getUpperAttr().getDefLongValue(), this.param.getUperLimit(), new KeyboardListener() { // from class: com.rigol.scope.adapters.TriggerPulseAdapter.5
                        @Override // com.rigol.scope.views.keyboard.KeyboardListener
                        public <T> void resultMinUnitValueListener(T t) {
                            TriggerPulseAdapter.this.param.savePulseUperLimit(((Long) t).longValue());
                        }

                        @Override // com.rigol.scope.views.keyboard.KeyboardListener
                        public void onCall(KeyboardPopupView keyboardPopupView) {
                            TriggerPulseAdapter.this.keyboardPopupView = keyboardPopupView;
                        }
                    });
                    break;
                }
                break;
        }
        AorBManager.OnOutOrInAdapterClickChangeListener onOutOrInAdapterClickChangeListener = this.listener;
        if (onOutOrInAdapterClickChangeListener != null) {
            onOutOrInAdapterClickChangeListener.onChange(false);
        }
    }

    public /* synthetic */ void lambda$onClick$3$TriggerPulseAdapter(PopupSpinner popupSpinner, SpinnerAdapter spinnerAdapter, List list, View view) {
        this.popupSpinner = popupSpinner;
        this.spinnerAdapter = spinnerAdapter;
        this.mappingObjects = list;
        this.clickedView = view;
    }

    public /* synthetic */ void lambda$onClick$4$TriggerPulseAdapter(View view, RecyclerView.ViewHolder viewHolder, int i, MappingObject mappingObject) {
        selectSource(mappingObject);
    }

    @Override // com.rigol.scope.utilities.AorBManager.OnSetTextById
    public void onViewIdCallback(KeyEvent keyEvent, int i, boolean z) {
        if (this.param == null || !isMove()) {
            return;
        }
        switch (i) {
            case R.id.lower_limit_value /* 2131363333 */:
                this.param.readPulseLowerLimitAttr();
                TriggerParam triggerParam = this.param;
                triggerParam.savePulseLowerLimit(triggerParam.getLongStep(triggerParam.getLowerLimit(), this.param.getLowerAttr(), z, keyEvent));
                return;
            case R.id.trigger_holdoff /* 2131364204 */:
                TriggerParam triggerParam2 = this.param;
                triggerParam2.saveholdOff(triggerParam2.getLongStep(triggerParam2.getHoldOff(), this.param.getHoldOffAttr(), z, keyEvent));
                return;
            case R.id.trigger_level_value /* 2131364253 */:
                TriggerParam triggerParam3 = this.param;
                triggerParam3.rollTriggerLevel(keyEvent, z, this.panelKeyViewModel, triggerParam3);
                return;
            case R.id.upper_limit_value /* 2131364497 */:
                this.param.readPulseUpperLimitAttr();
                TriggerParam triggerParam4 = this.param;
                triggerParam4.savePulseUperLimit(triggerParam4.getLongStep(triggerParam4.getUperLimit(), this.param.getUpperAttr(), z, keyEvent));
                return;
            default:
                return;
        }
    }

    @Override // com.rigol.scope.utilities.AorBManager.OnTextReset
    public void onResetDefault(int i) {
        if (this.param == null || !isMove()) {
            return;
        }
        switch (i) {
            case R.id.lower_limit_value /* 2131363333 */:
                this.param.readPulseLowerLimitAttr();
                TriggerParam triggerParam = this.param;
                triggerParam.savePulseLowerLimit(triggerParam.getLongDef(triggerParam.getLowerAttr()));
                return;
            case R.id.trigger_holdoff /* 2131364204 */:
                TriggerParam triggerParam2 = this.param;
                triggerParam2.saveholdOff(triggerParam2.getLongDef(triggerParam2.getHoldOffAttr()));
                return;
            case R.id.trigger_level_value /* 2131364253 */:
                TriggerParam triggerParam3 = this.param;
                triggerParam3.saveLevelSync(triggerParam3.getLongDef(triggerParam3.getLevelAttr()));
                return;
            case R.id.upper_limit_value /* 2131364497 */:
                this.param.readPulseUpperLimitAttr();
                TriggerParam triggerParam4 = this.param;
                triggerParam4.savePulseUperLimit(triggerParam4.getLongDef(triggerParam4.getUpperAttr()));
                return;
            default:
                return;
        }
    }

    /* loaded from: classes.dex */
    public class TriggerPulseHolder extends RecyclerView.ViewHolder {
        private AdapterTriggerPulseBinding binding;

        public TriggerPulseHolder(AdapterTriggerPulseBinding adapterTriggerPulseBinding) {
            super(adapterTriggerPulseBinding.getRoot());
            this.binding = adapterTriggerPulseBinding;
        }
    }
}
