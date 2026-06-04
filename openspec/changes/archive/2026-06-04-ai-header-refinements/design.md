## Context

Компонент `AiHeader` реализован в `sdds-core/uikit-compose`. После первичной реализации выявлено:
- `hasStartButton`/`hasEndButton` в `AiHeaderUiState` — неточное именование: слот принимает произвольный контент, не только кнопку.
- `hasDivider: Boolean` — маловыразительный флаг, не масштабируется при добавлении новых типов разделителей.
- Слоты `startContent`/`endContent` провайдят только `LocalIconButtonStyle`, но не `LocalButtonGroupStyle`, — вставка `ButtonGroup` в слот не получает стиль из `AiHeaderStyle`.
- В `AiHeaderUiState.titleAlignment` тип `AiHeaderTitleAlignment` содержит `End`-вариант, недопустимый в sandbox UI. Кроме того, имя свойства отличается от принятого в fixture-системе соглашения.

Изменения затрагивают три области:
1. `sdds-core/uikit-compose` — публичный API.
2. `sdds-core/plugin_theme_builder` — конфиг и генератор (внутренний, но влияет на токены).
3. `integration-core/uikit-compose-fixtures` — fixture-классы, генерируемые KSP.

## Goals / Non-Goals

**Goals:**
- Переименовать `hasStartButton`/`hasEndButton` → `hasActionBefore`/`hasActionAfter` в `AiHeaderUiState`.
- Заменить `hasDivider: Boolean` → `separationType: SeparationType` (enum `Divider`, `None`).
- Добавить `startButtonGroupStyle`/`endButtonGroupStyle` в `AiHeaderStyle` и провайдить `LocalButtonGroupStyle` внутри слотов.
- В `AiHeaderUiState` переименовать `titleAlignment` → `titleAlign`; заменить тип `AiHeaderTitleAlignment` на локальный enum `TitleAlign { Start, Center }` без `End`; маппить в `AiHeaderTitleAlignment` при вызове компонента.
- Обновить `plugin_theme_builder` (`AiHeaderProperties`, `AiHeaderComposeVariationGenerator`) для поддержки новых полей стиля.

**Non-Goals:**
- Добавление новых вариантов `SeparationType` (кроме `Divider` и `None`).
- Изменение внутренней логики `ButtonGroup` или `IconButton`.
- Изменение стиля токенов вне сгенерированного кода.

## Decisions

### 1. `SeparationType` enum вместо `hasDivider: Boolean`

`hasDivider: Boolean` заменяется на `separationType: AiHeaderSeparationType` с вариантами `Divider` и `None`. Дефолт — `None` (аналог `hasDivider = false`).

Определяется в `AiHeader.kt` рядом с `AiHeaderTitleAlignment`. Компонент проверяет `separationType == AiHeaderSeparationType.Divider` вместо `hasDivider`.

**Альтернатива**: оставить `Boolean` и добавить перегрузку — отклонено, т.к. enum семантически точнее и масштабируется.

### 2. Поддержка `ButtonGroupStyle` в слотах

В `AiHeaderStyle` добавляются два поля: `startButtonGroupStyle: ButtonGroupStyle` и `endButtonGroupStyle: ButtonGroupStyle`. В `AiHeader` оба слота (`startContent`, `endContent`) оборачиваются в:

```kotlin
CompositionLocalProvider(
    LocalIconButtonStyle provides style.startButtonStyle,
    LocalButtonGroupStyle provides style.startButtonGroupStyle,
) { it() }
```

Паттерн повторяет `AiAnswerStyle.actionsStartButtonGroupStyle`. Дефолт — `ButtonGroupStyle.builder().style()`.

В `AiHeaderStyleBuilder` добавляются сеттеры `startButtonGroupStyle(ButtonGroupStyle)` и `endButtonGroupStyle(ButtonGroupStyle)`.

В `plugin_theme_builder`:
- `AiHeaderProperties` получает поля `startButtonGroupStyle: ComponentStyle<ButtonProperties>?` и `endButtonGroupStyle: ComponentStyle<ButtonProperties>?`.
- `AiHeaderComposeVariationGenerator` генерирует вызовы `startButtonGroupStyle(...)` и `endButtonGroupStyle(...)` по образцу существующих `startButtonStyle`/`endButtonStyle`.

### 3. `TitleAlign` enum в `AiHeaderUiState`

В `AiHeaderUiState` тип свойства `titleAlignment` (переименованного в `titleAlign`) меняется с `AiHeaderTitleAlignment` на локальный sealed/enum класс `TitleAlign { Start, Center }`. `End` исключается, т.к. в sandbox UI не предусмотрен.

Маппинг при вызове компонента:
```kotlin
titleAlignment = when (state.titleAlign) {
    TitleAlign.Start -> AiHeaderTitleAlignment.Start
    TitleAlign.Center -> AiHeaderTitleAlignment.Center
}
```

`TitleAlign` объявляется в `AiHeaderStory.kt` рядом с `AiHeaderUiState`. KSP сгенерирует `AiHeaderUiStatePropertiesProducer` и `AiHeaderUiStateTransformer` заново на основе обновлённого `@StoryUiState`.

## Risks / Trade-offs

- [Risk] **Сломанный вызов `hasDivider`** в существующих sandbox-/integration-приложениях → переименование параметра — breaking change; существующие вызовы нужно найти и обновить. Mitigation: поиск по всему репо перед коммитом.
- [Risk] **KSP-регенерация producer/transformer** — если в KSP-кеше останутся старые артефакты, `hasStartButton`/`hasEndButton` могут всплыть как неизвестные свойства → Mitigation: `./gradlew clean` перед валидацией.
- [Risk] **plugin_theme_builder вне репо** — если генератор находится во внешней системе, изменения `AiHeaderProperties` нужно координировать отдельно → Mitigation: изменения описываются в tasks.md как отдельный шаг с явным указанием на внешний модуль.
