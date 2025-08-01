// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.implementation;

import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.credential.TokenCredential;
import com.azure.cosmos.ConsistencyLevel;
import com.azure.cosmos.CosmosContainerProactiveInitConfig;
import com.azure.cosmos.CosmosEndToEndOperationLatencyPolicyConfig;
import com.azure.cosmos.CosmosItemSerializer;
import com.azure.cosmos.CosmosOperationPolicy;
import com.azure.cosmos.ReadConsistencyStrategy;
import com.azure.cosmos.SessionRetryOptions;
import com.azure.cosmos.implementation.apachecommons.lang.StringUtils;
import com.azure.cosmos.implementation.batch.ServerBatchRequest;
import com.azure.cosmos.implementation.caches.RxClientCollectionCache;
import com.azure.cosmos.implementation.caches.RxPartitionKeyRangeCache;
import com.azure.cosmos.implementation.perPartitionAutomaticFailover.GlobalPartitionEndpointManagerForPerPartitionAutomaticFailover;
import com.azure.cosmos.implementation.perPartitionCircuitBreaker.GlobalPartitionEndpointManagerForPerPartitionCircuitBreaker;
import com.azure.cosmos.implementation.clienttelemetry.ClientTelemetry;
import com.azure.cosmos.implementation.directconnectivity.AddressSelector;
import com.azure.cosmos.implementation.faultinjection.IFaultInjectorProvider;
import com.azure.cosmos.implementation.query.PartitionedQueryExecutionInfo;
import com.azure.cosmos.implementation.throughputControl.config.ThroughputControlGroupInternal;
import com.azure.cosmos.models.CosmosAuthorizationTokenResolver;
import com.azure.cosmos.models.CosmosBatchResponse;
import com.azure.cosmos.models.CosmosChangeFeedRequestOptions;
import com.azure.cosmos.models.CosmosClientTelemetryConfig;
import com.azure.cosmos.models.CosmosContainerIdentity;
import com.azure.cosmos.models.CosmosItemIdentity;
import com.azure.cosmos.models.CosmosPatchOperations;
import com.azure.cosmos.models.CosmosQueryRequestOptions;
import com.azure.cosmos.models.FeedRange;
import com.azure.cosmos.models.FeedResponse;
import com.azure.cosmos.models.PartitionKey;
import com.azure.cosmos.models.SqlQuerySpec;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

/**
 * Provides a client-side logical representation of the Azure Cosmos DB
 * database service. This async client is used to configure and execute requests
 * against the service.
 *
 * <p>
 * {@link AsyncDocumentClient} async APIs return <a href="https://github.com/reactor/reactor-core">project reactor</a>'s {@link
 * Flux}, and so you can use project reactor {@link Flux} functionality.
 * <STRONG>The async {@link Flux} based APIs perform the requested operation only after
 * subscription.</STRONG>
 *
 * <p>
 * The service client encapsulates the endpoint and credentials used to access
 * the Cosmos DB service.
 * <p>
 * To instantiate you can use the {@link Builder}
 * <pre>
 * {@code
 * ConnectionPolicy connectionPolicy = new ConnectionPolicy(DirectConnectionConfig.getDefaultConfig());
 * AsyncDocumentClient client = new AsyncDocumentClient.Builder()
 *         .withServiceEndpoint(serviceEndpoint)
 *         .withMasterKeyOrResourceToken(masterKey)
 *         .withConnectionPolicy(connectionPolicy)
 *         .withConsistencyLevel(ConsistencyLevel.SESSION)
 *         .buildAsyncClient();
 * }
 * </pre>
 */
public interface AsyncDocumentClient {

    /**
     * Helper class to buildAsyncClient {@link AsyncDocumentClient} instances
     * as logical representation of the Azure Cosmos DB database service.
     *
     * <pre>
     * {@code
     * ConnectionPolicy connectionPolicy = new ConnectionPolicy(DirectConnectionConfig.getDefaultConfig());
     * AsyncDocumentClient client = new AsyncDocumentClient.Builder()
     *         .withServiceEndpoint(serviceEndpoint)
     *         .withMasterKeyOrResourceToken(masterKey)
     *         .withConnectionPolicy(connectionPolicy)
     *         .withConsistencyLevel(ConsistencyLevel.SESSION)
     *         .buildAsyncClient();
     * }
     * </pre>
     */
    class Builder {

        Configs configs = new Configs();
        ConnectionPolicy connectionPolicy;
        ConsistencyLevel desiredConsistencyLevel;
        ReadConsistencyStrategy readConsistencyStrategy;
        List<Permission> permissionFeed;
        String masterKeyOrResourceToken;
        URI serviceEndpoint;
        CosmosAuthorizationTokenResolver cosmosAuthorizationTokenResolver;
        AzureKeyCredential credential;
        TokenCredential tokenCredential;
        boolean sessionCapturingOverride;
        boolean transportClientSharing;
        boolean contentResponseOnWriteEnabled;
        private CosmosClientMetadataCachesSnapshot state;
        private ApiType apiType;
        CosmosClientTelemetryConfig clientTelemetryConfig;
        private String clientCorrelationId = null;
        private CosmosEndToEndOperationLatencyPolicyConfig cosmosEndToEndOperationLatencyPolicyConfig;
        private SessionRetryOptions sessionRetryOptions;
        private CosmosContainerProactiveInitConfig containerProactiveInitConfig;
        private CosmosItemSerializer defaultCustomSerializer;
        private boolean isRegionScopedSessionCapturingEnabled;
        private boolean isPerPartitionAutomaticFailoverEnabled;
        private List<CosmosOperationPolicy> operationPolicies;

