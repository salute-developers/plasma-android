package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldLinesCirclesOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldLinesCirclesOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.99 5.611 c -0.833 0.515 -2.544 1.522 -4.597 2.458 c -2.055 0.937 -4.548 1.848 -6.884 2.064 c 0.062 3.108 0.425 5.74 0.984 7.97 l 10.14 -5.672 c -0.014 -0.106 -0.022 -0.214 -0.022 -0.324 c 0.0 -1.414 1.187 -2.56 2.65 -2.56 c 1.463 0.0 2.65 1.146 2.65 2.56 c 0.0 1.414 -1.187 2.56 -2.65 2.56 c -0.601 0.0 -1.155 -0.194 -1.6 -0.52 L 8.07 20.073 c 1.112 3.287 2.672 5.53 4.206 7.06 c 2.528 2.522 5.08 3.202 5.716 3.338 c 0.635 -0.136 3.188 -0.816 5.716 -3.338 c 1.868 -1.864 3.776 -4.787 4.864 -9.366 l -10.223 5.718 c 0.014 0.106 0.021 0.214 0.021 0.325 c 0.0 1.413 -1.186 2.56 -2.65 2.56 c -1.462 0.0 -2.649 -1.147 -2.649 -2.56 c 0.0 -1.414 1.187 -2.56 2.65 -2.56 c 0.6 0.0 1.155 0.193 1.599 0.518 L 29.063 15.2 c 0.229 -1.53 0.372 -3.213 0.409 -5.066 c -2.335 -0.216 -4.83 -1.127 -6.883 -2.064 c -2.053 -0.936 -3.765 -1.943 -4.598 -2.458 Z M 17.25 3.716 c 0.454 -0.288 1.03 -0.288 1.483 0.0 c 0.585 0.372 2.42 1.5 4.686 2.533 c 2.294 1.046 4.9 1.933 7.063 1.933 c 0.553 0.0 1.0 0.447 1.0 1.0 c 0.0 10.258 -3.077 16.089 -6.362 19.366 c -3.262 3.255 -6.607 3.868 -6.955 3.925 l -0.026 0.004 c -0.023 0.003 -0.078 0.01 -0.147 0.01 c -0.07 0.0 -0.124 -0.007 -0.148 -0.01 l -0.026 -0.004 c -0.347 -0.057 -3.692 -0.67 -6.955 -3.925 C 7.577 25.27 4.5 19.44 4.5 9.182 c 0.0 -0.553 0.448 -1.0 1.0 -1.0 c 2.162 0.0 4.77 -0.887 7.063 -1.933 c 2.265 -1.032 4.101 -2.161 4.686 -2.533 Z")
        )
    }.build()
}
