// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.monitor.applicationinsights.spring;

import io.opentelemetry.sdk.resources.Resource;
import io.opentelemetry.semconv.resource.attributes.ResourceAttributes;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This component alerts the user to the fact that the OpenTelemetry version used is not compatible
 * with the starter. One use case is Spring Boot 3 using OpenTelemetry.
 */
@Component
public class OpenTelemetryVersionCheckRunner implements CommandLineRunner {
    private static final Logger LOG = LoggerFactory.getLogger(OpenTelemetryVersionCheckRunner.class);

    // If this version is not up-to-date, a test will fail.
    /**
     * OpenTelemetry version of the starter
     */
    public static final String STARTER_OTEL_VERSION = "1.28.0";

    private final Resource otelResource;

    /**
     * Component to check the OpenTelemetry version.
     *
     * @param otelResource OpenTelemetry resource
     */
    public OpenTelemetryVersionCheckRunner(Resource otelResource) {
        this.otelResource = otelResource;
    }

    /**
     * To verify the OpenTelemetry version at the application start-up.
     *
     * @param args args
     */
    @Override
    public void run(String... args) {
        try {
            String currentOTelVersionAsString = otelResource.getAttribute(ResourceAttributes.TELEMETRY_SDK_VERSION);
            OTelVersion currentOtelVersion = new OTelVersion(currentOTelVersionAsString);
            OTelVersion starterOTelVersion = new OTelVersion(STARTER_OTEL_VERSION);
            checkOpenTelemetryVersion(currentOtelVersion, starterOTelVersion);
        } catch (Exception e) {
            LOG.warn(
                "An unexpected issue has happened during the verification of the OpenTelemetry version.",
                e);
        }
    }

    private static void checkOpenTelemetryVersion(
        OTelVersion currentOTelVersion, OTelVersion starterOTelVersion) {
        if (!currentOTelVersion.hasSameMajorVersionAs(starterOTelVersion) && currentOTelVersion.isLessThan(starterOTelVersion)) {
            LOG.warn(
                "The OpenTelemetry version is not compatible with the spring-cloud-azure-starter-monitor dependency. The OpenTelemetry version should be "
                    + STARTER_OTEL_VERSION
                    + ". "
                    + "Please look at the spring-cloud-azure-starter-monitor documentation to fix this.");
        } else if (currentOTelVersion.isGreaterThan(starterOTelVersion)) {
            LOG.info(
                "A new version of spring-cloud-azure-starter-monitor dependency may be available.");
        }
    }
}