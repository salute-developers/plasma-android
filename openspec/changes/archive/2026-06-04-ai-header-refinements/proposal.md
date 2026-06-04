## Why

После первичной реализации `AiHeader` выявлены несколько несоответствий именования и ограничений API: имена полей `hasStartButton`/`hasEndButton` в `AiHeaderUiState` не отражают семантику слотов, флаг `hasDivider: Boolean` недостаточно выразителен для расширения, в слотах поддерживается стилизация только одиночной кнопки — без поддержки группы кнопок.

## What Changes

- **BREAKING** Переименовать `hasStartButton` → `hasActionBefore`, `hasEndButton` → `hasActionAfter` в `AiHeaderUiState` и связанных производителях/трансформерах в `integration-core/uikit-compose-fixtures`.
- **BREAKING** Заменить параметр `hasDivider: Boolean` в `AiHeader` на `separationType: SeparationType` (enum с вариантами `Divider`, `None`; дефолт `None`).
- **BREAKING** Переименовать `titleAlignment: AiHeaderTitleAlignment` → `titleAlign: TitleAlign` в `AiHeaderUiState`; ввести локальный enum `TitleAlign` без значения `End` (только `Start`, `Center`); при передаче в компонент маппить в `AiHeaderTitleAlignment`.
- Добавить поддержку стилизации группы кнопок в слотах: в `AiHeaderStyle` добавить поля `startButtonGroupStyle: ButtonGroupStyle` и `endButtonGroupStyle: ButtonGroupStyle`; в `AiHeader` провайдить соответствующий стиль через `LocalIconButtonGroupStyle`; в `AiHeaderStyleBuilder` — соответствующие сеттеры; в `AiHeaderStyleBuilder` обновить аналогичные данные для конфига и генератора (`plugin_theme_builder`).

## Capabilities

### New Capabilities

*(нет новых самостоятельных способностей — все изменения относятся к существующим компонентам)*

### Modified Capabilities

- `ai-header-component`: замена `hasDivider: Boolean` на `SeparationType` enum; добавление провайдинга `LocalIconButtonGroupStyle` в слоты через `startButtonGroupStyle`/`endButtonGroupStyle`.
- `ai-header-style`: добавление полей `startButtonGroupStyle`/`endButtonGroupStyle` в `AiHeaderStyle` и соответствующих сеттеров в `AiHeaderStyleBuilder`; обновление дефолтного `LocalAiHeaderStyle`.
- `ai-header-theme-builder`: добавление `startButtonGroupStyle`/`endButtonGroupStyle` в `AiHeaderProperties`, `AiHeaderConfig` и `AiHeaderComposeVariationGenerator`.

## Impact

- `sdds-core/uikit-compose`: публичный API — `AiHeader` (параметр `separationType`), `AiHeaderStyle` (новые поля), `AiHeaderStyleBuilder` (новые сеттеры). Требует обновления KDoc.
- `sdds-core/plugin_theme_builder`: `AiHeaderProperties`, `AiHeaderConfig`, `AiHeaderComposeVariationGenerator` — не публичный API, но изменение конфига.
- `integration-core/uikit-compose-fixtures`: `AiHeaderUiState`, `AiHeaderUiStatePropertiesProducer`, `AiHeaderUiStateTransformer`, `AiHeaderStory` — внутренние fixture-файлы.
- Токены (`tokens/sdds.serv.compose` и др.) могут потребовать обновления сгенерированного кода, если в конфиге появятся новые поля.
