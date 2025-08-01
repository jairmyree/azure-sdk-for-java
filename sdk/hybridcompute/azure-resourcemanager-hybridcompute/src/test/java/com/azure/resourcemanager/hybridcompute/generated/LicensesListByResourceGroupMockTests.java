// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.hybridcompute.HybridComputeManager;
import com.azure.resourcemanager.hybridcompute.models.License;
import com.azure.resourcemanager.hybridcompute.models.LicenseCoreType;
import com.azure.resourcemanager.hybridcompute.models.LicenseEdition;
import com.azure.resourcemanager.hybridcompute.models.LicenseState;
import com.azure.resourcemanager.hybridcompute.models.LicenseTarget;
import com.azure.resourcemanager.hybridcompute.models.LicenseType;
import com.azure.resourcemanager.hybridcompute.models.ProgramYear;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class LicensesListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Deleting\",\"tenantId\":\"s\",\"licenseType\":\"ESU\",\"licenseDetails\":{\"state\":\"Activated\",\"target\":\"Windows Server 2012\",\"edition\":\"Standard\",\"type\":\"vCore\",\"processors\":1683958424,\"assignedLicenses\":1611438793,\"immutableId\":\"mifrygznmma\",\"volumeLicenseDetails\":[{\"programYear\":\"Year 3\",\"invoiceId\":\"obgop\"},{\"programYear\":\"Year 2\",\"invoiceId\":\"lnelxieixynl\"}]}},\"location\":\"ecwcrojphslhcawj\",\"tags\":{\"ttzhra\":\"fdwfmvigorqj\"},\"id\":\"lkafhonqjuje\",\"name\":\"ckpzvcpopmxeln\",\"type\":\"clt\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HybridComputeManager manager = HybridComputeManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<License> response
            = manager.licenses().listByResourceGroup("slkvntjl", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ecwcrojphslhcawj", response.iterator().next().location());
        Assertions.assertEquals("fdwfmvigorqj", response.iterator().next().tags().get("ttzhra"));
        Assertions.assertEquals("s", response.iterator().next().tenantId());
        Assertions.assertEquals(LicenseType.ESU, response.iterator().next().licenseType());
        Assertions.assertEquals(LicenseState.ACTIVATED, response.iterator().next().licenseDetails().state());
        Assertions.assertEquals(LicenseTarget.WINDOWS_SERVER_2012,
            response.iterator().next().licenseDetails().target());
        Assertions.assertEquals(LicenseEdition.STANDARD, response.iterator().next().licenseDetails().edition());
        Assertions.assertEquals(LicenseCoreType.V_CORE, response.iterator().next().licenseDetails().type());
        Assertions.assertEquals(1683958424, response.iterator().next().licenseDetails().processors());
        Assertions.assertEquals(ProgramYear.YEAR_3,
            response.iterator().next().licenseDetails().volumeLicenseDetails().get(0).programYear());
        Assertions.assertEquals("obgop",
            response.iterator().next().licenseDetails().volumeLicenseDetails().get(0).invoiceId());
    }
}
