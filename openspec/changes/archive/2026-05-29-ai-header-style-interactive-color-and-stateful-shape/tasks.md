## 1. AiHeaderStyle.kt — shape: StatefulValue<Shape>

- [x] 1.1 Добавить импорты `InteractiveColor` и `asStatefulBrush` из `com.sdds.compose.uikit.interactions` в `AiHeaderStyle.kt`
- [x] 1.2 Изменить тип `val shape` в интерфейсе `AiHeaderStyle` с `Shape` на `StatefulValue<Shape>`
- [x] 1.3 Добавить абстрактный метод `fun shape(shape: StatefulValue<Shape>): AiHeaderStyleBuilder` в `AiHeaderStyleBuilder`; существующий `fun shape(shape: Shape)` сделать default-реализацией через `shape(shape.asStatefulValue())`
- [x] 1.4 Изменить тип поля `shape` в `DefaultAiHeaderStyle` с `Shape` на `StatefulValue<Shape>`
- [x] 1.5 Изменить тип поля `shape` в `DefaultAiHeaderStyle.Builder` с `Shape?` на `StatefulValue<Shape>?` и обновить override метода
- [x] 1.6 Обновить дефолтное значение в `style()`: `shape ?: RoundedCornerShape(0).asStatefulValue()`

## 2. AiHeaderColorsBuilder — InteractiveColor перегрузки

- [x] 2.1 Добавить default-метод `fun backgroundColor(color: InteractiveColor)` в `AiHeaderColorsBuilder`, делегирующий к `backgroundColor(color.asStatefulBrush())`
- [x] 2.2 Добавить default-метод `fun titleColor(color: InteractiveColor)` в `AiHeaderColorsBuilder`, делегирующий к `titleColor(color.asStatefulBrush())`
- [x] 2.3 Добавить default-метод `fun subtitleColor(color: InteractiveColor)` в `AiHeaderColorsBuilder`, делегирующий к `subtitleColor(color.asStatefulBrush())`
- [x] 2.4 Добавить default-метод `fun dividerColor(color: InteractiveColor)` в `AiHeaderColorsBuilder`, делегирующий к `dividerColor(color.asStatefulBrush())`

## 3. AiHeader.kt — резолв shape

- [x] 3.1 Добавить импорт `com.sdds.compose.uikit.interactions.getValueAsState` в `AiHeader.kt`
- [x] 3.2 Добавить `val shape = style.shape.getValueAsState(motion.context)` в тело `AiHeader` Composable
- [x] 3.3 Заменить `shape = style.shape` на `shape = shape.value` в вызове `backgroundBrush`

## 4. plugin_theme_builder — сопутствующие правки

- [x] 4.1 Добавить `componentStylePackage = "com.sdds.compose.uikit.ai"` в `AiHeaderConfigDelegate` — т.к. стиль перенесён в пакет `ai.*`
- [x] 4.2 Удалить поля `startButtonIcon` / `endButtonIcon` из `AiHeaderProperties` и соответствующие методы генерации — свойства не реализованы в компоненте

## 5. Валидация

- [x] 5.1 Запустить `./gradlew :sdds-core:uikit-compose:compileDebugKotlin` — убедиться, что нет ошибок компиляции
- [x] 5.2 Запустить `./gradlew :sdds-core:uikit-compose:detekt` — нет новых нарушений
- [x] 5.3 Запустить `./gradlew :tokens:sdds.serv.compose:compileDebugKotlin` — существующие стили компилируются без изменений
- [x] 5.4 Запустить `./gradlew :sdds-core:uikit-compose:spotlessApply` — форматирование
