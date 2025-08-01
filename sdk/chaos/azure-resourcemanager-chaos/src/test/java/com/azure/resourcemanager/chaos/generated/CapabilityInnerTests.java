// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.chaos.fluent.models.CapabilityInner;

public final class CapabilityInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CapabilityInner model = BinaryData.fromString(
            "{\"properties\":{\"publisher\":\"bvmeuecivy\",\"targetType\":\"ce\",\"description\":\"jgjrwjueiotwm\",\"parametersSchema\":\"ytdxwit\",\"urn\":\"rjaw\"},\"id\":\"wgxhn\",\"name\":\"skxfbk\",\"type\":\"y\"}")
            .toObject(CapabilityInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CapabilityInner model = new CapabilityInner();
        model = BinaryData.fromObject(model).toObject(CapabilityInner.class);
    }
}
