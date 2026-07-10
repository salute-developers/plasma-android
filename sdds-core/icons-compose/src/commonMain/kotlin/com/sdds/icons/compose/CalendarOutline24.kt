package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CalendarOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CalendarOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.0 2.0 c 0.414 0.0 0.75 0.336 0.75 0.75 V 4.0 h 8.5 V 2.75 C 16.25 2.336 16.586 2.0 17.0 2.0 s 0.75 0.336 0.75 0.75 v 1.256 c 0.29 0.008 0.534 0.03 0.759 0.084 c 1.188 0.285 2.116 1.213 2.401 2.401 C 21.0 6.867 21.0 7.301 21.0 7.903 V 8.0 v 8.281 c 0.0 0.674 0.0 1.225 -0.037 1.672 c -0.037 0.463 -0.118 0.882 -0.317 1.273 c -0.312 0.611 -0.809 1.108 -1.42 1.42 c -0.391 0.199 -0.81 0.28 -1.273 0.317 C 17.506 21.0 16.955 21.0 16.282 21.0 H 7.719 c -0.674 0.0 -1.224 0.0 -1.672 -0.037 c -0.463 -0.037 -0.882 -0.118 -1.272 -0.317 c -0.612 -0.312 -1.11 -0.809 -1.42 -1.42 c -0.2 -0.391 -0.28 -0.81 -0.318 -1.273 C 3.0 17.506 3.0 16.955 3.0 16.281 V 8.0 V 7.903 C 3.0 7.3 3.0 6.867 3.09 6.49 C 3.375 5.303 4.303 4.375 5.49 4.09 c 0.225 -0.054 0.47 -0.076 0.76 -0.084 V 2.75 C 6.249 2.336 6.585 2.0 6.999 2.0 Z m 0.0 3.5 c -0.74 0.0 -0.979 0.005 -1.158 0.048 c -0.64 0.154 -1.14 0.654 -1.294 1.293 C 4.505 7.021 4.5 7.26 4.5 8.0 v 1.0 h 15.0 V 8.0 c 0.0 -0.74 -0.005 -0.979 -0.048 -1.159 c -0.154 -0.64 -0.654 -1.139 -1.293 -1.293 C 17.979 5.505 17.74 5.5 17.0 5.5 H 7.0 Z m 12.5 5.0 h -15.0 v 5.75 c 0.0 0.712 0.0 1.202 0.032 1.58 c 0.03 0.371 0.085 0.57 0.159 0.715 c 0.168 0.329 0.435 0.596 0.765 0.764 c 0.144 0.074 0.343 0.13 0.713 0.16 c 0.38 0.03 0.869 0.031 1.581 0.031 h 8.5 c 0.712 0.0 1.202 0.0 1.581 -0.032 c 0.37 -0.03 0.57 -0.085 0.713 -0.159 c 0.33 -0.168 0.598 -0.435 0.765 -0.765 c 0.074 -0.144 0.13 -0.343 0.16 -0.713 c 0.03 -0.38 0.031 -0.869 0.031 -1.581 V 10.5 Z")
        )
    }.build()
}
