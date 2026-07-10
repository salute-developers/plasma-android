package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PictureFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PictureFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.281 4.0 H 6.72 C 6.045 4.0 5.495 4.0 5.047 4.037 C 4.584 4.074 4.165 4.155 3.775 4.354 c -0.612 0.312 -1.11 0.809 -1.42 1.42 c -0.2 0.391 -0.28 0.81 -0.318 1.273 C 2.0 7.494 2.0 8.045 2.0 8.719 v 6.562 c 0.0 0.674 0.0 1.225 0.037 1.672 c 0.037 0.463 0.118 0.882 0.317 1.273 C 2.44 18.393 2.538 18.55 2.65 18.7 c 0.296 0.395 0.68 0.72 1.125 0.946 c 0.39 0.199 0.809 0.28 1.272 0.317 C 5.494 20.0 6.045 20.0 6.718 20.0 h 10.563 c 0.674 0.0 1.225 0.0 1.672 -0.037 c 0.463 -0.037 0.882 -0.118 1.273 -0.317 c 0.611 -0.312 1.108 -0.809 1.42 -1.42 c 0.285 -0.56 0.334 -1.198 0.348 -1.967 C 22.0 15.964 22.0 15.63 22.0 15.256 V 8.719 c 0.0 -0.674 0.0 -1.225 -0.037 -1.672 c -0.037 -0.463 -0.118 -0.882 -0.317 -1.272 c -0.312 -0.612 -0.809 -1.11 -1.42 -1.42 c -0.391 -0.2 -0.81 -0.28 -1.273 -0.318 C 18.506 4.0 17.955 4.0 17.281 4.0 Z m -0.397 8.944 l 3.601 3.602 c -0.023 0.553 -0.08 0.811 -0.176 0.998 c -0.168 0.33 -0.435 0.598 -0.765 0.765 c -0.144 0.074 -0.343 0.13 -0.713 0.16 c -0.38 0.03 -0.869 0.031 -1.581 0.031 H 9.56 l 5.556 -5.556 c 0.488 -0.488 1.28 -0.488 1.768 0.0 Z M 9.689 16.25 L 7.44 18.5 H 6.75 c -0.712 0.0 -1.202 0.0 -1.58 -0.032 c -0.371 -0.03 -0.57 -0.085 -0.714 -0.159 c -0.045 -0.023 -0.089 -0.047 -0.13 -0.073 l 2.79 -2.792 c 0.488 -0.488 1.28 -0.488 1.768 0.0 l 0.805 0.806 Z M 7.5 11.0 C 8.328 11.0 9.0 10.328 9.0 9.5 S 8.328 8.0 7.5 8.0 S 6.0 8.672 6.0 9.5 S 6.672 11.0 7.5 11.0 Z")
        )
    }.build()
}
