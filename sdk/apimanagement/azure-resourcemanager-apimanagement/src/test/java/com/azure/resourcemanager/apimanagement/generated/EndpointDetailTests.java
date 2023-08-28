// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.EndpointDetail;
import org.junit.jupiter.api.Assertions;

public final class EndpointDetailTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EndpointDetail model =
            BinaryData.fromString("{\"port\":255809617,\"region\":\"hzic\"}").toObject(EndpointDetail.class);
        Assertions.assertEquals(255809617, model.port());
        Assertions.assertEquals("hzic", model.region());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EndpointDetail model = new EndpointDetail().withPort(255809617).withRegion("hzic");
        model = BinaryData.fromObject(model).toObject(EndpointDetail.class);
        Assertions.assertEquals(255809617, model.port());
        Assertions.assertEquals("hzic", model.region());
    }
}