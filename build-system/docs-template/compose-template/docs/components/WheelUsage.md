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

### Пример будильника с расположением чисел на колесе, начиная сверху колеса
```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/wheel/Wheel_AlarmClockWithEdgePlacement.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.wheel.Wheel_AlarmClockWithEdgePlacement -->

## Стиль Wheel

Стиль Wheel можно настроить с помощью WheelStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/wheel/Wheel_Style.kt
```

## WheelConstraints

Ограничение колёс по ширине.
Возможные значения:
- `Strict` Каждое колесо ограничено по ширине 1/3 доступного пространства в компоненте
- `Loose` У колёс нет ограничений по ширине

### WheelAlignment

Выравнивание составных частей компонента. 
Возможные значения:
- `Start` Все колёса имеют выравнивание по левому краю
- `End` Все колёса имеют выравнивание по правому краю
- `Center` Все колёса имеют выравнивание по центру
- `Mixed` Колеса до центрального имеют выравнивание по левому краю, центральное - по центру, колеса после центрального - по правому краю

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