// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hardwaresecuritymodules.fluent.models.CloudHsmClusterInner;
import com.azure.resourcemanager.hardwaresecuritymodules.models.BackupRequestProperties;
import com.azure.resourcemanager.hardwaresecuritymodules.models.BackupResult;
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmCluster;
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmClusterPatchParameters;
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmClusterProperties;
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmClusterSku;
import com.azure.resourcemanager.hardwaresecuritymodules.models.ManagedServiceIdentity;
import com.azure.resourcemanager.hardwaresecuritymodules.models.RestoreRequestProperties;
import com.azure.resourcemanager.hardwaresecuritymodules.models.RestoreResult;
import java.util.Collections;
import java.util.Map;

public final class CloudHsmClusterImpl implements CloudHsmCluster, CloudHsmCluster.Definition, CloudHsmCluster.Update {
    private CloudHsmClusterInner innerObject;

    private final com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public CloudHsmClusterProperties properties() {
        return this.innerModel().properties();
    }

    public ManagedServiceIdentity identity() {
        return this.innerModel().identity();
    }

    public CloudHsmClusterSku sku() {
        return this.innerModel().sku();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public CloudHsmClusterInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String cloudHsmClusterName;

    private CloudHsmClusterPatchParameters updateBody;

    public CloudHsmClusterImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public CloudHsmCluster create() {
        this.innerObject = serviceManager.serviceClient()
            .getCloudHsmClusters()
            .createOrUpdate(resourceGroupName, cloudHsmClusterName, this.innerModel(), Context.NONE);
        return this;
    }

    public CloudHsmCluster create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getCloudHsmClusters()
            .createOrUpdate(resourceGroupName, cloudHsmClusterName, this.innerModel(), context);
        return this;
    }

    CloudHsmClusterImpl(String name,
        com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager serviceManager) {
        this.innerObject = new CloudHsmClusterInner();
        this.serviceManager = serviceManager;
        this.cloudHsmClusterName = name;
    }

    public CloudHsmClusterImpl update() {
        this.updateBody = new CloudHsmClusterPatchParameters();
        return this;
    }

    public CloudHsmCluster apply() {
        this.innerObject = serviceManager.serviceClient()
            .getCloudHsmClusters()
            .update(resourceGroupName, cloudHsmClusterName, updateBody, Context.NONE);
        return this;
    }

    public CloudHsmCluster apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getCloudHsmClusters()
            .update(resourceGroupName, cloudHsmClusterName, updateBody, context);
        return this;
    }

    CloudHsmClusterImpl(CloudHsmClusterInner innerObject,
        com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.cloudHsmClusterName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "cloudHsmClusters");
    }

    public CloudHsmCluster refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getCloudHsmClusters()
            .getByResourceGroupWithResponse(resourceGroupName, cloudHsmClusterName, Context.NONE)
            .getValue();
        return this;
    }

    public CloudHsmCluster refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getCloudHsmClusters()
            .getByResourceGroupWithResponse(resourceGroupName, cloudHsmClusterName, context)
            .getValue();
        return this;
    }

    public BackupResult validateBackupProperties() {
        return serviceManager.cloudHsmClusters().validateBackupProperties(resourceGroupName, cloudHsmClusterName);
    }

    public BackupResult validateBackupProperties(BackupRequestProperties backupRequestProperties, Context context) {
        return serviceManager.cloudHsmClusters()
            .validateBackupProperties(resourceGroupName, cloudHsmClusterName, backupRequestProperties, context);
    }

    public BackupResult backup() {
        return serviceManager.cloudHsmClusters().backup(resourceGroupName, cloudHsmClusterName);
    }

    public BackupResult backup(BackupRequestProperties backupRequestProperties, Context context) {
        return serviceManager.cloudHsmClusters()
            .backup(resourceGroupName, cloudHsmClusterName, backupRequestProperties, context);
    }

    public RestoreResult validateRestoreProperties() {
        return serviceManager.cloudHsmClusters().validateRestoreProperties(resourceGroupName, cloudHsmClusterName);
    }

    public RestoreResult validateRestoreProperties(RestoreRequestProperties restoreRequestProperties, Context context) {
        return serviceManager.cloudHsmClusters()
            .validateRestoreProperties(resourceGroupName, cloudHsmClusterName, restoreRequestProperties, context);
    }

    public RestoreResult restore(RestoreRequestProperties restoreRequestProperties) {
        return serviceManager.cloudHsmClusters()
            .restore(resourceGroupName, cloudHsmClusterName, restoreRequestProperties);
    }

    public RestoreResult restore(RestoreRequestProperties restoreRequestProperties, Context context) {
        return serviceManager.cloudHsmClusters()
            .restore(resourceGroupName, cloudHsmClusterName, restoreRequestProperties, context);
    }

    public CloudHsmClusterImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public CloudHsmClusterImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public CloudHsmClusterImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    public CloudHsmClusterImpl withProperties(CloudHsmClusterProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public CloudHsmClusterImpl withIdentity(ManagedServiceIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateBody.withIdentity(identity);
            return this;
        }
    }

    public CloudHsmClusterImpl withSku(CloudHsmClusterSku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel() == null || this.innerModel().id() == null;
    }
}
