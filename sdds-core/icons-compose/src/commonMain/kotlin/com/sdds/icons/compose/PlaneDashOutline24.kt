package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlaneDashOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlaneDashOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.512 4.027 C 8.284 2.986 9.077 2.0 10.144 2.0 c 0.958 0.0 1.838 0.529 2.288 1.375 l 2.474 4.658 l 5.049 -5.049 c 0.293 -0.292 0.768 -0.292 1.06 0.0 c 0.293 0.293 0.293 0.768 0.0 1.061 l -9.61 9.61 l -7.36 7.36 c -0.293 0.294 -0.768 0.294 -1.06 0.0 c -0.294 -0.292 -0.294 -0.767 0.0 -1.06 l 5.588 -5.589 l -1.338 -0.04 l -0.619 0.618 C 6.101 15.46 5.401 15.75 4.672 15.75 H 3.405 c -0.744 0.0 -1.227 -0.782 -0.895 -1.447 L 3.662 12.0 L 2.51 9.697 C 2.178 9.032 2.661 8.25 3.405 8.25 h 1.267 c 0.73 0.0 1.429 0.29 1.944 0.805 l 0.62 0.62 L 9.73 9.598 L 8.51 4.027 Z m 1.518 8.883 l 3.767 -3.768 l -2.69 -5.063 c -0.19 -0.356 -0.56 -0.579 -0.963 -0.579 c -0.11 0.0 -0.19 0.1 -0.167 0.207 l 1.412 6.454 c 0.048 0.218 -0.004 0.446 -0.141 0.621 c -0.138 0.176 -0.346 0.282 -0.569 0.289 l -3.722 0.113 C 6.75 11.19 6.55 11.11 6.404 10.963 l -0.848 -0.848 C 5.32 9.882 5.003 9.75 4.672 9.75 H 4.214 l 0.957 1.915 c 0.106 0.21 0.106 0.46 0.0 0.67 L 4.214 14.25 h 0.458 c 0.331 0.0 0.65 -0.132 0.884 -0.366 l 0.848 -0.848 c 0.146 -0.146 0.346 -0.226 0.553 -0.22 l 3.073 0.094 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.281 10.9 l 1.548 -1.547 l 1.4 -0.042 C 20.744 9.265 22.0 10.482 22.0 12.0 s -1.255 2.735 -2.772 2.69 l -3.585 -0.11 l -3.211 6.045 C 11.982 21.47 11.102 22.0 10.144 22.0 c -1.067 0.0 -1.86 -0.986 -1.632 -2.027 l 0.365 -1.668 l 1.965 -1.965 l -0.865 3.953 C 9.954 20.4 10.035 20.5 10.144 20.5 c 0.403 0.0 0.774 -0.223 0.963 -0.579 l 3.43 -6.456 c 0.134 -0.252 0.4 -0.407 0.685 -0.398 l 4.052 0.123 C 19.945 13.21 20.5 12.672 20.5 12.0 c 0.0 -0.671 -0.555 -1.21 -1.226 -1.19 L 16.28 10.9 Z")
        )
    }.build()
}