        public Builder withServiceEndpoint(String serviceEndpoint) {
            try {
                this.serviceEndpoint = new URI(serviceEndpoint);
            } catch (URISyntaxException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
            return this;
        }

        public Builder withDefaultSerializer( CosmosItemSerializer defaultCustomSerializer) {
            this.defaultCustomSerializer = defaultCustomSerializer;

            return this;
        }

        public Builder withState(CosmosClientMetadataCachesSnapshot state) {
            this.state = state;
            return this;
        }

        public Builder withApiType(ApiType apiType) {
            this.apiType = apiType;
            return this;
        }

        public Builder withClientCorrelationId(String clientCorrelationId) {
            this.clientCorrelationId = clientCorrelationId;

            return this;
        }

        /**
         * New method withMasterKeyOrResourceToken will take either master key or resource token
         * and perform authentication for accessing resource.
         *
         * @param masterKeyOrResourceToken MasterKey or resourceToken for authentication.
         * @return current Builder.
         * @deprecated use {@link #withMasterKeyOrResourceToken(String)} instead.
         */
        @Deprecated
        public Builder withMasterKey(String masterKeyOrResourceToken) {
            this.masterKeyOrResourceToken = masterKeyOrResourceToken;
            return this;
        }

        /**
         * This method will accept the master key , additionally it can also consume
         * resource token too for authentication.
         *
         * @param masterKeyOrResourceToken MasterKey or resourceToken for authentication.
         * @return current Builder.
         */
        public Builder withMasterKeyOrResourceToken(String masterKeyOrResourceToken) {
            this.masterKeyOrResourceToken = masterKeyOrResourceToken;
            return this;
        }

        /**
         * This method will accept the permission list , which contains the
         * resource tokens needed to access resources.
         *
         * @param permissionFeed Permission list for authentication.
         * @return current Builder.
         */
        public Builder withPermissionFeed(List<Permission> permissionFeed) {
            this.permissionFeed = permissionFeed;
            return this;
        }

        public Builder withConsistencyLevel(ConsistencyLevel desiredConsistencyLevel) {
            this.desiredConsistencyLevel = desiredConsistencyLevel;
            return this;
        }

        public Builder withReadConsistencyStrategy(ReadConsistencyStrategy readConsistencyStrategy) {
            this.readConsistencyStrategy = readConsistencyStrategy;
            return this;
        }

        public Builder withConfigs(Configs configs) {
            this.configs = configs;
            return this;
        }

        public Builder withSessionCapturingOverride(boolean sessionCapturingOverride) {
            this.sessionCapturingOverride = sessionCapturingOverride;
            return this;
        }

        public Builder withConnectionPolicy(ConnectionPolicy connectionPolicy) {
            this.connectionPolicy = connectionPolicy;
            return this;
        }

        public Builder withTransportClientSharing(boolean transportClientSharing) {
            this.transportClientSharing = transportClientSharing;
            return this;
        }

        public Builder withCredential(AzureKeyCredential credential) {
            if (credential != null && StringUtils.isEmpty(credential.getKey())) {
                throw new IllegalArgumentException("Cannot buildAsyncClient client with empty key credential");
            }
            this.credential = credential;
            return this;
        }

        public Builder withContentResponseOnWriteEnabled(boolean contentResponseOnWriteEnabled) {
            this.contentResponseOnWriteEnabled = contentResponseOnWriteEnabled;
            return this;
        }

        /**
         * This method will accept functional interface TokenResolver which helps in generation authorization
         * token per request. AsyncDocumentClient can be successfully initialized with this API without passing any MasterKey, ResourceToken or PermissionFeed.
         * @param cosmosAuthorizationTokenResolver The tokenResolver
         * @return current Builder.
         */
        public Builder withTokenResolver(CosmosAuthorizationTokenResolver cosmosAuthorizationTokenResolver) {
            this.cosmosAuthorizationTokenResolver = cosmosAuthorizationTokenResolver;
            return this;
        }

        /**
         * This method will accept functional interface TokenCredential which helps in generation authorization
         * token per request. AsyncDocumentClient can be successfully initialized with this API without passing any MasterKey, ResourceToken or PermissionFeed.
         * @param tokenCredential the token credential
         * @return current Builder.
         */
        public Builder withTokenCredential(TokenCredential tokenCredential) {
            this.tokenCredential = tokenCredential;
            return this;
        }

        /***
         * Set the client telemetry config.
         *
         * @param clientTelemetryConfig the {@link CosmosClientTelemetryConfig}.
         *
         * @return the current builder.
         */
        public Builder withClientTelemetryConfig(CosmosClientTelemetryConfig clientTelemetryConfig) {
            this.clientTelemetryConfig = clientTelemetryConfig;
            return this;
        }

        public Builder withEndToEndOperationLatencyPolicyConfig(CosmosEndToEndOperationLatencyPolicyConfig endToEndOperationLatencyPolicyConfig) {
            this.cosmosEndToEndOperationLatencyPolicyConfig = endToEndOperationLatencyPolicyConfig;
            return this;
        }

        public Builder withSessionRetryOptions(SessionRetryOptions sessionRetryOptions) {
            this.sessionRetryOptions = sessionRetryOptions;
            return this;
        }

        public Builder withContainerProactiveInitConfig(CosmosContainerProactiveInitConfig containerProactiveInitConfig) {
            this.containerProactiveInitConfig = containerProactiveInitConfig;
            return this;
        }

        public Builder withRegionScopedSessionCapturingEnabled(boolean isRegionScopedSessionCapturingEnabled) {
            this.isRegionScopedSessionCapturingEnabled = isRegionScopedSessionCapturingEnabled;
            return this;
        }

        public Builder withPerPartitionAutomaticFailoverEnabled(boolean isPerPartitionAutomaticFailoverEnabled) {
            this.isPerPartitionAutomaticFailoverEnabled = isPerPartitionAutomaticFailoverEnabled;
            return this;
        }

        private void ifThrowIllegalArgException(boolean value, String error) {
            if (value) {
                throw new IllegalArgumentException(error);
            }
        }

        public AsyncDocumentClient build() {

            ifThrowIllegalArgException(this.serviceEndpoint == null || StringUtils.isEmpty(this.serviceEndpoint.toString()), "cannot buildAsyncClient client without service endpoint");
            ifThrowIllegalArgException(
                    this.masterKeyOrResourceToken == null && (permissionFeed == null || permissionFeed.isEmpty())
                        && this.credential == null && this.tokenCredential == null && this.cosmosAuthorizationTokenResolver == null,
                    "cannot buildAsyncClient client without any one of masterKey, " +
                        "resource token, permissionFeed and azure key credential");
            ifThrowIllegalArgException(credential != null && StringUtils.isEmpty(credential.getKey()),
                "cannot buildAsyncClient client without key credential");

            RxDocumentClientImpl client = new RxDocumentClientImpl(serviceEndpoint,
                    masterKeyOrResourceToken,
                    permissionFeed,
                    connectionPolicy,
                    desiredConsistencyLevel,
                    readConsistencyStrategy,
                    configs,
                    cosmosAuthorizationTokenResolver,
                    credential,
                    tokenCredential,
                    sessionCapturingOverride,
                    transportClientSharing,
                    contentResponseOnWriteEnabled,
                    state,
                    apiType,
                    clientTelemetryConfig,
                    clientCorrelationId,
                    cosmosEndToEndOperationLatencyPolicyConfig,
                    sessionRetryOptions,
                    containerProactiveInitConfig,
                    defaultCustomSerializer,
                    isRegionScopedSessionCapturingEnabled,
                    operationPolicies,
                    isPerPartitionAutomaticFailoverEnabled);

            client.init(state, null);
            return client;
        }

        public Configs getConfigs() {
            return configs;
        }

        public void setConfigs(Configs configs) {
            this.configs = configs;
        }

        public ConnectionPolicy getConnectionPolicy() {
            return connectionPolicy;
        }

        public void setConnectionPolicy(ConnectionPolicy connectionPolicy) {
            this.connectionPolicy = connectionPolicy;
        }

        public ConsistencyLevel getDesiredConsistencyLevel() {
            return desiredConsistencyLevel;
        }

        public ReadConsistencyStrategy getReadConsistencyStrategy() { return this.readConsistencyStrategy; }

        public URI getServiceEndpoint() {
            return serviceEndpoint;
        }

        public void setServiceEndpoint(URI serviceEndpoint) {
            this.serviceEndpoint = serviceEndpoint;
        }

        public AzureKeyCredential getCredential() {
            return credential;
        }

        public Builder withOperationPolicies(List<CosmosOperationPolicy> operationPolicies) {
            this.operationPolicies = operationPolicies;
            return this;
        }
    }

