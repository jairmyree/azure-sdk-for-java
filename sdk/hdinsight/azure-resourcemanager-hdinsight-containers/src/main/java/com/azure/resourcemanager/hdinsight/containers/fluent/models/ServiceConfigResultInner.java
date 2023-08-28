// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hdinsight.containers.models.ServiceConfigListResultValueEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Cluster instance service config. */
@Fluent
public final class ServiceConfigResultInner {
    /*
     * Cluster instance service config properties.
     */
    @JsonProperty(value = "properties")
    private ServiceConfigResultProperties innerProperties;

    /** Creates an instance of ServiceConfigResultInner class. */
    public ServiceConfigResultInner() {
    }

    /**
     * Get the innerProperties property: Cluster instance service config properties.
     *
     * @return the innerProperties value.
     */
    private ServiceConfigResultProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the serviceName property: Service Config Name.
     *
     * @return the serviceName value.
     */
    public String serviceName() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceName();
    }

    /**
     * Set the serviceName property: Service Config Name.
     *
     * @param serviceName the serviceName value to set.
     * @return the ServiceConfigResultInner object itself.
     */
    public ServiceConfigResultInner withServiceName(String serviceName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceConfigResultProperties();
        }
        this.innerProperties().withServiceName(serviceName);
        return this;
    }

    /**
     * Get the fileName property: File Name.
     *
     * @return the fileName value.
     */
    public String fileName() {
        return this.innerProperties() == null ? null : this.innerProperties().fileName();
    }

    /**
     * Set the fileName property: File Name.
     *
     * @param fileName the fileName value to set.
     * @return the ServiceConfigResultInner object itself.
     */
    public ServiceConfigResultInner withFileName(String fileName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceConfigResultProperties();
        }
        this.innerProperties().withFileName(fileName);
        return this;
    }

    /**
     * Get the content property: Content in the service config file.
     *
     * @return the content value.
     */
    public String content() {
        return this.innerProperties() == null ? null : this.innerProperties().content();
    }

    /**
     * Set the content property: Content in the service config file.
     *
     * @param content the content value to set.
     * @return the ServiceConfigResultInner object itself.
     */
    public ServiceConfigResultInner withContent(String content) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceConfigResultProperties();
        }
        this.innerProperties().withContent(content);
        return this;
    }

    /**
     * Get the componentName property: Component Name.
     *
     * @return the componentName value.
     */
    public String componentName() {
        return this.innerProperties() == null ? null : this.innerProperties().componentName();
    }

    /**
     * Set the componentName property: Component Name.
     *
     * @param componentName the componentName value to set.
     * @return the ServiceConfigResultInner object itself.
     */
    public ServiceConfigResultInner withComponentName(String componentName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceConfigResultProperties();
        }
        this.innerProperties().withComponentName(componentName);
        return this;
    }

    /**
     * Get the type property: Config type.
     *
     * @return the type value.
     */
    public String type() {
        return this.innerProperties() == null ? null : this.innerProperties().type();
    }

    /**
     * Set the type property: Config type.
     *
     * @param type the type value to set.
     * @return the ServiceConfigResultInner object itself.
     */
    public ServiceConfigResultInner withType(String type) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceConfigResultProperties();
        }
        this.innerProperties().withType(type);
        return this;
    }

    /**
     * Get the path property: Config file path.
     *
     * @return the path value.
     */
    public String path() {
        return this.innerProperties() == null ? null : this.innerProperties().path();
    }

    /**
     * Set the path property: Config file path.
     *
     * @param path the path value to set.
     * @return the ServiceConfigResultInner object itself.
     */
    public ServiceConfigResultInner withPath(String path) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceConfigResultProperties();
        }
        this.innerProperties().withPath(path);
        return this;
    }

    /**
     * Get the customKeys property: The custom keys.
     *
     * @return the customKeys value.
     */
    public Map<String, String> customKeys() {
        return this.innerProperties() == null ? null : this.innerProperties().customKeys();
    }

    /**
     * Set the customKeys property: The custom keys.
     *
     * @param customKeys the customKeys value to set.
     * @return the ServiceConfigResultInner object itself.
     */
    public ServiceConfigResultInner withCustomKeys(Map<String, String> customKeys) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceConfigResultProperties();
        }
        this.innerProperties().withCustomKeys(customKeys);
        return this;
    }

    /**
     * Get the defaultKeys property: The default keys.
     *
     * @return the defaultKeys value.
     */
    public Map<String, ServiceConfigListResultValueEntity> defaultKeys() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultKeys();
    }

    /**
     * Set the defaultKeys property: The default keys.
     *
     * @param defaultKeys the defaultKeys value to set.
     * @return the ServiceConfigResultInner object itself.
     */
    public ServiceConfigResultInner withDefaultKeys(Map<String, ServiceConfigListResultValueEntity> defaultKeys) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceConfigResultProperties();
        }
        this.innerProperties().withDefaultKeys(defaultKeys);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}