// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.CreateDataFlowDebugSessionRequest;
import com.azure.resourcemanager.datafactory.models.CreateDataFlowDebugSessionResponse;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntime;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeDebugResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DataFlowDebugSessionsCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        String responseStr = "{\"status\":\"mpuqnvn\",\"sessionId\":\"awicou\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataFactoryManager manager = DataFactoryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        CreateDataFlowDebugSessionResponse response = manager.dataFlowDebugSessions()
            .create("ixfosrwzhm", "klocyjpmbtnv",
                new CreateDataFlowDebugSessionRequest().withComputeType("mhkfkvdmjjiqjv")
                    .withCoreCount(944548630)
                    .withTimeToLive(1599364288)
                    .withIntegrationRuntime(new IntegrationRuntimeDebugResource().withName("feyhny")
                        .withProperties(new IntegrationRuntime().withDescription("i")
                            .withAdditionalProperties(mapOf("type", "IntegrationRuntime")))),
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("mpuqnvn", response.status());
        Assertions.assertEquals("awicou", response.sessionId());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
