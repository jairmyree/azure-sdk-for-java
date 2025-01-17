// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devtestlabs.fluent.models.ArtifactSourceInner;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * An immutable client-side representation of ArtifactSource.
 */
public interface ArtifactSource {
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
     * Gets the displayName property: The artifact source's display name.
     * 
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the uri property: The artifact source's URI.
     * 
     * @return the uri value.
     */
    String uri();

    /**
     * Gets the sourceType property: The artifact source's type.
     * 
     * @return the sourceType value.
     */
    SourceControlType sourceType();

    /**
     * Gets the folderPath property: The folder containing artifacts.
     * 
     * @return the folderPath value.
     */
    String folderPath();

    /**
     * Gets the armTemplateFolderPath property: The folder containing Azure Resource Manager templates.
     * 
     * @return the armTemplateFolderPath value.
     */
    String armTemplateFolderPath();

    /**
     * Gets the branchRef property: The artifact source's branch reference.
     * 
     * @return the branchRef value.
     */
    String branchRef();

    /**
     * Gets the securityToken property: The security token to authenticate to the artifact source.
     * 
     * @return the securityToken value.
     */
    String securityToken();

    /**
     * Gets the status property: Indicates if the artifact source is enabled (values: Enabled, Disabled).
     * 
     * @return the status value.
     */
    EnableStatus status();

    /**
     * Gets the createdDate property: The artifact source's creation date.
     * 
     * @return the createdDate value.
     */
    OffsetDateTime createdDate();

    /**
     * Gets the provisioningState property: The provisioning status of the resource.
     * 
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     * 
     * @return the uniqueIdentifier value.
     */
    String uniqueIdentifier();

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
     * Gets the inner com.azure.resourcemanager.devtestlabs.fluent.models.ArtifactSourceInner object.
     * 
     * @return the inner object.
     */
    ArtifactSourceInner innerModel();

    /**
     * The entirety of the ArtifactSource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The ArtifactSource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the ArtifactSource definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the ArtifactSource definition allowing to specify location.
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
         * The stage of the ArtifactSource definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, labName.
             * 
             * @param resourceGroupName The name of the resource group.
             * @param labName The name of the lab.
             * @return the next definition stage.
             */
            WithCreate withExistingLab(String resourceGroupName, String labName);
        }

        /**
         * The stage of the ArtifactSource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithDisplayName,
            DefinitionStages.WithUri, DefinitionStages.WithSourceType, DefinitionStages.WithFolderPath,
            DefinitionStages.WithArmTemplateFolderPath, DefinitionStages.WithBranchRef,
            DefinitionStages.WithSecurityToken, DefinitionStages.WithStatus {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            ArtifactSource create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ArtifactSource create(Context context);
        }

        /**
         * The stage of the ArtifactSource definition allowing to specify tags.
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
         * The stage of the ArtifactSource definition allowing to specify displayName.
         */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: The artifact source's display name..
             * 
             * @param displayName The artifact source's display name.
             * @return the next definition stage.
             */
            WithCreate withDisplayName(String displayName);
        }

        /**
         * The stage of the ArtifactSource definition allowing to specify uri.
         */
        interface WithUri {
            /**
             * Specifies the uri property: The artifact source's URI..
             * 
             * @param uri The artifact source's URI.
             * @return the next definition stage.
             */
            WithCreate withUri(String uri);
        }

        /**
         * The stage of the ArtifactSource definition allowing to specify sourceType.
         */
        interface WithSourceType {
            /**
             * Specifies the sourceType property: The artifact source's type..
             * 
             * @param sourceType The artifact source's type.
             * @return the next definition stage.
             */
            WithCreate withSourceType(SourceControlType sourceType);
        }

        /**
         * The stage of the ArtifactSource definition allowing to specify folderPath.
         */
        interface WithFolderPath {
            /**
             * Specifies the folderPath property: The folder containing artifacts..
             * 
             * @param folderPath The folder containing artifacts.
             * @return the next definition stage.
             */
            WithCreate withFolderPath(String folderPath);
        }

        /**
         * The stage of the ArtifactSource definition allowing to specify armTemplateFolderPath.
         */
        interface WithArmTemplateFolderPath {
            /**
             * Specifies the armTemplateFolderPath property: The folder containing Azure Resource Manager templates..
             * 
             * @param armTemplateFolderPath The folder containing Azure Resource Manager templates.
             * @return the next definition stage.
             */
            WithCreate withArmTemplateFolderPath(String armTemplateFolderPath);
        }

        /**
         * The stage of the ArtifactSource definition allowing to specify branchRef.
         */
        interface WithBranchRef {
            /**
             * Specifies the branchRef property: The artifact source's branch reference..
             * 
             * @param branchRef The artifact source's branch reference.
             * @return the next definition stage.
             */
            WithCreate withBranchRef(String branchRef);
        }

        /**
         * The stage of the ArtifactSource definition allowing to specify securityToken.
         */
        interface WithSecurityToken {
            /**
             * Specifies the securityToken property: The security token to authenticate to the artifact source..
             * 
             * @param securityToken The security token to authenticate to the artifact source.
             * @return the next definition stage.
             */
            WithCreate withSecurityToken(String securityToken);
        }

        /**
         * The stage of the ArtifactSource definition allowing to specify status.
         */
        interface WithStatus {
            /**
             * Specifies the status property: Indicates if the artifact source is enabled (values: Enabled, Disabled)..
             * 
             * @param status Indicates if the artifact source is enabled (values: Enabled, Disabled).
             * @return the next definition stage.
             */
            WithCreate withStatus(EnableStatus status);
        }
    }

    /**
     * Begins update for the ArtifactSource resource.
     * 
     * @return the stage of resource update.
     */
    ArtifactSource.Update update();

    /**
     * The template for ArtifactSource update.
     */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        ArtifactSource apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ArtifactSource apply(Context context);
    }

    /**
     * The ArtifactSource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the ArtifactSource update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: The tags of the resource..
             * 
             * @param tags The tags of the resource.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    ArtifactSource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ArtifactSource refresh(Context context);
}
