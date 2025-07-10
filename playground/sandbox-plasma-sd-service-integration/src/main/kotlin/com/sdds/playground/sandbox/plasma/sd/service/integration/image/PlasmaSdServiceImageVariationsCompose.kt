package com.sdds.playground.sandbox.plasma.sd.service.integration.image

import androidx.compose.runtime.Composable
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
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceImageVariationsCompose :
    ComposeStyleProvider<String, ImageStyle>() {
    override val variations: Map<String, @Composable () -> ImageStyle> =
        mapOf(
            "Ratio1x1" to { Image.Ratio1x1.style() },
            "Ratio1x2" to { Image.Ratio1x2.style() },
            "Ratio2x1" to { Image.Ratio2x1.style() },
            "Ratio3x4" to { Image.Ratio3x4.style() },
            "Ratio4x3" to { Image.Ratio4x3.style() },
            "Ratio9x16" to { Image.Ratio9x16.style() },
            "Ratio16x9" to { Image.Ratio16x9.style() },
        )
}
