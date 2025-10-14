package com.sdds.playground.sandbox.plasma.stards.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ImageStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.image.Image
import com.sdkit.star.designsystem.styles.image.Ratio16x9
import com.sdkit.star.designsystem.styles.image.Ratio1x1
import com.sdkit.star.designsystem.styles.image.Ratio1x2
import com.sdkit.star.designsystem.styles.image.Ratio2x1
import com.sdkit.star.designsystem.styles.image.Ratio3x4
import com.sdkit.star.designsystem.styles.image.Ratio4x3
import com.sdkit.star.designsystem.styles.image.Ratio9x16

internal object PlasmaStardsImageVariationsCompose : ComposeStyleProvider<String, ImageStyle>() {
    override val variations: Map<String, @Composable () -> ImageStyle> =
        mapOf(
            "Ratio12" to { Image.Ratio1x2.style() },
            "Ratio916" to { Image.Ratio9x16.style() },
            "Ratio34" to { Image.Ratio3x4.style() },
            "Ratio21" to { Image.Ratio2x1.style() },
            "Ratio169" to { Image.Ratio16x9.style() },
            "Ratio43" to { Image.Ratio4x3.style() },
            "Ratio11" to { Image.Ratio1x1.style() },
        )
}
