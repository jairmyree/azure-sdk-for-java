// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.fluent.models.DefenderForAISettingInner;
import com.azure.resourcemanager.cognitiveservices.models.DefenderForAISettingState;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DefenderForAISettingInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefenderForAISettingInner model = BinaryData.fromString(
            "{\"etag\":\"ojhp\",\"tags\":{\"ugeyzihgrkyuiza\":\"nmdxotngfd\",\"yhsgz\":\"snmfpphojeevy\"},\"properties\":{\"state\":\"Enabled\"},\"id\":\"gomfgbeglq\",\"name\":\"leohibetnluankr\",\"type\":\"fxeeebtijvacvbm\"}")
            .toObject(DefenderForAISettingInner.class);
        Assertions.assertEquals("nmdxotngfd", model.tags().get("ugeyzihgrkyuiza"));
        Assertions.assertEquals(DefenderForAISettingState.ENABLED, model.state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefenderForAISettingInner model
            = new DefenderForAISettingInner().withTags(mapOf("ugeyzihgrkyuiza", "nmdxotngfd", "yhsgz", "snmfpphojeevy"))
                .withState(DefenderForAISettingState.ENABLED);
        model = BinaryData.fromObject(model).toObject(DefenderForAISettingInner.class);
        Assertions.assertEquals("nmdxotngfd", model.tags().get("ugeyzihgrkyuiza"));
        Assertions.assertEquals(DefenderForAISettingState.ENABLED, model.state());
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
