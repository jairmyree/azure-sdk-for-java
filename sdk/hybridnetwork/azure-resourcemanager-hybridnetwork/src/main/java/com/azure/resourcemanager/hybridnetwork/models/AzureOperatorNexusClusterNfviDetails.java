// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The AzureOperatorNexusCluster NFVI detail.
 */
@Fluent
public final class AzureOperatorNexusClusterNfviDetails extends NfvIs {
    /*
     * The NFVI type.
     */
    private NfviType nfviType = NfviType.AZURE_OPERATOR_NEXUS;

    /*
     * The reference to the custom location.
     */
    private ReferencedResource customLocationReference;

    /**
     * Creates an instance of AzureOperatorNexusClusterNfviDetails class.
     */
    public AzureOperatorNexusClusterNfviDetails() {
    }

    /**
     * Get the nfviType property: The NFVI type.
     * 
     * @return the nfviType value.
     */
    @Override
    public NfviType nfviType() {
        return this.nfviType;
    }

    /**
     * Get the customLocationReference property: The reference to the custom location.
     * 
     * @return the customLocationReference value.
     */
    public ReferencedResource customLocationReference() {
        return this.customLocationReference;
    }

    /**
     * Set the customLocationReference property: The reference to the custom location.
     * 
     * @param customLocationReference the customLocationReference value to set.
     * @return the AzureOperatorNexusClusterNfviDetails object itself.
     */
    public AzureOperatorNexusClusterNfviDetails
        withCustomLocationReference(ReferencedResource customLocationReference) {
        this.customLocationReference = customLocationReference;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureOperatorNexusClusterNfviDetails withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (customLocationReference() != null) {
            customLocationReference().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", name());
        jsonWriter.writeStringField("nfviType", this.nfviType == null ? null : this.nfviType.toString());
        jsonWriter.writeJsonField("customLocationReference", this.customLocationReference);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureOperatorNexusClusterNfviDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureOperatorNexusClusterNfviDetails if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureOperatorNexusClusterNfviDetails.
     */
    public static AzureOperatorNexusClusterNfviDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureOperatorNexusClusterNfviDetails deserializedAzureOperatorNexusClusterNfviDetails
                = new AzureOperatorNexusClusterNfviDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedAzureOperatorNexusClusterNfviDetails.withName(reader.getString());
                } else if ("nfviType".equals(fieldName)) {
                    deserializedAzureOperatorNexusClusterNfviDetails.nfviType = NfviType.fromString(reader.getString());
                } else if ("customLocationReference".equals(fieldName)) {
                    deserializedAzureOperatorNexusClusterNfviDetails.customLocationReference
                        = ReferencedResource.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureOperatorNexusClusterNfviDetails;
        });
    }
}
