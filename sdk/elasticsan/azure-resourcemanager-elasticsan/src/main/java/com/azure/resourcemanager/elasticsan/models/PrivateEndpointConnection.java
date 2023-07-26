// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.elasticsan.fluent.models.PrivateEndpointConnectionInner;
import java.util.List;

/** An immutable client-side representation of PrivateEndpointConnection. */
public interface PrivateEndpointConnection {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: Provisioning State of Private Endpoint connection resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningStates provisioningState();

    /**
     * Gets the privateEndpoint property: Private Endpoint resource.
     *
     * @return the privateEndpoint value.
     */
    PrivateEndpoint privateEndpoint();

    /**
     * Gets the privateLinkServiceConnectionState property: Private Link Service Connection State.
     *
     * @return the privateLinkServiceConnectionState value.
     */
    PrivateLinkServiceConnectionState privateLinkServiceConnectionState();

    /**
     * Gets the groupIds property: List of resources private endpoint is mapped.
     *
     * @return the groupIds value.
     */
    List<String> groupIds();

    /**
     * Gets the inner com.azure.resourcemanager.elasticsan.fluent.models.PrivateEndpointConnectionInner object.
     *
     * @return the inner object.
     */
    PrivateEndpointConnectionInner innerModel();

    /** The entirety of the PrivateEndpointConnection definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithPrivateLinkServiceConnectionState,
            DefinitionStages.WithCreate {
    }

    /** The PrivateEndpointConnection definition stages. */
    interface DefinitionStages {
        /** The first stage of the PrivateEndpointConnection definition. */
        interface Blank extends WithParentResource {
        }

        /** The stage of the PrivateEndpointConnection definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, elasticSanName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param elasticSanName The name of the ElasticSan.
             * @return the next definition stage.
             */
            WithPrivateLinkServiceConnectionState withExistingElasticSan(
                String resourceGroupName, String elasticSanName);
        }

        /**
         * The stage of the PrivateEndpointConnection definition allowing to specify privateLinkServiceConnectionState.
         */
        interface WithPrivateLinkServiceConnectionState {
            /**
             * Specifies the privateLinkServiceConnectionState property: Private Link Service Connection State..
             *
             * @param privateLinkServiceConnectionState Private Link Service Connection State.
             * @return the next definition stage.
             */
            WithCreate withPrivateLinkServiceConnectionState(
                PrivateLinkServiceConnectionState privateLinkServiceConnectionState);
        }

        /**
         * The stage of the PrivateEndpointConnection definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithPrivateEndpoint, DefinitionStages.WithGroupIds {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            PrivateEndpointConnection create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            PrivateEndpointConnection create(Context context);
        }

        /** The stage of the PrivateEndpointConnection definition allowing to specify privateEndpoint. */
        interface WithPrivateEndpoint {
            /**
             * Specifies the privateEndpoint property: Private Endpoint resource.
             *
             * @param privateEndpoint Private Endpoint resource.
             * @return the next definition stage.
             */
            WithCreate withPrivateEndpoint(PrivateEndpoint privateEndpoint);
        }

        /** The stage of the PrivateEndpointConnection definition allowing to specify groupIds. */
        interface WithGroupIds {
            /**
             * Specifies the groupIds property: List of resources private endpoint is mapped.
             *
             * @param groupIds List of resources private endpoint is mapped.
             * @return the next definition stage.
             */
            WithCreate withGroupIds(List<String> groupIds);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    PrivateEndpointConnection refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    PrivateEndpointConnection refresh(Context context);
}