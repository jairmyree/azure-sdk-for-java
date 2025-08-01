// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.providerhub.models.AdditionalAuthorization;
import org.junit.jupiter.api.Assertions;

public final class AdditionalAuthorizationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AdditionalAuthorization model
            = BinaryData.fromString("{\"applicationId\":\"ujitcjcz\",\"roleDefinitionId\":\"evndh\"}")
                .toObject(AdditionalAuthorization.class);
        Assertions.assertEquals("ujitcjcz", model.applicationId());
        Assertions.assertEquals("evndh", model.roleDefinitionId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AdditionalAuthorization model
            = new AdditionalAuthorization().withApplicationId("ujitcjcz").withRoleDefinitionId("evndh");
        model = BinaryData.fromObject(model).toObject(AdditionalAuthorization.class);
        Assertions.assertEquals("ujitcjcz", model.applicationId());
        Assertions.assertEquals("evndh", model.roleDefinitionId());
    }
}
