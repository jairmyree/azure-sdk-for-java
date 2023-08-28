// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.maintenance.MaintenanceManager;
import com.azure.resourcemanager.maintenance.models.ConfigurationAssignment;
import com.azure.resourcemanager.maintenance.models.TagOperators;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ConfigurationAssignmentsForResourceGroupsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"location\":\"bxv\",\"properties\":{\"maintenanceConfigurationId\":\"tnsi\",\"resourceId\":\"dhzmmesckdlp\",\"filter\":{\"resourceTypes\":[\"cxfailcfxwmdboxd\",\"gsftufqobrjlnacg\",\"ckknhxkizvy\",\"nrzvuljraaer\"],\"resourceGroups\":[\"kqg\",\"kkjqnvbroylaxxu\",\"cdisd\"],\"osTypes\":[\"jbjsvgjrwh\"],\"locations\":[\"ycy\"],\"tagSettings\":{\"tags\":{\"hk\":[\"gc\",\"knfnwmbtmvpdv\",\"dhttzaefedxihchr\"],\"ppipifhpfeoa\":[\"rjdqnsdfzp\",\"gtgkylkdghr\",\"euutlwxezwzh\",\"kvbwnhhtqlgeh\"],\"tugsresmkssjh\":[\"gcxtxj\",\"sheafid\"],\"ucb\":[\"ftxfkf\",\"egprhptil\"]},\"filterOperator\":\"Any\"}}},\"id\":\"dqohmc\",\"name\":\"sldrizetpwbral\",\"type\":\"libph\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        MaintenanceManager manager =
            MaintenanceManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        ConfigurationAssignment response =
            manager
                .configurationAssignmentsForResourceGroups()
                .getByResourceGroupWithResponse("pypqtgsfj", "cbslhhx", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("bxv", response.location());
        Assertions.assertEquals("tnsi", response.maintenanceConfigurationId());
        Assertions.assertEquals("dhzmmesckdlp", response.resourceId());
        Assertions.assertEquals("cxfailcfxwmdboxd", response.filter().resourceTypes().get(0));
        Assertions.assertEquals("kqg", response.filter().resourceGroups().get(0));
        Assertions.assertEquals("jbjsvgjrwh", response.filter().osTypes().get(0));
        Assertions.assertEquals("ycy", response.filter().locations().get(0));
        Assertions.assertEquals("gc", response.filter().tagSettings().tags().get("hk").get(0));
        Assertions.assertEquals(TagOperators.ANY, response.filter().tagSettings().filterOperator());
    }
}