// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.apimanagement.ApiManagementManager;
import com.azure.resourcemanager.apimanagement.models.ReportRecordContract;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ReportsListBySubscriptionMockTests {
    @Test
    public void testListBySubscription() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"name\":\"nylfutgbpw\",\"timestamp\":\"2021-08-02T08:09:42Z\",\"interval\":\"xtvpiultybwwmjrs\",\"country\":\"jalorxeegiczr\",\"region\":\"e\",\"zip\":\"cvndihkph\",\"userId\":\"gkk\",\"productId\":\"wmjmgs\",\"apiId\":\"w\",\"operationId\":\"kuqgneorqtrkxei\",\"apiRegion\":\"vaagnzbkqqbjcdau\",\"subscriptionId\":\"omzvgjynuwcqu\",\"callCountSuccess\":1633800070,\"callCountBlocked\":295470034,\"callCountFailed\":1699860039,\"callCountOther\":883095381,\"callCountTotal\":632579536,\"bandwidth\":1566438352407581268,\"cacheHitCount\":1434576654,\"cacheMissCount\":392526341,\"apiTimeAvg\":33.93368095736463,\"apiTimeMin\":66.02557310058798,\"apiTimeMax\":37.92054945821308,\"serviceTimeAvg\":35.232112873233724,\"serviceTimeMin\":64.13687679854719,\"serviceTimeMax\":69.85969849730232}]}";

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

        ApiManagementManager manager =
            ApiManagementManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ReportRecordContract> response =
            manager
                .reports()
                .listBySubscription(
                    "yz", "zvhyo", "ddveqy", 1769591974, 1715620177, "vzpqrxsifixo", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("nylfutgbpw", response.iterator().next().name());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-02T08:09:42Z"), response.iterator().next().timestamp());
        Assertions.assertEquals("xtvpiultybwwmjrs", response.iterator().next().interval());
        Assertions.assertEquals("jalorxeegiczr", response.iterator().next().country());
        Assertions.assertEquals("e", response.iterator().next().region());
        Assertions.assertEquals("cvndihkph", response.iterator().next().zip());
        Assertions.assertEquals("w", response.iterator().next().apiId());
        Assertions.assertEquals("kuqgneorqtrkxei", response.iterator().next().operationId());
        Assertions.assertEquals("vaagnzbkqqbjcdau", response.iterator().next().apiRegion());
        Assertions.assertEquals("omzvgjynuwcqu", response.iterator().next().subscriptionId());
        Assertions.assertEquals(1633800070, response.iterator().next().callCountSuccess());
        Assertions.assertEquals(295470034, response.iterator().next().callCountBlocked());
        Assertions.assertEquals(1699860039, response.iterator().next().callCountFailed());
        Assertions.assertEquals(883095381, response.iterator().next().callCountOther());
        Assertions.assertEquals(632579536, response.iterator().next().callCountTotal());
        Assertions.assertEquals(1566438352407581268L, response.iterator().next().bandwidth());
        Assertions.assertEquals(1434576654, response.iterator().next().cacheHitCount());
        Assertions.assertEquals(392526341, response.iterator().next().cacheMissCount());
        Assertions.assertEquals(33.93368095736463D, response.iterator().next().apiTimeAvg());
        Assertions.assertEquals(66.02557310058798D, response.iterator().next().apiTimeMin());
        Assertions.assertEquals(37.92054945821308D, response.iterator().next().apiTimeMax());
        Assertions.assertEquals(35.232112873233724D, response.iterator().next().serviceTimeAvg());
        Assertions.assertEquals(64.13687679854719D, response.iterator().next().serviceTimeMin());
        Assertions.assertEquals(69.85969849730232D, response.iterator().next().serviceTimeMax());
    }
}