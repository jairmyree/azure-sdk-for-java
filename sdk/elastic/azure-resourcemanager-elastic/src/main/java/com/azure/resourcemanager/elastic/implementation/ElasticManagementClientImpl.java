// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.management.polling.PollerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.elastic.fluent.AllTrafficFiltersClient;
import com.azure.resourcemanager.elastic.fluent.AssociateTrafficFiltersClient;
import com.azure.resourcemanager.elastic.fluent.BillingInfoesClient;
import com.azure.resourcemanager.elastic.fluent.ConnectedPartnerResourcesClient;
import com.azure.resourcemanager.elastic.fluent.CreateAndAssociateIpFiltersClient;
import com.azure.resourcemanager.elastic.fluent.CreateAndAssociatePLFiltersClient;
import com.azure.resourcemanager.elastic.fluent.DeploymentInfoesClient;
import com.azure.resourcemanager.elastic.fluent.DetachAndDeleteTrafficFiltersClient;
import com.azure.resourcemanager.elastic.fluent.DetachTrafficFiltersClient;
import com.azure.resourcemanager.elastic.fluent.ElasticManagementClient;
import com.azure.resourcemanager.elastic.fluent.ElasticVersionsClient;
import com.azure.resourcemanager.elastic.fluent.ExternalUsersClient;
import com.azure.resourcemanager.elastic.fluent.ListAssociatedTrafficFiltersClient;
import com.azure.resourcemanager.elastic.fluent.MonitorOperationsClient;
import com.azure.resourcemanager.elastic.fluent.MonitoredResourcesClient;
import com.azure.resourcemanager.elastic.fluent.MonitorsClient;
import com.azure.resourcemanager.elastic.fluent.OpenAIsClient;
import com.azure.resourcemanager.elastic.fluent.OperationsClient;
import com.azure.resourcemanager.elastic.fluent.OrganizationsClient;
import com.azure.resourcemanager.elastic.fluent.TagRulesClient;
import com.azure.resourcemanager.elastic.fluent.TrafficFiltersClient;
import com.azure.resourcemanager.elastic.fluent.UpgradableVersionsClient;
import com.azure.resourcemanager.elastic.fluent.VMCollectionsClient;
import com.azure.resourcemanager.elastic.fluent.VMHostsClient;
import com.azure.resourcemanager.elastic.fluent.VMIngestionsClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the ElasticManagementClientImpl type.
 */
@ServiceClient(builder = ElasticManagementClientBuilder.class)
public final class ElasticManagementClientImpl implements ElasticManagementClient {
    /**
     * The ID of the target subscription. The value must be an UUID.
     */
    private final String subscriptionId;

    /**
     * Gets The ID of the target subscription. The value must be an UUID.
     * 
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * server parameter.
     */
    private final String endpoint;

    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Api Version.
     */
    private final String apiVersion;

    /**
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The serializer to serialize an object into a string.
     */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     * 
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * The default poll interval for long-running operation.
     */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /**
     * The OperationsClient object to access its operations.
     */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /**
     * The MonitorsClient object to access its operations.
     */
    private final MonitorsClient monitors;

    /**
     * Gets the MonitorsClient object to access its operations.
     * 
     * @return the MonitorsClient object.
     */
    public MonitorsClient getMonitors() {
        return this.monitors;
    }

    /**
     * The ElasticVersionsClient object to access its operations.
     */
    private final ElasticVersionsClient elasticVersions;

    /**
     * Gets the ElasticVersionsClient object to access its operations.
     * 
     * @return the ElasticVersionsClient object.
     */
    public ElasticVersionsClient getElasticVersions() {
        return this.elasticVersions;
    }

    /**
     * The MonitoredResourcesClient object to access its operations.
     */
    private final MonitoredResourcesClient monitoredResources;

    /**
     * Gets the MonitoredResourcesClient object to access its operations.
     * 
     * @return the MonitoredResourcesClient object.
     */
    public MonitoredResourcesClient getMonitoredResources() {
        return this.monitoredResources;
    }

    /**
     * The DeploymentInfoesClient object to access its operations.
     */
    private final DeploymentInfoesClient deploymentInfoes;

    /**
     * Gets the DeploymentInfoesClient object to access its operations.
     * 
     * @return the DeploymentInfoesClient object.
     */
    public DeploymentInfoesClient getDeploymentInfoes() {
        return this.deploymentInfoes;
    }

