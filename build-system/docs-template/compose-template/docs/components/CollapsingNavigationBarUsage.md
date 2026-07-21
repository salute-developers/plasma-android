---
title: CollapsingNavigationBar
---
Верхняя панель интерфейса, служащая для навигации и отображения ключевых действий. 
Умеет сворачиваться и разворачиваться в запвисимости от состояния скролла на экране.

В качестве заголовка, описания, контента и экшенов может принимать произвольный контент.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/collapsingnavigationbar/CollapsingNavigationBar_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.collapsingnavigationbar.CollapsingNavigationBar_Simple -->

## Использование с коротким списком

По умолчанию `exitUntilCollapsedScrollBehavior` обрабатывает события вложенного скролла всегда. Поэтому навигационная панель может схлопываться при жесте над списком, даже если все его элементы помещаются во вьюпорте.

Чтобы панель реагировала на скролл только тогда, когда список действительно можно прокрутить, передайте в `canScroll` состояние `LazyColumn`:

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/collapsingnavigationbar/CollapsingNavigationBar_ShortList.kt
```

При такой настройке жест над коротким списком не схлопывает панель. При этом панель по-прежнему можно схлопывать и раскрывать жестом непосредственно на ней — это ожидаемое поведение `CollapsingNavigationBar`.

## Стиль CollapsingNavigationBar

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/collapsingnavigationbar/CollapsingNavigationBar_Style.kt
```

## NavigationBarTextAlign

Выравнивание текста. 
Возможные значения:

- Start (Текст расположен слева, оба экшена справа), 
- Center (Текст расположен в центре, левый экшен слева, правый экшен справа), 
- End (Текст расположен справа, оба экшена слева)
