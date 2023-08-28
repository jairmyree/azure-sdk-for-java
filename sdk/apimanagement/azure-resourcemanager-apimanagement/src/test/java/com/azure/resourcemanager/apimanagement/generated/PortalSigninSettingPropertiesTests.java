// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.PortalSigninSettingProperties;
import org.junit.jupiter.api.Assertions;

public final class PortalSigninSettingPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PortalSigninSettingProperties model =
            BinaryData.fromString("{\"enabled\":true}").toObject(PortalSigninSettingProperties.class);
        Assertions.assertEquals(true, model.enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PortalSigninSettingProperties model = new PortalSigninSettingProperties().withEnabled(true);
        model = BinaryData.fromObject(model).toObject(PortalSigninSettingProperties.class);
        Assertions.assertEquals(true, model.enabled());
    }
}