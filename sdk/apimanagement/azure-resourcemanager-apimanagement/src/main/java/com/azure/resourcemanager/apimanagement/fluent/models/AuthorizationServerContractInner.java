// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.apimanagement.models.AuthorizationMethod;
import com.azure.resourcemanager.apimanagement.models.BearerTokenSendingMethod;
import com.azure.resourcemanager.apimanagement.models.ClientAuthenticationMethod;
import com.azure.resourcemanager.apimanagement.models.GrantType;
import com.azure.resourcemanager.apimanagement.models.TokenBodyParameterContract;
import java.io.IOException;
import java.util.List;

/**
 * External OAuth authorization server settings.
 */
@Fluent
public final class AuthorizationServerContractInner extends ProxyResource {
    /*
     * Properties of the External OAuth authorization server Contract.
     */
    private AuthorizationServerContractProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of AuthorizationServerContractInner class.
     */
    public AuthorizationServerContractInner() {
    }

    /**
     * Get the innerProperties property: Properties of the External OAuth authorization server Contract.
     * 
     * @return the innerProperties value.
     */
    private AuthorizationServerContractProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the displayName property: User-friendly authorization server name.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: User-friendly authorization server name.
     * 
     * @param displayName the displayName value to set.
     * @return the AuthorizationServerContractInner object itself.
     */
    public AuthorizationServerContractInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationServerContractProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the useInTestConsole property: If true, the authorization server may be used in the developer portal test
     * console. True by default if no value is provided.
     * 
     * @return the useInTestConsole value.
     */
    public Boolean useInTestConsole() {
        return this.innerProperties() == null ? null : this.innerProperties().useInTestConsole();
    }

