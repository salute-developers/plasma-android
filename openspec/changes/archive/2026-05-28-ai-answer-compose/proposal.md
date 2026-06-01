## Why

В `sdds-core/uikit-compose` нет отдельного Compose-компонента для отображения ответа LLM, хотя AI-сценарии требуют устойчивого UI-контракта для обычного ответа, загрузки и ошибки. Новый `Answer` позволит дизайн-системам генерировать и переиспользовать единый AI answer паттерн с вариативностью через стили, а не через ad-hoc layout в приложениях.

## What Changes

- Добавить публичный Compose-компонент `Answer` в пакете `com.sdds.compose.uikit.ai`.
- Добавить `AnswerState : ValueState` со значениями `Default`, `Error`, `Loading`; отдельные `loading: Boolean` и `view` API не вводить.
- Добавить slot-based API для `title` и `content`, без markdown/rich text parsing и без data model для LLM-ответа.
- Добавить structured slots:
  - `actionsStart` и `actionsEnd` как `ButtonGroupScope` slots, каждый в отдельном `ButtonGroup`;
  - `suggestions` как `FlowRowScope` slot внутри `ChipGroup`.
- Добавить custom slots для `Loading` и `Error` состояний через отдельные scopes; default `Loading` должен использовать `Spinner`, default `Error` должен использовать `Note`.
- Добавить `AnswerStyle`, builder, colors/dimensions и composition local в `com.sdds.compose.uikit.ai`.
- Все visual-свойства `AnswerStyle` сделать non-null `StatefulValue<T>`, все color-like свойства хранить как `StatefulValue<Brush>`.
- Добавить nested styles в `AnswerStyle` для `Note`, loading `Spinner`, action `ButtonGroup` и suggestions `ChipGroup`.
- Добавить `AnswerMotionStyle`, builder, composition local и `rememberAnswerMotion(...)` в `com.sdds.compose.uikit.ai.motion`.
- Motion свойства первой версии ограничить dimensions, `Brush` и `TextStyle`.
- Вынести internal layout/default rendering helpers в `com.sdds.compose.uikit.internal`.
- Добавить поддержку генерации Compose `AnswerStyle` в Theme Builder.
- Добавить Compose fixtures/samples/docs для `Default`, `Loading`, `Error`, custom loading/error slots и nested style customization.

## Capabilities

### New Capabilities

- `answer-compose`: Compose AI Answer component, semantic states, structured scoped slots, style and motion contracts, Theme Builder generation, fixtures and docs.

### Modified Capabilities

- None.

## Impact

- Affected included build: `sdds-core`.
- Primary module: `sdds-core/uikit-compose`.
- Theme Builder module: `sdds-core/plugin_theme_builder`.
- Public API impact: new package `com.sdds.compose.uikit.ai`, new package `com.sdds.compose.uikit.ai.motion`, new public component/state/scope/style/motion APIs.
- Internal implementation impact: new internal helpers under `sdds-core/uikit-compose/src/main/kotlin/com/sdds/compose/uikit/internal/`.
- Token impact: generated Compose style outputs in `tokens` must be able to reference generated `AnswerStyle` variations once token configs include `Answer`.
- Docs/testing impact: add/update Compose fixtures, docs templates and sandbox/integration metadata for `Answer`.
- Gradle conventions: no expected changes.
- Validation scope: focused validation for `sdds-core/uikit-compose` and `sdds-core/plugin_theme_builder`; run broader `./gradlew detektAll` before merge if generated outputs or shared APIs are touched widely.
