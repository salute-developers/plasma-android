package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DislikeFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DislikeFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.143 32.93 c -0.92 0.265 -1.883 -0.246 -2.185 -1.158 l -1.546 -4.66 c -0.185 -0.56 -0.439 -1.095 -0.754 -1.592 l -3.565 -5.632 c -0.237 -0.374 -0.507 -0.723 -0.805 -1.045 c -0.809 1.326 -2.486 2.026 -4.098 1.419 l -1.44 -0.543 c -1.259 -0.475 -2.12 -1.65 -2.2 -2.999 L 4.006 7.421 c -0.105 -1.797 1.195 -3.367 2.972 -3.59 l 1.509 -0.19 c 1.308 -0.165 2.525 0.44 3.22 1.45 l 8.89 -1.943 c 2.75 -0.601 5.57 0.668 6.954 3.13 l 3.806 6.769 c 1.85 3.29 -0.514 7.363 -4.274 7.363 h -3.108 c -0.744 0.0 -1.286 0.71 -1.095 1.433 l 1.446 5.447 c 0.647 2.438 -0.77 4.947 -3.183 5.64 Z M 8.986 18.13 c 0.762 0.287 1.568 -0.303 1.53 -1.12 L 10.04 6.976 C 10.01 6.314 9.423 5.819 8.768 5.9 l -1.51 0.19 c -0.591 0.074 -1.025 0.598 -0.99 1.197 l 0.545 9.299 c 0.026 0.45 0.313 0.841 0.733 1.0 l 1.44 0.542 Z")
        )
    }.build()
}