    /**
     * Gets the default service endpoint as passed in by the user during construction.
     *
     * @return the service endpoint URI
     */
    URI getServiceEndpoint();

    /**
     * Gets the desired consistency level
     *
     * @return the consistency level
     */
    ConsistencyLevel getConsistencyLevel();

    ReadConsistencyStrategy getReadConsistencyStrategy();

    /**
     * Gets the client telemetry
     *
     * @return the client telemetry
     */
    ClientTelemetry getClientTelemetry();

    String getClientCorrelationId();

    String getMachineId();

    String getUserAgent();

    /**
     * Gets the boolean which indicates whether to only return the headers and status code in Cosmos DB response
     * in case of Create, Update and Delete operations on CosmosItem.
     * <p>
     * If set to false (which is by default), this removes the resource from response. It reduces networking
     * and CPU load by not sending the resource back over the network and serializing it
     * on the client.
     * <p>
     * By-default, this is false.
     *
     * @return a boolean indicating whether resource will be included in the response or not.
     */
    boolean isContentResponseOnWriteEnabled();

    /**
     * Gets the connection policy
     *
     * @return the connection policy
     */
    ConnectionPolicy getConnectionPolicy();

    /**
     * Creates a database.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the created database.
     * In case of failure the {@link Mono} will error.
     *
     * @param database the database.
     * @param options  the request options.
     * @return a {@link Mono} containing the single resource response with the created database or an error.
     */
    Mono<ResourceResponse<Database>> createDatabase(Database database, RequestOptions options);

    /**
     * Deletes a database.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the deleted database.
     * In case of failure the {@link Mono} will error.
     *
     * @param databaseLink the database link.
     * @param options      the request options.
     * @return a {@link Mono} containing the single resource response with the deleted database or an error.
     */
    Mono<ResourceResponse<Database>> deleteDatabase(String databaseLink, RequestOptions options);

    /**
     * Reads a database.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the read database.
     * In case of failure the {@link Mono} will error.
     *
     * @param databaseLink the database link.
     * @param options      the request options.
     * @return a {@link Mono} containing the single resource response with the read database or an error.
     */
    Mono<ResourceResponse<Database>> readDatabase(String databaseLink, RequestOptions options);

    /**
     * Reads all databases.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response of the read databases.
     * In case of failure the {@link Flux} will error.
     *
     * @param state the query operation state
     * @return a {@link Flux} containing one or several feed response pages of read databases or an error.
     */
    Flux<FeedResponse<Database>> readDatabases(QueryFeedOperationState state);

    /**
     * Query for databases.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response of the read databases.
     * In case of failure the {@link Flux} will error.
     *
     * @param query   the query.
     * @param state the query operation state.
     * @return a {@link Flux} containing one or several feed response pages of read databases or an error.
     */
    Flux<FeedResponse<Database>> queryDatabases(String query, QueryFeedOperationState state);

    /**
     * Query for databases.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response of the obtained databases.
     * In case of failure the {@link Flux} will error.
     *
     * @param querySpec the SQL query specification.
     * @param state   the query operation state.
     * @return a {@link Flux} containing one or several feed response pages of the obtained databases or an error.
     */
    Flux<FeedResponse<Database>> queryDatabases(SqlQuerySpec querySpec, QueryFeedOperationState state);

    /**
     * Creates a document collection.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the created collection.
     * In case of failure the {@link Mono} will error.
     *
     * @param databaseLink the database link.
     * @param collection   the collection.
     * @param options      the request options.
     * @return a {@link Mono} containing the single resource response with the created collection or an error.
     */
    Mono<ResourceResponse<DocumentCollection>> createCollection(String databaseLink, DocumentCollection collection,
                                                                RequestOptions options);

    /**
     * Replaces a document collection.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the replaced document collection.
     * In case of failure the {@link Mono} will error.
     *
     * @param collection the document collection to use.
     * @param options    the request options.
     * @return a {@link Mono} containing the single resource response with the replaced document collection or an error.
     */
    Mono<ResourceResponse<DocumentCollection>> replaceCollection(DocumentCollection collection, RequestOptions options);

    /**
     * Deletes a document collection
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response for the deleted database.
     * In case of failure the {@link Mono} will error.
     *
     * @param collectionLink the collection link.
     * @param options        the request options.
     * @return a {@link Mono} containing the single resource response for the deleted database or an error.
     */
    Mono<ResourceResponse<DocumentCollection>> deleteCollection(String collectionLink, RequestOptions options);

    /**
     * Reads a document collection
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the read collection.
     * In case of failure the {@link Mono} will error.
     *
     * @param collectionLink the collection link.
     * @param options        the request options.
     * @return a {@link Mono} containing the single resource response with the read collection or an error.
     */
    Mono<ResourceResponse<DocumentCollection>> readCollection(String collectionLink, RequestOptions options);

    /**
     * Reads all document collections in a database.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response of the read collections.
     * In case of failure the {@link Flux} will error.
     *
     * @param databaseLink the database link.
     * @param state      the query option state.
     * @return a {@link Flux} containing one or several feed response pages of the read collections or an error.
     */
    Flux<FeedResponse<DocumentCollection>> readCollections(String databaseLink, QueryFeedOperationState state);

    /**
     * Query for document collections in a database.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response of the obtained collections.
     * In case of failure the {@link Flux} will error.
     *
     * @param databaseLink the database link.
     * @param query        the query.
     * @param state        the query operation state.
     * @return a {@link Flux} containing one or several feed response pages of the obtained collections or an error.
     */
    Flux<FeedResponse<DocumentCollection>> queryCollections(String databaseLink, String query, QueryFeedOperationState state);

    /**
     * Query for document collections in a database.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response of the obtained collections.
     * In case of failure the {@link Flux} will error.
     *
     * @param databaseLink the database link.
     * @param querySpec    the SQL query specification.
     * @param state      the query operation state.
     * @return a {@link Flux} containing one or several feed response pages of the obtained collections or an error.
     */
    Flux<FeedResponse<DocumentCollection>> queryCollections(String databaseLink, SqlQuerySpec querySpec, QueryFeedOperationState state);

