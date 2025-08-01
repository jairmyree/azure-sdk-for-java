// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Whether notifications should be skipped.
 */
public final class SkipNotifications extends ExpandableStringEnum<SkipNotifications> {
    /**
     * Static value Unspecified for SkipNotifications.
     */
    public static final SkipNotifications UNSPECIFIED = fromString("Unspecified");

    /**
     * Static value Enabled for SkipNotifications.
     */
    public static final SkipNotifications ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for SkipNotifications.
     */
    public static final SkipNotifications DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of SkipNotifications value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SkipNotifications() {
    }

    /**
     * Creates or finds a SkipNotifications from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SkipNotifications.
     */
    public static SkipNotifications fromString(String name) {
        return fromString(name, SkipNotifications.class);
    }

    /**
     * Gets known SkipNotifications values.
     * 
     * @return known SkipNotifications values.
     */
    public static Collection<SkipNotifications> values() {
        return values(SkipNotifications.class);
    }
}
