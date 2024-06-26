// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * AccessScope enums.
 */
public final class AccessScope extends ExpandableStringEnum<AccessScope> {

    /**
     * Grants access to perform all operations on the Job containing the Task.
     */
    @Generated
    public static final AccessScope JOB = fromString("job");

    /**
     * Creates a new instance of AccessScope value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public AccessScope() {
    }

    /**
     * Creates or finds a AccessScope from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AccessScope.
     */
    @Generated
    public static AccessScope fromString(String name) {
        return fromString(name, AccessScope.class);
    }

    /**
     * Gets known AccessScope values.
     *
     * @return known AccessScope values.
     */
    @Generated
    public static Collection<AccessScope> values() {
        return values(AccessScope.class);
    }
}
