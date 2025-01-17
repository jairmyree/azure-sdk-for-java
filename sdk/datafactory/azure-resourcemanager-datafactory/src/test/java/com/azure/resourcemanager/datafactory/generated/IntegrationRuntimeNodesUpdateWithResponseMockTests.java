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
import com.azure.resourcemanager.datafactory.models.SelfHostedIntegrationRuntimeNode;
import com.azure.resourcemanager.datafactory.models.UpdateIntegrationRuntimeNodeRequest;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class IntegrationRuntimeNodesUpdateWithResponseMockTests {
    @Test
    public void testUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"nodeName\":\"w\",\"machineName\":\"df\",\"hostServiceUri\":\"q\",\"status\":\"Limited\",\"capabilities\":{\"dsnc\":\"sabyowfrwprbzf\"},\"versionStatus\":\"lgtqrowtaz\",\"version\":\"xwkkjx\",\"registerTime\":\"2021-06-24T12:52:09Z\",\"lastConnectTime\":\"2021-09-26T11:47:54Z\",\"expiryTime\":\"2021-09-06T21:28:54Z\",\"lastStartTime\":\"2021-08-27T15:55:46Z\",\"lastStopTime\":\"2021-10-07T00:16:58Z\",\"lastUpdateResult\":\"Fail\",\"lastStartUpdateTime\":\"2021-08-31T19:56:57Z\",\"lastEndUpdateTime\":\"2021-06-22T04:38:40Z\",\"isActiveDispatcher\":false,\"concurrentJobsLimit\":1091038831,\"maxConcurrentJobs\":1665291142,\"\":{\"fkdf\":\"datairttlwuqgaaj\",\"febtvnskygzqqikt\":\"dataqsbekmeeowdojpja\"}}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataFactoryManager manager = DataFactoryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        SelfHostedIntegrationRuntimeNode response = manager.integrationRuntimeNodes()
            .updateWithResponse("vcwhodfwv", "xrfr", "x", "yktlofgpnswv",
                new UpdateIntegrationRuntimeNodeRequest().withConcurrentJobsLimit(1423242353),
                com.azure.core.util.Context.NONE)
            .getValue();

    }
}
