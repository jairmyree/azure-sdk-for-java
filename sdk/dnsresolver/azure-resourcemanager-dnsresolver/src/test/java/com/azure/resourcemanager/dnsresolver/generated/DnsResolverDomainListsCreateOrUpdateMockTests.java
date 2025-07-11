// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.dnsresolver.DnsResolverManager;
import com.azure.resourcemanager.dnsresolver.models.DnsResolverDomainList;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DnsResolverDomainListsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"etag\":\"texoqqpwc\",\"properties\":{\"domains\":[\"mhruncuwm\",\"spkcdqzh\",\"ctddun\"],\"domainsUrl\":\"dyfpchrqbnj\",\"provisioningState\":\"Succeeded\",\"resourceGuid\":\"egy\"},\"location\":\"wboxjumvqqo\",\"tags\":{\"aiouaubrjt\":\"r\",\"fuojrngif\":\"oq\",\"dfqwmkyoq\":\"rzpasccbiuimzdly\"},\"id\":\"fdvruz\",\"name\":\"lzo\",\"type\":\"hpc\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DnsResolverManager manager = DnsResolverManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        DnsResolverDomainList response = manager.dnsResolverDomainLists()
            .define("bccxjmonfdgn")
            .withRegion("bbelawumuaslzk")
            .withExistingResourceGroup("lvidizozs")
            .withTags(mapOf("nomdrkywuhpsv", "woycqucwyha", "xzsrzpge", "uurutlwexxwlalni", "yb", "q"))
            .withDomains(Arrays.asList("ctzenkeifzzhmkd", "svflyhbxcudch", "gsrboldforobw"))
            .withIfMatch("mysu")
            .withIfNoneMatch("swqrntvlwijp")
            .create();

        Assertions.assertEquals("wboxjumvqqo", response.location());
        Assertions.assertEquals("r", response.tags().get("aiouaubrjt"));
        Assertions.assertEquals("mhruncuwm", response.domains().get(0));
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
