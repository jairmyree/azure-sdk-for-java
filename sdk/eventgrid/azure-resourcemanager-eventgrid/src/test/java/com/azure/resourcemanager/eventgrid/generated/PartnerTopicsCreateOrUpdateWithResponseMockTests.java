// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.eventgrid.EventGridManager;
import com.azure.resourcemanager.eventgrid.models.EventDefinitionKind;
import com.azure.resourcemanager.eventgrid.models.EventTypeInfo;
import com.azure.resourcemanager.eventgrid.models.IdentityInfo;
import com.azure.resourcemanager.eventgrid.models.IdentityType;
import com.azure.resourcemanager.eventgrid.models.InlineEventProperties;
import com.azure.resourcemanager.eventgrid.models.PartnerTopic;
import com.azure.resourcemanager.eventgrid.models.PartnerTopicActivationState;
import com.azure.resourcemanager.eventgrid.models.UserIdentityProperties;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PartnerTopicsCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"partnerRegistrationImmutableId\":\"1bab9ce3-d0b8-4178-a354-9540353b07cb\",\"source\":\"gtkihonikzsr\",\"eventTypeInfo\":{\"kind\":\"Inline\",\"inlineEventTypes\":{\"lykhkg\":{\"description\":\"z\",\"displayName\":\"pntogkensckh\",\"documentationUrl\":\"carmoyfx\",\"dataSchemaUrl\":\"wykuqdnd\"},\"qmlfv\":{\"description\":\"pvd\",\"displayName\":\"fpeerscdxrnr\",\"documentationUrl\":\"rcufmbgacnrgfdtn\",\"dataSchemaUrl\":\"spsanmameubkq\"},\"e\":{\"description\":\"qcs\",\"displayName\":\"qjmxpt\",\"documentationUrl\":\"ipuugkwdrqmr\",\"dataSchemaUrl\":\"huuonjkkxukg\"}}},\"expirationTimeIfNotActivatedUtc\":\"2021-11-04T15:53:15Z\",\"provisioningState\":\"Canceled\",\"activationState\":\"NeverActivated\",\"partnerTopicFriendlyDescription\":\"gcjojlleui\",\"messageForActivation\":\"mt\"},\"identity\":{\"type\":\"SystemAssigned, UserAssigned\",\"principalId\":\"htmep\",\"tenantId\":\"bpjbapm\",\"userAssignedIdentities\":{\"mnuf\":{\"principalId\":\"kvavucgj\",\"clientId\":\"aiq\"},\"scotyx\":{\"principalId\":\"rchxwwuzdmhvwl\",\"clientId\":\"vjmxmlitqdsjipdv\"}}},\"location\":\"riifefn\",\"tags\":{\"eailwdqmqf\":\"vrqoemwsi\",\"kd\":\"deotmfx\"},\"id\":\"g\",\"name\":\"gnamkuuyiu\",\"type\":\"uafixlxicwgp\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        EventGridManager manager = EventGridManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PartnerTopic response
            = manager.partnerTopics()
                .define("b")
                .withRegion("svbxxyjisskob")
                .withExistingResourceGroup("fwkztsms")
                .withTags(mapOf("rkdpsqeqfb", "lflioewyhxessm", "ses", "xm"))
                .withIdentity(new IdentityInfo().withType(IdentityType.USER_ASSIGNED)
                    .withPrincipalId("gnuywezygva")
                    .withTenantId("aaqwvkg")
                    .withUserAssignedIdentities(mapOf("ortbnukkfax",
                        new UserIdentityProperties().withPrincipalId("pmpv").withClientId("ogehluf"))))
                .withPartnerRegistrationImmutableId(UUID.fromString("eef2c77b-fa9e-4067-96ec-73bd9796abb7"))
                .withSource("lznfhkqytkztado")
                .withEventTypeInfo(new EventTypeInfo().withKind(EventDefinitionKind.INLINE)
                    .withInlineEventTypes(mapOf("pnfdbgsosciene",
                        new InlineEventProperties().withDescription("fcycrsvlo")
                            .withDisplayName("h")
                            .withDocumentationUrl("qkzjuqwqaj")
                            .withDataSchemaUrl("zxpixhyo"),
                        "urz",
                        new InlineEventProperties().withDescription("vbennmfkbpjnrt")
                            .withDisplayName("w")
                            .withDocumentationUrl("thr")
                            .withDataSchemaUrl("mdudsy"),
                        "yehhfdyldhg",
                        new InlineEventProperties().withDescription("ktjhffe")
                            .withDisplayName("koqyouer")
                            .withDocumentationUrl("g")
                            .withDataSchemaUrl("uzxk"),
                        "zwhpjlwyxedz",
                        new InlineEventProperties().withDescription("d")
                            .withDisplayName("zqiyuqhtder")
                            .withDocumentationUrl("n")
                            .withDataSchemaUrl("a"))))
                .withExpirationTimeIfNotActivatedUtc(OffsetDateTime.parse("2021-07-11T01:48:14Z"))
                .withActivationState(PartnerTopicActivationState.ACTIVATED)
                .withPartnerTopicFriendlyDescription("kewvmyifopxfj")
                .withMessageForActivation("pdyzoutx")
                .create();

        Assertions.assertEquals("riifefn", response.location());
        Assertions.assertEquals("vrqoemwsi", response.tags().get("eailwdqmqf"));
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, response.identity().type());
        Assertions.assertEquals("htmep", response.identity().principalId());
        Assertions.assertEquals("bpjbapm", response.identity().tenantId());
        Assertions.assertEquals("kvavucgj", response.identity().userAssignedIdentities().get("mnuf").principalId());
        Assertions.assertEquals("aiq", response.identity().userAssignedIdentities().get("mnuf").clientId());
        Assertions.assertEquals(UUID.fromString("1bab9ce3-d0b8-4178-a354-9540353b07cb"),
            response.partnerRegistrationImmutableId());
        Assertions.assertEquals("gtkihonikzsr", response.source());
        Assertions.assertEquals(EventDefinitionKind.INLINE, response.eventTypeInfo().kind());
        Assertions.assertEquals("z", response.eventTypeInfo().inlineEventTypes().get("lykhkg").description());
        Assertions.assertEquals("pntogkensckh",
            response.eventTypeInfo().inlineEventTypes().get("lykhkg").displayName());
        Assertions.assertEquals("carmoyfx",
            response.eventTypeInfo().inlineEventTypes().get("lykhkg").documentationUrl());
        Assertions.assertEquals("wykuqdnd", response.eventTypeInfo().inlineEventTypes().get("lykhkg").dataSchemaUrl());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-04T15:53:15Z"),
            response.expirationTimeIfNotActivatedUtc());
        Assertions.assertEquals(PartnerTopicActivationState.NEVER_ACTIVATED, response.activationState());
        Assertions.assertEquals("gcjojlleui", response.partnerTopicFriendlyDescription());
        Assertions.assertEquals("mt", response.messageForActivation());
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
