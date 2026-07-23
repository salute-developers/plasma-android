package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BlankTextOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BlankTextOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 12.25 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 7.586 13.75 8.0 13.75 h 8.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 8.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 16.25 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 7.586 17.75 8.0 17.75 h 8.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 8.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.719 2.0 C 8.045 2.0 7.494 2.0 7.047 2.037 C 6.584 2.074 6.165 2.155 5.775 2.354 c -0.612 0.312 -1.11 0.809 -1.42 1.42 c -0.2 0.391 -0.28 0.81 -0.318 1.273 C 4.0 5.494 4.0 6.045 4.0 6.719 V 17.28 c 0.0 0.674 0.0 1.225 0.037 1.672 c 0.037 0.463 0.118 0.882 0.317 1.273 c 0.312 0.611 0.809 1.108 1.42 1.42 c 0.391 0.199 0.81 0.28 1.273 0.317 C 7.494 22.0 8.045 22.0 8.719 22.0 h 6.562 c 0.674 0.0 1.225 0.0 1.672 -0.037 c 0.463 -0.037 0.882 -0.118 1.273 -0.317 c 0.611 -0.312 1.108 -0.809 1.42 -1.42 c 0.199 -0.391 0.28 -0.81 0.317 -1.273 C 20.0 18.506 20.0 17.955 20.0 17.281 V 8.75 c 0.0 -0.199 -0.079 -0.39 -0.22 -0.53 l -6.0 -6.0 C 13.64 2.079 13.45 2.0 13.25 2.0 H 8.719 Z M 6.456 3.69 C 6.6 3.618 6.799 3.563 7.169 3.533 C 7.55 3.5 8.038 3.5 8.75 3.5 h 3.75 v 2.08 c 0.0 0.535 0.0 0.98 0.03 1.345 c 0.03 0.38 0.098 0.736 0.27 1.073 C 13.063 8.516 13.484 8.937 14.0 9.2 c 0.338 0.172 0.694 0.24 1.074 0.27 c 0.365 0.03 0.81 0.03 1.345 0.03 h 2.08 v 7.75 c 0.0 0.712 0.0 1.202 -0.032 1.58 c -0.03 0.371 -0.085 0.57 -0.159 0.715 c -0.168 0.329 -0.435 0.596 -0.765 0.764 c -0.144 0.074 -0.343 0.13 -0.713 0.16 c -0.38 0.03 -0.869 0.031 -1.581 0.031 h -6.5 c -0.712 0.0 -1.202 0.0 -1.58 -0.032 c -0.371 -0.03 -0.57 -0.085 -0.714 -0.159 c -0.33 -0.168 -0.597 -0.435 -0.765 -0.765 c -0.074 -0.144 -0.13 -0.343 -0.16 -0.713 C 5.502 18.45 5.5 17.962 5.5 17.25 V 6.75 c 0.0 -0.712 0.0 -1.202 0.032 -1.58 c 0.03 -0.371 0.085 -0.57 0.159 -0.714 c 0.168 -0.33 0.435 -0.597 0.765 -0.765 Z M 17.439 8.0 L 14.0 4.56 v 0.99 c 0.0 0.572 0.0 0.957 0.025 1.253 c 0.023 0.287 0.065 0.424 0.111 0.514 c 0.12 0.236 0.311 0.427 0.546 0.547 c 0.091 0.046 0.228 0.088 0.515 0.111 C 15.493 8.0 15.877 8.0 16.45 8.0 h 0.99 Z")
        )
    }.build()
}
