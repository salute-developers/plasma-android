---
title: Indicator
---

Компонент Indicator как правило используется в составе других, более сложных компонентов (обычно для отображения статуса),
например в Avatar, TextField и др.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/indicator/Indicator_Simple.kt
```

## Стиль Indicator

Стиль Indicator можно настроить с помощью IndicatorStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/indicator/Indicator_Style.kt
```

## Indicator как extension к Modifier

Отличительной особоенностью такого использования является то, что появляется возможность отрисовки Indicator
как внутри границ декорируемого компонента, так и снаружи. Для того чтоб отобразить Indicator снаружи composable
нужно установить параметры horizontalMode и/или verticalMode как IndicatorMode.Outer

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/indicator/AvatarIndicator_Simple.kt
```
