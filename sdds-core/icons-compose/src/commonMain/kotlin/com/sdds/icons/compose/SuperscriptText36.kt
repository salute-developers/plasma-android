package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SuperscriptText36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SuperscriptText36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 26.498 12.204 v 1.57 h 5.948 v -1.57 h -1.79 V 3.5 h -1.198 l -2.96 2.099 v 1.747 l 2.449 -1.747 v 6.605 h -2.45 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.084 26.5 l -5.278 -15.537 H 9.204 L 4.0 26.5 h 2.327 l 1.21 -3.684 h 5.882 l 1.227 3.684 h 2.438 Z m -6.615 -12.607 l 2.107 6.37 H 8.36 l 2.107 -6.37 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.357 16.001 v 3.241 c 0.623 -1.176 1.594 -1.976 3.28 -1.976 c 1.227 0.0 1.85 0.489 1.85 2.065 v 0.488 h -2.07 c -2.254 0.0 -3.775 0.71 -3.775 3.24 c 0.0 2.176 1.1 3.441 2.95 3.441 c 1.466 0.0 2.584 -0.888 3.024 -2.175 v 1.997 h 2.015 v -7.324 c 0.0 -2.886 -1.319 -3.995 -3.994 -3.995 c -1.576 0.0 -2.676 0.444 -3.28 0.998 Z m 5.13 6.415 c -0.091 0.755 -0.77 1.753 -2.217 1.753 c -0.953 0.0 -1.466 -0.532 -1.466 -1.376 c 0.0 -0.998 0.605 -1.287 1.87 -1.287 h 1.814 v 0.91 Z")
        )
    }.build()
}