    /**
     * Set the useInTestConsole property: If true, the authorization server may be used in the developer portal test
     * console. True by default if no value is provided.
     * 
     * @param useInTestConsole the useInTestConsole value to set.
     * @return the AuthorizationServerContractInner object itself.
     */
    public AuthorizationServerContractInner withUseInTestConsole(Boolean useInTestConsole) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationServerContractProperties();
        }
        this.innerProperties().withUseInTestConsole(useInTestConsole);
        return this;
    }

    /**
     * Get the useInApiDocumentation property: If true, the authorization server will be used in the API documentation
     * in the developer portal. False by default if no value is provided.
     * 
     * @return the useInApiDocumentation value.
     */
    public Boolean useInApiDocumentation() {
        return this.innerProperties() == null ? null : this.innerProperties().useInApiDocumentation();
    }

    /**
     * Set the useInApiDocumentation property: If true, the authorization server will be used in the API documentation
     * in the developer portal. False by default if no value is provided.
     * 
     * @param useInApiDocumentation the useInApiDocumentation value to set.
     * @return the AuthorizationServerContractInner object itself.
     */
    public AuthorizationServerContractInner withUseInApiDocumentation(Boolean useInApiDocumentation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationServerContractProperties();
        }
        this.innerProperties().withUseInApiDocumentation(useInApiDocumentation);
        return this;
    }

    /**
     * Get the clientRegistrationEndpoint property: Optional reference to a page where client or app registration for
     * this authorization server is performed. Contains absolute URL to entity being referenced.
     * 
     * @return the clientRegistrationEndpoint value.
     */
    public String clientRegistrationEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().clientRegistrationEndpoint();
    }

    /**
     * Set the clientRegistrationEndpoint property: Optional reference to a page where client or app registration for
     * this authorization server is performed. Contains absolute URL to entity being referenced.
     * 
     * @param clientRegistrationEndpoint the clientRegistrationEndpoint value to set.
     * @return the AuthorizationServerContractInner object itself.
     */
    public AuthorizationServerContractInner withClientRegistrationEndpoint(String clientRegistrationEndpoint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationServerContractProperties();
        }
        this.innerProperties().withClientRegistrationEndpoint(clientRegistrationEndpoint);
        return this;
    }

    /**
     * Get the authorizationEndpoint property: OAuth authorization endpoint. See
     * http://tools.ietf.org/html/rfc6749#section-3.2.
     * 
     * @return the authorizationEndpoint value.
     */
    public String authorizationEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().authorizationEndpoint();
    }

    /**
     * Set the authorizationEndpoint property: OAuth authorization endpoint. See
     * http://tools.ietf.org/html/rfc6749#section-3.2.
     * 
     * @param authorizationEndpoint the authorizationEndpoint value to set.
     * @return the AuthorizationServerContractInner object itself.
     */
    public AuthorizationServerContractInner withAuthorizationEndpoint(String authorizationEndpoint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationServerContractProperties();
        }
        this.innerProperties().withAuthorizationEndpoint(authorizationEndpoint);
        return this;
    }

    /**
     * Get the grantTypes property: Form of an authorization grant, which the client uses to request the access token.
     * 
     * @return the grantTypes value.
     */
    public List<GrantType> grantTypes() {
        return this.innerProperties() == null ? null : this.innerProperties().grantTypes();
    }

    /**
     * Set the grantTypes property: Form of an authorization grant, which the client uses to request the access token.
     * 
     * @param grantTypes the grantTypes value to set.
     * @return the AuthorizationServerContractInner object itself.
     */
    public AuthorizationServerContractInner withGrantTypes(List<GrantType> grantTypes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationServerContractProperties();
        }
        this.innerProperties().withGrantTypes(grantTypes);
        return this;
    }

    /**
     * Get the clientId property: Client or app id registered with this authorization server.
     * 
     * @return the clientId value.
     */
    public String clientId() {
        return this.innerProperties() == null ? null : this.innerProperties().clientId();
    }

    /**
     * Set the clientId property: Client or app id registered with this authorization server.
     * 
     * @param clientId the clientId value to set.
     * @return the AuthorizationServerContractInner object itself.
     */
    public AuthorizationServerContractInner withClientId(String clientId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationServerContractProperties();
        }
        this.innerProperties().withClientId(clientId);
        return this;
    }

    /**
     * Get the clientSecret property: Client or app secret registered with this authorization server. This property will
     * not be filled on 'GET' operations! Use '/listSecrets' POST request to get the value.
     * 
     * @return the clientSecret value.
     */
    public String clientSecret() {
        return this.innerProperties() == null ? null : this.innerProperties().clientSecret();
    }

    /**
     * Set the clientSecret property: Client or app secret registered with this authorization server. This property will
     * not be filled on 'GET' operations! Use '/listSecrets' POST request to get the value.
     * 
     * @param clientSecret the clientSecret value to set.
     * @return the AuthorizationServerContractInner object itself.
     */
    public AuthorizationServerContractInner withClientSecret(String clientSecret) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationServerContractProperties();
        }
        this.innerProperties().withClientSecret(clientSecret);
        return this;
    }

    /**
     * Get the description property: Description of the authorization server. Can contain HTML formatting tags.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Description of the authorization server. Can contain HTML formatting tags.
     * 
     * @param description the description value to set.
     * @return the AuthorizationServerContractInner object itself.
     */
    public AuthorizationServerContractInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationServerContractProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the authorizationMethods property: HTTP verbs supported by the authorization endpoint. GET must be always
     * present. POST is optional.
     * 
     * @return the authorizationMethods value.
     */
    public List<AuthorizationMethod> authorizationMethods() {
        return this.innerProperties() == null ? null : this.innerProperties().authorizationMethods();
    }

    /**
     * Set the authorizationMethods property: HTTP verbs supported by the authorization endpoint. GET must be always
     * present. POST is optional.
     * 
     * @param authorizationMethods the authorizationMethods value to set.
     * @return the AuthorizationServerContractInner object itself.
     */
    public AuthorizationServerContractInner withAuthorizationMethods(List<AuthorizationMethod> authorizationMethods) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationServerContractProperties();
        }
        this.innerProperties().withAuthorizationMethods(authorizationMethods);
        return this;
    }

    /**
     * Get the clientAuthenticationMethod property: Method of authentication supported by the token endpoint of this
     * authorization server. Possible values are Basic and/or Body. When Body is specified, client credentials and other
     * parameters are passed within the request body in the application/x-www-form-urlencoded format.
     * 
     * @return the clientAuthenticationMethod value.
     */
    public List<ClientAuthenticationMethod> clientAuthenticationMethod() {
        return this.innerProperties() == null ? null : this.innerProperties().clientAuthenticationMethod();
    }

    /**
     * Set the clientAuthenticationMethod property: Method of authentication supported by the token endpoint of this
     * authorization server. Possible values are Basic and/or Body. When Body is specified, client credentials and other
     * parameters are passed within the request body in the application/x-www-form-urlencoded format.
     * 
     * @param clientAuthenticationMethod the clientAuthenticationMethod value to set.
     * @return the AuthorizationServerContractInner object itself.
     */
    public AuthorizationServerContractInner
        withClientAuthenticationMethod(List<ClientAuthenticationMethod> clientAuthenticationMethod) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationServerContractProperties();
        }
        this.innerProperties().withClientAuthenticationMethod(clientAuthenticationMethod);
        return this;
    }

    /**
     * Get the tokenBodyParameters property: Additional parameters required by the token endpoint of this authorization
     * server represented as an array of JSON objects with name and value string properties, i.e. {"name" : "name
     * value", "value": "a value"}.
     * 
     * @return the tokenBodyParameters value.
     */
    public List<TokenBodyParameterContract> tokenBodyParameters() {
        return this.innerProperties() == null ? null : this.innerProperties().tokenBodyParameters();
    }

    /**
     * Set the tokenBodyParameters property: Additional parameters required by the token endpoint of this authorization
     * server represented as an array of JSON objects with name and value string properties, i.e. {"name" : "name
     * value", "value": "a value"}.
     * 
     * @param tokenBodyParameters the tokenBodyParameters value to set.
     * @return the AuthorizationServerContractInner object itself.
     */
    public AuthorizationServerContractInner
        withTokenBodyParameters(List<TokenBodyParameterContract> tokenBodyParameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationServerContractProperties();
        }
        this.innerProperties().withTokenBodyParameters(tokenBodyParameters);
        return this;
    }

    /**
     * Get the tokenEndpoint property: OAuth token endpoint. Contains absolute URI to entity being referenced.
     * 
     * @return the tokenEndpoint value.
     */
    public String tokenEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().tokenEndpoint();
    }

    /**
     * Set the tokenEndpoint property: OAuth token endpoint. Contains absolute URI to entity being referenced.
     * 
     * @param tokenEndpoint the tokenEndpoint value to set.
     * @return the AuthorizationServerContractInner object itself.
     */
    public AuthorizationServerContractInner withTokenEndpoint(String tokenEndpoint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationServerContractProperties();
        }
        this.innerProperties().withTokenEndpoint(tokenEndpoint);
        return this;
    }

    /**
     * Get the supportState property: If true, authorization server will include state parameter from the authorization
     * request to its response. Client may use state parameter to raise protocol security.
     * 
     * @return the supportState value.
     */
    public Boolean supportState() {
        return this.innerProperties() == null ? null : this.innerProperties().supportState();
    }

    /**
     * Set the supportState property: If true, authorization server will include state parameter from the authorization
     * request to its response. Client may use state parameter to raise protocol security.
     * 
     * @param supportState the supportState value to set.
     * @return the AuthorizationServerContractInner object itself.
     */
    public AuthorizationServerContractInner withSupportState(Boolean supportState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationServerContractProperties();
        }
        this.innerProperties().withSupportState(supportState);
        return this;
    }

    /**
     * Get the defaultScope property: Access token scope that is going to be requested by default. Can be overridden at
     * the API level. Should be provided in the form of a string containing space-delimited values.
     * 
     * @return the defaultScope value.
     */
    public String defaultScope() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultScope();
    }

    /**
     * Set the defaultScope property: Access token scope that is going to be requested by default. Can be overridden at
     * the API level. Should be provided in the form of a string containing space-delimited values.
     * 
     * @param defaultScope the defaultScope value to set.
     * @return the AuthorizationServerContractInner object itself.
     */
    public AuthorizationServerContractInner withDefaultScope(String defaultScope) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationServerContractProperties();
        }
        this.innerProperties().withDefaultScope(defaultScope);
        return this;
    }

    /**
     * Get the bearerTokenSendingMethods property: Specifies the mechanism by which access token is passed to the API.
     * 
     * @return the bearerTokenSendingMethods value.
     */
    public List<BearerTokenSendingMethod> bearerTokenSendingMethods() {
        return this.innerProperties() == null ? null : this.innerProperties().bearerTokenSendingMethods();
    }

    /**
     * Set the bearerTokenSendingMethods property: Specifies the mechanism by which access token is passed to the API.
     * 
     * @param bearerTokenSendingMethods the bearerTokenSendingMethods value to set.
     * @return the AuthorizationServerContractInner object itself.
     */
    public AuthorizationServerContractInner
        withBearerTokenSendingMethods(List<BearerTokenSendingMethod> bearerTokenSendingMethods) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationServerContractProperties();
        }
        this.innerProperties().withBearerTokenSendingMethods(bearerTokenSendingMethods);
        return this;
    }

    /**
     * Get the resourceOwnerUsername property: Can be optionally specified when resource owner password grant type is
     * supported by this authorization server. Default resource owner username.
     * 
     * @return the resourceOwnerUsername value.
     */
    public String resourceOwnerUsername() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceOwnerUsername();
    }

    /**
     * Set the resourceOwnerUsername property: Can be optionally specified when resource owner password grant type is
     * supported by this authorization server. Default resource owner username.
     * 
     * @param resourceOwnerUsername the resourceOwnerUsername value to set.
     * @return the AuthorizationServerContractInner object itself.
     */
    public AuthorizationServerContractInner withResourceOwnerUsername(String resourceOwnerUsername) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationServerContractProperties();
        }
        this.innerProperties().withResourceOwnerUsername(resourceOwnerUsername);
        return this;
    }

    /**
     * Get the resourceOwnerPassword property: Can be optionally specified when resource owner password grant type is
     * supported by this authorization server. Default resource owner password.
     * 
     * @return the resourceOwnerPassword value.
     */
    public String resourceOwnerPassword() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceOwnerPassword();
    }

    /**
     * Set the resourceOwnerPassword property: Can be optionally specified when resource owner password grant type is
     * supported by this authorization server. Default resource owner password.
     * 
     * @param resourceOwnerPassword the resourceOwnerPassword value to set.
     * @return the AuthorizationServerContractInner object itself.
     */
    public AuthorizationServerContractInner withResourceOwnerPassword(String resourceOwnerPassword) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationServerContractProperties();
        }
        this.innerProperties().withResourceOwnerPassword(resourceOwnerPassword);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AuthorizationServerContractInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AuthorizationServerContractInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AuthorizationServerContractInner.
     */
    public static AuthorizationServerContractInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AuthorizationServerContractInner deserializedAuthorizationServerContractInner
                = new AuthorizationServerContractInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedAuthorizationServerContractInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedAuthorizationServerContractInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedAuthorizationServerContractInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedAuthorizationServerContractInner.innerProperties
                        = AuthorizationServerContractProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAuthorizationServerContractInner;
        });
    }
}
