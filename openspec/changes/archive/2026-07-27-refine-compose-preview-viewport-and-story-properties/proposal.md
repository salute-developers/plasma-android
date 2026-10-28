## Why

Compose Preview Plugin корректно принимает `PreviewPayload` и применяет `example.props` через
существующие `PropertiesProducer`/`StateTransformer`, но browser host не знает, какие UiState
properties поддерживает выбранная story. Из-за этого React-клиент продолжает показывать controls
своей React story, которые могут не соответствовать Compose story и смешиваются с variation
controls DS Builder.

Кроме того, текущий Wasm viewport не задаёт layout-контракт: Compose content размещается от
начала canvas, empty state рисует служебный текст, а фактический canvas может оставаться белым
вместо фона, переданного в payload. Для встраиваемого preview plugin должен рендерить компонент
по центру viewport и после успешного payload закрашивать viewport значением
`surface.background`.

## What Changes

- В `integration-core:preview-contract` добавляется runtime-neutral, версионированное описание
  component story и поддерживаемых example properties.
- Property descriptor поддерживает string, boolean, int, float и single-choice controls,
  default value и варианты выбора.
- В `integration-core:preview-sdk-compose` descriptor строится из
  `story.propertiesProducer.getProperties(story.defaultState)`.
- Framework variation properties `UiState.variant` и `UiState.appearance`, а также properties с
  `enabled=false`, не публикуются как example controls.
- `ComposePreviewRuntime` предоставляет описание только зарегистрированных компонентов.
- `preview-compose-plugin` добавляет direct/`postMessage` describe bridge с корреляцией request
  и расширяет manifest соответствующими message types.
- До первого payload Wasm viewport остаётся прозрачным и не рисует служебный empty-state текст;
  после успешного payload он применяет `surface.background` и центрирует подготовленный story
  content по горизонтали и вертикали.
- Production browser tests проверяют применение payload background, центрирование, точный
  descriptor `BasicButtonStory` и изменение каждого поддержанного UiState property.

## Capabilities

### New Capabilities

- `preview-component-description`: language-neutral контракт описания story properties,
  необходимый preview host для построения controls.
- `compose-preview-story-description`: построение component descriptor из существующих Compose
  sandbox story contracts.
- `compose-preview-viewport`: отображение payload background и центрированного Compose content
  внутри plugin viewport.

### Modified Capabilities

- `compose-preview-browser-bridge`: получение component descriptor через direct API и
  коррелированные browser messages.

## Impact

- Затрагивается included build `integration-core`: `preview-contract`, `preview-sdk-compose` и
  `preview-compose-plugin`.
- `sandbox-core`, `sandbox-ksp` и `uikit-compose-fixtures` используются как source существующих
  property producers; изменение аннотаций story и ручное дублирование Button schema не
  требуется.
- Расширяется публичный Preview Protocol вспомогательными description models/schema без
  изменения структуры `PreviewPayload`.
- Расширяется внешний JavaScript/message API plugin и `payloadBridge` manifest.
- Поведение demo applications и `sandbox-compose` UI не меняется.
- Browser assembly применяет `PreviewSurface.background` ко всему Compose viewport после
  успешной подготовки payload; до первого payload viewport остаётся прозрачным.
- Публикация, подпись, plugin catalog, новые components и изменение component style factories не
  входят в scope.
