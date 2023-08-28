// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.NetworkStatusContractInner;
import com.azure.resourcemanager.apimanagement.models.ConnectivityStatusContract;
import com.azure.resourcemanager.apimanagement.models.ConnectivityStatusType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NetworkStatusContractInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkStatusContractInner model =
            BinaryData
                .fromString(
                    "{\"dnsServers\":[\"htwmmkfqbriqulww\",\"rjmeqkvyhz\",\"kpoyuohue\"],\"connectivityStatus\":[{\"name\":\"na\",\"status\":\"failure\",\"error\":\"hmpoe\",\"lastUpdated\":\"2021-09-06T09:01:37Z\",\"lastStatusChange\":\"2021-03-30T22:48:53Z\",\"resourceType\":\"lpwsadaxjs\",\"isOptional\":false},{\"name\":\"xpez\",\"status\":\"failure\",\"error\":\"oyj\",\"lastUpdated\":\"2021-03-19T15:03:09Z\",\"lastStatusChange\":\"2021-04-29T14:56:08Z\",\"resourceType\":\"qzwqdnxke\",\"isOptional\":true}]}")
                .toObject(NetworkStatusContractInner.class);
        Assertions.assertEquals("htwmmkfqbriqulww", model.dnsServers().get(0));
        Assertions.assertEquals("na", model.connectivityStatus().get(0).name());
        Assertions.assertEquals(ConnectivityStatusType.FAILURE, model.connectivityStatus().get(0).status());
        Assertions.assertEquals("hmpoe", model.connectivityStatus().get(0).error());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-09-06T09:01:37Z"), model.connectivityStatus().get(0).lastUpdated());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-03-30T22:48:53Z"), model.connectivityStatus().get(0).lastStatusChange());
        Assertions.assertEquals("lpwsadaxjs", model.connectivityStatus().get(0).resourceType());
        Assertions.assertEquals(false, model.connectivityStatus().get(0).isOptional());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkStatusContractInner model =
            new NetworkStatusContractInner()
                .withDnsServers(Arrays.asList("htwmmkfqbriqulww", "rjmeqkvyhz", "kpoyuohue"))
                .withConnectivityStatus(
                    Arrays
                        .asList(
                            new ConnectivityStatusContract()
                                .withName("na")
                                .withStatus(ConnectivityStatusType.FAILURE)
                                .withError("hmpoe")
                                .withLastUpdated(OffsetDateTime.parse("2021-09-06T09:01:37Z"))
                                .withLastStatusChange(OffsetDateTime.parse("2021-03-30T22:48:53Z"))
                                .withResourceType("lpwsadaxjs")
                                .withIsOptional(false),
                            new ConnectivityStatusContract()
                                .withName("xpez")
                                .withStatus(ConnectivityStatusType.FAILURE)
                                .withError("oyj")
                                .withLastUpdated(OffsetDateTime.parse("2021-03-19T15:03:09Z"))
                                .withLastStatusChange(OffsetDateTime.parse("2021-04-29T14:56:08Z"))
                                .withResourceType("qzwqdnxke")
                                .withIsOptional(true)));
        model = BinaryData.fromObject(model).toObject(NetworkStatusContractInner.class);
        Assertions.assertEquals("htwmmkfqbriqulww", model.dnsServers().get(0));
        Assertions.assertEquals("na", model.connectivityStatus().get(0).name());
        Assertions.assertEquals(ConnectivityStatusType.FAILURE, model.connectivityStatus().get(0).status());
        Assertions.assertEquals("hmpoe", model.connectivityStatus().get(0).error());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-09-06T09:01:37Z"), model.connectivityStatus().get(0).lastUpdated());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-03-30T22:48:53Z"), model.connectivityStatus().get(0).lastStatusChange());
        Assertions.assertEquals("lpwsadaxjs", model.connectivityStatus().get(0).resourceType());
        Assertions.assertEquals(false, model.connectivityStatus().get(0).isOptional());
    }
}