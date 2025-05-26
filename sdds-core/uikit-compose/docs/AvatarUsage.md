# Package com.sdds.compose.uikit

## Avatar

```kotlin
Avatar( 
    style = Avatar.M.style(),
    status = AvatarStatus.Active,
    placeholder = AvatarPlaceholder.Name("Michael Scott"),
)
```

## Стиль Avatar

Стиль Avatar можно настроить с помощью AvatarStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
AvatarStyle.builder()
.shape(CircleShape)
.colors {  
    backgroundColor(
        SddsServTheme.gradients.surfaceDefaultAccentGradient.asLayered(0.2f).asStatefulValue(),
    )  
    textColor(
        SddsServTheme.gradients.textDefaultAccentGradient.asLayered().asStatefulValue(),
    )
}
.dimensions {
        width(88.0.dp)
        height(88.0.dp)
}
.textStyle(SddsServTheme.typography.headerH2Bold)
.badgeStyle(BadgeSolid.L.Pilled.Accent.style())
.counterStyle(Counter.L.Negative.style())
.statusStyle(
    Indicator.L.modify {
        color {
            backgroundColor(
                SddsServTheme.colors.surfaceOnLightSolidTertiary.asInteractive(
                    setOf(AvatarStatus.Active) 
                    to SddsServTheme.colors.surfaceDefaultPositive,
                ),
            )
        }
    }
    .style(),
)
.style()
```

## Статус Avatar

Статус задается с помощью свойства status. Возможные значения: "active", "inactive", "none".

```kotlin
Avatar(status = AvatarStatus.Active)
```

## Инициалы вместо фотографии

Если не задан ресурс изображения, инициалы можно задать с помощью свойства placeholder -> name. Желательный формат строки - "Имя Фамилия".

```kotlin
Avatar(
    style = Avatar.M.style(),
    status = AvatarStatus.Active,
    actionEnabled = false,
    placeholder = AvatarPlaceholder.Name("Michael Scott"),
)
```

## Дополнительный контент

Дополнительный контент ("обвесы") устанавливается с помощью свойства extra.
В качестве дополнительного контента предполагается использование Counter или Badge, стиль которых уже определен стилем самого Avatar.
В этом случае в extra нужно передать Badge с параметром label или Counter c параметром count.
Положение extra контента задается через Modifier.align.

```kotlin
 Avatar (
    style = Avatar.L.style(),
    placeholder = AvatarPlaceholder.Name("Michael Scott"),
    extra = { Counter(modifier = Modifier.align(Alignment.TopEnd),
            count = "1") },
    content = { }
)
```

## Avatar как extension к Modifier

Модификатор, который декорирует компонент как аватар. Его можно использовать в ситуациях, когда Avatar использовать не удается.
Например, когда используются собственная или библиотечная реализация: GlideImage() библиотеки Glide Compose или AsyncImage библиотеки coil.

```kotlin
AsyncImage(
    modifier = Modifier.avatar(
        shape: Shape = RoundedCornerShape(50),
        statusColor: Color = Color.DarkGray,
        statusSize: Dp = 8.dp,
        statusOffset: Offset = Offset.Zero,
    ),
    model = "https://cdn.example.com/test.png",
)
```
