// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.models;

import com.azure.resourcemanager.servicefabricmanagedclusters.fluent.models.NodeTypeAvailableSkuInner;

/**
 * An immutable client-side representation of NodeTypeAvailableSku.
 */
public interface NodeTypeAvailableSku {
    /**
     * Gets the resourceType property: The type of resource the sku applies to. Value:
     * Microsoft.ServiceFabric/managedClusters/nodeTypes.
     * 
     * @return the resourceType value.
     */
    String resourceType();

    /**
     * Gets the sku property: The supported SKU for a for node type.
     * 
     * @return the sku value.
     */
    NodeTypeSupportedSku sku();

    /**
     * Gets the capacity property: Provides information about how the node count can be scaled.
     * 
     * @return the capacity value.
     */
    NodeTypeSkuCapacity capacity();

    /**
     * Gets the inner com.azure.resourcemanager.servicefabricmanagedclusters.fluent.models.NodeTypeAvailableSkuInner
     * object.
     * 
     * @return the inner object.
     */
    NodeTypeAvailableSkuInner innerModel();
}
