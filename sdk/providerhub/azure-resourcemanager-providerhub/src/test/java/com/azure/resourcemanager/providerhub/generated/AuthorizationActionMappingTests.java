// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.providerhub.models.AuthorizationActionMapping;
import org.junit.jupiter.api.Assertions;

public final class AuthorizationActionMappingTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AuthorizationActionMapping model = BinaryData.fromString("{\"original\":\"n\",\"desired\":\"lexxbczwtru\"}")
            .toObject(AuthorizationActionMapping.class);
        Assertions.assertEquals("n", model.original());
        Assertions.assertEquals("lexxbczwtru", model.desired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AuthorizationActionMapping model
            = new AuthorizationActionMapping().withOriginal("n").withDesired("lexxbczwtru");
        model = BinaryData.fromObject(model).toObject(AuthorizationActionMapping.class);
        Assertions.assertEquals("n", model.original());
        Assertions.assertEquals("lexxbczwtru", model.desired());
    }
}
