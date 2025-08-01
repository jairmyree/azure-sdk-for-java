// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The preflight options.
 */
public final class TemplateDeploymentPreflightOptions extends ExpandableStringEnum<TemplateDeploymentPreflightOptions> {
    /**
     * Static value None for TemplateDeploymentPreflightOptions.
     */
    public static final TemplateDeploymentPreflightOptions NONE = fromString("None");

    /**
     * Static value ValidationRequests for TemplateDeploymentPreflightOptions.
     */
    public static final TemplateDeploymentPreflightOptions VALIDATION_REQUESTS = fromString("ValidationRequests");

    /**
     * Static value DeploymentRequests for TemplateDeploymentPreflightOptions.
     */
    public static final TemplateDeploymentPreflightOptions DEPLOYMENT_REQUESTS = fromString("DeploymentRequests");

    /**
     * Static value TestOnly for TemplateDeploymentPreflightOptions.
     */
    public static final TemplateDeploymentPreflightOptions TEST_ONLY = fromString("TestOnly");

    /**
     * Static value RegisteredOnly for TemplateDeploymentPreflightOptions.
     */
    public static final TemplateDeploymentPreflightOptions REGISTERED_ONLY = fromString("RegisteredOnly");

    /**
     * Creates a new instance of TemplateDeploymentPreflightOptions value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TemplateDeploymentPreflightOptions() {
    }

    /**
     * Creates or finds a TemplateDeploymentPreflightOptions from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding TemplateDeploymentPreflightOptions.
     */
    public static TemplateDeploymentPreflightOptions fromString(String name) {
        return fromString(name, TemplateDeploymentPreflightOptions.class);
    }

    /**
     * Gets known TemplateDeploymentPreflightOptions values.
     * 
     * @return known TemplateDeploymentPreflightOptions values.
     */
    public static Collection<TemplateDeploymentPreflightOptions> values() {
        return values(TemplateDeploymentPreflightOptions.class);
    }
}
