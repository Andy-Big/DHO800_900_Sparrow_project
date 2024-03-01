package com.rigol.scope.data;

import com.rigol.scope.cil.ServiceEnum;
import com.rigol.scope.utilities.UnitFormat;
import kotlin.Metadata;
/* compiled from: VerticalParam.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"DEFAULT_BANDWIDTH", "Lcom/rigol/scope/cil/ServiceEnum$Bandwidth;", "DEFAULT_CHANDELAY", "", "DEFAULT_COUPING", "Lcom/rigol/scope/cil/ServiceEnum$Coupling;", "DEFAULT_FINE", "", "DEFAULT_IMPEDANCE", "Lcom/rigol/scope/cil/ServiceEnum$Impedance;", "DEFAULT_INVERT", "DEFAULT_LABEL_SHOW", "DEFAULT_OFFSET", "DEFAULT_POSITION", "DEFAULT_PROBE_RATIO", "Lcom/rigol/scope/cil/ServiceEnum$ProbeX;", "DEFAULT_SCALE", "DEFAULT_STATUS", "Lcom/rigol/scope/cil/ServiceEnum$enChanStatus;", "DEFAULT_UNIT", "Lcom/rigol/scope/cil/ServiceEnum$Unit;", "app_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class VerticalParamKt {
    private static final long DEFAULT_CHANDELAY = 0;
    private static final boolean DEFAULT_FINE = false;
    private static final boolean DEFAULT_INVERT = false;
    private static final boolean DEFAULT_LABEL_SHOW = false;
    private static final long DEFAULT_OFFSET = 0;
    private static final long DEFAULT_POSITION = 0;
    private static final ServiceEnum.enChanStatus DEFAULT_STATUS = ServiceEnum.enChanStatus.CHAN_OFF;
    private static final ServiceEnum.Coupling DEFAULT_COUPING = ServiceEnum.Coupling.DC;
    private static final ServiceEnum.Bandwidth DEFAULT_BANDWIDTH = ServiceEnum.Bandwidth.BW_OFF;
    private static final ServiceEnum.ProbeX DEFAULT_PROBE_RATIO = ServiceEnum.ProbeX.Probe_1X;
    private static final ServiceEnum.Impedance DEFAULT_IMPEDANCE = ServiceEnum.Impedance.IMP_1M;
    private static final ServiceEnum.Unit DEFAULT_UNIT = ServiceEnum.Unit.Unit_V;
    private static final long DEFAULT_SCALE = (long) (50 / Math.pow(10.0d, UnitFormat.SI.NANO.scale));
}
