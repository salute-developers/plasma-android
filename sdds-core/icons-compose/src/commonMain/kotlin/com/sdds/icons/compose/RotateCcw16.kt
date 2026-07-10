package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RotateCcw16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RotateCcw16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 4.393 C 3.225 2.36 5.453 1.0 8.0 1.0 c 3.866 0.0 7.0 3.134 7.0 7.0 s -3.134 7.0 -7.0 7.0 c -2.901 0.0 -5.39 -1.765 -6.45 -4.278 c -0.108 -0.254 0.01 -0.547 0.265 -0.655 C 2.07 9.96 2.363 10.08 2.47 10.333 C 3.381 12.49 5.515 14.0 8.0 14.0 c 3.314 0.0 6.0 -2.686 6.0 -6.0 s -2.686 -6.0 -6.0 -6.0 C 5.791 2.0 3.86 3.194 2.819 4.972 h 1.209 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 2.02 H 1.998 H 1.5 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 V 2.944 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 S 2.0 2.668 2.0 2.944 v 1.449 Z")
        )
    }.build()
}
