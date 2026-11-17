---
title: Wheel
---

Вертикальное колесо выбора. 
Используется для выбора одного значения из списка с визуальным фокусом на текущем значении.

### Простой пример Wheel с одним колесом

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/wheel/Wheel_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.wheel.Wheel_Simple -->

### Пример будильника с контролами и разделителем "двоеточие"
```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/wheel/Wheel_AlarmClockWithControlsAndSeparator.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.wheel.Wheel_AlarmClockWithControlsAndSeparator -->

### Пример будильника с выраниванием по центру и Divider в качестве разделителя
```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/wheel/Wheel_CenteredAlarmClockWithControlsAndDivider.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.wheel.Wheel_CenteredAlarmClockWithControlsAndDivider -->

### Пример с распределением ширины по контенту центрального колеса
```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/wheel/Wheel_CenteredContentWidthMode.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.wheel.Wheel_CenteredContentWidthMode -->

### Пример будильника с расположением чисел на колесе, начиная сверху колеса
```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/wheel/Wheel_AlarmClockWithEdgePlacement.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.wheel.Wheel_AlarmClockWithEdgePlacement -->

## Стиль Wheel

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/wheel/Wheel_Style.kt
```

## Индикатор выбранного элемента

Компонент поддерживает отображение прямоугольного индикатора, выделяющего центральный (выбранный) элемент. Индикатор рисуется под всеми колёсами как единый прямоугольник, охватывающий всю группу.

Индикатор настраивается через `WheelStyle` и включается флагом `itemSelectorEnabled`:

```kotlin
WheelStyle.builder()
    .itemSelectorEnabled(true)
    .itemSelectorShape(RoundedCornerShape(8.dp))
    .colors {
        itemSelectorColor(Color(0x1A0066FF))
    }
    .dimensions {
        itemSelectorPaddingTop(2.dp)
        itemSelectorPaddingBottom(2.dp)
    }
    .style()
```

## WheelConstraints

Ограничение колёс по ширине.
Влияют на колёса, измеряемые по ширине контента: в `WheelWidthMode.CenterContent` так измеряются все колёса, кроме крайних.
Возможные значения:
- `Strict` Колесо, измеряемое по ширине контента, дополнительно ограничено 1/N доступного пространства в компоненте
- `Loose` У колёс нет ограничений по ширине

### WheelAlignment

Выравнивание контента в колёсах. Распределение ширины между колёсами задаётся отдельно — [WheelWidthMode](#wheelwidthmode).
Возможные значения:
- `Start` Все колёса имеют выравнивание по левому краю
- `End` Все колёса имеют выравнивание по правому краю
- `Center` Все колёса имеют выравнивание по центру
- `Mixed` Колеса до центрального имеют выравнивание по правому краю, центральное - по центру, колеса после центрального - по левому краю

### WheelWidthMode

Распределение ширины между колёсами. Применяется только когда ширина компонента ограничена снаружи (например, `Modifier.fillMaxWidth()`); при `wrap_content` все колёса измеряются по ширине контента и режим не применяется.
Возможные значения:
- `Auto` (по умолчанию) Для `alignment = Mixed` используется `CenterContent`, для остальных выравниваний — `Equal`
- `Equal` Все колёса занимают равную долю доступной ширины
- `CenterContent` Колёса, кроме крайних, измеряются по ширине контента (с учётом `WheelConstraints`); крайние колёса делят оставшуюся ширину поровну. При одном или двух колёсах эквивалентен `Equal`

Комбинация `alignment = Center` + `widthMode = CenterContent` даёт пикер, в котором центральное колесо занимает ширину по контенту, боковые — остаток ширины, а контент всех колёс отцентрован.

### DataEdgePlacement

Способ размещения данных на колесе. 
Возможные значения:
- `WheelCenter` Данные начинаются и заканчиваются на середине колеса
- `WheelEdge` Данные начинаются и заканчиваются на краю колеса

### WheelSeparator

Тип разделителя. 
Возможные значения:
- `None` Разделитель отсутствует
- `Dots` Две точки в качестве разделителя
- `Divider` Divider в качестве разделителя

### WheelDataSet

Набор данных, необходимый для отображения колеса.

Свойства:
- `dataSet: List<WheelItemData>`
Основной набор данных. Содержит список элементов колеса типа WheelItemData.

- `description: String?` 
Опциональное, значение по умолчанию: null
Текстовое описание набора данных. Может быть пустым или отсутствовать.

- `initialIndex: Int`
Значение по умолчанию: 0
Начальный индекс, указывающий на позицию элемента, который должен быть виден первым при отображении колеса.

### WheelItemData

Класс, описывающий данные отдельного элемента колеса.

Свойства:
- `text: String`
Значение по умолчанию: ""
Основной текст элемента колеса. Отображается как ключевая информация.

- `textAfter: String`
Значение по умолчанию: ""
Дополнительный текст, который может отображаться после основного текста элемента. Используется для уточнений или вспомогательной информации.