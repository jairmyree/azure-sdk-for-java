// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.ComputeResourceDefinition;
import org.junit.jupiter.api.Assertions;

public final class ComputeResourceDefinitionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ComputeResourceDefinition model =
            BinaryData
                .fromString("{\"cpu\":48.283417,\"memory\":5016929626022013570}")
                .toObject(ComputeResourceDefinition.class);
        Assertions.assertEquals(48.283417f, model.cpu());
        Assertions.assertEquals(5016929626022013570L, model.memory());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ComputeResourceDefinition model =
            new ComputeResourceDefinition().withCpu(48.283417f).withMemory(5016929626022013570L);
        model = BinaryData.fromObject(model).toObject(ComputeResourceDefinition.class);
        Assertions.assertEquals(48.283417f, model.cpu());
        Assertions.assertEquals(5016929626022013570L, model.memory());
    }
}