// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.LibraryInfo;
import org.junit.jupiter.api.Assertions;

public final class LibraryInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LibraryInfo model = BinaryData.fromString(
            "{\"name\":\"o\",\"path\":\"si\",\"containerName\":\"evcciqihnhun\",\"uploadedTimestamp\":\"2021-08-15T16:10:49Z\",\"type\":\"zrnf\",\"provisioningStatus\":\"xgispemvtzfkufu\",\"creatorId\":\"jofxqe\"}")
            .toObject(LibraryInfo.class);
        Assertions.assertEquals("o", model.name());
        Assertions.assertEquals("si", model.path());
        Assertions.assertEquals("evcciqihnhun", model.containerName());
        Assertions.assertEquals("zrnf", model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LibraryInfo model
            = new LibraryInfo().withName("o").withPath("si").withContainerName("evcciqihnhun").withType("zrnf");
        model = BinaryData.fromObject(model).toObject(LibraryInfo.class);
        Assertions.assertEquals("o", model.name());
        Assertions.assertEquals("si", model.path());
        Assertions.assertEquals("evcciqihnhun", model.containerName());
        Assertions.assertEquals("zrnf", model.type());
    }
}
