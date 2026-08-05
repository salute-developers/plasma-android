package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ViewPersonFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ViewPersonFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.281 4.0 H 6.72 C 6.045 4.0 5.495 4.0 5.047 4.037 C 4.584 4.074 4.165 4.155 3.775 4.354 c -0.612 0.312 -1.11 0.809 -1.42 1.42 c -0.2 0.391 -0.28 0.81 -0.318 1.273 C 2.0 7.494 2.0 8.045 2.0 8.719 v 6.562 c 0.0 0.674 0.0 1.225 0.037 1.672 c 0.037 0.463 0.118 0.882 0.317 1.273 c 0.312 0.611 0.809 1.108 1.42 1.42 c 0.391 0.199 0.81 0.28 1.273 0.317 C 5.494 20.0 6.045 20.0 6.718 20.0 h 10.563 c 0.674 0.0 1.225 0.0 1.672 -0.037 c 0.463 -0.037 0.882 -0.118 1.273 -0.317 c 0.611 -0.312 1.108 -0.809 1.42 -1.42 c 0.199 -0.391 0.28 -0.81 0.317 -1.273 C 22.0 16.506 22.0 15.955 22.0 15.281 V 8.72 c 0.0 -0.674 0.0 -1.225 -0.037 -1.672 c -0.037 -0.463 -0.118 -0.882 -0.317 -1.272 c -0.312 -0.612 -0.809 -1.11 -1.42 -1.42 c -0.391 -0.2 -0.81 -0.28 -1.273 -0.318 C 18.506 4.0 17.955 4.0 17.281 4.0 Z M 14.5 9.5 c 0.0 1.38 -1.12 2.5 -2.5 2.5 s -2.5 -1.12 -2.5 -2.5 S 10.62 7.0 12.0 7.0 s 2.5 1.12 2.5 2.5 Z m 2.03 4.988 c 0.318 0.23 0.507 0.634 0.464 1.05 c -0.023 0.223 -0.064 0.398 -0.136 0.552 c -0.146 0.314 -0.378 0.569 -0.665 0.728 C 15.867 17.0 15.441 17.0 14.588 17.0 H 9.412 c -0.853 0.0 -1.28 0.0 -1.605 -0.182 c -0.287 -0.16 -0.52 -0.414 -0.665 -0.728 c -0.072 -0.154 -0.113 -0.329 -0.136 -0.553 c -0.043 -0.415 0.146 -0.818 0.464 -1.05 C 8.77 13.548 10.326 13.0 12.0 13.0 c 1.674 0.0 3.23 0.547 4.53 1.488 Z")
        )
    }.build()
}
