package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LockOpenOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LockOpenOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.0 18.0 c 1.105 0.0 2.0 -0.895 2.0 -2.0 s -0.895 -2.0 -2.0 -2.0 s -2.0 0.895 -2.0 2.0 s 0.895 2.0 2.0 2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.75 6.625 c 0.0 -1.588 1.287 -2.875 2.875 -2.875 S 20.5 5.037 20.5 6.625 V 11.5 c 0.0 0.414 0.336 0.75 0.75 0.75 S 22.0 11.914 22.0 11.5 V 6.625 c 0.0 -2.416 -1.959 -4.375 -4.375 -4.375 S 13.25 4.209 13.25 6.625 V 10.0 H 6.719 c -0.674 0.0 -1.224 0.0 -1.672 0.037 c -0.463 0.037 -0.882 0.118 -1.272 0.317 c -0.612 0.312 -1.11 0.809 -1.42 1.42 c -0.2 0.391 -0.28 0.81 -0.318 1.273 C 2.0 13.494 2.0 14.045 2.0 14.719 v 2.562 c 0.0 0.674 0.0 1.225 0.037 1.672 c 0.037 0.463 0.118 0.882 0.317 1.273 c 0.312 0.611 0.809 1.108 1.42 1.42 c 0.391 0.199 0.81 0.28 1.273 0.317 C 5.494 22.0 6.045 22.0 6.719 22.0 h 6.562 c 0.674 0.0 1.224 0.0 1.672 -0.037 c 0.463 -0.037 0.882 -0.118 1.273 -0.317 c 0.611 -0.312 1.108 -0.809 1.42 -1.42 c 0.199 -0.391 0.28 -0.81 0.317 -1.273 C 18.0 18.506 18.0 17.955 18.0 17.281 v -3.378 c 0.0 -0.603 0.0 -1.036 -0.09 -1.412 c -0.285 -1.188 -1.213 -2.116 -2.401 -2.401 c -0.225 -0.054 -0.47 -0.076 -0.759 -0.084 V 6.625 Z M 14.0 11.5 c 0.74 0.0 0.979 0.005 1.159 0.048 c 0.64 0.154 1.139 0.654 1.293 1.293 C 16.495 13.021 16.5 13.26 16.5 14.0 v 3.25 c 0.0 0.712 0.0 1.202 -0.032 1.58 c -0.03 0.371 -0.085 0.57 -0.159 0.715 c -0.168 0.329 -0.435 0.596 -0.765 0.764 c -0.144 0.074 -0.343 0.13 -0.713 0.16 c -0.38 0.03 -0.869 0.031 -1.581 0.031 h -6.5 c -0.712 0.0 -1.202 0.0 -1.58 -0.032 c -0.371 -0.03 -0.57 -0.085 -0.714 -0.159 c -0.33 -0.168 -0.597 -0.435 -0.765 -0.765 c -0.074 -0.144 -0.13 -0.343 -0.16 -0.713 C 3.502 18.45 3.5 17.962 3.5 17.25 v -2.5 c 0.0 -0.712 0.0 -1.202 0.032 -1.58 c 0.03 -0.371 0.085 -0.57 0.159 -0.714 c 0.168 -0.33 0.435 -0.598 0.765 -0.765 c 0.144 -0.074 0.343 -0.13 0.713 -0.16 c 0.38 -0.03 0.869 -0.031 1.581 -0.031 H 14.0 Z")
        )
    }.build()
}
