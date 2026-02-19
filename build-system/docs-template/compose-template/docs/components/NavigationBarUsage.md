---
title: NavigationBar
---
Верхняя панель интерфейса, служащая для навигации и отображения ключевых действий.

В качестве текста, контента и экшенов может принимать произвольный контент.

### Простой пример NavigationBar с встроенным текстом и экшеном в конце

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/navigationbar/NavigationBar_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.navigationbar.NavigationBar_Simple -->

### Пример NavigationBar с встроенными title и description

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/navigationbar/NavigationBar_TitleDescription.kt
```

### Пример NavigationBar с встроенным текстом и контентом снизу

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/navigationbar/NavigationBar_BottomContentInlineText.kt
```

### Пример NavigationBar с текстом и контентом снизу, двумя экшенами справа

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/navigationbar/NavigationBar_BottomTextAndContentMultiplyActions.kt
```

### Пример NavigationBar c абсолютным центрированием встроенного текста

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/navigationbar/NavigationBar_CenterAbsolute.kt
```

### Пример NavigationBar c относительным центрированием встроенного текста

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/navigationbar/NavigationBar_CenterRelative.kt
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

## NavBarCenterAlignmentStrategy

Режим центрирования текстового блока. Работает только при `NavigationBarTextAlign.Center` и `NavigationBarTextPlacement.Inline` (см. [NavigationBarTextAlign](#NavigationBarTextAlign), [NavigationBarTextPlacement](#NavigationBarTextPlacement))

Возможные значения: 

- Relative (Текст центрируется в доступном пространстве между экшенами)
- Absolute (Текст центрируется по ширине компонента независимо от того, сколько пространства занимают экшены)