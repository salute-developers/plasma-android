## ADDED Requirements

### Requirement: Answer SHALL provide public Compose API in AI package
`Answer` SHALL be a public Compose component for rendering LLM answer UI. Runtime APIs for the component SHALL be exposed from `com.sdds.compose.uikit.ai`, while implementation details SHALL remain internal.

#### Scenario: Consumer imports Answer public API
- **WHEN** a consumer uses `Answer`, `AnswerState`, `AnswerStyle`, `AnswerColors`, `AnswerDimensions`, `AnswerStyleBuilder`, or `LocalAnswerStyle`
- **THEN** those APIs MUST be available from `com.sdds.compose.uikit.ai`

#### Scenario: Internal helpers are not public AI API
- **WHEN** `Answer` uses helper layouts, adapters, or default state renderers
- **THEN** those helpers MUST live under `com.sdds.compose.uikit.internal`

### Requirement: Answer SHALL use AnswerState for semantic state
`Answer` SHALL expose `AnswerState : ValueState` with `Default`, `Error`, and `Loading` values. `AnswerState` SHALL select the rendered branch and SHALL participate in style and motion resolution.

#### Scenario: Default state renders answer branch
- **WHEN** `Answer` is rendered with `state = AnswerState.Default`
- **THEN** it MUST render the default answer branch for title, content, actions, and suggestions

#### Scenario: Loading state renders loading branch
- **WHEN** `Answer` is rendered with `state = AnswerState.Loading`
- **THEN** it MUST render the loading branch instead of the default answer branch

#### Scenario: Error state renders error branch
- **WHEN** `Answer` is rendered with `state = AnswerState.Error`
- **THEN** it MUST render the error branch instead of the default answer branch

#### Scenario: State participates in visual resolution
- **WHEN** `Answer` resolves stateful style or motion values
- **THEN** the current `AnswerState` MUST be included in the state set or motion context

### Requirement: Answer SHALL keep title and body content slot-based
`Answer` SHALL accept optional `title` and `content` composable slots for default answer rendering. It SHALL NOT parse or transform LLM-specific content formats.

#### Scenario: Title slot renders in default branch
- **WHEN** `Answer` is in `Default` state and caller provides `title`
- **THEN** the title slot MUST be rendered in the default answer layout

#### Scenario: Content slot renders in default branch
- **WHEN** `Answer` is in `Default` state and caller provides `content`
- **THEN** the content slot MUST be rendered as the answer body

#### Scenario: Missing content is allowed
- **WHEN** `Answer` is rendered without `content`
- **THEN** it MUST remain valid and render only the provided areas or an empty content area according to style and layout rules

#### Scenario: Answer does not parse markdown
- **WHEN** caller needs markdown, rich text, streaming text, citations, or other LLM-specific rendering
- **THEN** caller MUST provide that renderer inside the content slot and `Answer` MUST NOT parse or transform it

### Requirement: Answer SHALL provide structured action slots
`Answer` SHALL provide `actionsStart` and `actionsEnd` slots using `ButtonGroupScope`. Each action slot SHALL be rendered inside its own `ButtonGroup`.

#### Scenario: Start actions render inside ButtonGroup
- **WHEN** caller provides `actionsStart`
- **THEN** `Answer` MUST render it inside a `ButtonGroup`

#### Scenario: End actions render inside ButtonGroup
- **WHEN** caller provides `actionsEnd`
- **THEN** `Answer` MUST render it inside a separate `ButtonGroup`

#### Scenario: Action slots expose ButtonGroupScope
- **WHEN** caller defines `actionsStart` or `actionsEnd`
- **THEN** the slot receiver MUST be `ButtonGroupScope`

#### Scenario: Missing action slot does not reserve action group
- **WHEN** `actionsStart` or `actionsEnd` is not provided
- **THEN** `Answer` MUST NOT render the corresponding `ButtonGroup` unless style explicitly requires reserved space

### Requirement: Answer SHALL provide structured suggestions slot
`Answer` SHALL provide a `suggestions` slot using `FlowRowScope`. The suggestions slot SHALL be rendered inside `ChipGroup`.

#### Scenario: Suggestions render inside ChipGroup
- **WHEN** caller provides `suggestions`
- **THEN** `Answer` MUST render the suggestions inside `ChipGroup`

