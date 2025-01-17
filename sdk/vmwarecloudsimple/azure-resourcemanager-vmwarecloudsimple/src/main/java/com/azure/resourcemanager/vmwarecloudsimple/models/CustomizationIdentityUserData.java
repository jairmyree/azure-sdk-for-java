// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Windows Identity. User data customization.
 */
@Fluent
public final class CustomizationIdentityUserData implements JsonSerializable<CustomizationIdentityUserData> {
    /*
     * Is password predefined in customization policy
     */
    private Boolean isPasswordPredefined;

    /**
     * Creates an instance of CustomizationIdentityUserData class.
     */
    public CustomizationIdentityUserData() {
    }

    /**
     * Get the isPasswordPredefined property: Is password predefined in customization policy.
     * 
     * @return the isPasswordPredefined value.
     */
    public Boolean isPasswordPredefined() {
        return this.isPasswordPredefined;
    }

    /**
     * Set the isPasswordPredefined property: Is password predefined in customization policy.
     * 
     * @param isPasswordPredefined the isPasswordPredefined value to set.
     * @return the CustomizationIdentityUserData object itself.
     */
    public CustomizationIdentityUserData withIsPasswordPredefined(Boolean isPasswordPredefined) {
        this.isPasswordPredefined = isPasswordPredefined;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("isPasswordPredefined", this.isPasswordPredefined);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CustomizationIdentityUserData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CustomizationIdentityUserData if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CustomizationIdentityUserData.
     */
    public static CustomizationIdentityUserData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CustomizationIdentityUserData deserializedCustomizationIdentityUserData
                = new CustomizationIdentityUserData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("isPasswordPredefined".equals(fieldName)) {
                    deserializedCustomizationIdentityUserData.isPasswordPredefined
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCustomizationIdentityUserData;
        });
    }
}
