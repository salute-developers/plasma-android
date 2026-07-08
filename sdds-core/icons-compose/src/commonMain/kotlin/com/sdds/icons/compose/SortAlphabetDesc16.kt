package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SortAlphabetDesc16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SortAlphabetDesc16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.727 7.72 H 2.65 l 2.366 -6.79 h 1.098 l 2.333 6.79 H 7.421 L 6.854 6.048 H 4.302 L 3.727 7.72 Z m 2.768 -2.743 L 5.585 2.29 L 4.67 4.977 h 1.826 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.598 6.665 c 0.198 -0.192 0.203 -0.508 0.011 -0.707 l -1.75 -1.806 C 11.765 4.055 11.635 4.0 11.5 4.0 c -0.135 0.0 -0.265 0.055 -0.36 0.152 L 9.39 5.958 C 9.2 6.157 9.205 6.473 9.403 6.665 C 9.6 6.857 9.917 6.852 10.11 6.654 L 11.0 5.734 V 11.5 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 V 5.734 l 0.89 0.92 c 0.193 0.198 0.51 0.203 0.708 0.011 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.864 15.07 l 1.309 -2.189 c 0.066 0.009 0.134 0.013 0.2 0.013 h 1.301 v 2.176 H 7.72 V 8.28 H 5.627 c -0.85 0.0 -1.51 0.192 -1.967 0.587 C 3.2 9.264 2.976 9.853 2.976 10.62 c 0.0 0.519 0.1 0.953 0.306 1.3 c 0.193 0.324 0.476 0.567 0.846 0.728 L 2.624 15.07 h 1.24 Z m 1.746 -3.237 c -0.559 0.0 -0.952 -0.092 -1.194 -0.262 c -0.23 -0.172 -0.352 -0.466 -0.352 -0.903 c 0.0 -0.496 0.132 -0.828 0.379 -1.018 c 0.259 -0.196 0.645 -0.3 1.167 -0.3 h 1.064 v 2.483 H 5.61 Z")
        )
    }.build()
}
