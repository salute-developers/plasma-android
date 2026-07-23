package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HandActionFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HandActionFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.803 5.065 C 6.427 4.661 5.793 4.64 5.39 5.015 C 4.986 5.393 4.964 6.026 5.34 6.43 l 5.115 5.485 c 0.095 0.101 0.09 0.26 -0.012 0.354 c -0.1 0.094 -0.26 0.088 -0.353 -0.013 L 6.339 8.233 c -0.377 -0.404 -1.01 -0.426 -1.414 -0.05 C 4.522 8.56 4.5 9.193 4.876 9.597 l 4.263 4.57 c 0.094 0.102 0.088 0.26 -0.013 0.354 c -0.1 0.094 -0.259 0.089 -0.353 -0.012 l -2.046 -2.194 c -0.377 -0.404 -1.01 -0.426 -1.413 -0.05 c -0.404 0.377 -0.426 1.01 -0.05 1.414 L 9.015 17.7 c 0.007 0.007 0.013 0.014 0.018 0.022 c 1.603 1.702 4.156 2.316 6.434 1.35 c 2.923 -1.241 4.287 -4.617 3.046 -7.54 L 16.267 6.24 c -0.216 -0.508 -0.803 -0.746 -1.312 -0.53 c -0.03 0.013 -0.06 0.027 -0.087 0.043 c -0.35 0.221 -0.56 0.607 -0.436 0.997 c 0.12 0.378 0.204 0.675 0.282 0.95 l 1.146 2.7 c 0.048 0.112 0.008 0.242 -0.094 0.308 c -0.102 0.066 -0.236 0.05 -0.319 -0.04 l -5.792 -6.21 C 9.278 4.052 8.645 4.03 8.24 4.407 c -0.404 0.376 -0.426 1.01 -0.05 1.413 l 3.581 3.84 c 0.095 0.1 0.089 0.259 -0.012 0.353 c -0.101 0.094 -0.26 0.089 -0.353 -0.012 L 6.803 5.065 Z")
        )
    }.build()
}
