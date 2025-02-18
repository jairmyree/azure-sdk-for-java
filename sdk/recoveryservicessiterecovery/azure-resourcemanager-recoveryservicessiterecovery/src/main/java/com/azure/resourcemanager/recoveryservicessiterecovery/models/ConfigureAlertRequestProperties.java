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
import java.util.List;

/**
 * Properties of a configure alert request.
 */
@Fluent
public final class ConfigureAlertRequestProperties implements JsonSerializable<ConfigureAlertRequestProperties> {
    /*
     * A value indicating whether to send email to subscription administrator.
     */
    private String sendToOwners;

    /*
     * The custom email address for sending emails.
     */
    private List<String> customEmailAddresses;

    /*
     * The locale for the email notification.
     */
    private String locale;

    /**
     * Creates an instance of ConfigureAlertRequestProperties class.
     */
    public ConfigureAlertRequestProperties() {
    }

    /**
     * Get the sendToOwners property: A value indicating whether to send email to subscription administrator.
     * 
     * @return the sendToOwners value.
     */
    public String sendToOwners() {
        return this.sendToOwners;
    }

    /**
     * Set the sendToOwners property: A value indicating whether to send email to subscription administrator.
     * 
     * @param sendToOwners the sendToOwners value to set.
     * @return the ConfigureAlertRequestProperties object itself.
     */
    public ConfigureAlertRequestProperties withSendToOwners(String sendToOwners) {
        this.sendToOwners = sendToOwners;
        return this;
    }

    /**
     * Get the customEmailAddresses property: The custom email address for sending emails.
     * 
     * @return the customEmailAddresses value.
     */
    public List<String> customEmailAddresses() {
        return this.customEmailAddresses;
    }

    /**
     * Set the customEmailAddresses property: The custom email address for sending emails.
     * 
     * @param customEmailAddresses the customEmailAddresses value to set.
     * @return the ConfigureAlertRequestProperties object itself.
     */
    public ConfigureAlertRequestProperties withCustomEmailAddresses(List<String> customEmailAddresses) {
        this.customEmailAddresses = customEmailAddresses;
        return this;
    }

    /**
     * Get the locale property: The locale for the email notification.
     * 
     * @return the locale value.
     */
    public String locale() {
        return this.locale;
    }

    /**
     * Set the locale property: The locale for the email notification.
     * 
     * @param locale the locale value to set.
     * @return the ConfigureAlertRequestProperties object itself.
     */
    public ConfigureAlertRequestProperties withLocale(String locale) {
        this.locale = locale;
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
        jsonWriter.writeStringField("sendToOwners", this.sendToOwners);
        jsonWriter.writeArrayField("customEmailAddresses", this.customEmailAddresses,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("locale", this.locale);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConfigureAlertRequestProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConfigureAlertRequestProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConfigureAlertRequestProperties.
     */
    public static ConfigureAlertRequestProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConfigureAlertRequestProperties deserializedConfigureAlertRequestProperties
                = new ConfigureAlertRequestProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sendToOwners".equals(fieldName)) {
                    deserializedConfigureAlertRequestProperties.sendToOwners = reader.getString();
                } else if ("customEmailAddresses".equals(fieldName)) {
                    List<String> customEmailAddresses = reader.readArray(reader1 -> reader1.getString());
                    deserializedConfigureAlertRequestProperties.customEmailAddresses = customEmailAddresses;
                } else if ("locale".equals(fieldName)) {
                    deserializedConfigureAlertRequestProperties.locale = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConfigureAlertRequestProperties;
        });
    }
}
