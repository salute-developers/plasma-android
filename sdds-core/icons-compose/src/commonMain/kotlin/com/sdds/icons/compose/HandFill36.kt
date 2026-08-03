package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HandFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HandFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.516 6.514 c 0.0 -0.836 0.67 -1.514 1.497 -1.514 c 0.827 0.0 1.498 0.678 1.498 1.514 V 17.87 c 0.0 0.21 0.167 0.379 0.374 0.379 s 0.374 -0.17 0.374 -0.379 V 9.542 c 0.0 -0.836 0.67 -1.514 1.498 -1.514 c 0.827 0.0 1.497 0.678 1.497 1.514 v 9.464 c 0.0 0.209 0.168 0.378 0.374 0.378 c 0.207 0.0 0.375 -0.17 0.375 -0.378 v -4.543 c 0.0 -0.836 0.67 -1.514 1.497 -1.514 c 0.827 0.0 1.498 0.678 1.498 1.514 v 8.328 c 0.0 0.014 0.0 0.029 0.002 0.043 c -0.017 3.54 -2.186 6.857 -5.668 8.139 c -4.468 1.644 -9.409 -0.686 -11.035 -5.204 l -2.945 -8.181 c -0.283 -0.786 0.118 -1.655 0.895 -1.941 c 0.045 -0.017 0.091 -0.031 0.138 -0.043 c 0.61 -0.117 1.234 0.094 1.497 0.654 c 0.254 0.541 0.464 0.955 0.66 1.339 l 1.504 4.178 c 0.062 0.173 0.238 0.275 0.417 0.244 c 0.179 -0.032 0.31 -0.19 0.31 -0.373 V 8.786 c 0.0 -0.837 0.67 -1.515 1.497 -1.515 c 0.827 0.0 1.497 0.678 1.497 1.514 v 7.95 c 0.0 0.209 0.168 0.378 0.374 0.378 c 0.207 0.0 0.375 -0.17 0.375 -0.378 V 6.515 Z")
        )
    }.build()
}
