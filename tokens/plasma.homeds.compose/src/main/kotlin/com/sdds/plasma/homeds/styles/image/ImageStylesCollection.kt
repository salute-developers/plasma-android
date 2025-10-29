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
}

/**
 * Возвращает [ImageStyle] для [ImageStyles]
 */
@Composable
public fun ImageStyles.style(modifyAction: @Composable ImageStyleBuilder.() -> Unit = {}): ImageStyle {
    val builder = when (this) {
        ImageStyles.ImageRatio1x2 -> Image.Ratio1x2
        ImageStyles.ImageRatio9x16 -> Image.Ratio9x16
        ImageStyles.ImageRatio3x4 -> Image.Ratio3x4
        ImageStyles.ImageRatio2x1 -> Image.Ratio2x1
        ImageStyles.ImageRatio16x9 -> Image.Ratio16x9
        ImageStyles.ImageRatio4x3 -> Image.Ratio4x3
        ImageStyles.ImageRatio1x1 -> Image.Ratio1x1
    }
    return builder.modify(modifyAction).style()
}