    /**
     * Creates a document.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the created document.
     * In case of failure the {@link Mono} will error.
     *
     * @param collectionLink               the link to the parent document collection.
     * @param document                     the document represented as a POJO or Document object.
     * @param options                      the request options.
     * @param disableAutomaticIdGeneration the flag for disabling automatic id generation.
     * @return a {@link Mono} containing the single resource response with the created document or an error.
     */
    Mono<ResourceResponse<Document>> createDocument(String collectionLink, Object document, RequestOptions options,
                                                    boolean disableAutomaticIdGeneration);

    /**
     * Upserts a document.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the upserted document.
     * In case of failure the {@link Mono} will error.
     *
     * @param collectionLink               the link to the parent document collection.
     * @param document                     the document represented as a POJO or Document object to upsert.
     * @param options                      the request options.
     * @param disableAutomaticIdGeneration the flag for disabling automatic id generation.
     * @return a {@link Mono} containing the single resource response with the upserted document or an error.
     */
    Mono<ResourceResponse<Document>> upsertDocument(String collectionLink, Object document, RequestOptions options,
                                                          boolean disableAutomaticIdGeneration);

    /**
     * Replaces a document using a POJO object.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the replaced document.
     * In case of failure the {@link Mono} will error.
     *
     * @param documentLink the document link.
     * @param document     the document represented as a POJO or Document object.
     * @param options      the request options.
     * @return a {@link Mono} containing the single resource response with the replaced document or an error.
     */
    Mono<ResourceResponse<Document>> replaceDocument(String documentLink, Object document, RequestOptions options);

    /**
     * Apply patch on an item.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the patched document.
     * In case of failure the {@link Mono} will error.
     *
     * @param documentLink the document link.
     * @param cosmosPatchOperations container with the list of patch operations.
     * @param options the request options.
     *
     * @return a {@link Mono} containing the single resource response with the patched document or an error.
     */
    Mono<ResourceResponse<Document>> patchDocument(String documentLink, CosmosPatchOperations cosmosPatchOperations, RequestOptions options);

    /**
     * Replaces a document with the passed in document.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the replaced document.
     * In case of failure the {@link Mono} will error.
     *
     * @param document the document to replace (containing the document id).
     * @param options  the request options.
     * @return a {@link Mono} containing the single resource response with the replaced document or an error.
     */
    Mono<ResourceResponse<Document>> replaceDocument(Document document, RequestOptions options);

    /**
     * Deletes a document
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response for the deleted document.
     * In case of failure the {@link Mono} will error.
     *
     * @param documentLink the document link.
     * @param options      the request options.
     * @return a {@link Mono} containing the single resource response for the deleted document or an error.
     */
    Mono<ResourceResponse<Document>> deleteDocument(String documentLink, RequestOptions options);

    /**
     * Deletes a document
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response for the deleted document.
     * In case of failure the {@link Mono} will error.
     *
     * @param internalObjectNode the internalObjectNode to delete (containing the id).
     * @param options  the request options.
     * @return a {@link Mono} containing the single resource response for the deleted document or an error.
     */
    Mono<ResourceResponse<Document>> deleteDocument(String documentLink, InternalObjectNode internalObjectNode, RequestOptions options);

    Mono<ResourceResponse<Document>> deleteAllDocumentsByPartitionKey(String collectionLink, PartitionKey partitionKey, RequestOptions options);
    /**
     * Reads a document
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the read document.
     * In case of failure the {@link Mono} will error.
     *
     * @param documentLink the document link.
     * @param options      the request options.
     * @return a {@link Mono} containing the single resource response with the read document or an error.
     */
    Mono<ResourceResponse<Document>> readDocument(String documentLink, RequestOptions options);

    /**
     * Reads all documents in a document collection.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response of the read documents.
     * In case of failure the {@link Flux} will error.
     *
     * @param collectionLink the collection link.
     * @param state        the query operation state.
     * @param <T> the type parameter
     * @return a {@link Flux} containing one or several feed response pages of the read documents or an error.
     */
    <T> Flux<FeedResponse<T>>  readDocuments(
        String collectionLink, QueryFeedOperationState state, Class<T> classOfT);


    /**
     * Query for documents in a document collection.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response of the obtained documents.
     * In case of failure the {@link Flux} will error.
     *
     * @param collectionLink the link to the parent document collection.
     * @param query          the query.
     * @param state          the query operation state.
     * @param <T> the type parameter
     * @return a {@link Flux} containing one or several feed response pages of the obtained document or an error.
     */
    <T> Flux<FeedResponse<T>> queryDocuments(
        String collectionLink, String query, QueryFeedOperationState state, Class<T> classOfT);

    /**
     * Query for documents in a document collection.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response of the obtained documents.
     * In case of failure the {@link Flux} will error.
     *
     * @param collectionLink the link to the parent document collection.
     * @param querySpec      the SQL query specification.
     * @param state          the query operation state.
     * @param <T> the type parameter
     * @return a {@link Flux} containing one or several feed response pages of the obtained documents or an error.
     */
    <T> Flux<FeedResponse<T>> queryDocuments(
        String collectionLink, SqlQuerySpec querySpec, QueryFeedOperationState state, Class<T> classOfT);

    /**
     * Query for documents change feed in a document collection.
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response pages of the obtained documents.
     * In case of failure the {@link Flux} will error.
     *
     * @param collection    the parent document collection.
     * @param requestOptions the change feed request options.
     * @param <T> the type parameter
     * @return a {@link Flux} containing one or several feed response pages of the obtained documents or an error.
     */
    <T> Flux<FeedResponse<T>> queryDocumentChangeFeed(
        DocumentCollection collection,
        CosmosChangeFeedRequestOptions requestOptions,
        Class<T> classOfT,
        DiagnosticsClientContext diagnosticsClientContext);

    /**
     * Query for documents change feed in a document collection.
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response pages of the obtained documents.
     * In case of failure the {@link Flux} will error.
     *
     * @param collectionLink the link to the parent document collection.
     * @param state the change feed operation state.
     * @param <T> the type parameter
     * @return a {@link Flux} containing one or several feed response pages of the obtained documents or an error.
     */
    <T> Flux<FeedResponse<T>> queryDocumentChangeFeedFromPagedFlux(
        String collectionLink,
        ChangeFeedOperationState state,
        Class<T> classOfT);

    /**
     * Reads all partition key ranges in a document collection.
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response pages of the obtained partition key ranges.
     * In case of failure the {@link Flux} will error.
     *
     * @param collectionLink the link to the parent document collection.
     * @param state        the query operation state.
     * @return a {@link Flux} containing one or several feed response pages of the obtained partition key ranges or an error.
     */
    Flux<FeedResponse<PartitionKeyRange>> readPartitionKeyRanges(String collectionLink, QueryFeedOperationState state);
    Flux<FeedResponse<PartitionKeyRange>> readPartitionKeyRanges(String collectionLink, CosmosQueryRequestOptions options);

