## Why

В AI-интерфейсах необходим специализированный компонент ввода, объединяющий текстовое поле с поддержкой многострочности, область вложений (файлы) и панель управляющих кнопок. Существующий `TextField` не покрывает этот сценарий: нет слотов для файлов, нет адаптивного переключения между однострочным и многострочным режимами, нет поддержки кнопки отправки как отдельного слота.

## What Changes

- Добавить `AiInput` — новый Compose-компонент в `sdds-core/uikit-compose`, пакет `com.sdds.compose.uikit.ai`.
- Добавить `AiInputStyle` / `AiInputStyleBuilder` / вспомогательные типы (`AiInputColors`, `AiInputDimensions`) — по образцу `AiHeaderStyle`.
- Добавить `AiInputMode` — enum с вариантами `Condensed` и `Extended`.
- Добавить `LocalAiInputStyle` — CompositionLocal со стилем по умолчанию.
- Добавить `AiInputStory` — в `integration-core/uikit-compose-fixtures`, пакет `com.sdds.compose.uikit.fixtures.stories.aiinput`.
- Добавить `AiInputSamples.kt` — в `integration-core/uikit-compose-fixtures`, пакет `com.sdds.compose.uikit.fixtures.samples.aiinput`.
- Добавить `AiInputUsage.md` — документацию по использованию компонента.

## Capabilities

### New Capabilities

- `ai-input-component`: Compose-компонент `AiInput` с двумя режимами отображения (`Condensed`/`Extended`), слотами для файлов, левой/правой групп кнопок, кнопки отправки, и текстовым полем с поведением placeholder/cursor.
- `ai-input-style`: Стиль `AiInputStyle`, билдер `AiInputStyleBuilder` (аннотирован `@ApiInfo`), вспомогательные типы `AiInputColors` / `AiInputDimensions` / `AiInputColorsBuilder` / `AiInputDimensionsBuilder`. Провайдит `FileStyle`, `ButtonGroupStyle`, `ButtonStyle` для дочерних слотов.

### Modified Capabilities

<!-- Нет изменений существующих capability -->

## Impact

- **sdds-core/uikit-compose** — новые файлы `AiInput.kt`, `AiInputStyle.kt` в пакете `com.sdds.compose.uikit.ai`.
- **integration-core/uikit-compose-fixtures** — `AiInputStory.kt` в `stories/aiinput`, `AiInputSamples.kt` в `samples/aiinput`.
- **Документация** — `AiInputUsage.md`.
- Публичный API: новые классы/интерфейсы, обратная совместимость не нарушается.
- Зависимости: переиспользуются существующие `FileStyle`, `ButtonGroupStyle`, `ButtonStyle`, `LocalFileStyle`, `LocalButtonGroupStyle` из `uikit-compose`.
