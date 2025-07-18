// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

/**
 * The MetricSeriesQueryOptions model.
 */
@Fluent
public final class MetricSeriesQueryOptions implements JsonSerializable<MetricSeriesQueryOptions> {
    /*
     * query series ingested after this time, the format should be yyyy-MM-ddTHH:mm:ssZ
     */
    @Generated
    private OffsetDateTime activeSince;

    /*
     * filter specific dimension name and values
     */
    @Generated
    private Map<String, List<String>> dimensionFilter;

    /**
     * Creates an instance of MetricSeriesQueryOptions class.
     */
    @Generated
    public MetricSeriesQueryOptions() {
    }

    /**
     * Get the activeSince property: query series ingested after this time, the format should be yyyy-MM-ddTHH:mm:ssZ.
     * 
     * @return the activeSince value.
     */
    @Generated
    public OffsetDateTime getActiveSince() {
        return this.activeSince;
    }

    /**
     * Set the activeSince property: query series ingested after this time, the format should be yyyy-MM-ddTHH:mm:ssZ.
     * 
     * @param activeSince the activeSince value to set.
     * @return the MetricSeriesQueryOptions object itself.
     */
    @Generated
    public MetricSeriesQueryOptions setActiveSince(OffsetDateTime activeSince) {
        this.activeSince = activeSince;
        return this;
    }

    /**
     * Get the dimensionFilter property: filter specific dimension name and values.
     * 
     * @return the dimensionFilter value.
     */
    @Generated
    public Map<String, List<String>> getDimensionFilter() {
        return this.dimensionFilter;
    }

    /**
     * Set the dimensionFilter property: filter specific dimension name and values.
     * 
     * @param dimensionFilter the dimensionFilter value to set.
     * @return the MetricSeriesQueryOptions object itself.
     */
    @Generated
    public MetricSeriesQueryOptions setDimensionFilter(Map<String, List<String>> dimensionFilter) {
        this.dimensionFilter = dimensionFilter;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("activeSince",
            this.activeSince == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.activeSince));
        jsonWriter.writeMapField("dimensionFilter", this.dimensionFilter,
            (writer, element) -> writer.writeArray(element, (writer1, element1) -> writer1.writeString(element1)));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MetricSeriesQueryOptions from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MetricSeriesQueryOptions if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MetricSeriesQueryOptions.
     */
    @Generated
    public static MetricSeriesQueryOptions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MetricSeriesQueryOptions deserializedMetricSeriesQueryOptions = new MetricSeriesQueryOptions();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("activeSince".equals(fieldName)) {
                    deserializedMetricSeriesQueryOptions.activeSince = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("dimensionFilter".equals(fieldName)) {
                    Map<String, List<String>> dimensionFilter
                        = reader.readMap(reader1 -> reader1.readArray(reader2 -> reader2.getString()));
                    deserializedMetricSeriesQueryOptions.dimensionFilter = dimensionFilter;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMetricSeriesQueryOptions;
        });
    }
}
