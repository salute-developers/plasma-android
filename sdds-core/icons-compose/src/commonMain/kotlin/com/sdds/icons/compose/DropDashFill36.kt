package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DropDashFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DropDashFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 27.208 12.525 c 0.369 0.606 0.705 1.214 1.005 1.825 c 0.062 0.126 0.123 0.253 0.183 0.38 C 29.43 16.942 30.0 19.183 30.0 21.428 c 0.0 6.39 -5.373 11.57 -12.0 11.571 c -2.42 0.0 -4.673 -0.691 -6.558 -1.88 l -0.106 -0.067 c -0.534 -0.345 -1.037 -0.729 -1.506 -1.149 l 17.378 -17.379 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.179 3.272 c 0.482 -0.363 1.16 -0.363 1.642 0.0 l 0.25 0.195 l 0.54 0.44 c 0.3 0.25 0.622 0.53 0.962 0.834 c 1.293 1.157 2.584 2.46 3.792 3.886 c 0.162 0.19 0.32 0.382 0.476 0.573 l 4.908 -4.907 c 0.39 -0.39 1.024 -0.39 1.414 0.0 c 0.39 0.39 0.39 1.024 0.0 1.414 l -5.096 5.096 l 0.014 0.021 L 8.458 28.447 l -0.015 -0.02 l -2.736 2.736 c -0.39 0.39 -1.023 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 l 3.031 -3.031 l -0.119 -0.23 C 6.433 24.96 6.0 23.243 6.0 21.428 c 0.0 -4.337 2.124 -8.66 5.634 -12.801 c 1.208 -1.426 2.5 -2.729 3.792 -3.886 c 0.34 -0.304 0.662 -0.583 0.963 -0.834 l 0.293 -0.241 l 0.497 -0.394 Z")
        )
    }.build()
}
