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
import com.azure.resourcemanager.dynatrace.models.SendAadLogsStatus;
import com.azure.resourcemanager.dynatrace.models.SendActivityLogsStatus;
import com.azure.resourcemanager.dynatrace.models.SendSubscriptionLogsStatus;
import com.azure.resourcemanager.dynatrace.models.SendingMetricsStatus;
import com.azure.resourcemanager.dynatrace.models.TagAction;
import com.azure.resourcemanager.dynatrace.models.TagRule;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class TagRulesListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"logRules\":{\"sendAadLogs\":\"Enabled\",\"sendSubscriptionLogs\":\"Disabled\",\"sendActivityLogs\":\"Enabled\",\"filteringTags\":[{\"name\":\"xuutkncwscwsv\",\"value\":\"otogtwrupqs\",\"action\":\"Include\"},{\"name\":\"i\",\"value\":\"kvceoveilovnotyf\",\"action\":\"Exclude\"},{\"name\":\"jbkcnxdhbttkph\",\"value\":\"pnvjtoqnermclf\",\"action\":\"Include\"}]},\"metricRules\":{\"sendingMetrics\":\"Enabled\",\"filteringTags\":[{\"name\":\"rpabg\",\"value\":\"psbjta\",\"action\":\"Exclude\"},{\"name\":\"xywpmueefjzwfqkq\",\"value\":\"ids\",\"action\":\"Exclude\"},{\"name\":\"obglaocqxtcc\",\"value\":\"yudxytlmoy\",\"action\":\"Exclude\"},{\"name\":\"fudwpznt\",\"value\":\"dzhlrq\",\"action\":\"Exclude\"}]},\"provisioningState\":\"Succeeded\"},\"id\":\"rlhrxs\",\"name\":\"kyv\",\"type\":\"ycanuzbpzkafku\"}]}";

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

        PagedIterable<TagRule> response =
            manager.tagRules().list("ie", "tfhvpesapskrdqmh", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(SendAadLogsStatus.ENABLED, response.iterator().next().logRules().sendAadLogs());
        Assertions
            .assertEquals(
                SendSubscriptionLogsStatus.DISABLED, response.iterator().next().logRules().sendSubscriptionLogs());
        Assertions
            .assertEquals(SendActivityLogsStatus.ENABLED, response.iterator().next().logRules().sendActivityLogs());
        Assertions.assertEquals("xuutkncwscwsv", response.iterator().next().logRules().filteringTags().get(0).name());
        Assertions.assertEquals("otogtwrupqs", response.iterator().next().logRules().filteringTags().get(0).value());
        Assertions
            .assertEquals(TagAction.INCLUDE, response.iterator().next().logRules().filteringTags().get(0).action());
        Assertions
            .assertEquals(SendingMetricsStatus.ENABLED, response.iterator().next().metricRules().sendingMetrics());
        Assertions.assertEquals("rpabg", response.iterator().next().metricRules().filteringTags().get(0).name());
        Assertions.assertEquals("psbjta", response.iterator().next().metricRules().filteringTags().get(0).value());
        Assertions
            .assertEquals(TagAction.EXCLUDE, response.iterator().next().metricRules().filteringTags().get(0).action());
    }
}