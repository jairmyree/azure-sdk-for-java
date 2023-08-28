// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.ApiRevisionCollection;
import org.junit.jupiter.api.Assertions;

public final class ApiRevisionCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApiRevisionCollection model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"apiId\":\"ckbasyypndd\",\"apiRevision\":\"gcbacphejkot\",\"createdDateTime\":\"2021-05-11T13:05:51Z\",\"updatedDateTime\":\"2021-02-05T05:14:14Z\",\"description\":\"l\",\"privateUrl\":\"dlikwyqkgfgibma\",\"isOnline\":false,\"isCurrent\":true},{\"apiId\":\"s\",\"apiRevision\":\"yb\",\"createdDateTime\":\"2021-03-26T22:16:08Z\",\"updatedDateTime\":\"2021-02-21T09:55:36Z\",\"description\":\"ytb\",\"privateUrl\":\"qfou\",\"isOnline\":true,\"isCurrent\":true},{\"apiId\":\"zsm\",\"apiRevision\":\"mglougpbkw\",\"createdDateTime\":\"2021-06-18T17:23:58Z\",\"updatedDateTime\":\"2021-03-15T14:00:11Z\",\"description\":\"qktapspwgcuert\",\"privateUrl\":\"kdosvqw\",\"isOnline\":true,\"isCurrent\":true},{\"apiId\":\"bjf\",\"apiRevision\":\"gmbmbexppbh\",\"createdDateTime\":\"2021-09-17T16:41:16Z\",\"updatedDateTime\":\"2021-11-29T14:18:07Z\",\"description\":\"fpfpsalgbquxigj\",\"privateUrl\":\"gzjaoyfhrtxilne\",\"isOnline\":false,\"isCurrent\":true}],\"count\":1076277813436926770,\"nextLink\":\"juvf\"}")
                .toObject(ApiRevisionCollection.class);
        Assertions.assertEquals(1076277813436926770L, model.count());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApiRevisionCollection model = new ApiRevisionCollection().withCount(1076277813436926770L);
        model = BinaryData.fromObject(model).toObject(ApiRevisionCollection.class);
        Assertions.assertEquals(1076277813436926770L, model.count());
    }
}