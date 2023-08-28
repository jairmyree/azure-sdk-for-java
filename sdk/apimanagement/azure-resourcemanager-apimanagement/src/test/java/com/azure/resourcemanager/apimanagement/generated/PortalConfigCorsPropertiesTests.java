// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.PortalConfigCorsProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PortalConfigCorsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PortalConfigCorsProperties model =
            BinaryData
                .fromString("{\"allowedOrigins\":[\"wz\",\"ntogffjwajnrt\",\"zvaqkifmxawost\",\"zkn\"]}")
                .toObject(PortalConfigCorsProperties.class);
        Assertions.assertEquals("wz", model.allowedOrigins().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PortalConfigCorsProperties model =
            new PortalConfigCorsProperties()
                .withAllowedOrigins(Arrays.asList("wz", "ntogffjwajnrt", "zvaqkifmxawost", "zkn"));
        model = BinaryData.fromObject(model).toObject(PortalConfigCorsProperties.class);
        Assertions.assertEquals("wz", model.allowedOrigins().get(0));
    }
}