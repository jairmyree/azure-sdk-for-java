// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.v2.security.keyvault.administration.implementation;

import com.azure.v2.security.keyvault.administration.KeyVaultAdministrationServiceVersion;
import com.azure.v2.security.keyvault.administration.implementation.models.KeyVaultError;
import com.azure.v2.security.keyvault.administration.implementation.models.RoleDefinition;
import com.azure.v2.security.keyvault.administration.implementation.models.RoleDefinitionCreateParameters;
import com.azure.v2.security.keyvault.administration.implementation.models.RoleDefinitionListResult;
import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceInterface;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.annotations.BodyParam;
import io.clientcore.core.http.annotations.HeaderParam;
import io.clientcore.core.http.annotations.HostParam;
import io.clientcore.core.http.annotations.HttpRequestInformation;
import io.clientcore.core.http.annotations.PathParam;
import io.clientcore.core.http.annotations.QueryParam;
import io.clientcore.core.http.annotations.UnexpectedResponseExceptionDetail;
import io.clientcore.core.http.models.HttpMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.http.paging.PagedIterable;
import io.clientcore.core.http.paging.PagedResponse;
import io.clientcore.core.http.pipeline.HttpPipeline;
import io.clientcore.core.instrumentation.logging.ClientLogger;
import java.lang.reflect.InvocationTargetException;

/**
 * An instance of this class provides access to all the operations defined in RoleDefinitions.
 */
