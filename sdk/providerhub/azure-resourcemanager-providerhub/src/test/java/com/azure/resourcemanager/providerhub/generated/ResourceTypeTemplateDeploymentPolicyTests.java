// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.providerhub.models.ResourceTypeTemplateDeploymentPolicy;
import com.azure.resourcemanager.providerhub.models.TemplateDeploymentCapabilities;
import com.azure.resourcemanager.providerhub.models.TemplateDeploymentPreflightNotifications;
import com.azure.resourcemanager.providerhub.models.TemplateDeploymentPreflightOptions;
import org.junit.jupiter.api.Assertions;

public final class ResourceTypeTemplateDeploymentPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceTypeTemplateDeploymentPolicy model = BinaryData.fromString(
            "{\"capabilities\":\"Preflight\",\"preflightOptions\":\"DeploymentRequests\",\"preflightNotifications\":\"UnregisteredSubscriptions\"}")
            .toObject(ResourceTypeTemplateDeploymentPolicy.class);
        Assertions.assertEquals(TemplateDeploymentCapabilities.PREFLIGHT, model.capabilities());
        Assertions.assertEquals(TemplateDeploymentPreflightOptions.DEPLOYMENT_REQUESTS, model.preflightOptions());
        Assertions.assertEquals(TemplateDeploymentPreflightNotifications.UNREGISTERED_SUBSCRIPTIONS,
            model.preflightNotifications());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceTypeTemplateDeploymentPolicy model
            = new ResourceTypeTemplateDeploymentPolicy().withCapabilities(TemplateDeploymentCapabilities.PREFLIGHT)
                .withPreflightOptions(TemplateDeploymentPreflightOptions.DEPLOYMENT_REQUESTS)
                .withPreflightNotifications(TemplateDeploymentPreflightNotifications.UNREGISTERED_SUBSCRIPTIONS);
        model = BinaryData.fromObject(model).toObject(ResourceTypeTemplateDeploymentPolicy.class);
        Assertions.assertEquals(TemplateDeploymentCapabilities.PREFLIGHT, model.capabilities());
        Assertions.assertEquals(TemplateDeploymentPreflightOptions.DEPLOYMENT_REQUESTS, model.preflightOptions());
        Assertions.assertEquals(TemplateDeploymentPreflightNotifications.UNREGISTERED_SUBSCRIPTIONS,
            model.preflightNotifications());
    }
}
