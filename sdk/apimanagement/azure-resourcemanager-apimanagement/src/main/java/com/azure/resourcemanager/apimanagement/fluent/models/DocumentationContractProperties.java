// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Markdown documentation details. */
@Fluent
public final class DocumentationContractProperties {
    /*
     * documentation title.
     */
    @JsonProperty(value = "title")
    private String title;

    /*
     * Markdown documentation content.
     */
    @JsonProperty(value = "content")
    private String content;

    /** Creates an instance of DocumentationContractProperties class. */
    public DocumentationContractProperties() {
    }

    /**
     * Get the title property: documentation title.
     *
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: documentation title.
     *
     * @param title the title value to set.
     * @return the DocumentationContractProperties object itself.
     */
    public DocumentationContractProperties withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the content property: Markdown documentation content.
     *
     * @return the content value.
     */
    public String content() {
        return this.content;
    }

    /**
     * Set the content property: Markdown documentation content.
     *
     * @param content the content value to set.
     * @return the DocumentationContractProperties object itself.
     */
    public DocumentationContractProperties withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}