package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Hand24Line24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Hand24Line24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.75 4.0 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 6.75 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 V 6.0 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 S 9.75 5.724 9.75 6.0 v 8.493 c 0.0 0.364 -0.261 0.676 -0.62 0.74 c -0.358 0.062 -0.71 -0.141 -0.835 -0.483 L 7.04 11.3 c -0.095 -0.26 -0.382 -0.393 -0.641 -0.299 c -0.26 0.095 -0.393 0.382 -0.299 0.641 l 1.967 5.404 c 0.991 2.724 4.004 4.13 6.729 3.137 c 2.115 -0.77 3.436 -2.759 3.456 -4.887 c -0.002 -0.015 -0.002 -0.03 -0.002 -0.046 v -5.5 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 s -0.5 0.224 -0.5 0.5 v 3.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 V 6.5 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 s -0.5 0.224 -0.5 0.5 V 12.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 V 4.5 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 Z m 2.0 0.563 V 4.5 c 0.0 -1.105 -0.895 -2.0 -2.0 -2.0 c -0.959 0.0 -1.76 0.675 -1.955 1.575 C 10.622 4.026 10.44 4.0 10.25 4.0 c -1.105 0.0 -2.0 0.895 -2.0 2.0 v 4.386 c -0.495 -0.767 -1.47 -1.12 -2.364 -0.794 c -1.038 0.378 -1.573 1.525 -1.196 2.563 l 1.967 5.404 c 1.275 3.503 5.149 5.309 8.652 4.034 c 2.742 -0.998 4.443 -3.587 4.443 -6.343 c 0.0 -0.017 0.0 -0.033 -0.002 -0.05 V 9.75 c 0.0 -1.105 -0.895 -2.0 -2.0 -2.0 c -0.173 0.0 -0.34 0.022 -0.5 0.063 V 6.5 c 0.0 -1.105 -0.895 -2.0 -2.0 -2.0 c -0.173 0.0 -0.34 0.022 -0.5 0.063 Z")
        )
    }.build()
}
