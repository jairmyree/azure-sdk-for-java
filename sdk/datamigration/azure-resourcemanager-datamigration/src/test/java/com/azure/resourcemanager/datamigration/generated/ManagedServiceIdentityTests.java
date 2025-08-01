// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.models.ManagedServiceIdentity;
import com.azure.resourcemanager.datamigration.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.datamigration.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ManagedServiceIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedServiceIdentity model = BinaryData.fromString(
            "{\"principalId\":\"d59dbd43-1e47-4a4f-a2f9-6d2775a4aa62\",\"tenantId\":\"3644c58e-402c-405a-b762-cf113bdee901\",\"type\":\"None\",\"userAssignedIdentities\":{\"ceoveilovno\":{\"principalId\":\"d6cf5445-86a1-4c1e-a010-a249873f8a39\",\"clientId\":\"bd7d1f88-2b4b-4261-bf0b-682713d7a7c7\"},\"jfcn\":{\"principalId\":\"6998d6ed-1114-4905-8911-6660b790b3f9\",\"clientId\":\"b57bc516-9ba4-4b4b-ad58-fb65ea3afd7d\"},\"cn\":{\"principalId\":\"f6e5b52a-4d5f-4dee-b95a-a02e12102677\",\"clientId\":\"7ee554f3-fe82-44c1-9d01-55af6ef66637\"}}}")
            .toObject(ManagedServiceIdentity.class);
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedServiceIdentity model = new ManagedServiceIdentity().withType(ManagedServiceIdentityType.NONE)
            .withUserAssignedIdentities(mapOf("ceoveilovno", new UserAssignedIdentity(), "jfcn",
                new UserAssignedIdentity(), "cn", new UserAssignedIdentity()));
        model = BinaryData.fromObject(model).toObject(ManagedServiceIdentity.class);
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, model.type());
    }

    // Use "Map.of" if available
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
