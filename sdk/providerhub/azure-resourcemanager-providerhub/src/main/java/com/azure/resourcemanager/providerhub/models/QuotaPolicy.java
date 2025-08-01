// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for QuotaPolicy.
 */
public final class QuotaPolicy extends ExpandableStringEnum<QuotaPolicy> {
    /**
     * Static value Default for QuotaPolicy.
     */
    public static final QuotaPolicy DEFAULT = fromString("Default");

    /**
     * Static value None for QuotaPolicy.
     */
    public static final QuotaPolicy NONE = fromString("None");

    /**
     * Static value Restricted for QuotaPolicy.
     */
    public static final QuotaPolicy RESTRICTED = fromString("Restricted");

    /**
     * Creates a new instance of QuotaPolicy value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public QuotaPolicy() {
    }

    /**
     * Creates or finds a QuotaPolicy from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding QuotaPolicy.
     */
    public static QuotaPolicy fromString(String name) {
        return fromString(name, QuotaPolicy.class);
    }

    /**
     * Gets known QuotaPolicy values.
     * 
     * @return known QuotaPolicy values.
     */
    public static Collection<QuotaPolicy> values() {
        return values(QuotaPolicy.class);
    }
}
