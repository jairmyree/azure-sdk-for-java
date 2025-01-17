// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager;
import com.azure.resourcemanager.streamanalytics.models.Function;
import com.azure.resourcemanager.streamanalytics.models.FunctionRetrieveDefaultDefinitionParameters;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class FunctionsRetrieveDefaultDefinitionWithResponseMockTests {
    @Test
    public void testRetrieveDefaultDefinitionWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"type\":\"FunctionProperties\",\"etag\":\"mdwzrmuhapfcqdps\",\"properties\":{\"inputs\":[{\"dataType\":\"svuo\",\"isConfigurationParameter\":false},{\"dataType\":\"celve\",\"isConfigurationParameter\":false},{\"dataType\":\"qlmfeoker\",\"isConfigurationParameter\":true}],\"output\":{\"dataType\":\"kobopgxed\"},\"binding\":{\"type\":\"FunctionBinding\"}}},\"name\":\"epbqpcrfkbw\",\"type\":\"snjvcdwxlpqekftn\",\"id\":\"tjsyin\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        StreamAnalyticsManager manager = StreamAnalyticsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Function response = manager.functions()
            .retrieveDefaultDefinitionWithResponse("sgvvsccyajguq", "hwyg", "lvdnkfx",
                new FunctionRetrieveDefaultDefinitionParameters(), com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("tjsyin", response.id());
        Assertions.assertEquals("svuo", response.properties().inputs().get(0).dataType());
        Assertions.assertEquals(false, response.properties().inputs().get(0).isConfigurationParameter());
        Assertions.assertEquals("kobopgxed", response.properties().output().dataType());
        Assertions.assertEquals("epbqpcrfkbw", response.name());
    }
}
