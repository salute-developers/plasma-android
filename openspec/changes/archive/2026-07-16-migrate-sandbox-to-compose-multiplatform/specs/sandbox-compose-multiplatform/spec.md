## ADDED Requirements

### Requirement: Sandbox core uses Kotlin Multiplatform source sets

`integration-core:sandbox-core` SHALL expose its production sandbox models, registries, theme manager, properties, state owner, and story abstractions from `commonMain` using the repository's KMP library convention.

#### Scenario: Common sandbox API compiles for KMP consumers
- **WHEN** a Compose Multiplatform sandbox module depends on `integration-core:sandbox-core`
- **THEN** the sandbox core API MUST resolve from common code without Android-only imports or JVM-only source paths.

#### Scenario: Existing Android sandbox consumers remain compatible
- **WHEN** an existing Android sandbox app depends on `integration-core:sandbox-core`
- **THEN** the Android build MUST continue to resolve the same production sandbox API through the Android target variant.

### Requirement: Sandbox Compose provides a common app root

`integration-core:sandbox-compose` SHALL provide a common `@Composable` sandbox root that renders the sandbox theme, overlay host, navigation content, component list, and component story screens from `commonMain`.

#### Scenario: Common sandbox root is used by a platform launcher
- **WHEN** a platform app calls the common sandbox root from its platform entrypoint
- **THEN** the sandbox UI MUST render without requiring `SandboxActivity` or another Android framework type in common code.

#### Scenario: Android launcher wraps common sandbox root
- **WHEN** the Android pilot app starts its launcher Activity
- **THEN** the Activity MUST delegate UI rendering to the common sandbox root while keeping Android window setup in `androidMain`.

### Requirement: Platform-specific sandbox behavior is isolated

`integration-core:sandbox-compose` SHALL place Android framework behavior in platform source sets and SHALL NOT expose Android framework types from common sandbox APIs.

#### Scenario: Window configuration is Android-specific
- **WHEN** sandbox configures status bar, navigation bar, decor fitting, or Android window insets
- **THEN** that behavior MUST live in `androidMain` or behind a common platform abstraction with Android actual implementation.

#### Scenario: APK updater is outside the CMP pilot
- **WHEN** sandbox is built through the CMP pilot app
- **THEN** updater behavior MUST NOT be required by common sandbox API, and Android updater implementation MUST remain outside the pilot scope.

### Requirement: Sandbox navigation is Compose Multiplatform navigation

Sandbox Compose navigation SHALL use the official Compose Multiplatform navigation artifact from `commonMain` rather than Android-only Navigation Compose.

#### Scenario: Navigation dependency is common
- **WHEN** `integration-core:sandbox-compose` declares navigation dependencies
- **THEN** the navigation dependency MUST be available to `commonMain` and MUST NOT require `androidx.navigation:navigation-compose` in common sandbox code.

#### Scenario: Component routes work across targets
- **WHEN** a user selects a component from the sandbox menu
- **THEN** the common navigation graph MUST navigate to the selected story screen using the same route model on Android and other enabled Compose targets.

### Requirement: Sandbox state management is common

Component story state, property editing, style-property resolution, selected bindings, subtheme selection, and default variant resolution SHALL be implemented in common code without requiring Android Lifecycle ViewModel.

#### Scenario: Story state updates from property editor
- **WHEN** a sandbox user changes a story property in the properties panel
- **THEN** common state management MUST update the story state and recomposition MUST render the new component state.

#### Scenario: Android ViewModel is only an adapter
- **WHEN** Android-specific lifecycle retention is used
- **THEN** Android ViewModel usage MUST wrap or host common state management and MUST NOT contain the only implementation of sandbox state behavior.

### Requirement: Sandbox KSP supports KMP-friendly generated stories

`integration-core:sandbox-ksp` SHALL remain a JVM KSP processor while generating story registry, property producer, and state transformer code that can be consumed by KMP/common source sets.

#### Scenario: Generated story registry is common-compatible
- **WHEN** `sandbox-ksp` generates `registerStories`
- **THEN** the generated file MUST reference only common-compatible sandbox API and story types.

#### Scenario: Generated state helpers avoid Android-only annotations
- **WHEN** `sandbox-ksp` generates producers or transformers for story state
- **THEN** generated code MUST NOT require Android-only annotations or Android framework classes.

#### Scenario: KSP runs for the pilot KMP app
- **WHEN** the pilot `tokens/sdds.serv.compose/app` build needs generated stories
- **THEN** Gradle configuration MUST run the processor for the appropriate KMP/common metadata source set or otherwise provide generated common-compatible sources.

### Requirement: SddsServ sandbox integration is common

`tokens/sdds.serv.compose/integration` SHALL expose sandbox theme registration from common code using the repository's Compose Multiplatform library convention, and generated integration source changes SHALL be produced by the integration generator/templates rather than hand-written only in generated files.

#### Scenario: Theme registration does not require Activity
- **WHEN** common app initialization registers the SddsServ sandbox theme
- **THEN** registration MUST NOT require `SandboxActivity`, Android Activity, or Android Context.

#### Scenario: Integration output is regenerated from source templates
- **WHEN** the SddsServ integration module needs CMP-compatible registration or component provider code
- **THEN** the durable implementation MUST update the `build-system` integration generator/templates and regenerate the integration output instead of relying on manual edits to generated files.

#### Scenario: Theme wrapper uses SddsServ CMP theme
- **WHEN** the sandbox renders a story with the SddsServ theme selected
- **THEN** the theme wrapper MUST use the existing `sdds.serv.compose` multiplatform theme, colors, gradients, and subthemes from common code.

### Requirement: SddsServ sandbox app is the pilot CMP app

`tokens/sdds.serv.compose/app` SHALL be the first sandbox app migrated to the repository's Compose Multiplatform app convention and SHALL validate the sandbox KMP structure on Android.

#### Scenario: Pilot app uses CMP app convention
- **WHEN** `tokens/sdds.serv.compose/app` is configured after migration
- **THEN** it MUST use the repository's CMP app convention rather than the Android-only sandbox app convention.

#### Scenario: Android pilot launches successfully
- **WHEN** the Android variant of `tokens/sdds.serv.compose/app` is installed and launched
- **THEN** it MUST display the sandbox component menu and allow opening at least one SddsServ component story.

#### Scenario: Common app initialization registers theme and stories
- **WHEN** the pilot sandbox app initializes
- **THEN** common initialization MUST register the SddsServ theme and the available core/generated stories before the sandbox UI renders them.

### Requirement: Existing Android sandbox apps are not migrated implicitly

The first implementation SHALL NOT require every existing `tokens/*/app` sandbox module to migrate to CMP in the same change.

#### Scenario: Non-pilot app remains Android-only
- **WHEN** a non-pilot token sandbox app is not included in the migration scope
- **THEN** its Android build MUST either remain compatible through Android wrappers or be left unchanged by this change.
