// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.chat.models;

import com.azure.communication.chat.implementation.converters.CommunicationIdentifierConverter;
import com.azure.communication.chat.implementation.models.CommunicationIdentifierModel;
import com.azure.communication.common.CommunicationIdentifier;
import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;

import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * The ChatParticipant model.
 */
@Fluent
public final class ChatParticipant implements JsonSerializable<ChatParticipant> {
    /**
     * Identifies a participant in Azure Communication services. A participant
     * is, for example, a phone number or an Azure communication user. This
     * model must be interpreted as a union: Apart from rawId, at most one
     * further property may be set.
     */
    private CommunicationIdentifier communicationIdentifier;

    /**
     * Display name for the chat participant.
     */
    private String displayName;

    /**
     * Time from which the chat history is shared with the member. The
     * timestamp is in RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     */
    private OffsetDateTime shareHistoryTime;

    /**
     * Creates a new instance of {@link ChatParticipant}.
     */
    public ChatParticipant() {
    }

    /**
     * Get the communicationIdentifier property: Identifies a participant in Azure Communication services. A participant
     * is, for example, a phone number or an Azure communication user. This model must be interpreted as a union: Apart
     * from rawId, at most one further property may be set.
     *
     * @return the communicationIdentifier value.
     */
    public CommunicationIdentifier getCommunicationIdentifier() {
        return this.communicationIdentifier;
    }

    /**
     * Set the communicationIdentifier property: Identifies a participant in Azure Communication services. A participant
     * is, for example, a phone number or an Azure communication user. This model must be interpreted as a union: Apart
     * from rawId, at most one further property may be set.
     *
     * @param communicationIdentifier the communicationIdentifier value to set.
     * @return the ChatParticipant object itself.
     */
    public ChatParticipant setCommunicationIdentifier(CommunicationIdentifier communicationIdentifier) {
        this.communicationIdentifier = communicationIdentifier;
        return this;
    }

    /**
     * Get the displayName property: Display name for the chat participant.
     *
     * @return the displayName value.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name for the chat participant.
     *
     * @param displayName the displayName value to set.
     * @return the ChatParticipant object itself.
     */
    public ChatParticipant setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the shareHistoryTime property: Time from which the chat history is shared with the chat participant.
     * The timestamp is in RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the shareHistoryTime value.
     */
    public OffsetDateTime getShareHistoryTime() {
        return this.shareHistoryTime;
    }

    /**
     * Set the shareHistoryTime property: Time from which the chat history is shared with the chat participant.
     * The timestamp is in RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @param shareHistoryTime the shareHistoryTime value to set.
     * @return the ChatThreadMember object itself.
     */
    public ChatParticipant setShareHistoryTime(OffsetDateTime shareHistoryTime) {
        this.shareHistoryTime = shareHistoryTime;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        final CommunicationIdentifierModel identifier
            = CommunicationIdentifierConverter.convert(communicationIdentifier);
        jsonWriter.writeJsonField("communicationIdentifier", identifier);
        jsonWriter.writeStringField("displayName", displayName);
        jsonWriter.writeStringField("startDateTime", shareHistoryTime.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ParticipantsUpdated from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ParticipantsUpdated if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ParticipantsUpdated.
     */
    public static ChatParticipant fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            final ChatParticipant participant = new ChatParticipant();
            while (jsonReader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("communicationIdentifier".equals(fieldName)) {
                    final CommunicationIdentifierModel identifier
                        = reader.readObject(CommunicationIdentifierModel::fromJson);
                    participant.communicationIdentifier = CommunicationIdentifierConverter.convert(identifier);
                } else if ("displayName".equals(fieldName)) {
                    participant.displayName = reader.getString();
                } else if ("startDateTime".equals(fieldName)) {
                    participant.shareHistoryTime = OffsetDateTime.parse(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            return participant;
        });
    }
}
