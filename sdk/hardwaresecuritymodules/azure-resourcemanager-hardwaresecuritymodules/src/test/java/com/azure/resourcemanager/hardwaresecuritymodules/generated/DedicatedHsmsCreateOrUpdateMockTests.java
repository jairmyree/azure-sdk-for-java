// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager;
import com.azure.resourcemanager.hardwaresecuritymodules.models.ApiEntityReference;
import com.azure.resourcemanager.hardwaresecuritymodules.models.DedicatedHsm;
import com.azure.resourcemanager.hardwaresecuritymodules.models.DedicatedHsmProperties;
import com.azure.resourcemanager.hardwaresecuritymodules.models.NetworkInterface;
import com.azure.resourcemanager.hardwaresecuritymodules.models.NetworkProfile;
import com.azure.resourcemanager.hardwaresecuritymodules.models.Sku;
import com.azure.resourcemanager.hardwaresecuritymodules.models.SkuName;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DedicatedHsmsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"sku\":{\"name\":\"payShield10K_LMK1_CPS60\"},\"zones\":[\"ocxvdfffwafqr\",\"udaspavehh\",\"vkbunzozudh\",\"xg\"],\"properties\":{\"networkProfile\":{\"subnet\":{\"resourceId\":\"xcdyuibhmfdnb\"},\"networkInterfaces\":[{\"resourceId\":\"f\",\"privateIpAddress\":\"cjnaeoisrvhmgor\"},{\"resourceId\":\"ukiscvwmzhw\",\"privateIpAddress\":\"efaxvxilc\"},{\"resourceId\":\"gnhnzeyq\",\"privateIpAddress\":\"jjfzqlqhycavo\"}]},\"managementNetworkProfile\":{\"subnet\":{\"resourceId\":\"dbeesmie\"},\"networkInterfaces\":[{\"resourceId\":\"ariaawi\",\"privateIpAddress\":\"gy\"},{\"resourceId\":\"qfby\",\"privateIpAddress\":\"rfgi\"},{\"resourceId\":\"tcojocqwo\",\"privateIpAddress\":\"nzjvusfzldm\"}]},\"stampId\":\"uxylfsbtkadpy\",\"statusMessage\":\"wn\",\"provisioningState\":\"Succeeded\"},\"location\":\"bugrj\",\"tags\":{\"foj\":\"ojcmisofieyp\"},\"id\":\"qdhcu\",\"name\":\"lcplc\",\"type\":\"khihihlhzds\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HardwareSecurityModulesManager manager = HardwareSecurityModulesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        DedicatedHsm response = manager.dedicatedHsms()
            .define("xndticokpvzmlqtm")
            .withRegion("dhuzqgnjdgk")
            .withExistingResourceGroup("glae")
            .withSku(new Sku().withName(SkuName.PAY_SHIELD10K_LMK2_CPS2500))
            .withProperties(new DedicatedHsmProperties()
                .withNetworkProfile(
                    new NetworkProfile().withSubnet(new ApiEntityReference().withResourceId("awfvjlboxqvkjl"))
                        .withNetworkInterfaces(Arrays.asList(new NetworkInterface().withPrivateIpAddress("dwdigumb"))))
                .withManagementNetworkProfile(
                    new NetworkProfile().withSubnet(new ApiEntityReference().withResourceId("uzzptjazysdz"))
                        .withNetworkInterfaces(Arrays.asList(new NetworkInterface().withPrivateIpAddress("yuvvfonkp"),
                            new NetworkInterface().withPrivateIpAddress("uyav"))))
                .withStampId("wmn"))
            .withTags(mapOf("hzvhxnkomtkubo", "cli", "hihfrbbcevqagtlt", "ppnvdxz"))
            .withZones(Arrays.asList("bf", "rclnpkc", "ayzri"))
            .create();

        Assertions.assertEquals("bugrj", response.location());
        Assertions.assertEquals("ojcmisofieyp", response.tags().get("foj"));
        Assertions.assertEquals(SkuName.PAY_SHIELD10K_LMK1_CPS60, response.sku().name());
        Assertions.assertEquals("ocxvdfffwafqr", response.zones().get(0));
        Assertions.assertEquals("xcdyuibhmfdnb", response.properties().networkProfile().subnet().resourceId());
        Assertions.assertEquals("cjnaeoisrvhmgor",
            response.properties().networkProfile().networkInterfaces().get(0).privateIpAddress());
        Assertions.assertEquals("dbeesmie", response.properties().managementNetworkProfile().subnet().resourceId());
        Assertions.assertEquals("gy",
            response.properties().managementNetworkProfile().networkInterfaces().get(0).privateIpAddress());
        Assertions.assertEquals("uxylfsbtkadpy", response.properties().stampId());
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