    /**
     * Gets the feed ranges of a container.
     *
     * @param collectionLink the link to the parent document collection.
     * @param forceRefresh a flag indicating whether to force a refresh
     * @return a {@link List} of @{link FeedRange} containing the feed ranges of a container.
     */
    Mono<List<FeedRange>> getFeedRanges(String collectionLink, boolean forceRefresh);

    /**
     * Creates a stored procedure.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the created stored procedure.
     * In case of failure the {@link Mono} will error.
     *
     * @param collectionLink  the collection link.
     * @param storedProcedure the stored procedure to create.
     * @param options         the request options.
     * @return a {@link Mono} containing the single resource response with the created stored procedure or an error.
     */
    Mono<ResourceResponse<StoredProcedure>> createStoredProcedure(String collectionLink, StoredProcedure storedProcedure,
                                                                  RequestOptions options);

    /**
     * Replaces a stored procedure.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the replaced stored procedure.
     * In case of failure the {@link Mono} will error.
     *
     * @param storedProcedure the stored procedure to use.
     * @param options         the request options.
     * @return a {@link Mono} containing the single resource response with the replaced stored procedure or an error.
     */
    Mono<ResourceResponse<StoredProcedure>> replaceStoredProcedure(StoredProcedure storedProcedure, RequestOptions options);

    /**
     * Deletes a stored procedure
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response for the deleted stored procedure.
     * In case of failure the {@link Mono} will error.
     *
     * @param storedProcedureLink the stored procedure link.
     * @param options             the request options.
     * @return a {@link Mono} containing the single resource response for the deleted stored procedure or an error.
     */
    Mono<ResourceResponse<StoredProcedure>> deleteStoredProcedure(String storedProcedureLink, RequestOptions options);

    /**
     * READ a stored procedure
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the read stored procedure.
     * In case of failure the {@link Mono} will error.
     *
     * @param storedProcedureLink the stored procedure link.
     * @param options             the request options.
     * @return a {@link Mono} containing the single resource response with the read stored procedure or an error.
     */
    Mono<ResourceResponse<StoredProcedure>> readStoredProcedure(String storedProcedureLink, RequestOptions options);

    /**
     * Reads all stored procedures in a document collection link.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response pages of the read stored procedures.
     * In case of failure the {@link Flux} will error.
     *
     * @param collectionLink the collection link.
     * @param state        the query operation state.
     * @return a {@link Flux} containing one or several feed response pages of the read stored procedures or an error.
     */
    Flux<FeedResponse<StoredProcedure>> readStoredProcedures(String collectionLink, QueryFeedOperationState state);

    /**
     * Query for stored procedures in a document collection.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response pages of the obtained stored procedures.
     * In case of failure the {@link Flux} will error.
     *
     * @param collectionLink the collection link.
     * @param query          the query.
     * @param state          the query operation state.
     * @return a {@link Flux} containing one or several feed response pages of the obtained stored procedures or an error.
     */
    Flux<FeedResponse<StoredProcedure>> queryStoredProcedures(String collectionLink, String query, QueryFeedOperationState state);

    /**
     * Query for stored procedures in a document collection.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response pages of the obtained stored procedures.
     * In case of failure the {@link Flux} will error.
     *
     * @param collectionLink the collection link.
     * @param querySpec      the SQL query specification.
     * @param state          the query operation state.
     * @return a {@link Flux} containing one or several feed response pages of the obtained stored procedures or an error.
     */
    Flux<FeedResponse<StoredProcedure>> queryStoredProcedures(String collectionLink, SqlQuerySpec querySpec,
                                                              QueryFeedOperationState state);

    /**
     * Executes a stored procedure
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the stored procedure response.
     * In case of failure the {@link Mono} will error.
     *
     * @param storedProcedureLink the stored procedure link.
     * @param options             the request options.
     * @param procedureParams     the array of procedure parameter values.
     * @return a {@link Mono} containing the single resource response with the stored procedure response or an error.
     */
    Mono<StoredProcedureResponse> executeStoredProcedure(String storedProcedureLink, RequestOptions options,
                                                               List<Object> procedureParams);

    /**
     * Executes a batch request
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a batch response which will have individual responses.
     * In case of failure the {@link Mono} will error.
     *
     * @param collectionLink               the link to the parent document collection.
     * @param serverBatchRequest           the batch request with the content and flags.
     * @param options                      the request options.
     * @param disableAutomaticIdGeneration the flag for disabling automatic id generation.
     * @param disableStaledResourceExceptionHandling the flag for disabling staled resource exception handling. For bulk executor, the exception should bubbled up so to be retried correctly.
     * @return a {@link Mono} containing the transactionalBatchResponse response which results of all operations.
     */
    Mono<CosmosBatchResponse> executeBatchRequest(String collectionLink,
                                                  ServerBatchRequest serverBatchRequest,
                                                  RequestOptions options,
                                                  boolean disableAutomaticIdGeneration,
                                                  boolean disableStaledResourceExceptionHandling);

    /**
     * Creates a trigger.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the created trigger.
     * In case of failure the {@link Mono} will error.
     *
     * @param collectionLink the collection link.
     * @param trigger        the trigger.
     * @param options        the request options.
     * @return a {@link Mono} containing the single resource response with the created trigger or an error.
     */
    Mono<ResourceResponse<Trigger>> createTrigger(String collectionLink, Trigger trigger, RequestOptions options);

    /**
     * Replaces a trigger.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the replaced trigger.
     * In case of failure the {@link Mono} will error.
     *
     * @param trigger the trigger to use.
     * @param options the request options.
     * @return a {@link Mono} containing the single resource response with the replaced trigger or an error.
     */
    Mono<ResourceResponse<Trigger>> replaceTrigger(Trigger trigger, RequestOptions options);

    /**
     * Deletes a trigger.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response for the deleted trigger.
     * In case of failure the {@link Mono} will error.
     *
     * @param triggerLink the trigger link.
     * @param options     the request options.
     * @return a {@link Mono} containing the single resource response for the deleted trigger or an error.
     */
    Mono<ResourceResponse<Trigger>> deleteTrigger(String triggerLink, RequestOptions options);

    /**
     * Reads a trigger
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response for the read trigger.
     * In case of failure the {@link Mono} will error.
     *
     * @param triggerLink the trigger link.
     * @param options     the request options.
     * @return a {@link Mono} containing the single resource response for the read trigger or an error.
     */
    Mono<ResourceResponse<Trigger>> readTrigger(String triggerLink, RequestOptions options);

    /**
     * Reads all triggers in a document collection.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response pages of the read triggers.
     * In case of failure the {@link Flux} will error.
     *
     * @param collectionLink the collection link.
     * @param state        the query operation state.
     * @return a {@link Flux} containing one or several feed response pages of the read triggers or an error.
     */
    Flux<FeedResponse<Trigger>> readTriggers(String collectionLink, QueryFeedOperationState state);

