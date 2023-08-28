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
import com.azure.resourcemanager.networkcloud.models.OperationStatusResult;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class StorageAppliancesDisableRemoteVendorManagementMockTests {
    @Test
    public void testDisableRemoteVendorManagement() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"id\":\"vmi\",\"resourceId\":\"beaeq\",\"name\":\"mhkdclacroczfm\",\"status\":\"ner\",\"percentComplete\":92.16802,\"startTime\":\"2021-10-24T05:01:58Z\",\"endTime\":\"2021-11-25T04:20:11Z\",\"operations\":[{\"id\":\"ezbzu\",\"resourceId\":\"dlevzskejcgw\",\"name\":\"gqkstyecupyu\",\"status\":\"jparda\",\"percentComplete\":63.3447,\"startTime\":\"2021-09-07T03:41:26Z\",\"endTime\":\"2021-11-22T19:52:24Z\",\"operations\":[{\"id\":\"dqwuzvcm\",\"resourceId\":\"kxizek\",\"name\":\"frjwucaon\",\"status\":\"vajbvbnkrdemdid\",\"percentComplete\":59.99933,\"startTime\":\"2021-06-16T22:26:17Z\",\"endTime\":\"2021-02-15T15:27:55Z\",\"operations\":[{\"status\":\"dydamisvpztdivy\"},{\"status\":\"pxkqejtpjfojiunr\"},{\"status\":\"shxuknsykdtoi\"}]},{\"id\":\"ncdrcoanvxuldx\",\"resourceId\":\"c\",\"name\":\"nlb\",\"status\":\"fxlupibaq\",\"percentComplete\":50.182266,\"startTime\":\"2021-01-26T00:12:57Z\",\"endTime\":\"2021-07-13T09:24:59Z\",\"operations\":[{\"status\":\"ghlww\"},{\"status\":\"ogvgfklqiyn\"}]}]},{\"id\":\"elsbfvd\",\"resourceId\":\"rk\",\"name\":\"sgt\",\"status\":\"ns\",\"percentComplete\":17.492521,\"startTime\":\"2021-08-11T16:04:23Z\",\"endTime\":\"2021-02-14T08:51:36Z\",\"operations\":[{\"id\":\"myndnox\",\"resourceId\":\"nrqa\",\"name\":\"tnndxolousdvr\",\"status\":\"ptqmawzjdrpiz\",\"percentComplete\":2.5345922,\"startTime\":\"2021-11-04T23:11:12Z\",\"endTime\":\"2021-08-29T08:53:42Z\",\"operations\":[{\"status\":\"btqgkujdsoox\"},{\"status\":\"qwoeurbtigapd\"},{\"status\":\"arikeejdpdfhtwmm\"}]},{\"id\":\"bri\",\"resourceId\":\"lwwtr\",\"name\":\"eqkvyhzokpoyu\",\"status\":\"h\",\"percentComplete\":58.077705,\"startTime\":\"2021-04-30T20:52:44Z\",\"endTime\":\"2020-12-26T02:06:50Z\",\"operations\":[{\"status\":\"hmpoe\"},{\"status\":\"nglpwsada\"},{\"status\":\"jsumxpezcoio\"},{\"status\":\"jrmfqzwqd\"}]},{\"id\":\"eedcnwmywx\",\"resourceId\":\"zkvemy\",\"name\":\"pczaqpqif\",\"status\":\"bmptrwtxzu\",\"percentComplete\":62.856464,\"startTime\":\"2021-07-31T07:19:02Z\",\"endTime\":\"2021-01-26T13:56:03Z\",\"operations\":[{\"status\":\"izexroqsqj\"}]}]},{\"id\":\"thsplwsttxsr\",\"resourceId\":\"fq\",\"name\":\"niceovxgzwh\",\"status\":\"xyrujmt\",\"percentComplete\":89.48731,\"startTime\":\"2021-06-11T17:18:42Z\",\"endTime\":\"2021-05-01T14:01Z\",\"operations\":[{\"id\":\"zix\",\"resourceId\":\"hfnkvycqqqds\",\"name\":\"pnq\",\"status\":\"wzxhrptyodlhkf\",\"percentComplete\":83.21142,\"startTime\":\"2021-11-27T23:25:35Z\",\"endTime\":\"2021-08-03T01:08:41Z\",\"operations\":[{\"status\":\"jopnouhbqezk\"}]},{\"id\":\"aluzyi\",\"resourceId\":\"cvcewb\",\"name\":\"hdgsjsatm\",\"status\":\"ncmazdf\",\"percentComplete\":32.84828,\"startTime\":\"2021-06-20T07:17:13Z\",\"endTime\":\"2021-10-28T00:47:24Z\",\"operations\":[{\"status\":\"jparnpvgrszrbwt\"},{\"status\":\"rcwgzwllxzlhhf\"}]},{\"id\":\"cfculzj\",\"resourceId\":\"hp\",\"name\":\"wvyldqpzf\",\"status\":\"xsoxi\",\"percentComplete\":12.493217,\"startTime\":\"2021-04-15T23:14:57Z\",\"endTime\":\"2021-06-21T12:55:01Z\",\"operations\":[{\"status\":\"ocqsxy\"},{\"status\":\"qqt\"}]},{\"id\":\"wdwisvn\",\"resourceId\":\"ylajam\",\"name\":\"jyh\",\"status\":\"tpzcr\",\"percentComplete\":14.158112,\"startTime\":\"2021-06-03T15:20:33Z\",\"endTime\":\"2021-07-06T10:55:20Z\",\"operations\":[{\"status\":\"anhkigglclwalh\"},{\"status\":\"ubhg\"}]}]},{\"id\":\"txdqcmy\",\"resourceId\":\"ajqzj\",\"name\":\"lecxbibiwks\",\"status\":\"egyxsbfpzvoik\",\"percentComplete\":29.30662,\"startTime\":\"2021-05-16T11:22:24Z\",\"endTime\":\"2021-05-05T07:36:45Z\",\"operations\":[{\"id\":\"shl\",\"resourceId\":\"pblalhhez\",\"name\":\"kissaidqzsaa\",\"status\":\"qdsgptotxj\",\"percentComplete\":12.192118,\"startTime\":\"2021-09-09T22:28:04Z\",\"endTime\":\"2021-06-09T19:51:50Z\",\"operations\":[{\"status\":\"tbfijz\"}]},{\"id\":\"o\",\"resourceId\":\"olbuauktwieope\",\"name\":\"lxqdwr\",\"status\":\"wyil\",\"percentComplete\":59.643085,\"startTime\":\"2021-11-28T03:24:57Z\",\"endTime\":\"2021-05-31T05:16:20Z\",\"operations\":[{\"status\":\"yauxr\"},{\"status\":\"ddobmcnltmwyt\"}]},{\"id\":\"sqycmmoxfablqg\",\"resourceId\":\"bmwhrialiwr\",\"name\":\"gnwplrrb\",\"status\":\"hctsbbibti\",\"percentComplete\":58.901154,\"startTime\":\"2021-08-07T10:14:04Z\",\"endTime\":\"2021-08-27T04:29:56Z\",\"operations\":[{\"status\":\"bfs\"}]}]}]}";

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
                .storageAppliances()
                .disableRemoteVendorManagement("zjemexmnvkvm", "wrxlniwmcpmrrdlh", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("vmi", response.id());
        Assertions.assertEquals("mhkdclacroczfm", response.name());
        Assertions.assertEquals("ner", response.status());
        Assertions.assertEquals(92.16802F, response.percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-24T05:01:58Z"), response.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-25T04:20:11Z"), response.endTime());
        Assertions.assertEquals("ezbzu", response.operations().get(0).id());
        Assertions.assertEquals("gqkstyecupyu", response.operations().get(0).name());
        Assertions.assertEquals("jparda", response.operations().get(0).status());
        Assertions.assertEquals(63.3447F, response.operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-07T03:41:26Z"), response.operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-22T19:52:24Z"), response.operations().get(0).endTime());
        Assertions.assertEquals("dqwuzvcm", response.operations().get(0).operations().get(0).id());
        Assertions.assertEquals("frjwucaon", response.operations().get(0).operations().get(0).name());
        Assertions.assertEquals("vajbvbnkrdemdid", response.operations().get(0).operations().get(0).status());
        Assertions.assertEquals(59.99933F, response.operations().get(0).operations().get(0).percentComplete());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-06-16T22:26:17Z"),
                response.operations().get(0).operations().get(0).startTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-02-15T15:27:55Z"),
                response.operations().get(0).operations().get(0).endTime());
        Assertions
            .assertEquals(
                "dydamisvpztdivy", response.operations().get(0).operations().get(0).operations().get(0).status());
    }
}