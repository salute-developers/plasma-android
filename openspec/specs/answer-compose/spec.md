# answer-compose Specification

## Purpose
TBD - created by archiving change ai-answer-compose. Update Purpose after archive.
## Requirements
### Requirement: AiAnswer SHALL provide public Compose API in AI package
`AiAnswer` SHALL be a public Compose component for rendering LLM answer UI. Runtime APIs for the component SHALL be exposed from `com.sdds.compose.uikit.ai`, while implementation details SHALL remain internal.

#### Scenario: Consumer imports AiAnswer public API
- **WHEN** a consumer uses `AiAnswer`, `AiAnswerState`, `AiAnswerStyle`, `AiAnswerColors`, `AiAnswerDimensions`, `AiAnswerStyleBuilder`, or `LocalAiAnswerStyle`
- **THEN** those APIs MUST be available from `com.sdds.compose.uikit.ai`

#### Scenario: Internal helpers are not public AI API
- **WHEN** `AiAnswer` uses helper layouts, adapters, or default state renderers
- **THEN** those helpers MUST live under `com.sdds.compose.uikit.internal`

### Requirement: AiAnswer SHALL use AiAnswerState for semantic state
`AiAnswer` SHALL expose `AiAnswerState : ValueState` with `Default`, `Error`, and `Loading` values. `AiAnswerState` SHALL select the rendered branch and SHALL participate in style and motion resolution.

#### Scenario: Default state renders answer branch
- **WHEN** `AiAnswer` is rendered with `state = AiAnswerState.Default`
- **THEN** it MUST render the default answer branch for title, content, actions, and suggestions

#### Scenario: Loading state renders loading branch
- **WHEN** `AiAnswer` is rendered with `state = AiAnswerState.Loading`
- **THEN** it MUST render the loading branch instead of the default answer branch

#### Scenario: Error state renders error branch
- **WHEN** `AiAnswer` is rendered with `state = AiAnswerState.Error`
- **THEN** it MUST render the error branch instead of the default answer branch

#### Scenario: State participates in visual resolution
- **WHEN** `AiAnswer` resolves stateful style or motion values
- **THEN** the current `AiAnswerState` MUST be included in the state set or motion context

### Requirement: AiAnswer SHALL keep title and body content slot-based
`AiAnswer` SHALL accept optional `title` and `content` composable slots for default answer rendering. It SHALL NOT parse or transform LLM-specific content formats.

#### Scenario: Title slot renders in default branch
- **WHEN** `AiAnswer` is in `Default` state and caller provides `title`
- **THEN** the title slot MUST be rendered in the default answer layout

#### Scenario: Content slot renders in default branch
- **WHEN** `AiAnswer` is in `Default` state and caller provides `content`
- **THEN** the content slot MUST be rendered as the answer body

#### Scenario: Missing content is allowed
- **WHEN** `AiAnswer` is rendered without `content`
- **THEN** it MUST remain valid and render only the provided areas or an empty content area according to style and layout rules

#### Scenario: AiAnswer does not parse markdown
- **WHEN** caller needs markdown, rich text, streaming text, citations, or other LLM-specific rendering
- **THEN** caller MUST provide that renderer inside the content slot and `AiAnswer` MUST NOT parse or transform it

### Requirement: AiAnswer SHALL provide structured action slots
`AiAnswer` SHALL provide `actionsStart` and `actionsEnd` slots using `ButtonGroupScope`. Each action slot SHALL be rendered inside its own `ButtonGroup`.

#### Scenario: Start actions render inside ButtonGroup
- **WHEN** caller provides `actionsStart`
- **THEN** `AiAnswer` MUST render it inside a `ButtonGroup`

#### Scenario: End actions render inside ButtonGroup
- **WHEN** caller provides `actionsEnd`
- **THEN** `AiAnswer` MUST render it inside a separate `ButtonGroup`

#### Scenario: Action slots expose ButtonGroupScope
- **WHEN** caller defines `actionsStart` or `actionsEnd`
- **THEN** the slot receiver MUST be `ButtonGroupScope`

#### Scenario: Missing action slot does not reserve action group
- **WHEN** `actionsStart` or `actionsEnd` is not provided
- **THEN** `AiAnswer` MUST NOT render the corresponding `ButtonGroup` unless style explicitly requires reserved space

### Requirement: AiAnswer SHALL provide structured suggestions slot
`AiAnswer` SHALL provide a `suggestions` slot using `FlowRowScope`. The suggestions slot SHALL be rendered inside `ChipGroup`.

