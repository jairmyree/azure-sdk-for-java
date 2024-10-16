// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.customerinsights.CustomerInsightsManager;
import com.azure.resourcemanager.customerinsights.models.ConnectorResourceFormat;
import com.azure.resourcemanager.customerinsights.models.ConnectorTypes;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ConnectorsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"connectorId\":452874551,\"connectorName\":\"vscksgfyys\",\"connectorType\":\"None\",\"displayName\":\"kgaf\",\"description\":\"z\",\"connectorProperties\":{\"yveszr\":\"datacckwrtwle\"},\"created\":\"2021-03-05T07:37:49Z\",\"lastModified\":\"2021-09-02T02:10:49Z\",\"state\":\"Created\",\"tenantId\":\"nctaczcn\",\"isInternal\":false},\"id\":\"bbfnvjxitzovnkr\",\"name\":\"iklsmni\",\"type\":\"qlcoqksyiibhyx\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        CustomerInsightsManager manager = CustomerInsightsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ConnectorResourceFormat response = manager.connectors()
            .define("ixhg")
            .withExistingHub("qna", "ttuxvzfqayopbt")
            .withConnectorName("ndztgsq")
            .withConnectorType(ConnectorTypes.SALESFORCE)
            .withDisplayName("qm")
            .withDescription("xn")
            .withConnectorProperties(mapOf("hbjdqknhqnmotpu", "databpgb", "fr", "datannohmmzngo", "gkfh",
                "datauypwyiulaynos", "wgsghqucumldd", "dataxttpfs"))
            .withIsInternal(true)
            .create();

        Assertions.assertEquals("vscksgfyys", response.connectorName());
        Assertions.assertEquals(ConnectorTypes.NONE, response.connectorType());
        Assertions.assertEquals("kgaf", response.displayName());
        Assertions.assertEquals("z", response.description());
        Assertions.assertEquals(false, response.isInternal());
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
