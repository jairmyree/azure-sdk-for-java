// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.fluent.models.SupportedSkuInner;

public final class SupportedSkuInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SupportedSkuInner model = BinaryData.fromString(
            "{\"name\":\"xlzevgbmqjqabcy\",\"familyName\":\"ivkwlzuvccfwnfnb\",\"capabilities\":[{\"name\":\"onlebxetqgtzxdpn\",\"value\":\"qqwx\"},{\"name\":\"feallnwsu\",\"value\":\"snjampmng\"}],\"batchSupportEndOfLife\":\"2021-10-17T15:10:59Z\"}")
            .toObject(SupportedSkuInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SupportedSkuInner model = new SupportedSkuInner();
        model = BinaryData.fromObject(model).toObject(SupportedSkuInner.class);
    }
}
