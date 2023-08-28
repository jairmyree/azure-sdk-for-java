// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.dynatrace.DynatraceManager;
import com.azure.resourcemanager.dynatrace.models.DynatraceSingleSignOnResource;
import com.azure.resourcemanager.dynatrace.models.SingleSignOnStates;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SingleSignOnsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"singleSignOnState\":\"Initial\",\"enterpriseAppId\":\"ttouwaboekqvkel\",\"singleSignOnUrl\":\"mvb\",\"aadDomains\":[\"jsflhhcaalnjix\",\"sxyawjoyaqcs\",\"yjpkiidzyexz\",\"eli\"],\"provisioningState\":\"Accepted\"},\"id\":\"ztfolhbnxk\",\"name\":\"alaulppggdtpnapn\",\"type\":\"iropuhpigvpgylg\"}]}";

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

        DynatraceManager manager =
            DynatraceManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<DynatraceSingleSignOnResource> response =
            manager.singleSignOns().list("zuhkfpbsjyof", "xl", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(SingleSignOnStates.INITIAL, response.iterator().next().singleSignOnState());
        Assertions.assertEquals("ttouwaboekqvkel", response.iterator().next().enterpriseAppId());
        Assertions.assertEquals("mvb", response.iterator().next().singleSignOnUrl());
        Assertions.assertEquals("jsflhhcaalnjix", response.iterator().next().aadDomains().get(0));
    }
}