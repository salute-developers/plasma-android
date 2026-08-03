## MODIFIED Requirements

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
