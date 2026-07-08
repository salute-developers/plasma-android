package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HummerFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HummerFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.56 8.424 l -1.0 -1.003 l -5.292 5.304 c -0.276 0.277 -0.276 0.726 0.0 1.004 c 0.277 0.276 0.724 0.276 1.0 0.0 L 8.56 8.424 Z M 7.184 6.292 l -5.666 5.681 c -0.69 0.693 -0.69 1.815 0.0 2.508 c 0.69 0.692 1.81 0.692 2.501 0.0 L 9.685 8.8 C 9.84 8.646 9.888 8.597 9.93 8.563 c 0.457 -0.377 1.115 -0.377 1.572 0.0 c 0.042 0.034 0.092 0.083 0.245 0.237 l 0.725 0.727 c 0.1 0.1 0.234 0.156 0.375 0.156 c 0.14 0.0 0.276 -0.056 0.375 -0.156 l 2.123 -2.128 c 0.207 -0.208 0.207 -0.545 0.0 -0.752 l -4.598 -4.61 c -1.38 -1.383 -3.616 -1.383 -4.995 0.0 c -0.1 0.1 -0.156 0.235 -0.156 0.376 c 0.0 0.141 0.056 0.277 0.156 0.376 l 1.432 1.437 C 7.338 4.379 7.387 4.429 7.421 4.47 c 0.375 0.458 0.375 1.118 0.0 1.576 c -0.034 0.042 -0.083 0.092 -0.237 0.245 Z")
        )
    }.build()
}
