---
title: Icon
--- 

`Icon` используется для отображения изображений (иконок) в разных форматах (векторных, растровых  
или на основе painter), с поддержкой окрашивания (`tint`) и семантического описания контента для систем доступности.  

```kotlin
Icon(
    painter = painterResource(R.drawable.ic_alarm_done_fill_36),
    contentDescription = "Будильник"
)
```

## Варианты использования

`Icon` поддерживает несколько типов входных данных:  

- Painter

- ImageVector

- ImageBitMap

### Painter

Используется, если необходимо отрисовать иконку через painter (например из ресурсов):  

```kotlin
Image(
    painter = painterResource(R.drawable.ic_alarm_done_fill_36),
    contentDescription = null
)
```

### ImageBitmap

Используется для отображения растровых изображений (например, аватаров):  

```kotlin
val bitmap = ImageBitmap.imageResource(R.drawable.ic_avatar)
Image(
    bitmap = bitmap,
    contentDescription = "Avatar"
)
```  

## Настройка tint

 Окрас иконки можно задать через параметр `tint`.  
 Если tint = Color.Unspecified, окрашивание не применяется.

```kotlin
Image(
    painter = painterResource(R.drawable.ic_alarm_done_fill_36),
    contentDescription = null,
    tint = Color.Red
)
```

Так же цвет окрашивания можно задать по умолчанию, глобально, через CompositionLocal. Для этого существует  
специальный CompositionLocal - `LocalTint`.  

```kotlin
CompositionLocalProvider(LocalTint provides Color.Blue) {
    Image(
        painter = painterResource(R.drawable.ic_alarm_done_fill_36),
        contentDescription = null
    )
}
```

## Настройка размера

Размер изображения (иконки) определяется:  

- либо intrinsic-size Painter,

- либо значением из `LocalIconDefaultSize` (специальный CompositionLocal)

```kotlin
CompositionLocalProvider(LocalIconDefaultSize provides DpSize(24.dp, 24.dp)) {
    Icon(
        painter = painterResource(R.drawable.ic_alarm_done_fill_36),
        contentDescription = null
    )
}
```

## Semantics

 Если передан contentDescription, иконка будет доступна для систем доступности (например TalkBack).  
 Если contentDescripition не указан, иконка считается декоративной и не будет озвучиваться.