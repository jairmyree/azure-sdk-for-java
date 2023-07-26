// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.models.SimStaticIpPropertiesStaticIp;
import org.junit.jupiter.api.Assertions;

public final class SimStaticIpPropertiesStaticIpTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SimStaticIpPropertiesStaticIp model =
            BinaryData.fromString("{\"ipv4Address\":\"umrtwnawjsl\"}").toObject(SimStaticIpPropertiesStaticIp.class);
        Assertions.assertEquals("umrtwnawjsl", model.ipv4Address());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SimStaticIpPropertiesStaticIp model = new SimStaticIpPropertiesStaticIp().withIpv4Address("umrtwnawjsl");
        model = BinaryData.fromObject(model).toObject(SimStaticIpPropertiesStaticIp.class);
        Assertions.assertEquals("umrtwnawjsl", model.ipv4Address());
    }
}