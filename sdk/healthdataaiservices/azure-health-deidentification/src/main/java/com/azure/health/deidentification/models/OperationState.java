// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.deidentification.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Enum describing allowed operation states.
 */
public final class OperationState extends ExpandableStringEnum<OperationState> {

    /**
     * The operation has not started.
     */
    @Generated
    public static final OperationState NOT_STARTED = fromString("NotStarted");

    /**
     * The operation is in progress.
     */
    @Generated
    public static final OperationState RUNNING = fromString("Running");

    /**
     * The operation has completed successfully.
     */
    @Generated
    public static final OperationState SUCCEEDED = fromString("Succeeded");

    /**
     * The operation has failed.
     */
    @Generated
    public static final OperationState FAILED = fromString("Failed");

    /**
     * The operation has been canceled by the user.
     */
    @Generated
    public static final OperationState CANCELED = fromString("Canceled");

    /**
     * Creates a new instance of OperationState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public OperationState() {
    }

    /**
     * Creates or finds a OperationState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OperationState.
     */
    @Generated
    public static OperationState fromString(String name) {
        return fromString(name, OperationState.class);
    }

    /**
     * Gets known OperationState values.
     *
     * @return known OperationState values.
     */
    @Generated
    public static Collection<OperationState> values() {
        return values(OperationState.class);
    }
}
