## ADDED Requirements

### Requirement: TextAfterMode enum определяет режим отображения textAfter
`TextAfterMode` SHALL быть публичным enum в пакете `com.sdds.compose.uikit` со значениями `EachItem` и `Static`.

#### Scenario: EachItem является значением по умолчанию
- **WHEN** `WheelStyle` создаётся через `WheelStyle.builder().style()` без явного вызова `textAfterMode`
- **THEN** `WheelStyle.textAfterMode == TextAfterMode.EachItem`

#### Scenario: Builder принимает TextAfterMode
- **WHEN** вызывается `WheelStyleBuilder.textAfterMode(TextAfterMode.Static)`
- **THEN** `WheelStyle.textAfterMode == TextAfterMode.Static`

### Requirement: WheelStyle предоставляет поле textAfterMode
`WheelStyle` SHALL предоставлять свойство `textAfterMode: TextAfterMode` (по умолчанию `TextAfterMode.EachItem`).
`WheelStyleBuilder` SHALL предоставлять метод `fun textAfterMode(mode: TextAfterMode): WheelStyleBuilder`.

#### Scenario: textAfterMode сохраняется в стиле
- **WHEN** вызывается `WheelStyle.builder().textAfterMode(TextAfterMode.Static).style()`
- **THEN** возвращаемый `WheelStyle.textAfterMode == TextAfterMode.Static`

### Requirement: WheelDataSet предоставляет явный staticTextAfter
`WheelDataSet` SHALL предоставлять опциональное свойство `staticTextAfter: String? = null` для единого статичного суффикса колеса.
`WheelDataSet` SHALL сохранять обратную совместимость существующих Kotlin- и JVM-вызовов конструктора.

#### Scenario: staticTextAfter по умолчанию отсутствует
- **WHEN** `WheelDataSet` создаётся без явного `staticTextAfter`
- **THEN** `WheelDataSet.staticTextAfter == null`

#### Scenario: staticTextAfter сохраняется в dataset
- **WHEN** `WheelDataSet` создаётся со `staticTextAfter = "ч"`
- **THEN** `WheelDataSet.staticTextAfter == "ч"`

### Requirement: В режиме EachItem textAfter отображается у каждого элемента (текущее поведение)
`BaseWheel` SHALL при `textAfterMode == TextAfterMode.EachItem` рендерить `textAfter` внутри каждого элемента `LazyColumn`, как в текущей реализации. Поведение SHALL быть идентично поведению до введения `TextAfterMode`.

#### Scenario: textAfter виден у всех видимых элементов в режиме EachItem
- **WHEN** `textAfterMode == TextAfterMode.EachItem` и элементы содержат непустой `textAfter`
- **THEN** каждый видимый элемент колеса отображает свой `textAfter` справа от основного текста

#### Scenario: Прокрутка в режиме EachItem перемещает textAfter вместе с элементом
- **WHEN** `textAfterMode == TextAfterMode.EachItem` и пользователь прокручивает колесо
- **THEN** `textAfter` каждого элемента прокручивается вместе с ним

### Requirement: В режиме Static textAfter не отображается внутри прокручиваемых элементов
`BaseWheel` SHALL при `textAfterMode == TextAfterMode.Static` не рендерить `textAfter` внутри элементов `LazyColumn`.

#### Scenario: Элементы LazyColumn не содержат textAfter в режиме Static
- **WHEN** `textAfterMode == TextAfterMode.Static` и элементы содержат непустой `textAfter`
- **THEN** ни один прокручиваемый элемент колеса не отображает `textAfter`

### Requirement: В режиме Static textAfter отображается как статичный оверлей у центрального элемента
`BaseWheel` SHALL при `textAfterMode == TextAfterMode.Static` рендерить единый статичный `Text`-компонент поверх области колеса, вертикально выровненный по центру (позиция выбранного элемента).
`Wheel` SHALL передавать `WheelDataSet.staticTextAfter` в `BaseWheel` как параметр `staticTextAfter`.
Значение статичного `textAfter` SHALL браться из параметра `BaseWheel.staticTextAfter`.
Если `staticTextAfter == null`, реализация MAY использовать первый непустой `WheelItemData.textAfter` как fallback для обратной совместимости.
Горизонтальная позиция статичного `textAfter` SHALL вычисляться по самому широкому основному тексту среди элементов колеса плюс `textAfterPadding` с учётом `WheelItemAlignment`.
Статичный `textAfter` SHALL стилизоваться теми же `textAfterStyle`, `textAfterColor`, `textAfterPadding`, что и `textAfter` в режиме `EachItem`.
Если `staticTextAfter` отсутствует и fallback не находит непустой `WheelItemData.textAfter`, оверлей SHALL не рендериться.

#### Scenario: Статичный textAfter неподвижен при прокрутке
- **WHEN** `textAfterMode == TextAfterMode.Static` и пользователь прокручивает колесо
- **THEN** текст `textAfter` остаётся на одном месте, не прокручиваясь

