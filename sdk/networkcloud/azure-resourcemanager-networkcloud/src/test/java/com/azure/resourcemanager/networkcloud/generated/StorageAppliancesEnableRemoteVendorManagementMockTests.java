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
import com.azure.resourcemanager.networkcloud.models.StorageApplianceEnableRemoteVendorManagementParameters;
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

public final class StorageAppliancesEnableRemoteVendorManagementMockTests {
    @Test
    public void testEnableRemoteVendorManagement() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"id\":\"cmvouujxdiikmoxr\",\"resourceId\":\"svavlrxikjmoy\",\"name\":\"unpip\",\"status\":\"wybsz\",\"percentComplete\":45.25683,\"startTime\":\"2021-07-17T11:00:27Z\",\"endTime\":\"2021-07-24T01:28:12Z\",\"operations\":[{\"id\":\"saebwfwhxorpwal\",\"resourceId\":\"wugexojfccyl\",\"name\":\"rh\",\"status\":\"hvazjpwexcdr\",\"percentComplete\":98.35904,\"startTime\":\"2020-12-25T07:30:14Z\",\"endTime\":\"2021-04-22T07:08:27Z\",\"operations\":[{\"id\":\"mn\",\"resourceId\":\"jgpjeuxs\",\"name\":\"lokfpmijpdvzv\",\"status\":\"bhwbdqufvcgnrgla\",\"percentComplete\":46.64172,\"startTime\":\"2021-02-16T19:16:30Z\",\"endTime\":\"2021-07-03T16:35:54Z\",\"operations\":[{\"status\":\"afebzxfkjq\"},{\"status\":\"tibhlennt\"}]},{\"id\":\"k\",\"resourceId\":\"abdu\",\"name\":\"zmlghny\",\"status\":\"v\",\"percentComplete\":29.506672,\"startTime\":\"2021-03-08T04:49:44Z\",\"endTime\":\"2021-10-08T06:38:04Z\",\"operations\":[{\"status\":\"dixqbo\"},{\"status\":\"xvhhyqq\"},{\"status\":\"gatxgrznmginmtsd\"}]},{\"id\":\"hwkibmgjymn\",\"resourceId\":\"cag\",\"name\":\"rwcqzo\",\"status\":\"fjnqjsvepf\",\"percentComplete\":28.686773,\"startTime\":\"2021-10-14T06:29:09Z\",\"endTime\":\"2021-08-28T18:55:34Z\",\"operations\":[{\"status\":\"ljekn\"},{\"status\":\"qnwjjq\"},{\"status\":\"owkdnjr\"},{\"status\":\"gkr\"}]},{\"id\":\"ehycpn\",\"resourceId\":\"awonoehrguqlhfw\",\"name\":\"bjzm\",\"status\":\"yrguyfazbk\",\"percentComplete\":54.576153,\"startTime\":\"2021-07-30T06:19:12Z\",\"endTime\":\"2021-01-11T00:43:15Z\",\"operations\":[{\"status\":\"mxkbcjwwdxomra\"},{\"status\":\"ppkeboozflyacag\"},{\"status\":\"eda\"},{\"status\":\"i\"}]}]},{\"id\":\"gdtwgabd\",\"resourceId\":\"kuz\",\"name\":\"jecooyvhtu\",\"status\":\"bpelniibncgagd\",\"percentComplete\":12.446653,\"startTime\":\"2021-10-11T20:24:34Z\",\"endTime\":\"2021-02-10T14:42:39Z\",\"operations\":[{\"id\":\"yfaofdf\",\"resourceId\":\"tncwmhjobzrfpr\",\"name\":\"dc\",\"status\":\"h\",\"percentComplete\":62.696774,\"startTime\":\"2021-02-13T09:54:56Z\",\"endTime\":\"2021-01-18T02:03:23Z\",\"operations\":[{\"status\":\"whgkgsoa\"},{\"status\":\"oorssatfy\"},{\"status\":\"ipufdmxuqbdq\"}]}]},{\"id\":\"tuxvzfqayopbt\",\"resourceId\":\"xhgvbhxmndztgsq\",\"name\":\"yqmarxneib\",\"status\":\"gbrhbjd\",\"percentComplete\":11.403805,\"startTime\":\"2021-12-08T10:08:51Z\",\"endTime\":\"2021-02-23T12:33:43Z\",\"operations\":[{\"id\":\"uwnnohmmzngoc\",\"resourceId\":\"juypwyiulaynosu\",\"name\":\"fhaxttpf\",\"status\":\"mwgsghq\",\"percentComplete\":76.55331,\"startTime\":\"2021-08-23T21:38:48Z\",\"endTime\":\"2021-07-11T09:50:13Z\",\"operations\":[{\"status\":\"qm\"},{\"status\":\"lfeothxuarigr\"},{\"status\":\"dlj\"}]},{\"id\":\"hvkr\",\"resourceId\":\"kuastaxklpr\",\"name\":\"l\",\"status\":\"gltoizwxvscksgf\",\"percentComplete\":68.861595,\"startTime\":\"2021-12-05T19:00:36Z\",\"endTime\":\"2021-10-07T14:16:16Z\",\"operations\":[{\"status\":\"fxcz\"},{\"status\":\"fcck\"}]},{\"id\":\"wletyveszrtlhpdh\",\"resourceId\":\"nctaczcn\",\"name\":\"mbbfnv\",\"status\":\"x\",\"percentComplete\":74.21378,\"startTime\":\"2021-12-03T14:45:06Z\",\"endTime\":\"2021-06-06T06:14:19Z\",\"operations\":[{\"status\":\"iklsmni\"},{\"status\":\"qlcoqksyiibhyx\"}]},{\"id\":\"bu\",\"resourceId\":\"vqdorbccqcd\",\"name\":\"hojvlirkn\",\"status\":\"c\",\"percentComplete\":28.408623,\"startTime\":\"2021-02-03T12:43:50Z\",\"endTime\":\"2021-10-15T07:18:41Z\",\"operations\":[{\"status\":\"gzlgpyaixihz\"},{\"status\":\"jjtsm\"},{\"status\":\"ydqfttkacy\"}]}]}]}";

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
                .enableRemoteVendorManagement(
                    "bewfcuqfpyyxm",
                    "rmtmvwi",
                    new StorageApplianceEnableRemoteVendorManagementParameters()
                        .withSupportEndpoints(Arrays.asList("eyyjshcybwfuppox")),
                    com.azure.core.util.Context.NONE);

