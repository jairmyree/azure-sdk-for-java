// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.TagContractInner;
import org.junit.jupiter.api.Assertions;

public final class TagContractInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TagContractInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"displayName\":\"hnp\"},\"id\":\"myqwcab\",\"name\":\"nuilee\",\"type\":\"aswlp\"}")
                .toObject(TagContractInner.class);
        Assertions.assertEquals("hnp", model.displayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TagContractInner model = new TagContractInner().withDisplayName("hnp");
        model = BinaryData.fromObject(model).toObject(TagContractInner.class);
        Assertions.assertEquals("hnp", model.displayName());
    }
}