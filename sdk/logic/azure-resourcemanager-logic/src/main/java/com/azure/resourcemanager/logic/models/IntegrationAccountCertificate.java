// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.logic.fluent.models.IntegrationAccountCertificateInner;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * An immutable client-side representation of IntegrationAccountCertificate.
 */
public interface IntegrationAccountCertificate {
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
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the createdTime property: The created time.
     * 
     * @return the createdTime value.
     */
    OffsetDateTime createdTime();

    /**
     * Gets the changedTime property: The changed time.
     * 
     * @return the changedTime value.
     */
    OffsetDateTime changedTime();

    /**
     * Gets the metadata property: The metadata.
     * 
     * @return the metadata value.
     */
    Object metadata();

    /**
     * Gets the key property: The key details in the key vault.
     * 
     * @return the key value.
     */
    KeyVaultKeyReference key();

    /**
     * Gets the publicCertificate property: The public certificate.
     * 
     * @return the publicCertificate value.
     */
    String publicCertificate();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.logic.fluent.models.IntegrationAccountCertificateInner object.
     * 
     * @return the inner object.
     */
    IntegrationAccountCertificateInner innerModel();

    /**
     * The entirety of the IntegrationAccountCertificate definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The IntegrationAccountCertificate definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the IntegrationAccountCertificate definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the IntegrationAccountCertificate definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }

        /**
         * The stage of the IntegrationAccountCertificate definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, integrationAccountName.
             * 
             * @param resourceGroupName The resource group name.
             * @param integrationAccountName The integration account name.
             * @return the next definition stage.
             */
            WithCreate withExistingIntegrationAccount(String resourceGroupName, String integrationAccountName);
        }

        /**
         * The stage of the IntegrationAccountCertificate definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithMetadata, DefinitionStages.WithKey,
            DefinitionStages.WithPublicCertificate {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            IntegrationAccountCertificate create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            IntegrationAccountCertificate create(Context context);
        }

        /**
         * The stage of the IntegrationAccountCertificate definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the IntegrationAccountCertificate definition allowing to specify metadata.
         */
        interface WithMetadata {
            /**
             * Specifies the metadata property: The metadata..
             * 
             * @param metadata The metadata.
             * @return the next definition stage.
             */
            WithCreate withMetadata(Object metadata);
        }

        /**
         * The stage of the IntegrationAccountCertificate definition allowing to specify key.
         */
        interface WithKey {
            /**
             * Specifies the key property: The key details in the key vault..
             * 
             * @param key The key details in the key vault.
             * @return the next definition stage.
             */
            WithCreate withKey(KeyVaultKeyReference key);
        }

        /**
         * The stage of the IntegrationAccountCertificate definition allowing to specify publicCertificate.
         */
        interface WithPublicCertificate {
            /**
             * Specifies the publicCertificate property: The public certificate..
             * 
             * @param publicCertificate The public certificate.
             * @return the next definition stage.
             */
            WithCreate withPublicCertificate(String publicCertificate);
        }
    }

    /**
     * Begins update for the IntegrationAccountCertificate resource.
     * 
     * @return the stage of resource update.
     */
    IntegrationAccountCertificate.Update update();

    /**
     * The template for IntegrationAccountCertificate update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithMetadata, UpdateStages.WithKey,
        UpdateStages.WithPublicCertificate {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        IntegrationAccountCertificate apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        IntegrationAccountCertificate apply(Context context);
    }

    /**
     * The IntegrationAccountCertificate update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the IntegrationAccountCertificate update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the IntegrationAccountCertificate update allowing to specify metadata.
         */
        interface WithMetadata {
            /**
             * Specifies the metadata property: The metadata..
             * 
             * @param metadata The metadata.
             * @return the next definition stage.
             */
            Update withMetadata(Object metadata);
        }

        /**
         * The stage of the IntegrationAccountCertificate update allowing to specify key.
         */
        interface WithKey {
            /**
             * Specifies the key property: The key details in the key vault..
             * 
             * @param key The key details in the key vault.
             * @return the next definition stage.
             */
            Update withKey(KeyVaultKeyReference key);
        }

        /**
         * The stage of the IntegrationAccountCertificate update allowing to specify publicCertificate.
         */
        interface WithPublicCertificate {
            /**
             * Specifies the publicCertificate property: The public certificate..
             * 
             * @param publicCertificate The public certificate.
             * @return the next definition stage.
             */
            Update withPublicCertificate(String publicCertificate);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    IntegrationAccountCertificate refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    IntegrationAccountCertificate refresh(Context context);
}