#### Scenario: Suggestions render inside ChipGroup
- **WHEN** caller provides `suggestions`
- **THEN** `AiAnswer` MUST render the suggestions inside `ChipGroup`

#### Scenario: Suggestions slot exposes FlowRowScope
- **WHEN** caller defines `suggestions`
- **THEN** the slot receiver MUST be `FlowRowScope`

#### Scenario: Missing suggestions do not render ChipGroup
- **WHEN** caller does not provide `suggestions`
- **THEN** `AiAnswer` MUST NOT render `ChipGroup`

### Requirement: Loading branch SHALL support default and custom rendering
`AiAnswer` SHALL support a custom loading slot scoped by `AiAnswerLoadingScope`. If no custom loading slot is provided, `AiAnswer` SHALL render default loading content with `Spinner`.

#### Scenario: Default loading renders Spinner
- **WHEN** `state = AiAnswerState.Loading` and no custom loading slot is provided
- **THEN** `AiAnswer` MUST render default loading content using `Spinner`

#### Scenario: Custom loading overrides default loading
- **WHEN** `state = AiAnswerState.Loading` and caller provides a custom loading slot
- **THEN** `AiAnswer` MUST render the custom loading slot instead of default loading content

#### Scenario: Loading scope exposes helper
- **WHEN** custom loading content is rendered
- **THEN** the slot receiver MUST be `AiAnswerLoadingScope` and MUST provide access to an `AiAnswerLoading` helper for default loading rendering

#### Scenario: Loading branch hides default answer areas
- **WHEN** `state = AiAnswerState.Loading`
- **THEN** `AiAnswer` MUST NOT render default title, content, actions, or suggestions areas

### Requirement: Error branch SHALL support default and custom rendering
`AiAnswer` SHALL support a custom error slot scoped by `AiAnswerErrorScope`. If no custom error slot is provided, `AiAnswer` SHALL render default error content using `Note`.

#### Scenario: Default error renders Note
- **WHEN** `state = AiAnswerState.Error` and no custom error slot is provided
- **THEN** `AiAnswer` MUST render default error content using `Note`

#### Scenario: Custom error overrides default error
- **WHEN** `state = AiAnswerState.Error` and caller provides a custom error slot
- **THEN** `AiAnswer` MUST render the custom error slot instead of default error content

#### Scenario: Error scope exposes helper
- **WHEN** custom error content is rendered
- **THEN** the slot receiver MUST be `AiAnswerErrorScope` and MUST provide access to an `AiAnswerError` helper for default Note-based rendering

#### Scenario: Error branch hides default answer areas
- **WHEN** `state = AiAnswerState.Error`
- **THEN** `AiAnswer` MUST NOT render default title, content, actions, or suggestions areas

### Requirement: AiAnswer scopes SHALL expose state style and motion
Specialized AiAnswer scopes SHALL expose the current state, style, and motion so custom loading and error content can remain aligned with the parent component.

#### Scenario: Error scope exposes context
- **WHEN** content is rendered in `AiAnswerErrorScope`
- **THEN** the scope MUST expose current `AiAnswerState`, `AiAnswerStyle`, and `Motion<AiAnswerMotionStyle>`

#### Scenario: Loading scope exposes context
- **WHEN** content is rendered in `AiAnswerLoadingScope`
- **THEN** the scope MUST expose current `AiAnswerState`, `AiAnswerStyle`, and `Motion<AiAnswerMotionStyle>`

### Requirement: AiAnswerStyle SHALL define all visual values as stateful
`AiAnswerStyle` SHALL define visual style properties as non-null `StatefulValue<T>`. Color-like properties SHALL use `StatefulValue<Brush>`.

#### Scenario: Colors are brush-based stateful values
- **WHEN** `AiAnswerStyle` defines a background, text, icon, or other color-like property
- **THEN** that property MUST be represented as `StatefulValue<Brush>`

#### Scenario: Typography is stateful
- **WHEN** `AiAnswerStyle` defines typography for title, loading text, or other text rendered by AiAnswer
- **THEN** that property MUST be represented as `StatefulValue<TextStyle>`

#### Scenario: Dimensions are stateful
- **WHEN** `AiAnswerStyle` defines spacing, padding, or size values
- **THEN** those values MUST be represented as non-null stateful values

#### Scenario: Style builder provides convenient overloads
- **WHEN** a caller configures `AiAnswerStyle`
- **THEN** the builder MUST provide overloads for stateful values and convenient plain values such as `Brush`, `Color`, `InteractiveColor`, `TextStyle`, and `Dp` where applicable

### Requirement: AiAnswerStyle SHALL provide nested component styles
`AiAnswerStyle` SHALL provide non-null nested styles for components that `AiAnswer` creates internally.

