// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.Action;
import com.azure.resourcemanager.hdinsight.containers.models.FlinkJobProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class FlinkJobPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FlinkJobProperties model =
            BinaryData
                .fromString(
                    "{\"jobType\":\"FlinkJob\",\"jobName\":\"ayhmtnvyqiatkz\",\"jobJarDirectory\":\"cnpwzcjaesgvvscc\",\"jarName\":\"jguq\",\"entryClass\":\"wygzlvdnkfxusem\",\"args\":\"zrmuhapfcqdps\",\"savePointName\":\"qvpsvuoymg\",\"action\":\"STOP\",\"flinkConfiguration\":{\"feo\":\"ezrypql\",\"edkowepbqpcrfk\":\"erqwkyhkobopg\",\"tn\":\"wccsnjvcdwxlpqek\"},\"jobId\":\"tjsyin\",\"status\":\"fq\",\"jobOutput\":\"mtdh\",\"actionResult\":\"dvypgikdgsz\",\"lastSavePoint\":\"kbir\"}")
                .toObject(FlinkJobProperties.class);
        Assertions.assertEquals("ayhmtnvyqiatkz", model.jobName());
        Assertions.assertEquals("cnpwzcjaesgvvscc", model.jobJarDirectory());
        Assertions.assertEquals("jguq", model.jarName());
        Assertions.assertEquals("wygzlvdnkfxusem", model.entryClass());
        Assertions.assertEquals("zrmuhapfcqdps", model.args());
        Assertions.assertEquals("qvpsvuoymg", model.savePointName());
        Assertions.assertEquals(Action.STOP, model.action());
        Assertions.assertEquals("ezrypql", model.flinkConfiguration().get("feo"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FlinkJobProperties model =
            new FlinkJobProperties()
                .withJobName("ayhmtnvyqiatkz")
                .withJobJarDirectory("cnpwzcjaesgvvscc")
                .withJarName("jguq")
                .withEntryClass("wygzlvdnkfxusem")
                .withArgs("zrmuhapfcqdps")
                .withSavePointName("qvpsvuoymg")
                .withAction(Action.STOP)
                .withFlinkConfiguration(
                    mapOf("feo", "ezrypql", "edkowepbqpcrfk", "erqwkyhkobopg", "tn", "wccsnjvcdwxlpqek"));
        model = BinaryData.fromObject(model).toObject(FlinkJobProperties.class);
        Assertions.assertEquals("ayhmtnvyqiatkz", model.jobName());
        Assertions.assertEquals("cnpwzcjaesgvvscc", model.jobJarDirectory());
        Assertions.assertEquals("jguq", model.jarName());
        Assertions.assertEquals("wygzlvdnkfxusem", model.entryClass());
        Assertions.assertEquals("zrmuhapfcqdps", model.args());
        Assertions.assertEquals("qvpsvuoymg", model.savePointName());
        Assertions.assertEquals(Action.STOP, model.action());
        Assertions.assertEquals("ezrypql", model.flinkConfiguration().get("feo"));
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