    /**
     * The ExternalUsersClient object to access its operations.
     */
    private final ExternalUsersClient externalUsers;

    /**
     * Gets the ExternalUsersClient object to access its operations.
     * 
     * @return the ExternalUsersClient object.
     */
    public ExternalUsersClient getExternalUsers() {
        return this.externalUsers;
    }

    /**
     * The BillingInfoesClient object to access its operations.
     */
    private final BillingInfoesClient billingInfoes;

    /**
     * Gets the BillingInfoesClient object to access its operations.
     * 
     * @return the BillingInfoesClient object.
     */
    public BillingInfoesClient getBillingInfoes() {
        return this.billingInfoes;
    }

    /**
     * The ConnectedPartnerResourcesClient object to access its operations.
     */
    private final ConnectedPartnerResourcesClient connectedPartnerResources;

    /**
     * Gets the ConnectedPartnerResourcesClient object to access its operations.
     * 
     * @return the ConnectedPartnerResourcesClient object.
     */
    public ConnectedPartnerResourcesClient getConnectedPartnerResources() {
        return this.connectedPartnerResources;
    }

    /**
     * The OpenAIsClient object to access its operations.
     */
    private final OpenAIsClient openAIs;

    /**
     * Gets the OpenAIsClient object to access its operations.
     * 
     * @return the OpenAIsClient object.
     */
    public OpenAIsClient getOpenAIs() {
        return this.openAIs;
    }

    /**
     * The TagRulesClient object to access its operations.
     */
    private final TagRulesClient tagRules;

    /**
     * Gets the TagRulesClient object to access its operations.
     * 
     * @return the TagRulesClient object.
     */
    public TagRulesClient getTagRules() {
        return this.tagRules;
    }

    /**
     * The VMHostsClient object to access its operations.
     */
    private final VMHostsClient vMHosts;

    /**
     * Gets the VMHostsClient object to access its operations.
     * 
     * @return the VMHostsClient object.
     */
    public VMHostsClient getVMHosts() {
        return this.vMHosts;
    }

    /**
     * The VMIngestionsClient object to access its operations.
     */
    private final VMIngestionsClient vMIngestions;

    /**
     * Gets the VMIngestionsClient object to access its operations.
     * 
     * @return the VMIngestionsClient object.
     */
    public VMIngestionsClient getVMIngestions() {
        return this.vMIngestions;
    }

    /**
     * The VMCollectionsClient object to access its operations.
     */
    private final VMCollectionsClient vMCollections;

    /**
     * Gets the VMCollectionsClient object to access its operations.
     * 
     * @return the VMCollectionsClient object.
     */
    public VMCollectionsClient getVMCollections() {
        return this.vMCollections;
    }

    /**
     * The UpgradableVersionsClient object to access its operations.
     */
    private final UpgradableVersionsClient upgradableVersions;

    /**
     * Gets the UpgradableVersionsClient object to access its operations.
     * 
     * @return the UpgradableVersionsClient object.
     */
    public UpgradableVersionsClient getUpgradableVersions() {
        return this.upgradableVersions;
    }

    /**
     * The MonitorOperationsClient object to access its operations.
     */
    private final MonitorOperationsClient monitorOperations;

    /**
     * Gets the MonitorOperationsClient object to access its operations.
     * 
     * @return the MonitorOperationsClient object.
     */
    public MonitorOperationsClient getMonitorOperations() {
        return this.monitorOperations;
    }

    /**
     * The AllTrafficFiltersClient object to access its operations.
     */
    private final AllTrafficFiltersClient allTrafficFilters;

    /**
     * Gets the AllTrafficFiltersClient object to access its operations.
     * 
     * @return the AllTrafficFiltersClient object.
     */
    public AllTrafficFiltersClient getAllTrafficFilters() {
        return this.allTrafficFilters;
    }

    /**
     * The ListAssociatedTrafficFiltersClient object to access its operations.
     */
    private final ListAssociatedTrafficFiltersClient listAssociatedTrafficFilters;

    /**
     * Gets the ListAssociatedTrafficFiltersClient object to access its operations.
     * 
     * @return the ListAssociatedTrafficFiltersClient object.
     */
    public ListAssociatedTrafficFiltersClient getListAssociatedTrafficFilters() {
        return this.listAssociatedTrafficFilters;
    }

    /**
     * The CreateAndAssociateIpFiltersClient object to access its operations.
     */
    private final CreateAndAssociateIpFiltersClient createAndAssociateIpFilters;

