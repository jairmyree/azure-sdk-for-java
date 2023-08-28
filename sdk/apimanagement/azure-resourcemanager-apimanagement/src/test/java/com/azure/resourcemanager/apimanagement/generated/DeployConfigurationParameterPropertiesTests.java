// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.DeployConfigurationParameterProperties;
import org.junit.jupiter.api.Assertions;

public final class DeployConfigurationParameterPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DeployConfigurationParameterProperties model =
            BinaryData
                .fromString("{\"branch\":\"esgzs\",\"force\":false}")
                .toObject(DeployConfigurationParameterProperties.class);
        Assertions.assertEquals("esgzs", model.branch());
        Assertions.assertEquals(false, model.force());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DeployConfigurationParameterProperties model =
            new DeployConfigurationParameterProperties().withBranch("esgzs").withForce(false);
        model = BinaryData.fromObject(model).toObject(DeployConfigurationParameterProperties.class);
        Assertions.assertEquals("esgzs", model.branch());
        Assertions.assertEquals(false, model.force());
    }
}