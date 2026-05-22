---
title: NavigationDrawer
---

NavigationDrawer - боковая панель навигации с двумя состояниями: `Expanded` и `Collapsed`.
В развёрнутом состоянии отображает иконки, текстовый контент, end-контент и indicator. В схлопнутом состоянии
остаётся видимым интерактивным rail и скрывает текстовые и end-слоты.

В качестве элементов навигации используется `NavigationDrawerItem`. В `icon`, `titleContent`, `endContent`,
`indicator`, `header` и `footer` можно передавать произвольный composable-контент.

## NavigationDrawer в развёрнутом состоянии

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/navigationdrawer/NavigationDrawer_Expanded.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.navigationdrawer.NavigationDrawer_Expanded -->

## NavigationDrawer в схлопнутом состоянии

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/navigationdrawer/NavigationDrawer_Collapsed.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.navigationdrawer.NavigationDrawer_Collapsed -->

## Раскрытие при фокусе

Если передать `expandOnFocus = true`, drawer будет раскрываться при получении фокуса внутри subtree
и схлопываться при потере фокуса.

## Состояние NavigationDrawer

Для управления состоянием используется `NavigationDrawerState`, который можно создать через
`rememberNavigationDrawerState()`.

Основные возможности состояния:

- `currentValue` - текущее зафиксированное состояние.
- `targetValue` - целевое состояние.
- `progress` - прогресс раскрытия от `0f` (`Collapsed`) до `1f` (`Expanded`).
- `expand()` - раскрывает drawer.
- `collapse()` - схлопывает drawer.
- `snapTo(value)` - мгновенно устанавливает состояние без визуального перехода.

## NavigationDrawerItem

`NavigationDrawerItem` поддерживает выбранное и отключённое состояние, обработчик клика и слоты контента.
В схлопнутом состоянии отображается start-зона с `icon`, а `titleContent`, `endContent` и end-indicator
скрываются. Indicator дополнительно может отображаться поверх start-зоны в схлопнутом состоянии.

## Стиль NavigationDrawer

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать
собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder`
и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->
