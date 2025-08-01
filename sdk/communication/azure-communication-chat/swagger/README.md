# Azure Communication Service chat client library for Java

> see https://aka.ms/autorest

## Getting Started

To build the SDK for Chat Client, simply Install AutoRest and in this folder, run:

### Setup

```ps
Fork and clone https://github.com/Azure/autorest.java
git checkout main
git submodule update --init --recursive
mvn package -Dlocal
npm install
npm install -g autorest
```

### Generation

There is one swagger for Chat management APIs.

```ps
cd <swagger-folder>
autorest README.md --java --v4 --use=@autorest/modelerfour@4.15.442
```

## Update generated files for chat service

To update generated files for chat service, run the following command

> autorest README.md --java --v4 --use=@autorest/modelerfour@4.15.442

### Code generation settings

```yaml
tag: package-chat-2025-03-15
use: '@autorest/java@4.1.33'
require:
    - https://raw.githubusercontent.com/Azure/azure-rest-api-specs/e5f9d3b1d33ee4e98eef7ec302966f5b0b6efeeb/specification/communication/data-plane/Chat/readme.md
java: true
title: AzureCommunicationChatService
output-folder: ..\
license-header: MICROSOFT_MIT_SMALL
namespace: com.azure.communication.chat
generate-client-as-impl: true
custom-types: ChatMessagePriority,ChatThreadItem,PostReadReceiptOptions,SendChatMessageOptions,UpdateChatMessageOptions,UpdateChatThreadOptions,ChatMessageType,SendChatMessageResult,TypingNotificationOptions,CreateChatThreadOptions
custom-types-subpackage: models
models-subpackage: implementation.models
generate-client-interfaces: false
service-interface-as-public: true
generate-sync-async-clients: false
sync-methods: all
add-context-parameter: true
context-client-method-parameter: true
enable-xml: false
required-parameter-client-methods: true
custom-strongly-typed-header-deserialization: true
generic-response-type: true
```

### Rename AddChatParticipantsRequest to AddChatParticipantsOptions

```yaml
directive:
    - from: swagger-document
      where: $.definitions
      transform: >
          if (!$.AddChatParticipantsOptions) {
            $.AddChatParticipantsOptions = $.AddChatParticipantsRequest;
            delete $.AddChatParticipantsRequest;
          }
    - from: swagger-document
      where: $["paths"]["/chat/threads/{chatThreadId}/participants/:add"].post.parameters[2]
      transform: >
          if ($.schema && $.schema.$ref && $.schema.$ref.endsWith("AddChatParticipantsRequest")) {
              const path = $.schema.$ref.replace(/[#].*$/, "#/definitions/AddChatParticipantsOptions");
              $.schema = { "$ref": path };
          }
```

### Rename CreateChatThreadRequest to CreateChatThreadOptions

```yaml
directive:
    - from: swagger-document
      where: $.definitions
      transform: >
          if (!$.CreateChatThreadOptions) {
            $.CreateChatThreadOptions = $.CreateChatThreadRequest;
            delete $.CreateChatThreadRequest;
          }
    - from: swagger-document
      where: $["paths"]["/chat/threads"].post.parameters[2]
      transform: >
          if ($.schema && $.schema.$ref && $.schema.$ref.endsWith("CreateChatThreadRequest")) {
              const path = $.schema.$ref.replace(/[#].*$/, "#/definitions/CreateChatThreadOptions");
              $.schema = { "$ref": path };
          }
```

### Rename SendChatMessageRequest to SendChatMessageOptions

```yaml
directive:
    - from: swagger-document
      where: $.definitions
      transform: >
          if (!$.SendChatMessageOptions) {
            $.SendChatMessageOptions = $.SendChatMessageRequest;
            delete $.SendChatMessageRequest;
          }
    - from: swagger-document
      where: $["paths"]["/chat/threads/{chatThreadId}/messages"].post.parameters[2]
      transform: >
          if ($.schema && $.schema.$ref && $.schema.$ref.endsWith("SendChatMessageRequest")) {
              const path = $.schema.$ref.replace(/[#].*$/, "#/definitions/SendChatMessageOptions");
              $.schema = { "$ref": path };
          }
```

### Rename UpdateChatMessageRequest to UpdateChatMessageOptions

```yaml
directive:
    - from: swagger-document
      where: $.definitions
      transform: >
          if (!$.UpdateChatMessageOptions) {
            $.UpdateChatMessageOptions = $.UpdateChatMessageRequest;
            delete $.UpdateChatMessageRequest;
          }
    - from: swagger-document
      where: $["paths"]["/chat/threads/{chatThreadId}/messages/{chatMessageId}"].patch.parameters[3]
      transform: >
          if ($.schema && $.schema.$ref && $.schema.$ref.endsWith("UpdateChatMessageRequest")) {
              const path = $.schema.$ref.replace(/[#].*$/, "#/definitions/UpdateChatMessageOptions");
              $.schema = { "$ref": path };
          }
```

### Rename UpdateChatThreadRequest to UpdateChatThreadOptions

```yaml
directive:
    - from: swagger-document
      where: $.definitions
      transform: >
          if (!$.UpdateChatThreadOptions) {
            $.UpdateChatThreadOptions = $.UpdateChatThreadRequest;
            delete $.UpdateChatThreadRequest;
          }
    - from: swagger-document
      where: $["paths"]["/chat/threads/{chatThreadId}"].patch.parameters[2]
      transform: >
          if ($.schema && $.schema.$ref && $.schema.$ref.endsWith("UpdateChatThreadRequest")) {
              const path = $.schema.$ref.replace(/[#].*$/, "#/definitions/UpdateChatThreadOptions");
              $.schema = { "$ref": path };
          }
```

### Rename SendTypingNotificationRequest to TypingNotificationOptions

```yaml
directive:
    - from: swagger-document
      where: $.definitions
      transform: >
          if (!$.TypingNotificationOptions) {
            $.TypingNotificationOptions = $.SendTypingNotificationRequest;
            delete $.SendTypingNotificationRequest;
          }
    - from: swagger-document
      where: $["paths"]["/chat/threads/{chatThreadId}/typing"].post.parameters[2]
      transform: >
          if ($.schema && $.schema.$ref && $.schema.$ref.endsWith("SendTypingNotificationRequest")) {
              const path = $.schema.$ref.replace(/[#].*$/, "#/definitions/TypingNotificationOptions");
              $.schema = { "$ref": path };
          }
```
