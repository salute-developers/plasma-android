package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.UsbAOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "UsbAOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.75 12.5 C 5.336 12.5 5.0 12.836 5.0 13.25 S 5.336 14.0 5.75 14.0 h 12.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 5.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.719 7.0 C 6.045 7.0 5.495 7.0 5.047 7.037 C 4.584 7.074 4.165 7.155 3.775 7.354 c -0.612 0.312 -1.11 0.809 -1.42 1.42 c -0.2 0.391 -0.28 0.81 -0.318 1.273 C 2.0 10.494 2.0 11.045 2.0 11.719 v 0.562 c 0.0 0.674 0.0 1.224 0.037 1.672 c 0.037 0.463 0.118 0.882 0.317 1.273 c 0.312 0.611 0.809 1.108 1.42 1.42 c 0.391 0.199 0.81 0.28 1.273 0.317 C 5.494 17.0 6.045 17.0 6.719 17.0 H 17.28 c 0.674 0.0 1.225 0.0 1.672 -0.037 c 0.463 -0.037 0.882 -0.118 1.273 -0.317 c 0.611 -0.312 1.108 -0.809 1.42 -1.42 c 0.199 -0.391 0.28 -0.81 0.317 -1.273 C 22.0 13.506 22.0 12.955 22.0 12.281 V 11.72 c 0.0 -0.674 0.0 -1.224 -0.037 -1.672 c -0.037 -0.463 -0.118 -0.882 -0.317 -1.272 c -0.312 -0.612 -0.809 -1.11 -1.42 -1.42 c -0.391 -0.2 -0.81 -0.28 -1.273 -0.318 C 18.506 7.0 17.955 7.0 17.281 7.0 H 6.72 Z M 4.456 8.69 C 4.6 8.618 4.799 8.563 5.169 8.533 C 5.55 8.5 6.038 8.5 6.75 8.5 h 10.5 c 0.712 0.0 1.202 0.0 1.58 0.032 c 0.371 0.03 0.57 0.085 0.715 0.159 c 0.329 0.168 0.596 0.435 0.764 0.765 c 0.074 0.144 0.13 0.343 0.16 0.713 c 0.03 0.38 0.031 0.869 0.031 1.581 v 0.5 c 0.0 0.712 0.0 1.202 -0.032 1.58 c -0.03 0.371 -0.085 0.57 -0.159 0.714 c -0.168 0.33 -0.435 0.598 -0.765 0.765 c -0.144 0.074 -0.343 0.13 -0.713 0.16 c -0.38 0.03 -0.869 0.031 -1.581 0.031 H 6.75 c -0.712 0.0 -1.202 0.0 -1.58 -0.032 c -0.371 -0.03 -0.57 -0.085 -0.714 -0.159 c -0.33 -0.167 -0.597 -0.435 -0.765 -0.764 C 3.617 14.4 3.56 14.2 3.53 13.83 C 3.502 13.45 3.5 12.962 3.5 12.25 v -0.5 c 0.0 -0.712 0.0 -1.202 0.032 -1.58 c 0.03 -0.371 0.085 -0.57 0.159 -0.714 c 0.168 -0.33 0.435 -0.597 0.765 -0.765 Z")
        )
    }.build()
}
