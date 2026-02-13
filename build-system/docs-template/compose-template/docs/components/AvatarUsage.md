---
title: Avatar
---

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/avatar/Avatar_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.avatar.Avatar_Simple -->

## Стиль Avatar

Стиль Avatar можно настроить с помощью AvatarStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/avatar/Avatar_Style.kt
```

## Статус Avatar

Статус задается с помощью свойства status. Возможные значения: "active", "inactive", "none".

```kotlin
Avatar(status = AvatarStatus.Active)
```

## Инициалы вместо фотографии

Если не задан ресурс изображения, инициалы можно задать с помощью свойства placeholder -> name. Желательный формат строки - "Имя Фамилия".

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/avatar/Avatar_ActionDisabled.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.avatar.Avatar_ActionDisabled -->

## Дополнительный контент

Дополнительный контент ("обвесы") устанавливается с помощью свойства extra.
В качестве дополнительного контента предполагается использование Counter или Badge, стиль которых уже определен стилем самого Avatar.
В этом случае в extra нужно передать Badge с параметром label или Counter c параметром count.
Положение extra контента задается через Modifier.align.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/avatar/Avatar_Extra.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.avatar.Avatar_Extra -->

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
