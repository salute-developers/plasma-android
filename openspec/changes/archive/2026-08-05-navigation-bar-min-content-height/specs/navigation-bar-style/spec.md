## ADDED Requirements

### Requirement: NavigationBarDimensions предоставляет минимальную высоту контент-области
Интерфейс `NavigationBarDimensions` SHALL содержать свойство `minContentHeight` типа `StatefulValue<Dp>`, задающее минимальную высоту контент-области (ряда со слотами `start`/`center`/`end`) без учёта `paddingTop` и `paddingBottom`. `NavigationBarDimensionsBuilder` SHALL предоставлять перегрузки `minContentHeight(Dp)` и `minContentHeight(StatefulValue<Dp>)`. Дефолтное значение SHALL быть `0.dp` как `StatefulValue`.

#### Scenario: Минимальная высота не задана
- **WHEN** билдер `NavigationBarDimensions` собирает значение без вызова `minContentHeight(...)`
- **THEN** `minContentHeight.getValue(stateSet)` возвращает `0.dp` для любого набора состояний

#### Scenario: Минимальная высота задана скаляром
- **WHEN** вызван `minContentHeight(24.dp)`
- **THEN** `minContentHeight.getValue(stateSet)` возвращает `24.dp` для любого набора состояний

#### Scenario: Минимальная высота задана состоянийзависимо
- **WHEN** вызван `minContentHeight(statefulValue)` со значением для состояния `NavigationBarTextPlacement.Inline` и дефолтным значением
- **THEN** `minContentHeight.getValue(setOf(NavigationBarTextPlacement.Inline))` возвращает значение для inline-состояния, а `minContentHeight.getValue(emptySet())` — дефолтное

### Requirement: CollapsingNavigationBarDimensions предоставляет минимальную высоту контент-области
Интерфейс `CollapsingNavigationBarDimensions` SHALL содержать свойство `minContentHeight` типа `StatefulValue<Dp>` с той же семантикой, что и у `NavigationBarDimensions`. `CollapsingNavigationBarDimensionsBuilder` SHALL предоставлять перегрузки `minContentHeight(Dp)` и `minContentHeight(StatefulValue<Dp>)`. Дефолтное значение SHALL быть `0.dp` как `StatefulValue`. Значение для состояния `CollapsingNavigationBarStates.Collapsed` SHALL определять минимальную высоту свёрнутого ряда, дефолтное значение — минимальную высоту раскрытого блока.

#### Scenario: Минимальная высота не задана
- **WHEN** билдер `CollapsingNavigationBarDimensions` собирает значение без вызова `minContentHeight(...)`
- **THEN** `minContentHeight.getValue(interactionSource)` и `minContentHeight.getValue(interactionSource, setOf(CollapsingNavigationBarStates.Collapsed))` возвращают `0.dp`

#### Scenario: Задана только высота свёрнутого ряда
- **WHEN** задан `minContentHeight` со значением для состояния `CollapsingNavigationBarStates.Collapsed` и без дефолтного значения
- **THEN** `minContentHeight.getValue(interactionSource, setOf(CollapsingNavigationBarStates.Collapsed))` возвращает заданное значение, а `minContentHeight.getValue(interactionSource)` возвращает `0.dp`

### Requirement: View-стиль NavigationBar принимает минимальную высоту контент-области
Styleable `NavigationBar` в `sdds-core/uikit` SHALL содержать атрибут `sd_minContentHeight` с `format="dimension|reference"`, размеченный `sdds:api_name="minContentHeight"` и `sdds:api_type="dimension"`. Атрибут SHALL принимать как скалярное значение размера, так и ссылку на XML-ресурс `NumberStateList`, чтобы значение могло зависеть от состояния `sd_state_collapsed`. Компонент `NavigationBar` SHALL предоставлять публичные методы `setMinContentHeightsList(NumberStateList?)` и `setMinContentHeight(Int)`.

#### Scenario: Атрибут не задан в стиле
- **WHEN** стиль `NavigationBar` не содержит `sd_minContentHeight`
- **THEN** минимальная высота контент-области равна нулю и измерение компонента не отличается от поведения до изменения

#### Scenario: Атрибут задан скалярным размером
- **WHEN** стиль содержит `<item name="sd_minContentHeight">24dp</item>`
- **THEN** минимальная высота контент-области равна 24dp независимо от текущего `drawableState`

#### Scenario: Атрибут задан ссылкой на NumberStateList
- **WHEN** стиль содержит ссылку на `@xml/`-ресурс `number-selector` со значением для `sd_state_collapsed="true"` и значением по умолчанию
- **THEN** при смене `drawableState` компонент пересчитывает текущее значение и применяет соответствующее состоянию

#### Scenario: Значение установлено программно
- **WHEN** вызван `setMinContentHeight(pixels)`
- **THEN** значение оборачивается в `NumberStateList` с единственным элементом и применяется ко всем состояниям

### Requirement: Обратная совместимость минимальной высоты
Добавление `minContentHeight` SHALL быть обратно совместимым. Существующие стили и темы, не задающие это свойство, SHALL сохранять прежнюю высоту и расположение содержимого.

#### Scenario: Существующая тема без нового токена
- **WHEN** тема из `tokens/` не содержит значения минимальной высоты навбара
- **THEN** `NavigationBar` и `CollapsingNavigationBar` рендерятся визуально идентично поведению до изменения
