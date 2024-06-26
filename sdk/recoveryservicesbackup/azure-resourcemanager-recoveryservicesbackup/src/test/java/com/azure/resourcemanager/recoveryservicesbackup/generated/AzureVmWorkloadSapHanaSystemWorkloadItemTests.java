// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureVmWorkloadSapHanaSystemWorkloadItem;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import org.junit.jupiter.api.Assertions;

public final class AzureVmWorkloadSapHanaSystemWorkloadItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureVmWorkloadSapHanaSystemWorkloadItem model = BinaryData.fromString(
            "{\"workloadItemType\":\"SAPHanaSystem\",\"parentName\":\"qtjzmizvgbg\",\"serverName\":\"zuuvbxngrebw\",\"isAutoProtectable\":true,\"subinquireditemcount\":1794399403,\"subWorkloadItemCount\":80766571,\"backupManagementType\":\"swvajqfu\",\"workloadType\":\"x\",\"friendlyName\":\"qzasunwqrjzfrgqh\",\"protectionState\":\"Protected\"}")
            .toObject(AzureVmWorkloadSapHanaSystemWorkloadItem.class);
        Assertions.assertEquals("swvajqfu", model.backupManagementType());
        Assertions.assertEquals("x", model.workloadType());
        Assertions.assertEquals("qzasunwqrjzfrgqh", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTED, model.protectionState());
        Assertions.assertEquals("qtjzmizvgbg", model.parentName());
        Assertions.assertEquals("zuuvbxngrebw", model.serverName());
        Assertions.assertEquals(true, model.isAutoProtectable());
        Assertions.assertEquals(1794399403, model.subinquireditemcount());
        Assertions.assertEquals(80766571, model.subWorkloadItemCount());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureVmWorkloadSapHanaSystemWorkloadItem model
            = new AzureVmWorkloadSapHanaSystemWorkloadItem().withBackupManagementType("swvajqfu")
                .withWorkloadType("x")
                .withFriendlyName("qzasunwqrjzfrgqh")
                .withProtectionState(ProtectionStatus.PROTECTED)
                .withParentName("qtjzmizvgbg")
                .withServerName("zuuvbxngrebw")
                .withIsAutoProtectable(true)
                .withSubinquireditemcount(1794399403)
                .withSubWorkloadItemCount(80766571);
        model = BinaryData.fromObject(model).toObject(AzureVmWorkloadSapHanaSystemWorkloadItem.class);
        Assertions.assertEquals("swvajqfu", model.backupManagementType());
        Assertions.assertEquals("x", model.workloadType());
        Assertions.assertEquals("qzasunwqrjzfrgqh", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTED, model.protectionState());
        Assertions.assertEquals("qtjzmizvgbg", model.parentName());
        Assertions.assertEquals("zuuvbxngrebw", model.serverName());
        Assertions.assertEquals(true, model.isAutoProtectable());
        Assertions.assertEquals(1794399403, model.subinquireditemcount());
        Assertions.assertEquals(80766571, model.subWorkloadItemCount());
    }
}
