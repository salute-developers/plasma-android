package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BallFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BallFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 7.81 12.0 c 0.0 -2.886 0.54 -5.462 1.379 -7.288 C 10.058 2.82 11.107 2.0 12.0 2.0 c 5.523 0.0 10.0 4.477 10.0 10.0 c 0.0 0.893 -0.82 1.942 -2.712 2.811 c -1.826 0.84 -4.402 1.378 -7.288 1.378 c -1.369 0.0 -2.668 -0.121 -3.85 -0.338 C 7.931 14.668 7.81 13.369 7.81 12.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 21.44 15.308 c -0.462 0.325 -0.978 0.614 -1.526 0.866 c -2.064 0.948 -4.863 1.515 -7.914 1.515 c -1.211 0.0 -2.383 -0.09 -3.485 -0.256 c 0.193 0.679 0.42 1.302 0.674 1.855 C 10.058 21.18 11.107 22.0 12.0 22.0 c 4.363 0.0 8.074 -2.795 9.44 -6.692 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 8.692 21.44 c -0.325 -0.462 -0.615 -0.978 -0.866 -1.526 c -0.38 -0.825 -0.697 -1.768 -0.943 -2.797 c -1.03 -0.245 -1.972 -0.564 -2.798 -0.943 c -0.547 -0.252 -1.063 -0.54 -1.525 -0.866 c 1.003 2.862 3.27 5.129 6.132 6.132 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 2.0 12.0 c 0.0 0.893 0.82 1.942 2.712 2.811 c 0.553 0.254 1.176 0.481 1.855 0.674 C 6.4 14.383 6.311 13.21 6.311 12.0 c 0.0 -3.051 0.567 -5.85 1.515 -7.915 c 0.251 -0.547 0.54 -1.063 0.866 -1.525 C 4.795 3.926 2.0 7.637 2.0 12.0 Z")
        )
    }.build()
}
