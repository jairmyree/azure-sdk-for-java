// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.apimanagement.fluent.models.WikiContractInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Paged Wiki list representation. */
@Immutable
public final class WikiCollection {
    /*
     * Page values.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<WikiContractInner> value;

    /*
     * Next page link if any.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of WikiCollection class. */
    public WikiCollection() {
    }

    /**
     * Get the value property: Page values.
     *
     * @return the value value.
     */
    public List<WikiContractInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Next page link if any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}