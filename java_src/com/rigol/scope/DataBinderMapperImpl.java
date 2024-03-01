package com.rigol.scope;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.rigol.scope.databinding.AbapterLaSeniorBindingImpl;
import com.rigol.scope.databinding.ActivityImagePreviewBindingImpl;
import com.rigol.scope.databinding.ActivityMainBindingImpl;
import com.rigol.scope.databinding.ActivityRigolKeyTest2BindingImpl;
import com.rigol.scope.databinding.ActivityRigolKeyTest3BindingImpl;
import com.rigol.scope.databinding.ActivityScreenSaverBindingImpl;
import com.rigol.scope.databinding.AdapterAfgBindingImpl;
import com.rigol.scope.databinding.AdapterAwgBindingImpl;
import com.rigol.scope.databinding.AdapterBodeAfSeniorBindingImpl;
import com.rigol.scope.databinding.AdapterBodeBasicSeniorBindingImpl;
import com.rigol.scope.databinding.AdapterBodeSavingSeniorBindingImpl;
import com.rigol.scope.databinding.AdapterBusAnalyseSelectItemBindingImpl;
import com.rigol.scope.databinding.AdapterBusEthAnalyse1000basetBindingImpl;
import com.rigol.scope.databinding.AdapterBusEthAnalyse100basetBindingImpl;
import com.rigol.scope.databinding.AdapterBusEthAnalyse10basetBindingImpl;
import com.rigol.scope.databinding.AdapterBusEthAnalyseBindingImpl;
import com.rigol.scope.databinding.AdapterBusSettingBindingImpl;
import com.rigol.scope.databinding.AdapterBusUsbAnalyseBindingImpl;
import com.rigol.scope.databinding.AdapterDecode1553bBindingImpl;
import com.rigol.scope.databinding.AdapterDecodeArinc429BindingImpl;
import com.rigol.scope.databinding.AdapterDecodeCanBindingImpl;
import com.rigol.scope.databinding.AdapterDecodeFlexrayBindingImpl;
import com.rigol.scope.databinding.AdapterDecodeI2cBindingImpl;
import com.rigol.scope.databinding.AdapterDecodeI2sBindingImpl;
import com.rigol.scope.databinding.AdapterDecodeLinBindingImpl;
import com.rigol.scope.databinding.AdapterDecodeMostBindingImpl;
import com.rigol.scope.databinding.AdapterDecodeParallelBindingImpl;
import com.rigol.scope.databinding.AdapterDecodeRs232BindingImpl;
import com.rigol.scope.databinding.AdapterDecodeSentBindingImpl;
import com.rigol.scope.databinding.AdapterDecodeSpiBindingImpl;
import com.rigol.scope.databinding.AdapterDecodeUsbBindingImpl;
import com.rigol.scope.databinding.AdapterEyeConstantBindingImpl;
import com.rigol.scope.databinding.AdapterEyeExplicitBindingImpl;
import com.rigol.scope.databinding.AdapterEyePllBindingImpl;
import com.rigol.scope.databinding.AdapterItemAutosetBindingImpl;
import com.rigol.scope.databinding.AdapterItemDiskManageBindingImpl;
import com.rigol.scope.databinding.AdapterItemFlexKnobBindingImpl;
import com.rigol.scope.databinding.AdapterItemLaBindingImpl;
import com.rigol.scope.databinding.AdapterItemMathBindingImpl;
import com.rigol.scope.databinding.AdapterItemOptionBindingImpl;
import com.rigol.scope.databinding.AdapterItemPopupviewDecodeBindingImpl;
import com.rigol.scope.databinding.AdapterItemPopupviewFlexKnobBindingImpl;
import com.rigol.scope.databinding.AdapterItemPopupviewMeasureBindingImpl;
import com.rigol.scope.databinding.AdapterItemPopupviewProbeBindingImpl;
import com.rigol.scope.databinding.AdapterItemPopupviewVerticalBindingImpl;
import com.rigol.scope.databinding.AdapterItemQualityBindingImpl;
import com.rigol.scope.databinding.AdapterItemRecyclerviewBindingImpl;
import com.rigol.scope.databinding.AdapterItemResultCounterBindingImpl;
import com.rigol.scope.databinding.AdapterItemResultCursorBindingImpl;
import com.rigol.scope.databinding.AdapterItemResultDvmBindingImpl;
import com.rigol.scope.databinding.AdapterItemResultEyeBindingImpl;
import com.rigol.scope.databinding.AdapterItemResultHistogramBindingImpl;
import com.rigol.scope.databinding.AdapterItemResultItemBindingImpl;
import com.rigol.scope.databinding.AdapterItemResultItemTowviewBindingImpl;
import com.rigol.scope.databinding.AdapterItemResultJitterBindingImpl;
import com.rigol.scope.databinding.AdapterItemResultMarkerBindingImpl;
import com.rigol.scope.databinding.AdapterItemResultMaskBindingImpl;
import com.rigol.scope.databinding.AdapterItemResultMeasHistogramBindingImpl;
import com.rigol.scope.databinding.AdapterItemResultMeasureBindingImpl;
import com.rigol.scope.databinding.AdapterItemResultTableContentBindingImpl;
import com.rigol.scope.databinding.AdapterItemResultTableHeaderBindingImpl;
import com.rigol.scope.databinding.AdapterItemRippleBindingImpl;
import com.rigol.scope.databinding.AdapterItemRtsaBindingImpl;
import com.rigol.scope.databinding.AdapterItemSelfTestBindingImpl;
import com.rigol.scope.databinding.AdapterItemShortcutBindingImpl;
import com.rigol.scope.databinding.AdapterItemSimple2BindingImpl;
import com.rigol.scope.databinding.AdapterItemSimple3BindingImpl;
import com.rigol.scope.databinding.AdapterItemSimple4BindingImpl;
import com.rigol.scope.databinding.AdapterItemSimpleBindingImpl;
import com.rigol.scope.databinding.AdapterItemSparrpwMathBindingImpl;
import com.rigol.scope.databinding.AdapterItemSpinnerBindingImpl;
import com.rigol.scope.databinding.AdapterItemSpinnerDiskBindingImpl;
import com.rigol.scope.databinding.AdapterItemVerticalBindingImpl;
import com.rigol.scope.databinding.AdapterJitterConstantBindingImpl;
import com.rigol.scope.databinding.AdapterJitterExplicitBindingImpl;
import com.rigol.scope.databinding.AdapterJitterPllBindingImpl;
import com.rigol.scope.databinding.AdapterLaBasicBindingImpl;
import com.rigol.scope.databinding.AdapterLaColorBindingImpl;
import com.rigol.scope.databinding.AdapterMathArithBindingImpl;
import com.rigol.scope.databinding.AdapterMathFftBindingImpl;
import com.rigol.scope.databinding.AdapterMathFilterBindingImpl;
import com.rigol.scope.databinding.AdapterMathFunBindingImpl;
import com.rigol.scope.databinding.AdapterMathLogicBindingImpl;
import com.rigol.scope.databinding.AdapterRtsaBasesettingBindingImpl;
import com.rigol.scope.databinding.AdapterRtsaMarkerBindingImpl;
import com.rigol.scope.databinding.AdapterRtsaPeakBindingImpl;
import com.rigol.scope.databinding.AdapterSearchEdgeBindingImpl;
import com.rigol.scope.databinding.AdapterSearchTriggerPulseBindingImpl;
import com.rigol.scope.databinding.AdapterStatResetBindingImpl;
import com.rigol.scope.databinding.AdapterStorageLoadBindingImpl;
import com.rigol.scope.databinding.AdapterStorageSaveBindingImpl;
import com.rigol.scope.databinding.AdapterStorageUpgradeBindingImpl;
import com.rigol.scope.databinding.AdapterTrigger1553bBindingImpl;
import com.rigol.scope.databinding.AdapterTriggerCanBindingImpl;
import com.rigol.scope.databinding.AdapterTriggerDelayBindingImpl;
import com.rigol.scope.databinding.AdapterTriggerDurationBindingImpl;
import com.rigol.scope.databinding.AdapterTriggerEdgeBindingImpl;
import com.rigol.scope.databinding.AdapterTriggerFlexrayBindingImpl;
import com.rigol.scope.databinding.AdapterTriggerI2cBindingImpl;
import com.rigol.scope.databinding.AdapterTriggerI2sBindingImpl;
import com.rigol.scope.databinding.AdapterTriggerLinBindingImpl;
import com.rigol.scope.databinding.AdapterTriggerNthBindingImpl;
import com.rigol.scope.databinding.AdapterTriggerOverBindingImpl;
import com.rigol.scope.databinding.AdapterTriggerPatternBindingImpl;
import com.rigol.scope.databinding.AdapterTriggerPulseBindingImpl;
import com.rigol.scope.databinding.AdapterTriggerRs232BindingImpl;
import com.rigol.scope.databinding.AdapterTriggerRuntBindingImpl;
import com.rigol.scope.databinding.AdapterTriggerSetupHoldBindingImpl;
import com.rigol.scope.databinding.AdapterTriggerSlopeBindingImpl;
import com.rigol.scope.databinding.AdapterTriggerSpiBindingImpl;
import com.rigol.scope.databinding.AdapterTriggerTimeoutBindingImpl;
import com.rigol.scope.databinding.AdapterTriggerVideoBindingImpl;
import com.rigol.scope.databinding.AdapterTypeCheckboxItemBindingImpl;
import com.rigol.scope.databinding.AdapterTypeSpinnerItemBindingImpl;
import com.rigol.scope.databinding.AdapterTypeSwitchItemBindingImpl;
import com.rigol.scope.databinding.AdapterTypeTextGroupBindingImpl;
import com.rigol.scope.databinding.AdapterTypeTextItemBindingImpl;
import com.rigol.scope.databinding.AdapterUtilityAboutItemBindingImpl;
import com.rigol.scope.databinding.AdapterUtilityAllmeasureBindingImpl;
import com.rigol.scope.databinding.AdapterUtilityAutosettingBindingImpl;
import com.rigol.scope.databinding.AdapterUtilityBasesettingBindingImpl;
import com.rigol.scope.databinding.AdapterUtilityCalibrationBindingImpl;
import com.rigol.scope.databinding.AdapterUtilityEmailBindingImpl;
import com.rigol.scope.databinding.AdapterUtilityInformationBindingImpl;
import com.rigol.scope.databinding.AdapterUtilityLansettingItemBindingImpl;
import com.rigol.scope.databinding.AdapterUtilityLansettingItemTestBindingImpl;
import com.rigol.scope.databinding.AdapterUtilityOtherBindingImpl;
import com.rigol.scope.databinding.AdapterUtilityQuickBindingImpl;
import com.rigol.scope.databinding.AdapterUtilityQuickScreenshotBindingImpl;
import com.rigol.scope.databinding.AdapterUtilityQuickTitleBindingImpl;
import com.rigol.scope.databinding.AdapterUtilitySaveGroupBindingImpl;
import com.rigol.scope.databinding.AdapterUtilitySaveWaveBindingImpl;
import com.rigol.scope.databinding.AdapterUtilityScreensaverBindingImpl;
import com.rigol.scope.databinding.AdapterUtilitySelfcheckBindingImpl;
import com.rigol.scope.databinding.AdapterUtiltyPowerItemBindingImpl;
import com.rigol.scope.databinding.AdapterWaveSaveBindingImpl;
import com.rigol.scope.databinding.BodeResultPopuwinBindingImpl;
import com.rigol.scope.databinding.CustomDatepickerDialogAntBindingImpl;
import com.rigol.scope.databinding.CustomTimepickerDialogAntBindingImpl;
import com.rigol.scope.databinding.FormatTransformKeyBindingImpl;
import com.rigol.scope.databinding.FragmentContBindingImpl;
import com.rigol.scope.databinding.FragmentNavigationBarBindingImpl;
import com.rigol.scope.databinding.FragmentResultsBarBindingImpl;
import com.rigol.scope.databinding.FragmentSettingsBarBindingImpl;
import com.rigol.scope.databinding.FragmentWaveformBindingImpl;
import com.rigol.scope.databinding.MathRecyclerviewBindingImpl;
import com.rigol.scope.databinding.PopupMathListBindingImpl;
import com.rigol.scope.databinding.PopupviewAdcSettingBindingImpl;
import com.rigol.scope.databinding.PopupviewAdcserBindingImpl;
import com.rigol.scope.databinding.PopupviewAfgAwgBindingImpl;
import com.rigol.scope.databinding.PopupviewAlertBindingImpl;
import com.rigol.scope.databinding.PopupviewAnalyseBindingImpl;
import com.rigol.scope.databinding.PopupviewAnalyseEthResultBindingImpl;
import com.rigol.scope.databinding.PopupviewAnalyseUsbResultBindingImpl;
import com.rigol.scope.databinding.PopupviewAutosetBindingImpl;
import com.rigol.scope.databinding.PopupviewBoardTestBindingImpl;
import com.rigol.scope.databinding.PopupviewBodeBindingImpl;
import com.rigol.scope.databinding.PopupviewBusAnalyseBindingImpl;
import com.rigol.scope.databinding.PopupviewCalibrationBindingImpl;
import com.rigol.scope.databinding.PopupviewCustomListBindingImpl;
import com.rigol.scope.databinding.PopupviewDdrBindingImpl;
import com.rigol.scope.databinding.PopupviewDecodeBindingImpl;
import com.rigol.scope.databinding.PopupviewDiskManageBindingImpl;
import com.rigol.scope.databinding.PopupviewDisplayBindingImpl;
import com.rigol.scope.databinding.PopupviewEyeBindingImpl;
import com.rigol.scope.databinding.PopupviewEyeconfigBindingImpl;
import com.rigol.scope.databinding.PopupviewEyemoveBindingImpl;
import com.rigol.scope.databinding.PopupviewFlexKnobBindingImpl;
import com.rigol.scope.databinding.PopupviewHorizontalBindingImpl;
import com.rigol.scope.databinding.PopupviewJitterBindingImpl;
import com.rigol.scope.databinding.PopupviewKeyboardBindingImpl;
import com.rigol.scope.databinding.PopupviewLaBindingImpl;
import com.rigol.scope.databinding.PopupviewLaCalibrationBindingImpl;
import com.rigol.scope.databinding.PopupviewLoadBindingImpl;
import com.rigol.scope.databinding.PopupviewLoadingBindingImpl;
import com.rigol.scope.databinding.PopupviewLogcatBindingImpl;
import com.rigol.scope.databinding.PopupviewMaskBindingImpl;
import com.rigol.scope.databinding.PopupviewMathBindingImpl;
import com.rigol.scope.databinding.PopupviewMeasureBindingImpl;
import com.rigol.scope.databinding.PopupviewMultiWindowBindingImpl;
import com.rigol.scope.databinding.PopupviewNavigateBindingImpl;
import com.rigol.scope.databinding.PopupviewOpensourceBindingImpl;
import com.rigol.scope.databinding.PopupviewProbeBindingImpl;
import com.rigol.scope.databinding.PopupviewRefBindingImpl;
import com.rigol.scope.databinding.PopupviewRemindBindingImpl;
import com.rigol.scope.databinding.PopupviewResultCounterBindingImpl;
import com.rigol.scope.databinding.PopupviewResultCursorBindingImpl;
import com.rigol.scope.databinding.PopupviewResultDvmBindingImpl;
import com.rigol.scope.databinding.PopupviewResultHistogramBindingImpl;
import com.rigol.scope.databinding.PopupviewResultMeasureBindingImpl;
import com.rigol.scope.databinding.PopupviewRtsaBindingImpl;
import com.rigol.scope.databinding.PopupviewSaveBindingImpl;
import com.rigol.scope.databinding.PopupviewScreenFlipBindingImpl;
import com.rigol.scope.databinding.PopupviewSearchBindingImpl;
import com.rigol.scope.databinding.PopupviewSpinnerBindingImpl;
import com.rigol.scope.databinding.PopupviewStartMenuBindingImpl;
import com.rigol.scope.databinding.PopupviewStorageBindingImpl;
import com.rigol.scope.databinding.PopupviewTriggerBindingImpl;
import com.rigol.scope.databinding.PopupviewUpaBindingImpl;
import com.rigol.scope.databinding.PopupviewUpdateBindingImpl;
import com.rigol.scope.databinding.PopupviewUpgradeBindingImpl;
import com.rigol.scope.databinding.PopupviewUtilityBindingImpl;
import com.rigol.scope.databinding.PopupviewVerticalBindingImpl;
import com.rigol.scope.databinding.PopupviewWaveIntensityBindingImpl;
import com.rigol.scope.databinding.PopupviewWaveRecordBindingImpl;
import com.rigol.scope.databinding.PopupviewXyBindingImpl;
import com.rigol.scope.databinding.PopuviewHelpBindingImpl;
import com.rigol.scope.databinding.PopuviewMiniBodeBindingImpl;
import com.rigol.scope.databinding.PresentationMiniscreenBindingImpl;
import com.rigol.scope.databinding.PresentationMotorBindingImpl;
import com.rigol.scope.databinding.TableSimpleBindingImpl;
import com.rigol.scope.databinding.UpaPoppviewRipperBindingImpl;
import com.rigol.scope.databinding.UpaPopupviewConnectionBindingImpl;
import com.rigol.scope.databinding.WindowBodeBindingImpl;
import com.rigol.scope.databinding.WindowSimpleBindingImpl;
import com.rigol.scope.databinding.WindowWaveformBindingImpl;
import com.sun.mail.imap.IMAPStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP;
    private static final int LAYOUT_ABAPTERLASENIOR = 1;
    private static final int LAYOUT_ACTIVITYIMAGEPREVIEW = 2;
    private static final int LAYOUT_ACTIVITYMAIN = 3;
    private static final int LAYOUT_ACTIVITYRIGOLKEYTEST2 = 4;
    private static final int LAYOUT_ACTIVITYRIGOLKEYTEST3 = 5;
    private static final int LAYOUT_ACTIVITYSCREENSAVER = 6;
    private static final int LAYOUT_ADAPTERAFG = 7;
    private static final int LAYOUT_ADAPTERAWG = 8;
    private static final int LAYOUT_ADAPTERBODEAFSENIOR = 9;
    private static final int LAYOUT_ADAPTERBODEBASICSENIOR = 10;
    private static final int LAYOUT_ADAPTERBODESAVINGSENIOR = 11;
    private static final int LAYOUT_ADAPTERBUSANALYSESELECTITEM = 12;
    private static final int LAYOUT_ADAPTERBUSETHANALYSE = 13;
    private static final int LAYOUT_ADAPTERBUSETHANALYSE1000BASET = 14;
    private static final int LAYOUT_ADAPTERBUSETHANALYSE100BASET = 15;
    private static final int LAYOUT_ADAPTERBUSETHANALYSE10BASET = 16;
    private static final int LAYOUT_ADAPTERBUSSETTING = 17;
    private static final int LAYOUT_ADAPTERBUSUSBANALYSE = 18;
    private static final int LAYOUT_ADAPTERDECODE1553B = 19;
    private static final int LAYOUT_ADAPTERDECODEARINC429 = 20;
    private static final int LAYOUT_ADAPTERDECODECAN = 21;
    private static final int LAYOUT_ADAPTERDECODEFLEXRAY = 22;
    private static final int LAYOUT_ADAPTERDECODEI2C = 23;
    private static final int LAYOUT_ADAPTERDECODEI2S = 24;
    private static final int LAYOUT_ADAPTERDECODELIN = 25;
    private static final int LAYOUT_ADAPTERDECODEMOST = 26;
    private static final int LAYOUT_ADAPTERDECODEPARALLEL = 27;
    private static final int LAYOUT_ADAPTERDECODERS232 = 28;
    private static final int LAYOUT_ADAPTERDECODESENT = 29;
    private static final int LAYOUT_ADAPTERDECODESPI = 30;
    private static final int LAYOUT_ADAPTERDECODEUSB = 31;
    private static final int LAYOUT_ADAPTEREYECONSTANT = 32;
    private static final int LAYOUT_ADAPTEREYEEXPLICIT = 33;
    private static final int LAYOUT_ADAPTEREYEPLL = 34;
    private static final int LAYOUT_ADAPTERITEMAUTOSET = 35;
    private static final int LAYOUT_ADAPTERITEMDISKMANAGE = 36;
    private static final int LAYOUT_ADAPTERITEMFLEXKNOB = 37;
    private static final int LAYOUT_ADAPTERITEMLA = 38;
    private static final int LAYOUT_ADAPTERITEMMATH = 39;
    private static final int LAYOUT_ADAPTERITEMOPTION = 40;
    private static final int LAYOUT_ADAPTERITEMPOPUPVIEWDECODE = 41;
    private static final int LAYOUT_ADAPTERITEMPOPUPVIEWFLEXKNOB = 42;
    private static final int LAYOUT_ADAPTERITEMPOPUPVIEWMEASURE = 43;
    private static final int LAYOUT_ADAPTERITEMPOPUPVIEWPROBE = 44;
    private static final int LAYOUT_ADAPTERITEMPOPUPVIEWVERTICAL = 45;
    private static final int LAYOUT_ADAPTERITEMQUALITY = 46;
    private static final int LAYOUT_ADAPTERITEMRECYCLERVIEW = 47;
    private static final int LAYOUT_ADAPTERITEMRESULTCOUNTER = 48;
    private static final int LAYOUT_ADAPTERITEMRESULTCURSOR = 49;
    private static final int LAYOUT_ADAPTERITEMRESULTDVM = 50;
    private static final int LAYOUT_ADAPTERITEMRESULTEYE = 51;
    private static final int LAYOUT_ADAPTERITEMRESULTHISTOGRAM = 52;
    private static final int LAYOUT_ADAPTERITEMRESULTITEM = 53;
    private static final int LAYOUT_ADAPTERITEMRESULTITEMTOWVIEW = 54;
    private static final int LAYOUT_ADAPTERITEMRESULTJITTER = 55;
    private static final int LAYOUT_ADAPTERITEMRESULTMARKER = 56;
    private static final int LAYOUT_ADAPTERITEMRESULTMASK = 57;
    private static final int LAYOUT_ADAPTERITEMRESULTMEASHISTOGRAM = 58;
    private static final int LAYOUT_ADAPTERITEMRESULTMEASURE = 59;
    private static final int LAYOUT_ADAPTERITEMRESULTTABLECONTENT = 60;
    private static final int LAYOUT_ADAPTERITEMRESULTTABLEHEADER = 61;
    private static final int LAYOUT_ADAPTERITEMRIPPLE = 62;
    private static final int LAYOUT_ADAPTERITEMRTSA = 63;
    private static final int LAYOUT_ADAPTERITEMSELFTEST = 64;
    private static final int LAYOUT_ADAPTERITEMSHORTCUT = 65;
    private static final int LAYOUT_ADAPTERITEMSIMPLE = 66;
    private static final int LAYOUT_ADAPTERITEMSIMPLE2 = 67;
    private static final int LAYOUT_ADAPTERITEMSIMPLE3 = 68;
    private static final int LAYOUT_ADAPTERITEMSIMPLE4 = 69;
    private static final int LAYOUT_ADAPTERITEMSPARRPWMATH = 70;
    private static final int LAYOUT_ADAPTERITEMSPINNER = 71;
    private static final int LAYOUT_ADAPTERITEMSPINNERDISK = 72;
    private static final int LAYOUT_ADAPTERITEMVERTICAL = 73;
    private static final int LAYOUT_ADAPTERJITTERCONSTANT = 74;
    private static final int LAYOUT_ADAPTERJITTEREXPLICIT = 75;
    private static final int LAYOUT_ADAPTERJITTERPLL = 76;
    private static final int LAYOUT_ADAPTERLABASIC = 77;
    private static final int LAYOUT_ADAPTERLACOLOR = 78;
    private static final int LAYOUT_ADAPTERMATHARITH = 79;
    private static final int LAYOUT_ADAPTERMATHFFT = 80;
    private static final int LAYOUT_ADAPTERMATHFILTER = 81;
    private static final int LAYOUT_ADAPTERMATHFUN = 82;
    private static final int LAYOUT_ADAPTERMATHLOGIC = 83;
    private static final int LAYOUT_ADAPTERRTSABASESETTING = 84;
    private static final int LAYOUT_ADAPTERRTSAMARKER = 85;
    private static final int LAYOUT_ADAPTERRTSAPEAK = 86;
    private static final int LAYOUT_ADAPTERSEARCHEDGE = 87;
    private static final int LAYOUT_ADAPTERSEARCHTRIGGERPULSE = 88;
    private static final int LAYOUT_ADAPTERSTATRESET = 89;
    private static final int LAYOUT_ADAPTERSTORAGELOAD = 90;
    private static final int LAYOUT_ADAPTERSTORAGESAVE = 91;
    private static final int LAYOUT_ADAPTERSTORAGEUPGRADE = 92;
    private static final int LAYOUT_ADAPTERTRIGGER1553B = 93;
    private static final int LAYOUT_ADAPTERTRIGGERCAN = 94;
    private static final int LAYOUT_ADAPTERTRIGGERDELAY = 95;
    private static final int LAYOUT_ADAPTERTRIGGERDURATION = 96;
    private static final int LAYOUT_ADAPTERTRIGGEREDGE = 97;
    private static final int LAYOUT_ADAPTERTRIGGERFLEXRAY = 98;
    private static final int LAYOUT_ADAPTERTRIGGERI2C = 99;
    private static final int LAYOUT_ADAPTERTRIGGERI2S = 100;
    private static final int LAYOUT_ADAPTERTRIGGERLIN = 101;
    private static final int LAYOUT_ADAPTERTRIGGERNTH = 102;
    private static final int LAYOUT_ADAPTERTRIGGEROVER = 103;
    private static final int LAYOUT_ADAPTERTRIGGERPATTERN = 104;
    private static final int LAYOUT_ADAPTERTRIGGERPULSE = 105;
    private static final int LAYOUT_ADAPTERTRIGGERRS232 = 106;
    private static final int LAYOUT_ADAPTERTRIGGERRUNT = 107;
    private static final int LAYOUT_ADAPTERTRIGGERSETUPHOLD = 108;
    private static final int LAYOUT_ADAPTERTRIGGERSLOPE = 109;
    private static final int LAYOUT_ADAPTERTRIGGERSPI = 110;
    private static final int LAYOUT_ADAPTERTRIGGERTIMEOUT = 111;
    private static final int LAYOUT_ADAPTERTRIGGERVIDEO = 112;
    private static final int LAYOUT_ADAPTERTYPECHECKBOXITEM = 113;
    private static final int LAYOUT_ADAPTERTYPESPINNERITEM = 114;
    private static final int LAYOUT_ADAPTERTYPESWITCHITEM = 115;
    private static final int LAYOUT_ADAPTERTYPETEXTGROUP = 116;
    private static final int LAYOUT_ADAPTERTYPETEXTITEM = 117;
    private static final int LAYOUT_ADAPTERUTILITYABOUTITEM = 118;
    private static final int LAYOUT_ADAPTERUTILITYALLMEASURE = 119;
    private static final int LAYOUT_ADAPTERUTILITYAUTOSETTING = 120;
    private static final int LAYOUT_ADAPTERUTILITYBASESETTING = 121;
    private static final int LAYOUT_ADAPTERUTILITYCALIBRATION = 122;
    private static final int LAYOUT_ADAPTERUTILITYEMAIL = 123;
    private static final int LAYOUT_ADAPTERUTILITYINFORMATION = 124;
    private static final int LAYOUT_ADAPTERUTILITYLANSETTINGITEM = 125;
    private static final int LAYOUT_ADAPTERUTILITYLANSETTINGITEMTEST = 126;
    private static final int LAYOUT_ADAPTERUTILITYOTHER = 127;
    private static final int LAYOUT_ADAPTERUTILITYQUICK = 128;
    private static final int LAYOUT_ADAPTERUTILITYQUICKSCREENSHOT = 129;
    private static final int LAYOUT_ADAPTERUTILITYQUICKTITLE = 130;
    private static final int LAYOUT_ADAPTERUTILITYSAVEGROUP = 131;
    private static final int LAYOUT_ADAPTERUTILITYSAVEWAVE = 132;
    private static final int LAYOUT_ADAPTERUTILITYSCREENSAVER = 133;
    private static final int LAYOUT_ADAPTERUTILITYSELFCHECK = 134;
    private static final int LAYOUT_ADAPTERUTILTYPOWERITEM = 135;
    private static final int LAYOUT_ADAPTERWAVESAVE = 136;
    private static final int LAYOUT_BODERESULTPOPUWIN = 137;
    private static final int LAYOUT_CUSTOMDATEPICKERDIALOGANT = 138;
    private static final int LAYOUT_CUSTOMTIMEPICKERDIALOGANT = 139;
    private static final int LAYOUT_FORMATTRANSFORMKEY = 140;
    private static final int LAYOUT_FRAGMENTCONT = 141;
    private static final int LAYOUT_FRAGMENTNAVIGATIONBAR = 142;
    private static final int LAYOUT_FRAGMENTRESULTSBAR = 143;
    private static final int LAYOUT_FRAGMENTSETTINGSBAR = 144;
    private static final int LAYOUT_FRAGMENTWAVEFORM = 145;
    private static final int LAYOUT_MATHRECYCLERVIEW = 146;
    private static final int LAYOUT_POPUPMATHLIST = 147;
    private static final int LAYOUT_POPUPVIEWADCSER = 149;
    private static final int LAYOUT_POPUPVIEWADCSETTING = 148;
    private static final int LAYOUT_POPUPVIEWAFGAWG = 150;
    private static final int LAYOUT_POPUPVIEWALERT = 151;
    private static final int LAYOUT_POPUPVIEWANALYSE = 152;
    private static final int LAYOUT_POPUPVIEWANALYSEETHRESULT = 153;
    private static final int LAYOUT_POPUPVIEWANALYSEUSBRESULT = 154;
    private static final int LAYOUT_POPUPVIEWAUTOSET = 155;
    private static final int LAYOUT_POPUPVIEWBOARDTEST = 156;
    private static final int LAYOUT_POPUPVIEWBODE = 157;
    private static final int LAYOUT_POPUPVIEWBUSANALYSE = 158;
    private static final int LAYOUT_POPUPVIEWCALIBRATION = 159;
    private static final int LAYOUT_POPUPVIEWCUSTOMLIST = 160;
    private static final int LAYOUT_POPUPVIEWDDR = 161;
    private static final int LAYOUT_POPUPVIEWDECODE = 162;
    private static final int LAYOUT_POPUPVIEWDISKMANAGE = 163;
    private static final int LAYOUT_POPUPVIEWDISPLAY = 164;
    private static final int LAYOUT_POPUPVIEWEYE = 165;
    private static final int LAYOUT_POPUPVIEWEYECONFIG = 166;
    private static final int LAYOUT_POPUPVIEWEYEMOVE = 167;
    private static final int LAYOUT_POPUPVIEWFLEXKNOB = 168;
    private static final int LAYOUT_POPUPVIEWHORIZONTAL = 169;
    private static final int LAYOUT_POPUPVIEWJITTER = 170;
    private static final int LAYOUT_POPUPVIEWKEYBOARD = 171;
    private static final int LAYOUT_POPUPVIEWLA = 172;
    private static final int LAYOUT_POPUPVIEWLACALIBRATION = 173;
    private static final int LAYOUT_POPUPVIEWLOAD = 174;
    private static final int LAYOUT_POPUPVIEWLOADING = 175;
    private static final int LAYOUT_POPUPVIEWLOGCAT = 176;
    private static final int LAYOUT_POPUPVIEWMASK = 177;
    private static final int LAYOUT_POPUPVIEWMATH = 178;
    private static final int LAYOUT_POPUPVIEWMEASURE = 179;
    private static final int LAYOUT_POPUPVIEWMULTIWINDOW = 180;
    private static final int LAYOUT_POPUPVIEWNAVIGATE = 181;
    private static final int LAYOUT_POPUPVIEWOPENSOURCE = 182;
    private static final int LAYOUT_POPUPVIEWPROBE = 183;
    private static final int LAYOUT_POPUPVIEWREF = 184;
    private static final int LAYOUT_POPUPVIEWREMIND = 185;
    private static final int LAYOUT_POPUPVIEWRESULTCOUNTER = 186;
    private static final int LAYOUT_POPUPVIEWRESULTCURSOR = 187;
    private static final int LAYOUT_POPUPVIEWRESULTDVM = 188;
    private static final int LAYOUT_POPUPVIEWRESULTHISTOGRAM = 189;
    private static final int LAYOUT_POPUPVIEWRESULTMEASURE = 190;
    private static final int LAYOUT_POPUPVIEWRTSA = 191;
    private static final int LAYOUT_POPUPVIEWSAVE = 192;
    private static final int LAYOUT_POPUPVIEWSCREENFLIP = 193;
    private static final int LAYOUT_POPUPVIEWSEARCH = 194;
    private static final int LAYOUT_POPUPVIEWSPINNER = 195;
    private static final int LAYOUT_POPUPVIEWSTARTMENU = 196;
    private static final int LAYOUT_POPUPVIEWSTORAGE = 197;
    private static final int LAYOUT_POPUPVIEWTRIGGER = 198;
    private static final int LAYOUT_POPUPVIEWUPA = 199;
    private static final int LAYOUT_POPUPVIEWUPDATE = 200;
    private static final int LAYOUT_POPUPVIEWUPGRADE = 201;
    private static final int LAYOUT_POPUPVIEWUTILITY = 202;
    private static final int LAYOUT_POPUPVIEWVERTICAL = 203;
    private static final int LAYOUT_POPUPVIEWWAVEINTENSITY = 204;
    private static final int LAYOUT_POPUPVIEWWAVERECORD = 205;
    private static final int LAYOUT_POPUPVIEWXY = 206;
    private static final int LAYOUT_POPUVIEWHELP = 207;
    private static final int LAYOUT_POPUVIEWMINIBODE = 208;
    private static final int LAYOUT_PRESENTATIONMINISCREEN = 209;
    private static final int LAYOUT_PRESENTATIONMOTOR = 210;
    private static final int LAYOUT_TABLESIMPLE = 211;
    private static final int LAYOUT_UPAPOPPVIEWRIPPER = 212;
    private static final int LAYOUT_UPAPOPUPVIEWCONNECTION = 213;
    private static final int LAYOUT_WINDOWBODE = 214;
    private static final int LAYOUT_WINDOWSIMPLE = 215;
    private static final int LAYOUT_WINDOWWAVEFORM = 216;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(216);
        INTERNAL_LAYOUT_ID_LOOKUP = sparseIntArray;
        sparseIntArray.put(R.layout.abapter_la_senior, 1);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.activity_image_preview, 2);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.activity_main, 3);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.activity_rigol_key_test2, 4);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.activity_rigol_key_test3, 5);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.activity_screen_saver, 6);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_afg, 7);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_awg, 8);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_bode_af_senior, 9);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_bode_basic_senior, 10);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_bode_saving_senior, 11);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_bus_analyse_select_item, 12);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_bus_eth_analyse, 13);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_bus_eth_analyse_1000baset, 14);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_bus_eth_analyse_100baset, 15);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_bus_eth_analyse_10baset, 16);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_bus_setting, 17);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_bus_usb_analyse, 18);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_decode_1553b, 19);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_decode_arinc429, 20);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_decode_can, 21);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_decode_flexray, 22);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_decode_i2c, 23);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_decode_i2s, 24);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_decode_lin, 25);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_decode_most, 26);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_decode_parallel, 27);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_decode_rs232, 28);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_decode_sent, 29);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_decode_spi, 30);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_decode_usb, 31);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_eye_constant, 32);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_eye_explicit, 33);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_eye_pll, 34);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_autoset, 35);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_disk_manage, 36);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_flex_knob, 37);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_la, 38);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_math, 39);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_option, 40);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_popupview_decode, 41);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_popupview_flex_knob, 42);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_popupview_measure, 43);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_popupview_probe, 44);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_popupview_vertical, 45);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_quality, 46);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_recyclerview, 47);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_result_counter, 48);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_result_cursor, 49);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_result_dvm, 50);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_result_eye, 51);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_result_histogram, 52);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_result_item, 53);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_result_item_towview, 54);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_result_jitter, 55);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_result_marker, 56);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_result_mask, 57);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_result_meas_histogram, 58);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_result_measure, 59);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_result_table_content, 60);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_result_table_header, 61);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_ripple, 62);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_rtsa, 63);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_self_test, 64);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_shortcut, 65);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_simple, 66);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_simple2, 67);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_simple3, 68);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_simple4, 69);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_sparrpw_math, 70);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_spinner, 71);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_spinner_disk, 72);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_item_vertical, 73);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_jitter_constant, 74);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_jitter_explicit, 75);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_jitter_pll, 76);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_la_basic, 77);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_la_color, 78);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_math_arith, 79);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_math_fft, 80);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_math_filter, 81);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_math_fun, 82);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_math_logic, 83);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_rtsa_basesetting, 84);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_rtsa_marker, 85);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_rtsa_peak, 86);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_search_edge, 87);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_search_trigger_pulse, 88);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_stat_reset, 89);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_storage_load, 90);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_storage_save, 91);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_storage_upgrade, 92);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_trigger_1553b, 93);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_trigger_can, 94);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_trigger_delay, 95);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_trigger_duration, 96);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_trigger_edge, 97);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_trigger_flexray, 98);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_trigger_i2c, 99);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_trigger_i2s, 100);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_trigger_lin, 101);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_trigger_nth, 102);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_trigger_over, 103);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_trigger_pattern, 104);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_trigger_pulse, 105);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_trigger_rs232, 106);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_trigger_runt, 107);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_trigger_setup_hold, 108);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_trigger_slope, 109);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_trigger_spi, 110);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_trigger_timeout, 111);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_trigger_video, 112);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_type_checkbox_item, 113);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_type_spinner_item, 114);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_type_switch_item, 115);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_type_text_group, 116);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_type_text_item, 117);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_utility_about_item, 118);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_utility_allmeasure, 119);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_utility_autosetting, 120);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_utility_basesetting, 121);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_utility_calibration, 122);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_utility_email, 123);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_utility_information, 124);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_utility_lansetting_item, 125);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_utility_lansetting_item_test, 126);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_utility_other, 127);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_utility_quick, 128);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_utility_quick_screenshot, 129);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_utility_quick_title, 130);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_utility_save_group, 131);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_utility_save_wave, 132);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_utility_screensaver, 133);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_utility_selfcheck, 134);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_utilty_power_item, 135);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.adapter_wave_save, 136);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.bode_result_popuwin, 137);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.custom_datepicker_dialog_ant, 138);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.custom_timepicker_dialog_ant, 139);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.format_transform_key, 140);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_cont, 141);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_navigation_bar, 142);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_results_bar, 143);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_settings_bar, 144);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_waveform, 145);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.math_recyclerview, 146);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popup_math_list, 147);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_adc_setting, 148);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_adcser, 149);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_afg_awg, 150);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_alert, 151);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_analyse, 152);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_analyse_eth_result, 153);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_analyse_usb_result, 154);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_autoset, 155);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_board_test, 156);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_bode, 157);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_bus_analyse, 158);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_calibration, 159);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_custom_list, 160);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_ddr, 161);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_decode, 162);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_disk_manage, 163);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_display, 164);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_eye, 165);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_eyeconfig, 166);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_eyemove, 167);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_flex_knob, 168);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_horizontal, 169);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_jitter, 170);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_keyboard, 171);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_la, 172);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_la_calibration, 173);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_load, 174);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_loading, 175);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_logcat, 176);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_mask, 177);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_math, 178);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_measure, 179);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_multi_window, 180);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_navigate, 181);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_opensource, 182);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_probe, 183);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_ref, 184);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_remind, 185);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_result_counter, 186);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_result_cursor, 187);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_result_dvm, 188);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_result_histogram, 189);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_result_measure, 190);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_rtsa, 191);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_save, 192);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_screen_flip, 193);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_search, 194);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_spinner, 195);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_start_menu, 196);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_storage, 197);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_trigger, 198);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_upa, 199);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_update, 200);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_upgrade, 201);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_utility, 202);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_vertical, 203);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_wave_intensity, 204);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_wave_record, 205);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popupview_xy, 206);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popuview_help, 207);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popuview_mini_bode, 208);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.presentation_miniscreen, 209);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.presentation_motor, 210);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.table_simple, 211);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.upa_poppview_ripper, 212);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.upa_popupview_connection, 213);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.window_bode, 214);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.window_simple, 215);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.window_waveform, 216);
    }

    private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 1:
                if ("layout/abapter_la_senior_0".equals(obj)) {
                    return new AbapterLaSeniorBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for abapter_la_senior is invalid. Received: " + obj);
            case 2:
                if ("layout/activity_image_preview_0".equals(obj)) {
                    return new ActivityImagePreviewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_image_preview is invalid. Received: " + obj);
            case 3:
                if ("layout/activity_main_0".equals(obj)) {
                    return new ActivityMainBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + obj);
            case 4:
                if ("layout/activity_rigol_key_test2_0".equals(obj)) {
                    return new ActivityRigolKeyTest2BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_rigol_key_test2 is invalid. Received: " + obj);
            case 5:
                if ("layout/activity_rigol_key_test3_0".equals(obj)) {
                    return new ActivityRigolKeyTest3BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_rigol_key_test3 is invalid. Received: " + obj);
            case 6:
                if ("layout/activity_screen_saver_0".equals(obj)) {
                    return new ActivityScreenSaverBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_screen_saver is invalid. Received: " + obj);
            case 7:
                if ("layout/adapter_afg_0".equals(obj)) {
                    return new AdapterAfgBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_afg is invalid. Received: " + obj);
            case 8:
                if ("layout/adapter_awg_0".equals(obj)) {
                    return new AdapterAwgBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_awg is invalid. Received: " + obj);
            case 9:
                if ("layout/adapter_bode_af_senior_0".equals(obj)) {
                    return new AdapterBodeAfSeniorBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_bode_af_senior is invalid. Received: " + obj);
            case 10:
                if ("layout/adapter_bode_basic_senior_0".equals(obj)) {
                    return new AdapterBodeBasicSeniorBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_bode_basic_senior is invalid. Received: " + obj);
            case 11:
                if ("layout/adapter_bode_saving_senior_0".equals(obj)) {
                    return new AdapterBodeSavingSeniorBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_bode_saving_senior is invalid. Received: " + obj);
            case 12:
                if ("layout/adapter_bus_analyse_select_item_0".equals(obj)) {
                    return new AdapterBusAnalyseSelectItemBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_bus_analyse_select_item is invalid. Received: " + obj);
            case 13:
                if ("layout/adapter_bus_eth_analyse_0".equals(obj)) {
                    return new AdapterBusEthAnalyseBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_bus_eth_analyse is invalid. Received: " + obj);
            case 14:
                if ("layout/adapter_bus_eth_analyse_1000baset_0".equals(obj)) {
                    return new AdapterBusEthAnalyse1000basetBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_bus_eth_analyse_1000baset is invalid. Received: " + obj);
            case 15:
                if ("layout/adapter_bus_eth_analyse_100baset_0".equals(obj)) {
                    return new AdapterBusEthAnalyse100basetBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_bus_eth_analyse_100baset is invalid. Received: " + obj);
            case 16:
                if ("layout/adapter_bus_eth_analyse_10baset_0".equals(obj)) {
                    return new AdapterBusEthAnalyse10basetBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_bus_eth_analyse_10baset is invalid. Received: " + obj);
            case 17:
                if ("layout/adapter_bus_setting_0".equals(obj)) {
                    return new AdapterBusSettingBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_bus_setting is invalid. Received: " + obj);
            case 18:
                if ("layout/adapter_bus_usb_analyse_0".equals(obj)) {
                    return new AdapterBusUsbAnalyseBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_bus_usb_analyse is invalid. Received: " + obj);
            case 19:
                if ("layout/adapter_decode_1553b_0".equals(obj)) {
                    return new AdapterDecode1553bBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_decode_1553b is invalid. Received: " + obj);
            case 20:
                if ("layout/adapter_decode_arinc429_0".equals(obj)) {
                    return new AdapterDecodeArinc429BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_decode_arinc429 is invalid. Received: " + obj);
            case 21:
                if ("layout/adapter_decode_can_0".equals(obj)) {
                    return new AdapterDecodeCanBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_decode_can is invalid. Received: " + obj);
            case 22:
                if ("layout/adapter_decode_flexray_0".equals(obj)) {
                    return new AdapterDecodeFlexrayBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_decode_flexray is invalid. Received: " + obj);
            case 23:
                if ("layout/adapter_decode_i2c_0".equals(obj)) {
                    return new AdapterDecodeI2cBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_decode_i2c is invalid. Received: " + obj);
            case 24:
                if ("layout/adapter_decode_i2s_0".equals(obj)) {
                    return new AdapterDecodeI2sBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_decode_i2s is invalid. Received: " + obj);
            case 25:
                if ("layout/adapter_decode_lin_0".equals(obj)) {
                    return new AdapterDecodeLinBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_decode_lin is invalid. Received: " + obj);
            case 26:
                if ("layout/adapter_decode_most_0".equals(obj)) {
                    return new AdapterDecodeMostBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_decode_most is invalid. Received: " + obj);
            case 27:
                if ("layout/adapter_decode_parallel_0".equals(obj)) {
                    return new AdapterDecodeParallelBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_decode_parallel is invalid. Received: " + obj);
            case 28:
                if ("layout/adapter_decode_rs232_0".equals(obj)) {
                    return new AdapterDecodeRs232BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_decode_rs232 is invalid. Received: " + obj);
            case 29:
                if ("layout/adapter_decode_sent_0".equals(obj)) {
                    return new AdapterDecodeSentBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_decode_sent is invalid. Received: " + obj);
            case 30:
                if ("layout/adapter_decode_spi_0".equals(obj)) {
                    return new AdapterDecodeSpiBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_decode_spi is invalid. Received: " + obj);
            case 31:
                if ("layout/adapter_decode_usb_0".equals(obj)) {
                    return new AdapterDecodeUsbBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_decode_usb is invalid. Received: " + obj);
            case 32:
                if ("layout/adapter_eye_constant_0".equals(obj)) {
                    return new AdapterEyeConstantBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_eye_constant is invalid. Received: " + obj);
            case 33:
                if ("layout/adapter_eye_explicit_0".equals(obj)) {
                    return new AdapterEyeExplicitBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_eye_explicit is invalid. Received: " + obj);
            case 34:
                if ("layout/adapter_eye_pll_0".equals(obj)) {
                    return new AdapterEyePllBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_eye_pll is invalid. Received: " + obj);
            case 35:
                if ("layout/adapter_item_autoset_0".equals(obj)) {
                    return new AdapterItemAutosetBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_autoset is invalid. Received: " + obj);
            case 36:
                if ("layout/adapter_item_disk_manage_0".equals(obj)) {
                    return new AdapterItemDiskManageBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_disk_manage is invalid. Received: " + obj);
            case 37:
                if ("layout/adapter_item_flex_knob_0".equals(obj)) {
                    return new AdapterItemFlexKnobBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_flex_knob is invalid. Received: " + obj);
            case 38:
                if ("layout/adapter_item_la_0".equals(obj)) {
                    return new AdapterItemLaBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_la is invalid. Received: " + obj);
            case 39:
                if ("layout/adapter_item_math_0".equals(obj)) {
                    return new AdapterItemMathBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_math is invalid. Received: " + obj);
            case 40:
                if ("layout/adapter_item_option_0".equals(obj)) {
                    return new AdapterItemOptionBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_option is invalid. Received: " + obj);
            case 41:
                if ("layout/adapter_item_popupview_decode_0".equals(obj)) {
                    return new AdapterItemPopupviewDecodeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_popupview_decode is invalid. Received: " + obj);
            case 42:
                if ("layout/adapter_item_popupview_flex_knob_0".equals(obj)) {
                    return new AdapterItemPopupviewFlexKnobBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_popupview_flex_knob is invalid. Received: " + obj);
            case 43:
                if ("layout/adapter_item_popupview_measure_0".equals(obj)) {
                    return new AdapterItemPopupviewMeasureBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_popupview_measure is invalid. Received: " + obj);
            case 44:
                if ("layout/adapter_item_popupview_probe_0".equals(obj)) {
                    return new AdapterItemPopupviewProbeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_popupview_probe is invalid. Received: " + obj);
            case 45:
                if ("layout/adapter_item_popupview_vertical_0".equals(obj)) {
                    return new AdapterItemPopupviewVerticalBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_popupview_vertical is invalid. Received: " + obj);
            case 46:
                if ("layout/adapter_item_quality_0".equals(obj)) {
                    return new AdapterItemQualityBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_quality is invalid. Received: " + obj);
            case 47:
                if ("layout/adapter_item_recyclerview_0".equals(obj)) {
                    return new AdapterItemRecyclerviewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_recyclerview is invalid. Received: " + obj);
            case 48:
                if ("layout/adapter_item_result_counter_0".equals(obj)) {
                    return new AdapterItemResultCounterBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_result_counter is invalid. Received: " + obj);
            case 49:
                if ("layout/adapter_item_result_cursor_0".equals(obj)) {
                    return new AdapterItemResultCursorBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_result_cursor is invalid. Received: " + obj);
            case 50:
                if ("layout/adapter_item_result_dvm_0".equals(obj)) {
                    return new AdapterItemResultDvmBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_result_dvm is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 51:
                if ("layout/adapter_item_result_eye_0".equals(obj)) {
                    return new AdapterItemResultEyeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_result_eye is invalid. Received: " + obj);
            case 52:
                if ("layout/adapter_item_result_histogram_0".equals(obj)) {
                    return new AdapterItemResultHistogramBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_result_histogram is invalid. Received: " + obj);
            case 53:
                if ("layout/adapter_item_result_item_0".equals(obj)) {
                    return new AdapterItemResultItemBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_result_item is invalid. Received: " + obj);
            case 54:
                if ("layout/adapter_item_result_item_towview_0".equals(obj)) {
                    return new AdapterItemResultItemTowviewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_result_item_towview is invalid. Received: " + obj);
            case 55:
                if ("layout/adapter_item_result_jitter_0".equals(obj)) {
                    return new AdapterItemResultJitterBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_result_jitter is invalid. Received: " + obj);
            case 56:
                if ("layout/adapter_item_result_marker_0".equals(obj)) {
                    return new AdapterItemResultMarkerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_result_marker is invalid. Received: " + obj);
            case 57:
                if ("layout/adapter_item_result_mask_0".equals(obj)) {
                    return new AdapterItemResultMaskBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_result_mask is invalid. Received: " + obj);
            case 58:
                if ("layout/adapter_item_result_meas_histogram_0".equals(obj)) {
                    return new AdapterItemResultMeasHistogramBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_result_meas_histogram is invalid. Received: " + obj);
            case 59:
                if ("layout/adapter_item_result_measure_0".equals(obj)) {
                    return new AdapterItemResultMeasureBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_result_measure is invalid. Received: " + obj);
            case 60:
                if ("layout/adapter_item_result_table_content_0".equals(obj)) {
                    return new AdapterItemResultTableContentBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_result_table_content is invalid. Received: " + obj);
            case 61:
                if ("layout/adapter_item_result_table_header_0".equals(obj)) {
                    return new AdapterItemResultTableHeaderBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_result_table_header is invalid. Received: " + obj);
            case 62:
                if ("layout/adapter_item_ripple_0".equals(obj)) {
                    return new AdapterItemRippleBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_ripple is invalid. Received: " + obj);
            case 63:
                if ("layout/adapter_item_rtsa_0".equals(obj)) {
                    return new AdapterItemRtsaBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_rtsa is invalid. Received: " + obj);
            case 64:
                if ("layout/adapter_item_self_test_0".equals(obj)) {
                    return new AdapterItemSelfTestBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_self_test is invalid. Received: " + obj);
            case 65:
                if ("layout/adapter_item_shortcut_0".equals(obj)) {
                    return new AdapterItemShortcutBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_shortcut is invalid. Received: " + obj);
            case 66:
                if ("layout/adapter_item_simple_0".equals(obj)) {
                    return new AdapterItemSimpleBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_simple is invalid. Received: " + obj);
            case 67:
                if ("layout/adapter_item_simple2_0".equals(obj)) {
                    return new AdapterItemSimple2BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_simple2 is invalid. Received: " + obj);
            case 68:
                if ("layout/adapter_item_simple3_0".equals(obj)) {
                    return new AdapterItemSimple3BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_simple3 is invalid. Received: " + obj);
            case 69:
                if ("layout/adapter_item_simple4_0".equals(obj)) {
                    return new AdapterItemSimple4BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_simple4 is invalid. Received: " + obj);
            case 70:
                if ("layout/adapter_item_sparrpw_math_0".equals(obj)) {
                    return new AdapterItemSparrpwMathBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_sparrpw_math is invalid. Received: " + obj);
            case 71:
                if ("layout/adapter_item_spinner_0".equals(obj)) {
                    return new AdapterItemSpinnerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_spinner is invalid. Received: " + obj);
            case 72:
                if ("layout/adapter_item_spinner_disk_0".equals(obj)) {
                    return new AdapterItemSpinnerDiskBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_spinner_disk is invalid. Received: " + obj);
            case 73:
                if ("layout/adapter_item_vertical_0".equals(obj)) {
                    return new AdapterItemVerticalBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_item_vertical is invalid. Received: " + obj);
            case 74:
                if ("layout/adapter_jitter_constant_0".equals(obj)) {
                    return new AdapterJitterConstantBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_jitter_constant is invalid. Received: " + obj);
            case 75:
                if ("layout/adapter_jitter_explicit_0".equals(obj)) {
                    return new AdapterJitterExplicitBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_jitter_explicit is invalid. Received: " + obj);
            case 76:
                if ("layout/adapter_jitter_pll_0".equals(obj)) {
                    return new AdapterJitterPllBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_jitter_pll is invalid. Received: " + obj);
            case 77:
                if ("layout/adapter_la_basic_0".equals(obj)) {
                    return new AdapterLaBasicBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_la_basic is invalid. Received: " + obj);
            case 78:
                if ("layout/adapter_la_color_0".equals(obj)) {
                    return new AdapterLaColorBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_la_color is invalid. Received: " + obj);
            case 79:
                if ("layout/adapter_math_arith_0".equals(obj)) {
                    return new AdapterMathArithBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_math_arith is invalid. Received: " + obj);
            case 80:
                if ("layout/adapter_math_fft_0".equals(obj)) {
                    return new AdapterMathFftBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_math_fft is invalid. Received: " + obj);
            case 81:
                if ("layout/adapter_math_filter_0".equals(obj)) {
                    return new AdapterMathFilterBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_math_filter is invalid. Received: " + obj);
            case 82:
                if ("layout/adapter_math_fun_0".equals(obj)) {
                    return new AdapterMathFunBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_math_fun is invalid. Received: " + obj);
            case 83:
                if ("layout/adapter_math_logic_0".equals(obj)) {
                    return new AdapterMathLogicBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_math_logic is invalid. Received: " + obj);
            case 84:
                if ("layout/adapter_rtsa_basesetting_0".equals(obj)) {
                    return new AdapterRtsaBasesettingBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_rtsa_basesetting is invalid. Received: " + obj);
            case 85:
                if ("layout/adapter_rtsa_marker_0".equals(obj)) {
                    return new AdapterRtsaMarkerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_rtsa_marker is invalid. Received: " + obj);
            case 86:
                if ("layout/adapter_rtsa_peak_0".equals(obj)) {
                    return new AdapterRtsaPeakBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_rtsa_peak is invalid. Received: " + obj);
            case 87:
                if ("layout/adapter_search_edge_0".equals(obj)) {
                    return new AdapterSearchEdgeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_search_edge is invalid. Received: " + obj);
            case 88:
                if ("layout/adapter_search_trigger_pulse_0".equals(obj)) {
                    return new AdapterSearchTriggerPulseBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_search_trigger_pulse is invalid. Received: " + obj);
            case 89:
                if ("layout/adapter_stat_reset_0".equals(obj)) {
                    return new AdapterStatResetBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_stat_reset is invalid. Received: " + obj);
            case 90:
                if ("layout/adapter_storage_load_0".equals(obj)) {
                    return new AdapterStorageLoadBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_storage_load is invalid. Received: " + obj);
            case 91:
                if ("layout/adapter_storage_save_0".equals(obj)) {
                    return new AdapterStorageSaveBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_storage_save is invalid. Received: " + obj);
            case 92:
                if ("layout/adapter_storage_upgrade_0".equals(obj)) {
                    return new AdapterStorageUpgradeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_storage_upgrade is invalid. Received: " + obj);
            case 93:
                if ("layout/adapter_trigger_1553b_0".equals(obj)) {
                    return new AdapterTrigger1553bBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_trigger_1553b is invalid. Received: " + obj);
            case 94:
                if ("layout/adapter_trigger_can_0".equals(obj)) {
                    return new AdapterTriggerCanBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_trigger_can is invalid. Received: " + obj);
            case 95:
                if ("layout/adapter_trigger_delay_0".equals(obj)) {
                    return new AdapterTriggerDelayBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_trigger_delay is invalid. Received: " + obj);
            case 96:
                if ("layout/adapter_trigger_duration_0".equals(obj)) {
                    return new AdapterTriggerDurationBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_trigger_duration is invalid. Received: " + obj);
            case 97:
                if ("layout/adapter_trigger_edge_0".equals(obj)) {
                    return new AdapterTriggerEdgeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_trigger_edge is invalid. Received: " + obj);
            case 98:
                if ("layout/adapter_trigger_flexray_0".equals(obj)) {
                    return new AdapterTriggerFlexrayBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_trigger_flexray is invalid. Received: " + obj);
            case 99:
                if ("layout/adapter_trigger_i2c_0".equals(obj)) {
                    return new AdapterTriggerI2cBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_trigger_i2c is invalid. Received: " + obj);
            case 100:
                if ("layout/adapter_trigger_i2s_0".equals(obj)) {
                    return new AdapterTriggerI2sBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_trigger_i2s is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final ViewDataBinding internalGetViewDataBinding2(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 101:
                if ("layout/adapter_trigger_lin_0".equals(obj)) {
                    return new AdapterTriggerLinBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_trigger_lin is invalid. Received: " + obj);
            case 102:
                if ("layout/adapter_trigger_nth_0".equals(obj)) {
                    return new AdapterTriggerNthBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_trigger_nth is invalid. Received: " + obj);
            case 103:
                if ("layout/adapter_trigger_over_0".equals(obj)) {
                    return new AdapterTriggerOverBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_trigger_over is invalid. Received: " + obj);
            case 104:
                if ("layout/adapter_trigger_pattern_0".equals(obj)) {
                    return new AdapterTriggerPatternBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_trigger_pattern is invalid. Received: " + obj);
            case 105:
                if ("layout/adapter_trigger_pulse_0".equals(obj)) {
                    return new AdapterTriggerPulseBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_trigger_pulse is invalid. Received: " + obj);
            case 106:
                if ("layout/adapter_trigger_rs232_0".equals(obj)) {
                    return new AdapterTriggerRs232BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_trigger_rs232 is invalid. Received: " + obj);
            case 107:
                if ("layout/adapter_trigger_runt_0".equals(obj)) {
                    return new AdapterTriggerRuntBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_trigger_runt is invalid. Received: " + obj);
            case 108:
                if ("layout/adapter_trigger_setup_hold_0".equals(obj)) {
                    return new AdapterTriggerSetupHoldBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_trigger_setup_hold is invalid. Received: " + obj);
            case 109:
                if ("layout/adapter_trigger_slope_0".equals(obj)) {
                    return new AdapterTriggerSlopeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_trigger_slope is invalid. Received: " + obj);
            case 110:
                if ("layout/adapter_trigger_spi_0".equals(obj)) {
                    return new AdapterTriggerSpiBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_trigger_spi is invalid. Received: " + obj);
            case 111:
                if ("layout/adapter_trigger_timeout_0".equals(obj)) {
                    return new AdapterTriggerTimeoutBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_trigger_timeout is invalid. Received: " + obj);
            case 112:
                if ("layout/adapter_trigger_video_0".equals(obj)) {
                    return new AdapterTriggerVideoBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_trigger_video is invalid. Received: " + obj);
            case 113:
                if ("layout/adapter_type_checkbox_item_0".equals(obj)) {
                    return new AdapterTypeCheckboxItemBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_type_checkbox_item is invalid. Received: " + obj);
            case 114:
                if ("layout/adapter_type_spinner_item_0".equals(obj)) {
                    return new AdapterTypeSpinnerItemBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_type_spinner_item is invalid. Received: " + obj);
            case 115:
                if ("layout/adapter_type_switch_item_0".equals(obj)) {
                    return new AdapterTypeSwitchItemBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_type_switch_item is invalid. Received: " + obj);
            case 116:
                if ("layout/adapter_type_text_group_0".equals(obj)) {
                    return new AdapterTypeTextGroupBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_type_text_group is invalid. Received: " + obj);
            case 117:
                if ("layout/adapter_type_text_item_0".equals(obj)) {
                    return new AdapterTypeTextItemBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_type_text_item is invalid. Received: " + obj);
            case 118:
                if ("layout/adapter_utility_about_item_0".equals(obj)) {
                    return new AdapterUtilityAboutItemBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_utility_about_item is invalid. Received: " + obj);
            case 119:
                if ("layout/adapter_utility_allmeasure_0".equals(obj)) {
                    return new AdapterUtilityAllmeasureBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_utility_allmeasure is invalid. Received: " + obj);
            case 120:
                if ("layout/adapter_utility_autosetting_0".equals(obj)) {
                    return new AdapterUtilityAutosettingBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_utility_autosetting is invalid. Received: " + obj);
            case 121:
                if ("layout/adapter_utility_basesetting_0".equals(obj)) {
                    return new AdapterUtilityBasesettingBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_utility_basesetting is invalid. Received: " + obj);
            case 122:
                if ("layout/adapter_utility_calibration_0".equals(obj)) {
                    return new AdapterUtilityCalibrationBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_utility_calibration is invalid. Received: " + obj);
            case 123:
                if ("layout/adapter_utility_email_0".equals(obj)) {
                    return new AdapterUtilityEmailBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_utility_email is invalid. Received: " + obj);
            case 124:
                if ("layout/adapter_utility_information_0".equals(obj)) {
                    return new AdapterUtilityInformationBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_utility_information is invalid. Received: " + obj);
            case 125:
                if ("layout/adapter_utility_lansetting_item_0".equals(obj)) {
                    return new AdapterUtilityLansettingItemBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_utility_lansetting_item is invalid. Received: " + obj);
            case 126:
                if ("layout/adapter_utility_lansetting_item_test_0".equals(obj)) {
                    return new AdapterUtilityLansettingItemTestBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_utility_lansetting_item_test is invalid. Received: " + obj);
            case 127:
                if ("layout/adapter_utility_other_0".equals(obj)) {
                    return new AdapterUtilityOtherBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_utility_other is invalid. Received: " + obj);
            case 128:
                if ("layout/adapter_utility_quick_0".equals(obj)) {
                    return new AdapterUtilityQuickBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_utility_quick is invalid. Received: " + obj);
            case 129:
                if ("layout/adapter_utility_quick_screenshot_0".equals(obj)) {
                    return new AdapterUtilityQuickScreenshotBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_utility_quick_screenshot is invalid. Received: " + obj);
            case 130:
                if ("layout/adapter_utility_quick_title_0".equals(obj)) {
                    return new AdapterUtilityQuickTitleBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_utility_quick_title is invalid. Received: " + obj);
            case 131:
                if ("layout/adapter_utility_save_group_0".equals(obj)) {
                    return new AdapterUtilitySaveGroupBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_utility_save_group is invalid. Received: " + obj);
            case 132:
                if ("layout/adapter_utility_save_wave_0".equals(obj)) {
                    return new AdapterUtilitySaveWaveBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_utility_save_wave is invalid. Received: " + obj);
            case 133:
                if ("layout/adapter_utility_screensaver_0".equals(obj)) {
                    return new AdapterUtilityScreensaverBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_utility_screensaver is invalid. Received: " + obj);
            case 134:
                if ("layout/adapter_utility_selfcheck_0".equals(obj)) {
                    return new AdapterUtilitySelfcheckBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_utility_selfcheck is invalid. Received: " + obj);
            case 135:
                if ("layout/adapter_utilty_power_item_0".equals(obj)) {
                    return new AdapterUtiltyPowerItemBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_utilty_power_item is invalid. Received: " + obj);
            case 136:
                if ("layout/adapter_wave_save_0".equals(obj)) {
                    return new AdapterWaveSaveBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_wave_save is invalid. Received: " + obj);
            case 137:
                if ("layout/bode_result_popuwin_0".equals(obj)) {
                    return new BodeResultPopuwinBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bode_result_popuwin is invalid. Received: " + obj);
            case 138:
                if ("layout/custom_datepicker_dialog_ant_0".equals(obj)) {
                    return new CustomDatepickerDialogAntBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for custom_datepicker_dialog_ant is invalid. Received: " + obj);
            case 139:
                if ("layout/custom_timepicker_dialog_ant_0".equals(obj)) {
                    return new CustomTimepickerDialogAntBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for custom_timepicker_dialog_ant is invalid. Received: " + obj);
            case 140:
                if ("layout/format_transform_key_0".equals(obj)) {
                    return new FormatTransformKeyBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for format_transform_key is invalid. Received: " + obj);
            case 141:
                if ("layout/fragment_cont_0".equals(obj)) {
                    return new FragmentContBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_cont is invalid. Received: " + obj);
            case 142:
                if ("layout/fragment_navigation_bar_0".equals(obj)) {
                    return new FragmentNavigationBarBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_navigation_bar is invalid. Received: " + obj);
            case 143:
                if ("layout/fragment_results_bar_0".equals(obj)) {
                    return new FragmentResultsBarBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_results_bar is invalid. Received: " + obj);
            case 144:
                if ("layout/fragment_settings_bar_0".equals(obj)) {
                    return new FragmentSettingsBarBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_settings_bar is invalid. Received: " + obj);
            case 145:
                if ("layout/fragment_waveform_0".equals(obj)) {
                    return new FragmentWaveformBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_waveform is invalid. Received: " + obj);
            case 146:
                if ("layout/math_recyclerview_0".equals(obj)) {
                    return new MathRecyclerviewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for math_recyclerview is invalid. Received: " + obj);
            case 147:
                if ("layout/popup_math_list_0".equals(obj)) {
                    return new PopupMathListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popup_math_list is invalid. Received: " + obj);
            case 148:
                if ("layout/popupview_adc_setting_0".equals(obj)) {
                    return new PopupviewAdcSettingBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_adc_setting is invalid. Received: " + obj);
            case 149:
                if ("layout/popupview_adcser_0".equals(obj)) {
                    return new PopupviewAdcserBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_adcser is invalid. Received: " + obj);
            case 150:
                if ("layout/popupview_afg_awg_0".equals(obj)) {
                    return new PopupviewAfgAwgBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_afg_awg is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final ViewDataBinding internalGetViewDataBinding3(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 151:
                if ("layout/popupview_alert_0".equals(obj)) {
                    return new PopupviewAlertBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_alert is invalid. Received: " + obj);
            case 152:
                if ("layout/popupview_analyse_0".equals(obj)) {
                    return new PopupviewAnalyseBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_analyse is invalid. Received: " + obj);
            case 153:
                if ("layout/popupview_analyse_eth_result_0".equals(obj)) {
                    return new PopupviewAnalyseEthResultBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_analyse_eth_result is invalid. Received: " + obj);
            case 154:
                if ("layout/popupview_analyse_usb_result_0".equals(obj)) {
                    return new PopupviewAnalyseUsbResultBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_analyse_usb_result is invalid. Received: " + obj);
            case 155:
                if ("layout/popupview_autoset_0".equals(obj)) {
                    return new PopupviewAutosetBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_autoset is invalid. Received: " + obj);
            case 156:
                if ("layout/popupview_board_test_0".equals(obj)) {
                    return new PopupviewBoardTestBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_board_test is invalid. Received: " + obj);
            case 157:
                if ("layout/popupview_bode_0".equals(obj)) {
                    return new PopupviewBodeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_bode is invalid. Received: " + obj);
            case 158:
                if ("layout/popupview_bus_analyse_0".equals(obj)) {
                    return new PopupviewBusAnalyseBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_bus_analyse is invalid. Received: " + obj);
            case 159:
                if ("layout/popupview_calibration_0".equals(obj)) {
                    return new PopupviewCalibrationBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_calibration is invalid. Received: " + obj);
            case 160:
                if ("layout/popupview_custom_list_0".equals(obj)) {
                    return new PopupviewCustomListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_custom_list is invalid. Received: " + obj);
            case 161:
                if ("layout/popupview_ddr_0".equals(obj)) {
                    return new PopupviewDdrBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_ddr is invalid. Received: " + obj);
            case 162:
                if ("layout/popupview_decode_0".equals(obj)) {
                    return new PopupviewDecodeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_decode is invalid. Received: " + obj);
            case 163:
                if ("layout/popupview_disk_manage_0".equals(obj)) {
                    return new PopupviewDiskManageBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_disk_manage is invalid. Received: " + obj);
            case 164:
                if ("layout/popupview_display_0".equals(obj)) {
                    return new PopupviewDisplayBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_display is invalid. Received: " + obj);
            case 165:
                if ("layout/popupview_eye_0".equals(obj)) {
                    return new PopupviewEyeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_eye is invalid. Received: " + obj);
            case 166:
                if ("layout/popupview_eyeconfig_0".equals(obj)) {
                    return new PopupviewEyeconfigBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_eyeconfig is invalid. Received: " + obj);
            case 167:
                if ("layout/popupview_eyemove_0".equals(obj)) {
                    return new PopupviewEyemoveBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_eyemove is invalid. Received: " + obj);
            case 168:
                if ("layout/popupview_flex_knob_0".equals(obj)) {
                    return new PopupviewFlexKnobBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_flex_knob is invalid. Received: " + obj);
            case 169:
                if ("layout/popupview_horizontal_0".equals(obj)) {
                    return new PopupviewHorizontalBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_horizontal is invalid. Received: " + obj);
            case 170:
                if ("layout/popupview_jitter_0".equals(obj)) {
                    return new PopupviewJitterBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_jitter is invalid. Received: " + obj);
            case 171:
                if ("layout/popupview_keyboard_0".equals(obj)) {
                    return new PopupviewKeyboardBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_keyboard is invalid. Received: " + obj);
            case 172:
                if ("layout/popupview_la_0".equals(obj)) {
                    return new PopupviewLaBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_la is invalid. Received: " + obj);
            case 173:
                if ("layout/popupview_la_calibration_0".equals(obj)) {
                    return new PopupviewLaCalibrationBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_la_calibration is invalid. Received: " + obj);
            case 174:
                if ("layout/popupview_load_0".equals(obj)) {
                    return new PopupviewLoadBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_load is invalid. Received: " + obj);
            case 175:
                if ("layout/popupview_loading_0".equals(obj)) {
                    return new PopupviewLoadingBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_loading is invalid. Received: " + obj);
            case 176:
                if ("layout/popupview_logcat_0".equals(obj)) {
                    return new PopupviewLogcatBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_logcat is invalid. Received: " + obj);
            case 177:
                if ("layout/popupview_mask_0".equals(obj)) {
                    return new PopupviewMaskBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_mask is invalid. Received: " + obj);
            case 178:
                if ("layout/popupview_math_0".equals(obj)) {
                    return new PopupviewMathBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_math is invalid. Received: " + obj);
            case 179:
                if ("layout/popupview_measure_0".equals(obj)) {
                    return new PopupviewMeasureBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_measure is invalid. Received: " + obj);
            case 180:
                if ("layout/popupview_multi_window_0".equals(obj)) {
                    return new PopupviewMultiWindowBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_multi_window is invalid. Received: " + obj);
            case 181:
                if ("layout/popupview_navigate_0".equals(obj)) {
                    return new PopupviewNavigateBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_navigate is invalid. Received: " + obj);
            case 182:
                if ("layout/popupview_opensource_0".equals(obj)) {
                    return new PopupviewOpensourceBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_opensource is invalid. Received: " + obj);
            case 183:
                if ("layout/popupview_probe_0".equals(obj)) {
                    return new PopupviewProbeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_probe is invalid. Received: " + obj);
            case 184:
                if ("layout/popupview_ref_0".equals(obj)) {
                    return new PopupviewRefBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_ref is invalid. Received: " + obj);
            case 185:
                if ("layout/popupview_remind_0".equals(obj)) {
                    return new PopupviewRemindBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_remind is invalid. Received: " + obj);
            case 186:
                if ("layout/popupview_result_counter_0".equals(obj)) {
                    return new PopupviewResultCounterBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_result_counter is invalid. Received: " + obj);
            case 187:
                if ("layout/popupview_result_cursor_0".equals(obj)) {
                    return new PopupviewResultCursorBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_result_cursor is invalid. Received: " + obj);
            case 188:
                if ("layout/popupview_result_dvm_0".equals(obj)) {
                    return new PopupviewResultDvmBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_result_dvm is invalid. Received: " + obj);
            case 189:
                if ("layout/popupview_result_histogram_0".equals(obj)) {
                    return new PopupviewResultHistogramBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_result_histogram is invalid. Received: " + obj);
            case 190:
                if ("layout/popupview_result_measure_0".equals(obj)) {
                    return new PopupviewResultMeasureBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_result_measure is invalid. Received: " + obj);
            case 191:
                if ("layout/popupview_rtsa_0".equals(obj)) {
                    return new PopupviewRtsaBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_rtsa is invalid. Received: " + obj);
            case 192:
                if ("layout/popupview_save_0".equals(obj)) {
                    return new PopupviewSaveBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_save is invalid. Received: " + obj);
            case 193:
                if ("layout/popupview_screen_flip_0".equals(obj)) {
                    return new PopupviewScreenFlipBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_screen_flip is invalid. Received: " + obj);
            case 194:
                if ("layout/popupview_search_0".equals(obj)) {
                    return new PopupviewSearchBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_search is invalid. Received: " + obj);
            case 195:
                if ("layout/popupview_spinner_0".equals(obj)) {
                    return new PopupviewSpinnerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_spinner is invalid. Received: " + obj);
            case 196:
                if ("layout/popupview_start_menu_0".equals(obj)) {
                    return new PopupviewStartMenuBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_start_menu is invalid. Received: " + obj);
            case 197:
                if ("layout/popupview_storage_0".equals(obj)) {
                    return new PopupviewStorageBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_storage is invalid. Received: " + obj);
            case 198:
                if ("layout/popupview_trigger_0".equals(obj)) {
                    return new PopupviewTriggerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_trigger is invalid. Received: " + obj);
            case 199:
                if ("layout/popupview_upa_0".equals(obj)) {
                    return new PopupviewUpaBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_upa is invalid. Received: " + obj);
            case 200:
                if ("layout/popupview_update_0".equals(obj)) {
                    return new PopupviewUpdateBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_update is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final ViewDataBinding internalGetViewDataBinding4(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 201:
                if ("layout/popupview_upgrade_0".equals(obj)) {
                    return new PopupviewUpgradeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_upgrade is invalid. Received: " + obj);
            case 202:
                if ("layout/popupview_utility_0".equals(obj)) {
                    return new PopupviewUtilityBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_utility is invalid. Received: " + obj);
            case 203:
                if ("layout/popupview_vertical_0".equals(obj)) {
                    return new PopupviewVerticalBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_vertical is invalid. Received: " + obj);
            case 204:
                if ("layout/popupview_wave_intensity_0".equals(obj)) {
                    return new PopupviewWaveIntensityBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_wave_intensity is invalid. Received: " + obj);
            case 205:
                if ("layout/popupview_wave_record_0".equals(obj)) {
                    return new PopupviewWaveRecordBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_wave_record is invalid. Received: " + obj);
            case 206:
                if ("layout/popupview_xy_0".equals(obj)) {
                    return new PopupviewXyBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popupview_xy is invalid. Received: " + obj);
            case 207:
                if ("layout/popuview_help_0".equals(obj)) {
                    return new PopuviewHelpBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popuview_help is invalid. Received: " + obj);
            case 208:
                if ("layout/popuview_mini_bode_0".equals(obj)) {
                    return new PopuviewMiniBodeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for popuview_mini_bode is invalid. Received: " + obj);
            case 209:
                if ("layout/presentation_miniscreen_0".equals(obj)) {
                    return new PresentationMiniscreenBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for presentation_miniscreen is invalid. Received: " + obj);
            case 210:
                if ("layout/presentation_motor_0".equals(obj)) {
                    return new PresentationMotorBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for presentation_motor is invalid. Received: " + obj);
            case 211:
                if ("layout/table_simple_0".equals(obj)) {
                    return new TableSimpleBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for table_simple is invalid. Received: " + obj);
            case 212:
                if ("layout/upa_poppview_ripper_0".equals(obj)) {
                    return new UpaPoppviewRipperBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for upa_poppview_ripper is invalid. Received: " + obj);
            case 213:
                if ("layout/upa_popupview_connection_0".equals(obj)) {
                    return new UpaPopupviewConnectionBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for upa_popupview_connection is invalid. Received: " + obj);
            case 214:
                if ("layout/window_bode_0".equals(obj)) {
                    return new WindowBodeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for window_bode is invalid. Received: " + obj);
            case 215:
                if ("layout/window_simple_0".equals(obj)) {
                    return new WindowSimpleBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for window_simple is invalid. Received: " + obj);
            case 216:
                if ("layout/window_waveform_0".equals(obj)) {
                    return new WindowWaveformBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for window_waveform is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            int i3 = (i2 - 1) / 50;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                return null;
                            }
                            return internalGetViewDataBinding4(dataBindingComponent, view, i2, tag);
                        }
                        return internalGetViewDataBinding3(dataBindingComponent, view, i2, tag);
                    }
                    return internalGetViewDataBinding2(dataBindingComponent, view, i2, tag);
                }
                return internalGetViewDataBinding1(dataBindingComponent, view, i2, tag);
            }
            return internalGetViewDataBinding0(dataBindingComponent, view, i2, tag);
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || INTERNAL_LAYOUT_ID_LOOKUP.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = InnerLayoutIdLookup.sKeys.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return InnerBrLookup.sKeys.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    /* loaded from: classes.dex */
    private static class InnerBrLookup {
        static final SparseArray<String> sKeys = new SparseArray<>(1082);

        private InnerBrLookup() {
        }

        static {
            internalPopulateBRLookup0();
            internalPopulateBRLookup1();
            internalPopulateBRLookup2();
        }

        private static void internalPopulateBRLookup0() {
            sKeys.put(1, "AmpOrderMapping");
            sKeys.put(2, "CenterMapping");
            sKeys.put(3, "CursorMapping");
            sKeys.put(4, "DbMapping");
            sKeys.put(5, "FailMapping");
            sKeys.put(6, "FreqOrderMapping");
            sKeys.put(7, "GndMapping");
            sKeys.put(8, "LargeMapping");
            sKeys.put(9, "MaskMapping");
            sKeys.put(10, "MeasureMapping");
            sKeys.put(11, "MediumMapping");
            sKeys.put(12, "MemoryMapping");
            sKeys.put(13, "NegativeMapping");
            sKeys.put(14, "PassMapping");
            sKeys.put(15, "PopupviewFlexKnobBinding");
            sKeys.put(16, "PositiveMapping");
            sKeys.put(17, "SPanCenterMapping");
            sKeys.put(18, "ScreenMapping");
            sKeys.put(19, "SmallMapping");
            sKeys.put(20, "StartEndMapping");
            sKeys.put(21, "VrmsMapping");
            sKeys.put(22, "_1553b_polarity");
            sKeys.put(23, "_1553b_source");
            sKeys.put(24, "_1553b_thres1");
            sKeys.put(25, "_1553b_thres2");
            sKeys.put(0, "_all");
            sKeys.put(26, "acMappingObject");
            sKeys.put(27, "acdcMappingObject");
            sKeys.put(28, "acquireMode");
            sKeys.put(29, "adc1Tcmp");
            sKeys.put(30, "adc1Tdmx");
            sKeys.put(31, "adc2Tcmp");
            sKeys.put(32, "adc2Tdmx");
            sKeys.put(33, "adc3Tcmp");
            sKeys.put(34, "adc3Tdmx");
            sKeys.put(35, "adc4Tcmp");
            sKeys.put(36, "adc4Tdmx");
            sKeys.put(37, IMAPStore.ID_ADDRESS);
            sKeys.put(38, "afgParam");
            sKeys.put(39, "afg_wave_am_shape");
            sKeys.put(40, "afg_wave_fm_shape");
            sKeys.put(41, "afg_wave_mod_type");
            sKeys.put(42, "afg_wave_pm_shape");
            sKeys.put(43, "allWidth");
            sKeys.put(44, "analyse_select");
            sKeys.put(45, "angle1");
            sKeys.put(46, "angle2");
            sKeys.put(47, "angle3");
            sKeys.put(48, "antiAliasing");
            sKeys.put(49, "arinc429_baud");
            sKeys.put(50, "arinc429_byte_format");
            sKeys.put(51, "arinc429_down_thres");
            sKeys.put(52, "arinc429_singal_type");
            sKeys.put(53, "arinc429_source");
            sKeys.put(54, "arinc429_up_thres");
            sKeys.put(55, "atuoMapping");
            sKeys.put(56, "autoMappingObj");
            sKeys.put(57, "autoName");
            sKeys.put(58, "autoRbw");
            sKeys.put(59, "autoSelected");
            sKeys.put(60, "auxOut");
            sKeys.put(61, "averageMappingObj");
            sKeys.put(62, "avgTimes");
            sKeys.put(63, "avgValue");
            sKeys.put(64, "ax");
            sKeys.put(65, "axStr");
            sKeys.put(66, "ay");
            sKeys.put(67, "ayStr");
            sKeys.put(68, "bandLimit");
            sKeys.put(69, "baseMethod");
            sKeys.put(70, "baseSi");
            sKeys.put(71, "basic_SYMM");
            sKeys.put(72, "basic_amp");
            sKeys.put(73, "basic_falledge");
            sKeys.put(74, "basic_freq");
            sKeys.put(75, "basic_high");
            sKeys.put(76, "basic_low");
            sKeys.put(77, "basic_offset");
            sKeys.put(78, "basic_output_enable");
            sKeys.put(79, "basic_period");
            sKeys.put(80, "basic_phase");
            sKeys.put(81, "basic_pul_duty");
            sKeys.put(82, "basic_riseedge");
            sKeys.put(83, "basic_squ_duty");
            sKeys.put(84, "bathtubCurve");
            sKeys.put(85, "beeper");
            sKeys.put(86, "binMapping");
            sKeys.put(87, "bitType");
            sKeys.put(88, "bodeAmpout");
            sKeys.put(89, "bodeData");
            sKeys.put(90, "bodeDataGain");
            sKeys.put(91, "bodeDataRange");
            sKeys.put(92, "bodeDataWidth");
            sKeys.put(93, "bodeEnable");
            sKeys.put(94, "bodeFileType");
            sKeys.put(95, "bodeImpedace");
            sKeys.put(96, "bodeMinPop");
            sKeys.put(97, "bodeParam");
            sKeys.put(98, "bodePmgmData");
            sKeys.put(99, "bodePointNum");
            sKeys.put(100, "bodeRunDispType");
            sKeys.put(101, "bodeRunStopEnable");
            sKeys.put(102, "bodeSourceIn");
            sKeys.put(103, "bodeSourceOut");
            sKeys.put(104, "bodeStartFreq");
            sKeys.put(105, "bodeStopFreq");
            sKeys.put(106, "bodeSweepType");
            sKeys.put(107, "bodeVaramp");
            sKeys.put(108, "bodedispType");
            sKeys.put(109, "bodevaramp1");
            sKeys.put(110, "bodevaramp2");
            sKeys.put(111, "bodevaramp3");
            sKeys.put(112, "bodevaramp4");
            sKeys.put(113, "bodevaramp5");
            sKeys.put(114, "bodevaramp6");
            sKeys.put(115, "bodevaramp7");
            sKeys.put(116, "bodevaramp8");
            sKeys.put(117, "bothAB");
            sKeys.put(118, "bottom");
            sKeys.put(119, "bpFreq1");
            sKeys.put(120, "bpFreq2");
            sKeys.put(121, "btFreq1");
            sKeys.put(122, "btFreq2");
            sKeys.put(123, "bus_bitx");
            sKeys.put(124, "bus_chan");
            sKeys.put(125, "bus_width");
            sKeys.put(126, "bx");
            sKeys.put(127, "bxStr");
            sKeys.put(128, "by");
            sKeys.put(129, "byStr");
            sKeys.put(130, "byteLength");
            sKeys.put(131, "calibrationParam");
            sKeys.put(132, "calibration_Enable");
            sKeys.put(133, "canBaud");
            sKeys.put(134, "canDataIdType");
            sKeys.put(135, "canDataType");
            sKeys.put(136, "canDefine");
            sKeys.put(137, "canFdBaud");
            sKeys.put(138, "canIdBits");
            sKeys.put(139, "canIdType");
            sKeys.put(140, "can_baud");
            sKeys.put(141, "can_fd_baud");
            sKeys.put(142, "can_fd_samp");
            sKeys.put(143, "can_samp");
            sKeys.put(144, "can_singal");
            sKeys.put(145, "can_source");
            sKeys.put(146, "can_threas");
            sKeys.put(147, "center");
            sKeys.put(148, "chNum");
            sKeys.put(149, "chan");
            sKeys.put(150, "chan1");
            sKeys.put(151, "chan1MappingObject");
            sKeys.put(152, "chan2");
            sKeys.put(153, "chan2MappingObject");
            sKeys.put(154, "chan3");
            sKeys.put(155, "chan3MappingObject");
            sKeys.put(156, "chan4");
            sKeys.put(157, "chan4MappingObject");
            sKeys.put(158, "chanB");
            sKeys.put(159, "chanC");
            sKeys.put(160, "chanDelay");
            sKeys.put(161, "chanDurationPattern");
            sKeys.put(162, "chanNoneMappingObject");
            sKeys.put(163, "chanPattern");
            sKeys.put(164, "chanState");
            sKeys.put(165, "chanStateList");
            sKeys.put(166, "chanceAMapping");
            sKeys.put(167, "chanceBMapping");
            sKeys.put(168, "channel");
            sKeys.put(169, "channelAMapping");
            sKeys.put(170, "channelB");
            sKeys.put(171, "channelBMapping");
            sKeys.put(172, "channelC");
            sKeys.put(173, "checkDirection");
            sKeys.put(174, "checkedChangeListener");
            sKeys.put(175, "choose");
            sKeys.put(176, "clickListener");
            sKeys.put(177, "closedResultBar");
            sKeys.put(178, "coarse1");
            sKeys.put(179, "coarse2");
            sKeys.put(180, "coarse3");
            sKeys.put(181, "coarse4");
            sKeys.put(182, "colorGrade");
            sKeys.put(183, "compareLowerLimit");
            sKeys.put(184, "compareUperLimit");
            sKeys.put(185, "constantMapping");
            sKeys.put(186, "count");
            sKeys.put(187, "counterSwitch");
            sKeys.put(188, "counterType");
            sKeys.put(189, "coupling");
            sKeys.put(190, "csNegativeMapping");
            sKeys.put(191, "csPositiveMapping");
            sKeys.put(192, "currentMappingObject");
            sKeys.put(193, "currentPage");
            sKeys.put(194, "currentResultItem");
            sKeys.put(195, "cursorA");
            sKeys.put(196, "cursorAB");
            sKeys.put(197, "cursorB");
            sKeys.put(198, "cursorBothAB");
            sKeys.put(199, "cursorEnable");
            sKeys.put(200, "cursorIndicator");
            sKeys.put(201, "cursorMode");
            sKeys.put(202, "cursorParam");
            sKeys.put(203, "cursorThreshold");
            sKeys.put(204, "cursorsIntensity");
            sKeys.put(205, "d0TOd7");
            sKeys.put(206, "d0TOd7_threshold_");
            sKeys.put(207, "d8TOd15");
            sKeys.put(208, "d8TOd15_threshold_");
            sKeys.put(209, "dHCPSelected");
            sKeys.put(210, "dampFactor");
            sKeys.put(211, "data");
            sKeys.put(212, "dataBits");
            sKeys.put(213, "dataByte");
            sKeys.put(214, "dataMapping");
            sKeys.put(215, "dataNegativeMapping");
            sKeys.put(216, "dataPositiveMapping");
            sKeys.put(217, "dataRate");
            sKeys.put(218, IMAPStore.ID_DATE);
            sKeys.put(219, "dcMappingObject");
            sKeys.put(220, "defaultValue");
            sKeys.put(221, "define");
            sKeys.put(222, "defineCycMapping");
            sKeys.put(223, "defineDataMapping");
            sKeys.put(224, "defineIdMapping");
            sKeys.put(225, "delayChanA");
            sKeys.put(226, "delayChanB");
            sKeys.put(227, "delayLowerLimit");
            sKeys.put(228, "delayUperLimit");
            sKeys.put(229, "delaylevelA");
            sKeys.put(230, "delaylevelB");
            sKeys.put(231, "deltaXStr");
            sKeys.put(232, "deltaYStr");
            sKeys.put(233, "depth");
            sKeys.put(234, "depthEn");
            sKeys.put(235, "depthValue");
            sKeys.put(236, "detail");
            sKeys.put(237, "diffSmooth");
            sKeys.put(238, "diskParam");
            sKeys.put(239, "displayMode");
            sKeys.put(240, "dns");
            sKeys.put(241, "dotTime");
            sKeys.put(242, "downType");
            sKeys.put(243, "download");
            sKeys.put(244, "durationLowerLimit");
            sKeys.put(245, "durationPattern");
            sKeys.put(246, "durationUperLimit");
            sKeys.put(247, "dvmMode");
            sKeys.put(248, "eBaudRate");
            sKeys.put(249, "eBaudRateCan");
            sKeys.put(250, "eBaudRateLin");
            sKeys.put(251, "eMoreThan");
            sKeys.put(252, "edgeDownMapping");
            sKeys.put(253, "edgeEitherMapping");
            sKeys.put(254, "edgeFallingAMapping");
            sKeys.put(255, "edgeFallingBMapping");
            sKeys.put(256, "edgeFallingMapping");
            sKeys.put(257, "edgeNumber");
            sKeys.put(258, "edgeRisingAMapping");
            sKeys.put(259, "edgeRisingBMapping");
            sKeys.put(260, "edgeRisingMapping");
            sKeys.put(261, "edgeSlope");
            sKeys.put(262, "edgeSlopeA");
            sKeys.put(263, "edgeSlopeB");
            sKeys.put(264, "edgeSrc");
            sKeys.put(265, "edgeUpMapping");
            sKeys.put(266, "enable");
            sKeys.put(267, "enabled");
            sKeys.put(268, "end");
            sKeys.put(269, "endFrameAttr");
            sKeys.put(270, "endianLsbMapping");
            sKeys.put(271, "endianMsbMapping");
            sKeys.put(272, "errAction");
            sKeys.put(273, "errorCode");
            sKeys.put(274, "errorMessage");
            sKeys.put(275, "eth100_clk");
            sKeys.put(276, "eth100_clk_trigger");
            sKeys.put(277, "eth_source");
            sKeys.put(278, "eth_type");
            sKeys.put(279, NotificationCompat.CATEGORY_EVENT);
            sKeys.put(280, "event_format");
            sKeys.put(281, "event_view");
            sKeys.put(282, "expandGnd");
            sKeys.put(283, "expandIndex");
            sKeys.put(284, "expandMode");
            sKeys.put(285, "expandUser");
            sKeys.put(286, "explicitMapping");
            sKeys.put(287, "externalClock");
            sKeys.put(288, "fdSamplePoints");
            sKeys.put(289, "fftCenter");
            sKeys.put(290, "fftEnd");
            sKeys.put(291, "fftOffset");
            sKeys.put(292, "fftOffsetStr");
            sKeys.put(293, "fftPeakOrderIndex");
            sKeys.put(294, "fftScale");
            sKeys.put(295, "fftScaleStr");
            sKeys.put(296, "fftSpan");
            sKeys.put(297, "fftStart");
            sKeys.put(298, "fftUnitIndex");
            sKeys.put(299, "fftWindowIndex");
            sKeys.put(300, "fftZoomCenter");
            sKeys.put(301, "fftZoomEnd");
            sKeys.put(302, "fftZoomSpan");
            sKeys.put(303, "fftZoomStart");
            sKeys.put(304, "fftxTypeIndex");
            sKeys.put(305, "fileName");
            sKeys.put(306, "fileType");
            sKeys.put(307, "filter1");
            sKeys.put(308, "filter2");
            sKeys.put(309, "fine");
            sKeys.put(310, "fine1");
            sKeys.put(311, "fine2");
            sKeys.put(312, "fine3");
            sKeys.put(313, "fine4");
            sKeys.put(314, "firEnable");
            sKeys.put(315, "firmware");
            sKeys.put(316, "firstOrderMapping");
            sKeys.put(317, "flexLatestCH");
            sKeys.put(318, "flex_baud");
            sKeys.put(319, "flex_channel");
            sKeys.put(320, "flex_samp");
            sKeys.put(321, "flex_signal");
            sKeys.put(322, "flex_source");
            sKeys.put(323, "flex_thres");
            sKeys.put(324, "flip1");
            sKeys.put(325, "flip2");
            sKeys.put(326, "flip3");
            sKeys.put(327, "flip4");
            sKeys.put(328, "forceStop");
            sKeys.put(329, "format");
            sKeys.put(330, "formatValue1Str");
            sKeys.put(331, "formatValue2Str");
            sKeys.put(332, "formatValue3DataStr");
            sKeys.put(333, "formatValue3IdStr");
            sKeys.put(334, "formatValue4Str");
            sKeys.put(335, "formatValue5MaxStr");
            sKeys.put(336, "formatValue5MinStr");
            sKeys.put(337, "formatValue5Str");
            sKeys.put(338, "formatValue6BitStr");
            sKeys.put(339, "formatValue6MaxStr");
            sKeys.put(340, "formatValue6RtaStr");
            sKeys.put(341, "formatValue6Str");
            sKeys.put(342, "frameDisplayFrame");
            sKeys.put(343, "frameMode");
            sKeys.put(344, "frameSpeed");
            sKeys.put(345, "frameStartFrame");
            sKeys.put(346, "frequencyMappingObject");
            sKeys.put(347, "function");
            sKeys.put(348, "functionManager");
            sKeys.put(349, "gateway");
            sKeys.put(350, "glistNow");
            sKeys.put(351, "gpib");
            sKeys.put(352, "gpibStr");
            sKeys.put(353, "gridFullMapping");
            sKeys.put(354, "gridHalfMapping");
            sKeys.put(355, "gridIntensity");
            sKeys.put(356, "gridNoneMapping");
            sKeys.put(357, "gridType");
            sKeys.put(358, "grids");
            sKeys.put(359, "groupChanState");
            sKeys.put(360, "guideline");
            sKeys.put(361, "hardVersion");
            sKeys.put(362, "hasUpdate");
            sKeys.put(363, "hdmiRatio");
            sKeys.put(364, "height");
            sKeys.put(365, "hexMapping");
            sKeys.put(366, "highBit");
            sKeys.put(367, "highBw");
            sKeys.put(368, "highThres");
            sKeys.put(369, "histoEnable");
            sKeys.put(370, "histogram");
            sKeys.put(371, "hold");
            sKeys.put(372, "holdOff");
            sKeys.put(373, "hori");
            sKeys.put(374, "horiParam");
            sKeys.put(375, "horizontal");
            sKeys.put(376, "horizontalMappingObject");
            sKeys.put(377, "horizontalParam");
            sKeys.put(378, "hostName");
            sKeys.put(379, "hpFreq");
            sKeys.put(380, "hresMappingObj");
            sKeys.put(381, "i2cAddress");
            sKeys.put(382, "i2cDataType");
            sKeys.put(383, "i2c_exchange");
            sKeys.put(384, "i2c_read_write");
            sKeys.put(385, "i2c_scl");
            sKeys.put(386, "i2c_scl_thres");
            sKeys.put(387, "i2c_sda");
            sKeys.put(388, "i2c_sda_thres");
            sKeys.put(389, "i2sDataType");
            sKeys.put(390, "i2s_align");
            sKeys.put(391, "i2s_data");
            sKeys.put(392, "i2s_data_polarity");
            sKeys.put(393, "i2s_data_thres");
            sKeys.put(394, "i2s_endian");
            sKeys.put(395, "i2s_receive");
            sKeys.put(396, "i2s_sclock");
            sKeys.put(397, "i2s_sclock_edge");
            sKeys.put(398, "i2s_sclock_thres");
            sKeys.put(399, "i2s_wave_singal_thres");
            sKeys.put(400, "i2s_word");
            sKeys.put(401, "i2s_ws");
            sKeys.put(402, "i2s_ws_low");
            sKeys.put(403, "idExtended");
            sKeys.put(404, "idLowerLimit");
            sKeys.put(405, "idUperLimit");
            sKeys.put(406, "idelTime");
            sKeys.put(407, "ifPlaying");
            sKeys.put(408, "iicChanA");
            sKeys.put(409, "iicChanB");
            sKeys.put(410, "iiclevelA");
            sKeys.put(411, "iiclevelB");
            sKeys.put(412, "iisChanA");
            sKeys.put(413, "iisChanB");
            sKeys.put(414, "iisChanC");
            sKeys.put(415, "iisDataType");
            sKeys.put(416, "iisMaxDataType");
            sKeys.put(417, "iisMinDataType");
            sKeys.put(418, "iisSlope");
            sKeys.put(419, "iislevelA");
            sKeys.put(420, "iislevelB");
            sKeys.put(421, "iislevelC");
            sKeys.put(422, "imageColor");
            sKeys.put(423, "imageFileType");
            sKeys.put(424, "imageHeader");
            sKeys.put(425, "imageInvert");
            sKeys.put(426, "impedance");
            sKeys.put(427, "impedanceEnable");
            sKeys.put(428, "index");
            sKeys.put(429, "inputLabel");
            sKeys.put(430, "inputLabellist");
            sKeys.put(431, "inputLabellist64");
            sKeys.put(432, "install");
            sKeys.put(433, "inter1");
            sKeys.put(434, "inter2");
            sKeys.put(435, "inter3");
            sKeys.put(436, "inter4");
            sKeys.put(437, "intgBias");
            sKeys.put(438, "intgBiasUnit");
            sKeys.put(439, "invert");
            sKeys.put(440, "invertDeltaXStr");
            sKeys.put(441, "ioParam");
            sKeys.put(442, "ipAddress");
            sKeys.put(443, "isNoise");
            sKeys.put(444, "isProbe");
            sKeys.put(445, "itemBits");
            sKeys.put(446, "itemPosition");
            sKeys.put(447, "keyNumMax");
            sKeys.put(448, "laEnable");
            sKeys.put(449, "laParam");
            sKeys.put(450, "la_calibration_probe");
            sKeys.put(451, "la_edge_color");
            sKeys.put(452, "la_group1");
            sKeys.put(453, "la_group2");
            sKeys.put(454, "la_group3");
            sKeys.put(455, "la_group4");
            sKeys.put(456, "la_high_color");
            sKeys.put(457, "la_label_view_select");
            sKeys.put(458, "la_label_view_select_chan");
            sKeys.put(459, "la_labels_en");
            sKeys.put(460, "la_low_color");
            sKeys.put(461, "la_order");
            sKeys.put(462, "la_position");
            sKeys.put(463, "la_probe_cal_data");
            sKeys.put(464, "la_probe_cal_pro");
            sKeys.put(465, "la_probe_cal_prostr");
            sKeys.put(466, "la_select_position");
            sKeys.put(467, "la_size_");
            sKeys.put(468, "la_source");
            sKeys.put(469, "la_spacing_");
            sKeys.put(470, "label");
            sKeys.put(471, "labelGroup");
            sKeys.put(472, "labelString");
            sKeys.put(473, "language");
            sKeys.put(474, "lastDate");
            sKeys.put(475, "last_one");
            sKeys.put(476, "launcheNum");
            sKeys.put(477, "left");
            sKeys.put(478, "leftStatusBarParam");
            sKeys.put(479, "level");
            sKeys.put(480, "levelB");
            sKeys.put(481, "levelC");
            sKeys.put(482, "limitLower");
            sKeys.put(483, "limitType");
            sKeys.put(484, "limitUpper");
            sKeys.put(485, "linBaud");
            sKeys.put(486, "linByte");
            sKeys.put(487, "linDataType");
            sKeys.put(488, "linId");
            sKeys.put(489, "linSamplePosition");
            sKeys.put(490, "lin_baud");
            sKeys.put(491, "lin_parity_bit");
            sKeys.put(492, "lin_polarity");
            sKeys.put(493, "lin_source");
            sKeys.put(494, "lin_thres");
            sKeys.put(495, "lin_version");
            sKeys.put(496, "lineA");
            sKeys.put(497, "lineB");
            sKeys.put(498, "linesNumber");
            sKeys.put(499, "loadFileType");
        }

        private static void internalPopulateBRLookup1() {
            sKeys.put(500, "loadingFiles");
            sKeys.put(501, "lockKeyboard");
            sKeys.put(502, "logicOffset");
            sKeys.put(503, "logicSizeIndex");
            sKeys.put(504, "loopBw");
            sKeys.put(505, "lowThres");
            sKeys.put(506, "lowerLimit");
            sKeys.put(507, "lpFreq");
            sKeys.put(508, "macAddress");
            sKeys.put(509, "mainOffset");
            sKeys.put(510, "mainOffsetStr");
            sKeys.put(511, "mainScale");
            sKeys.put(512, "manualMapping");
            sKeys.put(513, "manufacturer");
            sKeys.put(514, "markTableEn");
            sKeys.put(515, "markersState");
            sKeys.put(516, "mask");
            sKeys.put(517, "maskParam");
            sKeys.put(518, "maxFrame");
            sKeys.put(519, "maxPage");
            sKeys.put(520, "maxValue");
            sKeys.put(521, "mdns");
            sKeys.put(522, "measSrc");
            sKeys.put(523, "measType");
            sKeys.put(524, "measureAllSrc");
            sKeys.put(525, "measureMappingObject");
            sKeys.put(526, "memEnd");
            sKeys.put(527, "memStart");
            sKeys.put(528, "menuParam");
            sKeys.put(529, "message");
            sKeys.put(530, "methodState");
            sKeys.put(531, "midThres");
            sKeys.put(532, "milstdDataType");
            sKeys.put(533, "milstdTrigger_Level_ID");
            sKeys.put(534, "milstdlevelA");
            sKeys.put(535, "milstdlevelB");
            sKeys.put(536, "minPop");
            sKeys.put(537, "minValue");
            sKeys.put(538, "miscBuild");
            sKeys.put(539, "mode");
            sKeys.put(540, "modeCsMapping");
            sKeys.put(541, "modeNegativeMapping");
            sKeys.put(542, "modePositiveMapping");
            sKeys.put(543, "modeTimeoutMapping");
            sKeys.put(544, "mode_function");
            sKeys.put(545, "model");
            sKeys.put(546, "most_signal_type");
            sKeys.put(547, "most_source");
            sKeys.put(548, "most_thres");
            sKeys.put(549, "nMode");
            sKeys.put(550, IMAPStore.ID_NAME);
            sKeys.put(551, "navEnable");
            sKeys.put(552, NotificationCompat.CATEGORY_NAVIGATION);
            sKeys.put(553, "negativeMapping");
            sKeys.put(554, "noiseProject");
            sKeys.put(555, "normalMapping");
            sKeys.put(556, "normalMappingObj");
            sKeys.put(557, "nthSlope");
            sKeys.put(558, "obj");
            sKeys.put(559, "offMappingObj");
            sKeys.put(560, "offset");
            sKeys.put(561, "offsetString");
            sKeys.put(562, "okButtonEnable");
            sKeys.put(563, "onCheckedChangeListener");
            sKeys.put(564, "onClickListener");
            sKeys.put(565, "onOff");
            sKeys.put(566, "onSwitchCheckedChangeListener");
            sKeys.put(567, "operate");
            sKeys.put(568, "operator");
            sKeys.put(569, "operatorString");
            sKeys.put(570, "outEvent");
            sKeys.put(571, "outHl");
            sKeys.put(572, "outPulse");
            sKeys.put(573, "overEvent");
            sKeys.put(574, "overSlope");
            sKeys.put(575, "overTime");
            sKeys.put(576, "overTrigger_Level_ID");
            sKeys.put(577, "overlevelA");
            sKeys.put(578, "overlevelB");
            sKeys.put(579, "pal_bus");
            sKeys.put(580, "pal_clk");
            sKeys.put(581, "pal_clk_edge");
            sKeys.put(582, "pal_clk_menu");
            sKeys.put(583, "pal_clk_thres");
            sKeys.put(584, "pal_dat_menu");
            sKeys.put(585, "pal_dat_thres");
            sKeys.put(586, "pal_endian");
            sKeys.put(587, "pal_parity");
            sKeys.put(588, "paletteEnable");
            sKeys.put(589, "param");
            sKeys.put(590, "parityEvenMapping");
            sKeys.put(591, "parityNoneMapping");
            sKeys.put(592, "parityOddMapping");
            sKeys.put(593, "parityWithMapping");
            sKeys.put(594, "parityWithoutMapping");
            sKeys.put(595, "parma");
            sKeys.put(596, "path");
            sKeys.put(597, "pathName");
            sKeys.put(598, "pattern");
            sKeys.put(599, "pctHigt");
            sKeys.put(600, "peakEn");
            sKeys.put(601, "peakExcur");
            sKeys.put(602, "peakExcurStr");
            sKeys.put(603, "peakExcursion");
            sKeys.put(604, "peakExcursionStr");
            sKeys.put(605, "peakMappingObj");
            sKeys.put(606, "peakNum");
            sKeys.put(607, "peakOrder");
            sKeys.put(608, "peakSearch");
            sKeys.put(609, "peakTableEn");
            sKeys.put(610, "peakThreshold");
            sKeys.put(611, "peakThresholdStr");
            sKeys.put(612, "periodMappingObject");
            sKeys.put(613, "persisTime");
            sKeys.put(614, "persistTime");
            sKeys.put(615, "persistance");
            sKeys.put(616, "phase1Core1");
            sKeys.put(617, "phase1Core2");
            sKeys.put(618, "phase1Core3");
            sKeys.put(619, "phase1Core4");
            sKeys.put(620, "phase2Core1");
            sKeys.put(621, "phase2Core2");
            sKeys.put(622, "phase2Core3");
            sKeys.put(623, "phase2Core4");
            sKeys.put(624, "phase3Core1");
            sKeys.put(625, "phase3Core2");
            sKeys.put(626, "phase3Core3");
            sKeys.put(627, "phase3Core4");
            sKeys.put(628, "phase4Core1");
            sKeys.put(629, "phase4Core2");
            sKeys.put(630, "phase4Core3");
            sKeys.put(631, "phase4Core4");
            sKeys.put(632, "pic");
            sKeys.put(633, "picObservable");
            sKeys.put(634, "pllMapping");
            sKeys.put(635, "pllOrder");
            sKeys.put(636, "polarity");
            sKeys.put(637, "polarityNegativeMapping");
            sKeys.put(638, "polarityPositiveMapping");
            sKeys.put(639, "polaritySlope");
            sKeys.put(640, "position");
            sKeys.put(641, "positionEnterMapping");
            sKeys.put(642, "positionExitMapping");
            sKeys.put(643, "positionTimeMapping");
            sKeys.put(644, "positiveMapping");
            sKeys.put(645, "powerOnSet");
            sKeys.put(646, "powerStatus");
            sKeys.put(647, "precisionMapping");
            sKeys.put(648, "prefix");
            sKeys.put(649, "probeBias");
            sKeys.put(650, "probeCal");
            sKeys.put(651, "probeCalTime");
            sKeys.put(652, "probeCurrentBias");
            sKeys.put(653, "probeDelay");
            sKeys.put(654, "probeDemagVisible");
            sKeys.put(655, "probeDetail");
            sKeys.put(656, "probeInsert");
            sKeys.put(657, "probeMFR");
            sKeys.put(658, "probeModel");
            sKeys.put(659, "probeRatio");
            sKeys.put(660, "probeRatioEnable");
            sKeys.put(661, "probeRequestCal");
            sKeys.put(662, "probeSN");
            sKeys.put(663, "probeType");
            sKeys.put(664, "progress");
            sKeys.put(665, "progressA");
            sKeys.put(666, "progressB");
            sKeys.put(667, "progressC");
            sKeys.put(668, "progressNow");
            sKeys.put(669, "progressStr");
            sKeys.put(670, "projectMode");
            sKeys.put(671, "pulseLower");
            sKeys.put(672, "pulseMax");
            sKeys.put(673, "pulsePolarity");
            sKeys.put(674, "pulsePolarty");
            sKeys.put(675, "pulseSrc");
            sKeys.put(676, "quality_param");
            sKeys.put(677, "quickOper");
            sKeys.put(678, "range");
            sKeys.put(679, "rbw");
            sKeys.put(680, "readNavMode");
            sKeys.put(681, "readRunStop");
            sKeys.put(682, "realBottom");
            sKeys.put(683, "realLeft");
            sKeys.put(684, "realRight");
            sKeys.put(685, "realScale");
            sKeys.put(686, "realTop");
            sKeys.put(687, "recordBeeper");
            sKeys.put(688, "recordCurrent");
            sKeys.put(689, "recordCurrentFrames");
            sKeys.put(690, "recordEndFrame");
            sKeys.put(691, "recordFrameStart");
            sKeys.put(692, "recordFrames");
            sKeys.put(693, "recordInterval");
            sKeys.put(694, "recordMaxFrames");
            sKeys.put(695, "recordMin");
            sKeys.put(696, "recordOnOff");
            sKeys.put(697, "recordPlay");
            sKeys.put(698, "recordPlayDir");
            sKeys.put(699, "recordPlayInterval");
            sKeys.put(700, "recordPlayMode");
            sKeys.put(701, "recordStart");
            sKeys.put(702, "recordStartFrame");
            sKeys.put(703, "recoveryType");
            sKeys.put(704, "refAbsHigh");
            sKeys.put(705, "refAbsLow");
            sKeys.put(706, "refAbsMid");
            sKeys.put(707, "refChan");
            sKeys.put(708, "refClock");
            sKeys.put(709, "refColor");
            sKeys.put(710, "refFerqrefSource");
            sKeys.put(711, "refLevel");
            sKeys.put(712, "refLevelStr");
            sKeys.put(713, "refPctLow");
            sKeys.put(714, "refPctMid");
            sKeys.put(715, "refPctlHigh");
            sKeys.put(716, "refPowerAutoset");
            sKeys.put(717, "refPowerCurr");
            sKeys.put(718, "refPowerCyc");
            sKeys.put(719, "refPowerDisp");
            sKeys.put(720, "refPowerFref");
            sKeys.put(721, "refPowerTips");
            sKeys.put(722, "refPowerVolt");
            sKeys.put(723, "refRippleDisp");
            sKeys.put(724, "refRippleSource");
            sKeys.put(725, "reflType");
            sKeys.put(726, "reflevel");
            sKeys.put(727, "region");
            sKeys.put(728, "regionSelect");
            sKeys.put(729, "rejectTime");
            sKeys.put(730, "removable");
            sKeys.put(731, "resolution");
            sKeys.put(732, "result");
            sKeys.put(733, "right");
            sKeys.put(734, "ripplShowList");
            sKeys.put(735, "roll");
            sKeys.put(736, "root");
            sKeys.put(737, "rs232BaudRate");
            sKeys.put(738, "rs232Data");
            sKeys.put(739, "rs232_baud");
            sKeys.put(740, "rs232_endian");
            sKeys.put(741, "rs232_package");
            sKeys.put(742, "rs232_package_end");
            sKeys.put(743, "rs232_parity");
            sKeys.put(744, "rs232_pol");
            sKeys.put(745, "rs232_rx");
            sKeys.put(746, "rs232_rx_thres");
            sKeys.put(747, "rs232_stop");
            sKeys.put(748, "rs232_tx");
            sKeys.put(749, "rs232_tx_thres");
            sKeys.put(750, "rs232_width");
            sKeys.put(751, "rtaType");
            sKeys.put(752, "rulerEnable");
            sKeys.put(753, "runStop");
            sKeys.put(754, "runtLowerLimit");
            sKeys.put(755, "runtPolarity");
            sKeys.put(756, "runtTrigger_Level_ID");
            sKeys.put(757, "runtUperLimit");
            sKeys.put(758, "runtlevelA");
            sKeys.put(759, "runtlevelB");
            sKeys.put(760, "rwWithMapping");
            sKeys.put(761, "rwWithoutMapping");
            sKeys.put(762, "sHEvent");
            sKeys.put(763, "sample");
            sKeys.put(764, "samplePoints");
            sKeys.put(765, "sapmassa");
            sKeys.put(766, "saveGroup");
            sKeys.put(767, "scale");
            sKeys.put(768, "scaleNum");
            sKeys.put(769, "scaleStr");
            sKeys.put(770, "scaleString");
            sKeys.put(771, "scrEnd");
            sKeys.put(772, "scrStart");
            sKeys.put(773, "screenPicture");
            sKeys.put(774, "screenSelect");
            sKeys.put(775, "screenTime");
            sKeys.put(776, "screenTimeStr");
            sKeys.put(777, "screenWord");
            sKeys.put(778, "searcceAvailblec");
            sKeys.put(779, "secondOrderMapping");
            sKeys.put(780, "select");
            sKeys.put(781, "selectLevelABMapping");
            sKeys.put(782, "selectLevelAMapping");
            sKeys.put(783, "selectLevelBMapping");
            sKeys.put(784, "selectMode");
            sKeys.put(785, "selectSourceA");
            sKeys.put(786, "selectSourceB");
            sKeys.put(787, "selectedCount");
            sKeys.put(788, "selectionMode");
            sKeys.put(789, "semiautoMapping");
            sKeys.put(790, "sens");
            sKeys.put(791, "sent_crc_format");
            sKeys.put(792, "sent_idle_state");
            sKeys.put(793, "sent_nibbnum");
            sKeys.put(794, "sent_pause_plus");
            sKeys.put(795, "sent_signal_type");
            sKeys.put(796, "sent_source");
            sKeys.put(797, "sent_thres");
            sKeys.put(798, "sent_tick");
            sKeys.put(799, "sent_tolerance");
            sKeys.put(800, "serchType");
            sKeys.put(801, "serial");
            sKeys.put(802, "serviceID");
            sKeys.put(803, "serviceName");
            sKeys.put(804, "service_output_enable");
            sKeys.put(805, "setup");
            sKeys.put(806, "setupFileType");
            sKeys.put(807, "setupHold");
            sKeys.put(808, "setupHoldChanA");
            sKeys.put(809, "setupHoldChanB");
            sKeys.put(810, "setupHoldPolarity");
            sKeys.put(811, "setupHoldSlope");
            sKeys.put(812, "setupHoldlevelA");
            sKeys.put(813, "setupHoldlevelB");
            sKeys.put(814, "shareParam");
            sKeys.put(815, "sharedParam");
            sKeys.put(816, "shorterName");
            sKeys.put(817, "showCancel");
            sKeys.put(818, "showConfirm");
            sKeys.put(819, "showDetail");
            sKeys.put(820, "showLabel");
            sKeys.put(821, "showNetwork");
            sKeys.put(822, "showPeakSetting");
            sKeys.put(823, "showRMT");
            sKeys.put(824, "showResultBar");
            sKeys.put(825, "showSelectSourceB");
            sKeys.put(826, "showSource1");
            sKeys.put(827, "showSource2");
            sKeys.put(828, "showSource3");
            sKeys.put(829, "showStat");
            sKeys.put(830, "showThresLine");
            sKeys.put(831, "showTime");
            sKeys.put(832, "showType");
            sKeys.put(833, "showUsb");
            sKeys.put(834, "showWrning");
            sKeys.put(835, "showzoom");
            sKeys.put(836, "slope");
            sKeys.put(837, "slopeEitherMapping");
            sKeys.put(838, "slopeFallingMapping");
            sKeys.put(839, "slopeLowerLimit");
            sKeys.put(840, "slopeRisingMapping");
            sKeys.put(841, "slopeTrigger_Level_ID");
            sKeys.put(842, "slopeUperLimit");
            sKeys.put(843, "slopelevelA");
            sKeys.put(844, "slopelevelB");
            sKeys.put(845, "smooth");
            sKeys.put(846, "softVersion");
            sKeys.put(847, "source");
            sKeys.put(848, "source1");
            sKeys.put(849, "source2");
            sKeys.put(850, "source3");
            sKeys.put(851, "sourceA");
            sKeys.put(852, "sourceArithAIndex");
            sKeys.put(853, "sourceArithBIndex");
            sKeys.put(854, "sourceArrayId");
            sKeys.put(855, "sourceB");
            sKeys.put(856, "sourceFftIndex");
            sKeys.put(857, "sourceLogicAIndex");
            sKeys.put(858, "sourceLogicBIndex");
            sKeys.put(859, "span");
            sKeys.put(860, "spectrum");
            sKeys.put(861, "spiChanA");
            sKeys.put(862, "spiChanB");
            sKeys.put(863, "spiChanC");
            sKeys.put(864, "spiDataType");
            sKeys.put(865, "spiSlope");
            sKeys.put(866, "spiTimeOut");
            sKeys.put(867, "spi_clock");
            sKeys.put(868, "spi_clock_edge");
            sKeys.put(869, "spi_clock_thres");
            sKeys.put(870, "spi_cs");
            sKeys.put(871, "spi_cs_polarity");
            sKeys.put(872, "spi_cs_thres");
            sKeys.put(873, "spi_data_polarity");
            sKeys.put(874, "spi_endian");
            sKeys.put(875, "spi_miso");
            sKeys.put(876, "spi_miso_thres");
            sKeys.put(877, "spi_mode");
            sKeys.put(878, "spi_mosi");
            sKeys.put(879, "spi_mosi_thres");
            sKeys.put(880, "spi_timeout");
            sKeys.put(881, "spi_width");
            sKeys.put(882, "spilevelA");
            sKeys.put(883, "spilevelB");
            sKeys.put(884, "spilevelC");
            sKeys.put(885, "src");
            sKeys.put(886, "srcChan");
            sKeys.put(887, "srcHscale");
            sKeys.put(888, "srcVscale");
            sKeys.put(889, "start");
            sKeys.put(890, "started");
            sKeys.put(891, "stat");
            sKeys.put(892, "statCount");
            sKeys.put(893, "statCounts");
            sKeys.put(894, "statReset");
            sKeys.put(895, "state");
            sKeys.put(896, "staticSelected");
            sKeys.put(897, "statisticState");
            sKeys.put(898, NotificationCompat.CATEGORY_STATUS);
            sKeys.put(899, "stopBit15Mapping");
            sKeys.put(900, "stopBit1Mapping");
            sKeys.put(901, "stopBit2Mapping");
            sKeys.put(902, "storageLoadParam");
            sKeys.put(903, "storageParam");
            sKeys.put(904, "str");
            sKeys.put(905, "sweepAutoMapping");
            sKeys.put(906, "sweepNormalMapping");
            sKeys.put(907, "sweepSingleMapping");
            sKeys.put(908, "syncArea");
            sKeys.put(909, "tabelOnOff");
            sKeys.put(910, "thre");
            sKeys.put(911, "threA");
            sKeys.put(912, "threB");
            sKeys.put(913, "thresholdCH1");
            sKeys.put(914, "thresholdCH2");
            sKeys.put(915, "thresholdCH3");
            sKeys.put(916, "thresholdCH4");
            sKeys.put(917, "thresholdHigh");
            sKeys.put(918, "thresholdLow");
            sKeys.put(919, "thresholdMiddle");
            sKeys.put(920, "thresholdSource");
            sKeys.put(921, "thresholdType");
            sKeys.put(922, "tieSlope");
            sKeys.put(923, "time");
            sKeys.put(924, "timeMode");
            sKeys.put(925, "timeOut");
            sKeys.put(926, "timeSpeed");
            sKeys.put(927, "timeoutSlope");
            sKeys.put(928, "title");
            sKeys.put(929, "top");
            sKeys.put(930, "topMethod");
            sKeys.put(931, "totalizeMappingObject");
            sKeys.put(932, "track");
            sKeys.put(933, "trackMapping");
            sKeys.put(934, "triggerMode");
            sKeys.put(935, "triggerParam");
            sKeys.put(936, "triggerStatus");
            sKeys.put(937, "trigger_1553_Err");
            sKeys.put(938, "trigger_1553_Sync");
            sKeys.put(939, "trigger_1553_When");
            sKeys.put(940, "trigger_Can_Phy");
            sKeys.put(941, "trigger_Flex_Baud");
            sKeys.put(942, "trigger_Flex_Err");
            sKeys.put(943, "trigger_Flex_Frame");
            sKeys.put(944, "trigger_Flex_Phy");
            sKeys.put(945, "trigger_Flex_Pos");
            sKeys.put(946, "trigger_Flex_Symbol");
            sKeys.put(947, "trigger_Flex_When");
            sKeys.put(948, "trigger_I2C_Spec");
            sKeys.put(949, "trigger_I2C_WR");
            sKeys.put(950, "trigger_I2C_When");
            sKeys.put(951, "trigger_IIS_Ch");
            sKeys.put(952, "trigger_IIS_Spec");
            sKeys.put(953, "trigger_IIS_data_cmp");
            sKeys.put(954, "trigger_IIS_data_cmp_Cyc");
            sKeys.put(955, "trigger_IIS_data_cmp_ID");
            sKeys.put(956, "trigger_Level_ID");
            sKeys.put(957, "trigger_Lin_Err");
            sKeys.put(958, "trigger_Lin_Ver");
            sKeys.put(959, "trigger_Lin_When");
            sKeys.put(960, "trigger_RS232_Parity");
            sKeys.put(961, "trigger_RS232_Stop");
            sKeys.put(962, "trigger_RS232_When");
            sKeys.put(963, "trigger_RS232_Width");
            sKeys.put(964, "trigger_Serv_Can_When");
            sKeys.put(965, "trigger_Spi_CS");
            sKeys.put(966, "trigger_value_cmp");
            sKeys.put(967, "type");
            sKeys.put(968, "typeArrayId");
            sKeys.put(969, "typeDptsMapping");
            sKeys.put(970, "typeHMapping");
            sKeys.put(971, "typeLMapping");
            sKeys.put(972, "typeVectorMapping");
            sKeys.put(973, "uiEnable");
            sKeys.put(974, "ultraEnable");
            sKeys.put(975, "ultraMappingObj");
            sKeys.put(976, "unit");
            sKeys.put(977, "unitIndex");
            sKeys.put(978, "unitSiList");
            sKeys.put(979, "unitStr");
            sKeys.put(980, "upType");
            sKeys.put(981, "upaMappingObj");
            sKeys.put(982, "upaRippleParam");
            sKeys.put(983, "updateParam");
            sKeys.put(984, "uperLimit");
            sKeys.put(985, "usbHighMapping");
            sKeys.put(986, "usbLowMapping");
            sKeys.put(987, "usbMidMapping");
            sKeys.put(988, "usb_diff");
            sKeys.put(989, "usb_diff_high_thres");
            sKeys.put(990, "usb_diff_low_thres");
            sKeys.put(991, "usb_diff_source");
            sKeys.put(992, "usb_dp");
            sKeys.put(993, "usb_dp_thres");
            sKeys.put(994, "usb_ds");
            sKeys.put(995, "usb_ds_thres");
            sKeys.put(996, "usb_point");
            sKeys.put(997, "usb_rate");
            sKeys.put(998, "usb_source_dp");
            sKeys.put(999, "usb_source_ds");
        }

        private static void internalPopulateBRLookup2() {
            sKeys.put(1000, "usb_type");
            sKeys.put(1001, "utilityParam");
            sKeys.put(1002, "valid");
            sKeys.put(1003, "value");
            sKeys.put(1004, "ver1Mapping");
            sKeys.put(1005, "ver2Mapping");
            sKeys.put(1006, "verBothMapping");
            sKeys.put(1007, "verOffset");
            sKeys.put(1008, "verScale");
            sKeys.put(1009, "verUnit");
            sKeys.put(1010, "version1Mapping");
            sKeys.put(1011, "version2Mapping");
            sKeys.put(1012, "versionBothMapping");
            sKeys.put(1013, "verticalExpand");
            sKeys.put(1014, "verticalMappingObject");
            sKeys.put(1015, "verticalParam");
            sKeys.put(1016, "vibration");
            sKeys.put(1017, "videoFormat");
            sKeys.put(1018, "videoPolarity");
            sKeys.put(1019, "videoSync");
            sKeys.put(1020, "view");
            sKeys.put(1021, "viewonDrag");
            sKeys.put(1022, "visaAddress");
            sKeys.put(1023, "waveDepth");
            sKeys.put(1024, "waveFileType");
            sKeys.put(1025, "waveFreeze");
            sKeys.put(1026, "waveIntensity");
            sKeys.put(1027, "waveType");
            sKeys.put(1028, "wave_function");
            sKeys.put(1029, "wave_mod_am_depth");
            sKeys.put(1030, "wave_mod_am_freq");
            sKeys.put(1031, "wave_mod_fm_deviation");
            sKeys.put(1032, "wave_mod_fm_freq");
            sKeys.put(1033, "wave_mod_pic");
            sKeys.put(1034, "wave_mod_pm_dev");
            sKeys.put(1035, "wave_mod_pm_freq");
            sKeys.put(1036, "wave_path");
            sKeys.put(1037, "whenAdMapping");
            sKeys.put(1038, "whenAddressMapping");
            sKeys.put(1039, "whenCheckMapping");
            sKeys.put(1040, "whenCsMapping");
            sKeys.put(1041, "whenDataIdMapping");
            sKeys.put(1042, "whenDataMapping");
            sKeys.put(1043, "whenErrorMapping");
            sKeys.put(1044, "whenFrameMapping");
            sKeys.put(1045, "whenHoldMapping");
            sKeys.put(1046, "whenIdMapping");
            sKeys.put(1047, "whenMissMapping");
            sKeys.put(1048, "whenNoneMapping");
            sKeys.put(1049, "whenPostMapping");
            sKeys.put(1050, "whenRestartMapping");
            sKeys.put(1051, "whenRtaMapping");
            sKeys.put(1052, "whenRtabitMapping");
            sKeys.put(1053, "whenSetupHoldMapping");
            sKeys.put(1054, "whenSetupMapping");
            sKeys.put(1055, "whenSleepMapping");
            sKeys.put(1056, "whenStartMapping");
            sKeys.put(1057, "whenStopMapping");
            sKeys.put(1058, "whenSymbolMapping");
            sKeys.put(1059, "whenSyncMapping");
            sKeys.put(1060, "whenTimeoutMapping");
            sKeys.put(1061, "whenWakeUpMapping");
            sKeys.put(1062, "width");
            sKeys.put(1063, "window");
            sKeys.put(1064, "windowCount");
            sKeys.put(1065, "windowParam");
            sKeys.put(1066, "windowTitleString");
            sKeys.put(1067, "windowTransparency");
            sKeys.put(1068, "xValue");
            sKeys.put(1069, "xyCheck");
            sKeys.put(1070, "xyCheckEnable");
            sKeys.put(1071, "xyMapping");
            sKeys.put(1072, "xyParam");
            sKeys.put(1073, "xyWindowCount");
            sKeys.put(1074, "yValue");
            sKeys.put(1075, "zbdLed");
            sKeys.put(1076, "zoom");
            sKeys.put(1077, "zoomEn");
            sKeys.put(1078, "zoomOffset");
            sKeys.put(1079, "zoomOffsetStr");
            sKeys.put(1080, "zoomScale");
            sKeys.put(1081, "zoomScaleStr");
        }
    }

    /* loaded from: classes.dex */
    private static class InnerLayoutIdLookup {
        static final HashMap<String, Integer> sKeys;

        private InnerLayoutIdLookup() {
        }

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(216);
            sKeys = hashMap;
            hashMap.put("layout/abapter_la_senior_0", Integer.valueOf((int) R.layout.abapter_la_senior));
            sKeys.put("layout/activity_image_preview_0", Integer.valueOf((int) R.layout.activity_image_preview));
            sKeys.put("layout/activity_main_0", Integer.valueOf((int) R.layout.activity_main));
            sKeys.put("layout/activity_rigol_key_test2_0", Integer.valueOf((int) R.layout.activity_rigol_key_test2));
            sKeys.put("layout/activity_rigol_key_test3_0", Integer.valueOf((int) R.layout.activity_rigol_key_test3));
            sKeys.put("layout/activity_screen_saver_0", Integer.valueOf((int) R.layout.activity_screen_saver));
            sKeys.put("layout/adapter_afg_0", Integer.valueOf((int) R.layout.adapter_afg));
            sKeys.put("layout/adapter_awg_0", Integer.valueOf((int) R.layout.adapter_awg));
            sKeys.put("layout/adapter_bode_af_senior_0", Integer.valueOf((int) R.layout.adapter_bode_af_senior));
            sKeys.put("layout/adapter_bode_basic_senior_0", Integer.valueOf((int) R.layout.adapter_bode_basic_senior));
            sKeys.put("layout/adapter_bode_saving_senior_0", Integer.valueOf((int) R.layout.adapter_bode_saving_senior));
            sKeys.put("layout/adapter_bus_analyse_select_item_0", Integer.valueOf((int) R.layout.adapter_bus_analyse_select_item));
            sKeys.put("layout/adapter_bus_eth_analyse_0", Integer.valueOf((int) R.layout.adapter_bus_eth_analyse));
            sKeys.put("layout/adapter_bus_eth_analyse_1000baset_0", Integer.valueOf((int) R.layout.adapter_bus_eth_analyse_1000baset));
            sKeys.put("layout/adapter_bus_eth_analyse_100baset_0", Integer.valueOf((int) R.layout.adapter_bus_eth_analyse_100baset));
            sKeys.put("layout/adapter_bus_eth_analyse_10baset_0", Integer.valueOf((int) R.layout.adapter_bus_eth_analyse_10baset));
            sKeys.put("layout/adapter_bus_setting_0", Integer.valueOf((int) R.layout.adapter_bus_setting));
            sKeys.put("layout/adapter_bus_usb_analyse_0", Integer.valueOf((int) R.layout.adapter_bus_usb_analyse));
            sKeys.put("layout/adapter_decode_1553b_0", Integer.valueOf((int) R.layout.adapter_decode_1553b));
            sKeys.put("layout/adapter_decode_arinc429_0", Integer.valueOf((int) R.layout.adapter_decode_arinc429));
            sKeys.put("layout/adapter_decode_can_0", Integer.valueOf((int) R.layout.adapter_decode_can));
            sKeys.put("layout/adapter_decode_flexray_0", Integer.valueOf((int) R.layout.adapter_decode_flexray));
            sKeys.put("layout/adapter_decode_i2c_0", Integer.valueOf((int) R.layout.adapter_decode_i2c));
            sKeys.put("layout/adapter_decode_i2s_0", Integer.valueOf((int) R.layout.adapter_decode_i2s));
            sKeys.put("layout/adapter_decode_lin_0", Integer.valueOf((int) R.layout.adapter_decode_lin));
            sKeys.put("layout/adapter_decode_most_0", Integer.valueOf((int) R.layout.adapter_decode_most));
            sKeys.put("layout/adapter_decode_parallel_0", Integer.valueOf((int) R.layout.adapter_decode_parallel));
            sKeys.put("layout/adapter_decode_rs232_0", Integer.valueOf((int) R.layout.adapter_decode_rs232));
            sKeys.put("layout/adapter_decode_sent_0", Integer.valueOf((int) R.layout.adapter_decode_sent));
            sKeys.put("layout/adapter_decode_spi_0", Integer.valueOf((int) R.layout.adapter_decode_spi));
            sKeys.put("layout/adapter_decode_usb_0", Integer.valueOf((int) R.layout.adapter_decode_usb));
            sKeys.put("layout/adapter_eye_constant_0", Integer.valueOf((int) R.layout.adapter_eye_constant));
            sKeys.put("layout/adapter_eye_explicit_0", Integer.valueOf((int) R.layout.adapter_eye_explicit));
            sKeys.put("layout/adapter_eye_pll_0", Integer.valueOf((int) R.layout.adapter_eye_pll));
            sKeys.put("layout/adapter_item_autoset_0", Integer.valueOf((int) R.layout.adapter_item_autoset));
            sKeys.put("layout/adapter_item_disk_manage_0", Integer.valueOf((int) R.layout.adapter_item_disk_manage));
            sKeys.put("layout/adapter_item_flex_knob_0", Integer.valueOf((int) R.layout.adapter_item_flex_knob));
            sKeys.put("layout/adapter_item_la_0", Integer.valueOf((int) R.layout.adapter_item_la));
            sKeys.put("layout/adapter_item_math_0", Integer.valueOf((int) R.layout.adapter_item_math));
            sKeys.put("layout/adapter_item_option_0", Integer.valueOf((int) R.layout.adapter_item_option));
            sKeys.put("layout/adapter_item_popupview_decode_0", Integer.valueOf((int) R.layout.adapter_item_popupview_decode));
            sKeys.put("layout/adapter_item_popupview_flex_knob_0", Integer.valueOf((int) R.layout.adapter_item_popupview_flex_knob));
            sKeys.put("layout/adapter_item_popupview_measure_0", Integer.valueOf((int) R.layout.adapter_item_popupview_measure));
            sKeys.put("layout/adapter_item_popupview_probe_0", Integer.valueOf((int) R.layout.adapter_item_popupview_probe));
            sKeys.put("layout/adapter_item_popupview_vertical_0", Integer.valueOf((int) R.layout.adapter_item_popupview_vertical));
            sKeys.put("layout/adapter_item_quality_0", Integer.valueOf((int) R.layout.adapter_item_quality));
            sKeys.put("layout/adapter_item_recyclerview_0", Integer.valueOf((int) R.layout.adapter_item_recyclerview));
            sKeys.put("layout/adapter_item_result_counter_0", Integer.valueOf((int) R.layout.adapter_item_result_counter));
            sKeys.put("layout/adapter_item_result_cursor_0", Integer.valueOf((int) R.layout.adapter_item_result_cursor));
            sKeys.put("layout/adapter_item_result_dvm_0", Integer.valueOf((int) R.layout.adapter_item_result_dvm));
            sKeys.put("layout/adapter_item_result_eye_0", Integer.valueOf((int) R.layout.adapter_item_result_eye));
            sKeys.put("layout/adapter_item_result_histogram_0", Integer.valueOf((int) R.layout.adapter_item_result_histogram));
            sKeys.put("layout/adapter_item_result_item_0", Integer.valueOf((int) R.layout.adapter_item_result_item));
            sKeys.put("layout/adapter_item_result_item_towview_0", Integer.valueOf((int) R.layout.adapter_item_result_item_towview));
            sKeys.put("layout/adapter_item_result_jitter_0", Integer.valueOf((int) R.layout.adapter_item_result_jitter));
            sKeys.put("layout/adapter_item_result_marker_0", Integer.valueOf((int) R.layout.adapter_item_result_marker));
            sKeys.put("layout/adapter_item_result_mask_0", Integer.valueOf((int) R.layout.adapter_item_result_mask));
            sKeys.put("layout/adapter_item_result_meas_histogram_0", Integer.valueOf((int) R.layout.adapter_item_result_meas_histogram));
            sKeys.put("layout/adapter_item_result_measure_0", Integer.valueOf((int) R.layout.adapter_item_result_measure));
            sKeys.put("layout/adapter_item_result_table_content_0", Integer.valueOf((int) R.layout.adapter_item_result_table_content));
            sKeys.put("layout/adapter_item_result_table_header_0", Integer.valueOf((int) R.layout.adapter_item_result_table_header));
            sKeys.put("layout/adapter_item_ripple_0", Integer.valueOf((int) R.layout.adapter_item_ripple));
            sKeys.put("layout/adapter_item_rtsa_0", Integer.valueOf((int) R.layout.adapter_item_rtsa));
            sKeys.put("layout/adapter_item_self_test_0", Integer.valueOf((int) R.layout.adapter_item_self_test));
            sKeys.put("layout/adapter_item_shortcut_0", Integer.valueOf((int) R.layout.adapter_item_shortcut));
            sKeys.put("layout/adapter_item_simple_0", Integer.valueOf((int) R.layout.adapter_item_simple));
            sKeys.put("layout/adapter_item_simple2_0", Integer.valueOf((int) R.layout.adapter_item_simple2));
            sKeys.put("layout/adapter_item_simple3_0", Integer.valueOf((int) R.layout.adapter_item_simple3));
            sKeys.put("layout/adapter_item_simple4_0", Integer.valueOf((int) R.layout.adapter_item_simple4));
            sKeys.put("layout/adapter_item_sparrpw_math_0", Integer.valueOf((int) R.layout.adapter_item_sparrpw_math));
            sKeys.put("layout/adapter_item_spinner_0", Integer.valueOf((int) R.layout.adapter_item_spinner));
            sKeys.put("layout/adapter_item_spinner_disk_0", Integer.valueOf((int) R.layout.adapter_item_spinner_disk));
            sKeys.put("layout/adapter_item_vertical_0", Integer.valueOf((int) R.layout.adapter_item_vertical));
            sKeys.put("layout/adapter_jitter_constant_0", Integer.valueOf((int) R.layout.adapter_jitter_constant));
            sKeys.put("layout/adapter_jitter_explicit_0", Integer.valueOf((int) R.layout.adapter_jitter_explicit));
            sKeys.put("layout/adapter_jitter_pll_0", Integer.valueOf((int) R.layout.adapter_jitter_pll));
            sKeys.put("layout/adapter_la_basic_0", Integer.valueOf((int) R.layout.adapter_la_basic));
            sKeys.put("layout/adapter_la_color_0", Integer.valueOf((int) R.layout.adapter_la_color));
            sKeys.put("layout/adapter_math_arith_0", Integer.valueOf((int) R.layout.adapter_math_arith));
            sKeys.put("layout/adapter_math_fft_0", Integer.valueOf((int) R.layout.adapter_math_fft));
            sKeys.put("layout/adapter_math_filter_0", Integer.valueOf((int) R.layout.adapter_math_filter));
            sKeys.put("layout/adapter_math_fun_0", Integer.valueOf((int) R.layout.adapter_math_fun));
            sKeys.put("layout/adapter_math_logic_0", Integer.valueOf((int) R.layout.adapter_math_logic));
            sKeys.put("layout/adapter_rtsa_basesetting_0", Integer.valueOf((int) R.layout.adapter_rtsa_basesetting));
            sKeys.put("layout/adapter_rtsa_marker_0", Integer.valueOf((int) R.layout.adapter_rtsa_marker));
            sKeys.put("layout/adapter_rtsa_peak_0", Integer.valueOf((int) R.layout.adapter_rtsa_peak));
            sKeys.put("layout/adapter_search_edge_0", Integer.valueOf((int) R.layout.adapter_search_edge));
            sKeys.put("layout/adapter_search_trigger_pulse_0", Integer.valueOf((int) R.layout.adapter_search_trigger_pulse));
            sKeys.put("layout/adapter_stat_reset_0", Integer.valueOf((int) R.layout.adapter_stat_reset));
            sKeys.put("layout/adapter_storage_load_0", Integer.valueOf((int) R.layout.adapter_storage_load));
            sKeys.put("layout/adapter_storage_save_0", Integer.valueOf((int) R.layout.adapter_storage_save));
            sKeys.put("layout/adapter_storage_upgrade_0", Integer.valueOf((int) R.layout.adapter_storage_upgrade));
            sKeys.put("layout/adapter_trigger_1553b_0", Integer.valueOf((int) R.layout.adapter_trigger_1553b));
            sKeys.put("layout/adapter_trigger_can_0", Integer.valueOf((int) R.layout.adapter_trigger_can));
            sKeys.put("layout/adapter_trigger_delay_0", Integer.valueOf((int) R.layout.adapter_trigger_delay));
            sKeys.put("layout/adapter_trigger_duration_0", Integer.valueOf((int) R.layout.adapter_trigger_duration));
            sKeys.put("layout/adapter_trigger_edge_0", Integer.valueOf((int) R.layout.adapter_trigger_edge));
            sKeys.put("layout/adapter_trigger_flexray_0", Integer.valueOf((int) R.layout.adapter_trigger_flexray));
            sKeys.put("layout/adapter_trigger_i2c_0", Integer.valueOf((int) R.layout.adapter_trigger_i2c));
            sKeys.put("layout/adapter_trigger_i2s_0", Integer.valueOf((int) R.layout.adapter_trigger_i2s));
            sKeys.put("layout/adapter_trigger_lin_0", Integer.valueOf((int) R.layout.adapter_trigger_lin));
            sKeys.put("layout/adapter_trigger_nth_0", Integer.valueOf((int) R.layout.adapter_trigger_nth));
            sKeys.put("layout/adapter_trigger_over_0", Integer.valueOf((int) R.layout.adapter_trigger_over));
            sKeys.put("layout/adapter_trigger_pattern_0", Integer.valueOf((int) R.layout.adapter_trigger_pattern));
            sKeys.put("layout/adapter_trigger_pulse_0", Integer.valueOf((int) R.layout.adapter_trigger_pulse));
            sKeys.put("layout/adapter_trigger_rs232_0", Integer.valueOf((int) R.layout.adapter_trigger_rs232));
            sKeys.put("layout/adapter_trigger_runt_0", Integer.valueOf((int) R.layout.adapter_trigger_runt));
            sKeys.put("layout/adapter_trigger_setup_hold_0", Integer.valueOf((int) R.layout.adapter_trigger_setup_hold));
            sKeys.put("layout/adapter_trigger_slope_0", Integer.valueOf((int) R.layout.adapter_trigger_slope));
            sKeys.put("layout/adapter_trigger_spi_0", Integer.valueOf((int) R.layout.adapter_trigger_spi));
            sKeys.put("layout/adapter_trigger_timeout_0", Integer.valueOf((int) R.layout.adapter_trigger_timeout));
            sKeys.put("layout/adapter_trigger_video_0", Integer.valueOf((int) R.layout.adapter_trigger_video));
            sKeys.put("layout/adapter_type_checkbox_item_0", Integer.valueOf((int) R.layout.adapter_type_checkbox_item));
            sKeys.put("layout/adapter_type_spinner_item_0", Integer.valueOf((int) R.layout.adapter_type_spinner_item));
            sKeys.put("layout/adapter_type_switch_item_0", Integer.valueOf((int) R.layout.adapter_type_switch_item));
            sKeys.put("layout/adapter_type_text_group_0", Integer.valueOf((int) R.layout.adapter_type_text_group));
            sKeys.put("layout/adapter_type_text_item_0", Integer.valueOf((int) R.layout.adapter_type_text_item));
            sKeys.put("layout/adapter_utility_about_item_0", Integer.valueOf((int) R.layout.adapter_utility_about_item));
            sKeys.put("layout/adapter_utility_allmeasure_0", Integer.valueOf((int) R.layout.adapter_utility_allmeasure));
            sKeys.put("layout/adapter_utility_autosetting_0", Integer.valueOf((int) R.layout.adapter_utility_autosetting));
            sKeys.put("layout/adapter_utility_basesetting_0", Integer.valueOf((int) R.layout.adapter_utility_basesetting));
            sKeys.put("layout/adapter_utility_calibration_0", Integer.valueOf((int) R.layout.adapter_utility_calibration));
            sKeys.put("layout/adapter_utility_email_0", Integer.valueOf((int) R.layout.adapter_utility_email));
            sKeys.put("layout/adapter_utility_information_0", Integer.valueOf((int) R.layout.adapter_utility_information));
            sKeys.put("layout/adapter_utility_lansetting_item_0", Integer.valueOf((int) R.layout.adapter_utility_lansetting_item));
            sKeys.put("layout/adapter_utility_lansetting_item_test_0", Integer.valueOf((int) R.layout.adapter_utility_lansetting_item_test));
            sKeys.put("layout/adapter_utility_other_0", Integer.valueOf((int) R.layout.adapter_utility_other));
            sKeys.put("layout/adapter_utility_quick_0", Integer.valueOf((int) R.layout.adapter_utility_quick));
            sKeys.put("layout/adapter_utility_quick_screenshot_0", Integer.valueOf((int) R.layout.adapter_utility_quick_screenshot));
            sKeys.put("layout/adapter_utility_quick_title_0", Integer.valueOf((int) R.layout.adapter_utility_quick_title));
            sKeys.put("layout/adapter_utility_save_group_0", Integer.valueOf((int) R.layout.adapter_utility_save_group));
            sKeys.put("layout/adapter_utility_save_wave_0", Integer.valueOf((int) R.layout.adapter_utility_save_wave));
            sKeys.put("layout/adapter_utility_screensaver_0", Integer.valueOf((int) R.layout.adapter_utility_screensaver));
            sKeys.put("layout/adapter_utility_selfcheck_0", Integer.valueOf((int) R.layout.adapter_utility_selfcheck));
            sKeys.put("layout/adapter_utilty_power_item_0", Integer.valueOf((int) R.layout.adapter_utilty_power_item));
            sKeys.put("layout/adapter_wave_save_0", Integer.valueOf((int) R.layout.adapter_wave_save));
            sKeys.put("layout/bode_result_popuwin_0", Integer.valueOf((int) R.layout.bode_result_popuwin));
            sKeys.put("layout/custom_datepicker_dialog_ant_0", Integer.valueOf((int) R.layout.custom_datepicker_dialog_ant));
            sKeys.put("layout/custom_timepicker_dialog_ant_0", Integer.valueOf((int) R.layout.custom_timepicker_dialog_ant));
            sKeys.put("layout/format_transform_key_0", Integer.valueOf((int) R.layout.format_transform_key));
            sKeys.put("layout/fragment_cont_0", Integer.valueOf((int) R.layout.fragment_cont));
            sKeys.put("layout/fragment_navigation_bar_0", Integer.valueOf((int) R.layout.fragment_navigation_bar));
            sKeys.put("layout/fragment_results_bar_0", Integer.valueOf((int) R.layout.fragment_results_bar));
            sKeys.put("layout/fragment_settings_bar_0", Integer.valueOf((int) R.layout.fragment_settings_bar));
            sKeys.put("layout/fragment_waveform_0", Integer.valueOf((int) R.layout.fragment_waveform));
            sKeys.put("layout/math_recyclerview_0", Integer.valueOf((int) R.layout.math_recyclerview));
            sKeys.put("layout/popup_math_list_0", Integer.valueOf((int) R.layout.popup_math_list));
            sKeys.put("layout/popupview_adc_setting_0", Integer.valueOf((int) R.layout.popupview_adc_setting));
            sKeys.put("layout/popupview_adcser_0", Integer.valueOf((int) R.layout.popupview_adcser));
            sKeys.put("layout/popupview_afg_awg_0", Integer.valueOf((int) R.layout.popupview_afg_awg));
            sKeys.put("layout/popupview_alert_0", Integer.valueOf((int) R.layout.popupview_alert));
            sKeys.put("layout/popupview_analyse_0", Integer.valueOf((int) R.layout.popupview_analyse));
            sKeys.put("layout/popupview_analyse_eth_result_0", Integer.valueOf((int) R.layout.popupview_analyse_eth_result));
            sKeys.put("layout/popupview_analyse_usb_result_0", Integer.valueOf((int) R.layout.popupview_analyse_usb_result));
            sKeys.put("layout/popupview_autoset_0", Integer.valueOf((int) R.layout.popupview_autoset));
            sKeys.put("layout/popupview_board_test_0", Integer.valueOf((int) R.layout.popupview_board_test));
            sKeys.put("layout/popupview_bode_0", Integer.valueOf((int) R.layout.popupview_bode));
            sKeys.put("layout/popupview_bus_analyse_0", Integer.valueOf((int) R.layout.popupview_bus_analyse));
            sKeys.put("layout/popupview_calibration_0", Integer.valueOf((int) R.layout.popupview_calibration));
            sKeys.put("layout/popupview_custom_list_0", Integer.valueOf((int) R.layout.popupview_custom_list));
            sKeys.put("layout/popupview_ddr_0", Integer.valueOf((int) R.layout.popupview_ddr));
            sKeys.put("layout/popupview_decode_0", Integer.valueOf((int) R.layout.popupview_decode));
            sKeys.put("layout/popupview_disk_manage_0", Integer.valueOf((int) R.layout.popupview_disk_manage));
            sKeys.put("layout/popupview_display_0", Integer.valueOf((int) R.layout.popupview_display));
            sKeys.put("layout/popupview_eye_0", Integer.valueOf((int) R.layout.popupview_eye));
            sKeys.put("layout/popupview_eyeconfig_0", Integer.valueOf((int) R.layout.popupview_eyeconfig));
            sKeys.put("layout/popupview_eyemove_0", Integer.valueOf((int) R.layout.popupview_eyemove));
            sKeys.put("layout/popupview_flex_knob_0", Integer.valueOf((int) R.layout.popupview_flex_knob));
            sKeys.put("layout/popupview_horizontal_0", Integer.valueOf((int) R.layout.popupview_horizontal));
            sKeys.put("layout/popupview_jitter_0", Integer.valueOf((int) R.layout.popupview_jitter));
            sKeys.put("layout/popupview_keyboard_0", Integer.valueOf((int) R.layout.popupview_keyboard));
            sKeys.put("layout/popupview_la_0", Integer.valueOf((int) R.layout.popupview_la));
            sKeys.put("layout/popupview_la_calibration_0", Integer.valueOf((int) R.layout.popupview_la_calibration));
            sKeys.put("layout/popupview_load_0", Integer.valueOf((int) R.layout.popupview_load));
            sKeys.put("layout/popupview_loading_0", Integer.valueOf((int) R.layout.popupview_loading));
            sKeys.put("layout/popupview_logcat_0", Integer.valueOf((int) R.layout.popupview_logcat));
            sKeys.put("layout/popupview_mask_0", Integer.valueOf((int) R.layout.popupview_mask));
            sKeys.put("layout/popupview_math_0", Integer.valueOf((int) R.layout.popupview_math));
            sKeys.put("layout/popupview_measure_0", Integer.valueOf((int) R.layout.popupview_measure));
            sKeys.put("layout/popupview_multi_window_0", Integer.valueOf((int) R.layout.popupview_multi_window));
            sKeys.put("layout/popupview_navigate_0", Integer.valueOf((int) R.layout.popupview_navigate));
            sKeys.put("layout/popupview_opensource_0", Integer.valueOf((int) R.layout.popupview_opensource));
            sKeys.put("layout/popupview_probe_0", Integer.valueOf((int) R.layout.popupview_probe));
            sKeys.put("layout/popupview_ref_0", Integer.valueOf((int) R.layout.popupview_ref));
            sKeys.put("layout/popupview_remind_0", Integer.valueOf((int) R.layout.popupview_remind));
            sKeys.put("layout/popupview_result_counter_0", Integer.valueOf((int) R.layout.popupview_result_counter));
            sKeys.put("layout/popupview_result_cursor_0", Integer.valueOf((int) R.layout.popupview_result_cursor));
            sKeys.put("layout/popupview_result_dvm_0", Integer.valueOf((int) R.layout.popupview_result_dvm));
            sKeys.put("layout/popupview_result_histogram_0", Integer.valueOf((int) R.layout.popupview_result_histogram));
            sKeys.put("layout/popupview_result_measure_0", Integer.valueOf((int) R.layout.popupview_result_measure));
            sKeys.put("layout/popupview_rtsa_0", Integer.valueOf((int) R.layout.popupview_rtsa));
            sKeys.put("layout/popupview_save_0", Integer.valueOf((int) R.layout.popupview_save));
            sKeys.put("layout/popupview_screen_flip_0", Integer.valueOf((int) R.layout.popupview_screen_flip));
            sKeys.put("layout/popupview_search_0", Integer.valueOf((int) R.layout.popupview_search));
            sKeys.put("layout/popupview_spinner_0", Integer.valueOf((int) R.layout.popupview_spinner));
            sKeys.put("layout/popupview_start_menu_0", Integer.valueOf((int) R.layout.popupview_start_menu));
            sKeys.put("layout/popupview_storage_0", Integer.valueOf((int) R.layout.popupview_storage));
            sKeys.put("layout/popupview_trigger_0", Integer.valueOf((int) R.layout.popupview_trigger));
            sKeys.put("layout/popupview_upa_0", Integer.valueOf((int) R.layout.popupview_upa));
            sKeys.put("layout/popupview_update_0", Integer.valueOf((int) R.layout.popupview_update));
            sKeys.put("layout/popupview_upgrade_0", Integer.valueOf((int) R.layout.popupview_upgrade));
            sKeys.put("layout/popupview_utility_0", Integer.valueOf((int) R.layout.popupview_utility));
            sKeys.put("layout/popupview_vertical_0", Integer.valueOf((int) R.layout.popupview_vertical));
            sKeys.put("layout/popupview_wave_intensity_0", Integer.valueOf((int) R.layout.popupview_wave_intensity));
            sKeys.put("layout/popupview_wave_record_0", Integer.valueOf((int) R.layout.popupview_wave_record));
            sKeys.put("layout/popupview_xy_0", Integer.valueOf((int) R.layout.popupview_xy));
            sKeys.put("layout/popuview_help_0", Integer.valueOf((int) R.layout.popuview_help));
            sKeys.put("layout/popuview_mini_bode_0", Integer.valueOf((int) R.layout.popuview_mini_bode));
            sKeys.put("layout/presentation_miniscreen_0", Integer.valueOf((int) R.layout.presentation_miniscreen));
            sKeys.put("layout/presentation_motor_0", Integer.valueOf((int) R.layout.presentation_motor));
            sKeys.put("layout/table_simple_0", Integer.valueOf((int) R.layout.table_simple));
            sKeys.put("layout/upa_poppview_ripper_0", Integer.valueOf((int) R.layout.upa_poppview_ripper));
            sKeys.put("layout/upa_popupview_connection_0", Integer.valueOf((int) R.layout.upa_popupview_connection));
            sKeys.put("layout/window_bode_0", Integer.valueOf((int) R.layout.window_bode));
            sKeys.put("layout/window_simple_0", Integer.valueOf((int) R.layout.window_simple));
            sKeys.put("layout/window_waveform_0", Integer.valueOf((int) R.layout.window_waveform));
        }
    }
}
