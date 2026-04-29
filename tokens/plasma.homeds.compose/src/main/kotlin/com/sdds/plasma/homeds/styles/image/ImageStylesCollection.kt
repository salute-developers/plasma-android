// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.image

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ImageStyle
import com.sdds.compose.uikit.ImageStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Image
 */
public enum class ImageStyles(
    public val key: String,
) {
    ImageRatio1x2("Image.Ratio1x2"),
    ImageRatio9x16("Image.Ratio9x16"),
    ImageRatio3x4("Image.Ratio3x4"),
    ImageRatio2x1("Image.Ratio2x1"),
    ImageRatio16x9("Image.Ratio16x9"),
    ImageRatio4x3("Image.Ratio4x3"),
    ImageRatio1x1("Image.Ratio1x1"),
    ;

    /**
     * Typed API для подбора стиля image
     */
    public companion object
}

/**
 * Возможные значения свойства ratio для image
 */
public enum class ImageRatio {
    Ratio12,
    Ratio916,
    Ratio34,
    Ratio21,
    Ratio169,
    Ratio43,
    Ratio11,
}

/**
 * Возвращает [ImageStyle] для [ImageStyles]
 */
@Composable
public fun ImageStyles.style(modify: @Composable ImageStyleBuilder.() -> Unit = {}): ImageStyle {
    val builder = when (this) {
        ImageStyles.ImageRatio1x2 -> Image.Ratio1x2
        ImageStyles.ImageRatio9x16 -> Image.Ratio9x16
        ImageStyles.ImageRatio3x4 -> Image.Ratio3x4
        ImageStyles.ImageRatio2x1 -> Image.Ratio2x1
        ImageStyles.ImageRatio16x9 -> Image.Ratio16x9
        ImageStyles.ImageRatio4x3 -> Image.Ratio4x3
        ImageStyles.ImageRatio1x1 -> Image.Ratio1x1
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ImageStyles] для image
 */
public fun ImageStyles.Companion.resolve(ratio: ImageRatio = ImageRatio.Ratio12): ImageStyles = when {
    ratio == ImageRatio.Ratio12 -> ImageStyles.ImageRatio1x2
    ratio == ImageRatio.Ratio916 -> ImageStyles.ImageRatio9x16
    ratio == ImageRatio.Ratio34 -> ImageStyles.ImageRatio3x4
    ratio == ImageRatio.Ratio21 -> ImageStyles.ImageRatio2x1
    ratio == ImageRatio.Ratio169 -> ImageStyles.ImageRatio16x9
    ratio == ImageRatio.Ratio43 -> ImageStyles.ImageRatio4x3
    ratio == ImageRatio.Ratio11 -> ImageStyles.ImageRatio1x1
    else -> error("Unsupported image style combination")
}

/**
 * Возвращает [ImageStyle] для image
 */
@Composable
public fun ImageStyles.Companion.style(
    ratio: ImageRatio = ImageRatio.Ratio12,
    modify: @Composable
    ImageStyleBuilder.() -> Unit = {},
): ImageStyle = resolve(ratio).style(modify)
