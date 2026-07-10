package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarFourFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarFourFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.802 1.842 c 0.394 -1.067 1.903 -1.067 2.298 0.0 l 1.311 3.545 c 0.018 0.047 0.056 0.085 0.104 0.102 l 3.544 1.312 c 1.066 0.394 1.066 1.903 0.0 2.298 l -3.544 1.311 c -0.048 0.018 -0.086 0.056 -0.104 0.104 L 9.1 14.058 c -0.395 1.066 -1.903 1.066 -2.298 0.0 L 5.49 10.514 c -0.017 -0.048 -0.055 -0.086 -0.102 -0.104 L 1.843 9.1 c -1.066 -0.395 -1.067 -1.904 0.0 -2.298 l 3.545 -1.312 C 5.435 5.471 5.473 5.434 5.49 5.387 l 1.312 -3.545 Z")
        )
    }.build()
}
