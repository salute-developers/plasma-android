## Why

Высота `NavigationBar` (Compose и View) и `CollapsingNavigationBar` (только Compose) сейчас полностью определяется контентом. В Compose это `NavBarMeasurePolicy` (`sdds-core/uikit-compose/.../internal/navigationbar/NavigationBarLayout.kt`):

```kotlin
val contentHeight = maxOf(startContent.h, centerContent.h, endContent.h)
val height = contentHeight + offset + paddingTop + paddingBottom
```

во View — `CustomCenteringLayout.onMeasure` (`sdds-core/uikit/.../internal/navigationbar/CustomCenteringLayout.kt`):

```kotlin
val heightUsed = verPaddings + maxOf(actionStart.measuredHeight, actionEnd.measuredHeight, centerContent.measuredHeight)
```

Ни в стиле, ни в атрибутах нет свойства, задающего нижнюю границу высоты — есть только отступы. Из-за этого бар визуально «скачет» между экранами: на токенах `serv` (`contentPadding` 20dp сверху и снизу) экран с одним заголовком даёт высоту ~64dp, а экран с `IconButton` в `actionEnd` — 88dp. Для `CollapsingNavigationBar` та же проблема у свёрнутого ряда, причём его высота дополнительно управляет позицией раскрытого блока через `onMainContentSizeChanged` → `topContentSize`.

## What Changes

- В `NavigationBarDimensions` (`sdds-core/uikit-compose`) добавляется свойство `minContentHeight: StatefulValue<Dp>` с дефолтом `0.dp`; в билдер — перегрузки `minContentHeight(Dp)` и `minContentHeight(StatefulValue<Dp>)`.
- Аналогичное свойство добавляется в `CollapsingNavigationBarDimensions` с тем же дефолтом и теми же перегрузками.
- `NavigationBarLayout`/`NavBarMeasurePolicy` получают параметр `minContentHeight: Dp` и складывают его в `contentHeight` наравне со слотами: `maxOf(startH, centerH, endH, minContentHeightPx)`.
- `NavigationBar` (Compose) резолвит значение по `setOf(textPlacement)` — тем же способом, каким уже читает `descriptionPadding`.
- `BaseCollapsingNavBar` резолвит значение раздельно для двух слоёв: верхний (свёрнутый ряд) — `getValue(interactionSource, setOf(CollapsingNavigationBarStates.Collapsed))`, нижний (раскрытый блок) — `getValue(interactionSource)`. Значение для состояния `Collapsed` и есть «высота свёрнутого бара».
- В `navigation_bar_attrs.xml` (`sdds-core/uikit`) добавляется атрибут `sd_minContentHeight` с `format="dimension|reference"`, размеченный `sdds:api_name="minContentHeight"` и `sdds:api_type="dimension"` — по образцу `sd_descriptionMargin`, то есть с поддержкой `NumberStateList` через `@xml/`-ресурс.
- View-`NavigationBar` читает атрибут через `getNumberStateList`, резолвит по `drawableState` и пробрасывает в `actionsBlock.minimumHeight`; `CustomCenteringLayout.onMeasure` начинает учитывать `suggestedMinimumHeight`.
- Дефолт `0.dp` / отсутствие атрибута означают полное сохранение текущего поведения: ни один существующий стиль и ни одна тема визуально не меняются. Это НЕ breaking change.

## Capabilities

### New Capabilities
- `navigation-bar-style`: API стиля для минимальной высоты контент-области — `minContentHeight` в `NavigationBarDimensions` и `CollapsingNavigationBarDimensions` (Compose) и атрибут `sd_minContentHeight` с поддержкой `NumberStateList` (View).
- `navigation-bar-layout`: поведение измерения и вертикального центрирования при заданной минимальной высоте контент-области в `NavBarMeasurePolicy` (Compose) и `CustomCenteringLayout` (View), включая корректный проброс высоты свёрнутого ряда в раскрытый блок `CollapsingNavigationBar`.

### Modified Capabilities
<!-- Существующих spec-ов для NavigationBar нет; требования оформляются как новые capability. -->

## Impact

- Затронутые included builds и модули: `sdds-core/uikit-compose`, `sdds-core/uikit`.
- Затронутые файлы:
  - `uikit-compose`: `NavigationBarStyle.kt`, `CollapsingNavigationBarStyle.kt`, `NavigationBar.kt`, `internal/navigationbar/NavigationBarLayout.kt`, `internal/navigationbar/CollapsingNavBarLayout.kt`, `internal/navigationbar/BaseCollapsingNavigationBar.kt`.
  - `uikit`: `res/values/navigation_bar_attrs.xml`, `NavigationBar.kt`, `internal/navigationbar/CustomCenteringLayout.kt`.
- Публичный API: расширяется аддитивно (новые свойства интерфейсов `NavigationBarDimensions`/`CollapsingNavigationBarDimensions` и методы их билдеров; новый атрибут и публичные сеттеры во View-компоненте). Требуется KDoc на все новые публичные члены.
- Токены: модули в `tokens/` **не меняются** — ни одна тема сейчас не содержит токена высоты навбара (в `style-dimens.xml` для навбара есть только `content_padding_*`, `back_icon_margin`, `text_block_top_margin`, `horizontal_spacing`, `description_margin`). Разметка `sdds:api_name` нужна для того, чтобы токен подхватился генератором, когда он появится в источнике темы. Заведение самого токена — вне скоупа этого change.
- Генерация документации и Gradle conventions: не затрагиваются.
- Валидация: `:sdds-core:uikit-compose:test`, `:sdds-core:uikit:test`, `:sdds-core:uikit-compose:detekt`, `:sdds-core:uikit:detekt`, `:sdds-core:uikit-compose:spotlessApply`, `:sdds-core:uikit:spotlessApply`.
