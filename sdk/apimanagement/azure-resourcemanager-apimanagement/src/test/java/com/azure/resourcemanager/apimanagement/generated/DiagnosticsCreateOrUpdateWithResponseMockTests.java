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
import com.azure.resourcemanager.apimanagement.fluent.models.DiagnosticContractInner;
import com.azure.resourcemanager.apimanagement.models.AlwaysLog;
import com.azure.resourcemanager.apimanagement.models.BodyDiagnosticSettings;
import com.azure.resourcemanager.apimanagement.models.DataMasking;
import com.azure.resourcemanager.apimanagement.models.DataMaskingEntity;
import com.azure.resourcemanager.apimanagement.models.DiagnosticContract;
import com.azure.resourcemanager.apimanagement.models.HttpCorrelationProtocol;
import com.azure.resourcemanager.apimanagement.models.HttpMessageDiagnostic;
import com.azure.resourcemanager.apimanagement.models.OperationNameFormat;
import com.azure.resourcemanager.apimanagement.models.PipelineDiagnosticSettings;
import com.azure.resourcemanager.apimanagement.models.SamplingSettings;
import com.azure.resourcemanager.apimanagement.models.SamplingType;
import com.azure.resourcemanager.apimanagement.models.Verbosity;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class DiagnosticsCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"alwaysLog\":\"allErrors\",\"loggerId\":\"vdsqxkjwd\",\"sampling\":{\"samplingType\":\"fixed\",\"percentage\":54.326531348795584},\"frontend\":{\"request\":{\"headers\":[\"ux\"],\"body\":{\"bytes\":1015703042},\"dataMasking\":{\"queryParams\":[{}],\"headers\":[{},{},{}]}},\"response\":{\"headers\":[\"kvandbpmr\"],\"body\":{\"bytes\":1962103909},\"dataMasking\":{\"queryParams\":[{},{},{},{}],\"headers\":[{}]}}},\"backend\":{\"request\":{\"headers\":[\"waeztt\"],\"body\":{\"bytes\":1619705369},\"dataMasking\":{\"queryParams\":[{},{}],\"headers\":[{}]}},\"response\":{\"headers\":[\"lgyfybd\",\"vk\",\"lrzhshhkbchcazk\",\"djthprgfwhf\"],\"body\":{\"bytes\":1498795650},\"dataMasking\":{\"queryParams\":[{}],\"headers\":[{},{}]}}},\"logClientIp\":true,\"httpCorrelationProtocol\":\"Legacy\",\"verbosity\":\"information\",\"operationNameFormat\":\"Url\",\"metrics\":false},\"id\":\"rsddcuqddldaoyv\",\"name\":\"ztqe\",\"type\":\"qjojesxjht\"}";

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
                .diagnostics()
                .createOrUpdateWithResponse(
                    "z",
                    "t",
                    "z",
                    new DiagnosticContractInner()
                        .withAlwaysLog(AlwaysLog.ALL_ERRORS)
                        .withLoggerId("tkxncwdytnlr")
                        .withSampling(
                            new SamplingSettings()
                                .withSamplingType(SamplingType.FIXED)
                                .withPercentage(98.99965604066313D))
                        .withFrontend(
                            new PipelineDiagnosticSettings()
                                .withRequest(
                                    new HttpMessageDiagnostic()
                                        .withHeaders(Arrays.asList("vnhwwkrmqe", "rhhafqfud", "yziruqvgnjxiakg"))
                                        .withBody(new BodyDiagnosticSettings().withBytes(586434965))
                                        .withDataMasking(
                                            new DataMasking()
                                                .withQueryParams(Arrays.asList(new DataMaskingEntity()))
                                                .withHeaders(
                                                    Arrays
                                                        .asList(
                                                            new DataMaskingEntity(),
                                                            new DataMaskingEntity(),
                                                            new DataMaskingEntity()))))
                                .withResponse(
                                    new HttpMessageDiagnostic()
                                        .withHeaders(Arrays.asList("uyugmb", "dcv", "loxtvq"))
                                        .withBody(new BodyDiagnosticSettings().withBytes(2111000190))
                                        .withDataMasking(
                                            new DataMasking()
                                                .withQueryParams(
                                                    Arrays
                                                        .asList(
                                                            new DataMaskingEntity(),
                                                            new DataMaskingEntity(),
                                                            new DataMaskingEntity()))
                                                .withHeaders(
                                                    Arrays
                                                        .asList(
                                                            new DataMaskingEntity(),
                                                            new DataMaskingEntity(),
                                                            new DataMaskingEntity(),
                                                            new DataMaskingEntity())))))
                        .withBackend(
                            new PipelineDiagnosticSettings()
                                .withRequest(
                                    new HttpMessageDiagnostic()
                                        .withHeaders(Arrays.asList("enkpsvokkya"))
                                        .withBody(new BodyDiagnosticSettings().withBytes(1406877910))
                                        .withDataMasking(
                                            new DataMasking()
                                                .withQueryParams(
                                                    Arrays
                                                        .asList(
                                                            new DataMaskingEntity(),
                                                            new DataMaskingEntity(),
                                                            new DataMaskingEntity(),
                                                            new DataMaskingEntity()))
                                                .withHeaders(Arrays.asList(new DataMaskingEntity()))))
                                .withResponse(
                                    new HttpMessageDiagnostic()
                                        .withHeaders(
                                            Arrays.asList("nkxaso", "afegazhlrdx", "cpautfzptrcdzy", "rtffvpkdxcy"))
                                        .withBody(new BodyDiagnosticSettings().withBytes(1532267941))
                                        .withDataMasking(
                                            new DataMasking()
                                                .withQueryParams(
                                                    Arrays
                                                        .asList(
                                                            new DataMaskingEntity(),
                                                            new DataMaskingEntity(),
                                                            new DataMaskingEntity(),
                                                            new DataMaskingEntity()))
                                                .withHeaders(
                                                    Arrays
                                                        .asList(
                                                            new DataMaskingEntity(),
                                                            new DataMaskingEntity(),
                                                            new DataMaskingEntity(),
                                                            new DataMaskingEntity())))))
                        .withLogClientIp(true)
                        .withHttpCorrelationProtocol(HttpCorrelationProtocol.LEGACY)
                        .withVerbosity(Verbosity.ERROR)
                        .withOperationNameFormat(OperationNameFormat.URL)
                        .withMetrics(true),
                    "wgssdquupirnb",
                    com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals(AlwaysLog.ALL_ERRORS, response.alwaysLog());
        Assertions.assertEquals("vdsqxkjwd", response.loggerId());
        Assertions.assertEquals(SamplingType.FIXED, response.sampling().samplingType());
        Assertions.assertEquals(54.326531348795584D, response.sampling().percentage());
        Assertions.assertEquals("ux", response.frontend().request().headers().get(0));
        Assertions.assertEquals(1015703042, response.frontend().request().body().bytes());
        Assertions.assertEquals("kvandbpmr", response.frontend().response().headers().get(0));
        Assertions.assertEquals(1962103909, response.frontend().response().body().bytes());
        Assertions.assertEquals("waeztt", response.backend().request().headers().get(0));
        Assertions.assertEquals(1619705369, response.backend().request().body().bytes());
        Assertions.assertEquals("lgyfybd", response.backend().response().headers().get(0));
        Assertions.assertEquals(1498795650, response.backend().response().body().bytes());
        Assertions.assertEquals(true, response.logClientIp());
        Assertions.assertEquals(HttpCorrelationProtocol.LEGACY, response.httpCorrelationProtocol());
        Assertions.assertEquals(Verbosity.INFORMATION, response.verbosity());
        Assertions.assertEquals(OperationNameFormat.URL, response.operationNameFormat());
        Assertions.assertEquals(false, response.metrics());
    }
}