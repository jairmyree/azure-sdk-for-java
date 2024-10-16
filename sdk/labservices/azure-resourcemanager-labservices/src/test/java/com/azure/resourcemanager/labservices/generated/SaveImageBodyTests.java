// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.labservices.models.SaveImageBody;
import org.junit.jupiter.api.Assertions;

public final class SaveImageBodyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SaveImageBody model = BinaryData.fromString("{\"name\":\"ur\",\"labVirtualMachineId\":\"xxjnspydptk\"}")
            .toObject(SaveImageBody.class);
        Assertions.assertEquals("ur", model.name());
        Assertions.assertEquals("xxjnspydptk", model.labVirtualMachineId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SaveImageBody model = new SaveImageBody().withName("ur").withLabVirtualMachineId("xxjnspydptk");
        model = BinaryData.fromObject(model).toObject(SaveImageBody.class);
        Assertions.assertEquals("ur", model.name());
        Assertions.assertEquals("xxjnspydptk", model.labVirtualMachineId());
    }
}
