package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LockFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LockFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.75 7.0 v 3.006 c 0.29 0.008 0.534 0.03 0.759 0.084 c 1.188 0.285 2.116 1.213 2.401 2.401 C 20.0 12.867 20.0 13.301 20.0 13.903 v 3.378 c 0.0 0.674 0.0 1.225 -0.037 1.672 c -0.037 0.463 -0.118 0.882 -0.317 1.273 c -0.312 0.611 -0.809 1.108 -1.42 1.42 c -0.391 0.199 -0.81 0.28 -1.273 0.317 C 16.506 22.0 15.955 22.0 15.282 22.0 H 8.718 c -0.674 0.0 -1.224 0.0 -1.672 -0.037 c -0.463 -0.037 -0.882 -0.118 -1.272 -0.317 c -0.612 -0.312 -1.11 -0.809 -1.42 -1.42 c -0.2 -0.391 -0.28 -0.81 -0.318 -1.273 C 4.0 18.506 4.0 17.955 4.0 17.281 v -3.378 c 0.0 -0.603 0.0 -1.036 0.09 -1.412 c 0.285 -1.188 1.213 -2.116 2.401 -2.401 c 0.225 -0.054 0.47 -0.076 0.76 -0.084 V 7.0 C 7.249 4.377 9.376 2.25 12.0 2.25 c 2.622 0.0 4.75 2.127 4.75 4.75 Z m -8.0 0.0 c 0.0 -1.795 1.455 -3.25 3.25 -3.25 S 15.25 5.205 15.25 7.0 v 3.0 h -6.5 V 7.0 Z M 12.0 18.0 c 1.105 0.0 2.0 -0.895 2.0 -2.0 s -0.895 -2.0 -2.0 -2.0 s -2.0 0.895 -2.0 2.0 s 0.895 2.0 2.0 2.0 Z")
        )
    }.build()
}
