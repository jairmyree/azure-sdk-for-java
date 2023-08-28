// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.PolicyFragmentCollectionInner;
import com.azure.resourcemanager.apimanagement.fluent.models.PolicyFragmentContractInner;
import com.azure.resourcemanager.apimanagement.models.PolicyFragmentContentFormat;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PolicyFragmentCollectionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PolicyFragmentCollectionInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"value\":\"dawsxmrsz\",\"description\":\"nimx\",\"format\":\"xml\"},\"id\":\"erxrzutylcurza\",\"name\":\"mnb\",\"type\":\"qaeht\"}],\"count\":9000451508924341558,\"nextLink\":\"nvynfaooeactedc\"}")
                .toObject(PolicyFragmentCollectionInner.class);
        Assertions.assertEquals("dawsxmrsz", model.value().get(0).value());
        Assertions.assertEquals("nimx", model.value().get(0).description());
        Assertions.assertEquals(PolicyFragmentContentFormat.XML, model.value().get(0).format());
        Assertions.assertEquals(9000451508924341558L, model.count());
        Assertions.assertEquals("nvynfaooeactedc", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PolicyFragmentCollectionInner model =
            new PolicyFragmentCollectionInner()
                .withValue(
                    Arrays
                        .asList(
                            new PolicyFragmentContractInner()
                                .withValue("dawsxmrsz")
                                .withDescription("nimx")
                                .withFormat(PolicyFragmentContentFormat.XML)))
                .withCount(9000451508924341558L)
                .withNextLink("nvynfaooeactedc");
        model = BinaryData.fromObject(model).toObject(PolicyFragmentCollectionInner.class);
        Assertions.assertEquals("dawsxmrsz", model.value().get(0).value());
        Assertions.assertEquals("nimx", model.value().get(0).description());
        Assertions.assertEquals(PolicyFragmentContentFormat.XML, model.value().get(0).format());
        Assertions.assertEquals(9000451508924341558L, model.count());
        Assertions.assertEquals("nvynfaooeactedc", model.nextLink());
    }
}