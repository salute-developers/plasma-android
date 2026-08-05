package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Silent36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Silent36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.469 6.003 c 2.675 -0.774 5.533 -0.626 8.114 0.423 c 0.64 0.26 1.369 -0.049 1.628 -0.688 c 0.26 -0.64 -0.048 -1.369 -0.687 -1.629 c -3.101 -1.26 -6.536 -1.438 -9.75 -0.507 c -3.215 0.93 -6.023 2.916 -7.972 5.637 c -1.948 2.72 -2.924 6.019 -2.77 9.362 c 0.154 3.343 1.43 6.537 3.62 9.067 c 2.191 2.53 5.17 4.25 8.457 4.88 c 3.286 0.63 6.69 0.136 9.661 -1.403 c 2.972 -1.54 5.34 -4.035 6.72 -7.084 c 1.38 -3.048 1.695 -6.473 0.892 -9.722 c -0.166 -0.67 -0.844 -1.08 -1.514 -0.914 c -0.67 0.166 -1.08 0.844 -0.913 1.514 c 0.668 2.704 0.407 5.554 -0.743 8.091 c -1.149 2.537 -3.118 4.614 -5.591 5.895 c -2.473 1.281 -5.306 1.692 -8.041 1.168 c -2.736 -0.525 -5.215 -1.956 -7.038 -4.061 c -1.823 -2.106 -2.884 -4.764 -3.013 -7.546 c -0.128 -2.783 0.684 -5.527 2.306 -7.792 c 1.621 -2.264 3.958 -3.917 6.634 -4.691 Z m 4.692 5.846 c 0.0 -0.69 -0.56 -1.25 -1.25 -1.25 s -1.25 0.56 -1.25 1.25 v 7.539 c 0.0 0.467 0.245 0.9 0.645 1.14 l 3.753 2.252 c 0.592 0.355 1.36 0.163 1.715 -0.43 c 0.356 -0.591 0.164 -1.36 -0.428 -1.714 l -3.185 -1.911 v -6.876 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 25.7 3.0 c 0.0 -0.69 0.56 -1.25 1.25 -1.25 h 6.817 c 1.37 0.0 2.0 1.704 0.96 2.595 L 29.879 8.5 h 4.046 c 0.69 0.0 1.25 0.56 1.25 1.25 S 34.615 11.0 33.925 11.0 h -6.817 c -1.37 0.0 -2.0 -1.704 -0.96 -2.595 l 4.848 -4.155 H 26.95 c -0.69 0.0 -1.25 -0.56 -1.25 -1.25 Z")
        )
    }.build()
}
