// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.apimanagement.ApiManagementManager;
import com.azure.resourcemanager.apimanagement.models.AlwaysLog;
import com.azure.resourcemanager.apimanagement.models.DiagnosticContract;
import com.azure.resourcemanager.apimanagement.models.HttpCorrelationProtocol;
import com.azure.resourcemanager.apimanagement.models.OperationNameFormat;
import com.azure.resourcemanager.apimanagement.models.SamplingType;
import com.azure.resourcemanager.apimanagement.models.Verbosity;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ApiDiagnosticsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"alwaysLog\":\"allErrors\",\"loggerId\":\"rjvqxvwkiocxoer\",\"sampling\":{\"samplingType\":\"fixed\",\"percentage\":85.4488689271105},\"frontend\":{\"request\":{\"headers\":[\"lrlqxbctatezyozd\",\"cqqnlsjxcsc\",\"it\",\"dmra\"],\"body\":{\"bytes\":242793298},\"dataMasking\":{\"queryParams\":[{},{},{}],\"headers\":[{},{},{},{}]}},\"response\":{\"headers\":[\"vmah\"],\"body\":{\"bytes\":1715303013},\"dataMasking\":{\"queryParams\":[{},{}],\"headers\":[{},{},{}]}}},\"backend\":{\"request\":{\"headers\":[\"hyzhrcqdfwbifn\"],\"body\":{\"bytes\":1653699527},\"dataMasking\":{\"queryParams\":[{},{}],\"headers\":[{},{},{},{}]}},\"response\":{\"headers\":[\"c\",\"mmynbrpelpfi\",\"tezgxmpe\"],\"body\":{\"bytes\":1648834541},\"dataMasking\":{\"queryParams\":[{}],\"headers\":[{},{},{},{}]}}},\"logClientIp\":false,\"httpCorrelationProtocol\":\"W3C\",\"verbosity\":\"verbose\",\"operationNameFormat\":\"Url\",\"metrics\":false},\"id\":\"tllxsw\",\"name\":\"dapsmir\",\"type\":\"nrijefmrtwxcevds\"}";

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

        DiagnosticContract response =
            manager
                .apiDiagnostics()
                .getWithResponse("mrs", "ydl", "prel", "xfkz", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals(AlwaysLog.ALL_ERRORS, response.alwaysLog());
        Assertions.assertEquals("rjvqxvwkiocxoer", response.loggerId());
        Assertions.assertEquals(SamplingType.FIXED, response.sampling().samplingType());
        Assertions.assertEquals(85.4488689271105D, response.sampling().percentage());
        Assertions.assertEquals("lrlqxbctatezyozd", response.frontend().request().headers().get(0));
        Assertions.assertEquals(242793298, response.frontend().request().body().bytes());
        Assertions.assertEquals("vmah", response.frontend().response().headers().get(0));
        Assertions.assertEquals(1715303013, response.frontend().response().body().bytes());
        Assertions.assertEquals("hyzhrcqdfwbifn", response.backend().request().headers().get(0));
        Assertions.assertEquals(1653699527, response.backend().request().body().bytes());
        Assertions.assertEquals("c", response.backend().response().headers().get(0));
        Assertions.assertEquals(1648834541, response.backend().response().body().bytes());
        Assertions.assertEquals(false, response.logClientIp());
        Assertions.assertEquals(HttpCorrelationProtocol.W3C, response.httpCorrelationProtocol());
        Assertions.assertEquals(Verbosity.VERBOSE, response.verbosity());
        Assertions.assertEquals(OperationNameFormat.URL, response.operationNameFormat());
        Assertions.assertEquals(false, response.metrics());
    }
}