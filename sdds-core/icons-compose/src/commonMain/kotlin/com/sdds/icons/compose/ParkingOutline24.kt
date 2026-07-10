package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ParkingOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ParkingOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.25 7.5 C 8.836 7.5 8.5 7.836 8.5 8.25 v 7.5 c 0.0 0.414 0.336 0.75 0.75 0.75 S 10.0 16.164 10.0 15.75 V 13.5 h 3.0 c 1.657 0.0 3.0 -1.343 3.0 -3.0 s -1.343 -3.0 -3.0 -3.0 H 9.25 Z M 13.0 12.0 h -3.0 V 9.0 h 3.0 c 0.828 0.0 1.5 0.672 1.5 1.5 S 13.828 12.0 13.0 12.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.719 3.0 C 7.045 3.0 6.494 3.0 6.047 3.037 C 5.584 3.074 5.165 3.155 4.775 3.354 c -0.612 0.312 -1.11 0.809 -1.42 1.42 c -0.2 0.391 -0.28 0.81 -0.318 1.273 C 3.0 6.494 3.0 7.045 3.0 7.719 v 8.562 c 0.0 0.674 0.0 1.225 0.037 1.672 c 0.037 0.463 0.118 0.882 0.317 1.273 c 0.312 0.611 0.809 1.108 1.42 1.42 c 0.391 0.199 0.81 0.28 1.273 0.317 C 6.494 21.0 7.045 21.0 7.719 21.0 h 8.562 c 0.674 0.0 1.225 0.0 1.672 -0.037 c 0.463 -0.037 0.882 -0.118 1.273 -0.317 c 0.611 -0.312 1.108 -0.809 1.42 -1.42 c 0.199 -0.391 0.28 -0.81 0.317 -1.273 C 21.0 17.506 21.0 16.955 21.0 16.281 V 7.72 c 0.0 -0.674 0.0 -1.225 -0.037 -1.672 c -0.037 -0.463 -0.118 -0.882 -0.317 -1.272 c -0.312 -0.612 -0.809 -1.11 -1.42 -1.42 c -0.391 -0.2 -0.81 -0.28 -1.273 -0.318 C 17.506 3.0 16.955 3.0 16.281 3.0 H 7.72 Z M 5.456 4.69 C 5.6 4.618 5.799 4.563 6.169 4.533 C 6.55 4.5 7.038 4.5 7.75 4.5 h 8.5 c 0.712 0.0 1.202 0.0 1.58 0.032 c 0.371 0.03 0.57 0.085 0.715 0.159 c 0.329 0.168 0.596 0.435 0.764 0.765 c 0.074 0.144 0.13 0.343 0.16 0.713 c 0.03 0.38 0.031 0.869 0.031 1.581 v 8.5 c 0.0 0.712 0.0 1.202 -0.032 1.58 c -0.03 0.371 -0.085 0.57 -0.159 0.715 c -0.168 0.329 -0.435 0.596 -0.765 0.764 c -0.144 0.074 -0.343 0.13 -0.713 0.16 c -0.38 0.03 -0.869 0.031 -1.581 0.031 h -8.5 c -0.712 0.0 -1.202 0.0 -1.58 -0.032 c -0.371 -0.03 -0.57 -0.085 -0.714 -0.159 c -0.33 -0.168 -0.597 -0.435 -0.765 -0.765 c -0.074 -0.144 -0.13 -0.343 -0.16 -0.713 C 4.502 17.45 4.5 16.962 4.5 16.25 v -8.5 c 0.0 -0.712 0.0 -1.202 0.032 -1.58 c 0.03 -0.371 0.085 -0.57 0.159 -0.714 c 0.168 -0.33 0.435 -0.597 0.765 -0.765 Z")
        )
    }.build()
}
