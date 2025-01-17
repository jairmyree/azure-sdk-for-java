// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.quota.fluent.models.CurrentQuotaLimitBaseInner;
import com.azure.resourcemanager.quota.models.LimitJsonObject;
import com.azure.resourcemanager.quota.models.QuotaProperties;
import com.azure.resourcemanager.quota.models.ResourceName;
import org.junit.jupiter.api.Assertions;

public final class CurrentQuotaLimitBaseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CurrentQuotaLimitBaseInner model = BinaryData.fromString(
            "{\"properties\":{\"limit\":{\"limitObjectType\":\"LimitJsonObject\"},\"unit\":\"qzrnkcqvyxlwhz\",\"name\":{\"value\":\"cohoq\",\"localizedValue\":\"wvl\"},\"resourceType\":\"avwhheunm\",\"quotaPeriod\":\"hgyxzkonoc\",\"isQuotaApplicable\":true,\"properties\":\"datalyaxuc\"},\"id\":\"nuqszfkbey\",\"name\":\"ewrmjmwvvjektc\",\"type\":\"senhwlrs\"}")
            .toObject(CurrentQuotaLimitBaseInner.class);
        Assertions.assertEquals("cohoq", model.properties().name().value());
        Assertions.assertEquals("avwhheunm", model.properties().resourceType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CurrentQuotaLimitBaseInner model
            = new CurrentQuotaLimitBaseInner().withProperties(new QuotaProperties().withLimit(new LimitJsonObject())
                .withName(new ResourceName().withValue("cohoq"))
                .withResourceType("avwhheunm")
                .withProperties("datalyaxuc"));
        model = BinaryData.fromObject(model).toObject(CurrentQuotaLimitBaseInner.class);
        Assertions.assertEquals("cohoq", model.properties().name().value());
        Assertions.assertEquals("avwhheunm", model.properties().resourceType());
    }
}
