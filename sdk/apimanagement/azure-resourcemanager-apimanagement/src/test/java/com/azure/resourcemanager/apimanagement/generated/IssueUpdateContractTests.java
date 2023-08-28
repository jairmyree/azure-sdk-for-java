// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.IssueUpdateContract;
import com.azure.resourcemanager.apimanagement.models.State;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class IssueUpdateContractTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IssueUpdateContract model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"title\":\"vweht\",\"description\":\"mxhzzysevus\",\"userId\":\"vzrrryveimi\",\"createdDate\":\"2021-06-20T09:39:58Z\",\"state\":\"open\",\"apiId\":\"atvfuzkaftj\"}}")
                .toObject(IssueUpdateContract.class);
        Assertions.assertEquals("vweht", model.title());
        Assertions.assertEquals("mxhzzysevus", model.description());
        Assertions.assertEquals("vzrrryveimi", model.userId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-20T09:39:58Z"), model.createdDate());
        Assertions.assertEquals(State.OPEN, model.state());
        Assertions.assertEquals("atvfuzkaftj", model.apiId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IssueUpdateContract model =
            new IssueUpdateContract()
                .withTitle("vweht")
                .withDescription("mxhzzysevus")
                .withUserId("vzrrryveimi")
                .withCreatedDate(OffsetDateTime.parse("2021-06-20T09:39:58Z"))
                .withState(State.OPEN)
                .withApiId("atvfuzkaftj");
        model = BinaryData.fromObject(model).toObject(IssueUpdateContract.class);
        Assertions.assertEquals("vweht", model.title());
        Assertions.assertEquals("mxhzzysevus", model.description());
        Assertions.assertEquals("vzrrryveimi", model.userId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-20T09:39:58Z"), model.createdDate());
        Assertions.assertEquals(State.OPEN, model.state());
        Assertions.assertEquals("atvfuzkaftj", model.apiId());
    }
}