package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LockOpenFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LockOpenFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.75 6.625 c 0.0 -1.588 1.287 -2.875 2.875 -2.875 S 20.5 5.037 20.5 6.625 V 11.5 c 0.0 0.414 0.336 0.75 0.75 0.75 S 22.0 11.914 22.0 11.5 V 6.625 c 0.0 -2.416 -1.959 -4.375 -4.375 -4.375 S 13.25 4.209 13.25 6.625 V 10.0 H 6.719 c -0.674 0.0 -1.224 0.0 -1.672 0.037 c -0.463 0.037 -0.882 0.118 -1.272 0.317 c -0.612 0.312 -1.11 0.809 -1.42 1.42 c -0.2 0.391 -0.28 0.81 -0.318 1.273 C 2.0 13.494 2.0 14.045 2.0 14.719 v 2.562 c 0.0 0.674 0.0 1.225 0.037 1.672 c 0.037 0.463 0.118 0.882 0.317 1.273 c 0.312 0.611 0.809 1.108 1.42 1.42 c 0.391 0.199 0.81 0.28 1.273 0.317 C 5.494 22.0 6.045 22.0 6.719 22.0 h 6.562 c 0.674 0.0 1.224 0.0 1.672 -0.037 c 0.463 -0.037 0.882 -0.118 1.273 -0.317 c 0.611 -0.312 1.108 -0.809 1.42 -1.42 c 0.199 -0.391 0.28 -0.81 0.317 -1.273 C 18.0 18.506 18.0 17.955 18.0 17.281 v -3.378 c 0.0 -0.603 0.0 -1.036 -0.09 -1.412 c -0.285 -1.188 -1.213 -2.116 -2.401 -2.401 c -0.225 -0.054 -0.47 -0.076 -0.759 -0.084 V 6.625 Z M 10.0 18.0 c 1.105 0.0 2.0 -0.895 2.0 -2.0 s -0.895 -2.0 -2.0 -2.0 s -2.0 0.895 -2.0 2.0 s 0.895 2.0 2.0 2.0 Z")
        )
    }.build()
}