        Assertions.assertEquals("cmvouujxdiikmoxr", response.id());
        Assertions.assertEquals("unpip", response.name());
        Assertions.assertEquals("wybsz", response.status());
        Assertions.assertEquals(45.25683F, response.percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-17T11:00:27Z"), response.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-24T01:28:12Z"), response.endTime());
        Assertions.assertEquals("saebwfwhxorpwal", response.operations().get(0).id());
        Assertions.assertEquals("rh", response.operations().get(0).name());
        Assertions.assertEquals("hvazjpwexcdr", response.operations().get(0).status());
        Assertions.assertEquals(98.35904F, response.operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-25T07:30:14Z"), response.operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-22T07:08:27Z"), response.operations().get(0).endTime());
        Assertions.assertEquals("mn", response.operations().get(0).operations().get(0).id());
        Assertions.assertEquals("lokfpmijpdvzv", response.operations().get(0).operations().get(0).name());
        Assertions.assertEquals("bhwbdqufvcgnrgla", response.operations().get(0).operations().get(0).status());
        Assertions.assertEquals(46.64172F, response.operations().get(0).operations().get(0).percentComplete());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-02-16T19:16:30Z"),
                response.operations().get(0).operations().get(0).startTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-07-03T16:35:54Z"),
                response.operations().get(0).operations().get(0).endTime());
        Assertions
            .assertEquals("afebzxfkjq", response.operations().get(0).operations().get(0).operations().get(0).status());
    }
}