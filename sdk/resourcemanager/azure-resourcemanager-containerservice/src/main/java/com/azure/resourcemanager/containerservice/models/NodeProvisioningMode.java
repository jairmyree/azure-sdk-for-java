// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The node provisioning mode. If not specified, the default is Manual.
 */
public final class NodeProvisioningMode extends ExpandableStringEnum<NodeProvisioningMode> {
    /**
     * Static value Manual for NodeProvisioningMode.
     */
    public static final NodeProvisioningMode MANUAL = fromString("Manual");

    /**
     * Static value Auto for NodeProvisioningMode.
     */
    public static final NodeProvisioningMode AUTO = fromString("Auto");

    /**
     * Creates a new instance of NodeProvisioningMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NodeProvisioningMode() {
    }

    /**
     * Creates or finds a NodeProvisioningMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding NodeProvisioningMode.
     */
    public static NodeProvisioningMode fromString(String name) {
        return fromString(name, NodeProvisioningMode.class);
    }

    /**
     * Gets known NodeProvisioningMode values.
     * 
     * @return known NodeProvisioningMode values.
     */
    public static Collection<NodeProvisioningMode> values() {
        return values(NodeProvisioningMode.class);
    }
}
