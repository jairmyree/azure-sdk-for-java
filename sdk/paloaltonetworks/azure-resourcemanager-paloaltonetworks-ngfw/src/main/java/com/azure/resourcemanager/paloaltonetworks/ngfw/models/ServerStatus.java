// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Connectivity Status for Panorama Server.
 */
public final class ServerStatus extends ExpandableStringEnum<ServerStatus> {
    /**
     * Static value UP for ServerStatus.
     */
    public static final ServerStatus UP = fromString("UP");

    /**
     * Static value DOWN for ServerStatus.
     */
    public static final ServerStatus DOWN = fromString("DOWN");

    /**
     * Creates a new instance of ServerStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ServerStatus() {
    }

    /**
     * Creates or finds a ServerStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ServerStatus.
     */
    public static ServerStatus fromString(String name) {
        return fromString(name, ServerStatus.class);
    }

    /**
     * Gets known ServerStatus values.
     * 
     * @return known ServerStatus values.
     */
    public static Collection<ServerStatus> values() {
        return values(ServerStatus.class);
    }
}
