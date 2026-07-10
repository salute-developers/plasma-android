package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FileErrorFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FileErrorFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.5 5.58 V 2.006 C 12.345 2.0 12.18 2.0 11.997 2.0 H 8.719 C 8.045 2.0 7.495 2.0 7.047 2.037 C 6.584 2.074 6.165 2.155 5.775 2.354 c -0.612 0.312 -1.11 0.81 -1.42 1.42 c -0.2 0.391 -0.28 0.81 -0.318 1.273 C 4.0 5.495 4.0 6.045 4.0 6.719 v 10.563 c 0.0 0.673 0.0 1.224 0.037 1.671 c 0.037 0.463 0.118 0.882 0.317 1.273 c 0.312 0.611 0.809 1.108 1.42 1.42 c 0.391 0.199 0.81 0.28 1.273 0.317 C 7.494 22.0 8.045 22.0 8.719 22.0 h 6.562 c 0.674 0.0 1.225 0.0 1.672 -0.037 c 0.463 -0.037 0.882 -0.118 1.273 -0.317 c 0.611 -0.312 1.108 -0.809 1.42 -1.42 c 0.199 -0.391 0.28 -0.81 0.317 -1.273 C 20.0 18.506 20.0 17.955 20.0 17.282 v -7.279 c 0.0 -0.182 0.0 -0.348 -0.006 -0.503 H 16.42 c -0.535 0.0 -0.98 0.0 -1.345 -0.03 c -0.38 -0.03 -0.736 -0.098 -1.073 -0.27 C 13.483 8.937 13.063 8.516 12.8 8.0 c -0.172 -0.338 -0.24 -0.694 -0.27 -1.074 C 12.5 6.56 12.5 6.115 12.5 5.58 Z m -4.28 6.64 c 0.293 -0.293 0.767 -0.293 1.06 0.0 l 2.47 2.47 l 2.47 -2.47 c 0.293 -0.293 0.767 -0.293 1.06 0.0 c 0.293 0.293 0.293 0.768 0.0 1.06 l -2.47 2.47 l 2.47 2.47 c 0.293 0.293 0.293 0.767 0.0 1.06 c -0.293 0.293 -0.767 0.293 -1.06 0.0 l -2.47 -2.47 l -2.47 2.47 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 l 2.47 -2.47 l -2.47 -2.47 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.0 5.55 V 2.5 c 0.22 0.16 0.422 0.36 0.666 0.606 l 4.228 4.228 C 19.14 7.578 19.341 7.78 19.5 8.0 h -3.05 c -0.572 0.0 -0.957 0.0 -1.252 -0.025 c -0.288 -0.023 -0.425 -0.065 -0.516 -0.111 c -0.235 -0.12 -0.426 -0.311 -0.546 -0.546 c -0.046 -0.091 -0.088 -0.228 -0.111 -0.515 C 14.0 6.507 14.0 6.123 14.0 5.55 Z")
        )
    }.build()
}
