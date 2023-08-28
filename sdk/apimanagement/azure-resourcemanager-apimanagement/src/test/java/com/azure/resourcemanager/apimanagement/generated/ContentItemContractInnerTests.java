// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.ContentItemContractInner;
import java.util.HashMap;
import java.util.Map;

public final class ContentItemContractInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContentItemContractInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"dnkefgm\":\"datacvbiiftksdw\",\"zldbglzoutbaaqg\":\"datadhcebuv\",\"lyzgsnor\":\"dataekaj\"},\"id\":\"jgmn\",\"name\":\"jotvmrxkhl\",\"type\":\"bvvjbhvhdiq\"}")
                .toObject(ContentItemContractInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContentItemContractInner model =
            new ContentItemContractInner()
                .withProperties(
                    mapOf("dnkefgm", "datacvbiiftksdw", "zldbglzoutbaaqg", "datadhcebuv", "lyzgsnor", "dataekaj"));
        model = BinaryData.fromObject(model).toObject(ContentItemContractInner.class);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}