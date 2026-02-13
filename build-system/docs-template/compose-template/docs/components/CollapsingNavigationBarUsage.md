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

## Стиль CollapsingNavigationBar

Стиль CollapsingNavigationBar можно настроить с помощью CollapsingNavigationBarStyle.builder(). Так же существует набор сгенерированных стилей.

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