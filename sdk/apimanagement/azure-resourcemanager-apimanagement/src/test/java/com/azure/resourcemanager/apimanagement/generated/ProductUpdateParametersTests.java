// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.ProductState;
import com.azure.resourcemanager.apimanagement.models.ProductUpdateParameters;
import org.junit.jupiter.api.Assertions;

public final class ProductUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProductUpdateParameters model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"displayName\":\"bpxtokljmtznpaxw\",\"description\":\"tyyqiprcltungb\",\"terms\":\"ljckmiigz\",\"subscriptionRequired\":false,\"approvalRequired\":false,\"subscriptionsLimit\":984437260,\"state\":\"notPublished\"}}")
                .toObject(ProductUpdateParameters.class);
        Assertions.assertEquals("bpxtokljmtznpaxw", model.displayName());
        Assertions.assertEquals("tyyqiprcltungb", model.description());
        Assertions.assertEquals("ljckmiigz", model.terms());
        Assertions.assertEquals(false, model.subscriptionRequired());
        Assertions.assertEquals(false, model.approvalRequired());
        Assertions.assertEquals(984437260, model.subscriptionsLimit());
        Assertions.assertEquals(ProductState.NOT_PUBLISHED, model.state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProductUpdateParameters model =
            new ProductUpdateParameters()
                .withDisplayName("bpxtokljmtznpaxw")
                .withDescription("tyyqiprcltungb")
                .withTerms("ljckmiigz")
                .withSubscriptionRequired(false)
                .withApprovalRequired(false)
                .withSubscriptionsLimit(984437260)
                .withState(ProductState.NOT_PUBLISHED);
        model = BinaryData.fromObject(model).toObject(ProductUpdateParameters.class);
        Assertions.assertEquals("bpxtokljmtznpaxw", model.displayName());
        Assertions.assertEquals("tyyqiprcltungb", model.description());
        Assertions.assertEquals("ljckmiigz", model.terms());
        Assertions.assertEquals(false, model.subscriptionRequired());
        Assertions.assertEquals(false, model.approvalRequired());
        Assertions.assertEquals(984437260, model.subscriptionsLimit());
        Assertions.assertEquals(ProductState.NOT_PUBLISHED, model.state());
    }
}