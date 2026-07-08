package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HeartDashOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HeartDashOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.015 4.04 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 c -0.292 -0.293 -0.767 -0.293 -1.06 0.0 l -1.401 1.4 c -0.672 -0.291 -1.431 -0.46 -2.267 -0.46 c -1.061 0.0 -2.005 0.417 -2.801 0.967 C 12.939 5.265 12.442 5.72 12.0 6.181 c -0.442 -0.462 -0.939 -0.916 -1.486 -1.294 c -0.796 -0.55 -1.74 -0.967 -2.8 -0.967 C 4.163 3.92 2.0 6.966 2.0 9.49 c 0.0 2.17 1.028 4.207 2.425 6.0 c 0.432 0.556 0.905 1.095 1.404 1.616 L 2.983 19.95 c -0.293 0.293 -0.293 0.768 0.0 1.06 c 0.293 0.294 0.768 0.294 1.06 0.0 L 21.017 4.04 Z M 6.89 16.045 L 17.375 5.559 c -0.34 -0.09 -0.703 -0.14 -1.088 -0.14 c -0.658 0.0 -1.307 0.258 -1.948 0.702 c -0.644 0.445 -1.238 1.047 -1.77 1.667 L 12.0 8.449 l -0.569 -0.661 c -0.532 -0.62 -1.126 -1.222 -1.77 -1.667 C 9.02 5.677 8.372 5.42 7.714 5.42 C 5.111 5.42 3.5 7.67 3.5 9.49 c 0.0 1.695 0.809 3.41 2.108 5.08 C 6.0 15.072 6.431 15.564 6.89 16.044 Z m 12.933 -8.69 l 1.076 -1.077 C 21.613 7.262 22.0 8.423 22.0 9.49 c 0.0 2.17 -1.028 4.207 -2.424 6.0 c -1.402 1.801 -3.233 3.432 -4.97 4.804 l -0.094 0.075 c -0.626 0.495 -1.1 0.87 -1.703 1.035 c -0.504 0.139 -1.114 0.139 -1.618 0.0 c -0.604 -0.165 -1.077 -0.54 -1.703 -1.035 l -0.094 -0.075 c -0.457 -0.36 -0.92 -0.738 -1.379 -1.133 l 1.064 -1.063 c 0.412 0.35 0.829 0.691 1.244 1.02 c 0.763 0.602 0.99 0.765 1.264 0.84 c 0.245 0.067 0.58 0.067 0.826 0.0 c 0.274 -0.075 0.5 -0.238 1.264 -0.84 c 1.697 -1.342 3.42 -2.886 4.715 -4.549 c 1.3 -1.669 2.108 -3.384 2.108 -5.08 c 0.0 -0.698 -0.238 -1.46 -0.678 -2.134 Z")
        )
    }.build()
}
