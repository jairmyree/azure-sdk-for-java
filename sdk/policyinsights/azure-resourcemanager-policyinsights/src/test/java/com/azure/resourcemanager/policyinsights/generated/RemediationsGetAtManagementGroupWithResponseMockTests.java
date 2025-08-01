// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.policyinsights.PolicyInsightsManager;
import com.azure.resourcemanager.policyinsights.models.Remediation;
import com.azure.resourcemanager.policyinsights.models.ResourceDiscoveryMode;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class RemediationsGetAtManagementGroupWithResponseMockTests {
    @Test
    public void testGetAtManagementGroupWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"policyAssignmentId\":\"sdtcjbctvivuzqym\",\"policyDefinitionReferenceId\":\"owog\",\"resourceDiscoveryMode\":\"ExistingNonCompliant\",\"provisioningState\":\"sqhzvbrzcdbanfz\",\"createdOn\":\"2021-05-28T10:26:09Z\",\"lastUpdatedOn\":\"2021-06-15T01:59:52Z\",\"filters\":{\"locations\":[\"atkdbmwnrd\",\"yibqbnao\",\"hjrmkuhmaxl\"],\"resourceIds\":[\"f\",\"hcjmo\"]},\"deploymentStatus\":{\"totalDeployments\":456440349,\"successfulDeployments\":516966793,\"failedDeployments\":152401377},\"statusMessage\":\"qcwgaxfgvaknokz\",\"correlationId\":\"jzrltixldzy\",\"resourceCount\":1622621663,\"parallelDeployments\":157830727,\"failureThreshold\":{\"percentage\":80.80238}},\"id\":\"ymmpujivy\",\"name\":\"lkjuvsmbmslzoyov\",\"type\":\"zdbpqv\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        PolicyInsightsManager manager = PolicyInsightsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        Remediation response = manager.remediations()
            .getAtManagementGroupWithResponse("cnrly", "nucaephblkwqpat", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("sdtcjbctvivuzqym", response.policyAssignmentId());
        Assertions.assertEquals("owog", response.policyDefinitionReferenceId());
        Assertions.assertEquals(ResourceDiscoveryMode.EXISTING_NON_COMPLIANT, response.resourceDiscoveryMode());
        Assertions.assertEquals("atkdbmwnrd", response.filters().locations().get(0));
        Assertions.assertEquals("f", response.filters().resourceIds().get(0));
        Assertions.assertEquals(1622621663, response.resourceCount());
        Assertions.assertEquals(157830727, response.parallelDeployments());
        Assertions.assertEquals(80.80238F, response.failureThreshold().percentage());
    }
}
