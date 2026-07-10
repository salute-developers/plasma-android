package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MegaphoneFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MegaphoneFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.592 4.083 c 0.466 -0.1 0.918 -0.144 1.366 -0.025 c 0.67 0.179 1.25 0.605 1.62 1.193 c 0.246 0.392 0.338 0.837 0.38 1.311 C 22.0 7.025 22.0 7.604 22.0 8.31 v 7.379 c 0.0 0.706 0.0 1.285 -0.041 1.747 c -0.043 0.475 -0.135 0.92 -0.381 1.312 c -0.37 0.588 -0.95 1.014 -1.62 1.193 c -0.448 0.119 -0.9 0.075 -1.366 -0.026 c -0.453 -0.097 -1.007 -0.27 -1.68 -0.479 l -3.05 -0.947 c -0.453 0.731 -1.121 1.312 -1.92 1.659 c -0.985 0.428 -2.097 0.467 -3.11 0.108 c -1.014 -0.359 -1.853 -1.088 -2.35 -2.041 c -0.351 -0.673 -0.513 -1.422 -0.477 -2.169 l -1.79 -0.556 l -0.106 -0.033 c -0.5 -0.154 -0.938 -0.29 -1.278 -0.566 c -0.297 -0.241 -0.527 -0.555 -0.67 -0.91 C 1.998 13.575 2.0 13.116 2.0 12.593 v -0.111 v -0.965 v -0.111 c 0.0 -0.523 -0.002 -0.982 0.161 -1.388 c 0.143 -0.356 0.373 -0.67 0.67 -0.91 C 3.171 8.83 3.61 8.695 4.11 8.54 L 4.215 8.51 l 12.696 -3.947 c 0.674 -0.209 1.227 -0.381 1.681 -0.479 Z M 7.512 16.515 l 4.842 1.505 c -0.271 0.323 -0.615 0.581 -1.009 0.752 c -0.638 0.277 -1.357 0.302 -2.013 0.07 c -0.655 -0.232 -1.199 -0.704 -1.52 -1.32 c -0.165 -0.317 -0.265 -0.659 -0.3 -1.007 Z M 7.5 10.0 c 0.0 -0.415 -0.336 -0.75 -0.75 -0.75 S 6.0 9.585 6.0 10.0 v 4.0 c 0.0 0.414 0.336 0.75 0.75 0.75 S 7.5 14.413 7.5 14.0 v -4.0 Z")
        )
    }.build()
}
