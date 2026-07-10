package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Plasma36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Plasma36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 5.0 C 10.82 5.0 5.0 10.82 5.0 18.0 c 0.0 3.49 1.375 6.66 3.614 8.994 c -0.608 -1.316 -0.947 -2.782 -0.947 -4.327 c 0.0 -5.707 4.626 -10.334 10.333 -10.334 s 10.333 4.627 10.333 10.334 c 0.0 1.545 -0.339 3.011 -0.947 4.327 C 29.625 24.66 31.0 21.49 31.0 18.0 c 0.0 -7.18 -5.82 -13.0 -13.0 -13.0 Z m 5.418 23.998 c 1.785 -1.528 2.915 -3.798 2.915 -6.331 c 0.0 -4.603 -3.73 -8.334 -8.333 -8.334 c -4.602 0.0 -8.333 3.731 -8.333 8.334 c 0.0 2.533 1.13 4.803 2.915 6.331 c -0.162 -0.526 -0.249 -1.085 -0.249 -1.665 c 0.0 -3.13 2.537 -5.666 5.667 -5.666 s 5.667 2.537 5.667 5.666 c 0.0 0.58 -0.087 1.139 -0.249 1.665 Z M 18.0 31.0 c 2.025 0.0 3.667 -1.642 3.667 -3.667 S 20.025 23.667 18.0 23.667 s -3.667 1.641 -3.667 3.666 S 15.975 31.0 18.0 31.0 Z m 0.0 2.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 Z")
        )
    }.build()
}
