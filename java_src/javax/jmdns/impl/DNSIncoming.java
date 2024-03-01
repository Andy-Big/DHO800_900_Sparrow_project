package javax.jmdns.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;
import javax.jmdns.impl.DNSRecord;
import javax.jmdns.impl.constants.DNSConstants;
import javax.jmdns.impl.constants.DNSLabel;
import javax.jmdns.impl.constants.DNSOptionCode;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;
import javax.jmdns.impl.constants.DNSResultCode;
import kotlin.UByte;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* loaded from: classes2.dex */
public final class DNSIncoming extends DNSMessage {
    private final MessageInputStream _messageInputStream;
    private final DatagramPacket _packet;
    private final long _receivedTime;
    private int _senderUDPPayload;
    private static Logger logger = LoggerFactory.getLogger(DNSIncoming.class.getName());
    public static boolean USE_DOMAIN_NAME_FORMAT_FOR_SRV_TARGET = true;
    private static final char[] _nibbleToHex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* loaded from: classes2.dex */
    public static class MessageInputStream extends ByteArrayInputStream {
        private static Logger logger1 = LoggerFactory.getLogger(MessageInputStream.class.getName());
        final Map<Integer, String> _names;

        public MessageInputStream(byte[] bArr, int i) {
            this(bArr, 0, i);
        }

        public MessageInputStream(byte[] bArr, int i, int i2) {
            super(bArr, i, i2);
            this._names = new HashMap();
        }

        public int readByte() {
            return read();
        }

        public int readUnsignedByte() {
            return read() & 255;
        }

        public int readUnsignedShort() {
            return (readUnsignedByte() << 8) | readUnsignedByte();
        }

        public int readInt() {
            return (readUnsignedShort() << 16) | readUnsignedShort();
        }

        public byte[] readBytes(int i) {
            byte[] bArr = new byte[i];
            read(bArr, 0, i);
            return bArr;
        }

        public String readUTF(int i) {
            int i2;
            int readUnsignedByte;
            StringBuilder sb = new StringBuilder(i);
            int i3 = 0;
            while (i3 < i) {
                int readUnsignedByte2 = readUnsignedByte();
                switch (readUnsignedByte2 >> 4) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        sb.append((char) readUnsignedByte2);
                        i3++;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    default:
                        i2 = (readUnsignedByte2 & 63) << 4;
                        readUnsignedByte = readUnsignedByte() & 15;
                        readUnsignedByte2 = i2 | readUnsignedByte;
                        break;
                    case 12:
                    case 13:
                        i2 = (readUnsignedByte2 & 31) << 6;
                        readUnsignedByte = readUnsignedByte() & 63;
                        readUnsignedByte2 = i2 | readUnsignedByte;
                        break;
                    case 14:
                        readUnsignedByte2 = ((readUnsignedByte2 & 15) << 12) | ((readUnsignedByte() & 63) << 6) | (readUnsignedByte() & 63);
                        i3++;
                        break;
                }
                i3++;
                sb.append((char) readUnsignedByte2);
                i3++;
            }
            return sb.toString();
        }

        protected synchronized int peek() {
            return this.pos < this.count ? this.buf[this.pos] & UByte.MAX_VALUE : -1;
        }

