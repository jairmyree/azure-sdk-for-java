// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The ProviderHubMetadata model.
 */
@Fluent
public class ProviderHubMetadata implements JsonSerializable<ProviderHubMetadata> {
    /*
     * The provider authorizations.
     */
    private List<ResourceProviderAuthorization> providerAuthorizations;

    /*
     * The provider authentication.
     */
    private ProviderHubMetadataProviderAuthentication providerAuthentication;

    /*
     * The third party provider authorization.
     */
    private ProviderHubMetadataThirdPartyProviderAuthorization thirdPartyProviderAuthorization;

    /*
     * The direct RP role definition id.
     */
    private String directRpRoleDefinitionId;

    /*
     * The regional async operation resource type name.
     */
    private String regionalAsyncOperationResourceTypeName;

    /*
     * The global async operation resource type name.
     */
    private String globalAsyncOperationResourceTypeName;

    /**
     * Creates an instance of ProviderHubMetadata class.
     */
    public ProviderHubMetadata() {
    }

    /**
     * Get the providerAuthorizations property: The provider authorizations.
     * 
     * @return the providerAuthorizations value.
     */
    public List<ResourceProviderAuthorization> providerAuthorizations() {
        return this.providerAuthorizations;
    }

    /**
     * Set the providerAuthorizations property: The provider authorizations.
     * 
     * @param providerAuthorizations the providerAuthorizations value to set.
     * @return the ProviderHubMetadata object itself.
     */
    public ProviderHubMetadata withProviderAuthorizations(List<ResourceProviderAuthorization> providerAuthorizations) {
        this.providerAuthorizations = providerAuthorizations;
        return this;
    }

    /**
     * Get the providerAuthentication property: The provider authentication.
     * 
     * @return the providerAuthentication value.
     */
    public ProviderHubMetadataProviderAuthentication providerAuthentication() {
        return this.providerAuthentication;
    }

    /**
     * Set the providerAuthentication property: The provider authentication.
     * 
     * @param providerAuthentication the providerAuthentication value to set.
     * @return the ProviderHubMetadata object itself.
     */
    public ProviderHubMetadata
        withProviderAuthentication(ProviderHubMetadataProviderAuthentication providerAuthentication) {
        this.providerAuthentication = providerAuthentication;
        return this;
    }

    /**
     * Get the thirdPartyProviderAuthorization property: The third party provider authorization.
     * 
     * @return the thirdPartyProviderAuthorization value.
     */
    public ProviderHubMetadataThirdPartyProviderAuthorization thirdPartyProviderAuthorization() {
        return this.thirdPartyProviderAuthorization;
    }

    /**
     * Set the thirdPartyProviderAuthorization property: The third party provider authorization.
     * 
     * @param thirdPartyProviderAuthorization the thirdPartyProviderAuthorization value to set.
     * @return the ProviderHubMetadata object itself.
     */
    public ProviderHubMetadata withThirdPartyProviderAuthorization(
        ProviderHubMetadataThirdPartyProviderAuthorization thirdPartyProviderAuthorization) {
        this.thirdPartyProviderAuthorization = thirdPartyProviderAuthorization;
        return this;
    }

    /**
     * Get the directRpRoleDefinitionId property: The direct RP role definition id.
     * 
     * @return the directRpRoleDefinitionId value.
     */
    public String directRpRoleDefinitionId() {
        return this.directRpRoleDefinitionId;
    }

    /**
     * Set the directRpRoleDefinitionId property: The direct RP role definition id.
     * 
     * @param directRpRoleDefinitionId the directRpRoleDefinitionId value to set.
     * @return the ProviderHubMetadata object itself.
     */
    public ProviderHubMetadata withDirectRpRoleDefinitionId(String directRpRoleDefinitionId) {
        this.directRpRoleDefinitionId = directRpRoleDefinitionId;
        return this;
    }

