// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.SubResource;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.dnsresolver.DnsResolverManager;
import com.azure.resourcemanager.dnsresolver.models.DnsResolverPolicyVirtualNetworkLink;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DnsResolverPolicyVirtualNetworkLinksCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"etag\":\"prtujwsawdd\",\"properties\":{\"virtualNetwork\":{\"id\":\"babxvitit\"},\"provisioningState\":\"Succeeded\"},\"location\":\"exavoxt\",\"tags\":{\"q\":\"ecdmdqbwpy\",\"slhhxudbxv\":\"gsfjac\",\"tnsi\":\"d\"},\"id\":\"ud\",\"name\":\"z\",\"type\":\"mes\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DnsResolverManager manager = DnsResolverManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        DnsResolverPolicyVirtualNetworkLink response = manager.dnsResolverPolicyVirtualNetworkLinks()
            .define("jjidjk")
            .withRegion("jbnkpp")
            .withExistingDnsResolverPolicy("jhhn", "kzyb")
            .withVirtualNetwork(new SubResource().withId("nljlageuaulx"))
            .withTags(mapOf("rmffeyc", "enlsvxeizzgwkln", "iymerteeammxqi", "ckt", "zddrt", "kk"))
            .withIfMatch("cuijpxt")
            .withIfNoneMatch("s")
            .create();

        Assertions.assertEquals("exavoxt", response.location());
        Assertions.assertEquals("ecdmdqbwpy", response.tags().get("q"));
        Assertions.assertEquals("babxvitit", response.virtualNetwork().id());
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