    /**
     * Gets the CreateAndAssociateIpFiltersClient object to access its operations.
     * 
     * @return the CreateAndAssociateIpFiltersClient object.
     */
    public CreateAndAssociateIpFiltersClient getCreateAndAssociateIpFilters() {
        return this.createAndAssociateIpFilters;
    }

    /**
     * The CreateAndAssociatePLFiltersClient object to access its operations.
     */
    private final CreateAndAssociatePLFiltersClient createAndAssociatePLFilters;

    /**
     * Gets the CreateAndAssociatePLFiltersClient object to access its operations.
     * 
     * @return the CreateAndAssociatePLFiltersClient object.
     */
    public CreateAndAssociatePLFiltersClient getCreateAndAssociatePLFilters() {
        return this.createAndAssociatePLFilters;
    }

    /**
     * The AssociateTrafficFiltersClient object to access its operations.
     */
    private final AssociateTrafficFiltersClient associateTrafficFilters;

    /**
     * Gets the AssociateTrafficFiltersClient object to access its operations.
     * 
     * @return the AssociateTrafficFiltersClient object.
     */
    public AssociateTrafficFiltersClient getAssociateTrafficFilters() {
        return this.associateTrafficFilters;
    }

    /**
     * The DetachAndDeleteTrafficFiltersClient object to access its operations.
     */
    private final DetachAndDeleteTrafficFiltersClient detachAndDeleteTrafficFilters;

    /**
     * Gets the DetachAndDeleteTrafficFiltersClient object to access its operations.
     * 
     * @return the DetachAndDeleteTrafficFiltersClient object.
     */
    public DetachAndDeleteTrafficFiltersClient getDetachAndDeleteTrafficFilters() {
        return this.detachAndDeleteTrafficFilters;
    }

    /**
     * The DetachTrafficFiltersClient object to access its operations.
     */
    private final DetachTrafficFiltersClient detachTrafficFilters;

    /**
     * Gets the DetachTrafficFiltersClient object to access its operations.
     * 
     * @return the DetachTrafficFiltersClient object.
     */
    public DetachTrafficFiltersClient getDetachTrafficFilters() {
        return this.detachTrafficFilters;
    }

    /**
     * The TrafficFiltersClient object to access its operations.
     */
    private final TrafficFiltersClient trafficFilters;

    /**
     * Gets the TrafficFiltersClient object to access its operations.
     * 
     * @return the TrafficFiltersClient object.
     */
    public TrafficFiltersClient getTrafficFilters() {
        return this.trafficFilters;
    }

    /**
     * The OrganizationsClient object to access its operations.
     */
    private final OrganizationsClient organizations;

    /**
     * Gets the OrganizationsClient object to access its operations.
     * 
     * @return the OrganizationsClient object.
     */
    public OrganizationsClient getOrganizations() {
        return this.organizations;
    }

