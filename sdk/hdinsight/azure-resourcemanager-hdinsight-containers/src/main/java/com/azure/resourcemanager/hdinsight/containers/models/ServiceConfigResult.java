// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.resourcemanager.hdinsight.containers.fluent.models.ServiceConfigResultInner;
import java.util.Map;

/** An immutable client-side representation of ServiceConfigResult. */
public interface ServiceConfigResult {
    /**
     * Gets the serviceName property: Service Config Name.
     *
     * @return the serviceName value.
     */
    String serviceName();

    /**
     * Gets the fileName property: File Name.
     *
     * @return the fileName value.
     */
    String fileName();

    /**
     * Gets the content property: Content in the service config file.
     *
     * @return the content value.
     */
    String content();

    /**
     * Gets the componentName property: Component Name.
     *
     * @return the componentName value.
     */
    String componentName();

    /**
     * Gets the type property: Config type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the path property: Config file path.
     *
     * @return the path value.
     */
    String path();

    /**
     * Gets the customKeys property: The custom keys.
     *
     * @return the customKeys value.
     */
    Map<String, String> customKeys();

    /**
     * Gets the defaultKeys property: The default keys.
     *
     * @return the defaultKeys value.
     */
    Map<String, ServiceConfigListResultValueEntity> defaultKeys();

    /**
     * Gets the inner com.azure.resourcemanager.hdinsight.containers.fluent.models.ServiceConfigResultInner object.
     *
     * @return the inner object.
     */
    ServiceConfigResultInner innerModel();
}