// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.containerorchestratorruntime.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.containerorchestratorruntime.ContainerOrchestratorRuntimeManager;
import com.azure.resourcemanager.containerorchestratorruntime.models.AccessMode;
import com.azure.resourcemanager.containerorchestratorruntime.models.DataResilienceTier;
import com.azure.resourcemanager.containerorchestratorruntime.models.FailoverTier;
import com.azure.resourcemanager.containerorchestratorruntime.models.PerformanceTier;
import com.azure.resourcemanager.containerorchestratorruntime.models.StorageClassResource;
import com.azure.resourcemanager.containerorchestratorruntime.models.VolumeBindingMode;
import com.azure.resourcemanager.containerorchestratorruntime.models.VolumeExpansion;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class StorageClassListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"allowVolumeExpansion\":\"Allow\",\"mountOptions\":[\"tadehxnltyfsopp\",\"suesnzw\",\"ej\",\"avo\"],\"provisioner\":\"zdmohctbqvu\",\"volumeBindingMode\":\"Immediate\",\"accessModes\":[\"ReadWriteOnce\",\"ReadWriteMany\"],\"dataResilience\":\"DataResilient\",\"failoverSpeed\":\"Super\",\"limitations\":[\"jugwdkcglhsl\",\"zj\",\"yggdtjixh\",\"kuofqweykhme\"],\"performance\":\"Standard\",\"priority\":6284869776595243708,\"typeProperties\":{\"type\":\"StorageClassTypeProperties\"},\"provisioningState\":\"Updating\"},\"id\":\"hybcibv\",\"name\":\"vdcsitynn\",\"type\":\"amdecte\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ContainerOrchestratorRuntimeManager manager = ContainerOrchestratorRuntimeManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<StorageClassResource> response
            = manager.storageClass().list("ynpwlbj", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(VolumeExpansion.ALLOW, response.iterator().next().properties().allowVolumeExpansion());
        Assertions.assertEquals("tadehxnltyfsopp", response.iterator().next().properties().mountOptions().get(0));
        Assertions.assertEquals("zdmohctbqvu", response.iterator().next().properties().provisioner());
        Assertions.assertEquals(VolumeBindingMode.IMMEDIATE,
            response.iterator().next().properties().volumeBindingMode());
        Assertions.assertEquals(AccessMode.READ_WRITE_ONCE,
            response.iterator().next().properties().accessModes().get(0));
        Assertions.assertEquals(DataResilienceTier.DATA_RESILIENT,
            response.iterator().next().properties().dataResilience());
        Assertions.assertEquals(FailoverTier.SUPER, response.iterator().next().properties().failoverSpeed());
        Assertions.assertEquals("jugwdkcglhsl", response.iterator().next().properties().limitations().get(0));
        Assertions.assertEquals(PerformanceTier.STANDARD, response.iterator().next().properties().performance());
        Assertions.assertEquals(6284869776595243708L, response.iterator().next().properties().priority());
    }
}
