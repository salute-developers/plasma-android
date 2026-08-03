package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WindowMaximizeLFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WindowMaximizeLFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.72 2.5 H 6.598 v 1.0 H 11.7 c 0.498 0.0 0.842 0.0 1.109 0.022 c 0.26 0.022 0.403 0.06 0.508 0.114 c 0.236 0.12 0.427 0.311 0.547 0.547 c 0.053 0.104 0.092 0.247 0.114 0.508 C 13.999 4.958 14.0 5.301 14.0 5.8 v 1.51 H 8.416 c -0.882 0.0 -1.323 0.0 -1.66 0.171 C 6.46 7.632 6.22 7.873 6.068 8.17 C 5.896 8.506 5.896 8.947 5.896 9.83 v 2.667 H 4.304 c -0.498 0.0 -0.842 0.0 -1.109 -0.022 c -0.26 -0.021 -0.404 -0.06 -0.509 -0.114 c -0.235 -0.12 -0.426 -0.311 -0.546 -0.546 c -0.053 -0.105 -0.093 -0.248 -0.114 -0.51 c -0.022 -0.266 -0.022 -0.61 -0.022 -1.108 V 8.0 h -1.0 v 2.22 c 0.0 0.471 0.0 0.856 0.025 1.168 C 1.056 11.71 1.112 12.0 1.25 12.27 c 0.216 0.423 0.56 0.767 0.983 0.983 c 0.27 0.137 0.559 0.193 0.882 0.22 c 0.312 0.025 0.697 0.025 1.169 0.025 h 7.438 c 0.472 0.0 0.857 0.0 1.169 -0.025 c 0.323 -0.027 0.612 -0.083 0.881 -0.22 c 0.424 -0.216 0.768 -0.56 0.984 -0.983 c 0.137 -0.27 0.193 -0.559 0.22 -0.882 C 15.0 11.075 15.0 10.69 15.0 10.218 v -4.44 c 0.0 -0.471 0.0 -0.856 -0.026 -1.168 c -0.026 -0.323 -0.082 -0.612 -0.22 -0.881 c -0.215 -0.424 -0.56 -0.768 -0.983 -0.984 c -0.27 -0.137 -0.558 -0.193 -0.881 -0.22 C 12.578 2.5 12.193 2.5 11.72 2.5 Z M 5.34 3.0 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 H 1.503 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 3.275 c 0.0 0.276 0.224 0.5 0.5 0.5 c 0.277 0.0 0.5 -0.224 0.5 -0.5 V 4.19 l 2.838 2.786 C 5.038 7.17 5.355 7.167 5.548 6.97 c 0.194 -0.197 0.19 -0.514 -0.006 -0.707 L 2.727 3.5 H 4.84 c 0.276 0.0 0.5 -0.224 0.5 -0.5 Z")
        )
    }.build()
}
