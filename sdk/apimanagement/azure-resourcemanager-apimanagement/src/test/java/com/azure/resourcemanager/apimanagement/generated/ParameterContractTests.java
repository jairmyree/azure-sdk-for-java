// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.ParameterContract;
import com.azure.resourcemanager.apimanagement.models.ParameterExampleContract;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ParameterContractTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ParameterContract model =
            BinaryData
                .fromString(
                    "{\"name\":\"rqttbajlkatnw\",\"description\":\"iopid\",\"type\":\"qqfkuv\",\"defaultValue\":\"xkdmligo\",\"required\":false,\"values\":[\"kpmloa\"],\"schemaId\":\"ruocbgo\",\"typeName\":\"bteoybf\",\"examples\":{\"xccybvpa\":{\"summary\":\"kvvjgslordilmyww\",\"description\":\"gkxnyedabg\",\"value\":\"dataudtjuewbc\",\"externalValue\":\"xuuwhcj\"},\"ogsjkmnwqjno\":{\"summary\":\"kkudzp\",\"description\":\"wjplma\",\"value\":\"datatcyohpfkyrk\",\"externalValue\":\"dg\"},\"evwrdnhfuk\":{\"summary\":\"iyhddvi\",\"description\":\"egfnmntfpmvmemfn\",\"value\":\"datadwvvba\",\"externalValue\":\"lllchpodb\"}}}")
                .toObject(ParameterContract.class);
        Assertions.assertEquals("rqttbajlkatnw", model.name());
        Assertions.assertEquals("iopid", model.description());
        Assertions.assertEquals("qqfkuv", model.type());
        Assertions.assertEquals("xkdmligo", model.defaultValue());
        Assertions.assertEquals(false, model.required());
        Assertions.assertEquals("kpmloa", model.values().get(0));
        Assertions.assertEquals("ruocbgo", model.schemaId());
        Assertions.assertEquals("bteoybf", model.typeName());
        Assertions.assertEquals("kvvjgslordilmyww", model.examples().get("xccybvpa").summary());
        Assertions.assertEquals("gkxnyedabg", model.examples().get("xccybvpa").description());
        Assertions.assertEquals("xuuwhcj", model.examples().get("xccybvpa").externalValue());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ParameterContract model =
            new ParameterContract()
                .withName("rqttbajlkatnw")
                .withDescription("iopid")
                .withType("qqfkuv")
                .withDefaultValue("xkdmligo")
                .withRequired(false)
                .withValues(Arrays.asList("kpmloa"))
                .withSchemaId("ruocbgo")
                .withTypeName("bteoybf")
                .withExamples(
                    mapOf(
                        "xccybvpa",
                        new ParameterExampleContract()
                            .withSummary("kvvjgslordilmyww")
                            .withDescription("gkxnyedabg")
                            .withValue("dataudtjuewbc")
                            .withExternalValue("xuuwhcj"),
                        "ogsjkmnwqjno",
                        new ParameterExampleContract()
                            .withSummary("kkudzp")
                            .withDescription("wjplma")
                            .withValue("datatcyohpfkyrk")
                            .withExternalValue("dg"),
                        "evwrdnhfuk",
                        new ParameterExampleContract()
                            .withSummary("iyhddvi")
                            .withDescription("egfnmntfpmvmemfn")
                            .withValue("datadwvvba")
                            .withExternalValue("lllchpodb")));
        model = BinaryData.fromObject(model).toObject(ParameterContract.class);
        Assertions.assertEquals("rqttbajlkatnw", model.name());
        Assertions.assertEquals("iopid", model.description());
        Assertions.assertEquals("qqfkuv", model.type());
        Assertions.assertEquals("xkdmligo", model.defaultValue());
        Assertions.assertEquals(false, model.required());
        Assertions.assertEquals("kpmloa", model.values().get(0));
        Assertions.assertEquals("ruocbgo", model.schemaId());
        Assertions.assertEquals("bteoybf", model.typeName());
        Assertions.assertEquals("kvvjgslordilmyww", model.examples().get("xccybvpa").summary());
        Assertions.assertEquals("gkxnyedabg", model.examples().get("xccybvpa").description());
        Assertions.assertEquals("xuuwhcj", model.examples().get("xccybvpa").externalValue());
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