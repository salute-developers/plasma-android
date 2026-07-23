package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DzenFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DzenFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.026 1.7 c 2.492 0.0 3.955 0.252 4.983 1.25 c 1.049 1.07 1.29 2.523 1.29 5.015 v 0.07 c 0.0 2.492 -0.241 3.954 -1.29 5.014 c -1.029 0.999 -2.481 1.25 -4.984 1.25 h -0.05 c -2.5 0.0 -3.964 -0.251 -4.983 -1.25 C 1.943 11.979 1.7 10.527 1.7 8.035 v -0.07 c 0.0 -2.492 0.243 -3.955 1.292 -5.015 C 4.021 1.952 5.474 1.7 7.976 1.7 h 0.05 Z M 7.9 3.2 c -0.048 0.0 -0.087 0.04 -0.09 0.087 c -0.065 1.725 -0.284 2.774 -1.018 3.509 C 6.057 7.53 5.009 7.749 3.287 7.814 C 3.24 7.816 3.2 7.856 3.2 7.904 v 0.201 c 0.0 0.048 0.04 0.088 0.087 0.09 C 5.01 8.261 6.057 8.48 6.791 9.213 c 0.733 0.733 0.952 1.78 1.018 3.499 c 0.001 0.048 0.04 0.087 0.09 0.087 H 8.1 c 0.047 0.0 0.087 -0.04 0.09 -0.087 c 0.065 -1.72 0.284 -2.766 1.017 -3.5 c 0.734 -0.733 1.782 -0.951 3.504 -1.017 c 0.048 -0.001 0.087 -0.04 0.087 -0.09 v -0.2 c 0.0 -0.049 -0.038 -0.088 -0.086 -0.09 c -1.722 -0.066 -2.77 -0.286 -3.504 -1.02 S 8.256 5.014 8.19 3.288 C 8.19 3.24 8.15 3.2 8.1 3.2 H 7.9 Z")
        )
    }.build()
}
