package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarFourFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarFourFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.357 3.273 c 0.564 -1.523 2.72 -1.523 3.284 0.0 l 1.873 5.064 c 0.025 0.068 0.079 0.122 0.147 0.147 l 5.064 1.873 c 1.523 0.564 1.523 2.72 0.0 3.284 l -5.064 1.873 c -0.068 0.025 -0.122 0.079 -0.147 0.147 l -1.873 5.064 c -0.564 1.523 -2.72 1.523 -3.284 0.0 L 8.484 15.66 c -0.025 -0.068 -0.079 -0.122 -0.147 -0.147 L 3.273 13.64 c -1.523 -0.564 -1.523 -2.72 0.0 -3.284 l 5.064 -1.873 C 8.405 8.46 8.459 8.405 8.484 8.337 l 1.873 -5.064 Z")
        )
    }.build()
}
