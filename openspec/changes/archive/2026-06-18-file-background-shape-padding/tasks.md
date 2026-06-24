## 1. FileColors: кисть фона (StatefulValue<Brush>)

- [x] 1.1 Добавить свойство `backgroundColor: StatefulValue<Brush>` в интерфейс `FileColors` (с KDoc)
- [x] 1.2 Добавить в `FileColorsBuilder` перегрузки `backgroundColor(Color)`, `backgroundColor(InteractiveColor)`, `backgroundColor(Brush)` (default-методы через `asStatefulBrush()`/`asStatefulValue()`) и абстрактный `backgroundColor(StatefulValue<Brush>)`
- [x] 1.3 Реализовать поле и сеттер в `DefaultFileColors`/`Builder`, дефолт `Color.Transparent.asStatefulBrush()`

## 2. FileStyle: форма (StatefulValue<Shape>)

- [x] 2.1 Добавить свойство `shape: StatefulValue<Shape>` в интерфейс `FileStyle` (с KDoc)
- [x] 2.2 Добавить в `FileStyleBuilder` перегрузки `shape(Shape)` (через `asStatefulValue()`) и `shape(StatefulValue<Shape>)`
- [x] 2.3 Реализовать поле и сеттер в `DefaultFileStyle`/`Builder`, дефолт `RectangleShape.asStatefulValue()`

## 3. FileDimensions: раздельные внешние отступы (StatefulValue<Dp>)

- [x] 3.1 Добавить свойства `paddingStart`, `paddingTop`, `paddingEnd`, `paddingBottom: StatefulValue<Dp>` в интерфейс `FileDimensions` (с KDoc)
- [x] 3.2 Добавить хелпер `getPaddingValues(interactionSource): PaddingValues`, собирающий разрешённые значения сторон
- [x] 3.3 Добавить в `FileDimensionsBuilder` перегрузки `paddingStart(Dp)`/`paddingStart(StatefulValue<Dp>)` и аналоги для `paddingTop`/`paddingEnd`/`paddingBottom`
- [x] 3.4 Реализовать поля и сеттеры в `DefaultFileDimensions`/`Builder`, дефолт каждого `0.dp.asStatefulValue()`

## 4. Применение в Composable File

- [x] 4.1 В `File.kt` резолвить кисть фона через `style.colors.backgroundColor.getValueAsState(interactionSource)` и форму через `style.shape.getValue(interactionSource)`
- [x] 4.2 Получить отступы через `style.dimensions.getPaddingValues(interactionSource)`
- [x] 4.3 Применить к корневому `Column` цепочку модификаторов: `modifier.backgroundBrush(brushProducer = { bg.value }, shape = shape).padding(paddings).width(IntrinsicSize.Max)`

## 5. Валидация

- [x] 5.1 Запустить `:sdds-core:uikit-compose:spotlessApply` и привести форматирование
- [x] 5.2 Запустить `:sdds-core:uikit-compose:detekt` и устранить замечания
- [x] 5.3 Запустить `:sdds-core:uikit-compose:test` и убедиться, что существующие тесты/скриншоты File не сломаны
