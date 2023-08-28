// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.networkcloud.NetworkCloudManager;
import com.azure.resourcemanager.networkcloud.models.OperationStatusResult;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class VirtualMachinesReimageMockTests {
    @Test
    public void testReimage() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"id\":\"hjqjpv\",\"resourceId\":\"ihxjtgzgtai\",\"name\":\"b\",\"status\":\"groigbsfsgsa\",\"percentComplete\":4.055786,\"startTime\":\"2021-02-21T16:42:49Z\",\"endTime\":\"2021-10-07T09:17:53Z\",\"operations\":[{\"id\":\"qlxspmrj\",\"resourceId\":\"ryldsxeb\",\"name\":\"sxrznmg\",\"status\":\"daluy\",\"percentComplete\":21.716427,\"startTime\":\"2021-03-17T07:43:50Z\",\"endTime\":\"2021-10-19T14:14:31Z\",\"operations\":[{\"id\":\"uerbgpxebjl\",\"resourceId\":\"caytujraxdtpryj\",\"name\":\"tnsewou\",\"status\":\"ly\",\"percentComplete\":78.11937,\"startTime\":\"2021-09-28T10:44:47Z\",\"endTime\":\"2021-11-21T20:30:05Z\",\"operations\":[{\"status\":\"kepo\"},{\"status\":\"ehqqylm\"}]}]}]}";

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

        NetworkCloudManager manager =
            NetworkCloudManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        OperationStatusResult response =
            manager.virtualMachines().reimage("ivznllas", "k", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("hjqjpv", response.id());
        Assertions.assertEquals("b", response.name());
        Assertions.assertEquals("groigbsfsgsa", response.status());
        Assertions.assertEquals(4.055786F, response.percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-21T16:42:49Z"), response.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-07T09:17:53Z"), response.endTime());
        Assertions.assertEquals("qlxspmrj", response.operations().get(0).id());
        Assertions.assertEquals("sxrznmg", response.operations().get(0).name());
        Assertions.assertEquals("daluy", response.operations().get(0).status());
        Assertions.assertEquals(21.716427F, response.operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-17T07:43:50Z"), response.operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-19T14:14:31Z"), response.operations().get(0).endTime());
        Assertions.assertEquals("uerbgpxebjl", response.operations().get(0).operations().get(0).id());
        Assertions.assertEquals("tnsewou", response.operations().get(0).operations().get(0).name());
        Assertions.assertEquals("ly", response.operations().get(0).operations().get(0).status());
        Assertions.assertEquals(78.11937F, response.operations().get(0).operations().get(0).percentComplete());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-09-28T10:44:47Z"),
                response.operations().get(0).operations().get(0).startTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-11-21T20:30:05Z"),
                response.operations().get(0).operations().get(0).endTime());
        Assertions.assertEquals("kepo", response.operations().get(0).operations().get(0).operations().get(0).status());
    }
}