    /**
     * Query for triggers.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response pages of the obtained triggers.
     * In case of failure the {@link Flux} will error.
     *
     * @param collectionLink the collection link.
     * @param query          the query.
     * @param state          the query operation state.
     * @return a {@link Flux} containing one or several feed response pages of the obtained triggers or an error.
     */
    Flux<FeedResponse<Trigger>> queryTriggers(String collectionLink, String query, QueryFeedOperationState state);

    /**
     * Query for triggers.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response pages of the obtained triggers.
     * In case of failure the {@link Flux} will error.
     *
     * @param collectionLink the collection link.
     * @param querySpec      the SQL query specification.
     * @param state          the query operation state.
     * @return a {@link Flux} containing one or several feed response pages of the obtained triggers or an error.
     */
    Flux<FeedResponse<Trigger>> queryTriggers(String collectionLink, SqlQuerySpec querySpec, QueryFeedOperationState state);

    /**
     * Creates a user defined function.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the created user defined function.
     * In case of failure the {@link Mono} will error.
     *
     * @param collectionLink the collection link.
     * @param udf            the user defined function.
     * @param options        the request options.
     * @return a {@link Mono} containing the single resource response with the created user defined function or an error.
     */
    Mono<ResourceResponse<UserDefinedFunction>> createUserDefinedFunction(String collectionLink, UserDefinedFunction udf,
                                                                          RequestOptions options);

      /**
     * Replaces a user defined function.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the replaced user defined function.
     * In case of failure the {@link Mono} will error.
     *
     * @param udf     the user defined function.
     * @param options the request options.
     * @return a {@link Mono} containing the single resource response with the replaced user defined function or an error.
     */
    Mono<ResourceResponse<UserDefinedFunction>> replaceUserDefinedFunction(UserDefinedFunction udf, RequestOptions options);

    /**
     * Deletes a user defined function.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response for the deleted user defined function.
     * In case of failure the {@link Mono} will error.
     *
     * @param udfLink the user defined function link.
     * @param options the request options.
     * @return a {@link Mono} containing the single resource response for the deleted user defined function or an error.
     */
    Mono<ResourceResponse<UserDefinedFunction>> deleteUserDefinedFunction(String udfLink, RequestOptions options);

    /**
     * READ a user defined function.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response for the read user defined function.
     * In case of failure the {@link Mono} will error.
     *
     * @param udfLink the user defined function link.
     * @param options the request options.
     * @return a {@link Mono} containing the single resource response for the read user defined function or an error.
     */
    Mono<ResourceResponse<UserDefinedFunction>> readUserDefinedFunction(String udfLink, RequestOptions options);

    /**
     * Reads all user defined functions in a document collection.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response pages of the read user defined functions.
     * In case of failure the {@link Flux} will error.
     *
     * @param collectionLink the collection link.
     * @param state        the query operation state.
     * @return a {@link Flux} containing one or several feed response pages of the read user defined functions or an error.
     */
    Flux<FeedResponse<UserDefinedFunction>> readUserDefinedFunctions(String collectionLink, QueryFeedOperationState state);

    /**
     * Query for user defined functions.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response pages of the obtained user defined functions.
     * In case of failure the {@link Flux} will error.
     *
     * @param collectionLink the collection link.
     * @param query          the query.
     * @param state          the query operation state.
     * @return a {@link Flux} containing one or several feed response pages of the obtained user defined functions or an error.
     */
    Flux<FeedResponse<UserDefinedFunction>> queryUserDefinedFunctions(String collectionLink, String query,
                                                                      QueryFeedOperationState state);

    /**
     * Query for user defined functions.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response pages of the obtained user defined functions.
     * In case of failure the {@link Flux} will error.
     *
     * @param collectionLink the collection link.
     * @param querySpec      the SQL query specification.
     * @param state          the query operation state.
     * @return a {@link Flux} containing one or several feed response pages of the obtained user defined functions or an error.
     */
    Flux<FeedResponse<UserDefinedFunction>> queryUserDefinedFunctions(String collectionLink, SqlQuerySpec querySpec,
                                                                      QueryFeedOperationState state);

    /**
     * Reads a conflict.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the read conflict.
     * In case of failure the {@link Mono} will error.
     *
     * @param conflictLink the conflict link.
     * @param options      the request options.
     * @return a {@link Mono} containing the single resource response with the read conflict or an error.
     */
    Mono<ResourceResponse<Conflict>> readConflict(String conflictLink, RequestOptions options);

    /**
     * Reads all conflicts in a document collection.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response pages of the read conflicts.
     * In case of failure the {@link Flux} will error.
     *
     * @param collectionLink the collection link.
     * @param state        the query operation state.
     * @return a {@link Flux} containing one or several feed response pages of the read conflicts or an error.
     */
    Flux<FeedResponse<Conflict>> readConflicts(String collectionLink, QueryFeedOperationState state);

    /**
     * Query for conflicts.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response pages of the obtained conflicts.
     * In case of failure the {@link Flux} will error.
     *
     * @param collectionLink the collection link.
     * @param query          the query statement.
     * @param state          the query operation state.
     * @return a {@link Flux} containing one or several feed response pages of the obtained conflicts or an error.
     */
    Flux<FeedResponse<Conflict>> queryConflicts(String collectionLink, String query, QueryFeedOperationState state);

    /**
     * Query for conflicts.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response pages of the obtained conflicts.
     * In case of failure the {@link Flux} will error.
     *
     * @param collectionLink the collection link.
     * @param querySpec      the SQL query specification.
     * @param state          the query operation state.
     * @return a {@link Flux} containing one or several feed response pages of the obtained conflicts or an error.
     */
    Flux<FeedResponse<Conflict>> queryConflicts(String collectionLink, SqlQuerySpec querySpec, QueryFeedOperationState state);

    /**
     * Deletes a conflict.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response for the deleted conflict.
     * In case of failure the {@link Mono} will error.
     *
     * @param conflictLink the conflict link.
     * @param options      the request options.
     * @return a {@link Mono} containing the single resource response for the deleted conflict or an error.
     */
    Mono<ResourceResponse<Conflict>> deleteConflict(String conflictLink, RequestOptions options);

    /**
     * Creates a user.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the created user.
     * In case of failure the {@link Mono} will error.
     *
     * @param databaseLink the database link.
     * @param user         the user to create.
     * @param options      the request options.
     * @return a {@link Mono} containing the single resource response with the created user or an error.
     */
    Mono<ResourceResponse<User>> createUser(String databaseLink, User user, RequestOptions options);

    /**
     * Upserts a user.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the upserted user.
     * In case of failure the {@link Mono} will error.
     *
     * @param databaseLink the database link.
     * @param user         the user to upsert.
     * @param options      the request options.
     * @return a {@link Mono} containing the single resource response with the upserted user or an error.
     */
    Mono<ResourceResponse<User>> upsertUser(String databaseLink, User user, RequestOptions options);

