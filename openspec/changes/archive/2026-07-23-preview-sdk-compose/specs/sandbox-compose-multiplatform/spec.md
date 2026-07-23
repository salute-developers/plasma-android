## ADDED Requirements

### Requirement: Sandbox core exposes the minimal Compose story renderer contract

`integration-core:sandbox-core` SHALL expose `ComposeBaseStory` and its typed Compose `Content(style, state)` contract from `commonMain` so demo UI and preview runtime can invoke the same renderer implementation.

#### Scenario: Preview depends on sandbox core without demo UI
- **WHEN** `preview-sdk-compose` depends on `sandbox-core`
- **THEN** it MUST resolve the Compose story renderer, `ComponentKey`, default state, properties and transformer contracts without depending on sandbox navigation, scaffold, property editors or ViewModel UI.

#### Scenario: Demo UI renders the moved story contract
- **WHEN** `sandbox-compose` displays an existing Compose story
- **THEN** its UI wrapper MUST invoke the same `ComposeBaseStory.Content` contract now owned by `sandbox-core`.

## MODIFIED Requirements

### Requirement: Sandbox KSP supports KMP-friendly generated stories

`integration-core:sandbox-ksp` SHALL remain a JVM KSP processor while generating public story registration, property producer, and state transformer code that can be consumed by KMP/common source sets and by a separate preview assembly module.

#### Scenario: Generated story registry is common-compatible
- **WHEN** `sandbox-ksp` generates `registerStories`
- **THEN** the generated file MUST reference only common-compatible sandbox API and story types
- **AND** the registration entry point MUST be public so a separate Wasm assembly can initialize the existing `StoryRegistry`.

#### Scenario: Generated state helpers avoid Android-only annotations
- **WHEN** `sandbox-ksp` generates producers or transformers for story state
- **THEN** generated code MUST NOT require Android-only annotations or Android framework classes.

#### Scenario: KSP runs for the pilot KMP app
- **WHEN** the pilot `tokens/sdds.serv.compose/app` build needs generated stories
- **THEN** Gradle configuration MUST run the processor for the appropriate KMP/common metadata source set or otherwise provide generated common-compatible sources.
