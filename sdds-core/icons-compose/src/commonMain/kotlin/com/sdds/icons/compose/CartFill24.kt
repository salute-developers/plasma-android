package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CartFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CartFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.764 4.5 c 0.698 0.0 0.89 0.007 1.039 0.05 C 3.109 4.64 3.37 4.837 3.536 5.105 C 3.613 5.231 3.667 5.401 3.829 6.0 H 3.827 l 1.757 7.156 l 0.03 0.112 l 0.058 0.217 l 0.136 0.504 l 0.019 -0.004 c 0.085 0.234 0.187 0.446 0.331 0.63 c 0.245 0.316 0.57 0.561 0.943 0.713 c 0.426 0.174 0.912 0.173 1.466 0.172 h 0.118 h 7.696 h 0.118 c 0.554 0.0 1.04 0.002 1.466 -0.172 c 0.373 -0.152 0.698 -0.397 0.943 -0.712 c 0.28 -0.36 0.403 -0.822 0.544 -1.348 l 0.03 -0.112 l 1.32 -4.476 c 0.068 -0.25 0.13 -0.483 0.165 -0.68 c 0.037 -0.21 0.06 -0.466 -0.023 -0.736 c -0.111 -0.366 -0.357 -0.679 -0.69 -0.879 c -0.244 -0.147 -0.502 -0.19 -0.718 -0.21 c -0.202 -0.017 -0.448 -0.017 -0.711 -0.017 H 5.495 L 5.301 5.602 c -0.14 -0.523 -0.249 -0.93 -0.458 -1.27 C 4.482 3.74 3.906 3.304 3.232 3.11 C 2.844 2.999 2.414 3.0 1.864 3.0 h -0.1 C 1.342 3.0 1.0 3.336 1.0 3.75 S 1.342 4.5 1.764 4.5 Z m 8.403 14.25 c 0.0 0.966 -0.798 1.75 -1.782 1.75 c -0.985 0.0 -1.783 -0.784 -1.783 -1.75 S 7.4 17.0 8.385 17.0 c 0.984 0.0 1.782 0.784 1.782 1.75 Z m 6.876 1.75 c 0.984 0.0 1.782 -0.784 1.782 -1.75 S 18.027 17.0 17.043 17.0 c -0.985 0.0 -1.783 0.784 -1.783 1.75 s 0.798 1.75 1.783 1.75 Z")
        )
    }.build()
}
