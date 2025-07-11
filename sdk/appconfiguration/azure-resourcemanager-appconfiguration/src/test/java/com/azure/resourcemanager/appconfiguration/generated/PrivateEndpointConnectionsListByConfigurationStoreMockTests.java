// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.appconfiguration.AppConfigurationManager;
import com.azure.resourcemanager.appconfiguration.models.ConnectionStatus;
import com.azure.resourcemanager.appconfiguration.models.PrivateEndpointConnection;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsListByConfigurationStoreMockTests {
    @Test
    public void testListByConfigurationStore() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Canceled\",\"privateEndpoint\":{\"id\":\"glrvimjwosytxi\"},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"fcktqumiekke\",\"actionsRequired\":\"None\"}},\"id\":\"khly\",\"name\":\"jhdgqggebdunyga\",\"type\":\"qidbqfatpxllrxcy\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AppConfigurationManager manager = AppConfigurationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<PrivateEndpointConnection> response = manager.privateEndpointConnections()
            .listByConfigurationStore("ddxbjhwuaanoz", "osphyoul", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("glrvimjwosytxi", response.iterator().next().privateEndpoint().id());
        Assertions.assertEquals(ConnectionStatus.PENDING,
            response.iterator().next().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("fcktqumiekke",
            response.iterator().next().privateLinkServiceConnectionState().description());
    }
}
