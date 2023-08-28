// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.TrinoDebugConfig;
import org.junit.jupiter.api.Assertions;

public final class TrinoDebugConfigTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TrinoDebugConfig model =
            BinaryData
                .fromString("{\"enable\":true,\"port\":741975656,\"suspend\":true}")
                .toObject(TrinoDebugConfig.class);
        Assertions.assertEquals(true, model.enable());
        Assertions.assertEquals(741975656, model.port());
        Assertions.assertEquals(true, model.suspend());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TrinoDebugConfig model = new TrinoDebugConfig().withEnable(true).withPort(741975656).withSuspend(true);
        model = BinaryData.fromObject(model).toObject(TrinoDebugConfig.class);
        Assertions.assertEquals(true, model.enable());
        Assertions.assertEquals(741975656, model.port());
        Assertions.assertEquals(true, model.suspend());
    }
}