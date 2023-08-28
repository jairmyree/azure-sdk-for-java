// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterLogAnalyticsApplicationLogs;
import org.junit.jupiter.api.Assertions;

public final class ClusterLogAnalyticsApplicationLogsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterLogAnalyticsApplicationLogs model =
            BinaryData
                .fromString("{\"stdOutEnabled\":true,\"stdErrorEnabled\":false}")
                .toObject(ClusterLogAnalyticsApplicationLogs.class);
        Assertions.assertEquals(true, model.stdOutEnabled());
        Assertions.assertEquals(false, model.stdErrorEnabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterLogAnalyticsApplicationLogs model =
            new ClusterLogAnalyticsApplicationLogs().withStdOutEnabled(true).withStdErrorEnabled(false);
        model = BinaryData.fromObject(model).toObject(ClusterLogAnalyticsApplicationLogs.class);
        Assertions.assertEquals(true, model.stdOutEnabled());
        Assertions.assertEquals(false, model.stdErrorEnabled());
    }
}