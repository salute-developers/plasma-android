# sandbox-compose-multiplatform Specification

## Purpose
Defines the Compose Multiplatform sandbox stack used by demo applications, starting with the `tokens/sdds.serv.compose/app` pilot.

## Requirements
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

### Requirement: Pilot sandbox provides an independent JVM launcher

`tokens/sdds.serv.compose/app` SHALL provide a runnable JVM Desktop launcher that initializes the common SddsServ sandbox and executes the JVM variants of all sandbox dependencies independently from native macOS.

#### Scenario: JVM sandbox runs on a desktop host
- **WHEN** a developer runs the JVM launcher task
- **THEN** a desktop window MUST display the common SddsServ sandbox and allow opening a component story.

#### Scenario: JVM validation does not substitute native macOS validation
- **WHEN** the JVM launcher is built or run on macOS
- **THEN** the build MUST resolve `jvmMain` variants and MUST NOT be reported as validation of `macosMain` or `macosArm64` variants.

### Requirement: Pilot sandbox provides a native macOS launcher

`tokens/sdds.serv.compose/app` SHALL provide a Kotlin/Native macOS executable that initializes the common SddsServ sandbox, starts an AppKit application event loop, and renders the sandbox in the Compose native macOS window backend without using a JVM runtime.

#### Scenario: Native ARM64 sandbox links
- **WHEN** the native macOS launcher is built for `macosArm64`
- **THEN** Kotlin/Native MUST compile and link the common, native, Apple, macOS, and ARM64 variants of the sandbox and its dependencies into an executable.

#### Scenario: Native macOS sandbox launches
- **WHEN** the `macosArm64` application is started on a compatible Mac
- **THEN** it MUST open a resizable native macOS window that displays the component menu and supports mouse click, wheel scrolling, and keyboard input for the sandbox UI.

#### Scenario: Native macOS app closes
- **WHEN** the user closes the last native macOS sandbox window
- **THEN** the application MUST terminate without leaving a running event loop or an undisposed sandbox scene.

#### Scenario: Native macOS distribution is packaged
- **WHEN** the native distribution tasks are executed for a supported macOS architecture
- **THEN** Gradle MUST produce a launchable `.app` bundle and a `.dmg` containing the matching Kotlin/Native executable and Compose resources.

### Requirement: Pilot sandbox provides Web launchers

`tokens/sdds.serv.compose/app` SHALL provide Kotlin/Wasm and Kotlin/JS browser executables that initialize the common SddsServ sandbox and render it into a full-window Compose viewport. Kotlin/Wasm SHALL be the primary Web variant; Kotlin/JS SHALL provide a separately buildable compatibility variant and SHALL NOT duplicate the sandbox UI.

#### Scenario: Wasm browser distribution is built
- **WHEN** the Web distribution task is executed
- **THEN** Gradle MUST produce browser assets containing the executable, Compose resources, HTML host, and required viewport styles.

#### Scenario: JS browser distribution is built
- **WHEN** the Kotlin/JS Web distribution task is executed
- **THEN** Gradle MUST produce a separately runnable JavaScript browser distribution containing the common sandbox, Compose resources, HTML host, and required viewport styles.

#### Scenario: Sandbox opens in a browser
- **WHEN** either the Wasm or Kotlin/JS development server opens the sandbox in a supported browser
- **THEN** the browser MUST display the component menu and allow opening and editing a component story using the common SddsServ sandbox root.

#### Scenario: Browser history follows sandbox navigation
- **WHEN** the user navigates between the menu and component routes in either Web variant and then uses browser Back or Forward
- **THEN** the common navigation state MUST follow browser history and the address MUST identify the active route.

### Requirement: Sandbox navigation adapts to the interaction model

The common sandbox root SHALL resolve exactly one of `Mobile` and `Large` layouts from the current window width on every supported target. Platform-specific behavior SHALL affect only the navigation panel inside `Large`: Android SHALL use focus-driven `Drawer` navigation, while iOS, JVM Desktop, native macOS, Kotlin/Wasm, and Kotlin/JS SHALL use a persistent navigation panel.

#### Scenario: Narrow window uses Mobile on every target
- **WHEN** the sandbox window width is below the expanded-width breakpoint on any supported target
- **THEN** the sandbox MUST render `Mobile` layout and MUST NOT render a desktop-specific or TV-specific layout.

#### Scenario: Mobile component story provides explicit back navigation
- **WHEN** `Mobile` layout displays a component story on any supported target
- **THEN** it MUST display a focusable and clickable back button that returns to the mobile component list.
- **AND** the back action MUST NOT depend on an Android or iOS system gesture.

#### Scenario: Mobile back closes nested property editor first
- **WHEN** a property editor is open inside the Mobile properties panel
- **AND** the user activates either the explicit Mobile back button or the platform system back action
- **THEN** the sandbox MUST return to the full properties list and MUST keep the component story open.
- **AND** both back entry points MUST use the same nested-back priority.
- **AND** only a subsequent explicit or system back action from the properties list MUST return to the component list.

