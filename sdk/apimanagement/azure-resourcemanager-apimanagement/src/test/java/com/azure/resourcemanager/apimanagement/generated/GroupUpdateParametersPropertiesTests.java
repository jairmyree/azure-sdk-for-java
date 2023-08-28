// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.GroupUpdateParametersProperties;
import com.azure.resourcemanager.apimanagement.models.GroupType;
import org.junit.jupiter.api.Assertions;

public final class GroupUpdateParametersPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GroupUpdateParametersProperties model =
            BinaryData
                .fromString(
                    "{\"displayName\":\"ptkbvcpxtzhi\",\"description\":\"qbtimpk\",\"type\":\"external\",\"externalId\":\"rnsihqhudsmus\"}")
                .toObject(GroupUpdateParametersProperties.class);
        Assertions.assertEquals("ptkbvcpxtzhi", model.displayName());
        Assertions.assertEquals("qbtimpk", model.description());
        Assertions.assertEquals(GroupType.EXTERNAL, model.type());
        Assertions.assertEquals("rnsihqhudsmus", model.externalId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GroupUpdateParametersProperties model =
            new GroupUpdateParametersProperties()
                .withDisplayName("ptkbvcpxtzhi")
                .withDescription("qbtimpk")
                .withType(GroupType.EXTERNAL)
                .withExternalId("rnsihqhudsmus");
        model = BinaryData.fromObject(model).toObject(GroupUpdateParametersProperties.class);
        Assertions.assertEquals("ptkbvcpxtzhi", model.displayName());
        Assertions.assertEquals("qbtimpk", model.description());
        Assertions.assertEquals(GroupType.EXTERNAL, model.type());
        Assertions.assertEquals("rnsihqhudsmus", model.externalId());
    }
}