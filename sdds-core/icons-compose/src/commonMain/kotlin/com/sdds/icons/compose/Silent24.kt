package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Silent24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Silent24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 4.0 c -4.418 0.0 -8.0 3.582 -8.0 8.0 s 3.582 8.0 8.0 8.0 s 8.0 -3.582 8.0 -8.0 c 0.0 -0.37 -0.025 -0.732 -0.073 -1.087 c -0.074 -0.547 0.309 -1.051 0.856 -1.126 c 0.548 -0.074 1.051 0.31 1.126 0.857 C 21.969 11.088 22.0 11.54 22.0 12.0 c 0.0 5.523 -4.477 10.0 -10.0 10.0 S 2.0 17.523 2.0 12.0 S 6.477 2.0 12.0 2.0 c 0.848 0.0 1.673 0.106 2.461 0.305 c 0.535 0.136 0.86 0.68 0.724 1.215 c -0.136 0.536 -0.68 0.86 -1.215 0.724 C 13.341 4.084 12.681 4.0 12.0 4.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 7.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 v 4.984 c 0.0 0.03 0.0 0.058 0.003 0.086 c 0.02 0.3 0.172 0.562 0.399 0.731 c 0.037 0.028 0.075 0.053 0.116 0.075 l 2.58 1.49 c 0.478 0.276 1.09 0.112 1.366 -0.366 s 0.112 -1.09 -0.366 -1.366 L 13.0 12.423 V 8.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 2.9 c -0.497 0.0 -0.9 -0.403 -0.9 -0.9 s 0.403 -0.9 0.9 -0.9 h 5.0 c 0.364 0.0 0.692 0.219 0.832 0.555 c 0.139 0.337 0.062 0.724 -0.195 0.981 L 20.173 6.1 H 23.0 c 0.497 0.0 0.9 0.403 0.9 0.9 S 23.497 7.9 23.0 7.9 h -5.0 c -0.364 0.0 -0.692 -0.22 -0.831 -0.556 c -0.14 -0.336 -0.063 -0.723 0.195 -0.98 L 20.827 2.9 H 18.0 Z")
        )
    }.build()
}
