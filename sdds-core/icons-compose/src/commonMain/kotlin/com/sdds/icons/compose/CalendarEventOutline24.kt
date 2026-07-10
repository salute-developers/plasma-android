package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CalendarEventOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CalendarEventOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 18.0 c 1.105 0.0 2.0 -0.895 2.0 -2.0 s -0.895 -2.0 -2.0 -2.0 s -2.0 0.895 -2.0 2.0 s 0.895 2.0 2.0 2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.75 2.75 C 7.75 2.336 7.414 2.0 7.0 2.0 S 6.25 2.336 6.25 2.75 v 1.256 C 5.96 4.014 5.716 4.036 5.491 4.09 C 4.303 4.375 3.375 5.303 3.09 6.49 C 3.0 6.867 3.0 7.301 3.0 7.903 v 8.378 c 0.0 0.674 0.0 1.225 0.037 1.672 c 0.037 0.463 0.118 0.882 0.317 1.273 c 0.312 0.611 0.81 1.108 1.42 1.42 c 0.391 0.199 0.81 0.28 1.273 0.317 C 6.495 21.0 7.045 21.0 7.719 21.0 h 8.563 c 0.673 0.0 1.224 0.0 1.671 -0.037 c 0.463 -0.037 0.882 -0.118 1.273 -0.317 c 0.611 -0.312 1.108 -0.809 1.42 -1.42 c 0.199 -0.391 0.28 -0.81 0.317 -1.273 C 21.0 17.506 21.0 16.955 21.0 16.281 V 7.903 c 0.0 -0.603 0.0 -1.036 -0.09 -1.412 c -0.285 -1.188 -1.213 -2.116 -2.401 -2.401 c -0.225 -0.054 -0.47 -0.076 -0.759 -0.084 V 2.75 C 17.75 2.336 17.414 2.0 17.0 2.0 s -0.75 0.336 -0.75 0.75 V 4.0 h -8.5 V 2.75 Z M 5.842 5.548 C 6.022 5.505 6.259 5.5 7.0 5.5 h 10.0 c 0.74 0.0 0.979 0.005 1.159 0.048 c 0.64 0.154 1.14 0.654 1.293 1.293 C 19.495 7.021 19.5 7.26 19.5 8.0 v 1.0 h -15.0 V 8.0 c 0.0 -0.74 0.005 -0.979 0.048 -1.159 c 0.154 -0.64 0.654 -1.139 1.294 -1.293 Z M 4.5 10.5 h 15.0 v 5.75 c 0.0 0.712 0.0 1.202 -0.032 1.58 c -0.03 0.371 -0.085 0.57 -0.159 0.715 c -0.168 0.329 -0.435 0.596 -0.765 0.764 c -0.143 0.074 -0.343 0.13 -0.713 0.16 c -0.38 0.03 -0.869 0.031 -1.58 0.031 H 7.75 c -0.712 0.0 -1.202 0.0 -1.58 -0.032 c -0.371 -0.03 -0.57 -0.085 -0.714 -0.159 c -0.33 -0.168 -0.597 -0.435 -0.765 -0.765 c -0.074 -0.144 -0.13 -0.343 -0.16 -0.713 c -0.03 -0.38 -0.03 -0.869 -0.03 -1.581 V 10.5 Z")
        )
    }.build()
}