#### Scenario: Suggestions slot exposes FlowRowScope
- **WHEN** caller defines `suggestions`
- **THEN** the slot receiver MUST be `FlowRowScope`

#### Scenario: Missing suggestions do not render ChipGroup
- **WHEN** caller does not provide `suggestions`
- **THEN** `Answer` MUST NOT render `ChipGroup`

### Requirement: Loading branch SHALL support default and custom rendering
`Answer` SHALL support a custom loading slot scoped by `AnswerLoadingScope`. If no custom loading slot is provided, `Answer` SHALL render default loading content with `Spinner`.

#### Scenario: Default loading renders Spinner
- **WHEN** `state = AnswerState.Loading` and no custom loading slot is provided
- **THEN** `Answer` MUST render default loading content using `Spinner`

#### Scenario: Custom loading overrides default loading
- **WHEN** `state = AnswerState.Loading` and caller provides a custom loading slot
- **THEN** `Answer` MUST render the custom loading slot instead of default loading content

#### Scenario: Loading scope exposes helper
- **WHEN** custom loading content is rendered
- **THEN** the slot receiver MUST be `AnswerLoadingScope` and MUST provide access to an `AnswerLoading` helper for default loading rendering

#### Scenario: Loading branch hides default answer areas
- **WHEN** `state = AnswerState.Loading`
- **THEN** `Answer` MUST NOT render default title, content, actions, or suggestions areas

### Requirement: Error branch SHALL support default and custom rendering
`Answer` SHALL support a custom error slot scoped by `AnswerErrorScope`. If no custom error slot is provided, `Answer` SHALL render default error content using `Note`.

#### Scenario: Default error renders Note
- **WHEN** `state = AnswerState.Error` and no custom error slot is provided
- **THEN** `Answer` MUST render default error content using `Note`

#### Scenario: Custom error overrides default error
- **WHEN** `state = AnswerState.Error` and caller provides a custom error slot
- **THEN** `Answer` MUST render the custom error slot instead of default error content

#### Scenario: Error scope exposes helper
- **WHEN** custom error content is rendered
- **THEN** the slot receiver MUST be `AnswerErrorScope` and MUST provide access to an `AnswerError` helper for default Note-based rendering

#### Scenario: Error branch hides default answer areas
- **WHEN** `state = AnswerState.Error`
- **THEN** `Answer` MUST NOT render default title, content, actions, or suggestions areas

### Requirement: Answer scopes SHALL expose state style and motion
Specialized Answer scopes SHALL expose the current state, style, and motion so custom loading and error content can remain aligned with the parent component.

#### Scenario: Error scope exposes context
- **WHEN** content is rendered in `AnswerErrorScope`
- **THEN** the scope MUST expose current `AnswerState`, `AnswerStyle`, and `Motion<AnswerMotionStyle>`

#### Scenario: Loading scope exposes context
- **WHEN** content is rendered in `AnswerLoadingScope`
- **THEN** the scope MUST expose current `AnswerState`, `AnswerStyle`, and `Motion<AnswerMotionStyle>`

### Requirement: AnswerStyle SHALL define all visual values as stateful
`AnswerStyle` SHALL define visual style properties as non-null `StatefulValue<T>`. Color-like properties SHALL use `StatefulValue<Brush>`.

#### Scenario: Colors are brush-based stateful values
- **WHEN** `AnswerStyle` defines a background, text, icon, or other color-like property
- **THEN** that property MUST be represented as `StatefulValue<Brush>`

#### Scenario: Typography is stateful
- **WHEN** `AnswerStyle` defines typography for title, loading text, or other text rendered by Answer
- **THEN** that property MUST be represented as `StatefulValue<TextStyle>`

#### Scenario: Dimensions are stateful
- **WHEN** `AnswerStyle` defines spacing, padding, or size values
- **THEN** those values MUST be represented as non-null stateful values

#### Scenario: Style builder provides convenient overloads
- **WHEN** a caller configures `AnswerStyle`
- **THEN** the builder MUST provide overloads for stateful values and convenient plain values such as `Brush`, `Color`, `InteractiveColor`, `TextStyle`, and `Dp` where applicable

### Requirement: AnswerStyle SHALL provide nested component styles
`AnswerStyle` SHALL provide non-null nested styles for components that `Answer` creates internally.

