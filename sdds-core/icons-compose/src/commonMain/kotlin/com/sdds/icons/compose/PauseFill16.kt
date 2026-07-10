package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PauseFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PauseFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.864 2.823 C 3.75 3.048 3.75 3.342 3.75 3.93 v 8.14 c 0.0 0.588 0.0 0.882 0.114 1.107 c 0.101 0.197 0.262 0.358 0.46 0.458 c 0.224 0.115 0.518 0.115 1.106 0.115 h 0.182 c 0.588 0.0 0.882 0.0 1.106 -0.115 c 0.198 -0.1 0.358 -0.26 0.46 -0.458 c 0.114 -0.225 0.114 -0.52 0.114 -1.107 V 3.93 c 0.0 -0.588 0.0 -0.882 -0.115 -1.107 c -0.1 -0.197 -0.261 -0.358 -0.459 -0.459 C 6.494 2.25 6.2 2.25 5.612 2.25 H 5.43 c -0.588 0.0 -0.882 0.0 -1.107 0.114 c -0.197 0.101 -0.358 0.262 -0.459 0.46 Z m 8.272 10.354 c 0.114 -0.225 0.114 -0.519 0.114 -1.107 V 3.93 c 0.0 -0.588 0.0 -0.882 -0.114 -1.107 c -0.101 -0.197 -0.262 -0.358 -0.46 -0.458 C 11.453 2.25 11.159 2.25 10.57 2.25 h -0.181 c -0.589 0.0 -0.883 0.0 -1.107 0.115 c -0.198 0.1 -0.358 0.26 -0.46 0.458 C 8.71 3.049 8.71 3.344 8.71 3.93 v 8.14 c 0.0 0.588 0.0 0.882 0.114 1.107 c 0.1 0.197 0.261 0.358 0.459 0.459 c 0.224 0.114 0.518 0.114 1.107 0.114 h 0.181 c 0.588 0.0 0.882 0.0 1.107 -0.114 c 0.197 -0.101 0.358 -0.262 0.459 -0.46 Z")
        )
    }.build()
}
