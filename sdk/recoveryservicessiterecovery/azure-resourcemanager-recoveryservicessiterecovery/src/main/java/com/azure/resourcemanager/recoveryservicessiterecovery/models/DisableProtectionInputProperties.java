// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Disable protection input properties.
 */
@Fluent
public final class DisableProtectionInputProperties implements JsonSerializable<DisableProtectionInputProperties> {
    /*
     * Disable protection reason. It can have values NotSpecified/MigrationComplete.
     */
    private DisableProtectionReason disableProtectionReason;

    /*
     * Replication provider specific input.
     */
    private DisableProtectionProviderSpecificInput replicationProviderInput;

    /**
     * Creates an instance of DisableProtectionInputProperties class.
     */
    public DisableProtectionInputProperties() {
    }

    /**
     * Get the disableProtectionReason property: Disable protection reason. It can have values
     * NotSpecified/MigrationComplete.
     * 
     * @return the disableProtectionReason value.
     */
    public DisableProtectionReason disableProtectionReason() {
        return this.disableProtectionReason;
    }

    /**
     * Set the disableProtectionReason property: Disable protection reason. It can have values
     * NotSpecified/MigrationComplete.
     * 
     * @param disableProtectionReason the disableProtectionReason value to set.
     * @return the DisableProtectionInputProperties object itself.
     */
    public DisableProtectionInputProperties
        withDisableProtectionReason(DisableProtectionReason disableProtectionReason) {
        this.disableProtectionReason = disableProtectionReason;
        return this;
    }

    /**
     * Get the replicationProviderInput property: Replication provider specific input.
     * 
     * @return the replicationProviderInput value.
     */
    public DisableProtectionProviderSpecificInput replicationProviderInput() {
        return this.replicationProviderInput;
    }

    /**
     * Set the replicationProviderInput property: Replication provider specific input.
     * 
     * @param replicationProviderInput the replicationProviderInput value to set.
     * @return the DisableProtectionInputProperties object itself.
     */
    public DisableProtectionInputProperties
        withReplicationProviderInput(DisableProtectionProviderSpecificInput replicationProviderInput) {
        this.replicationProviderInput = replicationProviderInput;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (replicationProviderInput() != null) {
            replicationProviderInput().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("disableProtectionReason",
            this.disableProtectionReason == null ? null : this.disableProtectionReason.toString());
        jsonWriter.writeJsonField("replicationProviderInput", this.replicationProviderInput);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DisableProtectionInputProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DisableProtectionInputProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DisableProtectionInputProperties.
     */
    public static DisableProtectionInputProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DisableProtectionInputProperties deserializedDisableProtectionInputProperties
                = new DisableProtectionInputProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("disableProtectionReason".equals(fieldName)) {
                    deserializedDisableProtectionInputProperties.disableProtectionReason
                        = DisableProtectionReason.fromString(reader.getString());
                } else if ("replicationProviderInput".equals(fieldName)) {
                    deserializedDisableProtectionInputProperties.replicationProviderInput
                        = DisableProtectionProviderSpecificInput.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDisableProtectionInputProperties;
        });
    }
}
