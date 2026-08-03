package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WalletFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WalletFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.888 3.369 C 3.813 3.489 3.0 4.396 3.0 5.478 V 15.57 c 0.0 0.629 0.0 1.144 0.033 1.564 c 0.035 0.437 0.108 0.832 0.289 1.206 c 0.283 0.589 0.736 1.078 1.301 1.405 c 0.36 0.208 0.748 0.31 1.181 0.378 c 0.417 0.065 0.93 0.104 1.557 0.152 l 8.563 0.648 c 0.72 0.055 1.306 0.1 1.783 0.095 c 0.493 -0.004 0.941 -0.058 1.363 -0.246 c 0.658 -0.293 1.2 -0.795 1.542 -1.429 c 0.219 -0.407 0.307 -0.85 0.348 -1.34 C 21.0 17.528 21.0 16.94 21.0 16.218 v -4.54 c 0.0 -0.628 0.0 -1.143 -0.033 -1.564 c -0.035 -0.436 -0.108 -0.832 -0.288 -1.206 c -0.284 -0.588 -0.737 -1.077 -1.302 -1.404 c -0.36 -0.208 -0.748 -0.311 -1.181 -0.379 c -0.063 -0.01 -0.129 -0.019 -0.196 -0.027 V 4.509 c 0.0 -0.285 0.0 -0.544 -0.018 -0.76 c -0.02 -0.23 -0.065 -0.483 -0.2 -0.728 c -0.191 -0.347 -0.495 -0.618 -0.86 -0.77 c -0.259 -0.107 -0.516 -0.124 -0.746 -0.118 c -0.216 0.005 -0.474 0.034 -0.758 0.066 l -10.53 1.17 Z m 10.668 0.324 c 0.32 -0.036 0.514 -0.057 0.658 -0.06 c 0.088 -0.003 0.126 0.003 0.136 0.005 c 0.05 0.021 0.09 0.058 0.117 0.104 c 0.003 0.01 0.013 0.047 0.02 0.135 C 16.5 4.02 16.5 4.215 16.5 4.537 v 2.426 L 5.075 6.098 C 4.751 6.073 4.5 5.803 4.5 5.478 c 0.0 -0.317 0.238 -0.583 0.553 -0.618 l 10.503 -1.167 Z m -0.5 9.319 c -0.412 -0.031 -0.773 0.278 -0.804 0.691 c -0.031 0.413 0.278 0.773 0.691 0.805 l 2.5 0.189 c 0.413 0.031 0.774 -0.278 0.805 -0.691 c 0.031 -0.413 -0.278 -0.773 -0.691 -0.805 l -2.5 -0.19 Z")
        )
    }.build()
}
