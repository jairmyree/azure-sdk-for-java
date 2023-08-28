// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.ApiVersionSetUpdateParametersProperties;
import com.azure.resourcemanager.apimanagement.models.VersioningScheme;
import org.junit.jupiter.api.Assertions;

public final class ApiVersionSetUpdateParametersPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApiVersionSetUpdateParametersProperties model =
            BinaryData
                .fromString(
                    "{\"displayName\":\"rem\",\"versioningScheme\":\"Query\",\"description\":\"izhceumoqodkadp\",\"versionQueryName\":\"ibngqladyw\",\"versionHeaderName\":\"whydt\"}")
                .toObject(ApiVersionSetUpdateParametersProperties.class);
        Assertions.assertEquals("izhceumoqodkadp", model.description());
        Assertions.assertEquals("ibngqladyw", model.versionQueryName());
        Assertions.assertEquals("whydt", model.versionHeaderName());
        Assertions.assertEquals("rem", model.displayName());
        Assertions.assertEquals(VersioningScheme.QUERY, model.versioningScheme());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApiVersionSetUpdateParametersProperties model =
            new ApiVersionSetUpdateParametersProperties()
                .withDescription("izhceumoqodkadp")
                .withVersionQueryName("ibngqladyw")
                .withVersionHeaderName("whydt")
                .withDisplayName("rem")
                .withVersioningScheme(VersioningScheme.QUERY);
        model = BinaryData.fromObject(model).toObject(ApiVersionSetUpdateParametersProperties.class);
        Assertions.assertEquals("izhceumoqodkadp", model.description());
        Assertions.assertEquals("ibngqladyw", model.versionQueryName());
        Assertions.assertEquals("whydt", model.versionHeaderName());
        Assertions.assertEquals("rem", model.displayName());
        Assertions.assertEquals(VersioningScheme.QUERY, model.versioningScheme());
    }
}