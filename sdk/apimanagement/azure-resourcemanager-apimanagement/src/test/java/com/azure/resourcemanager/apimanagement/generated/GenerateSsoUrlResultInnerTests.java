// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.GenerateSsoUrlResultInner;
import org.junit.jupiter.api.Assertions;

public final class GenerateSsoUrlResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GenerateSsoUrlResultInner model =
            BinaryData.fromString("{\"value\":\"dlhzwhcu\"}").toObject(GenerateSsoUrlResultInner.class);
        Assertions.assertEquals("dlhzwhcu", model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GenerateSsoUrlResultInner model = new GenerateSsoUrlResultInner().withValue("dlhzwhcu");
        model = BinaryData.fromObject(model).toObject(GenerateSsoUrlResultInner.class);
        Assertions.assertEquals("dlhzwhcu", model.value());
    }
}