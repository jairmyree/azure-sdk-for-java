// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A list of pipeline resources.
 */
@Fluent
public final class PipelineListResponse implements JsonSerializable<PipelineListResponse> {
    /*
     * List of pipelines.
     */
    @Generated
    private List<PipelineResource> value;

    /*
     * The link to the next page of results, if any remaining results exist.
     */
    @Generated
    private String nextLink;

    /**
     * Creates an instance of PipelineListResponse class.
     */
    @Generated
    public PipelineListResponse() {
    }

    /**
     * Get the value property: List of pipelines.
     * 
     * @return the value value.
     */
    @Generated
    public List<PipelineResource> getValue() {
        return this.value;
    }

    /**
     * Set the value property: List of pipelines.
     * 
     * @param value the value value to set.
     * @return the PipelineListResponse object itself.
     */
    @Generated
    public PipelineListResponse setValue(List<PipelineResource> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of results, if any remaining results exist.
     * 
     * @return the nextLink value.
     */
    @Generated
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of results, if any remaining results exist.
     * 
     * @param nextLink the nextLink value to set.
     * @return the PipelineListResponse object itself.
     */
    @Generated
    public PipelineListResponse setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PipelineListResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PipelineListResponse if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PipelineListResponse.
     */
    @Generated
    public static PipelineListResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PipelineListResponse deserializedPipelineListResponse = new PipelineListResponse();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<PipelineResource> value = reader.readArray(reader1 -> PipelineResource.fromJson(reader1));
                    deserializedPipelineListResponse.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedPipelineListResponse.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPipelineListResponse;
        });
    }
}
