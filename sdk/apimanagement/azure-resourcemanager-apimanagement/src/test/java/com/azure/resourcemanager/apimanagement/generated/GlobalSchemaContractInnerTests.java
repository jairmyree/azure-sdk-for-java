// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.GlobalSchemaContractInner;
import com.azure.resourcemanager.apimanagement.models.SchemaType;
import org.junit.jupiter.api.Assertions;

public final class GlobalSchemaContractInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GlobalSchemaContractInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"schemaType\":\"json\",\"description\":\"dolrndw\",\"value\":\"datavxvzaledoyqxlun\",\"document\":\"datath\"},\"id\":\"cxqqxmyzklaoanp\",\"name\":\"hrvmzrqrazadi\",\"type\":\"znllaslk\"}")
                .toObject(GlobalSchemaContractInner.class);
        Assertions.assertEquals(SchemaType.JSON, model.schemaType());
        Assertions.assertEquals("dolrndw", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GlobalSchemaContractInner model =
            new GlobalSchemaContractInner()
                .withSchemaType(SchemaType.JSON)
                .withDescription("dolrndw")
                .withValue("datavxvzaledoyqxlun")
                .withDocument("datath");
        model = BinaryData.fromObject(model).toObject(GlobalSchemaContractInner.class);
        Assertions.assertEquals(SchemaType.JSON, model.schemaType());
        Assertions.assertEquals("dolrndw", model.description());
    }
}