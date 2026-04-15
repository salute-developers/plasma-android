// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ImageStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.image.Image
import com.sdds.plasma.sd.service.styles.image.Ratio16x9
import com.sdds.plasma.sd.service.styles.image.Ratio1x1
import com.sdds.plasma.sd.service.styles.image.Ratio1x2
import com.sdds.plasma.sd.service.styles.image.Ratio2x1
import com.sdds.plasma.sd.service.styles.image.Ratio3x4
import com.sdds.plasma.sd.service.styles.image.Ratio4x3
import com.sdds.plasma.sd.service.styles.image.Ratio9x16

internal object PlasmaB2cImageVariationsCompose : ComposeStyleProvider<ImageStyle>() {
    override val variations: Map<String, ComposeStyleReference<ImageStyle>> =
        mapOf(
            "Ratio12" to ComposeStyleReference { Image.Ratio1x2.style() },
            "Ratio916" to ComposeStyleReference { Image.Ratio9x16.style() },
            "Ratio34" to ComposeStyleReference { Image.Ratio3x4.style() },
            "Ratio21" to ComposeStyleReference { Image.Ratio2x1.style() },
            "Ratio169" to ComposeStyleReference { Image.Ratio16x9.style() },
            "Ratio43" to ComposeStyleReference { Image.Ratio4x3.style() },
            "Ratio11" to ComposeStyleReference { Image.Ratio1x1.style() },
        )
}
