---
title: NavigationBar
---
Верхняя панель интерфейса, служащая для навигации и отображения ключевых действий.

В качестве текста, контента и экшенов может принимать произвольный контент.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/navigationbar/NavigationBar_Simple.kt
```

## Стиль NavigationBar

Стиль NavigationBar можно настроить с помощью NavigationBarStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/navigationbar/NavigationBar_Style.kt
```

## NavigationBarTextPlacement

Расположение текста. Возможные значения: Inline (встроен в основной блок), Bottom (снизу от основного блока)

## NavigationBarContentPlacement

Расположение контента. Возможные значения: Inline (встроен в основной блок), Bottom (снизу от основного блока)

## NavigationBarTextAlign

Выравнивание встроенного текста (при textPlacement == NavigationBarTextPlacement.Inline). 
Возможные значения:

- Start (Текст расположен слева, оба экшена справа), 
- Center (Текст расположен в центре, левый экшен слева, правый экшен справа), 
- End (Текст расположен справа, оба экшена слева)