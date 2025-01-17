// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.AuthenticationType;
import com.azure.resourcemanager.iothub.models.ManagedIdentity;
import com.azure.resourcemanager.iothub.models.StorageEndpointProperties;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class StorageEndpointPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageEndpointProperties model = BinaryData.fromString(
            "{\"sasTtlAsIso8601\":\"PT189H2M8S\",\"connectionString\":\"ue\",\"containerName\":\"xibxujwbhqwalm\",\"authenticationType\":\"keyBased\",\"identity\":{\"userAssignedIdentity\":\"aepdkzjanc\"}}")
            .toObject(StorageEndpointProperties.class);
        Assertions.assertEquals(Duration.parse("PT189H2M8S"), model.sasTtlAsIso8601());
        Assertions.assertEquals("ue", model.connectionString());
        Assertions.assertEquals("xibxujwbhqwalm", model.containerName());
        Assertions.assertEquals(AuthenticationType.KEY_BASED, model.authenticationType());
        Assertions.assertEquals("aepdkzjanc", model.identity().userAssignedIdentity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageEndpointProperties model
            = new StorageEndpointProperties().withSasTtlAsIso8601(Duration.parse("PT189H2M8S"))
                .withConnectionString("ue")
                .withContainerName("xibxujwbhqwalm")
                .withAuthenticationType(AuthenticationType.KEY_BASED)
                .withIdentity(new ManagedIdentity().withUserAssignedIdentity("aepdkzjanc"));
        model = BinaryData.fromObject(model).toObject(StorageEndpointProperties.class);
        Assertions.assertEquals(Duration.parse("PT189H2M8S"), model.sasTtlAsIso8601());
        Assertions.assertEquals("ue", model.connectionString());
        Assertions.assertEquals("xibxujwbhqwalm", model.containerName());
        Assertions.assertEquals(AuthenticationType.KEY_BASED, model.authenticationType());
        Assertions.assertEquals("aepdkzjanc", model.identity().userAssignedIdentity());
    }
}
