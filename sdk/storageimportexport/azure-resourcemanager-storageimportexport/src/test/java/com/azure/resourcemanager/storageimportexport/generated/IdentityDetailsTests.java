// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageimportexport.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storageimportexport.models.IdentityDetails;
import com.azure.resourcemanager.storageimportexport.models.IdentityType;
import org.junit.jupiter.api.Assertions;

public final class IdentityDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IdentityDetails model
            = BinaryData.fromString("{\"type\":\"None\",\"principalId\":\"wrwjfeu\",\"tenantId\":\"hutje\"}")
                .toObject(IdentityDetails.class);
        Assertions.assertEquals(IdentityType.NONE, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IdentityDetails model = new IdentityDetails().withType(IdentityType.NONE);
        model = BinaryData.fromObject(model).toObject(IdentityDetails.class);
        Assertions.assertEquals(IdentityType.NONE, model.type());
    }
}
