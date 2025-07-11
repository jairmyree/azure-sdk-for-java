// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Schema of the Data property of an EventGridEvent for an Microsoft.Communication.IncomingCall event.
 * 
 * @deprecated This class is deprecated and may be removed in future releases. System events are now available in the
 * azure-messaging-eventgrid-systemevents package.
 */
@Fluent
@Deprecated
public final class AcsIncomingCallEventData implements JsonSerializable<AcsIncomingCallEventData> {

    /*
     * The communication identifier of the target user.
     */
    @Generated
    private CommunicationIdentifierModel toCommunicationIdentifier;

    /*
     * The communication identifier of the user who initiated the call.
     */
    @Generated
    private CommunicationIdentifierModel fromCommunicationIdentifier;

    /*
     * The Id of the server call
     */
    @Generated
    private String serverCallId;

    /*
     * Display name of caller.
     */
    @Generated
    private String callerDisplayName;

    /*
     * Custom Context of Incoming Call
     */
    @Generated
    private AcsIncomingCallCustomContext customContext;

    /*
     * Signed incoming call context.
     */
    @Generated
    private String incomingCallContext;

    /*
     * CorrelationId (CallId).
     */
    @Generated
    private String correlationId;

    /*
     * The communication identifier of the user on behalf of whom the call is made.
     */
    @Generated
    private CommunicationIdentifierModel onBehalfOfCommunicationIdentifier;

    /**
     * Creates an instance of AcsIncomingCallEventData class.
     */
    @Generated
    public AcsIncomingCallEventData() {
    }

    /**
     * Get the toCommunicationIdentifier property: The communication identifier of the target user.
     *
     * @return the toCommunicationIdentifier value.
     */
    @Generated
    public CommunicationIdentifierModel getToCommunicationIdentifier() {
        return this.toCommunicationIdentifier;
    }

    /**
     * Set the toCommunicationIdentifier property: The communication identifier of the target user.
     *
     * @param toCommunicationIdentifier the toCommunicationIdentifier value to set.
     * @return the AcsIncomingCallEventData object itself.
     */
    @Generated
    public AcsIncomingCallEventData
        setToCommunicationIdentifier(CommunicationIdentifierModel toCommunicationIdentifier) {
        this.toCommunicationIdentifier = toCommunicationIdentifier;
        return this;
    }

    /**
     * Get the fromCommunicationIdentifier property: The communication identifier of the user who initiated the call.
     *
     * @return the fromCommunicationIdentifier value.
     */
    @Generated
    public CommunicationIdentifierModel getFromCommunicationIdentifier() {
        return this.fromCommunicationIdentifier;
    }

    /**
     * Set the fromCommunicationIdentifier property: The communication identifier of the user who initiated the call.
     *
     * @param fromCommunicationIdentifier the fromCommunicationIdentifier value to set.
     * @return the AcsIncomingCallEventData object itself.
     */
    @Generated
    public AcsIncomingCallEventData
        setFromCommunicationIdentifier(CommunicationIdentifierModel fromCommunicationIdentifier) {
        this.fromCommunicationIdentifier = fromCommunicationIdentifier;
        return this;
    }

    /**
     * Get the serverCallId property: The Id of the server call.
     *
     * @return the serverCallId value.
     */
    @Generated
    public String getServerCallId() {
        return this.serverCallId;
    }

    /**
     * Set the serverCallId property: The Id of the server call.
     *
     * @param serverCallId the serverCallId value to set.
     * @return the AcsIncomingCallEventData object itself.
     */
    @Generated
    public AcsIncomingCallEventData setServerCallId(String serverCallId) {
        this.serverCallId = serverCallId;
        return this;
    }

    /**
     * Get the callerDisplayName property: Display name of caller.
     *
     * @return the callerDisplayName value.
     */
    @Generated
    public String getCallerDisplayName() {
        return this.callerDisplayName;
    }

    /**
     * Set the callerDisplayName property: Display name of caller.
     *
     * @param callerDisplayName the callerDisplayName value to set.
     * @return the AcsIncomingCallEventData object itself.
     */
    @Generated
    public AcsIncomingCallEventData setCallerDisplayName(String callerDisplayName) {
        this.callerDisplayName = callerDisplayName;
        return this;
    }

    /**
     * Get the customContext property: Custom Context of Incoming Call.
     *
     * @return the customContext value.
     */
    @Generated
    public AcsIncomingCallCustomContext getCustomContext() {
        return this.customContext;
    }

