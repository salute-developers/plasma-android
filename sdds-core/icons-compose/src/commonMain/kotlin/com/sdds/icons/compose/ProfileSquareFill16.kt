package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfileSquareFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfileSquareFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.418 1.75 H 5.582 c -0.565 0.0 -1.02 0.0 -1.389 0.03 c -0.38 0.031 -0.713 0.097 -1.021 0.254 c -0.49 0.25 -0.888 0.648 -1.138 1.138 C 1.877 3.48 1.81 3.814 1.78 4.193 c -0.03 0.37 -0.03 0.824 -0.03 1.389 v 4.836 c 0.0 0.565 0.0 1.02 0.03 1.389 c 0.031 0.38 0.097 0.713 0.254 1.021 c 0.25 0.49 0.648 0.889 1.138 1.138 c 0.308 0.157 0.642 0.223 1.021 0.254 c 0.37 0.03 0.824 0.03 1.389 0.03 h 4.836 c 0.565 0.0 1.02 0.0 1.389 -0.03 c 0.38 -0.031 0.713 -0.097 1.021 -0.254 c 0.49 -0.25 0.889 -0.648 1.138 -1.138 c 0.157 -0.308 0.223 -0.642 0.254 -1.021 c 0.03 -0.37 0.03 -0.824 0.03 -1.389 V 5.582 c 0.0 -0.565 0.0 -1.02 -0.03 -1.389 c -0.031 -0.38 -0.097 -0.713 -0.254 -1.021 c -0.25 -0.49 -0.648 -0.888 -1.138 -1.138 c -0.308 -0.157 -0.642 -0.223 -1.021 -0.254 c -0.37 -0.03 -0.824 -0.03 -1.389 -0.03 Z m 0.012 4.86 c 0.0 1.343 -1.089 2.43 -2.431 2.43 s -2.43 -1.087 -2.43 -2.43 c 0.0 -1.342 1.088 -2.43 2.43 -2.43 s 2.43 1.088 2.43 2.43 Z m 2.417 6.025 c -0.136 0.166 -0.306 0.303 -0.5 0.401 c -0.336 0.172 -0.777 0.172 -1.66 0.172 H 5.312 c -0.882 0.0 -1.323 0.0 -1.66 -0.172 c -0.191 -0.098 -0.36 -0.232 -0.495 -0.396 c 0.195 -1.431 2.29 -2.558 4.846 -2.558 c 2.552 0.0 4.645 1.124 4.845 2.553 Z")
        )
    }.build()
}
