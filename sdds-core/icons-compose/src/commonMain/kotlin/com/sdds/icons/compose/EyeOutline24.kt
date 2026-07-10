package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EyeOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EyeOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.27 11.125 C 5.076 8.198 8.311 6.25 12.0 6.25 s 6.923 1.948 8.73 4.876 c 0.206 0.334 0.247 0.408 0.29 0.6 c 0.007 0.031 0.019 0.132 0.019 0.274 c 0.0 0.142 -0.012 0.243 -0.019 0.274 c -0.043 0.193 -0.084 0.266 -0.29 0.6 c -1.807 2.928 -5.041 4.876 -8.73 4.876 s -6.924 -1.948 -8.73 -4.876 c -0.206 -0.334 -0.247 -0.408 -0.29 -0.6 C 2.973 12.243 2.96 12.142 2.96 12.0 c 0.0 -0.142 0.013 -0.243 0.02 -0.274 c 0.043 -0.193 0.084 -0.266 0.29 -0.6 Z M 12.0 4.75 c -4.23 0.0 -7.938 2.236 -10.006 5.588 l -0.016 0.024 c -0.2 0.325 -0.36 0.585 -0.462 1.035 C 1.474 11.585 1.461 11.813 1.461 12.0 s 0.013 0.415 0.055 0.603 c 0.101 0.45 0.262 0.71 0.462 1.034 l 0.016 0.025 C 4.062 17.014 7.769 19.25 12.0 19.25 c 4.23 0.0 7.938 -2.236 10.006 -5.588 l 0.015 -0.024 c 0.2 -0.325 0.361 -0.585 0.462 -1.035 c 0.043 -0.188 0.056 -0.416 0.056 -0.603 s -0.013 -0.415 -0.056 -0.603 c -0.1 -0.45 -0.261 -0.71 -0.462 -1.034 l -0.015 -0.025 C 19.938 6.986 16.23 4.75 12.0 4.75 Z M 12.0 16.0 c 2.21 0.0 4.0 -1.79 4.0 -4.0 s -1.79 -4.0 -4.0 -4.0 s -4.0 1.79 -4.0 4.0 s 1.79 4.0 4.0 4.0 Z")
        )
    }.build()
}
