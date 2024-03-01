package com.rigol.scope.databinding;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.rigol.scope.R;
import com.rigol.scope.cil.ServiceEnum;
import com.rigol.scope.data.MappingObject;
import com.rigol.scope.data.StorageSaveParam;
import com.rigol.scope.utilities.ViewUtil;
import com.rigol.scope.views.SwitchButton;
/* loaded from: classes2.dex */
public class AdapterStorageSaveBindingImpl extends AdapterStorageSaveBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.guideline, 23);
        sViewsWithIds.put(R.id.choose, 24);
        sViewsWithIds.put(R.id.choose_dividing_line, 25);
        sViewsWithIds.put(R.id.storage_channel, 26);
        sViewsWithIds.put(R.id.file_dividing_line, 27);
        sViewsWithIds.put(R.id.prefix, 28);
        sViewsWithIds.put(R.id.auto_name, 29);
        sViewsWithIds.put(R.id.path_name, 30);
        sViewsWithIds.put(R.id.save, 31);
    }

    public AdapterStorageSaveBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 32, sIncludes, sViewsWithIds));
    }

    private AdapterStorageSaveBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 6, (TextView) objArr[29], (SwitchButton) objArr[21], (CheckBox) objArr[14], (CheckBox) objArr[15], (CheckBox) objArr[16], (CheckBox) objArr[17], (TextView) objArr[24], (View) objArr[25], (TextView) objArr[1], (View) objArr[27], (Guideline) objArr[23], (TextView) objArr[6], (SwitchButton) objArr[7], (TextView) objArr[2], (TextView) objArr[3], (TextView) objArr[8], (SwitchButton) objArr[9], (TextView) objArr[4], (SwitchButton) objArr[5], (TextView) objArr[30], (EditText) objArr[22], (TextView) objArr[28], (EditText) objArr[20], (Button) objArr[31], (TextView) objArr[18], (TextView) objArr[19], (TextView) objArr[26], (TextView) objArr[10], (TextView) objArr[11], (TextView) objArr[12], (TextView) objArr[13]);
        this.mDirtyFlags = -1L;
        this.autoNameSwitch.setTag(null);
        this.checkBoxCH1.setTag(null);
        this.checkBoxCH2.setTag(null);
        this.checkBoxCH3.setTag(null);
        this.checkBoxCH4.setTag(null);
        this.chooseSpinnerSave.setTag(null);
        this.imageColor.setTag(null);
        this.imageColorSwitch.setTag(null);
        this.imageFormat.setTag(null);
        this.imageFormatSpinner.setTag(null);
        this.imageHeader.setTag(null);
        this.imageHeaderSwitch.setTag(null);
        this.imageInvert.setTag(null);
        this.imageInvertSwitch.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        this.pathNameEditText.setTag(null);
        this.prefixEditText.setTag(null);
        this.setupFormat.setTag(null);
        this.setupFormatSpinner.setTag(null);
        this.waveDepth.setTag(null);
        this.waveDepthSpinner.setTag(null);
        this.waveFormat.setTag(null);
        this.waveFormatSpinner.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 67108864L;
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
            setParam((StorageSaveParam) obj);
            return true;
        }
        return false;
    }

    @Override // com.rigol.scope.databinding.AdapterStorageSaveBinding
    public void setParam(StorageSaveParam storageSaveParam) {
        updateRegistration(3, storageSaveParam);
        this.mParam = storageSaveParam;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(589);
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
                            return onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgStorageWaveFormatParamWaveFileType((MappingObject) obj, i2);
                        }
                        return onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgStorageSaveOptionParamChooseValue1((MappingObject) obj, i2);
                    }
                    return onChangeParam((StorageSaveParam) obj, i2);
                }
                return onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgStorageWaveDepthParamWaveDepth((MappingObject) obj, i2);
            }
            return onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgStorageImageFormatParamImageFileType((MappingObject) obj, i2);
        }
        return onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgStorageSetupFormatParamSetupFileType((MappingObject) obj, i2);
    }

    private boolean onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgStorageSetupFormatParamSetupFileType(MappingObject mappingObject, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 1;
            }
            return true;
        } else if (i == 904) {
            synchronized (this) {
                this.mDirtyFlags |= 64;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgStorageImageFormatParamImageFileType(MappingObject mappingObject, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 2;
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

    private boolean onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgStorageWaveDepthParamWaveDepth(MappingObject mappingObject, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 4;
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

    private boolean onChangeParam(StorageSaveParam storageSaveParam, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 8;
            }
            return true;
        } else if (i == 175) {
            synchronized (this) {
                this.mDirtyFlags |= 512;
            }
            return true;
        } else if (i == 423) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            }
            return true;
        } else if (i == 425) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
            }
            return true;
        } else if (i == 422) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            }
            return true;
        } else if (i == 424) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            }
            return true;
        } else if (i == 1023) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE;
            }
            return true;
        } else if (i == 1024) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
            }
            return true;
        } else if (i == 150) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
            }
            return true;
        } else if (i == 152) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
            }
            return true;
        } else if (i == 154) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
            }
            return true;
        } else if (i == 156) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
            }
            return true;
        } else if (i == 806) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            }
            return true;
        } else if (i == 648) {
            synchronized (this) {
                this.mDirtyFlags |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
            }
            return true;
        } else if (i == 57) {
            synchronized (this) {
                this.mDirtyFlags |= 4194304;
            }
            return true;
        } else if (i == 597) {
            synchronized (this) {
                this.mDirtyFlags |= 8388608;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgStorageSaveOptionParamChooseValue1(MappingObject mappingObject, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 16;
            }
            return true;
        } else if (i == 904) {
            synchronized (this) {
                this.mDirtyFlags |= 16777216;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean onChangeViewUtilGetMappingObjectComRigolScopeRArrayMsgStorageWaveFormatParamWaveFileType(MappingObject mappingObject, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 32;
            }
            return true;
        } else if (i == 904) {
            synchronized (this) {
                this.mDirtyFlags |= 33554432;
            }
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01e4  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void executeBindings() {
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        boolean z5;
        int i3;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        String str8;
        int i4;
        String str9;
        String str10;
        int i5;
        String str11;
        String str12;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        StorageSaveParam storageSaveParam = this.mParam;
        String str13 = null;
        if ((134217727 & j) != 0) {
            z4 = ((j & 67239944) == 0 || storageSaveParam == null) ? false : storageSaveParam.isChan2();
            boolean isChan4 = ((j & 67633160) == 0 || storageSaveParam == null) ? false : storageSaveParam.isChan4();
            if ((j & 83886616) != 0) {
                ServiceEnum.StorageOperationChoose choose = storageSaveParam != null ? storageSaveParam.getChoose() : null;
                int i6 = ((j & 67109384) > 0L ? 1 : ((j & 67109384) == 0L ? 0 : -1));
                if (i6 != 0) {
                    boolean z10 = choose == ServiceEnum.StorageOperationChoose.IMAGE;
                    boolean z11 = choose == ServiceEnum.StorageOperationChoose.WAVE;
                    boolean z12 = choose == ServiceEnum.StorageOperationChoose.SETUP;
                    if (i6 != 0) {
                        j |= z10 ? 268435456L : 134217728L;
                    }
                    if ((j & 67109384) != 0) {
                        j |= z11 ? 4294967296L : 2147483648L;
                    }
                    if ((j & 67109384) != 0) {
                        j |= z12 ? 1073741824L : 536870912L;
                    }
                    i3 = 8;
                    i = z10 ? 0 : 8;
                    i4 = z11 ? 0 : 8;
                    if (z12) {
                        i3 = 0;
                    }
                } else {
                    i = 0;
                    i3 = 0;
                    i4 = 0;
                }
                MappingObject mappingObject = ViewUtil.getMappingObject(R.array.msg_storage_save_option, choose != null ? choose.value1 : 0);
                updateRegistration(4, mappingObject);
                str8 = mappingObject != null ? mappingObject.getStr() : null;
            } else {
                str8 = null;
                i = 0;
                i3 = 0;
                i4 = 0;
            }
            if ((j & 75497480) != 0) {
                str9 = ViewUtil.getDiskUIPathName(storageSaveParam != null ? storageSaveParam.getPathName() : null);
            } else {
                str9 = null;
            }
            boolean isChan1 = ((j & 67174408) == 0 || storageSaveParam == null) ? false : storageSaveParam.isChan1();
            boolean isChan3 = ((j & 67371016) == 0 || storageSaveParam == null) ? false : storageSaveParam.isChan3();
            boolean isImageInvert = ((j & 67110920) == 0 || storageSaveParam == null) ? false : storageSaveParam.isImageInvert();
            boolean isImageHeader = ((j & 67117064) == 0 || storageSaveParam == null) ? false : storageSaveParam.isImageHeader();
            if ((j & 100696104) != 0) {
                MappingObject mappingObject2 = ViewUtil.getMappingObject(R.array.msg_storage_wave_format, storageSaveParam != null ? storageSaveParam.getWaveFileType() : 0);
                updateRegistration(5, mappingObject2);
                if (mappingObject2 != null) {
                    str10 = mappingObject2.getStr();
                    boolean isAutoName = ((j & 71303176) != 0 || storageSaveParam == null) ? false : storageSaveParam.isAutoName();
                    boolean isImageColor = ((j & 67112968) != 0 || storageSaveParam == null) ? false : storageSaveParam.isImageColor();
                    String prefix = ((j & 69206024) != 0 || storageSaveParam == null) ? null : storageSaveParam.getPrefix();
                    if ((j & 68157513) == 0) {
                        MappingObject mappingObject3 = ViewUtil.getMappingObject(R.array.msg_storage_setup_format, storageSaveParam != null ? storageSaveParam.getSetupFileType() : 0);
                        i5 = 0;
                        updateRegistration(0, mappingObject3);
                        if (mappingObject3 != null) {
                            str11 = mappingObject3.getStr();
                            if ((j & 67125516) != 0) {
                                if (storageSaveParam != null) {
                                    i5 = storageSaveParam.getWaveDepth();
                                }
                                MappingObject mappingObject4 = ViewUtil.getMappingObject(R.array.msg_storage_wave_depth, i5);
                                updateRegistration(2, mappingObject4);
                                if (mappingObject4 != null) {
                                    str12 = mappingObject4.getStr();
                                    if ((j & 67110026) != 0) {
                                        MappingObject mappingObject5 = ViewUtil.getMappingObject(R.array.msg_storage_image_format, storageSaveParam != null ? storageSaveParam.getImageFileType() : 0);
                                        updateRegistration(1, mappingObject5);
                                        if (mappingObject5 != null) {
                                            str13 = mappingObject5.getStr();
                                        }
                                    }
                                    str6 = str12;
                                    str3 = str9;
                                    str5 = str11;
                                    str7 = str10;
                                    z3 = isChan4;
                                    z = isChan1;
                                    z2 = isChan3;
                                    z7 = isImageInvert;
                                    z6 = isImageHeader;
                                    z5 = isImageColor;
                                    str4 = prefix;
                                    str = str8;
                                    i2 = i4;
                                    z8 = isAutoName;
                                    str2 = str13;
                                }
                            }
                            str12 = null;
                            if ((j & 67110026) != 0) {
                            }
                            str6 = str12;
                            str3 = str9;
                            str5 = str11;
                            str7 = str10;
                            z3 = isChan4;
                            z = isChan1;
                            z2 = isChan3;
                            z7 = isImageInvert;
                            z6 = isImageHeader;
                            z5 = isImageColor;
                            str4 = prefix;
                            str = str8;
                            i2 = i4;
                            z8 = isAutoName;
                            str2 = str13;
                        }
                    } else {
                        i5 = 0;
                    }
                    str11 = null;
                    if ((j & 67125516) != 0) {
                    }
                    str12 = null;
                    if ((j & 67110026) != 0) {
                    }
                    str6 = str12;
                    str3 = str9;
                    str5 = str11;
                    str7 = str10;
                    z3 = isChan4;
                    z = isChan1;
                    z2 = isChan3;
                    z7 = isImageInvert;
                    z6 = isImageHeader;
                    z5 = isImageColor;
                    str4 = prefix;
                    str = str8;
                    i2 = i4;
                    z8 = isAutoName;
                    str2 = str13;
                }
            }
            str10 = null;
            if ((j & 71303176) != 0) {
            }
            if ((j & 67112968) != 0) {
            }
            if ((j & 69206024) != 0) {
            }
            if ((j & 68157513) == 0) {
            }
            str11 = null;
            if ((j & 67125516) != 0) {
            }
            str12 = null;
            if ((j & 67110026) != 0) {
            }
            str6 = str12;
            str3 = str9;
            str5 = str11;
            str7 = str10;
            z3 = isChan4;
            z = isChan1;
            z2 = isChan3;
            z7 = isImageInvert;
            z6 = isImageHeader;
            z5 = isImageColor;
            str4 = prefix;
            str = str8;
            i2 = i4;
            z8 = isAutoName;
            str2 = str13;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            i = 0;
            i2 = 0;
            z5 = false;
            i3 = 0;
            z6 = false;
            z7 = false;
            z8 = false;
        }
        if ((j & 71303176) != 0) {
            z9 = z7;
            CompoundButtonBindingAdapter.setChecked(this.autoNameSwitch, z8);
        } else {
            z9 = z7;
        }
        if ((j & 67174408) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.checkBoxCH1, z);
        }
        if ((j & 67239944) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.checkBoxCH2, z4);
        }
        if ((j & 67371016) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.checkBoxCH3, z2);
        }
        if ((j & 67633160) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.checkBoxCH4, z3);
        }
        if ((j & 83886616) != 0) {
            TextViewBindingAdapter.setText(this.chooseSpinnerSave, str);
        }
        if ((j & 67109384) != 0) {
            this.imageColor.setVisibility(i);
            this.imageColorSwitch.setVisibility(i);
            this.imageFormat.setVisibility(i);
            this.imageFormatSpinner.setVisibility(i);
            this.imageHeader.setVisibility(i);
            this.imageHeaderSwitch.setVisibility(i);
            this.imageInvert.setVisibility(i);
            this.imageInvertSwitch.setVisibility(i);
            this.setupFormat.setVisibility(i3);
            this.setupFormatSpinner.setVisibility(i3);
            this.waveDepth.setVisibility(i2);
            this.waveDepthSpinner.setVisibility(i2);
            this.waveFormat.setVisibility(i2);
            this.waveFormatSpinner.setVisibility(i2);
        }
        if ((j & 67112968) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.imageColorSwitch, z5);
        }
        if ((67110026 & j) != 0) {
            TextViewBindingAdapter.setText(this.imageFormatSpinner, str2);
        }
        if ((j & 67117064) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.imageHeaderSwitch, z6);
        }
        if ((j & 67110920) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.imageInvertSwitch, z9);
        }
        if ((j & 75497480) != 0) {
            TextViewBindingAdapter.setText(this.pathNameEditText, str3);
        }
        if ((69206024 & j) != 0) {
            TextViewBindingAdapter.setText(this.prefixEditText, str4);
        }
        if ((68157513 & j) != 0) {
            TextViewBindingAdapter.setText(this.setupFormatSpinner, str5);
        }
        if ((67125516 & j) != 0) {
            TextViewBindingAdapter.setText(this.waveDepthSpinner, str6);
        }
        if ((j & 100696104) != 0) {
            TextViewBindingAdapter.setText(this.waveFormatSpinner, str7);
        }
    }
}
