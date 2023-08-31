// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridconnectivity.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridconnectivity.fluent.models.EndpointResourceInner;
import com.azure.resourcemanager.hybridconnectivity.models.EndpointProperties;
import com.azure.resourcemanager.hybridconnectivity.models.EndpointsList;
import com.azure.resourcemanager.hybridconnectivity.models.Type;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class EndpointsListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EndpointsList model =
            BinaryData
                .fromString(
                    "{\"nextLink\":\"a\",\"value\":[{\"properties\":{\"type\":\"default\",\"resourceId\":\"hab\",\"provisioningState\":\"pikxwczbyscnpqxu\"},\"id\":\"vyq\",\"name\":\"iwbybrkxvdumjg\",\"type\":\"tfwvukxgaudc\"}]}")
                .toObject(EndpointsList.class);
        Assertions.assertEquals("a", model.nextLink());
        Assertions.assertEquals(Type.DEFAULT, model.value().get(0).properties().type());
        Assertions.assertEquals("hab", model.value().get(0).properties().resourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EndpointsList model =
            new EndpointsList()
                .withNextLink("a")
                .withValue(
                    Arrays
                        .asList(
                            new EndpointResourceInner()
                                .withProperties(
                                    new EndpointProperties().withType(Type.DEFAULT).withResourceId("hab"))));
        model = BinaryData.fromObject(model).toObject(EndpointsList.class);
        Assertions.assertEquals("a", model.nextLink());
        Assertions.assertEquals(Type.DEFAULT, model.value().get(0).properties().type());
        Assertions.assertEquals("hab", model.value().get(0).properties().resourceId());
    }
}