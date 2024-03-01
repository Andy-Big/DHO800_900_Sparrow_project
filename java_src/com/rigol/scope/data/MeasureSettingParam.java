package com.rigol.scope.data;

import androidx.databinding.Bindable;
import com.blankj.utilcode.util.ThreadUtils;
import com.rigol.scope.cil.API;
import com.rigol.scope.cil.MessageAttr;
import com.rigol.scope.cil.MessageID;
import com.rigol.scope.cil.ServiceEnum;
import com.rigol.scope.utilities.AorBManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;
/* compiled from: MeasureSettingParam.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b6\u0018\u0000 ²\u00012\u00020\u0001:\u0002²\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010|\u001a\u00020}H\u0016J\u0006\u0010~\u001a\u00020\nJ\u0006\u0010\u007f\u001a\u00020\u0010J\u0007\u0010\u0080\u0001\u001a\u00020\u0010J\u0007\u0010\u0081\u0001\u001a\u00020\u0010J\u0007\u0010\u0082\u0001\u001a\u00020%J\u0007\u0010\u0083\u0001\u001a\u00020%J\u0007\u0010\u0084\u0001\u001a\u00020%J\u0007\u0010\u0085\u0001\u001a\u00020\nJ\u0007\u0010\u0086\u0001\u001a\u00020vJ\u0007\u0010\u0087\u0001\u001a\u000201J\u0007\u0010\u0088\u0001\u001a\u00020%J\u0007\u0010\u0089\u0001\u001a\u00020\nJ\u0007\u0010\u008a\u0001\u001a\u00020\nJ\u0007\u0010\u008b\u0001\u001a\u00020\nJ\u0007\u0010\u008c\u0001\u001a\u000201J\u0007\u0010\u008d\u0001\u001a\u000201J\u0007\u0010\u008e\u0001\u001a\u00020\nJ\u0007\u0010\u008f\u0001\u001a\u00020%J\u0007\u0010\u0090\u0001\u001a\u00020\u0010J\u0007\u0010\u0091\u0001\u001a\u00020\u0010J\u0007\u0010\u0092\u0001\u001a\u00020\u0010J\u0007\u0010\u0093\u0001\u001a\u000201J\u0007\u0010\u0094\u0001\u001a\u00020mJ\u0007\u0010\u0095\u0001\u001a\u00020\nJ\t\u0010\u0096\u0001\u001a\u00020}H\u0016J\u000f\u0010\u0097\u0001\u001a\u00020}2\u0006\u0010\u000b\u001a\u00020\nJ\u000f\u0010\u0098\u0001\u001a\u00020}2\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0099\u0001\u001a\u00020}2\u0007\u0010\u009a\u0001\u001a\u00020\u0010J\u000f\u0010\u009b\u0001\u001a\u00020}2\u0006\u0010\u001c\u001a\u00020\u0010J\u000f\u0010\u009c\u0001\u001a\u00020}2\u0006\u0010&\u001a\u00020%J\u000f\u0010\u009d\u0001\u001a\u00020}2\u0006\u0010+\u001a\u00020%J\u0010\u0010\u009e\u0001\u001a\u00020}2\u0007\u0010\u009f\u0001\u001a\u00020%J\u0010\u0010 \u0001\u001a\u00020}2\u0007\u0010¡\u0001\u001a\u00020vJ\u0010\u0010¢\u0001\u001a\u00020}2\u0007\u0010£\u0001\u001a\u000201J\u000f\u0010¤\u0001\u001a\u00020}2\u0006\u00107\u001a\u00020%J\u000f\u0010¥\u0001\u001a\u00020}2\u0006\u0010:\u001a\u00020\nJ\u000f\u0010¦\u0001\u001a\u00020}2\u0006\u0010=\u001a\u00020\nJ\u0010\u0010§\u0001\u001a\u00020}2\u0007\u0010£\u0001\u001a\u000201J\u0010\u0010¨\u0001\u001a\u00020}2\u0007\u0010£\u0001\u001a\u000201J\u000f\u0010©\u0001\u001a\u00020}2\u0006\u0010O\u001a\u00020\nJ\u000f\u0010ª\u0001\u001a\u00020}2\u0006\u0010U\u001a\u00020%J\u000f\u0010«\u0001\u001a\u00020}2\u0006\u0010X\u001a\u00020\u0010J\u000f\u0010¬\u0001\u001a\u00020}2\u0006\u0010^\u001a\u00020\u0010J\u000f\u0010\u00ad\u0001\u001a\u00020}2\u0006\u0010d\u001a\u00020\u0010J\u000f\u0010®\u0001\u001a\u00020}2\u0006\u0010j\u001a\u000201J\u000f\u0010¯\u0001\u001a\u00020}2\u0006\u0010n\u001a\u00020mJ\u000f\u0010°\u0001\u001a\u00020}2\u0006\u0010s\u001a\u00020\nJ\u0007\u0010±\u0001\u001a\u00020}R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR&\u0010\u001c\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u001a\u0010\u001f\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR&\u0010\"\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015R&\u0010&\u001a\u00020%2\u0006\u0010\t\u001a\u00020%8G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R&\u0010+\u001a\u00020%2\u0006\u0010\t\u001a\u00020%8G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R&\u0010.\u001a\u00020%2\u0006\u0010\t\u001a\u00020%8G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*R&\u00102\u001a\u0002012\u0006\u0010\t\u001a\u0002018G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R&\u00107\u001a\u00020%2\u0006\u0010\t\u001a\u00020%8G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010(\"\u0004\b9\u0010*R&\u0010:\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\r\"\u0004\b<\u0010\u000fR&\u0010=\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\r\"\u0004\b?\u0010\u000fR&\u0010@\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\r\"\u0004\bB\u0010\u000fR&\u0010C\u001a\u0002012\u0006\u0010\t\u001a\u0002018G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u00104\"\u0004\bE\u00106R&\u0010F\u001a\u0002012\u0006\u0010\t\u001a\u0002018G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u00104\"\u0004\bH\u00106R&\u0010I\u001a\u00020%2\u0006\u0010\t\u001a\u00020%8G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010(\"\u0004\bK\u0010*R&\u0010L\u001a\u00020%2\u0006\u0010\t\u001a\u00020%8G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010(\"\u0004\bN\u0010*R&\u0010O\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\r\"\u0004\bQ\u0010\u000fR\u001a\u0010R\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0019\"\u0004\bT\u0010\u001bR&\u0010U\u001a\u00020%2\u0006\u0010\t\u001a\u00020%8G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010(\"\u0004\bW\u0010*R&\u0010X\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u0013\"\u0004\bZ\u0010\u0015R\u001a\u0010[\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u0019\"\u0004\b]\u0010\u001bR&\u0010^\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u0013\"\u0004\b`\u0010\u0015R\u001a\u0010a\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u0019\"\u0004\bc\u0010\u001bR&\u0010d\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0013\"\u0004\bf\u0010\u0015R\u001a\u0010g\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u0019\"\u0004\bi\u0010\u001bR&\u0010j\u001a\u0002012\u0006\u0010\t\u001a\u0002018G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u00104\"\u0004\bl\u00106R&\u0010n\u001a\u00020m2\u0006\u0010\t\u001a\u00020m8G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR&\u0010s\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010\r\"\u0004\bu\u0010\u000fR&\u0010w\u001a\u00020v2\u0006\u0010\t\u001a\u00020v8G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{¨\u0006³\u0001"}, d2 = {"Lcom/rigol/scope/data/MeasureSettingParam;", "Lcom/rigol/scope/data/BaseParam;", "()V", "aorBManager", "Lcom/rigol/scope/utilities/AorBManager;", "getAorBManager", "()Lcom/rigol/scope/utilities/AorBManager;", "setAorBManager", "(Lcom/rigol/scope/utilities/AorBManager;)V", "value", "", "baseMethod", "getBaseMethod", "()I", "setBaseMethod", "(I)V", "", "cursorA", "getCursorA", "()J", "setCursorA", "(J)V", "cursorAAttr", "Lcom/rigol/scope/cil/MessageAttr;", "getCursorAAttr", "()Lcom/rigol/scope/cil/MessageAttr;", "setCursorAAttr", "(Lcom/rigol/scope/cil/MessageAttr;)V", "cursorB", "getCursorB", "setCursorB", "cursorBAttr", "getCursorBAttr", "setCursorBAttr", "cursorBothAB", "getCursorBothAB", "setCursorBothAB", "", "cursorIndicator", "getCursorIndicator", "()Z", "setCursorIndicator", "(Z)V", "cursorThreshold", "getCursorThreshold", "setCursorThreshold", "histoEnable", "getHistoEnable", "setHistoEnable", "Lcom/rigol/scope/cil/ServiceEnum$Chan;", "measureAllSrc", "getMeasureAllSrc", "()Lcom/rigol/scope/cil/ServiceEnum$Chan;", "setMeasureAllSrc", "(Lcom/rigol/scope/cil/ServiceEnum$Chan;)V", "methodState", "getMethodState", "setMethodState", "mode", "getMode", "setMode", "region", "getRegion", "setRegion", "regionSelect", "getRegionSelect", "setRegionSelect", "selectSourceA", "getSelectSourceA", "setSelectSourceA", "selectSourceB", "getSelectSourceB", "setSelectSourceB", "showSelectSourceB", "getShowSelectSourceB", "setShowSelectSourceB", "showThresLine", "getShowThresLine", "setShowThresLine", "statCount", "getStatCount", "setStatCount", "statCountAttr", "getStatCountAttr", "setStatCountAttr", "statisticState", "getStatisticState", "setStatisticState", "thresholdHigh", "getThresholdHigh", "setThresholdHigh", "thresholdHighAttr", "getThresholdHighAttr", "setThresholdHighAttr", "thresholdLow", "getThresholdLow", "setThresholdLow", "thresholdLowAttr", "getThresholdLowAttr", "setThresholdLowAttr", "thresholdMiddle", "getThresholdMiddle", "setThresholdMiddle", "thresholdMiddleAttr", "getThresholdMiddleAttr", "setThresholdMiddleAttr", "thresholdSource", "getThresholdSource", "setThresholdSource", "Lcom/rigol/scope/cil/ServiceEnum$ThreType;", "thresholdType", "getThresholdType", "()Lcom/rigol/scope/cil/ServiceEnum$ThreType;", "setThresholdType", "(Lcom/rigol/scope/cil/ServiceEnum$ThreType;)V", "topMethod", "getTopMethod", "setTopMethod", "", "windowTitleString", "getWindowTitleString", "()Ljava/lang/String;", "setWindowTitleString", "(Ljava/lang/String;)V", "readAll", "", "readBaseMethod", "readCursorA", "readCursorB", "readCursorBothAB", "readCursorIndicator", "readCursorThreshold", "readHistoEnable", "readMeaType", "readMeasHistoWindowTitle", "readMeasureAllSrc", "readMethodState", "readMode", "readPosition", "readRegion", "readSelectSourceA", "readSelectSourceB", "readStatCount", "readStatisticState", "readThresholdHigh", "readThresholdLow", "readThresholdMiddle", "readThresholdSource", "readThresholdType", "readTopMethod", "reset", "saveBaseMethod", "saveCursorA", "saveCursorAB", "cursorAB", "saveCursorB", "saveCursorIndicator", "saveCursorThreshold", "saveHistoEnable", "enable", "saveMeasHistoWindowTitle", "windowTitle", "saveMeasureAllSrc", "src", "saveMethodState", "saveMode", "saveRegion", "saveSelectSourceA", "saveSelectSourceB", "saveStatCount", "saveStatisticState", "saveThresholdHigh", "saveThresholdLow", "saveThresholdMiddle", "saveThresholdSource", "saveThresholdType", "saveTopMethod", "saveUpaQueryPowerData", "Companion", "app_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class MeasureSettingParam extends BaseParam {
    public static final Companion Companion = new Companion(null);
    public static final int Cursor_MODE = 2;
    public static final int MAIN_MODE = 0;
    public static final int SELECT_A = 0;
    public static final int SELECT_AB = 2;
    public static final int SELECT_B = 1;
    public static final int ZOOM_MODE = 1;
    public AorBManager aorBManager;
    private int baseMethod;
    private long cursorA;
    private MessageAttr cursorAAttr;
    private long cursorB;
    private MessageAttr cursorBAttr;
    private long cursorBothAB;
    private boolean cursorIndicator;
    private boolean cursorThreshold;
    private boolean histoEnable;
    private ServiceEnum.Chan measureAllSrc;
    private boolean methodState;
    private int mode;
    private int region;
    private int regionSelect;
    private ServiceEnum.Chan selectSourceA;
    private ServiceEnum.Chan selectSourceB;
    private boolean showSelectSourceB;
    private boolean showThresLine;
    private int statCount;
    private MessageAttr statCountAttr;
    private boolean statisticState;
    private long thresholdHigh;
    private MessageAttr thresholdHighAttr;
    private long thresholdLow;
    private MessageAttr thresholdLowAttr;
    private long thresholdMiddle;
    private MessageAttr thresholdMiddleAttr;
    private ServiceEnum.Chan thresholdSource;
    private ServiceEnum.ThreType thresholdType;
    private int topMethod;
    private String windowTitleString;

    public MeasureSettingParam() {
        super(28);
        ServiceEnum.Chan chan;
        ServiceEnum.Chan chan2;
        ServiceEnum.ThreType threType;
        ServiceEnum.Chan chan3;
        chan = MeasureSettingParamKt.DEFAULT_SELECT_SOURCE_A;
        this.selectSourceA = chan;
        chan2 = MeasureSettingParamKt.DEFAULT_SELECT_SOURCE_B;
        this.selectSourceB = chan2;
        this.measureAllSrc = ServiceEnum.Chan.chan1;
        this.statCount = 1000;
        this.statCountAttr = new MessageAttr();
        threType = MeasureSettingParamKt.DEFAULT_THRESHOLDTYPE;
        this.thresholdType = threType;
        chan3 = MeasureSettingParamKt.DEFAULT_THRESHOLDSOURCE;
        this.thresholdSource = chan3;
        this.thresholdHigh = 90L;
        this.thresholdMiddle = 50L;
        this.thresholdLow = 10L;
        this.thresholdHighAttr = new MessageAttr();
        this.thresholdMiddleAttr = new MessageAttr();
        this.thresholdLowAttr = new MessageAttr();
        this.windowTitleString = "";
        this.cursorA = 200L;
        this.cursorB = 800L;
        this.cursorAAttr = new MessageAttr();
        this.cursorBAttr = new MessageAttr();
    }

    /* compiled from: MeasureSettingParam.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/rigol/scope/data/MeasureSettingParam$Companion;", "", "()V", "Cursor_MODE", "", "MAIN_MODE", "SELECT_A", "SELECT_AB", "SELECT_B", "ZOOM_MODE", "app_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final AorBManager getAorBManager() {
        AorBManager aorBManager = this.aorBManager;
        if (aorBManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("aorBManager");
        }
        return aorBManager;
    }

    public final void setAorBManager(AorBManager aorBManager) {
        Intrinsics.checkNotNullParameter(aorBManager, "<set-?>");
        this.aorBManager = aorBManager;
    }

    @Bindable
    public final ServiceEnum.Chan getSelectSourceA() {
        return this.selectSourceA;
    }

    public final void setSelectSourceA(ServiceEnum.Chan value) {
        Intrinsics.checkNotNullParameter(value, "value");
        log("selectSourceA", this.selectSourceA, value);
        this.selectSourceA = value;
        notifyPropertyChanged(785);
    }

    @Bindable
    public final ServiceEnum.Chan getSelectSourceB() {
        return this.selectSourceB;
    }

    public final void setSelectSourceB(ServiceEnum.Chan value) {
        Intrinsics.checkNotNullParameter(value, "value");
        log("selectSourceB", this.selectSourceB, value);
        this.selectSourceB = value;
        notifyPropertyChanged(786);
    }

    @Bindable
    public final boolean getShowSelectSourceB() {
        return this.showSelectSourceB;
    }

    public final void setShowSelectSourceB(boolean z) {
        log("showSelectSourceB", Boolean.valueOf(this.showSelectSourceB), Boolean.valueOf(z));
        this.showSelectSourceB = z;
        notifyPropertyChanged(825);
    }

    @Bindable
    public final boolean getShowThresLine() {
        return this.showThresLine;
    }

    public final void setShowThresLine(boolean z) {
        log("showThresLine", Boolean.valueOf(this.showThresLine), Boolean.valueOf(z));
        this.showThresLine = z;
        notifyPropertyChanged(830);
        syncData(MessageID.MSG_APP_THRESLINE_DISPLAY, Boolean.valueOf(this.showThresLine));
    }

    @Bindable
    public final ServiceEnum.Chan getMeasureAllSrc() {
        return this.measureAllSrc;
    }

    public final void setMeasureAllSrc(ServiceEnum.Chan value) {
        Intrinsics.checkNotNullParameter(value, "value");
        log("measureAllSrc", this.measureAllSrc, value);
        this.measureAllSrc = value;
        notifyPropertyChanged(524);
        syncData(MessageID.MSG_APP_MEAS_ALL_SRC, this.measureAllSrc);
    }

    @Bindable
    public final int getMode() {
        return this.mode;
    }

    public final void setMode(int i) {
        log("mode", Integer.valueOf(this.mode), Integer.valueOf(i));
        this.mode = i;
        notifyPropertyChanged(539);
    }

    @Bindable
    public final boolean getCursorIndicator() {
        return this.cursorIndicator;
    }

    public final void setCursorIndicator(boolean z) {
        log("cursorIndicator", Boolean.valueOf(this.cursorIndicator), Boolean.valueOf(z));
        this.cursorIndicator = z;
        notifyPropertyChanged(200);
        syncData(MessageID.MSG_APP_MEAS_INDICATOR, Boolean.valueOf(this.cursorIndicator));
    }

    @Bindable
    public final boolean getCursorThreshold() {
        return this.cursorThreshold;
    }

    public final void setCursorThreshold(boolean z) {
        log("cursorThreshold", Boolean.valueOf(this.cursorThreshold), Boolean.valueOf(z));
        this.cursorThreshold = z;
        notifyPropertyChanged(203);
        syncData(MessageID.MSG_APP_MEAS_THRESHOLD, Boolean.valueOf(this.cursorThreshold));
    }

    @Bindable
    public final boolean getStatisticState() {
        return this.statisticState;
    }

    public final void setStatisticState(boolean z) {
        log("statisticState", Boolean.valueOf(this.statisticState), Boolean.valueOf(z));
        this.statisticState = z;
        notifyPropertyChanged(897);
    }

    @Bindable
    public final int getStatCount() {
        return this.statCount;
    }

    public final void setStatCount(int i) {
        log("statCount", Integer.valueOf(this.statCount), Integer.valueOf(i));
        this.statCount = i;
        notifyPropertyChanged(892);
    }

    public final MessageAttr getStatCountAttr() {
        return this.statCountAttr;
    }

    public final void setStatCountAttr(MessageAttr messageAttr) {
        Intrinsics.checkNotNullParameter(messageAttr, "<set-?>");
        this.statCountAttr = messageAttr;
    }

    @Bindable
    public final ServiceEnum.ThreType getThresholdType() {
        return this.thresholdType;
    }

    public final void setThresholdType(ServiceEnum.ThreType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        log("thresholdType", this.thresholdType, value);
        this.thresholdType = value;
        notifyPropertyChanged(921);
        syncData(MessageID.MSG_APP_MEAS_TH_HIGH_TYPE, this.thresholdType);
    }

    @Bindable
    public final ServiceEnum.Chan getThresholdSource() {
        return this.thresholdSource;
    }

    public final void setThresholdSource(ServiceEnum.Chan value) {
        Intrinsics.checkNotNullParameter(value, "value");
        log("thresholdSource", this.thresholdSource, value);
        this.thresholdSource = value;
        notifyPropertyChanged(920);
    }

    @Bindable
    public final long getThresholdHigh() {
        return this.thresholdHigh;
    }

    public final void setThresholdHigh(long j) {
        log("thresholdHigh", Long.valueOf(this.thresholdHigh), Long.valueOf(j));
        this.thresholdHigh = j;
        notifyPropertyChanged(917);
        if (this.thresholdType != ServiceEnum.ThreType.TH_TYPE_PER) {
            syncData(MessageID.MSG_MEAS_HIGH_THRE, Long.valueOf(j));
            syncData(MessageID.MSG_MEAS_MID_THRE, Long.valueOf(j));
            syncData(MessageID.MSG_MEAS_LOW_THRE, Long.valueOf(j));
        }
        ThreadUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.rigol.scope.data.MeasureSettingParam$thresholdHigh$1
            @Override // java.lang.Runnable
            public final void run() {
                MeasureSettingParam measureSettingParam = MeasureSettingParam.this;
                measureSettingParam.readAttr(MessageID.MSG_MEAS_HIGH_THRE, measureSettingParam.getThresholdHighAttr());
            }
        }, 500L);
    }

    @Bindable
    public final long getThresholdMiddle() {
        return this.thresholdMiddle;
    }

    public final void setThresholdMiddle(long j) {
        log("thresholdMiddle", Long.valueOf(this.thresholdMiddle), Long.valueOf(j));
        this.thresholdMiddle = j;
        notifyPropertyChanged(919);
        if (this.thresholdType != ServiceEnum.ThreType.TH_TYPE_PER) {
            syncData(MessageID.MSG_MEAS_HIGH_THRE, Long.valueOf(j));
            syncData(MessageID.MSG_MEAS_MID_THRE, Long.valueOf(j));
            syncData(MessageID.MSG_MEAS_LOW_THRE, Long.valueOf(j));
        }
        ThreadUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.rigol.scope.data.MeasureSettingParam$thresholdMiddle$1
            @Override // java.lang.Runnable
            public final void run() {
                MeasureSettingParam measureSettingParam = MeasureSettingParam.this;
                measureSettingParam.readAttr(MessageID.MSG_MEAS_MID_THRE, measureSettingParam.getThresholdMiddleAttr());
            }
        }, 500L);
    }

    @Bindable
    public final long getThresholdLow() {
        return this.thresholdLow;
    }

    public final void setThresholdLow(long j) {
        log("thresholdLow", Long.valueOf(this.thresholdLow), Long.valueOf(j));
        this.thresholdLow = j;
        notifyPropertyChanged(918);
        syncData(MessageID.MSG_MEAS_HIGH_THRE, Long.valueOf(j));
        syncData(MessageID.MSG_MEAS_MID_THRE, Long.valueOf(j));
        syncData(MessageID.MSG_MEAS_LOW_THRE, Long.valueOf(j));
        ThreadUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.rigol.scope.data.MeasureSettingParam$thresholdLow$1
            @Override // java.lang.Runnable
            public final void run() {
                MeasureSettingParam measureSettingParam = MeasureSettingParam.this;
                measureSettingParam.readAttr(MessageID.MSG_MEAS_LOW_THRE, measureSettingParam.getThresholdLowAttr());
            }
        }, 500L);
    }

    public final MessageAttr getThresholdHighAttr() {
        return this.thresholdHighAttr;
    }

    public final void setThresholdHighAttr(MessageAttr messageAttr) {
        Intrinsics.checkNotNullParameter(messageAttr, "<set-?>");
        this.thresholdHighAttr = messageAttr;
    }

    public final MessageAttr getThresholdMiddleAttr() {
        return this.thresholdMiddleAttr;
    }

    public final void setThresholdMiddleAttr(MessageAttr messageAttr) {
        Intrinsics.checkNotNullParameter(messageAttr, "<set-?>");
        this.thresholdMiddleAttr = messageAttr;
    }

    public final MessageAttr getThresholdLowAttr() {
        return this.thresholdLowAttr;
    }

    public final void setThresholdLowAttr(MessageAttr messageAttr) {
        Intrinsics.checkNotNullParameter(messageAttr, "<set-?>");
        this.thresholdLowAttr = messageAttr;
    }

    @Bindable
    public final boolean getMethodState() {
        return this.methodState;
    }

    public final void setMethodState(boolean z) {
        this.methodState = z;
        notifyPropertyChanged(530);
    }

    @Bindable
    public final int getTopMethod() {
        return this.topMethod;
    }

    public final void setTopMethod(int i) {
        this.topMethod = i;
        notifyPropertyChanged(930);
    }

    @Bindable
    public final int getBaseMethod() {
        return this.baseMethod;
    }

    public final void setBaseMethod(int i) {
        this.baseMethod = i;
        notifyPropertyChanged(69);
    }

    @Bindable
    public final int getRegion() {
        return this.region;
    }

    public final void setRegion(int i) {
        this.region = i;
        notifyPropertyChanged(727);
    }

    @Bindable
    public final boolean getHistoEnable() {
        return this.histoEnable;
    }

    public final void setHistoEnable(boolean z) {
        this.histoEnable = z;
        notifyPropertyChanged(369);
    }

    @Bindable
    public final String getWindowTitleString() {
        return this.windowTitleString;
    }

    public final void setWindowTitleString(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.windowTitleString = value;
        notifyPropertyChanged(1066);
    }

    @Bindable
    public final long getCursorA() {
        return this.cursorA;
    }

    public final void setCursorA(long j) {
        this.cursorA = j;
        notifyPropertyChanged(195);
        ThreadUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.rigol.scope.data.MeasureSettingParam$cursorA$1
            @Override // java.lang.Runnable
            public final void run() {
                MeasureSettingParam measureSettingParam = MeasureSettingParam.this;
                measureSettingParam.readAttr(MessageID.MSG_APP_MEAS_RANGE_CURSOR_AX, measureSettingParam.getCursorAAttr());
            }
        }, 500L);
    }

    @Bindable
    public final long getCursorB() {
        return this.cursorB;
    }

    public final void setCursorB(long j) {
        this.cursorB = j;
        notifyPropertyChanged(197);
        ThreadUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.rigol.scope.data.MeasureSettingParam$cursorB$1
            @Override // java.lang.Runnable
            public final void run() {
                MeasureSettingParam measureSettingParam = MeasureSettingParam.this;
                measureSettingParam.readAttr(MessageID.MSG_APP_MEAS_RANGE_CURSOR_BX, measureSettingParam.getCursorBAttr());
            }
        }, 500L);
    }

    @Bindable
    public final long getCursorBothAB() {
        return this.cursorBothAB;
    }

    public final void setCursorBothAB(long j) {
        this.cursorBothAB = j;
        notifyPropertyChanged(198);
    }

    @Bindable
    public final int getRegionSelect() {
        return this.regionSelect;
    }

    public final void setRegionSelect(int i) {
        log("regionselect", Integer.valueOf(this.regionSelect), Integer.valueOf(i));
        this.regionSelect = i;
        notifyPropertyChanged(728);
    }

    public final MessageAttr getCursorAAttr() {
        return this.cursorAAttr;
    }

    public final void setCursorAAttr(MessageAttr messageAttr) {
        Intrinsics.checkNotNullParameter(messageAttr, "<set-?>");
        this.cursorAAttr = messageAttr;
    }

    public final MessageAttr getCursorBAttr() {
        return this.cursorBAttr;
    }

    public final void setCursorBAttr(MessageAttr messageAttr) {
        Intrinsics.checkNotNullParameter(messageAttr, "<set-?>");
        this.cursorBAttr = messageAttr;
    }

    @Override // com.rigol.scope.data.BaseParam
    public void readAll() {
        super.readAll();
        readMeasureAllSrc();
        readMode();
        readCursorIndicator();
        readCursorThreshold();
        readStatisticState();
        readStatCount();
        readAttr(MessageID.MSG_APP_MEAS_STAT_COUNT, this.statCountAttr);
        readThresholdType();
        readThresholdSource();
        readThresholdHigh();
        readThresholdMiddle();
        readThresholdLow();
        readAttr(MessageID.MSG_MEAS_HIGH_THRE, this.thresholdHighAttr);
        readAttr(MessageID.MSG_MEAS_MID_THRE, this.thresholdMiddleAttr);
        readAttr(MessageID.MSG_MEAS_LOW_THRE, this.thresholdLowAttr);
        readMethodState();
        readTopMethod();
        readBaseMethod();
        readRegion();
        readCursorA();
        readCursorB();
        readCursorBothAB();
        readAttr(MessageID.MSG_APP_MEAS_RANGE_CURSOR_AX, this.cursorAAttr);
        readAttr(MessageID.MSG_APP_MEAS_RANGE_CURSOR_BX, this.cursorBAttr);
        readSelectSourceA();
        readSelectSourceB();
        readHistoEnable();
        readMeasHistoWindowTitle();
        if (ServiceEnum.ThreType.TH_TYPE_PER == this.thresholdType) {
            saveThresholdType(ServiceEnum.ThreType.TH_TYPE_ABS);
            API.getInstance().UI_PostInt32(28, MessageID.MSG_APP_MEAS_TH_DEFAULT, 1);
            saveThresholdType(ServiceEnum.ThreType.TH_TYPE_PER);
        }
    }

    public final int readPosition() {
        return readInt(MessageID.MSG_APP_MEAS_CAT);
    }

    public final ServiceEnum.Chan readMeasureAllSrc() {
        ServiceEnum.Chan chanFromValue1 = ServiceEnum.getChanFromValue1(readInt(MessageID.MSG_APP_MEAS_ALL_SRC));
        Intrinsics.checkNotNullExpressionValue(chanFromValue1, "ServiceEnum.getChanFromV…ID.MSG_APP_MEAS_ALL_SRC))");
        setMeasureAllSrc(chanFromValue1);
        return this.measureAllSrc;
    }

    public final int readMode() {
        setMode(readInt(MessageID.MSG_APP_MEAS_RANGE_MODE));
        return this.mode;
    }

    public final boolean readCursorIndicator() {
        setCursorIndicator(readBool(MessageID.MSG_APP_MEAS_INDICATOR));
        return this.cursorIndicator;
    }

    public final boolean readCursorThreshold() {
        setCursorThreshold(readBool(MessageID.MSG_APP_MEAS_THRESHOLD));
        return this.cursorThreshold;
    }

    public final boolean readStatisticState() {
        setStatisticState(readBool(MessageID.MSG_APP_MEAS_STAT_ENABLE));
        return this.statisticState;
    }

    public final int readStatCount() {
        setStatCount(readInt(MessageID.MSG_APP_MEAS_STAT_COUNT));
        return this.statCount;
    }

    public final ServiceEnum.ThreType readThresholdType() {
        if (ServiceEnum.getThreTypeFromValue1(readInt(MessageID.MSG_APP_MEAS_TH_HIGH_TYPE)) == null) {
            Timber.v("MeasureSettingParam: %s", " readThresholdType  read null");
            return this.thresholdType;
        }
        ServiceEnum.ThreType threTypeFromValue1 = ServiceEnum.getThreTypeFromValue1(readInt(MessageID.MSG_APP_MEAS_TH_HIGH_TYPE));
        Intrinsics.checkNotNullExpressionValue(threTypeFromValue1, "ServiceEnum.getThreTypeF…G_APP_MEAS_TH_HIGH_TYPE))");
        setThresholdType(threTypeFromValue1);
        return this.thresholdType;
    }

    public final ServiceEnum.Chan readThresholdSource() {
        ServiceEnum.Chan chanFromValue1 = ServiceEnum.getChanFromValue1(readInt(MessageID.MSG_APP_MEAS_TH_SRC));
        Intrinsics.checkNotNullExpressionValue(chanFromValue1, "ServiceEnum.getChanFromV…eID.MSG_APP_MEAS_TH_SRC))");
        setThresholdSource(chanFromValue1);
        return this.thresholdSource;
    }

    public final long readThresholdHigh() {
        setThresholdHigh(readLong(MessageID.MSG_MEAS_HIGH_THRE));
        return this.thresholdHigh;
    }

    public final long readThresholdMiddle() {
        setThresholdMiddle(readLong(MessageID.MSG_MEAS_MID_THRE));
        return this.thresholdMiddle;
    }

    public final long readThresholdLow() {
        setThresholdLow(readLong(MessageID.MSG_MEAS_LOW_THRE));
        return this.thresholdLow;
    }

    public final boolean readMethodState() {
        setMethodState(readBool(MessageID.MSG_APP_MEAS_SET_STATE_METHOD));
        return this.methodState;
    }

    public final int readTopMethod() {
        setTopMethod(readInt(MessageID.MSG_APP_MEAS_SET_TOP_METHOD));
        return this.topMethod;
    }

    public final int readBaseMethod() {
        setBaseMethod(readInt(MessageID.MSG_APP_MEAS_SET_BASE_METHOD));
        return this.baseMethod;
    }

    public final int readRegion() {
        setRegion(readInt(MessageID.MSG_APP_MEAS_REGION));
        return this.region;
    }

    public final long readCursorA() {
        setCursorA(readLong(MessageID.MSG_APP_MEAS_RANGE_CURSOR_AX));
        return this.cursorA;
    }

    public final long readCursorB() {
        setCursorB(readLong(MessageID.MSG_APP_MEAS_RANGE_CURSOR_BX));
        return this.cursorB;
    }

    public final long readCursorBothAB() {
        setCursorBothAB(readLong(MessageID.MSG_APP_MEAS_RANGE_CURSOR_ABX));
        return this.cursorBothAB;
    }

    public final ServiceEnum.Chan readSelectSourceA() {
        ServiceEnum.Chan chanFromValue1 = ServiceEnum.getChanFromValue1(readInt(MessageID.MSG_APP_MEAS_SRCA));
        Intrinsics.checkNotNullExpressionValue(chanFromValue1, "ServiceEnum.getChanFromV…ageID.MSG_APP_MEAS_SRCA))");
        setSelectSourceA(chanFromValue1);
        return this.selectSourceA;
    }

    public final ServiceEnum.Chan readSelectSourceB() {
        ServiceEnum.Chan chanFromValue1 = ServiceEnum.getChanFromValue1(readInt(MessageID.MSG_APP_MEAS_SRCB));
        Intrinsics.checkNotNullExpressionValue(chanFromValue1, "ServiceEnum.getChanFromV…ageID.MSG_APP_MEAS_SRCB))");
        setSelectSourceB(chanFromValue1);
        return this.selectSourceB;
    }

    public final boolean readHistoEnable() {
        setHistoEnable(readBool(MessageID.MSG_APP_MEAS_HISTO_ENABLE));
        return this.histoEnable;
    }

    public final String readMeasHistoWindowTitle() {
        setWindowTitleString(readStr(MessageID.MSG_APP_MEAS_HISTO_WINDOW_TITLE));
        syncData(MessageID.MSG_APP_MEAS_HISTO_WINDOW_TITLE, this.windowTitleString);
        return this.windowTitleString;
    }

    public final void saveHistoEnable(boolean z) {
        setHistoEnable(z);
        saveBool(MessageID.MSG_APP_MEAS_HISTO_ENABLE, this.histoEnable);
        syncData(MessageID.MSG_APP_MEAS_HISTO_ENABLE, Boolean.valueOf(this.histoEnable));
    }

    public final void saveMeasHistoWindowTitle(String windowTitle) {
        Intrinsics.checkNotNullParameter(windowTitle, "windowTitle");
        setWindowTitleString(windowTitle);
        saveStr(MessageID.MSG_APP_MEAS_HISTO_WINDOW_TITLE, this.windowTitleString);
    }

    public final void saveSelectSourceA(ServiceEnum.Chan src) {
        Intrinsics.checkNotNullParameter(src, "src");
        setSelectSourceA(src);
        saveInt(MessageID.MSG_APP_MEAS_SRCA, src.value1);
    }

    public final void saveSelectSourceB(ServiceEnum.Chan src) {
        Intrinsics.checkNotNullParameter(src, "src");
        setSelectSourceB(src);
        saveInt(MessageID.MSG_APP_MEAS_SRCB, src.value1);
    }

    public final void saveMeasureAllSrc(ServiceEnum.Chan src) {
        Intrinsics.checkNotNullParameter(src, "src");
        setMeasureAllSrc(src);
        saveInt(MessageID.MSG_APP_MEAS_ALL_SRC, src.value1);
    }

    public final void saveUpaQueryPowerData() {
        saveInt(MessageID.MSG_APP_UPA_QUERY_POWER_DATA, 0);
    }

    public final void saveMode(int i) {
        setMode(i);
        saveInt(MessageID.MSG_APP_MEAS_RANGE_MODE, i);
    }

    public final void saveCursorIndicator(boolean z) {
        setCursorIndicator(z);
        saveBool(MessageID.MSG_APP_MEAS_INDICATOR, z);
    }

    public final void saveCursorThreshold(boolean z) {
        setCursorThreshold(z);
        saveBool(MessageID.MSG_APP_MEAS_THRESHOLD, z);
    }

    public final void saveStatisticState(boolean z) {
        setStatisticState(z);
        saveBool(MessageID.MSG_APP_MEAS_STAT_ENABLE, z);
    }

    public final void saveStatCount(int i) {
        setStatCount(i);
        saveInt(MessageID.MSG_APP_MEAS_STAT_COUNT, i);
    }

    public final void saveThresholdType(ServiceEnum.ThreType thresholdType) {
        Intrinsics.checkNotNullParameter(thresholdType, "thresholdType");
        setThresholdType(thresholdType);
        saveInt(MessageID.MSG_APP_MEAS_TH_HIGH_TYPE, thresholdType.value1);
    }

    public final void saveThresholdSource(ServiceEnum.Chan thresholdSource) {
        Intrinsics.checkNotNullParameter(thresholdSource, "thresholdSource");
        setThresholdSource(thresholdSource);
        saveInt(MessageID.MSG_APP_MEAS_TH_SRC, thresholdSource.value1);
    }

    public final void saveThresholdHigh(long j) {
        setThresholdHigh(j);
        saveLong(MessageID.MSG_MEAS_HIGH_THRE, j);
    }

    public final void saveThresholdMiddle(long j) {
        setThresholdMiddle(j);
        saveLong(MessageID.MSG_MEAS_MID_THRE, j);
    }

    public final void saveThresholdLow(long j) {
        setThresholdLow(j);
        saveLong(MessageID.MSG_MEAS_LOW_THRE, j);
    }

    public final void saveMethodState(boolean z) {
        setMethodState(z);
        saveBool(MessageID.MSG_APP_MEAS_SET_STATE_METHOD, z);
    }

    public final void saveTopMethod(int i) {
        setTopMethod(i);
        saveInt(MessageID.MSG_APP_MEAS_SET_TOP_METHOD, i);
    }

    public final void saveBaseMethod(int i) {
        setBaseMethod(i);
        saveInt(MessageID.MSG_APP_MEAS_SET_BASE_METHOD, i);
    }

    public final void saveRegion(int i) {
        setRegion(i);
        saveInt(MessageID.MSG_APP_MEAS_REGION, i);
    }

    public final void saveCursorA(long j) {
        setCursorA(j);
        saveLong(MessageID.MSG_APP_MEAS_RANGE_CURSOR_AX, j);
    }

    public final void saveCursorB(long j) {
        setCursorB(j);
        saveLong(MessageID.MSG_APP_MEAS_RANGE_CURSOR_BX, j);
    }

    public final void saveCursorAB(long j) {
        setCursorBothAB(j);
        saveLong(MessageID.MSG_APP_MEAS_RANGE_CURSOR_ABX, j);
    }

    public final int readMeaType() {
        return readInt(MessageID.MSG_APP_MEAS_STAT_ITEM);
    }

    @Override // com.rigol.scope.data.BaseParam
    public void reset() {
        ServiceEnum.Chan chan;
        ServiceEnum.Chan chan2;
        ServiceEnum.ThreType threType;
        ServiceEnum.Chan chan3;
        super.reset();
        chan = MeasureSettingParamKt.DEFAULT_SELECT_SOURCE_A;
        setSelectSourceA(chan);
        chan2 = MeasureSettingParamKt.DEFAULT_SELECT_SOURCE_B;
        setSelectSourceB(chan2);
        setShowSelectSourceB(false);
        setShowThresLine(false);
        setMode(0);
        setCursorIndicator(false);
        setStatCount(1000);
        threType = MeasureSettingParamKt.DEFAULT_THRESHOLDTYPE;
        setThresholdType(threType);
        chan3 = MeasureSettingParamKt.DEFAULT_THRESHOLDSOURCE;
        setThresholdSource(chan3);
        setThresholdHigh(90L);
        setThresholdMiddle(50L);
        setThresholdLow(10L);
        setMethodState(false);
        setTopMethod(0);
        setBaseMethod(0);
        setRegion(0);
        setCursorA(200L);
        setCursorB(800L);
        setCursorBothAB(0L);
        setHistoEnable(false);
    }
}
