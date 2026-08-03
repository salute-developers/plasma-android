package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CallBlockFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CallBlockFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.61 7.148 l 5.032 2.906 C 20.0 8.767 19.462 7.35 18.25 6.653 c -1.211 -0.7 -2.706 -0.459 -3.642 0.495 Z m 4.282 4.205 l -5.033 -2.906 c -0.358 1.287 0.181 2.703 1.392 3.402 c 1.21 0.699 2.705 0.458 3.64 -0.496 Z M 12.854 7.0 C 14.096 4.848 16.848 4.11 19.0 5.354 c 2.152 1.242 2.89 3.994 1.647 6.147 c -1.243 2.152 -3.995 2.89 -6.147 1.647 c -2.153 -1.243 -2.89 -3.995 -1.647 -6.147 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.762 2.842 c -0.34 -0.089 -0.715 -0.044 -1.124 0.192 c -0.65 0.375 -2.111 1.219 -2.785 3.051 c -0.674 1.832 -0.561 4.654 1.94 8.984 c 2.5 4.33 4.886 5.84 6.81 6.172 c 1.924 0.332 3.386 -0.512 4.035 -0.886 c 0.409 -0.236 0.635 -0.538 0.728 -0.878 c 0.093 -0.341 0.053 -0.722 -0.075 -1.116 c -0.255 -0.789 -0.858 -1.63 -1.439 -2.31 c -0.19 -0.222 -0.318 -0.37 -0.413 -0.469 c -0.1 -0.104 -0.195 -0.192 -0.32 -0.267 c -0.117 -0.07 -0.205 -0.114 -0.297 -0.144 l -0.024 -0.007 c -0.119 -0.07 -0.27 -0.098 -0.46 -0.07 l -0.074 0.026 c -0.082 0.01 -0.197 0.028 -0.36 0.06 c -0.282 0.057 -0.66 0.146 -1.161 0.265 c -0.622 0.148 -1.347 0.183 -2.071 -0.087 c -0.724 -0.27 -1.447 -0.843 -2.065 -1.914 c -0.618 -1.07 -0.754 -1.984 -0.625 -2.745 c 0.129 -0.762 0.521 -1.373 0.96 -1.837 c 0.354 -0.375 0.62 -0.657 0.81 -0.873 c 0.202 -0.23 0.28 -0.345 0.316 -0.404 l -0.005 -0.003 c 0.015 -0.024 0.03 -0.049 0.043 -0.074 h 0.002 l 0.025 -0.055 c 0.012 -0.027 0.024 -0.055 0.034 -0.084 c 0.023 -0.06 0.04 -0.115 0.052 -0.17 c 0.02 -0.096 0.025 -0.194 0.023 -0.33 c -0.001 -0.146 -0.03 -0.273 -0.07 -0.411 c -0.04 -0.132 -0.103 -0.317 -0.2 -0.592 c -0.3 -0.843 -0.726 -1.786 -1.28 -2.401 c -0.279 -0.308 -0.588 -0.533 -0.93 -0.623 Z")
        )
    }.build()
}
