// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ImageStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.image.Image
import com.sdds.plasma.homeds.styles.image.ImageRatio
import com.sdds.plasma.homeds.styles.image.ImageStyles
import com.sdds.plasma.homeds.styles.image.Ratio16x9
import com.sdds.plasma.homeds.styles.image.Ratio1x1
import com.sdds.plasma.homeds.styles.image.Ratio1x2
import com.sdds.plasma.homeds.styles.image.Ratio2x1
import com.sdds.plasma.homeds.styles.image.Ratio3x4
import com.sdds.plasma.homeds.styles.image.Ratio4x3
import com.sdds.plasma.homeds.styles.image.Ratio9x16
import com.sdds.plasma.homeds.styles.image.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsImageVariationsCompose : ComposeStyleProvider<ImageStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "ratio",
                value = "Ratio12",
                variants = listOf("Ratio12", "Ratio916", "Ratio34", "Ratio21", "Ratio169", "Ratio43", "Ratio11"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<ImageStyle>> =
        mapOf(
            "Image.Ratio1x2" to ComposeStyleReference { Image.Ratio1x2.style() },
            "Image.Ratio9x16" to ComposeStyleReference { Image.Ratio9x16.style() },
            "Image.Ratio3x4" to ComposeStyleReference { Image.Ratio3x4.style() },
            "Image.Ratio2x1" to ComposeStyleReference { Image.Ratio2x1.style() },
            "Image.Ratio16x9" to ComposeStyleReference { Image.Ratio16x9.style() },
            "Image.Ratio4x3" to ComposeStyleReference { Image.Ratio4x3.style() },
            "Image.Ratio1x1" to ComposeStyleReference { Image.Ratio1x1.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ImageStyles.resolve(
            ratio = when (bindings["ratio"]?.toString()) {
                "Ratio12" -> ImageRatio.Ratio12
                "Ratio916" -> ImageRatio.Ratio916
                "Ratio34" -> ImageRatio.Ratio34
                "Ratio21" -> ImageRatio.Ratio21
                "Ratio169" -> ImageRatio.Ratio169
                "Ratio43" -> ImageRatio.Ratio43
                "Ratio11" -> ImageRatio.Ratio11
                else -> ImageRatio.Ratio12
            },
        ).key
    }
}
