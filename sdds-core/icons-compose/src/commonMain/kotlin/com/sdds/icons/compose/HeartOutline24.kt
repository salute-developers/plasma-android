package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HeartOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HeartOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 9.49 c 0.0 -2.524 2.164 -5.57 5.713 -5.57 c 1.061 0.0 2.005 0.417 2.801 0.967 C 11.061 5.265 11.558 5.72 12.0 6.181 c 0.442 -0.462 0.939 -0.916 1.486 -1.294 c 0.796 -0.55 1.74 -0.967 2.8 -0.967 C 19.837 3.92 22.0 6.966 22.0 9.49 c 0.0 2.17 -1.028 4.207 -2.424 6.0 c -1.402 1.801 -3.233 3.432 -4.97 4.804 l -0.094 0.075 c -0.626 0.495 -1.1 0.87 -1.703 1.035 c -0.504 0.139 -1.114 0.139 -1.618 0.0 c -0.604 -0.165 -1.077 -0.54 -1.703 -1.035 l -0.094 -0.075 c -1.737 -1.372 -3.568 -3.003 -4.97 -4.803 C 3.029 13.697 2.0 11.66 2.0 9.49 Z m 5.713 -4.07 C 5.111 5.42 3.5 7.67 3.5 9.49 c 0.0 1.695 0.809 3.41 2.108 5.08 c 1.294 1.662 3.018 3.206 4.715 4.547 c 0.763 0.603 0.99 0.766 1.264 0.84 c 0.245 0.068 0.58 0.068 0.826 0.0 c 0.274 -0.074 0.5 -0.237 1.264 -0.84 c 1.697 -1.34 3.42 -2.885 4.715 -4.548 c 1.3 -1.669 2.108 -3.384 2.108 -5.08 c 0.0 -1.82 -1.611 -4.07 -4.213 -4.07 c -0.658 0.0 -1.307 0.258 -1.948 0.702 c -0.644 0.445 -1.238 1.047 -1.77 1.667 L 12.0 8.449 l -0.569 -0.661 c -0.532 -0.62 -1.126 -1.222 -1.77 -1.667 C 9.02 5.677 8.372 5.42 7.714 5.42 Z")
        )
    }.build()
}
