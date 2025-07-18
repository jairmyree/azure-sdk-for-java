// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.dnsresolver.DnsResolverManager;
import com.azure.resourcemanager.dnsresolver.models.ActionType;
import com.azure.resourcemanager.dnsresolver.models.DnsSecurityRule;
import com.azure.resourcemanager.dnsresolver.models.DnsSecurityRuleState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DnsSecurityRulesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"etag\":\"qikfxcv\",\"properties\":{\"priority\":467957195,\"action\":{\"actionType\":\"Block\"},\"dnsResolverDomainLists\":[{\"id\":\"uagrttikteusqc\"},{\"id\":\"vyklxuby\"},{\"id\":\"ff\"},{\"id\":\"fblcq\"}],\"dnsSecurityRuleState\":\"Enabled\",\"provisioningState\":\"Canceled\"},\"location\":\"ibrta\",\"tags\":{\"rmooizqse\":\"tttwgdslqxih\",\"apzhyrpetoge\":\"pxiutc\",\"rqnkkzjcjbtr\":\"joxslhvnhla\",\"eitpkxztmo\":\"aehvvibrxjjstoq\"},\"id\":\"bklftidgfcwqmpim\",\"name\":\"qxzhem\",\"type\":\"yhohujswtwkozzwc\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DnsResolverManager manager = DnsResolverManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<DnsSecurityRule> response
            = manager.dnsSecurityRules().list("uqovekqvgqouwif", "mpjw", 594381501, com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ibrta", response.iterator().next().location());
        Assertions.assertEquals("tttwgdslqxih", response.iterator().next().tags().get("rmooizqse"));
        Assertions.assertEquals(467957195, response.iterator().next().priority());
        Assertions.assertEquals(ActionType.BLOCK, response.iterator().next().action().actionType());
        Assertions.assertEquals("uagrttikteusqc", response.iterator().next().dnsResolverDomainLists().get(0).id());
        Assertions.assertEquals(DnsSecurityRuleState.ENABLED, response.iterator().next().dnsSecurityRuleState());
    }
}