        public String readName() {
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            while (!z) {
                int readUnsignedByte = readUnsignedByte();
                if (readUnsignedByte == 0) {
                    break;
                }
                int i = AnonymousClass1.$SwitchMap$javax$jmdns$impl$constants$DNSLabel[DNSLabel.labelForByte(readUnsignedByte).ordinal()];
                if (i == 1) {
                    int i2 = this.pos - 1;
                    String str = readUTF(readUnsignedByte) + ".";
                    sb.append(str);
                    for (StringBuilder sb2 : hashMap.values()) {
                        sb2.append(str);
                    }
                    hashMap.put(Integer.valueOf(i2), new StringBuilder(str));
                } else if (i == 2) {
                    int labelValue = (DNSLabel.labelValue(readUnsignedByte) << 8) | readUnsignedByte();
                    String str2 = this._names.get(Integer.valueOf(labelValue));
                    if (str2 == null) {
                        logger1.warn("Bad domain name: possible circular name detected. Bad offset: 0x{} at 0x{}", Integer.toHexString(labelValue), Integer.toHexString(this.pos - 2));
                        str2 = "";
                    }
                    sb.append(str2);
                    for (StringBuilder sb3 : hashMap.values()) {
                        sb3.append(str2);
                    }
                    z = true;
                } else if (i == 3) {
                    logger1.debug("Extended label are not currently supported.");
                } else {
                    logger1.warn("Unsupported DNS label type: '{}'", Integer.toHexString(readUnsignedByte & 192));
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                this._names.put((Integer) entry.getKey(), ((StringBuilder) entry.getValue()).toString());
            }
            return sb.toString();
        }

        public String readNonNameString() {
            return readUTF(readUnsignedByte());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DNSIncoming(DatagramPacket datagramPacket) throws IOException {
        super(0, 0, datagramPacket.getPort() == DNSConstants.MDNS_PORT);
        this._packet = datagramPacket;
        InetAddress address = datagramPacket.getAddress();
        this._messageInputStream = new MessageInputStream(datagramPacket.getData(), datagramPacket.getLength());
        this._receivedTime = System.currentTimeMillis();
        this._senderUDPPayload = DNSConstants.MAX_MSG_TYPICAL;
        try {
            try {
                setId(this._messageInputStream.readUnsignedShort());
                setFlags(this._messageInputStream.readUnsignedShort());
                if (getOperationCode() > 0) {
                    throw new IOException("Received a message with a non standard operation code. Currently unsupported in the specification.");
                }
                int readUnsignedShort = this._messageInputStream.readUnsignedShort();
                int readUnsignedShort2 = this._messageInputStream.readUnsignedShort();
                int readUnsignedShort3 = this._messageInputStream.readUnsignedShort();
                int readUnsignedShort4 = this._messageInputStream.readUnsignedShort();
                logger.debug("DNSIncoming() questions:{} answers:{} authorities:{} additionals:{}", Integer.valueOf(readUnsignedShort), Integer.valueOf(readUnsignedShort2), Integer.valueOf(readUnsignedShort3), Integer.valueOf(readUnsignedShort4));
                if ((readUnsignedShort * 5) + ((readUnsignedShort2 + readUnsignedShort3 + readUnsignedShort4) * 11) > datagramPacket.getLength()) {
                    throw new IOException("questions:" + readUnsignedShort + " answers:" + readUnsignedShort2 + " authorities:" + readUnsignedShort3 + " additionals:" + readUnsignedShort4);
                }
                if (readUnsignedShort > 0) {
                    for (int i = 0; i < readUnsignedShort; i++) {
                        this._questions.add(readQuestion());
                    }
                }
                if (readUnsignedShort2 > 0) {
                    for (int i2 = 0; i2 < readUnsignedShort2; i2++) {
                        DNSRecord readAnswer = readAnswer(address);
                        if (readAnswer != null) {
                            this._answers.add(readAnswer);
                        }
                    }
                }
                if (readUnsignedShort3 > 0) {
                    for (int i3 = 0; i3 < readUnsignedShort3; i3++) {
                        DNSRecord readAnswer2 = readAnswer(address);
                        if (readAnswer2 != null) {
                            this._authoritativeAnswers.add(readAnswer2);
                        }
                    }
                }
                if (readUnsignedShort4 > 0) {
                    for (int i4 = 0; i4 < readUnsignedShort4; i4++) {
                        DNSRecord readAnswer3 = readAnswer(address);
                        if (readAnswer3 != null) {
                            this._additionals.add(readAnswer3);
                        }
                    }
                }
                if (this._messageInputStream.available() > 0) {
                    throw new IOException("Received a message with the wrong length.");
                }
                try {
                    this._messageInputStream.close();
                } catch (Exception unused) {
                    logger.warn("MessageInputStream close error");
                }
            } catch (Exception e) {
                logger.warn("DNSIncoming() dump " + print(true) + "\n exception ", (Throwable) e);
                IOException iOException = new IOException("DNSIncoming corrupted message");
                iOException.initCause(e);
                throw iOException;
            }
        } catch (Throwable th) {
            try {
                this._messageInputStream.close();
            } catch (Exception unused2) {
                logger.warn("MessageInputStream close error");
            }
            throw th;
        }
    }

    private DNSIncoming(int i, int i2, boolean z, DatagramPacket datagramPacket, long j) {
        super(i, i2, z);
        this._packet = datagramPacket;
        this._messageInputStream = new MessageInputStream(datagramPacket.getData(), datagramPacket.getLength());
        this._receivedTime = j;
    }

    public DNSIncoming clone() {
        DNSIncoming dNSIncoming = new DNSIncoming(getFlags(), getId(), isMulticast(), this._packet, this._receivedTime);
        dNSIncoming._senderUDPPayload = this._senderUDPPayload;
        dNSIncoming._questions.addAll(this._questions);
        dNSIncoming._answers.addAll(this._answers);
        dNSIncoming._authoritativeAnswers.addAll(this._authoritativeAnswers);
        dNSIncoming._additionals.addAll(this._additionals);
        return dNSIncoming;
    }

    private DNSQuestion readQuestion() {
        String readName = this._messageInputStream.readName();
        DNSRecordType typeForIndex = DNSRecordType.typeForIndex(this._messageInputStream.readUnsignedShort());
        if (typeForIndex == DNSRecordType.TYPE_IGNORE) {
            logger.warn("Could not find record type: {}", print(true));
        }
        int readUnsignedShort = this._messageInputStream.readUnsignedShort();
        DNSRecordClass classForIndex = DNSRecordClass.classForIndex(readUnsignedShort);
        return DNSQuestion.newQuestion(readName, typeForIndex, classForIndex, classForIndex.isUnique(readUnsignedShort));
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x008f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private DNSRecord readAnswer(InetAddress inetAddress) {
        DNSRecord iPv4Address;
        String readNonNameString;
        byte b;
        byte b2;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        String readName = this._messageInputStream.readName();
        DNSRecordType typeForIndex = DNSRecordType.typeForIndex(this._messageInputStream.readUnsignedShort());
        if (typeForIndex == DNSRecordType.TYPE_IGNORE) {
            logger.warn("Could not find record type. domain: {}\n{}", readName, print(true));
        }
        int readUnsignedShort = this._messageInputStream.readUnsignedShort();
        DNSRecordClass classForIndex = typeForIndex == DNSRecordType.TYPE_OPT ? DNSRecordClass.CLASS_UNKNOWN : DNSRecordClass.classForIndex(readUnsignedShort);
        if (classForIndex == DNSRecordClass.CLASS_UNKNOWN && typeForIndex != DNSRecordType.TYPE_OPT) {
            logger.warn("Could not find record class. domain: {} type: {}\n{}", readName, typeForIndex, print(true));
        }
        boolean isUnique = classForIndex.isUnique(readUnsignedShort);
        int readInt = this._messageInputStream.readInt();
        int readUnsignedShort2 = this._messageInputStream.readUnsignedShort();
        switch (AnonymousClass1.$SwitchMap$javax$jmdns$impl$constants$DNSRecordType[typeForIndex.ordinal()]) {
            case 1:
                iPv4Address = new DNSRecord.IPv4Address(readName, classForIndex, isUnique, readInt, this._messageInputStream.readBytes(readUnsignedShort2));
                break;
            case 2:
                byte[] readBytes = this._messageInputStream.readBytes(readUnsignedShort2);
                if (isIPv4MappedIPv6Address(readBytes)) {
                    logger.warn("AAAA record with IPv4-mapped address for {}", readName);
                    iPv4Address = null;
                    break;
                } else {
                    iPv4Address = new DNSRecord.IPv6Address(readName, classForIndex, isUnique, readInt, readBytes);
                    break;
                }
            case 3:
            case 4:
                String readName2 = this._messageInputStream.readName();
                if (readName2.length() > 0) {
                    iPv4Address = new DNSRecord.Pointer(readName, classForIndex, isUnique, readInt, readName2);
                    break;
                } else {
                    logger.warn("PTR record of class: {}, there was a problem reading the service name of the answer for domain: {}", classForIndex, readName);
                    iPv4Address = null;
                    break;
                }
            case 5:
                iPv4Address = new DNSRecord.Text(readName, classForIndex, isUnique, readInt, this._messageInputStream.readBytes(readUnsignedShort2));
                break;
            case 6:
                int readUnsignedShort3 = this._messageInputStream.readUnsignedShort();
                int readUnsignedShort4 = this._messageInputStream.readUnsignedShort();
                int readUnsignedShort5 = this._messageInputStream.readUnsignedShort();
                if (USE_DOMAIN_NAME_FORMAT_FOR_SRV_TARGET) {
                    readNonNameString = this._messageInputStream.readName();
                } else {
                    readNonNameString = this._messageInputStream.readNonNameString();
                }
                iPv4Address = new DNSRecord.Service(readName, classForIndex, isUnique, readInt, readUnsignedShort3, readUnsignedShort4, readUnsignedShort5, readNonNameString);
                break;
            case 7:
                StringBuilder sb = new StringBuilder();
                sb.append(this._messageInputStream.readUTF(readUnsignedShort2));
                int indexOf = sb.indexOf(" ");
                iPv4Address = new DNSRecord.HostInformation(readName, classForIndex, isUnique, readInt, (indexOf > 0 ? sb.substring(0, indexOf) : sb.toString()).trim(), (indexOf > 0 ? sb.substring(indexOf + 1) : "").trim());
                break;
            case 8:
                DNSResultCode resultCodeForFlags = DNSResultCode.resultCodeForFlags(getFlags(), readInt);
                int i = (16711680 & readInt) >> 16;
                if (i == 0) {
                    this._senderUDPPayload = readUnsignedShort;
                    while (true) {
                        if (this._messageInputStream.available() > 0) {
                            if (this._messageInputStream.available() >= 2) {
                                int readUnsignedShort6 = this._messageInputStream.readUnsignedShort();
                                DNSOptionCode resultCodeForFlags2 = DNSOptionCode.resultCodeForFlags(readUnsignedShort6);
                                if (this._messageInputStream.available() >= 2) {
                                    int readUnsignedShort7 = this._messageInputStream.readUnsignedShort();
                                    byte[] bArr4 = new byte[0];
                                    if (this._messageInputStream.available() >= readUnsignedShort7) {
                                        bArr4 = this._messageInputStream.readBytes(readUnsignedShort7);
                                    }
                                    int i2 = AnonymousClass1.$SwitchMap$javax$jmdns$impl$constants$DNSOptionCode[resultCodeForFlags2.ordinal()];
                                    if (i2 == 1) {
                                        try {
                                            b = bArr4[0];
                                            try {
                                                b2 = bArr4[1];
                                            } catch (Exception unused) {
                                                b2 = 0;
                                            }
                                            try {
                                                bArr3 = new byte[]{bArr4[2], bArr4[3], bArr4[4], bArr4[5], bArr4[6], bArr4[7]};
                                                try {
                                                    bArr2 = bArr4.length > 8 ? new byte[]{bArr4[8], bArr4[9], bArr4[10], bArr4[11], bArr4[12], bArr4[13]} : bArr3;
                                                    try {
                                                        bArr = bArr4.length == 18 ? new byte[]{bArr4[14], bArr4[15], bArr4[16], bArr4[17]} : null;
                                                    } catch (Exception unused2) {
                                                        bArr = null;
                                                        logger.warn("Malformed OPT answer. Option code: Owner data: {}", _hexString(bArr4));
                                                        if (!logger.isDebugEnabled()) {
                                                        }
                                                    }
                                                } catch (Exception unused3) {
                                                    bArr2 = bArr3;
                                                }
                                                try {
                                                    if (bArr4.length == 22) {
                                                        bArr = new byte[]{bArr4[14], bArr4[15], bArr4[16], bArr4[17], bArr4[18], bArr4[19], bArr4[20], bArr4[21]};
                                                    }
                                                } catch (Exception unused4) {
                                                    logger.warn("Malformed OPT answer. Option code: Owner data: {}", _hexString(bArr4));
                                                    if (!logger.isDebugEnabled()) {
                                                    }
                                                }
                                            } catch (Exception unused5) {
                                                bArr = null;
                                                bArr2 = null;
                                                bArr3 = null;
                                                logger.warn("Malformed OPT answer. Option code: Owner data: {}", _hexString(bArr4));
                                                if (!logger.isDebugEnabled()) {
                                                }
                                            }
                                        } catch (Exception unused6) {
                                            b = 0;
                                            b2 = 0;
                                        }
                                        if (!logger.isDebugEnabled()) {
                                            Logger logger2 = logger;
                                            Object[] objArr = new Object[7];
                                            objArr[0] = Integer.valueOf(b);
                                            objArr[1] = Integer.valueOf(b2);
                                            objArr[2] = _hexString(bArr3);
                                            objArr[3] = bArr2 != bArr3 ? " wakeup MAC address: " : "";
                                            objArr[4] = bArr2 != bArr3 ? _hexString(bArr2) : "";
                                            objArr[5] = bArr != null ? " password: " : "";
                                            objArr[6] = bArr != null ? _hexString(bArr) : "";
                                            logger2.debug("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr);
                                        }
                                    } else if (i2 == 2 || i2 == 3 || i2 == 4) {
                                        if (logger.isDebugEnabled()) {
                                            logger.debug("There was an OPT answer. Option code: {} data: {}", resultCodeForFlags2, _hexString(bArr4));
                                        }
                                    } else if (i2 == 5) {
                                        if (readUnsignedShort6 >= 65001 && readUnsignedShort6 <= 65534) {
                                            logger.debug("There was an OPT answer using an experimental/local option code: {} data: {}", Integer.valueOf(readUnsignedShort6), _hexString(bArr4));
                                        } else {
                                            logger.warn("There was an OPT answer. Not currently handled. Option code: {} data: {}", Integer.valueOf(readUnsignedShort6), _hexString(bArr4));
                                        }
                                    }
                                } else {
                                    logger.warn("There was a problem reading the OPT record. Ignoring.");
                                }
                            } else {
                                logger.warn("There was a problem reading the OPT record. Ignoring.");
                            }
                        }
                    }
                } else {
                    logger.warn("There was an OPT answer. Wrong version number: {} result code: {}", Integer.valueOf(i), resultCodeForFlags);
                }
                iPv4Address = null;
                break;
            default:
                logger.debug("DNSIncoming() unknown type: {}", typeForIndex);
                this._messageInputStream.skip(readUnsignedShort2);
                iPv4Address = null;
                break;
        }
        if (iPv4Address != null) {
            iPv4Address.setRecordSource(inetAddress);
        }
        return iPv4Address;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: javax.jmdns.impl.DNSIncoming$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$javax$jmdns$impl$constants$DNSLabel;
        static final /* synthetic */ int[] $SwitchMap$javax$jmdns$impl$constants$DNSOptionCode;
        static final /* synthetic */ int[] $SwitchMap$javax$jmdns$impl$constants$DNSRecordType;

        static {
            int[] iArr = new int[DNSRecordType.values().length];
            $SwitchMap$javax$jmdns$impl$constants$DNSRecordType = iArr;
            try {
                iArr[DNSRecordType.TYPE_A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_AAAA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_CNAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_PTR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_TXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_SRV.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_HINFO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_OPT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[DNSOptionCode.values().length];
            $SwitchMap$javax$jmdns$impl$constants$DNSOptionCode = iArr2;
            try {
                iArr2[DNSOptionCode.Owner.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$javax$jmdns$impl$constants$DNSOptionCode[DNSOptionCode.LLQ.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$javax$jmdns$impl$constants$DNSOptionCode[DNSOptionCode.NSID.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$javax$jmdns$impl$constants$DNSOptionCode[DNSOptionCode.UL.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$javax$jmdns$impl$constants$DNSOptionCode[DNSOptionCode.Unknown.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr3 = new int[DNSLabel.values().length];
            $SwitchMap$javax$jmdns$impl$constants$DNSLabel = iArr3;
            try {
                iArr3[DNSLabel.Standard.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$javax$jmdns$impl$constants$DNSLabel[DNSLabel.Compressed.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$javax$jmdns$impl$constants$DNSLabel[DNSLabel.Extended.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$javax$jmdns$impl$constants$DNSLabel[DNSLabel.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private boolean isIPv4MappedIPv6Address(byte[] bArr) {
        return bArr[0] == 0 && bArr[1] == 0 && bArr[2] == 0 && bArr[3] == 0 && bArr[4] == 0 && bArr[5] == 0 && bArr[6] == 0 && bArr[7] == 0 && bArr[8] == 0 && bArr[9] == 0 && bArr[10] == -1 && bArr[11] == -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String print(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(print());
        if (z) {
            int length = this._packet.getLength();
            byte[] bArr = new byte[length];
            System.arraycopy(this._packet.getData(), 0, bArr, 0, length);
            sb.append(print(bArr));
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(isQuery() ? "dns[query," : "dns[response,");
        if (this._packet.getAddress() != null) {
            sb.append(this._packet.getAddress().getHostAddress());
        }
        sb.append(':');
        sb.append(this._packet.getPort());
        sb.append(", length=");
        sb.append(this._packet.getLength());
        sb.append(", id=0x");
        sb.append(Integer.toHexString(getId()));
        if (getFlags() != 0) {
            sb.append(", flags=0x");
            sb.append(Integer.toHexString(getFlags()));
            if ((getFlags() & 32768) != 0) {
                sb.append(":r");
            }
            if ((getFlags() & 1024) != 0) {
                sb.append(":aa");
            }
            if ((getFlags() & 512) != 0) {
                sb.append(":tc");
            }
        }
        if (getNumberOfQuestions() > 0) {
            sb.append(", questions=");
            sb.append(getNumberOfQuestions());
        }
        if (getNumberOfAnswers() > 0) {
            sb.append(", answers=");
            sb.append(getNumberOfAnswers());
        }
        if (getNumberOfAuthorities() > 0) {
            sb.append(", authorities=");
            sb.append(getNumberOfAuthorities());
        }
        if (getNumberOfAdditionals() > 0) {
            sb.append(", additionals=");
            sb.append(getNumberOfAdditionals());
        }
        if (getNumberOfQuestions() > 0) {
            sb.append("\nquestions:");
            for (DNSQuestion dNSQuestion : this._questions) {
                sb.append("\n\t");
                sb.append(dNSQuestion);
            }
        }
        if (getNumberOfAnswers() > 0) {
            sb.append("\nanswers:");
            for (DNSRecord dNSRecord : this._answers) {
                sb.append("\n\t");
                sb.append(dNSRecord);
            }
        }
        if (getNumberOfAuthorities() > 0) {
            sb.append("\nauthorities:");
            for (DNSRecord dNSRecord2 : this._authoritativeAnswers) {
                sb.append("\n\t");
                sb.append(dNSRecord2);
            }
        }
        if (getNumberOfAdditionals() > 0) {
            sb.append("\nadditionals:");
            for (DNSRecord dNSRecord3 : this._additionals) {
                sb.append("\n\t");
                sb.append(dNSRecord3);
            }
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void append(DNSIncoming dNSIncoming) {
        if (isQuery() && isTruncated() && dNSIncoming.isQuery()) {
            this._questions.addAll(dNSIncoming.getQuestions());
            this._answers.addAll(dNSIncoming.getAnswers());
            this._authoritativeAnswers.addAll(dNSIncoming.getAuthorities());
            this._additionals.addAll(dNSIncoming.getAdditionals());
            return;
        }
        throw new IllegalArgumentException();
    }

    public int elapseSinceArrival() {
        return (int) (System.currentTimeMillis() - this._receivedTime);
    }

    public int getSenderUDPPayload() {
        return this._senderUDPPayload;
    }

    private String _hexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & UByte.MAX_VALUE;
            sb.append(_nibbleToHex[i / 16]);
            sb.append(_nibbleToHex[i % 16]);
        }
        return sb.toString();
    }
}
