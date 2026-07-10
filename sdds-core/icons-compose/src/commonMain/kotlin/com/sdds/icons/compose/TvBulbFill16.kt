package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TvBulbFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TvBulbFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.0 3.9 c 0.0 -0.49 0.0 -0.735 0.095 -0.922 c 0.084 -0.165 0.218 -0.299 0.383 -0.383 C 1.665 2.5 1.91 2.5 2.4 2.5 h 11.2 c 0.49 0.0 0.735 0.0 0.922 0.095 c 0.165 0.084 0.299 0.218 0.383 0.383 C 15.0 3.165 15.0 3.41 15.0 3.9 v 2.749 c -0.684 -0.91 -1.773 -1.5 -3.0 -1.5 c -2.071 0.0 -3.75 1.68 -3.75 3.75 c 0.0 1.158 0.525 2.193 1.35 2.881 H 2.4 c -0.49 0.0 -0.735 0.0 -0.922 -0.095 c -0.165 -0.084 -0.299 -0.218 -0.383 -0.383 C 1.0 11.115 1.0 10.87 1.0 10.38 V 3.9 Z m 9.25 8.594 H 2.4 V 13.5 h 7.85 v -1.006 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.56 11.6 c -0.049 0.118 -0.087 0.24 -0.112 0.366 l -0.141 0.704 c -0.12 0.6 -0.646 1.03 -1.256 1.03 s -1.136 -0.43 -1.256 -1.03 l -0.14 -0.702 c -0.026 -0.127 -0.065 -0.25 -0.113 -0.368 h 3.017 Z m 0.407 -0.7 c 0.09 -0.123 0.185 -0.244 0.279 -0.363 c 0.378 -0.477 0.604 -1.08 0.604 -1.737 c 0.0 -1.546 -1.254 -2.8 -2.8 -2.8 c -1.546 0.0 -2.8 1.254 -2.8 2.8 c 0.0 0.657 0.226 1.26 0.605 1.738 c 0.094 0.119 0.188 0.239 0.278 0.362 h 3.834 Z")
        )
    }.build()
}