#### Scenario: Large Android window uses focus-driven Drawer
- **WHEN** an Android sandbox window reaches the expanded-width breakpoint
- **THEN** the sandbox MUST render `Large` layout with a navigation `Drawer` that opens through focus and preserves the existing focus-navigation behavior.
- **AND** when the Drawer is closed, only its existing narrow peek strip MUST remain visible.
- **AND** the persistent properties panel MUST remain fully visible immediately after the peek strip without a blank or clipped area.
- **AND** when a choice property editor is open and its back button is focused, one Down action MUST move focus directly to the currently selected choice.

#### Scenario: Large iPad window uses persistent navigation
- **WHEN** an iOS sandbox window reaches the expanded-width breakpoint
- **THEN** the sandbox MUST render `Large` layout with the component navigation panel permanently visible beside story content and MUST NOT wrap that panel in a `Drawer`.

#### Scenario: Large desktop or Web window uses persistent navigation
- **WHEN** a JVM Desktop, native macOS, Kotlin/Wasm, or Kotlin/JS sandbox window reaches the expanded-width breakpoint
- **THEN** the sandbox MUST render `Large` layout with the component navigation panel permanently visible beside story content without focus or an explicit open action.

#### Scenario: Desktop window below the large breakpoint uses Mobile
- **WHEN** a desktop or Web window is resized below the expanded-width breakpoint
- **THEN** the sandbox MUST switch to the common `Mobile` layout instead of showing a desktop-specific menu button or drawer.

#### Scenario: Window crosses the common layout breakpoint
- **WHEN** a sandbox window is resized across the expanded-width breakpoint in either direction
- **THEN** the sandbox MUST switch between `Mobile` and `Large`, preserve the active component route, and update navigation transitions and component property presentation to match the resolved layout.

#### Scenario: Existing platform launchers use platform defaults
- **WHEN** Android, iOS, JVM Desktop, native macOS, Kotlin/Wasm, or Kotlin/JS starts the common sandbox root
- **THEN** the sandbox MUST obtain the large-navigation behavior from its platform implementation without requiring the launcher to force a mobile, TV, or desktop layout.

### Requirement: Platform launcher validation is target-specific

The pilot sandbox SHALL expose focused build and runtime validation for every enabled launcher, and validation results SHALL identify the Kotlin target that was actually compiled, linked, or executed.

#### Scenario: Native macOS dependencies are validated natively
- **WHEN** native macOS support is verified
- **THEN** validation MUST include a `macosArm64` compile or link task and a native application launch rather than only running the JVM launcher on macOS.

#### Scenario: Existing mobile launchers do not regress
- **WHEN** new desktop and Web launchers are added
- **THEN** the Android application and iOS framework launcher MUST continue to compile and render the common sandbox root.

### Requirement: SddsServ sandbox app is the pilot CMP app

`tokens/sdds.serv.compose/app` SHALL remain the first sandbox app migrated to the repository's Compose Multiplatform app convention and SHALL validate the sandbox KMP structure through Android, iOS, JVM Desktop, Kotlin/Native macOS, and Web platform entrypoints.

#### Scenario: Pilot app uses CMP app convention
- **WHEN** `tokens/sdds.serv.compose/app` is configured after migration
- **THEN** it MUST use the repository's CMP app convention rather than the Android-only sandbox app convention.

#### Scenario: Android pilot launches successfully
- **WHEN** the Android variant of `tokens/sdds.serv.compose/app` is installed and launched
- **THEN** it MUST display the sandbox component menu and allow opening at least one SddsServ component story.

#### Scenario: iOS pilot launcher remains available
- **WHEN** the iOS host builds and starts its framework-backed launcher
- **THEN** it MUST initialize and render the same common SddsServ sandbox root.

#### Scenario: Desktop and Web launchers use common app root
- **WHEN** JVM Desktop, native macOS, or Web starts its platform entrypoint
- **THEN** the launcher MUST initialize and render `SddsServSandboxApp` rather than duplicate the sandbox navigation or story UI in platform code.

#### Scenario: Common app initialization registers theme and stories
- **WHEN** the pilot sandbox app initializes
- **THEN** common initialization MUST register the SddsServ theme and the available core/generated stories before the sandbox UI renders them.

### Requirement: Existing Android sandbox apps are not migrated implicitly

The first implementation SHALL NOT require every existing `tokens/*/app` sandbox module to migrate to CMP in the same change.

#### Scenario: Non-pilot app remains Android-only
- **WHEN** a non-pilot token sandbox app is not included in the migration scope
- **THEN** its Android build MUST either remain compatible through Android wrappers or be left unchanged by this change.
