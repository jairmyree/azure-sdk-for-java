// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.ArmIdWrapper;
import com.azure.resourcemanager.apimanagement.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.apimanagement.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.apimanagement.models.RemotePrivateEndpointConnectionWrapper;
import org.junit.jupiter.api.Assertions;

public final class RemotePrivateEndpointConnectionWrapperTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RemotePrivateEndpointConnectionWrapper model =
            BinaryData
                .fromString(
                    "{\"id\":\"auyqnj\",\"name\":\"hmocgjshg\",\"type\":\"a\",\"properties\":{\"privateEndpoint\":{\"id\":\"ixq\"},\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"jkyb\",\"actionsRequired\":\"rcl\"},\"provisioningState\":\"tzqnrbctbhpjh\",\"groupIds\":[\"vrdnyeitaneq\",\"dynzjahwr\",\"uomzczfki\",\"eevsa\"]}}")
                .toObject(RemotePrivateEndpointConnectionWrapper.class);
        Assertions.assertEquals("auyqnj", model.id());
        Assertions.assertEquals("hmocgjshg", model.name());
        Assertions.assertEquals("a", model.type());
        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.APPROVED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("jkyb", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("rcl", model.privateLinkServiceConnectionState().actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RemotePrivateEndpointConnectionWrapper model =
            new RemotePrivateEndpointConnectionWrapper()
                .withId("auyqnj")
                .withName("hmocgjshg")
                .withType("a")
                .withPrivateEndpoint(new ArmIdWrapper())
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState()
                        .withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                        .withDescription("jkyb")
                        .withActionsRequired("rcl"));
        model = BinaryData.fromObject(model).toObject(RemotePrivateEndpointConnectionWrapper.class);
        Assertions.assertEquals("auyqnj", model.id());
        Assertions.assertEquals("hmocgjshg", model.name());
        Assertions.assertEquals("a", model.type());
        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.APPROVED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("jkyb", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("rcl", model.privateLinkServiceConnectionState().actionsRequired());
    }
}