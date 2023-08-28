// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.metricsbatch;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/** Initializes a new instance of the AzureMonitorMetricBatch type. */
public final class AzureMonitorMetricBatch {
    /**
     * The regional endpoint to use, for example https://eastus.metrics.monitor.azure.com. The region should match the
     * region of the requested resources. For global resources, the region should be 'global'.
     */
    private final String endpoint;

    /**
     * Gets The regional endpoint to use, for example https://eastus.metrics.monitor.azure.com. The region should match
     * the region of the requested resources. For global resources, the region should be 'global'.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The Metrics object to access its operations. */
    private final Metrics metrics;

    /**
     * Gets the Metrics object to access its operations.
     *
     * @return the Metrics object.
     */
    public Metrics getMetrics() {
        return this.metrics;
    }

    /**
     * Initializes an instance of AzureMonitorMetricBatch client.
     *
     * @param endpoint The regional endpoint to use, for example https://eastus.metrics.monitor.azure.com. The region
     *     should match the region of the requested resources. For global resources, the region should be 'global'.
     * @param apiVersion Api Version.
     */
    AzureMonitorMetricBatch(String endpoint, String apiVersion) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                endpoint,
                apiVersion);
    }

    /**
     * Initializes an instance of AzureMonitorMetricBatch client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint The regional endpoint to use, for example https://eastus.metrics.monitor.azure.com. The region
     *     should match the region of the requested resources. For global resources, the region should be 'global'.
     * @param apiVersion Api Version.
     */
    AzureMonitorMetricBatch(HttpPipeline httpPipeline, String endpoint, String apiVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, apiVersion);
    }

    /**
     * Initializes an instance of AzureMonitorMetricBatch client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint The regional endpoint to use, for example https://eastus.metrics.monitor.azure.com. The region
     *     should match the region of the requested resources. For global resources, the region should be 'global'.
     * @param apiVersion Api Version.
     */
    AzureMonitorMetricBatch(
            HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String endpoint, String apiVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.apiVersion = apiVersion;
        this.metrics = new Metrics(this);
    }
}