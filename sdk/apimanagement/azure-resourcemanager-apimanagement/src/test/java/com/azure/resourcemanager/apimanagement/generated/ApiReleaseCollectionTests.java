// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.ApiReleaseCollection;
import org.junit.jupiter.api.Assertions;

public final class ApiReleaseCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApiReleaseCollection model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"apiId\":\"tnwu\",\"createdDateTime\":\"2021-10-03T15:35:19Z\",\"updatedDateTime\":\"2021-02-12T15:23:48Z\",\"notes\":\"ufizuckyf\"},\"id\":\"hr\",\"name\":\"idf\",\"type\":\"zwdzuh\"}],\"count\":6116347242940995661,\"nextLink\":\"sdkf\"}")
                .toObject(ApiReleaseCollection.class);
        Assertions.assertEquals(6116347242940995661L, model.count());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApiReleaseCollection model = new ApiReleaseCollection().withCount(6116347242940995661L);
        model = BinaryData.fromObject(model).toObject(ApiReleaseCollection.class);
        Assertions.assertEquals(6116347242940995661L, model.count());
    }
}