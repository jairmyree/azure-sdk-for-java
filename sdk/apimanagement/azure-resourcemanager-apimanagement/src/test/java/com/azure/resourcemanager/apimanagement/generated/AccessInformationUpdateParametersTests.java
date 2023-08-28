// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.AccessInformationUpdateParameters;
import org.junit.jupiter.api.Assertions;

public final class AccessInformationUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AccessInformationUpdateParameters model =
            BinaryData
                .fromString("{\"properties\":{\"enabled\":false}}")
                .toObject(AccessInformationUpdateParameters.class);
        Assertions.assertEquals(false, model.enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AccessInformationUpdateParameters model = new AccessInformationUpdateParameters().withEnabled(false);
        model = BinaryData.fromObject(model).toObject(AccessInformationUpdateParameters.class);
        Assertions.assertEquals(false, model.enabled());
    }
}