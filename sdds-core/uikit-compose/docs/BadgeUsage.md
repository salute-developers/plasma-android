# Package com.sdds.compose.uikit

## Badge и IconBadge

```kotlin
Badge(
    style = BadgeSolid.L.Default.style(),
    label = "Label",
    startContent = 
        Icon(
            painter = painterResource(id = R.drawable.ic_plasma_16),
            contentDescription = "",
        ),
)
```

## Стиль Badge

Стиль Badge можно настроить с помощью BadgeStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
BadgeStyle.builder()
.shape(CircleShape)
.colors {
    backgroundColor(
        SddsServTheme.colors.surfaceOnDarkSolidDefault.asInteractive(),
    )
    labelColor(
        SddsServTheme.colors.textOnLightPrimary.asInteractive(),
    )
    startContentColor(
        SddsServTheme.colors.textOnLightPrimary.asInteractive(),
    )
    endContentColor(
        SddsServTheme.colors.textOnLightPrimary.asInteractive(),
    )
}
.labelStyle(SddsServTheme.typography.bodySNormal)
.dimensions {
        height(28.0.dp)
        startContentSize(16.0.dp)
        endContentSize(16.0.dp)
        startContentMargin(4.0.dp)
        endContentMargin(4.0.dp)
        startPadding(11.0.dp)
        endPadding(11.0.dp)
}
.style()
```

## Иконка Badge

В левой или/и правой части badge можно отобразить иконку. Если нужен Badge с иконкой без текста, можно использовать либо startContent либо endContent, но лучше использовать компонент IconBadge.

```kotlin
Badge(
    style = BadgeSolid.L.Pilled.Accent.style(),
    label = "",
    startContent = {
        Icon(
            painter = painterResource(id = R.drawable.ic_plasma_16),
            contentDescription = "",
        )
    }
)
```

## IconBadge

То же, что и Badge, но предназначен для отображения только иконки, поэтому не имеет параметра "label".

```kotlin
IconBadge(
    style = IconBadgeSolid.L.Pilled.Accent.style(),
    content = {
        Icon(
            painter = painterResource(id = R.drawable.ic_plasma_16),
            contentDescription = "",
        )
    }
)
```
