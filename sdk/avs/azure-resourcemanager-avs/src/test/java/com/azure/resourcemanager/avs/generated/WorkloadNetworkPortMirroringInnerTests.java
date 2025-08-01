// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.WorkloadNetworkPortMirroringInner;
import com.azure.resourcemanager.avs.models.PortMirroringDirectionEnum;
import org.junit.jupiter.api.Assertions;

public final class WorkloadNetworkPortMirroringInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkloadNetworkPortMirroringInner model = BinaryData.fromString(
            "{\"properties\":{\"displayName\":\"ndei\",\"direction\":\"EGRESS\",\"source\":\"npzaoq\",\"destination\":\"hrhcffcyddglmjth\",\"status\":\"SUCCESS\",\"provisioningState\":\"Canceled\",\"revision\":7409955722062206108},\"id\":\"xmqci\",\"name\":\"q\",\"type\":\"hkh\"}")
            .toObject(WorkloadNetworkPortMirroringInner.class);
        Assertions.assertEquals("ndei", model.displayName());
        Assertions.assertEquals(PortMirroringDirectionEnum.EGRESS, model.direction());
        Assertions.assertEquals("npzaoq", model.source());
        Assertions.assertEquals("hrhcffcyddglmjth", model.destination());
        Assertions.assertEquals(7409955722062206108L, model.revision());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkloadNetworkPortMirroringInner model = new WorkloadNetworkPortMirroringInner().withDisplayName("ndei")
            .withDirection(PortMirroringDirectionEnum.EGRESS)
            .withSource("npzaoq")
            .withDestination("hrhcffcyddglmjth")
            .withRevision(7409955722062206108L);
        model = BinaryData.fromObject(model).toObject(WorkloadNetworkPortMirroringInner.class);
        Assertions.assertEquals("ndei", model.displayName());
        Assertions.assertEquals(PortMirroringDirectionEnum.EGRESS, model.direction());
        Assertions.assertEquals("npzaoq", model.source());
        Assertions.assertEquals("hrhcffcyddglmjth", model.destination());
        Assertions.assertEquals(7409955722062206108L, model.revision());
    }
}
