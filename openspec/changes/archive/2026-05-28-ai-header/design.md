## Context

В `sdds-core/uikit-compose` реализованы шапочные компоненты `NavigationBar` и `ToolBar`. Оба построены как самостоятельные Composable поверх Row/Column с собственными стилями и конфигами для `plugin_theme_builder`. Новый компонент `AiHeader` следует той же архитектуре. Набор свойств конфига определён по `ai_header_config.json` (9 вариаций размера: xs–h2; 3 view-вариации: default/secondary/clear).

## Goals / Non-Goals

**Goals:**
- Реализовать `AiHeader` как самостоятельный Composable в `sdds-core/uikit-compose`.
- Все цвета — `StatefulValue<Brush>`, без `Color`/`InteractiveColor` напрямую.
- Divider рисуется вручную через `drawBehind` + `drawLine`, без компонента `Divider`.
- Поддержка Motion API по образцу `CellMotion`: `AiHeaderMotionStyle`, `AiHeaderMotionStyleBuilder`, `rememberAiHeaderMotion()`.
- `AiHeaderStyle` с билдерами, `AiHeaderColors`/`AiHeaderDimensions` с их билдерами, `LocalAiHeaderStyle`.
- Конфиг `AiHeaderConfig`, делегат `AiHeaderConfigDelegate`, генератор `AiHeaderComposeVariationGenerator` в `plugin_theme_builder`; регистрация в `ComponentDelegates`.

**Non-Goals:**
- View-реализация (`sdds-core/uikit`) — вне скоупа.
- Скролл/коллапс заголовка.

## Decisions

### 1. Самостоятельный компонент, не обёртка над Cell

Cell не подходит: нет divider-а, нет горизонтального выравнивания центрального блока, потребовалась бы конвертация `AiHeaderStyle → CellStyle` с игнорированием ~60% его API. Паттерн проекта — каждый layout-компонент (ToolBar, NavigationBar) реализован независимо.

### 2. Структура layout

```
Column(modifier.drawBehind { /* divider line */ }) {
    Row(verticalAlignment = Alignment.Top) {
        // startButton slot (опциональный)
        Column(
            modifier = Modifier.weight(1f),
            horizontalAlignment = titleAlignment.toAlignment()
        ) {
            // titleContent slot
            // subtitleContent slot — рендерится только если subtitleContent != null
            // Spacer(subtitlePadding) добавляется только между title и subtitle
        }
        // endButton slot (опциональный)
    }
}
```

Кнопки и текстовый блок выровнены по верхнему краю (`Alignment.Top`). Центральный блок занимает `weight(1f)`. Внешние отступы компонента — `paddingStart/End/Top/Bottom` из `AiHeaderDimensions`. Текстовый блок имеет собственные `textPaddingStart/End/Top/Bottom`.

`subtitleContent` — опциональный слот (`(@Composable () -> Unit)?`). `subtitlePadding` (отступ между title и subtitle) добавляется **только** если `subtitleContent != null`. Пустая строка в сторибуке передаётся как `null`-слот.

### 3. Divider без компонента Divider

Линия рисуется через `Modifier.drawBehind`:
```kotlin
drawLine(
    brush = dividerBrush,
    start = Offset(0f, size.height),
    end = Offset(size.width, size.height),
    strokeWidth = style.dimensions.dividerThickness.toPx(),
)
```
`hasDivider: Boolean` — параметр Composable. Цвет — `StatefulValue<Brush>` из `AiHeaderColors.dividerBrush`. Толщина — `Dp` из `AiHeaderDimensions.dividerThickness`.

### 4. Все цвета — StatefulValue\<Brush\>

`AiHeaderColors` содержит:
- `backgroundBrush: StatefulValue<Brush>`
- `titleBrush: StatefulValue<Brush>`
- `subtitleBrush: StatefulValue<Brush>`
- `dividerBrush: StatefulValue<Brush>`

Bilдеры принимают перегрузки: `Color`, `Brush`, `StatefulValue<Brush>`. Паттерн — как в `CellColors`.

### 5. Выравнивание текстового блока

Введён `AiHeaderTitleAlignment(Start, Center, End)`. Параметр `AiHeader()` с дефолтом `Start`. Маппится в `Alignment.Horizontal` для `Column` и `TextAlign` для `ProvideTextStyle`.

### 6. Провайдинг стилей дочерним слотам

`AiHeaderStyle` хранит `startButtonStyle: ButtonStyle` и `endButtonStyle: ButtonStyle`. Слоты получают стиль через `CompositionLocalProvider(LocalIconButtonStyle provides style.startButtonStyle)`. Title/subtitle — через `ProvideTextStyle` с кистью из `AiHeaderColors`.

