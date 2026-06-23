## Context

Компонент `File` (`sdds-core/uikit-compose/.../File.kt`) построен на `BaseCell` и оборачивается в корневой `Column(modifier.width(IntrinsicSize.Max))`. Его стиль `FileStyle` сейчас описывает только текстовые стили, цвета (label/description/icon), внутренние отступы контента (`FileDimensions`: start/end/bottom/description) и стили вложенных компонентов (кнопка действия, прогрессы).

Соседний компонент `ListItem` уже поддерживает фон, форму и внешние отступы и служит образцом: фон у него — `backgroundColor: StatefulValue<Brush>`, форма — `shape: StatefulValue<Shape>`, внешние отступы — `paddingStart/...: StatefulValue<Dp>` с хелпером `getPaddingValues(interactionSource)`. В модуле уже есть вся нужная инфраструктура: `StatefulValue` с `getValue(interactionSource)`/`getValueAsState(interactionSource)` (`interactions/StatefulValue.kt`), хелперы `asStatefulValue()`/`asStatefulBrush()`, модификатор `Modifier.backgroundBrush(brushProducer, shape)` в `graphics/Background.kt`.

Ключевое требование — аддитивность: существующие стили File не должны измениться визуально.

## Goals / Non-Goals

**Goals:**
- Добавить в `FileColors` свойство `backgroundColor: StatefulValue<Brush>` (+ перегрузки `backgroundColor(...)` в билдере).
- Добавить в `FileStyle` свойство `shape: StatefulValue<Shape>` (+ `shape(Shape)`/`shape(StatefulValue<Shape>)`).
- Добавить в `FileDimensions` раздельные `paddingStart/paddingTop/paddingEnd/paddingBottom: StatefulValue<Dp>` и хелпер `getPaddingValues(interactionSource)` (+ сеттеры с перегрузками `Dp`/`StatefulValue<Dp>`).
- Применить фон (с формой) и внешние отступы к корневому контейнеру в Composable `File`, разрешая значения по `interactionSource`.
- Сохранить обратную совместимость за счёт нейтральных дефолтов.

**Non-Goals:**
- Изменения View-версии File (`sdds-core/uikit/.../File.kt`).
- Введение Motion-инфраструктуры (как в ListItem) — File резолвит значения напрямую по `interactionSource` через `StatefulValue.getValue(...)`/`getValueAsState(...)`, как уже сделано для текста и иконок.
- Изменение токенов и генерации стилей.

## Decisions

- **Все новые свойства — `StatefulValue`.** Чтобы фон/форма/отступы могли зависеть от состояния (по образцу `ListItem`), используем: `backgroundColor: StatefulValue<Brush>`, `shape: StatefulValue<Shape>`, `paddingStart/paddingTop/paddingEnd/paddingBottom: StatefulValue<Dp>`. Значения разрешаются по `interactionSource` через `getValue(...)`/`getValueAsState(...)` из `interactions/StatefulValue.kt`. Альтернатива (плоские `InteractiveColor`/`Shape`/`Dp`) отвергнута: не даёт состоянийзависимости и расходится с каноном `ListItem`.
- **Фон — `StatefulValue<Brush>` (поддержка градиентов).** Свойство `backgroundColor`; в билдере перегрузки `backgroundColor(Color)`, `backgroundColor(InteractiveColor)`, `backgroundColor(Brush)`, `backgroundColor(StatefulValue<Brush>)` — точная калька с `ListItemColorsBuilder` (через `asStatefulBrush()`/`asStatefulValue()`). Дефолт — `Color.Transparent.asStatefulBrush()`. В Composable резолвится `style.colors.backgroundColor.getValueAsState(interactionSource)`.
- **Форма — `StatefulValue<Shape>`, дефолт `RectangleShape.asStatefulValue()`.** Билдер: `shape(Shape)` (через `asStatefulValue()`) и `shape(StatefulValue<Shape>)`. Резолвится `style.shape.getValue(interactionSource)`. `RectangleShape` нейтрален: модификатор фона пропускает построение outline для `RectangleShape`.
- **Отступы — четыре раздельных `StatefulValue<Dp>`, а не единый `PaddingValues`.** По требованию заказчика каждое поле задаётся отдельно (`paddingStart/Top/End/Bottom`), дефолт `0.dp`. Хелпер `getPaddingValues(interactionSource)` собирает `PaddingValues(start, top, end, bottom)` из разрешённых значений; применяется через `Modifier.padding(...)`.
- **Порядок модификаторов в корневом `Column`.** Цепочка: `modifier` → `backgroundBrush(brushProducer = { bg.value }, shape = shape)` → `padding(paddings)` → `width(IntrinsicSize.Max)`. Так фон рисуется на всю область компонента (включая зону отступов), а контент смещается внутрь. `width(IntrinsicSize.Max)` остаётся на контентной части после padding, сохраняя текущую логику измерения ширины.
- **KDoc.** Все новые публичные свойства интерфейсов и методы билдеров получают KDoc на русском, в стиле существующих в файле.

## Risks / Trade-offs

- **[Изменение порядка/области измерения ширины из-за padding]** → padding ставится до `width(IntrinsicSize.Max)`, чтобы `IntrinsicSize.Max` считалась по контенту. Дефолт `0.dp` гарантирует отсутствие изменений у существующих стилей; проверяется скриншот/обычными тестами модуля.
- **[Усложнение API из-за StatefulValue]** → Митигируется перегрузками билдеров (`Color`/`Brush`/`Dp`/`Shape` принимаются напрямую и оборачиваются хелперами), как уже сделано в `ListItem`, поэтому простые сценарии остаются короткими.
- **[Регресс существующих стилей]** → Митигируется нейтральными дефолтами (прозрачная кисть, `RectangleShape`, `0.dp`) и проверкой `:sdds-core:uikit-compose:test`.

Валидация: `:sdds-core:uikit-compose:test`, `:sdds-core:uikit-compose:detekt`, `:sdds-core:uikit-compose:spotlessApply`.
