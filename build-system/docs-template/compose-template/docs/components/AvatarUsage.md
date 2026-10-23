---
title: Avatar
---

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/avatar/Avatar_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.avatar.Avatar_Simple -->

## Стиль Avatar

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

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

## Состояния и Motion API

В `Avatar` и `Modifier.avatar(...)` можно передать `motion: Motion<AvatarMotionStyle>`.
`rememberAvatarMotion()` использует `LocalAvatarMotionStyle`, если стиль переходов не указан явно.
`StatefulValue` задаёт значения для состояний, а `AvatarMotionStyle` — переходы фона, текста, иконки действия и фона иконки действия.
По умолчанию все переходы используют `noMotion()`: значения меняются без анимации.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/avatar/Avatar_Motion.kt
```

Для передачи взаимодействий используйте `motion.context.interactionSource` также в `clickable`.
Статус `AvatarStatus` публикуется в `motion.context.semanticStateSource` автоматически;
индикатор статуса использует общий с аватаром `MotionContext`.
Форма и размеры переключаются по состояниям без интерполяции.
В `AvatarGroup` у каждого аватара собственный контекст: смена статуса одного элемента не анимирует соседей.

### Переход со старых свойств

Существующие вызовы с `interactionSource` сохраняются (перегрузка помечена deprecated) и делегируют motion-реализации.
Для чтения текущих значений используйте stateful-свойства `shapes`, `textStyles`, `colors.textBrushes`,
`colors.backgroundBrushes`, `colors.actionBrushes`, `colors.actionScrimBrushes`
и размерные свойства с суффиксом `Values`, например `dimensionValues.widthValues`.
