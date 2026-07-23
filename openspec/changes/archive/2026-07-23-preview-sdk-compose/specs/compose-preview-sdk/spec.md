## ADDED Requirements

### Requirement: Compose preview SDK prepares renderer-ready theme values

`integration-core:preview-sdk-compose` SHALL convert supported runtime-neutral theme values from `PreviewPayload` into Compose values without accessing DS Builder persistence models.

#### Scenario: Supported theme values are prepared
- **WHEN** a Compose payload contains color, dimension, shape, shadow, font-family and typography values
- **THEN** the SDK MUST prepare the corresponding Compose `Color`, `Dp`, shape, shadow, `FontFamily` and `TextStyle` values
- **AND** ordinary dimensions MUST use `dp`, while typography font size, line height and letter spacing MUST use `sp`.

#### Scenario: RGBA color is converted for Compose
- **WHEN** DS Builder supplies a color in `#RRGGBBAA` form
- **THEN** the SDK MUST preserve all channels and construct the equivalent Compose ARGB color.

#### Scenario: Unknown token is ignored
- **WHEN** a payload contains a token ID that is not consumed by the selected component style or typography
- **THEN** the SDK MUST ignore that token without failing the render.

### Requirement: Compose preview SDK loads runtime fonts before rendering

The SDK SHALL load required `.ttf` and `.otf` font assets as bytes, create Wasm/Skiko fonts with their declared weight and style, and assemble reusable Compose `FontFamily` instances before reporting a successful render.

#### Scenario: Font family is loaded from payload assets
- **WHEN** a font-family token references valid font face assets
- **THEN** the asset resolver MUST load every required face
- **AND** the SDK MUST create a Compose `FontFamily` containing the declared weights and styles
- **AND** typography referencing the token MUST use that family.

#### Scenario: Font is reused across payloads
- **WHEN** consecutive payloads reference a font face with the same digest or stable asset identity
- **THEN** the SDK MUST reuse cached bytes and prepared font objects instead of downloading the asset again.

#### Scenario: Required font cannot be loaded
- **WHEN** a required font asset is absent, invalid or cannot be loaded and no explicit fallback is available
- **THEN** the SDK MUST fail preparation and MUST NOT report the preview as successfully rendered.

### Requirement: BasicButton style is built from effective component properties

The `preview-compose-plugin` assembly SHALL provide a hand-written `BasicButtonPreviewStyleFactory` that builds a `ButtonStyle` through the UIKit builder API using effective properties from `PreviewComponent` and prepared theme lookups.

#### Scenario: Button style uses literal and token values
- **WHEN** Button properties contain supported literals and token references for colors, dimensions, typography, shape or primitive builder values
- **THEN** the factory MUST apply resolved values to the matching root, `colors` or `dimensions` builder methods.

#### Scenario: Button style uses interactive values
- **WHEN** a supported Button property contains base and interaction-state values
- **THEN** the factory MUST build the corresponding UIKit stateful or interactive value for those states.

#### Scenario: Unknown Button property is ignored
- **WHEN** the payload contains a property that is not supported by `BasicButtonPreviewStyleFactory`
- **THEN** the factory MUST ignore it and allow the builder default to remain in effect.

### Requirement: Compose preview reuses sandbox stories

The SDK SHALL select the existing story by `ComponentKey.value`, derive state from its default state and runtime example props, and invoke its existing Compose `Content` renderer with the prepared style.

#### Scenario: BasicButton story is rendered
- **WHEN** `PreviewComponent.id` equals the registered BasicButton `ComponentKey.value`
- **THEN** the runtime MUST resolve the existing BasicButton story
- **AND** it MUST render `Content` with the dynamically prepared `ButtonStyle` and state.

#### Scenario: Runtime props update default state
- **WHEN** `PreviewExample.props` contains supported properties
- **THEN** the runtime MUST apply them through the existing `PropertiesProducer` and `StateTransformer` contracts before rendering.

#### Scenario: Unknown runtime prop is ignored
- **WHEN** `PreviewExample.props` contains an unknown property or a value incompatible with the known property type
- **THEN** the runtime MUST preserve the corresponding default state value and continue rendering.

### Requirement: Compose preview PoC executes in Wasm

The change SHALL include a minimal `wasmJs` executable or browser test fixture that validates the complete Button preview path from serialized payload to rendered Compose content.

#### Scenario: Full Wasm render succeeds
- **WHEN** the PoC receives a valid Compose payload and accessible font assets
- **THEN** it MUST deserialize the payload, load fonts, prepare the theme, build `ButtonStyle`, apply example props and render BasicButton in a browser Compose viewport.

#### Scenario: A new full payload updates preview
- **WHEN** the PoC receives another full payload without reloading the application
- **THEN** it MUST update the prepared style and state and recompose the preview.

### Requirement: Compose preview plugin is self-contained

The change SHALL produce a browser-ready plugin artifact containing its HTML shell, manifest,
JavaScript, Wasm and Compose/Skiko runtime resources.

#### Scenario: Production artifact is assembled
- **WHEN** the plugin artifact Gradle task completes
- **THEN** it MUST produce one zip containing all files required to serve the preview
- **AND** the HTML shell MUST start the Wasm application without an external application bundle.

#### Scenario: Host submits a payload
- **WHEN** the HTML shell receives a full payload through its direct API or message bridge
- **THEN** it MUST forward the serialized payload to the running Compose preview runtime.

#### Scenario: Runtime asset is loaded
- **WHEN** a payload references an HTTP-accessible TTF or OTF asset
- **THEN** the plugin MUST download its bytes through the browser and pass them to theme preparation.
