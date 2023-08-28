// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dynatrace.fluent.models.MarketplaceSaaSResourceDetailsResponseInner;
import com.azure.resourcemanager.dynatrace.models.MarketplaceSubscriptionStatus;
import org.junit.jupiter.api.Assertions;

public final class MarketplaceSaaSResourceDetailsResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MarketplaceSaaSResourceDetailsResponseInner model =
            BinaryData
                .fromString(
                    "{\"marketplaceSaaSResourceId\":\"j\",\"planId\":\"dxob\",\"marketplaceSubscriptionStatus\":\"Active\"}")
                .toObject(MarketplaceSaaSResourceDetailsResponseInner.class);
        Assertions.assertEquals("j", model.marketplaceSaaSResourceId());
        Assertions.assertEquals("dxob", model.planId());
        Assertions.assertEquals(MarketplaceSubscriptionStatus.ACTIVE, model.marketplaceSubscriptionStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MarketplaceSaaSResourceDetailsResponseInner model =
            new MarketplaceSaaSResourceDetailsResponseInner()
                .withMarketplaceSaaSResourceId("j")
                .withPlanId("dxob")
                .withMarketplaceSubscriptionStatus(MarketplaceSubscriptionStatus.ACTIVE);
        model = BinaryData.fromObject(model).toObject(MarketplaceSaaSResourceDetailsResponseInner.class);
        Assertions.assertEquals("j", model.marketplaceSaaSResourceId());
        Assertions.assertEquals("dxob", model.planId());
        Assertions.assertEquals(MarketplaceSubscriptionStatus.ACTIVE, model.marketplaceSubscriptionStatus());
    }
}