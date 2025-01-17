// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.videoanalyzer.fluent.models.EdgeModuleEntityInner;
import java.util.UUID;

/** An immutable client-side representation of EdgeModuleEntity. */
public interface EdgeModuleEntity {
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
     * Gets the edgeModuleId property: Internal ID generated for the instance of the Video Analyzer edge module.
     *
     * @return the edgeModuleId value.
     */
    UUID edgeModuleId();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.videoanalyzer.fluent.models.EdgeModuleEntityInner object.
     *
     * @return the inner object.
     */
    EdgeModuleEntityInner innerModel();

    /** The entirety of the EdgeModuleEntity definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /** The EdgeModuleEntity definition stages. */
    interface DefinitionStages {
        /** The first stage of the EdgeModuleEntity definition. */
        interface Blank extends WithParentResource {
        }

        /** The stage of the EdgeModuleEntity definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param accountName The Azure Video Analyzer account name.
             * @return the next definition stage.
             */
            WithCreate withExistingVideoAnalyzer(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the EdgeModuleEntity definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            EdgeModuleEntity create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            EdgeModuleEntity create(Context context);
        }
    }

    /**
     * Begins update for the EdgeModuleEntity resource.
     *
     * @return the stage of resource update.
     */
    EdgeModuleEntity.Update update();

    /** The template for EdgeModuleEntity update. */
    interface Update {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        EdgeModuleEntity apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        EdgeModuleEntity apply(Context context);
    }

    /** The EdgeModuleEntity update stages. */
    interface UpdateStages {
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    EdgeModuleEntity refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    EdgeModuleEntity refresh(Context context);

    /**
     * Creates a new provisioning token. A provisioning token allows for a single instance of Azure Video analyzer IoT
     * edge module to be initialized and authorized to the cloud account. The provisioning token itself is short lived
     * and it is only used for the initial handshake between IoT edge module and the cloud. After the initial handshake,
     * the IoT edge module will agree on a set of authentication keys which will be auto-rotated as long as the module
     * is able to periodically connect to the cloud. A new provisioning token can be generated for the same IoT edge
     * module in case the module state lost or reset.
     *
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provisioning token properties.
     */
    EdgeModuleProvisioningToken listProvisioningToken(ListProvisioningTokenInput parameters);

    /**
     * Creates a new provisioning token. A provisioning token allows for a single instance of Azure Video analyzer IoT
     * edge module to be initialized and authorized to the cloud account. The provisioning token itself is short lived
     * and it is only used for the initial handshake between IoT edge module and the cloud. After the initial handshake,
     * the IoT edge module will agree on a set of authentication keys which will be auto-rotated as long as the module
     * is able to periodically connect to the cloud. A new provisioning token can be generated for the same IoT edge
     * module in case the module state lost or reset.
     *
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provisioning token properties along with {@link Response}.
     */
    Response<EdgeModuleProvisioningToken> listProvisioningTokenWithResponse(ListProvisioningTokenInput parameters,
        Context context);
}
