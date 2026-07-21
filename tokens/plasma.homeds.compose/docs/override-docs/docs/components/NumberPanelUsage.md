---
title: NumberPanel
---

```kotlin
// @sample: com/sdds/plasma/homeds/docs/samples/NumberPanel_Temperature.kt
```

<!-- @screenshot: com.sdds.plasma.homeds.docs.samples.NumberPanel_Temperature -->

NumberPanel используется для отображения числовых значений, например температуры или влажности.
Целая и дробная части значения, разделитель и иконка настраиваются через стиль компонента.

## Стиль NumberPanel

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/plasma/homeds/docs/samples/NumberPanel_NumberPanelStyle.kt
```

## Режим отображения значения

Режим задается параметром `mode` или готовой вариацией стиля.
Для температуры используется `NumberPanelMode.Temperature`, для влажности - `NumberPanelMode.Humidity`.

```kotlin
// @sample: com/sdds/plasma/homeds/docs/samples/NumberPanel_Humidity.kt
```

<!-- @screenshot: com.sdds.plasma.homeds.docs.samples.NumberPanel_Humidity -->

## Иконка

Готовые стили NumberPanel уже содержат иконку, соответствующую режиму отображения.
Если в стиле иконка не задана, ее можно передать через параметр `icon`.

```kotlin
// @sample: com/sdds/plasma/homeds/docs/samples/NumberPanel_CustomIcon.kt
```

<!-- @screenshot: com.sdds.plasma.homeds.docs.samples.NumberPanel_CustomIcon -->

## Состояние enabled

Для выключенного состояния используйте параметр `enabled`.
Прозрачность выключенного компонента задается в стиле через `disableAlpha`.

```kotlin
// @sample: com/sdds/plasma/homeds/docs/samples/NumberPanel_Disabled.kt
```

<!-- @screenshot: com.sdds.plasma.homeds.docs.samples.NumberPanel_Disabled -->
