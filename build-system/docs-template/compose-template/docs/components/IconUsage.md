---
title: Icon
---

`Icon` используется для отображения изображений в разных форматах через `ImageSource`,  
с поддержкой окрашивания через `brushProducer` и семантического описания контента для систем доступности.  

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/icon/Icon_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.icon.Icon_Simple -->

## Варианты использования

`Icon` принимает `ImageSource`, который можно создать из нескольких типов источников:

- drawable-ресурс

- Painter

- ImageVector

- ImageBitmap

### Drawable resource

Для ресурсов удобно использовать `resourceImageSource`. 

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/icon/Icon_Simple.kt
```

### Painter

Используется, если необходимо вручную создать `ImageSource` на основе `Painter`:  

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/icon/Icon_Painter.kt
```

### ImageVector

Используется для отображения векторной иконки через `ImageVector`.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/icon/Icon_ImageVector.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.icon.Icon_Image -->

### ImageBitmap

Используется для отображения растровых изображений:

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/icon/Icon_Bitmap.kt
```

## Цвет и кисть

Если нужен общий цвет по умолчанию, его можно задать через composition local `LocalTintBrushProducer`:

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/icon/Icon_LocalTint.kt
```

или напрямую через `brushProducer`:

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/icon/Icon_Brush.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.icon.IconCompositionLocal_Simple -->

## Настройка размера

Размер изображения (иконки) определяется:  

- либо intrinsic-size Painter,

- либо значением из `LocalIconDefaultSize` (специальный CompositionLocal)

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/icon/Icon_DefaultSize.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.icon.IconCompositionLocalSize_Simple -->

## Semantics

 Если передан contentDescription, иконка будет доступна для систем доступности (например TalkBack).  
 Если contentDescripition не указан, иконка считается декоративной и не будет озвучиваться.
