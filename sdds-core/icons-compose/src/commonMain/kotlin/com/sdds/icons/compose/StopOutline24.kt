package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StopOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StopOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.719 3.0 h 8.562 c 0.674 0.0 1.225 0.0 1.672 0.037 c 0.463 0.037 0.882 0.118 1.273 0.317 c 0.611 0.312 1.108 0.809 1.42 1.42 c 0.199 0.391 0.28 0.81 0.317 1.273 C 21.0 6.494 21.0 7.045 21.0 7.719 v 8.562 c 0.0 0.674 0.0 1.225 -0.037 1.672 c -0.037 0.463 -0.118 0.882 -0.317 1.273 c -0.312 0.611 -0.809 1.108 -1.42 1.42 c -0.391 0.199 -0.81 0.28 -1.273 0.317 C 17.506 21.0 16.955 21.0 16.281 21.0 H 7.72 c -0.674 0.0 -1.225 0.0 -1.672 -0.037 c -0.463 -0.037 -0.882 -0.118 -1.272 -0.317 c -0.612 -0.312 -1.11 -0.809 -1.42 -1.42 c -0.2 -0.391 -0.28 -0.81 -0.318 -1.273 C 3.0 17.506 3.0 16.955 3.0 16.281 V 7.72 c 0.0 -0.674 0.0 -1.224 0.037 -1.672 c 0.037 -0.463 0.118 -0.882 0.317 -1.272 c 0.312 -0.612 0.809 -1.11 1.42 -1.42 c 0.391 -0.2 0.81 -0.28 1.273 -0.318 C 6.495 3.0 7.045 3.0 7.719 3.0 Z m -1.55 1.532 C 5.8 4.562 5.6 4.617 5.456 4.69 C 5.126 4.859 4.859 5.126 4.69 5.456 C 4.617 5.6 4.56 5.799 4.53 6.169 C 4.502 6.55 4.5 7.038 4.5 7.75 v 8.5 c 0.0 0.712 0.0 1.202 0.032 1.58 c 0.03 0.371 0.085 0.57 0.159 0.715 c 0.168 0.329 0.435 0.596 0.765 0.764 c 0.144 0.074 0.343 0.13 0.713 0.16 c 0.38 0.03 0.869 0.031 1.581 0.031 h 8.5 c 0.712 0.0 1.202 0.0 1.58 -0.032 c 0.371 -0.03 0.57 -0.085 0.715 -0.159 c 0.329 -0.168 0.596 -0.435 0.764 -0.765 c 0.074 -0.144 0.13 -0.343 0.16 -0.713 c 0.03 -0.38 0.031 -0.869 0.031 -1.581 v -8.5 c 0.0 -0.712 0.0 -1.202 -0.032 -1.58 c -0.03 -0.371 -0.085 -0.57 -0.159 -0.714 c -0.168 -0.33 -0.435 -0.597 -0.765 -0.765 c -0.144 -0.074 -0.343 -0.13 -0.713 -0.16 C 17.45 4.502 16.962 4.5 16.25 4.5 h -8.5 c -0.712 0.0 -1.202 0.0 -1.58 0.032 Z")
        )
    }.build()
}
