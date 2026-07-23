package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarHalfFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarHalfFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.886 3.678 c -0.327 -0.788 -1.444 -0.788 -1.772 0.0 L 9.037 8.672 l -5.39 0.432 c -0.852 0.068 -1.197 1.13 -0.549 1.686 l 4.107 3.518 l -1.254 5.26 C 5.753 20.4 6.656 21.055 7.385 20.61 L 12.0 17.791 l 4.615 2.82 c 0.729 0.444 1.633 -0.212 1.434 -1.043 l -1.254 -5.26 l 4.107 -3.518 c 0.648 -0.556 0.303 -1.618 -0.548 -1.686 l -5.39 -0.432 l -2.078 -4.994 Z M 12.0 16.198 c 0.173 0.0 0.347 0.048 0.5 0.141 l 3.79 2.315 l -1.031 -4.319 c -0.084 -0.35 0.036 -0.718 0.31 -0.952 l 3.37 -2.888 l -4.424 -0.355 c -0.36 -0.028 -0.672 -0.255 -0.81 -0.588 L 12.0 5.453 V 16.2 Z")
        )
    }.build()
}
