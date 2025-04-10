# Release History

## 1.0.0-beta.6 (Unreleased)

### Features Added

### Breaking Changes

### Bugs Fixed

### Other Changes

## 1.0.0-beta.5 (2025-02-21)

### Features Added

- Added `include[]` query parameter for `getRunStep` methods to specify additional fields for the request. Currently only files are supported.
  - Results added to run step details file search tool calls instances
- Added more `VectorStoreFileErrorCode`s. Specifically, `server_error`, `unsupported_file` and `invalid_file`.
- Added `AssistantsApiResponseFormatJsonSchema` as a possible value (previously, `text` and `json_object` where the only supported ones).
- Added Azure OpenAI services labels: `V2024_09_01_PREVIEW`, `V2024_10_01_PREVIEW`, `V2025_01_01_PREVIEW`.

### Breaking Changes

- Removed `AssistantsApiResponseFormatMode.NONE`.

### Other Changes

#### Dependency Updates

- Upgraded `azure-json` to version `1.4.0`.
- Upgraded `azure-core` to version `1.55.2`.
- Upgraded `azure-core-http-netty` to version `1.15.10`.

## 1.0.0-beta.4 (2024-08-29)

### Features Added

- `file_search` tool definitions now have the ability to configure `max_num_results` via the matching, named inner options object
   Previously, only a stubbed `{ "type": "file_search" }` was valid. Now, e.g.: `{ "type": "file_search", "file_search": { "max_num_results": 20 } }`
  - Added a new property `FileSearchToolDefinitionDetails fileSearch` to `FileSearchToolDefinition` model.
  - Added new class `FileSearchToolDefinitionDetails` to represent the details of a file search tool.