#### Scenario: Error Note uses Answer style
- **WHEN** `Answer` renders default error content
- **THEN** the internal `Note` MUST use `AnswerStyle.noteStyle`

#### Scenario: Loading Spinner uses Answer style
- **WHEN** `Answer` renders default loading content
- **THEN** the internal `Spinner` MUST use `AnswerStyle.loadingSpinnerStyle`

#### Scenario: Start actions ButtonGroup uses Answer style
- **WHEN** `Answer` renders `actionsStart`
- **THEN** the wrapping `ButtonGroup` MUST use the corresponding start actions `ButtonGroupStyle` from `AnswerStyle`

#### Scenario: End actions ButtonGroup uses Answer style
- **WHEN** `Answer` renders `actionsEnd`
- **THEN** the wrapping `ButtonGroup` MUST use the corresponding end actions `ButtonGroupStyle` from `AnswerStyle`

#### Scenario: Suggestions ChipGroup uses Answer style
- **WHEN** `Answer` renders `suggestions`
- **THEN** the wrapping `ChipGroup` MUST use the suggestions `ChipGroupStyle` from `AnswerStyle`

### Requirement: AnswerMotionStyle SHALL live in AI motion package
`AnswerMotionStyle`, `AnswerMotionStyleBuilder`, `LocalAnswerMotionStyle`, and `rememberAnswerMotion(...)` SHALL be public API under `com.sdds.compose.uikit.ai.motion`.

#### Scenario: Consumer imports Answer motion API
- **WHEN** a consumer uses Answer motion APIs
- **THEN** those APIs MUST be available from `com.sdds.compose.uikit.ai.motion`

#### Scenario: Motion supports dimensions
- **WHEN** dimension values change across `AnswerState`
- **THEN** `AnswerMotionStyle` MUST support corresponding dimension motion properties

#### Scenario: Motion supports brushes
- **WHEN** brush values change across `AnswerState`
- **THEN** `AnswerMotionStyle` MUST support corresponding `MotionProperty<Brush>` values

#### Scenario: Motion supports text styles
- **WHEN** text style values change across `AnswerState`
- **THEN** `AnswerMotionStyle` MUST support corresponding `MotionProperty<TextStyle>` values

#### Scenario: Unsupported property types are excluded
- **WHEN** a style property is not a dimension, `Brush`, or `TextStyle`
- **THEN** the first version of `AnswerMotionStyle` MUST NOT expose a motion property for it

### Requirement: Theme Builder SHALL generate Answer Compose styles
Theme Builder in `sdds-core/plugin_theme_builder` SHALL support generation of Compose `AnswerStyle` from token configuration.

#### Scenario: Generator emits AnswerStyle
- **WHEN** token configuration contains Answer variations
- **THEN** Theme Builder MUST generate Compose code that creates `AnswerStyle`

#### Scenario: Generated visual values are stateful
- **WHEN** Theme Builder generates Answer visual properties
- **THEN** generated values MUST use non-null `StatefulValue<T>` contracts

#### Scenario: Generated colors are brush-based
- **WHEN** Theme Builder generates Answer color-like properties
- **THEN** generated values MUST use `StatefulValue<Brush>`

#### Scenario: Generated nested styles are wired
- **WHEN** Theme Builder generates `AnswerStyle`
- **THEN** generated code MUST configure or default nested `NoteStyle`, `SpinnerStyle`, action `ButtonGroupStyle` values, and suggestions `ChipGroupStyle`

### Requirement: Answer SHALL provide fixtures and documentation
`Answer` SHALL include Compose fixtures, samples, and documentation for the supported states and customization points.

#### Scenario: Default samples exist
- **WHEN** developers inspect Answer fixtures or docs
- **THEN** examples MUST include `Default` state with title, content, actions, and suggestions

#### Scenario: Loading samples exist
- **WHEN** developers inspect Answer fixtures or docs
- **THEN** examples MUST include default loading and custom loading slot usage

#### Scenario: Error samples exist
- **WHEN** developers inspect Answer fixtures or docs
- **THEN** examples MUST include default Note-based error and custom error slot usage

#### Scenario: Documentation explains slot ownership
- **WHEN** developers read Answer documentation
- **THEN** it MUST state that Answer does not parse markdown or own LLM/action/suggestion data models
