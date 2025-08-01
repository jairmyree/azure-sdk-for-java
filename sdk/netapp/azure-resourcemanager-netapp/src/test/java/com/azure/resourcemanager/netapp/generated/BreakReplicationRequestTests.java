// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.BreakReplicationRequest;
import org.junit.jupiter.api.Assertions;

public final class BreakReplicationRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BreakReplicationRequest model
            = BinaryData.fromString("{\"forceBreakReplication\":true}").toObject(BreakReplicationRequest.class);
        Assertions.assertTrue(model.forceBreakReplication());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BreakReplicationRequest model = new BreakReplicationRequest().withForceBreakReplication(true);
        model = BinaryData.fromObject(model).toObject(BreakReplicationRequest.class);
        Assertions.assertTrue(model.forceBreakReplication());
    }
}
