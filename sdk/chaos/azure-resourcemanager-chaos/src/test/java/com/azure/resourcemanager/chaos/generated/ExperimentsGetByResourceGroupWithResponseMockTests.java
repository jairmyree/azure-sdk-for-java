// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.chaos.ChaosManager;
import com.azure.resourcemanager.chaos.models.Experiment;
import com.azure.resourcemanager.chaos.models.ResourceIdentityType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ExperimentsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"identity\":{\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"hojujbypelmcuv\":{\"principalId\":\"9151e949-2c21-426f-abce-12c7400f217f\",\"clientId\":\"89c26f2a-1891-48ed-a922-34da940492e4\"},\"bjx\":{\"principalId\":\"21310cad-a62d-4c74-a0b6-3431369872d4\",\"clientId\":\"84b97f4c-56da-4844-b613-5ce0881ac388\"},\"n\":{\"principalId\":\"4337f343-9ed0-4d83-b3ac-d1427c752f37\",\"clientId\":\"6f3e5a61-5997-47a6-a0d9-6bd2ba0ac851\"}},\"principalId\":\"r\",\"tenantId\":\"o\"},\"properties\":{\"steps\":[{\"name\":\"ttpkiwkkbnujrywv\",\"branches\":[{\"name\":\"lbfpncurd\",\"actions\":[]}]}],\"selectors\":[{\"type\":\"Selector\",\"id\":\"wiithtywub\",\"filter\":{\"type\":\"Filter\"},\"\":{\"qknfd\":\"datah\",\"ihxumwctondzj\":\"datatwjchrdg\",\"fdlwg\":\"datauu\",\"gseinq\":\"dataytsbwtovv\"}}],\"startOnCreation\":true},\"location\":\"fxqknpirgneptt\",\"tags\":{\"mqnrojlpijnkr\":\"sniffc\",\"zronasxift\":\"frddhcrati\"},\"id\":\"zq\",\"name\":\"zh\",\"type\":\"tw\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        ChaosManager manager =
            ChaosManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        Experiment response =
            manager
                .experiments()
                .getByResourceGroupWithResponse("qncygupkvi", "mdscwxqupev", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("fxqknpirgneptt", response.location());
        Assertions.assertEquals("sniffc", response.tags().get("mqnrojlpijnkr"));
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, response.identity().type());
        Assertions.assertEquals("ttpkiwkkbnujrywv", response.steps().get(0).name());
        Assertions.assertEquals("lbfpncurd", response.steps().get(0).branches().get(0).name());
        Assertions.assertEquals("wiithtywub", response.selectors().get(0).id());
        Assertions.assertEquals(true, response.startOnCreation());
    }
}