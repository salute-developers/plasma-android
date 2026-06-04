## 1. sdds-core/uikit-compose — SeparationType enum и замена hasDivider

- [x] 1.1 В `AiHeader.kt` объявить `enum class AiHeaderSeparationType { Divider, None }` рядом с `AiHeaderTitleAlignment`; добавить KDoc.
- [x] 1.2 В сигнатуре `@Composable fun AiHeader(...)` заменить параметр `hasDivider: Boolean = false` на `separationType: AiHeaderSeparationType = AiHeaderSeparationType.None`.
- [x] 1.3 В теле `AiHeader` заменить проверку `if (hasDivider)` на `if (separationType == AiHeaderSeparationType.Divider)`.
- [x] 1.4 Обновить KDoc параметра `hasDivider` → `separationType` в `AiHeader`.

## 2. sdds-core/uikit-compose — ButtonGroupStyle в AiHeaderStyle

- [x] 2.1 В `AiHeaderStyle.kt` добавить поля `startButtonGroupStyle: ButtonGroupStyle` и `endButtonGroupStyle: ButtonGroupStyle` в интерфейс `AiHeaderStyle`; добавить KDoc.
- [x] 2.2 В `AiHeaderStyleBuilder` добавить методы `fun startButtonGroupStyle(style: ButtonGroupStyle): AiHeaderStyleBuilder` и `fun endButtonGroupStyle(style: ButtonGroupStyle): AiHeaderStyleBuilder`; добавить KDoc.
- [x] 2.3 В `DefaultAiHeaderStyle` добавить поля `startButtonGroupStyle` и `endButtonGroupStyle`.
- [x] 2.4 В `DefaultAiHeaderStyle.Builder` добавить приватные поля и реализации методов `startButtonGroupStyle`/`endButtonGroupStyle`; в `style()` задать дефолт `ButtonGroupStyle.builder().style()`.
- [x] 2.5 Добавить импорт `ButtonGroupStyle` в `AiHeaderStyle.kt`.

## 3. sdds-core/uikit-compose — LocalButtonGroupStyle в слотах AiHeader

- [x] 3.1 В `AiHeader.kt` добавить импорт `com.sdds.compose.uikit.LocalButtonGroupStyle`.
- [x] 3.2 В слоте `startContent` расширить `CompositionLocalProvider` — добавить `LocalButtonGroupStyle provides style.startButtonGroupStyle` рядом с `LocalIconButtonStyle provides style.startButtonStyle`.
- [x] 3.3 В слоте `endContent` расширить `CompositionLocalProvider` — добавить `LocalButtonGroupStyle provides style.endButtonGroupStyle` рядом с `LocalIconButtonStyle provides style.endButtonStyle`.

## 4. sdds-core/plugin_theme_builder — поддержка ButtonGroupStyle

- [x] 4.1 В `AiHeaderProperties` добавить поля `startButtonGroupStyle: ComponentStyle<ButtonProperties>?` и `endButtonGroupStyle: ComponentStyle<ButtonProperties>?`.
- [x] 4.2 В `AiHeaderProperties.merge()` добавить обработку новых полей через `?: otherProps.startButtonGroupStyle` и аналогично для `endButtonGroupStyle`.
- [x] 4.3 В `AiHeaderComposeVariationGenerator` добавить генерацию `.startButtonGroupStyle(...)` и `.endButtonGroupStyle(...)` по образцу `.startButtonStyle(...)`.

## 5. integration-core/uikit-compose-fixtures — переименования в AiHeaderUiState

- [x] 5.1 В `AiHeaderUiState` переименовать поле `hasStartButton: Boolean` → `hasActionBefore: Boolean`.
- [x] 5.2 В `AiHeaderUiState` переименовать поле `hasEndButton: Boolean` → `hasActionAfter: Boolean`.
- [x] 5.3 В теле `AiHeaderStory.Content()` обновить обращения: `state.hasStartButton` → `state.hasActionBefore`, `state.hasEndButton` → `state.hasActionAfter`.
- [x] 5.4 В `AiHeaderUiState` переименовать поле `titleAlignment: AiHeaderTitleAlignment` → `titleAlign: TitleAlign`.
- [x] 5.5 В `AiHeaderStory.kt` объявить локальный `enum class TitleAlign { Start, Center }` рядом с `AiHeaderUiState`.
- [x] 5.6 В `AiHeaderUiState` изменить тип поля `titleAlign` на `TitleAlign` (дефолт `TitleAlign.Start`).
- [x] 5.7 В `AiHeaderStory.Content()` добавить маппинг: `titleAlignment = when (state.titleAlign) { TitleAlign.Start -> AiHeaderTitleAlignment.Start; TitleAlign.Center -> AiHeaderTitleAlignment.Center }`.
- [x] 5.8 Убрать импорт `AiHeaderTitleAlignment` из `AiHeaderUiState`-контекста (он по-прежнему нужен в `Content()` для маппинга).
- [x] 5.9 В `AiHeaderStory` обновить параметр `separationType = ...` вместо `hasDivider = state.hasDivider` — привязать `state.hasDivider` к `AiHeaderSeparationType.Divider`/`None`; переименовать поле `hasDivider` в `AiHeaderUiState` в `separationType: AiHeaderSeparationType` если это целесообразно.

## 6. Валидация

- [x] 6.1 Запустить `./gradlew :sdds-core:uikit-compose:compileDebugKotlin` — убедиться в отсутствии ошибок.
- [x] 6.2 Запустить `./gradlew :integration-core:uikit-compose-fixtures:compileDebugKotlin` — убедиться, что KSP-генерация прошла успешно.
- [x] 6.3 Запустить `./gradlew :sdds-core:uikit-compose:detekt`.
- [x] 6.4 Запустить `./gradlew :sdds-core:uikit-compose:spotlessApply`.
- [x] 6.5 Запустить `./gradlew :integration-core:uikit-compose-fixtures:detekt`.
- [x] 6.6 Запустить `./gradlew :integration-core:uikit-compose-fixtures:spotlessApply`.
- [x] 6.7 Поискать по репо все вызовы `hasDivider =` применительно к `AiHeader` — обновить на `separationType =` (обновлён `AiHeaderSamples.kt`).
