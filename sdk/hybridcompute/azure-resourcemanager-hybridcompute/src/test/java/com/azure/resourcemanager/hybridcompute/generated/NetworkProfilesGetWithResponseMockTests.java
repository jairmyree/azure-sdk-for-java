// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.hybridcompute.HybridComputeManager;
import com.azure.resourcemanager.hybridcompute.models.NetworkProfile;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class NetworkProfilesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"networkInterfaces\":[{\"macAddress\":\"xrdcoxnbkkja\",\"id\":\"rnnqb\",\"name\":\"bpizxqltgr\",\"ipAddresses\":[{\"address\":\"pxrxvbfihwu\",\"ipAddressVersion\":\"ctafsrbxrblm\",\"subnet\":{}},{\"address\":\"wxihs\",\"ipAddressVersion\":\"xwqagnepzw\",\"subnet\":{}},{\"address\":\"sbs\",\"ipAddressVersion\":\"qqagwwr\",\"subnet\":{}},{\"address\":\"mz\",\"ipAddressVersion\":\"glrrczez\",\"subnet\":{}}]},{\"macAddress\":\"ltn\",\"id\":\"dhqoawj\",\"name\":\"yueayfbpcmsp\",\"ipAddresses\":[{\"address\":\"rueqthwm\",\"ipAddressVersion\":\"mbscbbx\",\"subnet\":{}},{\"address\":\"hxiidlopedb\",\"ipAddressVersion\":\"pyqy\",\"subnet\":{}}]},{\"macAddress\":\"ubmdnafcbqwre\",\"id\":\"ela\",\"name\":\"cigeleohdbvqvw\",\"ipAddresses\":[{\"address\":\"pwbeonr\",\"ipAddressVersion\":\"wzdqybxceakxcpts\",\"subnet\":{}},{\"address\":\"yiaseqchkrttzraz\",\"ipAddressVersion\":\"gyki\",\"subnet\":{}},{\"address\":\"vanbwzohmnrxxbs\",\"ipAddressVersion\":\"klinhmdptysprq\",\"subnet\":{}},{\"address\":\"zxojpslsv\",\"ipAddressVersion\":\"pli\",\"subnet\":{}}]}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HybridComputeManager manager = HybridComputeManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        NetworkProfile response = manager.networkProfiles()
            .getWithResponse("trczzydmxzjijp", "uaurkihcir", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("xrdcoxnbkkja", response.networkInterfaces().get(0).macAddress());
        Assertions.assertEquals("rnnqb", response.networkInterfaces().get(0).id());
        Assertions.assertEquals("bpizxqltgr", response.networkInterfaces().get(0).name());
        Assertions.assertEquals("pxrxvbfihwu", response.networkInterfaces().get(0).ipAddresses().get(0).address());
        Assertions.assertEquals("ctafsrbxrblm",
            response.networkInterfaces().get(0).ipAddresses().get(0).ipAddressVersion());
    }
}