    /**
     * Set the customContext property: Custom Context of Incoming Call.
     *
     * @param customContext the customContext value to set.
     * @return the AcsIncomingCallEventData object itself.
     */
    @Generated
    public AcsIncomingCallEventData setCustomContext(AcsIncomingCallCustomContext customContext) {
        this.customContext = customContext;
        return this;
    }

    /**
     * Get the incomingCallContext property: Signed incoming call context.
     *
     * @return the incomingCallContext value.
     */
    @Generated
    public String getIncomingCallContext() {
        return this.incomingCallContext;
    }

    /**
     * Set the incomingCallContext property: Signed incoming call context.
     *
     * @param incomingCallContext the incomingCallContext value to set.
     * @return the AcsIncomingCallEventData object itself.
     */
    @Generated
    public AcsIncomingCallEventData setIncomingCallContext(String incomingCallContext) {
        this.incomingCallContext = incomingCallContext;
        return this;
    }

    /**
     * Get the correlationId property: CorrelationId (CallId).
     *
     * @return the correlationId value.
     */
    @Generated
    public String getCorrelationId() {
        return this.correlationId;
    }

    /**
     * Set the correlationId property: CorrelationId (CallId).
     *
     * @param correlationId the correlationId value to set.
     * @return the AcsIncomingCallEventData object itself.
     */
    @Generated
    public AcsIncomingCallEventData setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     * Get the onBehalfOfCommunicationIdentifier property: The communication identifier of the user on behalf of whom
     * the call is made.
     *
     * @return the onBehalfOfCommunicationIdentifier value.
     */
    @Generated
    public CommunicationIdentifierModel getOnBehalfOfCommunicationIdentifier() {
        return this.onBehalfOfCommunicationIdentifier;
    }

    /**
     * Set the onBehalfOfCommunicationIdentifier property: The communication identifier of the user on behalf of whom
     * the call is made.
     *
     * @param onBehalfOfCommunicationIdentifier the onBehalfOfCommunicationIdentifier value to set.
     * @return the AcsIncomingCallEventData object itself.
     */
    @Generated
    public AcsIncomingCallEventData
        setOnBehalfOfCommunicationIdentifier(CommunicationIdentifierModel onBehalfOfCommunicationIdentifier) {
        this.onBehalfOfCommunicationIdentifier = onBehalfOfCommunicationIdentifier;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("to", this.toCommunicationIdentifier);
        jsonWriter.writeJsonField("from", this.fromCommunicationIdentifier);
        jsonWriter.writeStringField("serverCallId", this.serverCallId);
        jsonWriter.writeStringField("callerDisplayName", this.callerDisplayName);
        jsonWriter.writeJsonField("customContext", this.customContext);
        jsonWriter.writeStringField("incomingCallContext", this.incomingCallContext);
        jsonWriter.writeStringField("correlationId", this.correlationId);
        jsonWriter.writeJsonField("onBehalfOfCommunicationIdentifier", this.onBehalfOfCommunicationIdentifier);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AcsIncomingCallEventData from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AcsIncomingCallEventData if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AcsIncomingCallEventData.
     */
    @Generated
    public static AcsIncomingCallEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AcsIncomingCallEventData deserializedAcsIncomingCallEventData = new AcsIncomingCallEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("to".equals(fieldName)) {
                    deserializedAcsIncomingCallEventData.toCommunicationIdentifier
                        = CommunicationIdentifierModel.fromJson(reader);
                } else if ("from".equals(fieldName)) {
                    deserializedAcsIncomingCallEventData.fromCommunicationIdentifier
                        = CommunicationIdentifierModel.fromJson(reader);
                } else if ("serverCallId".equals(fieldName)) {
                    deserializedAcsIncomingCallEventData.serverCallId = reader.getString();
                } else if ("callerDisplayName".equals(fieldName)) {
                    deserializedAcsIncomingCallEventData.callerDisplayName = reader.getString();
                } else if ("customContext".equals(fieldName)) {
                    deserializedAcsIncomingCallEventData.customContext = AcsIncomingCallCustomContext.fromJson(reader);
                } else if ("incomingCallContext".equals(fieldName)) {
                    deserializedAcsIncomingCallEventData.incomingCallContext = reader.getString();
                } else if ("correlationId".equals(fieldName)) {
                    deserializedAcsIncomingCallEventData.correlationId = reader.getString();
                } else if ("onBehalfOfCommunicationIdentifier".equals(fieldName)) {
                    deserializedAcsIncomingCallEventData.onBehalfOfCommunicationIdentifier
                        = CommunicationIdentifierModel.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedAcsIncomingCallEventData;
        });
    }
}
