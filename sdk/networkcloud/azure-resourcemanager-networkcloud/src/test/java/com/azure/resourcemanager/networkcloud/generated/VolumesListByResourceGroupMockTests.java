// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.networkcloud.NetworkCloudManager;
import com.azure.resourcemanager.networkcloud.models.Volume;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class VolumesListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        String responseStr
            = "{\"value\":[{\"etag\":\"fymcwmb\",\"extendedLocation\":{\"name\":\"pyvqy\",\"type\":\"li\"},\"properties\":{\"attachedTo\":[\"psejbsvsiaies\",\"hddzydisnuepy\",\"yjln\"],\"detailedStatus\":\"Provisioning\",\"detailedStatusMessage\":\"ottdiiaocqibzj\",\"provisioningState\":\"Failed\",\"serialNumber\":\"ebiphryvcjwqwoq\",\"sizeMiB\":6366531422299263422},\"location\":\"jhdhz\",\"tags\":{\"gv\":\"pijhfrzgdkk\"},\"id\":\"ukhsusmmorf\",\"name\":\"zhwilzzh\",\"type\":\"ijmri\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NetworkCloudManager manager = NetworkCloudManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<Volume> response
            = manager.volumes().listByResourceGroup("eqwbpqqncjubkhj", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("jhdhz", response.iterator().next().location());
        Assertions.assertEquals("pijhfrzgdkk", response.iterator().next().tags().get("gv"));
        Assertions.assertEquals("pyvqy", response.iterator().next().extendedLocation().name());
        Assertions.assertEquals("li", response.iterator().next().extendedLocation().type());
        Assertions.assertEquals(6366531422299263422L, response.iterator().next().sizeMiB());
    }
}
