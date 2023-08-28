// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Strategy of translating required query parameters to template ones. By default has value 'template'. Possible values:
 * 'template', 'query'.
 */
public final class TranslateRequiredQueryParametersConduct
    extends ExpandableStringEnum<TranslateRequiredQueryParametersConduct> {
    /** Static value template for TranslateRequiredQueryParametersConduct. */
    public static final TranslateRequiredQueryParametersConduct TEMPLATE = fromString("template");

    /** Static value query for TranslateRequiredQueryParametersConduct. */
    public static final TranslateRequiredQueryParametersConduct QUERY = fromString("query");

    /**
     * Creates a new instance of TranslateRequiredQueryParametersConduct value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TranslateRequiredQueryParametersConduct() {
    }

    /**
     * Creates or finds a TranslateRequiredQueryParametersConduct from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TranslateRequiredQueryParametersConduct.
     */
    @JsonCreator
    public static TranslateRequiredQueryParametersConduct fromString(String name) {
        return fromString(name, TranslateRequiredQueryParametersConduct.class);
    }

    /**
     * Gets known TranslateRequiredQueryParametersConduct values.
     *
     * @return known TranslateRequiredQueryParametersConduct values.
     */
    public static Collection<TranslateRequiredQueryParametersConduct> values() {
        return values(TranslateRequiredQueryParametersConduct.class);
    }
}