// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.apimanagement.ApiManagementManager;
import com.azure.resourcemanager.apimanagement.models.NotificationName;
import com.azure.resourcemanager.apimanagement.models.RecipientEmailCollection;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class NotificationRecipientEmailsListByNotificationWithResponseMockTests {
    @Test
    public void testListByNotificationWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"email\":\"binpxmiwtkqifpv\"},\"id\":\"dukcdnzoxla\",\"name\":\"uxtwgbawshram\",\"type\":\"sugqcglma\"},{\"properties\":{\"email\":\"tof\"},\"id\":\"vqlauuag\",\"name\":\"ayfmcerfxfeiqbas\",\"type\":\"hzwj\"},{\"properties\":{\"email\":\"svnonij\"},\"id\":\"qcj\",\"name\":\"zzjkugpdqqbt\",\"type\":\"kvocu\"},{\"properties\":{\"email\":\"lbpwarhwettohg\"},\"id\":\"z\",\"name\":\"xyvtkzbhizxp\",\"type\":\"sddmwnfhmju\"}],\"count\":3001807962266452949,\"nextLink\":\"ushvlxudhe\"}";

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

        ApiManagementManager manager =
            ApiManagementManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        RecipientEmailCollection response =
            manager
                .notificationRecipientEmails()
                .listByNotificationWithResponse(
                    "zwbsk",
                    "e",
                    NotificationName.NEW_APPLICATION_NOTIFICATION_MESSAGE,
                    com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("binpxmiwtkqifpv", response.value().get(0).email());
        Assertions.assertEquals(3001807962266452949L, response.count());
        Assertions.assertEquals("ushvlxudhe", response.nextLink());
    }
}