public final class RoleDefinitionsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final RoleDefinitionsService service;

    /**
     * The service client containing this operation class.
     */
    private final KeyVaultAdministrationClientImpl client;

    /**
     * Initializes an instance of RoleDefinitionsImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    RoleDefinitionsImpl(KeyVaultAdministrationClientImpl client) {
        this.service = RoleDefinitionsService.getNewInstance(client.getHttpPipeline());
        this.client = client;
    }

    /**
     * Gets Service version.
     * 
     * @return the serviceVersion value.
     */
    public KeyVaultAdministrationServiceVersion getServiceVersion() {
        return client.getServiceVersion();
    }

    /**
     * The interface defining all the services for KeyVaultAdministrationClientRoleDefinitions to be used by the proxy
     * service to perform REST calls.
     */
    @ServiceInterface(name = "KeyVaultAdministrationClientRoleDefinitions", host = "{vaultBaseUrl}")
    public interface RoleDefinitionsService {
        static RoleDefinitionsService getNewInstance(HttpPipeline pipeline) {
            try {
                Class<?> clazz = Class
                    .forName("com.azure.v2.security.keyvault.administration.implementation.RoleDefinitionsServiceImpl");
                return (RoleDefinitionsService) clazz.getMethod("getNewInstance", HttpPipeline.class)
                    .invoke(null, pipeline);
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }

        @HttpRequestInformation(
            method = HttpMethod.DELETE,
            path = "/{scope}/providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionName}",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionBodyClass = KeyVaultError.class)
        Response<RoleDefinition> delete(@HostParam("vaultBaseUrl") String vaultBaseUrl,
            @QueryParam("api-version") String apiVersion, @PathParam(value = "scope", encoded = true) String scope,
            @PathParam("roleDefinitionName") String roleDefinitionName, @HeaderParam("Accept") String accept,
            RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.PUT,
            path = "/{scope}/providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionName}",
            expectedStatusCodes = { 201 })
        @UnexpectedResponseExceptionDetail(exceptionBodyClass = KeyVaultError.class)
        Response<RoleDefinition> createOrUpdate(@HostParam("vaultBaseUrl") String vaultBaseUrl,
            @QueryParam("api-version") String apiVersion, @PathParam(value = "scope", encoded = true) String scope,
            @PathParam("roleDefinitionName") String roleDefinitionName, @HeaderParam("Content-Type") String contentType,
            @HeaderParam("Accept") String accept,
            @BodyParam("application/json") RoleDefinitionCreateParameters parameters, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/{scope}/providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionName}",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionBodyClass = KeyVaultError.class)
        Response<RoleDefinition> get(@HostParam("vaultBaseUrl") String vaultBaseUrl,
            @QueryParam("api-version") String apiVersion, @PathParam(value = "scope", encoded = true) String scope,
            @PathParam("roleDefinitionName") String roleDefinitionName, @HeaderParam("Accept") String accept,
            RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/{scope}/providers/Microsoft.Authorization/roleDefinitions",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionBodyClass = KeyVaultError.class)
        Response<RoleDefinitionListResult> list(@HostParam("vaultBaseUrl") String vaultBaseUrl,
            @QueryParam("api-version") String apiVersion, @PathParam(value = "scope", encoded = true) String scope,
            @QueryParam("$filter") String filter, @HeaderParam("Accept") String accept, RequestContext requestContext);

        @HttpRequestInformation(method = HttpMethod.GET, path = "{nextLink}", expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionBodyClass = KeyVaultError.class)
        Response<RoleDefinitionListResult> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("vaultBaseUrl") String vaultBaseUrl, @HeaderParam("Accept") String accept,
            RequestContext requestContext);
    }

    /**
     * Deletes a custom role definition.
     * 
     * @param scope The scope of the role definition to delete. Managed HSM only supports '/'.
     * @param roleDefinitionName The name (GUID) of the role definition to delete.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RoleDefinition> deleteWithResponse(String scope, String roleDefinitionName,
        RequestContext requestContext) {
        final String accept = "application/json";
        return service.delete(this.client.getVaultBaseUrl(), this.client.getServiceVersion().getVersion(), scope,
            roleDefinitionName, accept, requestContext);
    }

    /**
     * Creates or updates a custom role definition.
     * 
     * @param scope The scope of the role definition to create or update. Managed HSM only supports '/'.
     * @param roleDefinitionName The name of the role definition to create or update. It can be any valid GUID.
     * @param parameters Parameters for the role definition.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RoleDefinition> createOrUpdateWithResponse(String scope, String roleDefinitionName,
        RoleDefinitionCreateParameters parameters, RequestContext requestContext) {
        final String contentType = "application/json";
        final String accept = "application/json";
        return service.createOrUpdate(this.client.getVaultBaseUrl(), this.client.getServiceVersion().getVersion(),
            scope, roleDefinitionName, contentType, accept, parameters, requestContext);
    }

    /**
     * Get the specified role definition.
     * 
     * @param scope The scope of the role definition to get. Managed HSM only supports '/'.
     * @param roleDefinitionName The name of the role definition to get.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RoleDefinition> getWithResponse(String scope, String roleDefinitionName,
        RequestContext requestContext) {
        final String accept = "application/json";
        return service.get(this.client.getVaultBaseUrl(), this.client.getServiceVersion().getVersion(), scope,
            roleDefinitionName, accept, requestContext);
    }

    /**
     * Get all role definitions that are applicable at scope and above.
     * 
     * @param scope The scope of the role definition.
     * @param filter The filter to apply on the operation. Use atScopeAndBelow filter to search below the given scope as
     * well.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all role definitions that are applicable at scope and above.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PagedResponse<RoleDefinition> listSinglePage(String scope, String filter) {
        final String accept = "application/json";
        Response<RoleDefinitionListResult> res = service.list(this.client.getVaultBaseUrl(),
            this.client.getServiceVersion().getVersion(), scope, filter, accept, RequestContext.none());
        return new PagedResponse<>(res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().getValue(),
            null, res.getValue().getNextLink() != null ? res.getValue().getNextLink() : null, null, null, null);
    }

    /**
     * Get all role definitions that are applicable at scope and above.
     * 
     * @param scope The scope of the role definition.
     * @param filter The filter to apply on the operation. Use atScopeAndBelow filter to search below the given scope as
     * well.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all role definitions that are applicable at scope and above.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PagedResponse<RoleDefinition> listSinglePage(String scope, String filter, RequestContext requestContext) {
        final String accept = "application/json";
        Response<RoleDefinitionListResult> res = service.list(this.client.getVaultBaseUrl(),
            this.client.getServiceVersion().getVersion(), scope, filter, accept, requestContext);
        return new PagedResponse<>(res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().getValue(),
            null, res.getValue().getNextLink() != null ? res.getValue().getNextLink() : null, null, null, null);
    }

    /**
     * Get all role definitions that are applicable at scope and above.
     * 
     * @param scope The scope of the role definition.
     * @param filter The filter to apply on the operation. Use atScopeAndBelow filter to search below the given scope as
     * well.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all role definitions that are applicable at scope and above.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RoleDefinition> list(String scope, String filter) {
        return new PagedIterable<>((pagingOptions) -> {
            if (pagingOptions.getOffset() != null) {
                throw LOGGER.throwableAtError()
                    .addKeyValue("propertyName", "offset")
                    .addKeyValue("methodName", "list")
                    .log("Not a supported paging option in this API", IllegalArgumentException::new);
            }
            if (pagingOptions.getPageSize() != null) {
                throw LOGGER.throwableAtError()
                    .addKeyValue("propertyName", "pageSize")
                    .addKeyValue("methodName", "list")
                    .log("Not a supported paging option in this API", IllegalArgumentException::new);
            }
            if (pagingOptions.getPageIndex() != null) {
                throw LOGGER.throwableAtError()
                    .addKeyValue("propertyName", "pageIndex")
                    .addKeyValue("methodName", "list")
                    .log("Not a supported paging option in this API", IllegalArgumentException::new);
            }
            if (pagingOptions.getContinuationToken() != null) {
                throw LOGGER.throwableAtError()
                    .addKeyValue("propertyName", "continuationToken")
                    .addKeyValue("methodName", "list")
                    .log("Not a supported paging option in this API", IllegalArgumentException::new);
            }
            return listSinglePage(scope, filter);
        }, (pagingOptions, nextLink) -> listNextSinglePage(nextLink));
    }

    /**
     * Get all role definitions that are applicable at scope and above.
     * 
     * @param scope The scope of the role definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all role definitions that are applicable at scope and above.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RoleDefinition> list(String scope) {
        final String filter = null;
        return new PagedIterable<>((pagingOptions) -> {
            if (pagingOptions.getOffset() != null) {
                throw LOGGER.throwableAtError()
                    .addKeyValue("propertyName", "offset")
                    .addKeyValue("methodName", "list")
                    .log("Not a supported paging option in this API", IllegalArgumentException::new);
            }
            if (pagingOptions.getPageSize() != null) {
                throw LOGGER.throwableAtError()
                    .addKeyValue("propertyName", "pageSize")
                    .addKeyValue("methodName", "list")
                    .log("Not a supported paging option in this API", IllegalArgumentException::new);
            }
            if (pagingOptions.getPageIndex() != null) {
                throw LOGGER.throwableAtError()
                    .addKeyValue("propertyName", "pageIndex")
                    .addKeyValue("methodName", "list")
                    .log("Not a supported paging option in this API", IllegalArgumentException::new);
            }
            if (pagingOptions.getContinuationToken() != null) {
                throw LOGGER.throwableAtError()
                    .addKeyValue("propertyName", "continuationToken")
                    .addKeyValue("methodName", "list")
                    .log("Not a supported paging option in this API", IllegalArgumentException::new);
            }
            return listSinglePage(scope, filter);
        }, (pagingOptions, nextLink) -> listNextSinglePage(nextLink));
    }

    /**
     * Get all role definitions that are applicable at scope and above.
     * 
     * @param scope The scope of the role definition.
     * @param filter The filter to apply on the operation. Use atScopeAndBelow filter to search below the given scope as
     * well.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all role definitions that are applicable at scope and above.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RoleDefinition> list(String scope, String filter, RequestContext requestContext) {
        RequestContext requestContextForNextPage = requestContext != null ? requestContext : RequestContext.none();
        return new PagedIterable<>((pagingOptions) -> {
            if (pagingOptions.getOffset() != null) {
                throw LOGGER.throwableAtError()
                    .addKeyValue("propertyName", "offset")
                    .addKeyValue("methodName", "list")
                    .log("Not a supported paging option in this API", IllegalArgumentException::new);
            }
            if (pagingOptions.getPageSize() != null) {
                throw LOGGER.throwableAtError()
                    .addKeyValue("propertyName", "pageSize")
                    .addKeyValue("methodName", "list")
                    .log("Not a supported paging option in this API", IllegalArgumentException::new);
            }
            if (pagingOptions.getPageIndex() != null) {
                throw LOGGER.throwableAtError()
                    .addKeyValue("propertyName", "pageIndex")
                    .addKeyValue("methodName", "list")
                    .log("Not a supported paging option in this API", IllegalArgumentException::new);
            }
            if (pagingOptions.getContinuationToken() != null) {
                throw LOGGER.throwableAtError()
                    .addKeyValue("propertyName", "continuationToken")
                    .addKeyValue("methodName", "list")
                    .log("Not a supported paging option in this API", IllegalArgumentException::new);
            }
            return listSinglePage(scope, filter, requestContext);
        }, (pagingOptions, nextLink) -> listNextSinglePage(nextLink, requestContextForNextPage));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition list operation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PagedResponse<RoleDefinition> listNextSinglePage(String nextLink) {
        final String accept = "application/json";
        Response<RoleDefinitionListResult> res
            = service.listNext(nextLink, this.client.getVaultBaseUrl(), accept, RequestContext.none());
        return new PagedResponse<>(res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().getValue(),
            null, res.getValue().getNextLink() != null ? res.getValue().getNextLink() : null, null, null, null);
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition list operation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PagedResponse<RoleDefinition> listNextSinglePage(String nextLink, RequestContext requestContext) {
        final String accept = "application/json";
        Response<RoleDefinitionListResult> res
            = service.listNext(nextLink, this.client.getVaultBaseUrl(), accept, requestContext);
        return new PagedResponse<>(res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().getValue(),
            null, res.getValue().getNextLink() != null ? res.getValue().getNextLink() : null, null, null, null);
    }

    private static final ClientLogger LOGGER = new ClientLogger(RoleDefinitionsImpl.class);
}
