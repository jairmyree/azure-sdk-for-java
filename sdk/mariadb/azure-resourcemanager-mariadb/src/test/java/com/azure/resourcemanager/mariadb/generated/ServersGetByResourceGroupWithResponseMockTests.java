// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.mariadb.MariaDBManager;
import com.azure.resourcemanager.mariadb.models.GeoRedundantBackup;
import com.azure.resourcemanager.mariadb.models.MinimalTlsVersionEnum;
import com.azure.resourcemanager.mariadb.models.PublicNetworkAccessEnum;
import com.azure.resourcemanager.mariadb.models.Server;
import com.azure.resourcemanager.mariadb.models.ServerState;
import com.azure.resourcemanager.mariadb.models.ServerVersion;
import com.azure.resourcemanager.mariadb.models.SkuTier;
import com.azure.resourcemanager.mariadb.models.SslEnforcementEnum;
import com.azure.resourcemanager.mariadb.models.StorageAutogrow;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ServersGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        String responseStr
            = "{\"sku\":{\"name\":\"aw\",\"tier\":\"GeneralPurpose\",\"capacity\":841259449,\"size\":\"wczelpci\",\"family\":\"lsfeaenwabfatkld\"},\"properties\":{\"administratorLogin\":\"jhwuaanozjos\",\"version\":\"10.2\",\"sslEnforcement\":\"Enabled\",\"minimalTlsVersion\":\"TLS1_1\",\"userVisibleState\":\"Disabled\",\"fullyQualifiedDomainName\":\"xagl\",\"earliestRestoreDate\":\"2021-11-16T13:26:47Z\",\"storageProfile\":{\"backupRetentionDays\":865448266,\"geoRedundantBackup\":\"Disabled\",\"storageMB\":357706125,\"storageAutogrow\":\"Enabled\"},\"replicationRole\":\"cskfcktqumiekk\",\"masterServerId\":\"zikhl\",\"replicaCapacity\":1852856811,\"publicNetworkAccess\":\"Disabled\",\"privateEndpointConnections\":[{\"id\":\"gebdunygaeq\",\"properties\":{\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{\"status\":\"Disconnected\",\"description\":\"atpxl\"},\"provisioningState\":\"Failed\"}}]},\"location\":\"cyjmoadsuvarmy\",\"tags\":{\"rw\":\"jsjqbjhhyx\",\"duhpk\":\"yc\"},\"id\":\"kgymareqnajxqug\",\"name\":\"hky\",\"type\":\"ubeddg\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MariaDBManager manager = MariaDBManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Server response = manager.servers()
            .getByResourceGroupWithResponse("zk", "foqreyfkzik", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("cyjmoadsuvarmy", response.location());
        Assertions.assertEquals("jsjqbjhhyx", response.tags().get("rw"));
        Assertions.assertEquals("aw", response.sku().name());
        Assertions.assertEquals(SkuTier.GENERAL_PURPOSE, response.sku().tier());
        Assertions.assertEquals(841259449, response.sku().capacity());
        Assertions.assertEquals("wczelpci", response.sku().size());
        Assertions.assertEquals("lsfeaenwabfatkld", response.sku().family());
        Assertions.assertEquals("jhwuaanozjos", response.administratorLogin());
        Assertions.assertEquals(ServerVersion.ONE_ZERO_TWO, response.version());
        Assertions.assertEquals(SslEnforcementEnum.ENABLED, response.sslEnforcement());
        Assertions.assertEquals(MinimalTlsVersionEnum.TLS1_1, response.minimalTlsVersion());
        Assertions.assertEquals(ServerState.DISABLED, response.userVisibleState());
        Assertions.assertEquals("xagl", response.fullyQualifiedDomainName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-16T13:26:47Z"), response.earliestRestoreDate());
        Assertions.assertEquals(865448266, response.storageProfile().backupRetentionDays());
        Assertions.assertEquals(GeoRedundantBackup.DISABLED, response.storageProfile().geoRedundantBackup());
        Assertions.assertEquals(357706125, response.storageProfile().storageMB());
        Assertions.assertEquals(StorageAutogrow.ENABLED, response.storageProfile().storageAutogrow());
        Assertions.assertEquals("cskfcktqumiekk", response.replicationRole());
        Assertions.assertEquals("zikhl", response.masterServerId());
        Assertions.assertEquals(1852856811, response.replicaCapacity());
        Assertions.assertEquals(PublicNetworkAccessEnum.DISABLED, response.publicNetworkAccess());
    }
}