    /**
     * Replaces a user.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the replaced user.
     * In case of failure the {@link Mono} will error.
     *
     * @param user    the user to use.
     * @param options the request options.
     * @return a {@link Mono} containing the single resource response with the replaced user or an error.
     */
    Mono<ResourceResponse<User>> replaceUser(User user, RequestOptions options);

    /**
     * Deletes a user.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response for the deleted user.
     * In case of failure the {@link Mono} will error.
     *
     * @param userLink the user link.
     * @param options  the request options.
     * @return a {@link Mono} containing the single resource response for the deleted user or an error.
     */
    Mono<ResourceResponse<User>> deleteUser(String userLink, RequestOptions options);

    /**
     * Reads a user.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the read user.
     * In case of failure the {@link Mono} will error.
     *
     * @param userLink the user link.
     * @param options  the request options.
     * @return a {@link Mono} containing the single resource response with the read user or an error.
     */
    Mono<ResourceResponse<User>> readUser(String userLink, RequestOptions options);

    /**
     * Reads all users in a database.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response pages of the read users.
     * In case of failure the {@link Flux} will error.
     *
     * @param databaseLink the database link.
     * @param state      the query operation state.
     * @return a {@link Flux} containing one or several feed response pages of the read users or an error.
     */
    Flux<FeedResponse<User>> readUsers(String databaseLink, QueryFeedOperationState state);

    /**
     * Query for users.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response pages of the obtained users.
     * In case of failure the {@link Flux} will error.
     *
     * @param databaseLink the database link.
     * @param query        the query.
     * @param state        the query operation state.
     * @return a {@link Flux} containing one or several feed response pages of the obtained users or an error.
     */
    Flux<FeedResponse<User>> queryUsers(String databaseLink, String query, QueryFeedOperationState state);

    /**
     * Query for users.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response pages of the obtained users.
     * In case of failure the {@link Flux} will error.
     *
     * @param databaseLink the database link.
     * @param querySpec    the SQL query specification.
     * @param state      the query operation state.
     * @return a {@link Flux} containing one or several feed response pages of the obtained users or an error.
     */
    Flux<FeedResponse<User>> queryUsers(String databaseLink, SqlQuerySpec querySpec, QueryFeedOperationState state);

    /**
     * Reads a client encryption key.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the read client encryption key.
     * In case of failure the {@link Mono} will error.
     *
     * @param clientEncryptionKeyLink the client encryption key link.
     * @param options  the request options.
     * @return a {@link Mono} containing the single resource response with the read user or an error.
     */
    Mono<ResourceResponse<ClientEncryptionKey>> readClientEncryptionKey(String clientEncryptionKeyLink, RequestOptions options);

    /**
     * Creates a client encryption key.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the created client encryption key.
     * In case of failure the {@link Mono} will error.
     *
     * @param databaseLink the database link.
     * @param clientEncryptionKey the client encryption key to create.
     * @param options      the request options.
     * @return a {@link Mono} containing the single resource response with the created client encryption key or an error.
     */
    Mono<ResourceResponse<ClientEncryptionKey>> createClientEncryptionKey(String databaseLink, ClientEncryptionKey clientEncryptionKey, RequestOptions options);

    /**
     * Replaces a client encryption key.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the replaced client encryption key.
     * In case of failure the {@link Mono} will error.
     *
     * @param clientEncryptionKey    the client encryption key to use.
     * @param options the request options.
     * @return a {@link Mono} containing the single resource response with the replaced client encryption keyer or an error.
     */
    Mono<ResourceResponse<ClientEncryptionKey>> replaceClientEncryptionKey(ClientEncryptionKey clientEncryptionKey, String nameBasedLink, RequestOptions options);

    /**
     * Reads all client encryption keys in a database.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response pages of the read client encryption keys.
     * In case of failure the {@link Flux} will error.
     *
     * @param databaseLink the database link.
     * @param state      the query option state.
     * @return a {@link Flux} containing one or several feed response pages of the read client encryption keys or an error.
     */
    Flux<FeedResponse<ClientEncryptionKey>> readClientEncryptionKeys(String databaseLink, QueryFeedOperationState state);

    /**
     * Query for client encryption keys.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response pages of the obtained client encryption keys.
     * In case of failure the {@link Flux} will error.
     *
     * @param databaseLink the database link.
     * @param querySpec    the SQL query specification.
     * @param state      the query operation state
     * @return a {@link Flux} containing one or several feed response pages of the obtained client encryption keys or an error.
     */
    Flux<FeedResponse<ClientEncryptionKey>> queryClientEncryptionKeys(String databaseLink, SqlQuerySpec querySpec, QueryFeedOperationState state);

    /**
     * Creates a permission.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the created permission.
     * In case of failure the {@link Mono} will error.
     *
     * @param userLink   the user link.
     * @param permission the permission to create.
     * @param options    the request options.
     * @return a {@link Mono} containing the single resource response with the created permission or an error.
     */
    Mono<ResourceResponse<Permission>> createPermission(String userLink, Permission permission, RequestOptions options);

    /**
     * Upserts a permission.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the upserted permission.
     * In case of failure the {@link Mono} will error.
     *
     * @param userLink   the user link.
     * @param permission the permission to upsert.
     * @param options    the request options.
     * @return a {@link Mono} containing the single resource response with the upserted permission or an error.
     */
    Mono<ResourceResponse<Permission>> upsertPermission(String userLink, Permission permission, RequestOptions options);

    /**
     * Replaces a permission.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the replaced permission.
     * In case of failure the {@link Mono} will error.
     *
     * @param permission the permission to use.
     * @param options    the request options.
     * @return a {@link Mono} containing the single resource response with the replaced permission or an error.
     */
    Mono<ResourceResponse<Permission>> replacePermission(Permission permission, RequestOptions options);

    /**
     * Deletes a permission.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response for the deleted permission.
     * In case of failure the {@link Mono} will error.
     *
     * @param permissionLink the permission link.
     * @param options        the request options.
     * @return a {@link Mono} containing the single resource response for the deleted permission or an error.
     */
    Mono<ResourceResponse<Permission>> deletePermission(String permissionLink, RequestOptions options);

    /**
     * Reads a permission.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the read permission.
     * In case of failure the {@link Mono} will error.
     *
     * @param permissionLink the permission link.
     * @param options        the request options.
     * @return a {@link Mono} containing the single resource response with the read permission or an error.
     */
    Mono<ResourceResponse<Permission>> readPermission(String permissionLink, RequestOptions options);

    /**
     * Reads all permissions.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response pages of the read permissions.
     * In case of failure the {@link Flux} will error.
     *
     * @param permissionLink the permission link.
     * @param state          the query operation state.
     * @return a {@link Flux} containing one or several feed response pages of the read permissions or an error.
     */
    Flux<FeedResponse<Permission>> readPermissions(String permissionLink, QueryFeedOperationState state);

