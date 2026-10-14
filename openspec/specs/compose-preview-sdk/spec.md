# compose-preview-sdk Specification

## Purpose
TBD - created by archiving change preview-sdk-compose. Update Purpose after archive.
## Requirements
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

### Requirement: Compose preview reuses sandbox stories

The SDK SHALL select the existing story by `ComponentKey.value` of any registered component, derive state from its default state and runtime example props, and invoke its existing Compose `Content` renderer with the prepared style.

#### Scenario: Registered story is rendered
- **WHEN** `PreviewComponent.id` equals the `ComponentKey.value` of a story registered in the preview registry
- **THEN** the runtime MUST resolve the existing story
- **AND** it MUST render `Content` with the style built by the generated factory with the same `componentId` and the prepared state.

#### Scenario: Unregistered component
- **WHEN** `PreviewComponent.id` is not in the preview registry
- **THEN** the runtime MUST return `PreviewResult.Failure` with code `component_not_found`.

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

### Requirement: SDK разрешает значения Preview Protocol v1

SDK SHALL разрешать source каждого свойства в Compose-значение: применять `alpha` к цвету, превращать gradient token в `Brush`, учитывать `spread` тени и выбирать запись `states` по набору активных состояний. При нескольких подходящих записях SDK MUST выбирать запись с наибольшим числом имён в `when`, а при равенстве последнюю.

#### Scenario: Выбор записи по набору состояний

- **WHEN** активны `pressed` и `selected`, а `states` содержит записи для `["pressed"]` и `["pressed", "selected"]`
- **THEN** SDK MUST использовать запись `["pressed", "selected"]`

#### Scenario: Alpha применён к токену цвета

- **WHEN** source `tokenRef` на цвет содержит `alpha: 0.5`
- **THEN** итоговый Compose `Color` MUST иметь альфа-канал, умноженный на 0.5

#### Scenario: Gradient token

- **WHEN** токен темы имеет тип `gradient` с линейным слоем
- **THEN** SDK MUST подготовить линейный `Brush` с заданными углом и stops

### Requirement: SDK проверяет граф вложенных стилей

Перед построением стиля SDK SHALL проверить все `styleRef` и `assetRef`. SDK MUST вернуть failure с кодом `unknown_style_ref` для отсутствующего стиля, `style_ref_cycle` для цикла и `unknown_asset_ref` для отсутствующего ресурса, и MUST NOT отрисовывать частичный результат.

#### Scenario: Цикл стилей

- **WHEN** стиль прямо или через другие стили ссылается сам на себя
- **THEN** SDK MUST вернуть failure с кодом `style_ref_cycle` и путём к ссылке

#### Scenario: Отсутствующий стиль

- **WHEN** `styleRef` указывает на ключ, которого нет в `styles`
- **THEN** SDK MUST вернуть failure с кодом `unknown_style_ref`

#### Scenario: Ресурс не поддержан для отрисовки

- **WHEN** `assetRef` указывает на SVG либо PNG, а SDK пока не умеет создавать painter
- **THEN** SDK MUST вернуть success с предупреждением `unsupported_asset`

### Requirement: Story имеет владельца состояния в preview

Preview runtime SHALL подключать к story локального владельца состояния на время показа payload. Нажатие внутри
preview, меняющее состояние story (`CheckBox`, `Switch`, `Accordion`), MUST менять отображаемое состояние
и MUST NOT приводить к исключению.

#### Scenario: Нажатие на CheckBox в preview

- **WHEN** пользователь нажимает на `CheckBox`, нарисованный плагином
- **THEN** состояние story MUST измениться и отображаться
- **AND** plugin MUST продолжать принимать следующие payload.

#### Scenario: Владелец не переживает payload

- **WHEN** plugin показывает следующий payload
- **THEN** состояние предыдущего payload MUST NOT переноситься в новый.

