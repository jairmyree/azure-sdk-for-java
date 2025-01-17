// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.devcenter.models.CatalogConnectionState;
import com.azure.resourcemanager.devcenter.models.CatalogSyncState;
import com.azure.resourcemanager.devcenter.models.CatalogSyncType;
import com.azure.resourcemanager.devcenter.models.GitCatalog;
import com.azure.resourcemanager.devcenter.models.ProvisioningState;
import com.azure.resourcemanager.devcenter.models.SyncStats;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Represents a catalog.
 */
@Fluent
public final class CatalogInner extends ProxyResource {
    /*
     * Catalog properties.
     */
    private CatalogProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of CatalogInner class.
     */
    public CatalogInner() {
    }

    /**
     * Get the innerProperties property: Catalog properties.
     * 
     * @return the innerProperties value.
     */
    private CatalogProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the syncState property: The synchronization state of the catalog.
     * 
     * @return the syncState value.
     */
    public CatalogSyncState syncState() {
        return this.innerProperties() == null ? null : this.innerProperties().syncState();
    }

    /**
     * Get the lastSyncStats property: Stats of the latest synchronization.
     * 
     * @return the lastSyncStats value.
     */
    public SyncStats lastSyncStats() {
        return this.innerProperties() == null ? null : this.innerProperties().lastSyncStats();
    }

    /**
     * Get the connectionState property: The connection state of the catalog.
     * 
     * @return the connectionState value.
     */
    public CatalogConnectionState connectionState() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionState();
    }

    /**
     * Get the lastConnectionTime property: When the catalog was last connected.
     * 
     * @return the lastConnectionTime value.
     */
    public OffsetDateTime lastConnectionTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastConnectionTime();
    }

    /**
     * Get the lastSyncTime property: When the catalog was last synced.
     * 
     * @return the lastSyncTime value.
     */
    public OffsetDateTime lastSyncTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastSyncTime();
    }

    /**
     * Get the gitHub property: Properties for a GitHub catalog type.
     * 
     * @return the gitHub value.
     */
    public GitCatalog gitHub() {
        return this.innerProperties() == null ? null : this.innerProperties().gitHub();
    }

    /**
     * Set the gitHub property: Properties for a GitHub catalog type.
     * 
     * @param gitHub the gitHub value to set.
     * @return the CatalogInner object itself.
     */
    public CatalogInner withGitHub(GitCatalog gitHub) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CatalogProperties();
        }
        this.innerProperties().withGitHub(gitHub);
        return this;
    }

    /**
     * Get the adoGit property: Properties for an Azure DevOps catalog type.
     * 
     * @return the adoGit value.
     */
    public GitCatalog adoGit() {
        return this.innerProperties() == null ? null : this.innerProperties().adoGit();
    }

    /**
     * Set the adoGit property: Properties for an Azure DevOps catalog type.
     * 
     * @param adoGit the adoGit value to set.
     * @return the CatalogInner object itself.
     */
    public CatalogInner withAdoGit(GitCatalog adoGit) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CatalogProperties();
        }
        this.innerProperties().withAdoGit(adoGit);
        return this;
    }

    /**
     * Get the syncType property: Indicates the type of sync that is configured for the catalog.
     * 
     * @return the syncType value.
     */
    public CatalogSyncType syncType() {
        return this.innerProperties() == null ? null : this.innerProperties().syncType();
    }

    /**
     * Set the syncType property: Indicates the type of sync that is configured for the catalog.
     * 
     * @param syncType the syncType value to set.
     * @return the CatalogInner object itself.
     */
    public CatalogInner withSyncType(CatalogSyncType syncType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CatalogProperties();
        }
        this.innerProperties().withSyncType(syncType);
        return this;
    }

    /**
     * Get the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.innerProperties() == null ? null : this.innerProperties().tags();
    }

    /**
     * Set the tags property: Resource tags.
     * 
     * @param tags the tags value to set.
     * @return the CatalogInner object itself.
     */
    public CatalogInner withTags(Map<String, String> tags) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CatalogProperties();
        }
        this.innerProperties().withTags(tags);
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

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CatalogInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CatalogInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CatalogInner.
     */
    public static CatalogInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CatalogInner deserializedCatalogInner = new CatalogInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedCatalogInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedCatalogInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedCatalogInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedCatalogInner.innerProperties = CatalogProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedCatalogInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCatalogInner;
        });
    }
}
