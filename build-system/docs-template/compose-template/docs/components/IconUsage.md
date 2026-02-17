---
title: Icon
---

`Icon` используется для отображения изображений (иконок) в разных форматах (векторных, растровых  
или на основе painter), с поддержкой окрашивания (`tint`) и семантического описания контента для систем доступности.  

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/icon/Icon_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.icon.Icon_Simple -->

## Варианты использования

`Icon` поддерживает несколько типов входных данных:  

- Painter

- ImageVector

- ImageBitMap

### Painter

Используется, если необходимо отрисовать иконку через painter (например из ресурсов):  

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/icon/Icon_Image.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.icon.Icon_Image -->

### ImageBitmap

Используется для отображения растровых изображений (например, аватаров):  

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/icon/Icon_Bitmap.kt
```  

## Настройка tint

 Окрас иконки можно задать через параметр `tint`.  
 Если tint = Color.Unspecified, окрашивание не применяется.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/icon/IconTint_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.icon.Icon_Simple -->

Так же цвет окрашивания можно задать по умолчанию, глобально, через CompositionLocal. Для этого существует  
специальный CompositionLocal - `LocalTint`.  

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/icon/IconCompositionLocal_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.icon.IconCompositionLocal_Simple -->

## Настройка размера

Размер изображения (иконки) определяется:  

- либо intrinsic-size Painter,

- либо значением из `LocalIconDefaultSize` (специальный CompositionLocal)

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/icon/IconCompositionLocalSize_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.icon.IconCompositionLocalSize_Simple -->

## Semantics

 Если передан contentDescription, иконка будет доступна для систем доступности (например TalkBack).  
 Если contentDescripition не указан, иконка считается декоративной и не будет озвучиваться.