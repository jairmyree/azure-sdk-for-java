// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.appcontainers.ContainerAppsApiManager;
import com.azure.resourcemanager.appcontainers.models.JobExecution;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ResourceProvidersJobExecutionWithResponseMockTests {
    @Test
    public void testJobExecutionWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"name\":\"ymvqdbpbhfckdvez\",\"id\":\"cssbzhddu\",\"type\":\"nqfblhkalehpava\",\"status\":\"Running\",\"startTime\":\"2021-07-31T19:35:54Z\",\"endTime\":\"2021-02-25T01:40:45Z\",\"template\":{\"containers\":[{\"image\":\"gdmin\",\"name\":\"tteajohiygs\",\"command\":[\"onhpcz\",\"kmktpvwxqcseh\",\"hkhufm\",\"qumq\"],\"args\":[\"ydzulodsaeuzan\"],\"env\":[{},{},{}],\"resources\":{\"cpu\":51.25538357259788,\"memory\":\"wphpzfngqj\",\"ephemeralStorage\":\"idftujwjjufwbe\"}},{\"image\":\"k\",\"name\":\"rhtssr\",\"command\":[\"mdvhazcvjy\",\"iqswbqer\"],\"args\":[\"iytxt\",\"gukvlbpkt\",\"dstyouam\"],\"env\":[{},{},{}],\"resources\":{\"cpu\":89.09465324456659,\"memory\":\"owegmmutey\",\"ephemeralStorage\":\"yguqigijiitns\"}},{\"image\":\"lz\",\"name\":\"sygrijwa\",\"command\":[\"anra\",\"bfu\",\"qfrojsydgrhyd\"],\"args\":[\"ywezskiecafyg\",\"m\",\"ieqvds\"],\"env\":[{},{},{},{}],\"resources\":{\"cpu\":9.705369980968115,\"memory\":\"ah\",\"ephemeralStorage\":\"xalybxawoijpo\"}},{\"image\":\"blxpkkwjdjodq\",\"name\":\"kincnremeh\",\"command\":[\"zhceumoqodk\",\"dppyibngqlady\",\"rxwhydtlu\",\"vadswzs\"],\"args\":[\"emlowuowhl\",\"lnwy\",\"mouvbl\",\"mo\"],\"env\":[{},{}],\"resources\":{\"cpu\":85.24180497890332,\"memory\":\"wtdvrfmvli\",\"ephemeralStorage\":\"vjdrqcrjidhftuk\"}}],\"initContainers\":[{\"image\":\"lwyojbfqzdkfnj\",\"name\":\"xhafratqx\",\"command\":[\"roumzznva\",\"qjrhuzgfxonj\"],\"args\":[\"sllywpvtio\",\"zbpdbo\",\"lgry\",\"qiuasigrows\"],\"env\":[{},{}],\"resources\":{\"cpu\":56.766450145521155,\"memory\":\"djboqgrmtq\",\"ephemeralStorage\":\"qevadrmmw\"}},{\"image\":\"awvcmjzkxiid\",\"name\":\"czskoswoqiqazu\",\"command\":[\"xzkrrcoi\",\"sbamnppcc\"],\"args\":[\"ztdsbeza\"],\"env\":[{}],\"resources\":{\"cpu\":87.2973677793008,\"memory\":\"izhyhnep\",\"ephemeralStorage\":\"etiarxqiubxdukec\"}},{\"image\":\"dazvdhctm\",\"name\":\"os\",\"command\":[\"blnsntrpcaqk\",\"ofkbtf\",\"hklbnldpvcbh\"],\"args\":[\"yq\"],\"env\":[{},{},{}],\"resources\":{\"cpu\":15.430525461055334,\"memory\":\"rp\",\"ephemeralStorage\":\"r\"}}]}}";

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

        ContainerAppsApiManager manager =
            ContainerAppsApiManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        JobExecution response =
            manager
                .resourceProviders()
                .jobExecutionWithResponse("ndzfqivjreuyk", "bmnwa", "ltbxoeeonqlnfw", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("ymvqdbpbhfckdvez", response.name());
        Assertions.assertEquals("cssbzhddu", response.id());
        Assertions.assertEquals("nqfblhkalehpava", response.type());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-31T19:35:54Z"), response.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-25T01:40:45Z"), response.endTime());
        Assertions.assertEquals("gdmin", response.template().containers().get(0).image());
        Assertions.assertEquals("tteajohiygs", response.template().containers().get(0).name());
        Assertions.assertEquals("onhpcz", response.template().containers().get(0).command().get(0));
        Assertions.assertEquals("ydzulodsaeuzan", response.template().containers().get(0).args().get(0));
        Assertions.assertEquals(51.25538357259788D, response.template().containers().get(0).resources().cpu());
        Assertions.assertEquals("wphpzfngqj", response.template().containers().get(0).resources().memory());
        Assertions.assertEquals("lwyojbfqzdkfnj", response.template().initContainers().get(0).image());
        Assertions.assertEquals("xhafratqx", response.template().initContainers().get(0).name());
        Assertions.assertEquals("roumzznva", response.template().initContainers().get(0).command().get(0));
        Assertions.assertEquals("sllywpvtio", response.template().initContainers().get(0).args().get(0));
        Assertions.assertEquals(56.766450145521155D, response.template().initContainers().get(0).resources().cpu());
        Assertions.assertEquals("djboqgrmtq", response.template().initContainers().get(0).resources().memory());
    }
}