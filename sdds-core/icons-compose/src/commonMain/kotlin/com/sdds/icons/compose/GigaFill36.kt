package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GigaFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GigaFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 3.0 c 8.284 0.0 15.0 6.715 15.0 15.0 s -6.716 15.0 -15.0 15.0 C 9.716 33.0 3.0 26.284 3.0 18.0 C 3.0 9.716 9.716 3.0 18.0 3.0 Z m 12.35 11.365 c -0.379 2.63 -1.715 4.798 -2.83 6.21 c -1.72 2.119 -4.026 3.955 -6.671 5.31 c -2.617 1.342 -5.447 2.157 -8.185 2.357 c -0.463 0.027 -0.893 0.04 -1.297 0.04 c -0.48 0.0 -0.923 -0.019 -1.343 -0.056 c 2.196 1.72 4.962 2.745 7.966 2.745 v -0.002 c 7.141 0.0 12.93 -5.79 12.93 -12.932 c 0.0 -1.24 -0.173 -2.438 -0.5 -3.573 c -0.022 -0.033 -0.046 -0.067 -0.07 -0.099 Z M 19.84 4.368 c -4.419 0.0 -8.435 1.822 -10.744 4.872 L 9.082 9.26 c -0.998 1.216 -1.662 2.55 -1.918 3.858 c -0.145 0.796 -0.119 1.526 0.081 2.163 c 0.475 1.425 1.63 2.567 2.94 2.903 c 0.544 0.135 1.067 0.192 1.554 0.17 l 0.13 -0.012 c 3.31 -0.267 6.261 -2.353 8.712 -4.36 c 1.534 -1.283 3.0 -2.982 3.096 -4.079 c -2.139 1.037 -4.346 2.386 -6.892 4.21 c -0.282 0.201 -0.667 0.145 -0.877 -0.129 c -1.263 -1.636 -2.364 -2.964 -3.466 -4.177 c -0.12 -0.134 -0.18 -0.313 -0.163 -0.49 c 0.017 -0.178 0.11 -0.343 0.253 -0.45 c 3.375 -2.53 6.732 -3.965 9.988 -4.267 c -0.873 -0.154 -1.769 -0.23 -2.68 -0.23 Z")
        )
    }.build()
}
