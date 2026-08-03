package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Mastercard16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Mastercard16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.591 4.47 C 6.553 5.307 5.997 6.96 5.997 8.03 c 0.0 1.07 0.362 2.497 1.594 3.5 c -0.69 0.455 -1.365 0.72 -2.258 0.72 C 2.94 12.25 1.0 10.347 1.0 8.0 s 1.94 -4.25 4.333 -4.25 c 0.893 0.0 1.569 0.265 2.258 0.72 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.625 11.53 c 0.69 0.455 1.149 0.72 2.042 0.72 C 13.06 12.25 15.0 10.347 15.0 8.0 s -1.94 -4.25 -4.333 -4.25 c -0.893 0.0 -1.353 0.26 -2.042 0.713 c 1.038 0.84 1.602 2.486 1.576 3.562 c -0.025 1.075 -0.538 2.667 -1.576 3.506 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.721 8.0 c 0.0 -1.354 -0.63 -2.56 -1.613 -3.34 C 7.125 5.44 6.495 6.647 6.495 8.0 c 0.0 1.354 0.63 2.56 1.613 3.34 C 9.091 10.56 9.721 9.353 9.721 8.0 Z")
        )
    }.build()
}