    /**
     * Initializes an instance of ElasticManagementClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The ID of the target subscription. The value must be an UUID.
     * @param endpoint server parameter.
     */
    ElasticManagementClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter,
        Duration defaultPollInterval, AzureEnvironment environment, String subscriptionId, String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2024-03-01";
        this.operations = new OperationsClientImpl(this);
        this.monitors = new MonitorsClientImpl(this);
        this.elasticVersions = new ElasticVersionsClientImpl(this);
        this.monitoredResources = new MonitoredResourcesClientImpl(this);
        this.deploymentInfoes = new DeploymentInfoesClientImpl(this);
        this.externalUsers = new ExternalUsersClientImpl(this);
        this.billingInfoes = new BillingInfoesClientImpl(this);
        this.connectedPartnerResources = new ConnectedPartnerResourcesClientImpl(this);
        this.openAIs = new OpenAIsClientImpl(this);
        this.tagRules = new TagRulesClientImpl(this);
        this.vMHosts = new VMHostsClientImpl(this);
        this.vMIngestions = new VMIngestionsClientImpl(this);
        this.vMCollections = new VMCollectionsClientImpl(this);
        this.upgradableVersions = new UpgradableVersionsClientImpl(this);
        this.monitorOperations = new MonitorOperationsClientImpl(this);
        this.allTrafficFilters = new AllTrafficFiltersClientImpl(this);
        this.listAssociatedTrafficFilters = new ListAssociatedTrafficFiltersClientImpl(this);
        this.createAndAssociateIpFilters = new CreateAndAssociateIpFiltersClientImpl(this);
        this.createAndAssociatePLFilters = new CreateAndAssociatePLFiltersClientImpl(this);
        this.associateTrafficFilters = new AssociateTrafficFiltersClientImpl(this);
        this.detachAndDeleteTrafficFilters = new DetachAndDeleteTrafficFiltersClientImpl(this);
        this.detachTrafficFilters = new DetachTrafficFiltersClientImpl(this);
        this.trafficFilters = new TrafficFiltersClientImpl(this);
        this.organizations = new OrganizationsClientImpl(this);
    }

    /**
     * Gets default client context.
     * 
     * @return the default client context.
     */
    public Context getContext() {
        return Context.NONE;
    }

    /**
     * Merges default client context with provided context.
     * 
     * @param context the context to be merged with default client context.
     * @return the merged context.
     */
    public Context mergeContext(Context context) {
        return CoreUtils.mergeContexts(this.getContext(), context);
    }

    /**
     * Gets long running operation result.
     * 
     * @param activationResponse the response of activation operation.
     * @param httpPipeline the http pipeline.
     * @param pollResultType type of poll result.
     * @param finalResultType type of final result.
     * @param context the context shared by all requests.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return poller flux for poll result and final result.
     */
    public <T, U> PollerFlux<PollResult<T>, U> getLroResult(Mono<Response<Flux<ByteBuffer>>> activationResponse,
        HttpPipeline httpPipeline, Type pollResultType, Type finalResultType, Context context) {
        return PollerFactory.create(serializerAdapter, httpPipeline, pollResultType, finalResultType,
            defaultPollInterval, activationResponse, context);
    }

    /**
     * Gets the final result, or an error, based on last async poll response.
     * 
     * @param response the last async poll response.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return the final result, or an error.
     */
    public <T, U> Mono<U> getLroFinalResultOrError(AsyncPollResponse<PollResult<T>, U> response) {
        if (response.getStatus() != LongRunningOperationStatus.SUCCESSFULLY_COMPLETED) {
            String errorMessage;
            ManagementError managementError = null;
            HttpResponse errorResponse = null;
            PollResult.Error lroError = response.getValue().getError();
            if (lroError != null) {
                errorResponse = new HttpResponseImpl(lroError.getResponseStatusCode(), lroError.getResponseHeaders(),
                    lroError.getResponseBody());

                errorMessage = response.getValue().getError().getMessage();
                String errorBody = response.getValue().getError().getResponseBody();
                if (errorBody != null) {
                    // try to deserialize error body to ManagementError
                    try {
                        managementError = this.getSerializerAdapter()
                            .deserialize(errorBody, ManagementError.class, SerializerEncoding.JSON);
                        if (managementError.getCode() == null || managementError.getMessage() == null) {
                            managementError = null;
                        }
                    } catch (IOException | RuntimeException ioe) {
                        LOGGER.logThrowableAsWarning(ioe);
                    }
                }
            } else {
                // fallback to default error message
                errorMessage = "Long running operation failed.";
            }
            if (managementError == null) {
                // fallback to default ManagementError
                managementError = new ManagementError(response.getStatus().toString(), errorMessage);
            }
            return Mono.error(new ManagementException(errorMessage, errorResponse, managementError));
        } else {
            return response.getFinalResult();
        }
    }

    private static final class HttpResponseImpl extends HttpResponse {
        private final int statusCode;

        private final byte[] responseBody;

        private final HttpHeaders httpHeaders;

        HttpResponseImpl(int statusCode, HttpHeaders httpHeaders, String responseBody) {
            super(null);
            this.statusCode = statusCode;
            this.httpHeaders = httpHeaders;
            this.responseBody = responseBody == null ? null : responseBody.getBytes(StandardCharsets.UTF_8);
        }

        public int getStatusCode() {
            return statusCode;
        }

        public String getHeaderValue(String s) {
            return httpHeaders.getValue(HttpHeaderName.fromString(s));
        }

        public HttpHeaders getHeaders() {
            return httpHeaders;
        }

        public Flux<ByteBuffer> getBody() {
            return Flux.just(ByteBuffer.wrap(responseBody));
        }

        public Mono<byte[]> getBodyAsByteArray() {
            return Mono.just(responseBody);
        }

        public Mono<String> getBodyAsString() {
            return Mono.just(new String(responseBody, StandardCharsets.UTF_8));
        }

        public Mono<String> getBodyAsString(Charset charset) {
            return Mono.just(new String(responseBody, charset));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ElasticManagementClientImpl.class);
}
