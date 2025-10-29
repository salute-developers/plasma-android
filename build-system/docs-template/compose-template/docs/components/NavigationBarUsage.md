---
title: NavigationBar
---
Верхняя панель интерфейса, служащая для навигации и отображения ключевых действий.

В качестве текста, контента и экшенов может принимать произвольный контент.

```kotlin
NavigationBar(
    style = NavigationBarMainPage.HasBackground.Shadow.Rounded.style(),
    textPlacement = NavigationBarTextPlacement.Inline,
    contentPlacement = NavigationBarContentPlacement.Inline,
    textAlign = NavigationBarTextAlign.Start,
    textContent = { Text("Text") },
    content = { Text("Content") },
    actionStart = {
        Icon(
            painter = painterResource(com.sdds.icons.R.drawable.ic_search_24),
            contentDescription = "",
        )
    },
    actionEnd = {
        Icon(
            painter = painterResource(com.sdds.icons.R.drawable.ic_menu_24),
            contentDescription = "",
        )
    },
)
```

## Стиль NavigationBar

Стиль NavigationBar можно настроить с помощью NavigationBarStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
NavigationBarStyle.builder()
    .shadow({{ docs-theme-codeReference }}.shadows.downSoftM)
    .bottomShape({{ docs-theme-codeReference }}.shapes.roundL)
    .textStyle({{ docs-theme-codeReference }}.typography.bodyLBold)
    .backIcon(com.sdds.icons.R.drawable.ic_disclosure_left_outline_24)
    .colors {
        backIconColor(
            {{ docs-theme-codeReference }}.colors.textDefaultPrimary.asInteractive(),
        )
        textColor(
            {{ docs-theme-codeReference }}.colors.textDefaultPrimary.asInteractive(),
        )
        actionStartColor(
            {{ docs-theme-codeReference }}.colors.textDefaultPrimary.asInteractive(),
        )
        actionEndColor(
            {{ docs-theme-codeReference }}.colors.textDefaultPrimary.asInteractive(),
        )
        backgroundColor(
            {{ docs-theme-codeReference }}.colors.surfaceDefaultClear.asInteractive(),
        )
    }
    .dimensions {
        paddingStart(20.0.dp)
        paddingEnd(20.0.dp)
        paddingTop(20.0.dp)
        paddingBottom(20.0.dp)
        backIconMargin(4.0.dp)
        textBlockTopMargin(16.0.dp)
        horizontalSpacing(16.0.dp)
    }
    .style()
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