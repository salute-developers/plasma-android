## ADDED Requirements

### Requirement: FileColors предоставляет кисть фона как StatefulValue
Интерфейс `FileColors` SHALL содержать свойство `backgroundColor` типа `StatefulValue<Brush>`. `FileColorsBuilder` SHALL предоставлять перегрузки сеттера: `backgroundColor(Color)`, `backgroundColor(InteractiveColor)`, `backgroundColor(Brush)` и `backgroundColor(StatefulValue<Brush>)` (по образцу `ListItem`). Дефолтное значение SHALL быть кистью из `Color.Transparent`.

#### Scenario: Кисть фона не задана
- **WHEN** билдер `FileColors` собирает значение без вызова `backgroundColor(...)`
- **THEN** `backgroundColor` соответствует прозрачному фону (кисть из `Color.Transparent`)

#### Scenario: Фон задан состоянийзависимой кистью
- **WHEN** вызван `backgroundColor(statefulBrush)` со значениями для разных состояний
- **THEN** `backgroundColor.getValue(interactionSource)` возвращает кисть, соответствующую текущему состоянию

### Requirement: FileStyle предоставляет форму как StatefulValue
Интерфейс `FileStyle` SHALL содержать свойство `shape` типа `StatefulValue<Shape>`. `FileStyleBuilder` SHALL предоставлять перегрузки `shape(Shape)` и `shape(StatefulValue<Shape>)`. Дефолтное значение SHALL быть `RectangleShape` как `StatefulValue`.

#### Scenario: Форма не задана
- **WHEN** билдер `FileStyle` собирает стиль без вызова `shape(...)`
- **THEN** `shape.getValue(interactionSource)` возвращает `RectangleShape`

#### Scenario: Форма задана состоянийзависимо
- **WHEN** вызван `shape(statefulShape)` со значениями для разных состояний
- **THEN** `shape.getValue(interactionSource)` возвращает форму, соответствующую текущему состоянию

### Requirement: FileDimensions предоставляет раздельные внешние отступы как StatefulValue
Интерфейс `FileDimensions` SHALL содержать свойства `paddingStart`, `paddingTop`, `paddingEnd`, `paddingBottom` типа `StatefulValue<Dp>` и хелпер `getPaddingValues(interactionSource)`, возвращающий разрешённые `PaddingValues`. `FileDimensionsBuilder` SHALL предоставлять перегрузки `paddingStart(Dp)`/`paddingStart(StatefulValue<Dp>)` и аналогичные для `paddingTop`, `paddingEnd`, `paddingBottom`. Дефолтное значение каждого SHALL быть `0.dp` как `StatefulValue`.

#### Scenario: Отступы не заданы
- **WHEN** билдер `FileDimensions` собирает значение без установки отступов
- **THEN** `getPaddingValues(interactionSource)` возвращает `PaddingValues(0.dp)` для всех сторон

#### Scenario: Отступы заданы раздельно и состоянийзависимо
- **WHEN** заданы значения для отдельных сторон (в т.ч. состоянийзависимые) через сеттеры
- **THEN** `getPaddingValues(interactionSource)` возвращает значения, соответствующие текущему состоянию для заданных сторон, а незаданные стороны остаются `0.dp`

### Requirement: Обратная совместимость дефолтов стиля
Добавление `backgroundColor`, `shape` и раздельных отступов SHALL быть обратно совместимым: существующие стили File, не настраивающие эти свойства, SHALL сохранять прежнее поведение и внешний вид.

#### Scenario: Существующий стиль без новых настроек
- **WHEN** существующий код создаёт `FileStyle` без вызова новых сеттеров
- **THEN** компонент рендерится визуально идентично поведению до изменения (прозрачный фон, прямоугольная форма, нулевые отступы)
