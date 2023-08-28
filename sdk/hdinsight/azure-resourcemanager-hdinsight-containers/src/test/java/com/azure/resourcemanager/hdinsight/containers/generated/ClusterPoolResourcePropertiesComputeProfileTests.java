// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterPoolResourcePropertiesComputeProfile;
import org.junit.jupiter.api.Assertions;

public final class ClusterPoolResourcePropertiesComputeProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterPoolResourcePropertiesComputeProfile model =
            BinaryData
                .fromString("{\"vmSize\":\"xwczbyscnp\",\"count\":219984358}")
                .toObject(ClusterPoolResourcePropertiesComputeProfile.class);
        Assertions.assertEquals("xwczbyscnp", model.vmSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterPoolResourcePropertiesComputeProfile model =
            new ClusterPoolResourcePropertiesComputeProfile().withVmSize("xwczbyscnp");
        model = BinaryData.fromObject(model).toObject(ClusterPoolResourcePropertiesComputeProfile.class);
        Assertions.assertEquals("xwczbyscnp", model.vmSize());
    }
}