## 1. sdds-core/uikit-compose — AiHeaderDimensions: тип полей Dp → StatefulValue<Dp>

- [x] 1.1 В интерфейсе `AiHeaderDimensions` изменить тип всех 10 полей с `Dp` на `StatefulValue<Dp>`: `paddingStart`, `paddingEnd`, `paddingTop`, `paddingBottom`, `textPaddingStart`, `textPaddingEnd`, `textPaddingTop`, `textPaddingBottom`, `subtitlePadding`, `dividerThickness`
- [x] 1.2 В `DefaultAiHeaderDimensions` (private data class) изменить типы соответствующих полей с `Dp` на `StatefulValue<Dp>`
- [x] 1.3 В `DefaultAiHeaderDimensions.Builder` изменить типы приватных полей с `Dp` на `StatefulValue<Dp>?`; обновить дефолтные значения в `build()`: каждое `0.dp` заменить на `0.dp.asStatefulValue()`, `1.dp` (dividerThickness) — на `1.dp.asStatefulValue()`
- [x] 1.4 Обновить KDoc всех 10 полей в интерфейсе `AiHeaderDimensions` — заменить упоминание `Dp` на `StatefulValue<Dp>`

## 2. sdds-core/uikit-compose — AiHeaderDimensionsBuilder: StatefulValue<Dp> + Dp overloads

- [x] 2.1 В интерфейсе `AiHeaderDimensionsBuilder` для каждого из 10 методов добавить абстрактную перегрузку `fun xPadding(value: StatefulValue<Dp>): AiHeaderDimensionsBuilder`
- [x] 2.2 Сделать существующие `fun xPadding(value: Dp)` методы default-реализациями, делегирующими к `StatefulValue<Dp>`-перегрузке через `value.asStatefulValue()`
- [x] 2.3 В `DefaultAiHeaderDimensions.Builder` реализовать все 10 новых абстрактных `StatefulValue<Dp>`-методов (убрать существующие реализации `Dp`-методов, они теперь default в интерфейсе)
- [x] 2.4 Обновить KDoc для каждой пары методов: указать, что `Dp`-перегрузка — shorthand через `asStatefulValue()`

## 3. sdds-core/uikit-compose — AiHeaderMotionStyle: MotionProperty<Dp> для всех 10 dimensions

- [x] 3.1 В интерфейсе `AiHeaderMotionStyle` добавить 10 полей `MotionProperty<Dp>`: `paddingStart`, `paddingEnd`, `paddingTop`, `paddingBottom`, `textPaddingStart`, `textPaddingEnd`, `textPaddingTop`, `textPaddingBottom`, `subtitlePadding`, `dividerThickness`
- [x] 3.2 В интерфейсе `AiHeaderMotionStyleBuilder` добавить 10 setter-методов `fun xPadding(padding: MotionProperty<Dp>): AiHeaderMotionStyleBuilder`
- [x] 3.3 В `AiHeaderMotionStyleImpl` добавить 10 новых полей `MotionProperty<Dp>`
- [x] 3.4 В `AiHeaderMotionStyleImpl.Builder` добавить 10 новых приватных полей и реализации setter-методов; в `style()` задать дефолт каждого через `noMotion()`
- [x] 3.5 Добавить KDoc к каждому новому полю и методу в интерфейсах

## 4. sdds-core/uikit-compose — AiHeader.kt: резолв размеров через getDpAsState

- [x] 4.1 Добавить импорт `com.sdds.compose.uikit.motion.getDpAsState` в `AiHeader.kt`
- [x] 4.2 В теле `AiHeader` Composable объявить 10 `val`-переменных через `getDpAsState`: `val paddingStart by style.dimensions.paddingStart.getDpAsState(motion.context, motion.style.paddingStart)` — аналогично для всех остальных 9 полей
- [x] 4.3 Заменить все прямые обращения `dimensions.paddingX` на резолвнутые `paddingX` в аргументах `.padding(...)`, `Modifier.height(...)` и `drawLine(strokeWidth = dividerThickness.toPx())`
- [x] 4.4 Удалить строку `val dimensions = style.dimensions` — больше не нужна

## 5. Валидация

- [x] 5.1 Запустить `./gradlew :sdds-core:uikit-compose:compileDebugKotlin` — убедиться в отсутствии ошибок компиляции
- [x] 5.2 Запустить `./gradlew :tokens:sdds.serv.compose:compileDebugKotlin` — убедиться, что существующие сгенерированные стили компилируются через Dp-default-методы без изменений
- [x] 5.3 Запустить `./gradlew :sdds-core:uikit-compose:detekt`
- [x] 5.4 Запустить `./gradlew :sdds-core:uikit-compose:spotlessApply`
