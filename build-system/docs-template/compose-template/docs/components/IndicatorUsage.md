---
title: Indicator
--- 

Компонент Indicator как правило используется в составе других, более сложных компонентов (обычно для отображения статуса),
например в Avatar, TextField и др.

```kotlin
  Indicator(
    style = Indicator.L.Default.style(),
)
```

## Стиль Indicator

Стиль Indicator можно настроить с помощью IndicatorStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
IndicatorStyle.builder(this)
    .color {
        backgroundColor(
            {{ docs-theme-codeReference }}.colors.surfaceOnDarkSolidDefault.asInteractive(),
        )
    }
    .dimensions {
        height(12.0.dp)
        width(12.0.dp)
    }
    .style()
```

## Indicator как extension к Modifier

Отличительной особоенностью такого использования является то, что появляется возможность отрисовки Indicator
как внутри границ декорируемого компонента, так и снаружи. Для того чтоб отобразить Indicator снаружи composable
нужно установить параметры horizontalMode и/или verticalMode как IndicatorMode.Outer

```kotlin
Avatar(
    modifier = Modifier
        .indicator(
            alignment = Alignment.TopEnd,
            style = Indicator.L.Black.style(),
            horizontalPadding = 5.dp,
            verticalPadding = 5.dp,
            horizontalMode = IndicatorMode.Outer,
            verticalMode = IndicatorMode.Outer,
        ),
    style = Avatar.Xxl.style(),
    status = AvatarStatus.None,
    painter = painterResource(id = R.drawable.il_avatar_test),
    actionEnabled = false,
    placeholder = AvatarPlaceholder.Name("Michael Scott"),
)
```