#### Scenario: Вертикальное выравнивание статичного textAfter совпадает с центральным элементом
- **WHEN** `textAfterMode == TextAfterMode.Static`
- **THEN** вертикальный центр статичного `textAfter` совпадает с вертикальным центром выбранного элемента

#### Scenario: Горизонтальная позиция не меняется при элементах разной ширины
- **WHEN** `textAfterMode == TextAfterMode.Static`, `staticTextAfter = "ч"` и элементы содержат основные тексты разной ширины
- **THEN** статичный `textAfter` остаётся на одной горизонтальной позиции при прокрутке

#### Scenario: Start alignment размещает staticTextAfter после самого широкого текста
- **WHEN** `textAfterMode == TextAfterMode.Static` и `alignment == WheelItemAlignment.Start`
- **THEN** статичный `textAfter` начинается правее самого широкого основного текста с отступом `textAfterPadding`

#### Scenario: Center alignment учитывает центрирование текста
- **WHEN** `textAfterMode == TextAfterMode.Static` и `alignment == WheelItemAlignment.Center`
- **THEN** статичный `textAfter` размещается относительно центра колонки так, чтобы идти после самого широкого центрированного основного текста

#### Scenario: End alignment резервирует место под staticTextAfter
- **WHEN** `textAfterMode == TextAfterMode.Static` и `alignment == WheelItemAlignment.End`
- **THEN** `LazyColumn` резервирует справа место под `staticTextAfter` и `textAfterPadding`, а статичный `textAfter` размещается у правого края колонки

#### Scenario: Статичный textAfter не рендерится при отсутствии staticTextAfter и fallback-данных
- **WHEN** `textAfterMode == TextAfterMode.Static`, `staticTextAfter == null` и все `WheelItemData.textAfter` пусты
- **THEN** статичный оверлей не отображается

#### Scenario: staticTextAfter имеет приоритет над WheelItemData.textAfter
- **WHEN** `textAfterMode == TextAfterMode.Static`, `staticTextAfter = "ч"` и элементы содержат `WheelItemData.textAfter = "мин"`
- **THEN** статичный оверлей отображает `"ч"`

#### Scenario: Стиль статичного textAfter соответствует textAfterStyle и textAfterColor
- **WHEN** `textAfterMode == TextAfterMode.Static` и `textAfterStyle` задан кастомным значением
- **THEN** статичный `textAfter` отображается с заданным `textAfterStyle` и `textAfterColor`

### Requirement: BaseWheel корректно обрабатывает fixed width constraints
`BaseWheel` SHALL при fixed width constraints растягивать ширину `LazyColumn` до заданной ширины layout.
`BaseWheel` SHALL NOT растягивать viewport на всю доступную высоту только из-за fixed constraints.

#### Scenario: Fixed width растягивает LazyColumn по ширине
- **WHEN** `BaseWheel` измеряется с `constraints.hasFixedWidth == true`
- **THEN** ширина `LazyColumn` равна `constraints.maxWidth`

#### Scenario: Fixed constraints не растягивают Wheel по высоте
- **WHEN** `BaseWheel` измеряется с большой доступной высотой
- **THEN** высота layout вычисляется из высоты controls и viewport, а не заполняет всю доступную высоту

### Requirement: WheelProperties поддерживает поле textAfterMode для кодогенерации
`WheelProperties` SHALL содержать поле `textAfterMode: Value? = null`.
Метод `merge` SHALL объединять `textAfterMode` по принципу child-overrides-parent аналогично другим `Value?`-полям.

#### Scenario: textAfterMode включается в merge
- **WHEN** дочерняя `WheelProperties` имеет `textAfterMode = null`, а родительская — `Value("eachItem")`
- **THEN** после `merge` `textAfterMode == Value("eachItem")`

### Requirement: WheelComposeVariationGenerator генерирует вызов textAfterMode
`WheelComposeVariationGenerator` SHALL генерировать `.textAfterMode(TextAfterMode.<EachItem|Static>)` когда `WheelProperties.textAfterMode != null`.
Значение `"eachItem"` SHALL отображаться в `TextAfterMode.EachItem`, `"static"` — в `TextAfterMode.Static`.
Генератор wheel-стилей SHALL добавлять импорт `TextAfterMode`.

#### Scenario: Генерируется вызов для textAfterMode = "static"
- **WHEN** `WheelProperties.textAfterMode == Value("static")`
- **THEN** в сгенерированный builder добавляется `.textAfterMode(TextAfterMode.Static)`

#### Scenario: Генерируется вызов для textAfterMode = "eachItem"
- **WHEN** `WheelProperties.textAfterMode == Value("eachItem")`
- **THEN** в сгенерированный builder добавляется `.textAfterMode(TextAfterMode.EachItem)`

#### Scenario: Вызов не генерируется при отсутствии textAfterMode в конфиге
- **WHEN** `WheelProperties.textAfterMode == null`
- **THEN** в сгенерированный builder вызов `.textAfterMode(...)` не добавляется

#### Scenario: TextAfterMode доступен в сгенерированном файле
- **WHEN** `WheelComposeVariationGenerator` генерирует файл стилей колеса
- **THEN** в файл добавляется импорт `TextAfterMode`
