---
title: Select
---

`Select` — Компонент с возможностью выбора одного или нескольких вариантов в выпадающем списке.
В качестве триггера ожидает `SelectButton` или `SelectTextField`. В качестве контента - список из `SelectItem`.

## Примеры использования

Select нужно использовать с `SelectTextField` либо с `SelectButton`. 
Они представляют собой обертки над `TextField` и `Button`, принимают их стиль и предоставляют часть их api, 
а также содержат дополнительный функционал, необходимый для `Select`.

### SelectTextField

Пример с `SelectTextField` и множественным выбором:

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/select/Select_MultipleTextFieldLike.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.select.Select_MultipleTextFieldLike -->

Пример с `SelectTextField` и единичным выбором:

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/select/Select_SingleTextFieldLike.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.select.Select_SingleTextFieldLike -->

### SelectButton

Пример с `SelectButton` и единичным выбором:

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/select/Select_SingleButtonLike.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.select.Select_SingleButtonLike -->

Пример с `SelectButton` и множественным выбором:

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/select/Select_MultipleButtonLike.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.select.Select_MultipleButtonLike -->

### SelectItem

Элемент списка `Select`. Может быть выбранным и ожидает в качестве контента [Cell](CellUsage).

```kotlin
SelectItem(
    modifier = Modifier.fillMaxWidth(),
    checked = checkedStateManager.isSelected(SelectList[it]),
    onClick = {
        checkedStateManager.onItemPressed(SelectList[it])
    },
) {
    Cell(
        title = AnnotatedString(SelectList[it]),
        disclosureIconRes = null,
    )
}
```

## Работа с компонентом

### Stateful-стиль и Motion SelectItem

`checked` публикуется как `InteractiveState.Selected` в семантическом источнике строки.
Стиль может сочетать Selected с Pressed, Hovered и Focused. Строки независимы по умолчанию.
Новые перегрузки обеих форм `SelectItem` принимают `motion: Motion<SelectItemMotionStyle>`;
старые вызовы сохраняются и используют прежний `interactionSource` и `LocalSelectItemMotionStyle`.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/select/SelectItem_Motion.kt
```

Встроенные Cell (форма с `titleContent`) и CheckBox разделяют контекст строки, сохраняя
собственные MotionStyle, checked/enabled и собственные состояния. Выбор изменяется одним
`onClick` строки. Для Cell внутри произвольного `content` контекст передаётся явно:

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/select/SelectItem_CustomCellMotion.kt
```

| Владелец | Новое значение | Старый getter |
| --- | --- | --- |
| SelectItemStyle | `shapes: StatefulValue<Shape>` | `shape` |
| SelectItemColors | `backgroundBrush`, `iconBrush`: `StatefulValue<Brush>` | `backgroundColor`, `iconColor` |
| SelectItemDimensions | `controlSizeValues`, `controlMarginValues`, `paddingStartValues`, `paddingEndValues`, `paddingTopValues`, `paddingBottomValues`, `heightValues`: `StatefulValue<Dp>` | те же имена без `Values` |

Builder-методы сохраняют прежние имена и принимают как статические значения, так и
`StatefulValue`. Цвета дополнительно принимают `Brush`. Старые getters помечены Deprecated:
форма и размеры возвращают default; цветовые getters возвращают
`Color.Transparent.asInteractive()`, как в Cell/Chip. Default, selected и комбинированные
состояния старых цветовых builder-вызовов сохраняются в новом Brush API, включая градиенты.

Произвольная `Shape` поддерживается; форма и все размеры переключаются без интерполяции через
`getValueAsState(motion.context)`, как размеры BaseTextField. Фон и indication
используют одну разрешённую форму. MotionStyle содержит два перехода Brush,
по умолчанию `noMotion()`. Неконечные Dp переключаются без анимации и без замены на ноль.
`height` сохраняет смысл минимальной высоты, а место контрольной иконки резервируется
даже при её отсутствии. `disableAlpha`, вложенные стили и ImageSource-контракт не меняются.

Обычные вызовы и сгенерированные стили совместимы. Собственные реализации интерфейсов
SelectItemStyle/Colors/Dimensions и их builder-ов нужно дополнить новыми членами.

### SelectState

Для работы с компонентом необходимо создать экземпляр `SelectState` и передать его в `Select`. 
Он служит для управления состоянием компонента открыт / закрыт. 
```kotlin
val state = remember { SelectState(initialState = true) }
Select(
    state = state
)
```
Список открывается и закрывается автоматически при активации / деактивации триггера. 
При необходимости состоянием можно управлять вручную:
```kotlin
state.open() // открыть список
state.close // закрыть список
state.toggle // переключить текущее состояние
```

### SelectDataStateManager

Для управления состоянием элементов `выбран` / `не выбран` лучше использовать ViewModel, но если она не используется, 
то существует интерфейс `SelectDataStateManager<T>` и две реализации для множественного и одиночного выбора.
Реализации доступны с помощью функций `rememberSelectMultipleDataStateManager()` и `rememberSelectSingleDataStateManager()`

### EmptyState

Чтобы показать пустое состояние, необходимо передать контент пустого состояния в `emptyContent` и установить `showEmptyState`. 
В скоупе dropdown существует преднастроенный компонент `EmptyState()`. 
Рекомендуется использовать его в качестве контента для `emptyState`.

### Footer / header
Чтобы показывать индикатор загрузки или произвольный контент в нижней части списка, необходимо передать контент в `footer`.

Чтобы показывать произвольный контент в верхней части списка, необходимо передать контент в `header`.

## Стиль Select

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/select/Select_Style.kt
```
