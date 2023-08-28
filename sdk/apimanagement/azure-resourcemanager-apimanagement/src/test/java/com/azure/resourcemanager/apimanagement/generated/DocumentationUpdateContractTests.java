// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.DocumentationUpdateContract;
import org.junit.jupiter.api.Assertions;

public final class DocumentationUpdateContractTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DocumentationUpdateContract model =
            BinaryData
                .fromString("{\"properties\":{\"title\":\"jcxgdqmrlhnzkwo\",\"content\":\"wny\"}}")
                .toObject(DocumentationUpdateContract.class);
        Assertions.assertEquals("jcxgdqmrlhnzkwo", model.title());
        Assertions.assertEquals("wny", model.content());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DocumentationUpdateContract model =
            new DocumentationUpdateContract().withTitle("jcxgdqmrlhnzkwo").withContent("wny");
        model = BinaryData.fromObject(model).toObject(DocumentationUpdateContract.class);
        Assertions.assertEquals("jcxgdqmrlhnzkwo", model.title());
        Assertions.assertEquals("wny", model.content());
    }
}