    /**
     * Get the regionalAsyncOperationResourceTypeName property: The regional async operation resource type name.
     * 
     * @return the regionalAsyncOperationResourceTypeName value.
     */
    public String regionalAsyncOperationResourceTypeName() {
        return this.regionalAsyncOperationResourceTypeName;
    }

    /**
     * Set the regionalAsyncOperationResourceTypeName property: The regional async operation resource type name.
     * 
     * @param regionalAsyncOperationResourceTypeName the regionalAsyncOperationResourceTypeName value to set.
     * @return the ProviderHubMetadata object itself.
     */
    public ProviderHubMetadata
        withRegionalAsyncOperationResourceTypeName(String regionalAsyncOperationResourceTypeName) {
        this.regionalAsyncOperationResourceTypeName = regionalAsyncOperationResourceTypeName;
        return this;
    }

    /**
     * Get the globalAsyncOperationResourceTypeName property: The global async operation resource type name.
     * 
     * @return the globalAsyncOperationResourceTypeName value.
     */
    public String globalAsyncOperationResourceTypeName() {
        return this.globalAsyncOperationResourceTypeName;
    }

    /**
     * Set the globalAsyncOperationResourceTypeName property: The global async operation resource type name.
     * 
     * @param globalAsyncOperationResourceTypeName the globalAsyncOperationResourceTypeName value to set.
     * @return the ProviderHubMetadata object itself.
     */
    public ProviderHubMetadata withGlobalAsyncOperationResourceTypeName(String globalAsyncOperationResourceTypeName) {
        this.globalAsyncOperationResourceTypeName = globalAsyncOperationResourceTypeName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (providerAuthorizations() != null) {
            providerAuthorizations().forEach(e -> e.validate());
        }
        if (providerAuthentication() != null) {
            providerAuthentication().validate();
        }
        if (thirdPartyProviderAuthorization() != null) {
            thirdPartyProviderAuthorization().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("providerAuthorizations", this.providerAuthorizations,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("providerAuthentication", this.providerAuthentication);
        jsonWriter.writeJsonField("thirdPartyProviderAuthorization", this.thirdPartyProviderAuthorization);
        jsonWriter.writeStringField("directRpRoleDefinitionId", this.directRpRoleDefinitionId);
        jsonWriter.writeStringField("regionalAsyncOperationResourceTypeName",
            this.regionalAsyncOperationResourceTypeName);
        jsonWriter.writeStringField("globalAsyncOperationResourceTypeName", this.globalAsyncOperationResourceTypeName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProviderHubMetadata from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProviderHubMetadata if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProviderHubMetadata.
     */
    public static ProviderHubMetadata fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProviderHubMetadata deserializedProviderHubMetadata = new ProviderHubMetadata();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("providerAuthorizations".equals(fieldName)) {
                    List<ResourceProviderAuthorization> providerAuthorizations
                        = reader.readArray(reader1 -> ResourceProviderAuthorization.fromJson(reader1));
                    deserializedProviderHubMetadata.providerAuthorizations = providerAuthorizations;
                } else if ("providerAuthentication".equals(fieldName)) {
                    deserializedProviderHubMetadata.providerAuthentication
                        = ProviderHubMetadataProviderAuthentication.fromJson(reader);
                } else if ("thirdPartyProviderAuthorization".equals(fieldName)) {
                    deserializedProviderHubMetadata.thirdPartyProviderAuthorization
                        = ProviderHubMetadataThirdPartyProviderAuthorization.fromJson(reader);
                } else if ("directRpRoleDefinitionId".equals(fieldName)) {
                    deserializedProviderHubMetadata.directRpRoleDefinitionId = reader.getString();
                } else if ("regionalAsyncOperationResourceTypeName".equals(fieldName)) {
                    deserializedProviderHubMetadata.regionalAsyncOperationResourceTypeName = reader.getString();
                } else if ("globalAsyncOperationResourceTypeName".equals(fieldName)) {
                    deserializedProviderHubMetadata.globalAsyncOperationResourceTypeName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProviderHubMetadata;
        });
    }
}
