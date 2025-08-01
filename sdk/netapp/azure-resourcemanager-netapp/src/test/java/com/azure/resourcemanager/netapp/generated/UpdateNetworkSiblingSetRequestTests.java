// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.NetworkFeatures;
import com.azure.resourcemanager.netapp.models.UpdateNetworkSiblingSetRequest;
import org.junit.jupiter.api.Assertions;

public final class UpdateNetworkSiblingSetRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateNetworkSiblingSetRequest model = BinaryData.fromString(
            "{\"networkSiblingSetId\":\"fuwutttxf\",\"subnetId\":\"jrbirphxepcyv\",\"networkSiblingSetStateId\":\"hfnljkyq\",\"networkFeatures\":\"Basic\"}")
            .toObject(UpdateNetworkSiblingSetRequest.class);
        Assertions.assertEquals("fuwutttxf", model.networkSiblingSetId());
        Assertions.assertEquals("jrbirphxepcyv", model.subnetId());
        Assertions.assertEquals("hfnljkyq", model.networkSiblingSetStateId());
        Assertions.assertEquals(NetworkFeatures.BASIC, model.networkFeatures());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateNetworkSiblingSetRequest model = new UpdateNetworkSiblingSetRequest().withNetworkSiblingSetId("fuwutttxf")
            .withSubnetId("jrbirphxepcyv")
            .withNetworkSiblingSetStateId("hfnljkyq")
            .withNetworkFeatures(NetworkFeatures.BASIC);
        model = BinaryData.fromObject(model).toObject(UpdateNetworkSiblingSetRequest.class);
        Assertions.assertEquals("fuwutttxf", model.networkSiblingSetId());
        Assertions.assertEquals("jrbirphxepcyv", model.subnetId());
        Assertions.assertEquals("hfnljkyq", model.networkSiblingSetStateId());
        Assertions.assertEquals(NetworkFeatures.BASIC, model.networkFeatures());
    }
}