- `chunking_strategy` is added as a new optional property when creating a vector store (either via the vector store creation operation
  or the helper when creating an assistant) -- this allows customization of the chunk size and overlap used when ingesting data.
  See the OpenAI reference for full details.
  - Added a new property `VectorStoreChunkingStrategyRequest chunkingStrategy` to `VectorStoreOptions` model.
  - Added a new property `VectorStoreChunkingStrategyResponse chunkingStrategy` to `VectorStoreFile` model.
  - Added new enum `VectorStoreChunkingStrategyRequestType` and `VectorStoreChunkingStrategyResponseType` to represent the chunking strategy `type` for vector stores.
  - Added new class `VectorStoreChunkingStrategyRequest` and `VectorStoreChunkingStrategyResponse` to represent the chunking strategy for vector stores.
  - Added new class `VectorStoreAutoChunkingStrategyRequest` and `VectorStoreAutoChunkingStrategyResponse` to represent the `auto` chunking strategy for vector stores.
  - Added new class `VectorStoreStaticChunkingStrategyOptions`, `VectorStoreStaticChunkingStrategyRequest` and `VectorStoreStaticChunkingStrategyResponse` 
    to represent the `static` chunking strategy for vector stores.

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` to version `1.51.0`.
- Upgraded `azure-core-http-netty` to version `1.15.3`.


## 1.0.0-beta.3 (2024-06-06)

### Features Added

#### Streaming

- Operation updates:
  - Added `createRunStream`, `createThreadAndRunStream` and `submitToolOutputsToRunStream` methods to `AssistantsClient` and `AssistantsAsyncClient` classes.
    A suite of classes extending from `StreamUpdate` were added for users to be able to consume the incremental updates from the service.

#### Assistants

- Model updates:
  - `Assistant`, `AssistantCreationOptions` and `UpdateAssistantOptions` models:
    - Added new fields: `toolResources` , `temperature`, `topP` and `responseFormat`.

#### Files

- Model updates:
  - `OpenAIFile` model changes:
      - Added new fields: `status` of `FileState` type and `status_details` of `String` type.
  - Added new enum `FileState` representing the type of the `status` field mentioned in the previous point.
  - Added new possible values for `FilePurpose`: `batch`, `batch_output` and `vision`.

#### Messages

- Operation updates: 
  - Updated `listMessages` to accept the filter `runId`.

- Model updates:
  - Added new model `MessageAttachment`.
  - Updated docs renaming mentions of `retrieval` tool to `file_search`.
  - Added new field, `startIndex` and `endIndex` to `MessageTextFileCitationAnnotation`, `MessageTextFilePathAnnotation` model.
#### Run Step

- Model updates:
  - `ThreadRun` model updates:
    - Added fields: `temperature`, `topP`, `maxPromptTokens`, `maxCompletionTokens`, `truncationStrategy`, `toolChoice` and `responseFormat`.
  - Updated documentation for `RunCompletionUsage`.
  - `CreateRunOptions` model updates:
    - Added fields: `additionalMessages`, `temperature`, `topP`, `maxPromptTokens`, `maxCompletionTokens`, `truncationStrategy`, `toolChoice` and `responseFormat`.
  - `CreateAndRunThreadOptions` model updates:
    - Added fields: `toolResources`, `temperature`, `topP`, `maxPromptTokens`, `maxCompletionTokens`, `truncationStrategy`, `toolChoice` and `responseFormat`.
  - Added new model for all the `truncationStrategy` fields called `TruncationObject`.

#### Threads

- Model updates:
  - `AssistantThread` model now includes `toolResources` field as nullable.
  - `AssistantThreadCreationOptions` updates include: `messages` type using renamed type `ThreadInitializationMessage` -> `ThreadMessageOptions`, `toolResources`.

#### Tool Resources (new)

- Model updates:
  - There are 3 new models that were added: `ToolResources`, `CreateToolResourcesOptions` and `UpdateToolResourcesOptions`. As the name implies, wherever there is 
    a field `toolResource` we use the appropriate type, depending on the model declaring it is meant to be a response object, create request object or update request object, respectively.

#### Vector Stores (new)

There are 3 main areas for vector stores into which its models and operations can be divided. That is vector stores themselves, vector store files and vector store file batches.

- Model updates:
  - new models (I will just list the top level response and request objects, but there are several subtypes describing more complex JSON object fields):  `VectorStore` and `VectorStoreOptions`,  `VectorStoreFile` and there is no request object, `VectorStoreFileBatch` and there is no request object.

- Operation Updates:
  - new operations `listVectorStores` , `createVectorStore`, `getVectorStore`, `modifyVectorStore` and `deleteVectorStore`.
  - new vector store file operations: `listVectorStoreFiles`, `createVectorStoreFile`, `getVectorStoreFile` and `deleteVectorStoreFile`.
  - new vector store file batch operations: `createVectorStoreFileBatch`, `getVectorStoreFileBatch`, `cancelVectorStoreFileBatch` and `listVectorStoreFileBatchFiles`.

### Breaking Changes

#### Assistants

- Model updates:
  - Removed `AssistantFile` model.  
  - `Assistant`, `AssistantCreateOptions` and `UpdateAssistantOptions` models:
    - removed fields: `fileIds`.
- Operation updates:
  - Removed operations: `createAssistantFile` , `listAssistantFiles`, `getAssistantFile` and `deleteAssistantFile`.

#### Files

- Removed method `uploadFile(FileDetails file, FilePurpose purpose)`. Use `uploadFile(FileDetails file, FilePurpose purpose, String fileName)` instead

#### Messages

- Model updates:
  - Renamed `ThreadInitializationMessage` to `ThreadMessageOptions`.
  - Removed `MessageFile` model.
  - Updated `ThreadMessage` model:
    - The field `incomplete_details` was of the wrong type. Corrected from `MessageIncompleteDetailsReason` -> `MessageIncompleteDetails`.
    - `assistantId` was marked as optional, but it was in fact nullable
    - `runId` was marked as optional, but it was in fact nullable
    - Removed field `fileIds`
    - Added new field `attachments` a nullable array of `MessageAttachment`
    
- Operation updates:
  - Removed `MessageFile` related operations: `listMessageFiles` and `getMessageFile` 
  - Updated `createMessage` to accept the `ThreadMessageOptions` model (also used in `AssistantThreadCreationOptions`) 

#### Run Step

- Model updates:
  - `ThreadRun` model updates:
    - Removed field `fileIds`

#### Threads

- Model updates:
  - Extracted fields used in `updateThread` operation into model `UpdateAssistantThreadOptions` which now includes the new fields `toolResources`.

- Operation updates:
  - `updateThread` using extracted model `UpdatedAssistantThreadOptions` instead of parameters using the spread operator.

#### Tools

- Model updates: (mostly about renaming tool `retrieval` to `file_search`)
  - Renamed model `RetrievalToolDefinition` to `FileSearchToolDefinition` and the associated discriminator value.
  - Renamed model `RunStepDeltaRetrievalToolCall` to `RunStepDeltaFileSearchToolCall`.
  - `RunStepToolCall` variant `RunStepRetrievalToolCall` renamed to `RunStepFileSearchToolCall` and the associated discriminator value.

### Bugs Fixed

- A combination of inputs for `uploadFile` would allow users to not send `String filename` to the service resulting always in an error, as this is actually mandatory.

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` to version `1.49.1`.
- Upgraded `azure-core-http-netty` to version `1.15.1`.


## 1.0.0-beta.2 (2024-02-13)

### Breaking Changes

- The following class have been removed:
  - `FileListResponse`
  - `OpenAIPageableListOfAssistant`
  - `OpenAIPageableListOfAssistantFile`
  - `OpenAIPageableListOfMessageFile`
  - `OpenAIPageableListOfRunStep`
  - `OpenAIPageableListOfThreadMessage`
  - `OpenAIPageableListOfThreadRun` 

- We've introduced `PageableList<T>` these classes were used, except for `FileListResponse` where we simply return `List<OpenAIFile>`.
- If you are using `listFilesWithResponse` and need to manually deserialize the `BinaryData` in the response, you can still use `PageableList<T>` like so:
```java
client.listFilesWithResponse(requestOptions)
    .getValue()
    .toObject(new TypeReference<PageableList<OpenAIFile>>() {})
    .getData();
```

### Other Changes

- On `uploadFile` method in `AssistantsClient` and `AssistantsAsyncClient`, it is required to set the "filename" of the file, via `setFilename` method in `FileDetails` class. The double quote character `"`, the newline character `0x0A`, the return character `0x0D` in "filename" would be escaped by the client library.


## 1.0.0-beta.1 (2024-02-07)

### Features Added

- This is the initial release of `azure-ai-openai-assistants` client library for OpenAI beta Assistants.
- Full support for OpenAI's beta Assistants features is included:
  - [OpenAI's documentation](https://platform.openai.com/docs/assistants/overview)
  - [Azure OpenAI's documentation](https://learn.microsoft.com/azure/ai-services/openai/assistants-quickstart?tabs=command-line&pivots=programming-language-studio)
