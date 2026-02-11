---
title: TabBar
---

Компонент для навигации между разделами интерфейса
В качестве контента принимает либо [TabBarItem](#tabbaritem) либо произвольный контент. 
TabBarItem в качестве extra ожидает [Counter](CounterUsage.md), [Badge](BadgeUsage.md), [Indicator](IndicatorUsage.md) либо произвольный контент.

По умолчанию элементы добавляются с weight = 1 и равномерно занимают доступную ширину TabBar.
Если необходимо добавить элемент произвольной ширины, необходимо при использовании функции tabItem() установить параметр weight = null.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/tabbar/TabBar_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.tabbar.TabBar_Simple -->

## Стиль TabBar

Для TabBar существует набор сгенерированных стилей. Также стиль можно настроить с помощью TabBarStyle.builder().

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/tabbar/TabBar_Style.kt
```

## TabBarItem

Элемент панели навигации TabBar. При использовании в TabBar TabBarItem стилизуется автоматически. Также можно настроить стиль элемента с помощью TabBarItemStyle.builder().

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/tabbar/TabBarItem_Style.kt
```
