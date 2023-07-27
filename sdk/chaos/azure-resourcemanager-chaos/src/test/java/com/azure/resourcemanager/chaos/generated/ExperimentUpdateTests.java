// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.chaos.models.ExperimentUpdate;
import com.azure.resourcemanager.chaos.models.ResourceIdentity;
import com.azure.resourcemanager.chaos.models.ResourceIdentityType;
import com.azure.resourcemanager.chaos.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ExperimentUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExperimentUpdate model =
            BinaryData
                .fromString(
                    "{\"identity\":{\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"it\":{\"principalId\":\"c1000e40-cee2-4311-b04e-e94747e05df2\",\"clientId\":\"147b9e75-fe91-49c9-b34f-5121d73c6b63\"},\"jawgqwg\":{\"principalId\":\"ab61a5da-1f68-4580-84f9-7d0dbb3c39a1\",\"clientId\":\"8744a7df-7546-485d-b3a1-c096cb036fad\"}},\"principalId\":\"ni\",\"tenantId\":\"x\"}}")
                .toObject(ExperimentUpdate.class);
        Assertions.assertEquals(ResourceIdentityType.USER_ASSIGNED, model.identity().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExperimentUpdate model =
            new ExperimentUpdate()
                .withIdentity(
                    new ResourceIdentity()
                        .withType(ResourceIdentityType.USER_ASSIGNED)
                        .withUserAssignedIdentities(
                            mapOf("it", new UserAssignedIdentity(), "jawgqwg", new UserAssignedIdentity())));
        model = BinaryData.fromObject(model).toObject(ExperimentUpdate.class);
        Assertions.assertEquals(ResourceIdentityType.USER_ASSIGNED, model.identity().type());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}