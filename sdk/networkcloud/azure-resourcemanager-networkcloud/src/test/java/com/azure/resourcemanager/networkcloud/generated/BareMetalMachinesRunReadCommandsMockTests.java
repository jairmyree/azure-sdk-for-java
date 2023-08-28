// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.networkcloud.NetworkCloudManager;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineCommandSpecification;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineRunReadCommandsParameters;
import com.azure.resourcemanager.networkcloud.models.OperationStatusResult;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class BareMetalMachinesRunReadCommandsMockTests {
    @Test
    public void testRunReadCommands() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"id\":\"c\",\"resourceId\":\"iciijqpkzfbojx\",\"name\":\"cs\",\"status\":\"yqwixvcpwnkwywzw\",\"percentComplete\":51.106243,\"startTime\":\"2021-01-17T11:27:13Z\",\"endTime\":\"2021-08-19T21:16:08Z\",\"operations\":[{\"id\":\"iqtamtyvsknxrw\",\"resourceId\":\"wnv\",\"name\":\"cfhzagxnvhycv\",\"status\":\"imwrzregzgyufu\",\"percentComplete\":40.361755,\"startTime\":\"2021-12-09T04:49:49Z\",\"endTime\":\"2021-05-15T13:13:10Z\",\"operations\":[{\"id\":\"z\",\"resourceId\":\"hmeott\",\"name\":\"jyosxwwh\",\"status\":\"h\",\"percentComplete\":7.83897,\"startTime\":\"2021-07-16T09:37:33Z\",\"endTime\":\"2021-03-13T03:13:47Z\",\"operations\":[{\"status\":\"i\"},{\"status\":\"jpnwynudql\"},{\"status\":\"zsauzp\"}]},{\"id\":\"eehuxiqhzlray\",\"resourceId\":\"zxlskihmxr\",\"name\":\"sajrednwyysht\",\"status\":\"w\",\"percentComplete\":79.93362,\"startTime\":\"2021-08-02T10:16:43Z\",\"endTime\":\"2021-05-31T07:56:10Z\",\"operations\":[{\"status\":\"zyifrkgwltx\"},{\"status\":\"qipxgzdyimsf\"}]},{\"id\":\"rpravkjogeslab\",\"resourceId\":\"mjkwynq\",\"name\":\"ekqsykvwjtqpkev\",\"status\":\"yltjcrspxklu\",\"percentComplete\":17.77879,\"startTime\":\"2021-10-15T09:44:01Z\",\"endTime\":\"2021-07-11T17:20:02Z\",\"operations\":[{\"status\":\"n\"},{\"status\":\"oytzpose\"}]},{\"id\":\"gpxvkqmaupxvpi\",\"resourceId\":\"f\",\"name\":\"fyzyzeyuub\",\"status\":\"idszl\",\"percentComplete\":16.524166,\"startTime\":\"2021-11-28T20:47:36Z\",\"endTime\":\"2021-05-05T02:15:37Z\",\"operations\":[{\"status\":\"gvfltgvdihoynkr\"},{\"status\":\"wetwkdr\"},{\"status\":\"yrucpcunnuzdq\"},{\"status\":\"moenodnaien\"}]}]},{\"id\":\"knd\",\"resourceId\":\"lqkaadlknwf\",\"name\":\"nniyopetxi\",\"status\":\"cnrly\",\"percentComplete\":22.466213,\"startTime\":\"2021-09-12T03:23:28Z\",\"endTime\":\"2021-01-20T08:40:36Z\",\"operations\":[{\"id\":\"kwqpat\",\"resourceId\":\"qsdtcjbctvivuzq\",\"name\":\"tuowogtgitsqh\",\"status\":\"vbrzcdb\",\"percentComplete\":84.15396,\"startTime\":\"2021-09-20T19:14:03Z\",\"endTime\":\"2021-05-28T10:26:09Z\",\"operations\":[{\"status\":\"mxeatkdbmwnrdjy\"},{\"status\":\"bqbnaomhjrmkuh\"},{\"status\":\"axljal\"}]},{\"id\":\"cjmobcanc\",\"resourceId\":\"xxqcwgaxf\",\"name\":\"aknokzwjjzrl\",\"status\":\"ixldzyyfy\",\"percentComplete\":24.225784,\"startTime\":\"2021-05-16T13:00:48Z\",\"endTime\":\"2021-03-18T19:43:55Z\",\"operations\":[{\"status\":\"puj\"}]},{\"id\":\"qlkjuv\",\"resourceId\":\"bmslzoyov\",\"name\":\"dbpqvybefgvm\",\"status\":\"nokcv\",\"percentComplete\":79.84004,\"startTime\":\"2021-01-01T17:46:17Z\",\"endTime\":\"2020-12-21T13:08:22Z\",\"operations\":[{\"status\":\"cua\"},{\"status\":\"t\"},{\"status\":\"hunlpirykycnd\"}]}]}]}";

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

        NetworkCloudManager manager =
            NetworkCloudManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        OperationStatusResult response =
            manager
                .bareMetalMachines()
                .runReadCommands(
                    "p",
                    "eqdurelyujlfyoum",
                    new BareMetalMachineRunReadCommandsParameters()
                        .withCommands(
                            Arrays
                                .asList(
                                    new BareMetalMachineCommandSpecification()
                                        .withArguments(Arrays.asList("eclcdigptajbrzm"))
                                        .withCommand("xucycijoclxi"),
                                    new BareMetalMachineCommandSpecification()
                                        .withArguments(Arrays.asList("jc", "z", "zjd"))
                                        .withCommand("r"),
                                    new BareMetalMachineCommandSpecification()
                                        .withArguments(Arrays.asList("txjeaoqaqbzgy", "fwwvuatbwbqam", "e", "liys"))
                                        .withCommand("pkcvmwf"),
                                    new BareMetalMachineCommandSpecification()
                                        .withArguments(Arrays.asList("xe"))
                                        .withCommand("myw")))
                        .withLimitTimeSeconds(8838975018818130961L),
                    com.azure.core.util.Context.NONE);

        Assertions.assertEquals("c", response.id());
        Assertions.assertEquals("cs", response.name());
        Assertions.assertEquals("yqwixvcpwnkwywzw", response.status());
        Assertions.assertEquals(51.106243F, response.percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-17T11:27:13Z"), response.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-19T21:16:08Z"), response.endTime());
        Assertions.assertEquals("iqtamtyvsknxrw", response.operations().get(0).id());
        Assertions.assertEquals("cfhzagxnvhycv", response.operations().get(0).name());
        Assertions.assertEquals("imwrzregzgyufu", response.operations().get(0).status());
        Assertions.assertEquals(40.361755F, response.operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-09T04:49:49Z"), response.operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-15T13:13:10Z"), response.operations().get(0).endTime());
        Assertions.assertEquals("z", response.operations().get(0).operations().get(0).id());
        Assertions.assertEquals("jyosxwwh", response.operations().get(0).operations().get(0).name());
        Assertions.assertEquals("h", response.operations().get(0).operations().get(0).status());
        Assertions.assertEquals(7.83897F, response.operations().get(0).operations().get(0).percentComplete());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-07-16T09:37:33Z"),
                response.operations().get(0).operations().get(0).startTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-03-13T03:13:47Z"),
                response.operations().get(0).operations().get(0).endTime());
        Assertions.assertEquals("i", response.operations().get(0).operations().get(0).operations().get(0).status());
    }
}