// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.IssueCollection;
import org.junit.jupiter.api.Assertions;

public final class IssueCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IssueCollection model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"title\":\"apx\",\"description\":\"iyfjjkbajbuscg\",\"userId\":\"uusioycblev\",\"createdDate\":\"2021-03-21T03:09:44Z\",\"state\":\"removed\",\"apiId\":\"yxkyxlz\"},\"id\":\"sjgkzzltafh\",\"name\":\"zffovwmbjl\",\"type\":\"qsczpgvdwnapfdqw\"},{\"properties\":{\"title\":\"ftptnuwj\",\"description\":\"kschgcgqyhle\",\"userId\":\"eyqrhv\",\"createdDate\":\"2021-05-10T20:36Z\",\"state\":\"proposed\",\"apiId\":\"jv\"},\"id\":\"kwiswskukjtas\",\"name\":\"vwisp\",\"type\":\"xkdtxfkndlqvtwkn\"},{\"properties\":{\"title\":\"mmbugtywatmqaq\",\"description\":\"ueatgroe\",\"userId\":\"hoygzcbyfq\",\"createdDate\":\"2021-12-07T02:27:26Z\",\"state\":\"removed\",\"apiId\":\"tehqpuvjmvq\"},\"id\":\"tdwckygr\",\"name\":\"ejnndljdju\",\"type\":\"kb\"}],\"count\":3097515429370692173,\"nextLink\":\"n\"}")
                .toObject(IssueCollection.class);
        Assertions.assertEquals(3097515429370692173L, model.count());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IssueCollection model = new IssueCollection().withCount(3097515429370692173L);
        model = BinaryData.fromObject(model).toObject(IssueCollection.class);
        Assertions.assertEquals(3097515429370692173L, model.count());
    }
}