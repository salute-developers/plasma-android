package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Visa24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Visa24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.344 10.94 c -0.012 0.9 0.801 1.402 1.414 1.7 c 0.63 0.306 0.84 0.503 0.838 0.776 c -0.005 0.42 -0.502 0.605 -0.967 0.612 c -0.812 0.012 -1.284 -0.22 -1.66 -0.395 l -0.292 1.369 c 0.376 0.173 1.074 0.325 1.797 0.332 c 1.697 0.0 2.807 -0.838 2.813 -2.137 c 0.007 -1.649 -2.28 -1.74 -2.264 -2.477 c 0.005 -0.224 0.218 -0.462 0.686 -0.523 c 0.23 -0.03 0.87 -0.054 1.593 0.28 l 0.284 -1.325 c -0.39 -0.141 -0.89 -0.277 -1.512 -0.277 c -1.598 0.0 -2.722 0.85 -2.73 2.065 Z m 6.972 -1.95 c -0.31 0.0 -0.572 0.18 -0.688 0.457 l -2.425 5.79 H 17.9 l 0.338 -0.934 h 2.072 l 0.196 0.933 H 22.0 L 20.696 8.99 h -1.38 Z m 0.237 1.687 l 0.49 2.346 h -1.341 l 0.85 -2.346 Z m -9.266 -1.688 L 8.95 15.236 h 1.617 l 1.336 -6.247 h -1.616 Z m -2.39 0.0 l -1.683 4.252 l -0.68 -3.615 c -0.08 -0.404 -0.395 -0.637 -0.746 -0.637 h -2.75 L 2.0 9.17 c 0.565 0.123 1.206 0.32 1.595 0.532 c 0.237 0.13 0.305 0.242 0.383 0.549 l 1.29 4.985 h 1.707 L 9.594 8.99 H 7.896 Z")
        )
    }.build()
}