    /**
     * Query for permissions.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response pages of the obtained permissions.
     * In case of failure the {@link Flux} will error.
     *
     * @param permissionLink the permission link.
     * @param query          the query.
     * @param state          the query operation state
     * @return a {@link Flux} containing one or several feed response pages of the obtained permissions or an error.
     */
    Flux<FeedResponse<Permission>> queryPermissions(String permissionLink, String query, QueryFeedOperationState state);

    /**
     * Query for permissions.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response pages of the obtained permissions.
     * In case of failure the {@link Flux} will error.
     *
     * @param permissionLink the permission link.
     * @param querySpec      the SQL query specification.
     * @param state        the query operation state
     * @return a {@link Flux} containing one or several feed response pages of the obtained permissions or an error.
     */
    Flux<FeedResponse<Permission>> queryPermissions(String permissionLink, SqlQuerySpec querySpec, QueryFeedOperationState state);

    /**
     * Replaces an offer.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the replaced offer.
     * In case of failure the {@link Mono} will error.
     *
     * @param offer the offer to use.
     * @return a {@link Mono} containing the single resource response with the replaced offer or an error.
     */
    Mono<ResourceResponse<Offer>> replaceOffer(Offer offer);

    /**
     * Reads an offer.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the read offer.
     * In case of failure the {@link Mono} will error.
     *
     * @param offerLink the offer link.
     * @return a {@link Mono} containing the single resource response with the read offer or an error.
     */
    Mono<ResourceResponse<Offer>> readOffer(String offerLink);

    /**
     * Reads offers.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response pages of the read offers.
     * In case of failure the {@link Flux} will error.
     *
     * @param state the query operation request.
     * @return a {@link Flux} containing one or several feed response pages of the read offers or an error.
     */
    Flux<FeedResponse<Offer>> readOffers(QueryFeedOperationState state);

    /**
     * Query for offers in a database.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response pages of obtained obtained offers.
     * In case of failure the {@link Flux} will error.
     *
     * @param query   the query.
     * @param state the query operation state.
     * @return a {@link Flux} containing one or several feed response pages of the obtained offers or an error.
     */
    Flux<FeedResponse<Offer>> queryOffers(String query, QueryFeedOperationState state);

    /**
     * Query for offers in a database.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response pages of obtained obtained offers.
     * In case of failure the {@link Flux} will error.
     *
     * @param querySpec the query specification.
     * @param state   the query operation state.
     * @return a {@link Flux} containing one or several feed response pages of the obtained offers or an error.
     */
    Flux<FeedResponse<Offer>> queryOffers(SqlQuerySpec querySpec, QueryFeedOperationState state);

    /**
     * Gets database account information.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the database account.
     * In case of failure the {@link Mono} will error.
     *
     * @return a {@link Mono} containing the single resource response with the database account or an error.
     */
    Mono<DatabaseAccount> getDatabaseAccount();

    /**
     * Reads many documents at once
     * @param itemIdentityList CosmosItem id and partition key tuple of items that that needs to be read
     * @param collectionLink link for the documentcollection/container to be queried
     * @param state the query operation state
     * @param klass class type
     * @return a Mono with feed response of documents
     */
    <T> Mono<FeedResponse<T>> readMany(
        List<CosmosItemIdentity> itemIdentityList,
        String collectionLink,
        QueryFeedOperationState state,
        Class<T> klass);

    /**
     * Read all documents of a certain logical partition.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Flux} will contain one or several feed response of the obtained documents.
     * In case of failure the {@link Flux} will error.
     *
     * @param collectionLink the link to the parent document collection.
     * @param partitionKey   the logical partition key.
     * @param state          the query operation state.
     * @param <T> the type parameter
     * @return a {@link Flux} containing one or several feed response pages of the obtained documents or an error.
     */
    <T> Flux<FeedResponse<T>> readAllDocuments(
        String collectionLink,
        PartitionKey partitionKey,
        QueryFeedOperationState state,
        Class<T> classOfT
    );

    Map<String, PartitionedQueryExecutionInfo> getQueryPlanCache();

    /**
     * Gets the collection cache.
     *
     * @return the collection Cache
     */
    RxClientCollectionCache getCollectionCache();

    /**
     * Gets the partition key range cache.
     *
     * @return the partition key range cache
     */
    RxPartitionKeyRangeCache getPartitionKeyRangeCache();

    /***
     * Get the global endpoint manager.
     *
     * @return the global endpoint manager.
     */
    GlobalEndpointManager getGlobalEndpointManager();

    GlobalPartitionEndpointManagerForPerPartitionCircuitBreaker getGlobalPartitionEndpointManagerForCircuitBreaker();

    GlobalPartitionEndpointManagerForPerPartitionAutomaticFailover getGlobalPartitionEndpointManagerForPerPartitionAutomaticFailover();

    /***
     * Get the address selector.
     * @return the address selector.
     */
    AddressSelector getAddressSelector();

    /**
     * Close this {@link AsyncDocumentClient} instance and cleans up the resources.
     */
    void close();

    CosmosItemSerializer getEffectiveItemSerializer(CosmosItemSerializer requestOptionsItemSerializer);

    /**
     * Enable throughput control group.
     *
     * @param group the throughput control group.
     */
    void enableThroughputControlGroup(ThroughputControlGroupInternal group, Mono<Integer> throughputQueryMono);

    /**
     * Submits open connection tasks and warms up caches for replicas for containers specified by
     * {@link CosmosContainerProactiveInitConfig#getCosmosContainerIdentities()} and in
     * {@link CosmosContainerProactiveInitConfig#getProactiveConnectionRegionsCount()} preferred regions.
     *
     * @param proactiveContainerInitConfig the instance encapsulating a list of container identities and
     *                                     no. of proactive connection regions
     */
    Flux<Void> submitOpenConnectionTasksAndInitCaches(CosmosContainerProactiveInitConfig proactiveContainerInitConfig);

    ConsistencyLevel getDefaultConsistencyLevelOfAccount();

    /***
     * Configure fault injector provider.
     *
     * @param injectorProvider the fault injector provider.
     */
    void configureFaultInjectorProvider(IFaultInjectorProvider injectorProvider);

    /**
     * Mark the openConnectionAndInitCaches completed.
     *
     * @param cosmosContainerIdentities the {@link CosmosContainerIdentity} list.
     */
    void recordOpenConnectionsAndInitCachesCompleted(List<CosmosContainerIdentity> cosmosContainerIdentities);

    /**
     * Mark the openConnectionAndInitCaches to start.
     *
     * @param cosmosContainerIdentities the {@link CosmosContainerIdentity} list.
     */
    void recordOpenConnectionsAndInitCachesStarted(List<CosmosContainerIdentity> cosmosContainerIdentities);

    public String getMasterKeyOrResourceToken();
}
