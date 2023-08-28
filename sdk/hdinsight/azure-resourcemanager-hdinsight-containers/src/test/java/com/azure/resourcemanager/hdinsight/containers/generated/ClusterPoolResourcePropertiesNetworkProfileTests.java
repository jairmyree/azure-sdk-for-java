// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterPoolResourcePropertiesNetworkProfile;
import org.junit.jupiter.api.Assertions;

public final class ClusterPoolResourcePropertiesNetworkProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterPoolResourcePropertiesNetworkProfile model =
            BinaryData
                .fromString("{\"subnetId\":\"odjpslwejd\"}")
                .toObject(ClusterPoolResourcePropertiesNetworkProfile.class);
        Assertions.assertEquals("odjpslwejd", model.subnetId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterPoolResourcePropertiesNetworkProfile model =
            new ClusterPoolResourcePropertiesNetworkProfile().withSubnetId("odjpslwejd");
        model = BinaryData.fromObject(model).toObject(ClusterPoolResourcePropertiesNetworkProfile.class);
        Assertions.assertEquals("odjpslwejd", model.subnetId());
    }
}