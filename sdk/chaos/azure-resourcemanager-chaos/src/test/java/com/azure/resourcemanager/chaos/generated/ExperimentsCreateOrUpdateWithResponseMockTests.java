// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.chaos.ChaosManager;
import com.azure.resourcemanager.chaos.models.Branch;
import com.azure.resourcemanager.chaos.models.Experiment;
import com.azure.resourcemanager.chaos.models.Filter;
import com.azure.resourcemanager.chaos.models.ResourceIdentity;
import com.azure.resourcemanager.chaos.models.ResourceIdentityType;
import com.azure.resourcemanager.chaos.models.Selector;
import com.azure.resourcemanager.chaos.models.Step;
import com.azure.resourcemanager.chaos.models.UserAssignedIdentity;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ExperimentsCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"identity\":{\"type\":\"None\",\"userAssignedIdentities\":{\"fgmblrrilbywdxsm\":{\"principalId\":\"6981a6ea-7d5f-43e8-a7e5-588b5fc19ebd\",\"clientId\":\"4800dd1a-97e6-4b07-81ad-e83847e391ab\"}},\"principalId\":\"cwrwfs\",\"tenantId\":\"fnynszqujizdvoqy\"},\"properties\":{\"steps\":[{\"name\":\"byowbblgyavutp\",\"branches\":[{\"name\":\"joxoism\",\"actions\":[]},{\"name\":\"ksbpimlqoljx\",\"actions\":[]}]},{\"name\":\"cgxxlxs\",\"branches\":[{\"name\":\"gcvizqzdwlvwlyou\",\"actions\":[]},{\"name\":\"fgfb\",\"actions\":[]}]},{\"name\":\"jub\",\"branches\":[{\"name\":\"hgkfmin\",\"actions\":[]}]},{\"name\":\"g\",\"branches\":[{\"name\":\"zfttsttktlahb\",\"actions\":[]}]}],\"selectors\":[{\"type\":\"Selector\",\"id\":\"ctxtgzukxi\",\"filter\":{\"type\":\"Filter\"},\"\":{\"qqxhrnxrxcpj\":\"datatg\",\"dzf\":\"dataisavok\",\"atnwxyiopi\":\"dataazivjlfrqttbajl\"}},{\"type\":\"Selector\",\"id\":\"kqqfk\",\"filter\":{\"type\":\"Filter\"},\"\":{\"ibrxkp\":\"dataxkdmligo\",\"bteoybf\":\"dataloazuruocbgoo\",\"jgslordilmyww\":\"datajxakv\"}},{\"type\":\"Selector\",\"id\":\"kgkxn\",\"filter\":{\"type\":\"Filter\"},\"\":{\"yvudtjuewbci\":\"datab\",\"xccybvpa\":\"dataxuuwhcj\"}},{\"type\":\"Selector\",\"id\":\"akkud\",\"filter\":{\"type\":\"Filter\"},\"\":{\"stcyohpfkyrkdbd\":\"datawjplma\",\"nobaiyhddviacegf\":\"dataiogsjkmnwq\"}}],\"startOnCreation\":true},\"location\":\"tfpmvmemfnczdw\",\"tags\":{\"db\":\"alxlllchp\"},\"id\":\"evwrdnhfuk\",\"name\":\"vsjcswsmystuluqy\",\"type\":\"fcvlerch\"}";

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

        ChaosManager manager =
            ChaosManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        Experiment response =
            manager
                .experiments()
                .define("hmkxmaehvbb")
                .withRegion("sivfomilo")
                .withExistingResourceGroup("eydbsd")
                .withSteps(
                    Arrays
                        .asList(
                            new Step()
                                .withName("tgk")
                                .withBranches(
                                    Arrays
                                        .asList(
                                            new Branch().withName("tvdxeclzedqb").withActions(Arrays.asList()),
                                            new Branch().withName("vh").withActions(Arrays.asList()),
                                            new Branch().withName("lhpl").withActions(Arrays.asList()))),
                            new Step()
                                .withName("dqkdlwwqfbu")
                                .withBranches(
                                    Arrays.asList(new Branch().withName("kxtrq").withActions(Arrays.asList())))))
                .withSelectors(
                    Arrays
                        .asList(
                            new Selector()
                                .withId("smlmbtxhwgfwsrta")
                                .withFilter(new Filter())
                                .withAdditionalProperties(mapOf("type", "Selector")),
                            new Selector()
                                .withId("qgzsles")
                                .withFilter(new Filter())
                                .withAdditionalProperties(mapOf("type", "Selector")),
                            new Selector()
                                .withId("ewzcjznmwcp")
                                .withFilter(new Filter())
                                .withAdditionalProperties(mapOf("type", "Selector")),
                            new Selector()
                                .withId("w")
                                .withFilter(new Filter())
                                .withAdditionalProperties(mapOf("type", "Selector"))))
                .withTags(mapOf("dieuzaofj", "dufiq", "otcubi", "hvcyyysfg"))
                .withIdentity(
                    new ResourceIdentity()
                        .withType(ResourceIdentityType.SYSTEM_ASSIGNED)
                        .withUserAssignedIdentities(
                            mapOf(
                                "n",
                                new UserAssignedIdentity(),
                                "axkgx",
                                new UserAssignedIdentity(),
                                "ckpyklyhplu",
                                new UserAssignedIdentity())))
                .withStartOnCreation(false)
                .create();

        Assertions.assertEquals("tfpmvmemfnczdw", response.location());
        Assertions.assertEquals("alxlllchp", response.tags().get("db"));
        Assertions.assertEquals(ResourceIdentityType.NONE, response.identity().type());
        Assertions.assertEquals("byowbblgyavutp", response.steps().get(0).name());
        Assertions.assertEquals("joxoism", response.steps().get(0).branches().get(0).name());
        Assertions.assertEquals("ctxtgzukxi", response.selectors().get(0).id());
        Assertions.assertEquals(true, response.startOnCreation());
    }

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