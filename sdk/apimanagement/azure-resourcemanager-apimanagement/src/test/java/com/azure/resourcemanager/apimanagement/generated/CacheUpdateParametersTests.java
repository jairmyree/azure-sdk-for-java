// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.CacheUpdateParameters;
import org.junit.jupiter.api.Assertions;

public final class CacheUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CacheUpdateParameters model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"description\":\"vnmdyfoeboj\",\"connectionString\":\"pp\",\"useFromLocation\":\"aohoqkpjtnq\",\"resourceId\":\"l\"}}")
                .toObject(CacheUpdateParameters.class);
        Assertions.assertEquals("vnmdyfoeboj", model.description());
        Assertions.assertEquals("pp", model.connectionString());
        Assertions.assertEquals("aohoqkpjtnq", model.useFromLocation());
        Assertions.assertEquals("l", model.resourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CacheUpdateParameters model =
            new CacheUpdateParameters()
                .withDescription("vnmdyfoeboj")
                .withConnectionString("pp")
                .withUseFromLocation("aohoqkpjtnq")
                .withResourceId("l");
        model = BinaryData.fromObject(model).toObject(CacheUpdateParameters.class);
        Assertions.assertEquals("vnmdyfoeboj", model.description());
        Assertions.assertEquals("pp", model.connectionString());
        Assertions.assertEquals("aohoqkpjtnq", model.useFromLocation());
        Assertions.assertEquals("l", model.resourceId());
    }
}