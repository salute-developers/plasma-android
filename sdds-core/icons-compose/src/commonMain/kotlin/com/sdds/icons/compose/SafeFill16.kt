package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SafeFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SafeFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.96 2.051 C 1.75 2.463 1.75 3.001 1.75 4.08 v 6.463 c 0.0 1.078 0.0 1.617 0.21 2.029 c 0.184 0.362 0.479 0.656 0.841 0.84 c 0.108 0.056 0.226 0.097 0.36 0.127 v 0.96 c 0.0 0.276 0.223 0.5 0.5 0.5 c 0.275 0.0 0.5 -0.224 0.5 -0.5 v -0.88 c 0.197 0.004 0.418 0.004 0.669 0.004 h 6.34 c 0.252 0.0 0.474 0.0 0.672 -0.003 v 0.879 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 v -0.96 c 0.133 -0.03 0.25 -0.071 0.357 -0.126 c 0.362 -0.185 0.657 -0.48 0.841 -0.841 c 0.21 -0.412 0.21 -0.951 0.21 -2.03 V 4.08 c 0.0 -1.078 0.0 -1.617 -0.21 -2.029 C 13.856 1.69 13.561 1.394 13.2 1.21 C 12.787 1.0 12.249 1.0 11.17 1.0 H 4.83 C 3.752 1.0 3.213 1.0 2.801 1.21 C 2.44 1.394 2.144 1.689 1.96 2.05 Z m 4.284 5.26 c 0.0 -0.987 0.791 -1.779 1.757 -1.779 c 0.966 0.0 1.757 0.792 1.757 1.78 c 0.0 0.986 -0.791 1.778 -1.757 1.778 c -0.966 0.0 -1.757 -0.792 -1.757 -1.779 Z m 1.757 -2.779 c -1.527 0.0 -2.757 1.25 -2.757 2.78 c 0.0 1.53 1.23 2.778 2.757 2.778 c 1.527 0.0 2.757 -1.248 2.757 -2.779 c 0.0 -1.53 -1.23 -2.779 -2.757 -2.779 Z")
        )
    }.build()
}
