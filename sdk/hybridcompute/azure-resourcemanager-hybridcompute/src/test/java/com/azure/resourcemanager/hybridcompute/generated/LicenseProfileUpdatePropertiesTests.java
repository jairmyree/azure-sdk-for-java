// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.fluent.models.LicenseProfileUpdateProperties;
import com.azure.resourcemanager.hybridcompute.models.LicenseProfileProductType;
import com.azure.resourcemanager.hybridcompute.models.LicenseProfileSubscriptionStatusUpdate;
import com.azure.resourcemanager.hybridcompute.models.ProductFeatureUpdate;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LicenseProfileUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LicenseProfileUpdateProperties model = BinaryData.fromString(
            "{\"softwareAssurance\":{\"softwareAssuranceCustomer\":false},\"esuProfile\":{\"assignedLicense\":\"pnvjtoqnermclf\"},\"productProfile\":{\"subscriptionStatus\":\"Enable\",\"productType\":\"WindowsServer\",\"productFeatures\":[{\"name\":\"rpabg\",\"subscriptionStatus\":\"Enable\"},{\"name\":\"bjtazqugxywpmu\",\"subscriptionStatus\":\"Enable\"},{\"name\":\"zwfqkqujidsuyon\",\"subscriptionStatus\":\"Enable\"},{\"name\":\"aocqxtccmgy\",\"subscriptionStatus\":\"Enable\"}]}}")
            .toObject(LicenseProfileUpdateProperties.class);
        Assertions.assertEquals(false, model.softwareAssuranceCustomer());
        Assertions.assertEquals("pnvjtoqnermclf", model.assignedLicense());
        Assertions.assertEquals(LicenseProfileSubscriptionStatusUpdate.ENABLE, model.subscriptionStatus());
        Assertions.assertEquals(LicenseProfileProductType.WINDOWS_SERVER, model.productType());
        Assertions.assertEquals("rpabg", model.productFeatures().get(0).name());
        Assertions.assertEquals(LicenseProfileSubscriptionStatusUpdate.ENABLE,
            model.productFeatures().get(0).subscriptionStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LicenseProfileUpdateProperties model = new LicenseProfileUpdateProperties().withSoftwareAssuranceCustomer(false)
            .withAssignedLicense("pnvjtoqnermclf")
            .withSubscriptionStatus(LicenseProfileSubscriptionStatusUpdate.ENABLE)
            .withProductType(LicenseProfileProductType.WINDOWS_SERVER)
            .withProductFeatures(Arrays.asList(
                new ProductFeatureUpdate().withName("rpabg")
                    .withSubscriptionStatus(LicenseProfileSubscriptionStatusUpdate.ENABLE),
                new ProductFeatureUpdate().withName("bjtazqugxywpmu")
                    .withSubscriptionStatus(LicenseProfileSubscriptionStatusUpdate.ENABLE),
                new ProductFeatureUpdate().withName("zwfqkqujidsuyon")
                    .withSubscriptionStatus(LicenseProfileSubscriptionStatusUpdate.ENABLE),
                new ProductFeatureUpdate().withName("aocqxtccmgy")
                    .withSubscriptionStatus(LicenseProfileSubscriptionStatusUpdate.ENABLE)));
        model = BinaryData.fromObject(model).toObject(LicenseProfileUpdateProperties.class);
        Assertions.assertEquals(false, model.softwareAssuranceCustomer());
        Assertions.assertEquals("pnvjtoqnermclf", model.assignedLicense());
        Assertions.assertEquals(LicenseProfileSubscriptionStatusUpdate.ENABLE, model.subscriptionStatus());
        Assertions.assertEquals(LicenseProfileProductType.WINDOWS_SERVER, model.productType());
        Assertions.assertEquals("rpabg", model.productFeatures().get(0).name());
        Assertions.assertEquals(LicenseProfileSubscriptionStatusUpdate.ENABLE,
            model.productFeatures().get(0).subscriptionStatus());
    }
}
