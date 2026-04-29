---
title: TabBar
---

Компонент для навигации между разделами интерфейса
В качестве контента принимает либо [TabBarItem](#tabbaritem) либо произвольный контент. 
TabBarItem в качестве extra ожидает [Counter](CounterUsage.md), [Badge](BadgeUsage.md), [Indicator](IndicatorUsage.md) либо произвольный контент.

По умолчанию элементы добавляются с weight = 1 и равномерно занимают доступную ширину TabBar.
Если необходимо добавить элемент произвольной ширины, необходимо при использовании функции tabItem() установить параметр weight = null.

### Простой пример TabBar

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/tabbar/TabBar_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.tabbar.TabBar_Simple -->

### Пример TabBar с Counter

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/tabbar/TabBar_WithCounter.kt
```

### Пример TabBar с кастомным центральным элементом с фиксированной шириной

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/tabbar/TabBar_CustomItem.kt
```

## Стиль TabBar

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/tabbar/TabBar_Style.kt
```

## TabBarItem

Элемент панели навигации `TabBar`. При использовании внутри `TabBar` компонент стилизуется автоматически. Если нужен отдельный стиль для элемента, используйте `TabBarItemStyle.builder()`. Общие принципы работы `Style` и `StyleBuilder` описаны в разделе [Стилизация компонентов](../theme/Styles.md).

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/tabbar/TabBarItem_Style.kt
```