#### Scenario: Error Note uses AiAnswer style
- **WHEN** `AiAnswer` renders default error content
- **THEN** the internal `Note` MUST use `AiAnswerStyle.noteStyle`

#### Scenario: Loading Spinner uses AiAnswer style
- **WHEN** `AiAnswer` renders default loading content
- **THEN** the internal `Spinner` MUST use `AiAnswerStyle.loadingSpinnerStyle`

#### Scenario: Start actions ButtonGroup uses AiAnswer style
- **WHEN** `AiAnswer` renders `actionsStart`
- **THEN** the wrapping `ButtonGroup` MUST use the corresponding start actions `ButtonGroupStyle` from `AiAnswerStyle`

#### Scenario: End actions ButtonGroup uses AiAnswer style
- **WHEN** `AiAnswer` renders `actionsEnd`
- **THEN** the wrapping `ButtonGroup` MUST use the corresponding end actions `ButtonGroupStyle` from `AiAnswerStyle`

#### Scenario: Suggestions ChipGroup uses AiAnswer style
- **WHEN** `AiAnswer` renders `suggestions`
- **THEN** the wrapping `ChipGroup` MUST use the suggestions `ChipGroupStyle` from `AiAnswerStyle`

### Requirement: AiAnswerMotionStyle SHALL live in AI motion package
`AiAnswerMotionStyle`, `AiAnswerMotionStyleBuilder`, `LocalAiAnswerMotionStyle`, and `rememberAiAnswerMotion(...)` SHALL be public API under `com.sdds.compose.uikit.ai.motion`.

#### Scenario: Consumer imports AiAnswer motion API
- **WHEN** a consumer uses AiAnswer motion APIs
- **THEN** those APIs MUST be available from `com.sdds.compose.uikit.ai.motion`

#### Scenario: Motion supports dimensions
- **WHEN** dimension values change across `AiAnswerState`
- **THEN** `AiAnswerMotionStyle` MUST support corresponding dimension motion properties

#### Scenario: Motion supports brushes
- **WHEN** brush values change across `AiAnswerState`
- **THEN** `AiAnswerMotionStyle` MUST support corresponding `MotionProperty<Brush>` values

#### Scenario: Motion supports text styles
- **WHEN** text style values change across `AiAnswerState`
- **THEN** `AiAnswerMotionStyle` MUST support corresponding `MotionProperty<TextStyle>` values

#### Scenario: Unsupported property types are excluded
- **WHEN** a style property is not a dimension, `Brush`, or `TextStyle`
- **THEN** the first version of `AiAnswerMotionStyle` MUST NOT expose a motion property for it

### Requirement: Theme Builder SHALL generate AiAnswer Compose styles
Theme Builder in `sdds-core/plugin_theme_builder` SHALL support generation of Compose `AiAnswerStyle` from token configuration.

#### Scenario: Generator emits AiAnswerStyle
- **WHEN** token configuration contains AiAnswer variations
- **THEN** Theme Builder MUST generate Compose code that creates `AiAnswerStyle`

#### Scenario: Generated visual values are stateful
- **WHEN** Theme Builder generates AiAnswer visual properties
- **THEN** generated values MUST use non-null `StatefulValue<T>` contracts

#### Scenario: Generated colors are brush-based
- **WHEN** Theme Builder generates AiAnswer color-like properties
- **THEN** generated values MUST use `StatefulValue<Brush>`

#### Scenario: Generated nested styles are wired
- **WHEN** Theme Builder generates `AiAnswerStyle`
- **THEN** generated code MUST configure or default nested `NoteStyle`, `SpinnerStyle`, action `ButtonGroupStyle` values, and suggestions `ChipGroupStyle`

### Requirement: AiAnswer SHALL provide fixtures and documentation
`AiAnswer` SHALL include Compose fixtures, samples, and documentation for the supported states and customization points.

#### Scenario: Default samples exist
- **WHEN** developers inspect AiAnswer fixtures or docs
- **THEN** examples MUST include `Default` state with title, content, actions, and suggestions

#### Scenario: Loading samples exist
- **WHEN** developers inspect AiAnswer fixtures or docs
- **THEN** examples MUST include default loading and custom loading slot usage

#### Scenario: Error samples exist
- **WHEN** developers inspect AiAnswer fixtures or docs
- **THEN** examples MUST include default Note-based error and custom error slot usage

#### Scenario: Documentation explains slot ownership
- **WHEN** developers read AiAnswer documentation
- **THEN** it MUST state that AiAnswer does not parse markdown or own LLM/action/suggestion data models

