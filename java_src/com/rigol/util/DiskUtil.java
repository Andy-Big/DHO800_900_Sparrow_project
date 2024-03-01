package com.rigol.util;

import android.os.Build;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import com.blankj.utilcode.util.Utils;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DiskUtil.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004J\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/rigol/util/DiskUtil;", "", "()V", "getMountedDiskInfos", "", "Lcom/rigol/util/DiskInfo;", "hasRemovableDisk", "", "lib_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class DiskUtil {
    public static final DiskUtil INSTANCE = new DiskUtil();

    private DiskUtil() {
    }

    public final List<DiskInfo> getMountedDiskInfos() {
        ArrayList arrayList = new ArrayList();
        Object systemService = Utils.getApp().getSystemService("storage");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.os.storage.StorageManager");
        }
        StorageManager storageManager = (StorageManager) systemService;
        if (Build.VERSION.SDK_INT >= 24) {
            List<StorageVolume> storageVolumes = storageManager.getStorageVolumes();
            try {
                Method method = StorageVolume.class.getMethod("getPath", new Class[0]);
                Intrinsics.checkNotNullExpressionValue(method, "StorageVolume::class.java.getMethod(\"getPath\")");
                for (StorageVolume storageVolume : storageVolumes) {
                    Intrinsics.checkNotNullExpressionValue(storageVolume, "storageVolume");
                    boolean isRemovable = storageVolume.isRemovable();
                    String state = storageVolume.getState();
                    Object invoke = method.invoke(storageVolume, new Object[0]);
                    if (invoke == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    String str = (String) invoke;
                    if (Intrinsics.areEqual("mounted", state)) {
                        arrayList.add(new DiskInfo(str, state, isRemovable));
                    }
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } else {
            try {
                Class<?> cls = Class.forName("android.os.storage.StorageVolume");
                Intrinsics.checkNotNullExpressionValue(cls, "Class.forName(\"android.os.storage.StorageVolume\")");
                Method method2 = cls.getMethod("getPath", new Class[0]);
                Intrinsics.checkNotNullExpressionValue(method2, "storageVolumeClazz.getMethod(\"getPath\")");
                Method method3 = cls.getMethod("isRemovable", new Class[0]);
                Intrinsics.checkNotNullExpressionValue(method3, "storageVolumeClazz.getMethod(\"isRemovable\")");
                Method method4 = StorageManager.class.getMethod("getVolumeState", String.class);
                Intrinsics.checkNotNullExpressionValue(method4, "StorageManager::class.ja…ate\", String::class.java)");
                Method method5 = StorageManager.class.getMethod("getVolumeList", new Class[0]);
                Intrinsics.checkNotNullExpressionValue(method5, "StorageManager::class.ja…etMethod(\"getVolumeList\")");
                Object invoke2 = method5.invoke(storageManager, new Object[0]);
                if (invoke2 != null) {
                    int length = Array.getLength(invoke2);
                    for (int i = 0; i < length; i++) {
                        Object obj = Array.get(invoke2, i);
                        Object invoke3 = method2.invoke(obj, new Object[0]);
                        if (invoke3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        String str2 = (String) invoke3;
                        Object invoke4 = method3.invoke(obj, new Object[0]);
                        if (invoke4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                        }
                        boolean booleanValue = ((Boolean) invoke4).booleanValue();
                        Object invoke5 = method4.invoke(storageManager, str2);
                        if (invoke5 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        String str3 = (String) invoke5;
                        if (Intrinsics.areEqual("mounted", str3)) {
                            arrayList.add(new DiskInfo(str2, str3, booleanValue));
                        }
                    }
                }
            } catch (ClassNotFoundException e4) {
                e4.printStackTrace();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (NoSuchMethodException e6) {
                e6.printStackTrace();
            } catch (InvocationTargetException e7) {
                e7.printStackTrace();
            }
        }
        return arrayList;
    }

    public final boolean hasRemovableDisk() {
        try {
            for (DiskInfo diskInfo : getMountedDiskInfos()) {
                if (diskInfo != null && Intrinsics.areEqual("mounted", diskInfo.getState()) && diskInfo.isRemovable()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
