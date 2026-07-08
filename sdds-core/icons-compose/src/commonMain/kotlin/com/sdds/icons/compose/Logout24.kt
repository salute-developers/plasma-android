package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Logout24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Logout24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.719 3.0 H 10.5 C 11.88 3.0 13.0 4.12 13.0 5.5 c 0.0 0.414 -0.336 0.75 -0.75 0.75 S 11.5 5.914 11.5 5.5 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 H 7.75 c -0.712 0.0 -1.202 0.0 -1.58 0.032 C 5.798 4.562 5.6 4.617 5.455 4.69 C 5.126 4.859 4.859 5.126 4.69 5.456 C 4.617 5.6 4.56 5.799 4.53 6.169 C 4.502 6.55 4.5 7.038 4.5 7.75 v 8.5 c 0.0 0.712 0.0 1.202 0.032 1.58 c 0.03 0.371 0.085 0.57 0.159 0.715 c 0.168 0.329 0.435 0.596 0.765 0.764 c 0.144 0.074 0.343 0.13 0.713 0.16 c 0.38 0.03 0.869 0.031 1.581 0.031 h 2.75 c 0.552 0.0 1.0 -0.448 1.0 -1.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 S 13.0 18.086 13.0 18.5 c 0.0 1.38 -1.12 2.5 -2.5 2.5 H 7.719 c -0.674 0.0 -1.225 0.0 -1.672 -0.037 c -0.463 -0.037 -0.882 -0.118 -1.272 -0.317 c -0.612 -0.312 -1.11 -0.809 -1.42 -1.42 c -0.2 -0.391 -0.28 -0.81 -0.318 -1.273 C 3.0 17.506 3.0 16.955 3.0 16.281 V 7.72 c 0.0 -0.674 0.0 -1.224 0.037 -1.672 c 0.037 -0.463 0.118 -0.882 0.317 -1.272 c 0.312 -0.612 0.809 -1.11 1.42 -1.42 c 0.391 -0.2 0.81 -0.28 1.273 -0.318 C 6.495 3.0 7.045 3.0 7.719 3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.531 12.53 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 l -3.0 -3.0 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 c -0.293 0.293 -0.293 0.767 0.0 1.06 l 1.72 1.72 H 10.5 c -0.414 0.0 -0.75 0.336 -0.75 0.75 s 0.336 0.75 0.75 0.75 h 6.69 l -1.72 1.72 c -0.293 0.293 -0.293 0.767 0.0 1.06 c 0.293 0.293 0.767 0.293 1.06 0.0 l 3.0 -3.0 Z")
        )
    }.build()
}
