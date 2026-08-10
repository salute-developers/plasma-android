## 1. sdds-core/uikit-compose: API стиля

- [x] 1.1 Добавить свойство `minContentHeight: StatefulValue<Dp>` в интерфейс `NavigationBarDimensions` (`NavigationBarStyle.kt`) с KDoc: величина относится к контент-области без вертикальных отступов и не включает системные инсеты
- [x] 1.2 Добавить в `NavigationBarDimensionsBuilder` абстрактный `minContentHeight(StatefulValue<Dp>)` и default-метод `minContentHeight(Dp)` через `asStatefulValue()` — по образцу `descriptionPadding`
- [x] 1.3 Реализовать поле и сеттер в `DefaultNavigationBarDimensions`/`Builder`, дефолт `0.dp.asStatefulValue()`
- [x] 1.4 Повторить 1.1–1.3 для `CollapsingNavigationBarDimensions`/`CollapsingNavigationBarDimensionsBuilder`/`DefaultCollapsingNavigationBarDimensions` (`CollapsingNavigationBarStyle.kt`), дефолт `0.dp.asStatefulValue()`

## 2. sdds-core/uikit-compose: измерение

- [x] 2.1 Добавить параметр `minContentHeight: Dp = 0.dp` в `NavigationBarLayout` (`internal/navigationbar/NavigationBarLayout.kt`) и передать его в `NavBarMeasurePolicy`
- [x] 2.2 Включить `minContentHeight` в список ключей `remember(...)` при создании `NavBarMeasurePolicy` (иначе смена значения не вызовет перемер)
- [x] 2.3 В `NavBarMeasurePolicy.measure` включить `minContentHeight.roundToPx()` в `maxOf(...)`, формирующий `contentHeight` — так, чтобы `onMainContentSizeChanged`, итоговая `height` и `calculateVerticalPosition` использовали уже добитое значение без отдельных правок
- [x] 2.4 Прокинуть `minContentHeight` через `CollapsingNavBarLayout` (`internal/navigationbar/CollapsingNavBarLayout.kt`) в `NavigationBarLayout`

## 3. sdds-core/uikit-compose: применение в компонентах

- [x] 3.1 В `NavigationBar.kt` резолвить `style.dimensions.minContentHeight.getValue(stateSet)` (где `stateSet = setOf(textPlacement)`) и передать в `NavigationBarLayout`
- [x] 3.2 В `BaseCollapsingNavigationBar.kt` для верхнего слоя передать `style.dimensions.minContentHeight.getValue(interactionSource, collapsedStateSet)` — это и есть высота свёрнутого бара
- [x] 3.3 В `BaseCollapsingNavigationBar.kt` для нижнего слоя передать `style.dimensions.minContentHeight.getValue(interactionSource)`
- [x] 3.4 Проверить, что `heightOffsetLimit` (считается от `bottomContentSize`) и `collapsedFraction` не изменили поведение при нулевом минимуме

## 4. sdds-core/uikit: атрибут

- [x] 4.1 Добавить в `res/values/navigation_bar_attrs.xml` в styleable `NavigationBar` атрибут `sd_minContentHeight` с `format="dimension|reference"`, `sdds:api_name="minContentHeight"`, `sdds:api_type="dimension"` и XML-комментарием на русском — по образцу `sd_descriptionMargin`

## 5. sdds-core/uikit: измерение и проброс

- [x] 5.1 В `internal/navigationbar/CustomCenteringLayout.onMeasure` учесть минимум: `resolveSize(maxOf(heightUsed, suggestedMinimumHeight), heightMeasureSpec)`
- [x] 5.2 Убедиться, что `CustomCenteringLayout.onLayout` не требует правок — центрирование от `centerY = (b - t) / 2` уже покрывает добитую высоту
- [x] 5.3 В `NavigationBar.kt` добавить поля `minContentHeights: NumberStateList?` и `currentMinContentHeight: Int`
- [x] 5.4 Прочитать атрибут в блоке `withStyledAttributes` через `getNumberStateList(context, R.styleable.NavigationBar_sd_minContentHeight)` и инициализировать `currentMinContentHeight` через `getIntForState(drawableState)` — рядом с чтением `sd_descriptionMargin`
- [x] 5.5 Добавить приватные `resolveMinContentHeight()` (выставляет `actionsBlock.minimumHeight` и вызывает `requestLayout()`) и `refreshMinContentHeight()` (пересчёт по `drawableState` с проверкой на изменение) — по образцу `resolveDescriptionMargin`/`refreshDescriptionMargin`
- [x] 5.6 Вызвать `refreshMinContentHeight()` из `drawableStateChanged()` рядом с `refreshDescriptionMargin()`
- [x] 5.7 Добавить публичные `open fun setMinContentHeightsList(NumberStateList?)` и `fun setMinContentHeight(Int)` с KDoc — по образцу `setDescriptionMarginsList`/`setDescriptionMargin`

## 6. Документация

- [x] 6.1 Проверить KDoc всех новых публичных членов Compose (свойства интерфейсов, методы билдеров) — на русском, в стиле окружающего кода
- [x] 6.2 Проверить KDoc публичных сеттеров View-компонента и XML-комментарий атрибута
- [x] 6.3 Убедиться, что в KDoc явно сказано: значение задаёт минимум контент-области (без `paddingTop`/`paddingBottom`) и не включает системные инсеты

## 7. Валидация

- [x] 7.1 `./gradlew :sdds-core:uikit-compose:spotlessApply :sdds-core:uikit:spotlessApply`
- [x] 7.2 `./gradlew :sdds-core:uikit-compose:detekt :sdds-core:uikit:detekt` и устранить замечания
- [x] 7.3 `./gradlew :sdds-core:uikit-compose:test` — убедиться, что существующие тесты и скриншоты navbar не изменились
- [x] 7.4 `./gradlew :sdds-core:uikit:test` — то же для View-версии
- [x] 7.5 Вручную проверить на фикстурах в `integration-core` два сценария: обычный `NavigationBar` с заданным минимумом (контент центрируется, бар не ниже минимума) и `CollapsingNavigationBar` (свёрнутый ряд держит высоту, раскрытый блок не наезжает на него при скролле)
