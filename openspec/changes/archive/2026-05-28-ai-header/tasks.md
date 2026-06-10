## 1. integration-core/sandbox-core — регистрация компонента

- [x] 1.1 Добавить `AI_HEADER` в `CoreComponentName` enum в `Component.kt`
- [x] 1.2 Добавить `val AiHeader = ComponentKey(CoreComponentName.AI_HEADER)` в `ComponentKey.companion`
- [x] 1.3 Добавить маппинг `CoreComponentName.AI_HEADER` в `CoreComponentGroup.NAVIGATION` в функции `CoreComponentName.group()`

## 2. sdds-core/uikit-compose — стиль компонента

- [x] 2.1 Создать `AiHeaderStyle.kt`: интерфейс `AiHeaderStyle`, `AiHeaderColors`, `AiHeaderDimensions` с их билдерами (`AiHeaderStyleBuilder`, `AiHeaderColorsBuilder`, `AiHeaderDimensionsBuilder`) и `DefaultAiHeaderStyle`
- [x] 2.2 Реализовать все перегрузки `AiHeaderColorsBuilder`: `Color`, `Brush`, `StatefulValue<Brush>` для `backgroundBrush`, `titleBrush`, `subtitleBrush`, `dividerBrush`
- [x] 2.3 Добавить `LocalAiHeaderStyle = compositionLocalOf { AiHeaderStyle.builder().style() }`
- [x] 2.4 Добавить KDoc ко всем публичным интерфейсам, классам и методам в `AiHeaderStyle.kt`

## 3. sdds-core/uikit-compose — Motion API

- [x] 3.1 Создать `motion/components/aiheader/AiHeaderMotionStyle.kt`: интерфейс `AiHeaderMotionStyle`, `AiHeaderMotionStyleBuilder`, `AiHeaderMotionStyleImpl` с `MotionProperty<Brush>` для `titleColor`, `subtitleColor`, `backgroundColor`, `dividerColor` и `MotionProperty<TextStyle>` для `titleStyle`, `subtitleStyle`
- [x] 3.2 Создать `motion/components/aiheader/AiHeaderMotion.kt`: `LocalAiHeaderMotionStyle` и `rememberAiHeaderMotion(style, motionContext)`
- [x] 3.3 Добавить KDoc к Motion-интерфейсам и функции `rememberAiHeaderMotion`

## 4. sdds-core/uikit-compose — компонент AiHeader

- [x] 4.1 Создать `AiHeaderTitleAlignment` enum (`Start`, `Center`, `End`) в `AiHeader.kt`
- [x] 4.2 Реализовать `AiHeader` Composable: Row с `verticalAlignment = Alignment.Top`, опциональные слоты `startContent`/`endContent` с провайдингом `LocalIconButtonStyle`, текстовый Column с `weight(1f)`
- [x] 4.3 Реализовать отображение `titleContent` и `subtitleContent`: `subtitlePadding` добавляется только при `subtitleContent != null`
- [x] 4.4 Реализовать поддержку `titleAlignment`: маппинг в `Alignment.Horizontal` и `TextAlign` для `ProvideTextStyle`
- [x] 4.5 Реализовать `hasDivider`: рисовать линию через `Modifier.drawBehind { drawLine(...) }` используя `dividerBrush` и `dividerThickness`
- [x] 4.6 Применить фон через `Modifier.background(brush = backgroundBrush)`
- [x] 4.7 Подключить Motion API: цвета и стили текста браться через `getBrushAsState` / `getTextStyleAsState`
- [x] 4.8 Добавить KDoc к `AiHeader` и `AiHeaderTitleAlignment`

## 5. sdds-core/plugin_theme_builder — конфиг и генератор

- [x] 5.1 Создать пакет `components/aiheader`, добавить `AiHeaderConfig.kt` с `AiHeaderProperties`, `AiHeaderView`, `AiHeaderVariation`, `AiHeaderConfig`
- [x] 5.2 Реализовать `merge()` в `AiHeaderProperties` для всех 20 полей
- [x] 5.3 Создать `AiHeaderConfigDelegate.kt`: `parseConfig()`, `createViewGenerator() = null`, `createComposeGenerator()`
- [x] 5.4 Создать `compose/AiHeaderComposeVariationGenerator.kt` по образцу `NavigationBarComposeVariationGenerator`: генерация builder-цепочек для `titleStyles`, `subtitleStyles`, `colors`, `dimensions`, `startButtonStyle`, `endButtonStyle`
- [x] 5.5 Убедиться, что цвета в генераторе эмитируются через brush-API (`backgroundBrush`, `titleBrush` и т.д.)
- [x] 5.6 Зарегистрировать `"ai-header" to AiHeaderConfigDelegate()` в `ComponentDelegates.kt`

## 6. integration-core/uikit-compose-fixtures — Story

- [x] 6.1 Создать `stories/aiheader/AiHeaderStory.kt`: `@StoryUiState data class AiHeaderUiState` с полями `title: String`, `subtitle: String`, `hasDivider: Boolean`, `titleAlignment: AiHeaderTitleAlignment`, `hasStartButton: Boolean`, `hasEndButton: Boolean`
- [x] 6.2 Реализовать `@Story object AiHeaderStory`: метод `Content()` — пустой `subtitle` маппируется в `subtitleContent = null`; метод `Preview()`

## 7. Валидация

- [x] 7.1 `./gradlew :sdds-core:uikit-compose:detekt`
- [x] 7.2 `./gradlew :sdds-core:uikit-compose:spotlessApply`
- [x] 7.3 `./gradlew :sdds-core:plugin_theme_builder:test`
- [x] 7.4 `./gradlew :sdds-core:uikit-compose:test`
- [x] 7.5 `./gradlew :integration-core:uikit-compose-fixtures:detekt`