### 7. Motion API

По образцу `CellMotion`:
- `AiHeaderMotionStyle` — интерфейс с `MotionProperty<Brush>`/`MotionProperty<TextStyle>` для titleColor, titleStyle, subtitleColor, subtitleStyle, backgroundColor, dividerColor.
- `AiHeaderMotionStyleBuilder` + `AiHeaderMotionStyleImpl`.
- `LocalAiHeaderMotionStyle`, `rememberAiHeaderMotion(style, motionContext)`.
- Composable принимает `motion: Motion<AiHeaderMotionStyle>` с дефолтом `rememberAiHeaderMotion(...)`.
- Цвета и стили текста берутся через `getBrushAsState` / `getTextStyleAsState` из motion-контекста.

### 8. Конфиг plugin_theme_builder — только Compose

`AiHeaderConfigDelegate.createViewGenerator()` возвращает `null`. Compose-генератор строится по образцу `NavigationBarComposeVariationGenerator`.

**Полный набор свойств `AiHeaderProperties`** (из конфига):

| Свойство | Тип |
|---|---|
| `titleStyle` | `Typography?` |
| `subtitleStyle` | `Typography?` |
| `backgroundColor` | `Color?` |
| `titleColor` | `Color?` |
| `subtitleColor` | `Color?` |
| `dividerColor` | `Color?` |
| `dividerThickness` | `Dimension?` |
| `textPaddingStart` | `Dimension?` |
| `textPaddingEnd` | `Dimension?` |
| `textPaddingTop` | `Dimension?` |
| `textPaddingBottom` | `Dimension?` |
| `subtitlePadding` | `Dimension?` |
| `paddingStart` | `Dimension?` |
| `paddingEnd` | `Dimension?` |
| `paddingTop` | `Dimension?` |
| `paddingBottom` | `Dimension?` |
| `startButtonStyle` | `ComponentStyle<ButtonProperties>?` |
| `endButtonStyle` | `ComponentStyle<ButtonProperties>?` |
| `startButtonIcon` | `Icon?` |
| `endButtonIcon` | `Icon?` |

### 9. Sandbox Story для sdds serv

Для отображения компонента в интерактивной песочнице необходимо:

**`integration-core/sandbox-core`** — ручные изменения:
- Добавить `AI_HEADER` в `CoreComponentName` enum.
- Добавить `val AiHeader = ComponentKey(CoreComponentName.AI_HEADER)` в `ComponentKey.companion`.
- Добавить маппинг в `CoreComponentName.group()` (группа `NAVIGATION` — рядом с `NavigationBar`/`ToolBar`).

**`integration-core/uikit-compose-fixtures`** — новый файл `stories/aiheader/AiHeaderStory.kt`:
- `@StoryUiState data class AiHeaderUiState` — поля: `title: String`, `subtitle: String`, `hasDivider: Boolean`, `titleAlignment: AiHeaderTitleAlignment`, `hasStartButton: Boolean`, `hasEndButton: Boolean`. Пустой `subtitle` означает, что subtitleContent-слот передаётся как `null` → отступ не добавляется.
- `@Story object AiHeaderStory : ComposeBaseStory<AiHeaderUiState, AiHeaderStyle>` — реализация `Content()` и `Preview()`.
- KSP (`sandbox-ksp`) автоматически генерирует `AiHeaderUiStatePropertiesProducer` и `AiHeaderUiStateTransformer`.

**`tokens/sdds.serv.compose`** — автогенерация:
- `SddsServAiHeaderVariationsCompose` — генерируется `plugin_theme_builder` из `AiHeaderConfig`.
- Регистрация в `SddsServComposeComponents` (AUTO-GENERATED файл) — перегенерируется автоматически.

## Risks / Trade-offs

- **`drawBehind` vs Divider**: ручной `drawLine` не реагирует на `DividerStyle` из других компонентов, но даёт полный контроль над толщиной и цветом из стиля компонента без внешних зависимостей.
- **Два независимых ButtonStyle**: `startButtonStyle` и `endButtonStyle` раздельны — увеличивает конфиг, но даёт гибкость. В конфиге они заданы одинаковыми по размеру, но могут различаться по теме.

## Validation

```bash
./gradlew :sdds-core:uikit-compose:detekt
./gradlew :sdds-core:uikit-compose:spotlessApply
./gradlew :sdds-core:plugin_theme_builder:test
./gradlew :sdds-core:uikit-compose:test
```
