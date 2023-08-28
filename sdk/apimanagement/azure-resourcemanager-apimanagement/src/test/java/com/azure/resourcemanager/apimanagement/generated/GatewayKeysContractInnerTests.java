// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.GatewayKeysContractInner;
import org.junit.jupiter.api.Assertions;

public final class GatewayKeysContractInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GatewayKeysContractInner model =
            BinaryData
                .fromString("{\"primary\":\"owl\",\"secondary\":\"ouwhldxwhie\"}")
                .toObject(GatewayKeysContractInner.class);
        Assertions.assertEquals("owl", model.primary());
        Assertions.assertEquals("ouwhldxwhie", model.secondary());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GatewayKeysContractInner model = new GatewayKeysContractInner().withPrimary("owl").withSecondary("ouwhldxwhie");
        model = BinaryData.fromObject(model).toObject(GatewayKeysContractInner.class);
        Assertions.assertEquals("owl", model.primary());
        Assertions.assertEquals("ouwhldxwhie", model.secondary());
    }
}