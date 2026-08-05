## ADDED Requirements

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

The common sandbox root SHALL accept an explicit navigation policy so platform launchers can select TV focus navigation, pointer-oriented desktop navigation, or the existing touch/automatic behavior without inferring the interaction model solely from window width.

#### Scenario: Android TV drawer opens by focus
- **WHEN** the sandbox uses the TV navigation policy
- **THEN** moving focus to the left navigation peek area MUST open the drawer and moving focus away MUST preserve the existing TV focus behavior.

#### Scenario: Wide pointer window has persistent navigation
- **WHEN** JVM, native macOS, or Web uses the desktop navigation policy and the window is at least the persistent-navigation breakpoint
- **THEN** the component navigation panel MUST remain visible beside the selected story content without requiring focus or an open action.

#### Scenario: Narrow pointer window opens navigation explicitly
- **WHEN** JVM, native macOS, or Web uses the desktop navigation policy below the persistent-navigation breakpoint
- **THEN** the UI MUST provide an explicit button that opens and closes navigation and MUST NOT open the panel merely because it receives focus.

#### Scenario: Window crosses desktop breakpoint
- **WHEN** a pointer-oriented sandbox window is resized across the persistent-navigation breakpoint
- **THEN** the layout MUST switch between persistent and explicit drawer navigation while preserving the active component route.

#### Scenario: Existing launchers retain a compatible default
- **WHEN** an existing Android sandbox consumer calls the common root without specifying a new navigation policy
- **THEN** the sandbox MUST retain a backward-compatible automatic layout policy.

### Requirement: Platform launcher validation is target-specific

The pilot sandbox SHALL expose focused build and runtime validation for every enabled launcher, and validation results SHALL identify the Kotlin target that was actually compiled, linked, or executed.

#### Scenario: Native macOS dependencies are validated natively
- **WHEN** native macOS support is verified
- **THEN** validation MUST include a `macosArm64` compile or link task and a native application launch rather than only running the JVM launcher on macOS.

#### Scenario: Existing mobile launchers do not regress
- **WHEN** new desktop and Web launchers are added
- **THEN** the Android application and iOS framework launcher MUST continue to compile and render the common sandbox root.

## MODIFIED Requirements

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
- **WHEN** any pilot sandbox launcher initializes
- **THEN** common initialization MUST register the SddsServ theme and the available core/generated stories before the sandbox UI renders them.
