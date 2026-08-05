package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GigaFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GigaFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 2.0 c 5.523 0.0 10.0 4.477 10.0 10.0 s -4.477 10.0 -10.0 10.0 C 6.478 22.0 2.0 17.523 2.0 12.0 C 2.0 6.478 6.478 2.0 12.0 2.0 Z m 8.234 7.577 c -0.252 1.753 -1.143 3.199 -1.886 4.14 c -1.147 1.413 -2.685 2.636 -4.449 3.54 c -1.744 0.894 -3.631 1.438 -5.457 1.571 c -0.308 0.018 -0.595 0.027 -0.864 0.027 c -0.32 0.0 -0.615 -0.012 -0.895 -0.038 c 1.463 1.147 3.307 1.828 5.31 1.828 c 4.76 0.0 8.621 -3.86 8.621 -8.62 c 0.0 -0.827 -0.117 -1.626 -0.334 -2.382 c -0.015 -0.022 -0.03 -0.045 -0.046 -0.066 Z m -7.007 -6.665 c -2.946 0.0 -5.623 1.215 -7.163 3.248 l -0.01 0.012 c -0.665 0.81 -1.107 1.7 -1.278 2.572 c -0.097 0.53 -0.08 1.018 0.054 1.443 c 0.316 0.95 1.086 1.71 1.96 1.934 c 0.362 0.09 0.712 0.13 1.036 0.114 l 0.086 -0.008 c 2.207 -0.177 4.175 -1.568 5.809 -2.906 c 1.022 -0.856 2.0 -1.988 2.063 -2.72 c -1.425 0.692 -2.897 1.591 -4.594 2.807 c -0.188 0.134 -0.444 0.097 -0.585 -0.086 c -0.842 -1.09 -1.576 -1.976 -2.31 -2.785 c -0.08 -0.089 -0.12 -0.208 -0.108 -0.327 c 0.01 -0.119 0.072 -0.229 0.167 -0.3 c 2.25 -1.687 4.488 -2.643 6.66 -2.845 c -0.583 -0.102 -1.18 -0.153 -1.787 -0.153 Z")
        )
    }.build()
}
