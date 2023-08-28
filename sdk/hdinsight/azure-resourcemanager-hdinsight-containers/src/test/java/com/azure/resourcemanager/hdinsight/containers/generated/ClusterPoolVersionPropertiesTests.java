// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.ClusterPoolVersionProperties;
import org.junit.jupiter.api.Assertions;

public final class ClusterPoolVersionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterPoolVersionProperties model =
            BinaryData
                .fromString("{\"clusterPoolVersion\":\"luhczbw\",\"aksVersion\":\"hairsbrgzdwms\",\"isPreview\":true}")
                .toObject(ClusterPoolVersionProperties.class);
        Assertions.assertEquals("luhczbw", model.clusterPoolVersion());
        Assertions.assertEquals("hairsbrgzdwms", model.aksVersion());
        Assertions.assertEquals(true, model.isPreview());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterPoolVersionProperties model =
            new ClusterPoolVersionProperties()
                .withClusterPoolVersion("luhczbw")
                .withAksVersion("hairsbrgzdwms")
                .withIsPreview(true);
        model = BinaryData.fromObject(model).toObject(ClusterPoolVersionProperties.class);
        Assertions.assertEquals("luhczbw", model.clusterPoolVersion());
        Assertions.assertEquals("hairsbrgzdwms", model.aksVersion());
        Assertions.assertEquals(true, model.isPreview());
    }
}