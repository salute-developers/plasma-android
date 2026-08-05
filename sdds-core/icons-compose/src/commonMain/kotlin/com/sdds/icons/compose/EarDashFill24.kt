package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EarDashFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EarDashFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.8 17.042 c -1.065 0.575 -1.907 1.553 -2.543 2.582 C 12.377 21.05 10.799 22.0 9.0 22.0 c -1.079 0.0 -2.078 -0.342 -2.895 -0.923 L 19.621 7.561 c 0.246 0.769 0.38 1.588 0.38 2.439 c 0.0 3.043 -1.7 5.69 -4.202 7.042 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.015 4.045 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 c -0.292 -0.293 -0.767 -0.293 -1.06 0.0 l -1.848 1.847 C 16.64 3.1 14.448 2.0 12.0 2.0 c -4.418 0.0 -8.0 3.582 -8.0 8.0 c 0.0 0.73 0.098 1.435 0.28 2.107 c 0.318 1.166 0.191 2.45 -0.116 3.619 C 4.057 16.133 4.0 16.56 4.0 17.0 c 0.0 0.581 0.1 1.14 0.282 1.658 l -1.298 1.297 c -0.293 0.293 -0.293 0.768 0.0 1.06 c 0.293 0.294 0.768 0.294 1.061 0.0 l 16.97 -16.97 Z m -5.041 2.92 c -0.467 -0.61 -1.07 -1.107 -1.763 -1.45 c -0.836 -0.412 -1.772 -0.582 -2.701 -0.49 c -0.929 0.09 -1.813 0.44 -2.554 1.008 C 8.216 6.601 7.65 7.365 7.321 8.24 c -0.33 0.873 -0.407 1.821 -0.225 2.736 c 0.182 0.916 0.617 1.762 1.255 2.443 c 0.192 0.205 0.36 0.439 0.49 0.68 l 1.092 -1.091 c -0.149 -0.223 -0.314 -0.43 -0.487 -0.614 c -0.447 -0.477 -0.751 -1.07 -0.879 -1.71 c -0.127 -0.64 -0.073 -1.304 0.157 -1.916 c 0.23 -0.611 0.627 -1.146 1.145 -1.544 c 0.519 -0.397 1.138 -0.642 1.788 -0.706 c 0.65 -0.064 1.305 0.055 1.891 0.344 c 0.546 0.27 1.012 0.676 1.352 1.179 l 1.074 -1.075 Z")
        )
    }.build()
}
