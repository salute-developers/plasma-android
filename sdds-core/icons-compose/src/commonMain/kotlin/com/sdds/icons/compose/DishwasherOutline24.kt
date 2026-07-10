package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DishwasherOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DishwasherOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 6.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 S 6.0 6.552 6.0 6.0 s 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.75 5.25 C 12.336 5.25 12.0 5.586 12.0 6.0 s 0.336 0.75 0.75 0.75 h 4.5 C 17.664 6.75 18.0 6.414 18.0 6.0 s -0.336 -0.75 -0.75 -0.75 h -4.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.719 2.0 C 7.045 2.0 6.494 2.0 6.047 2.037 C 5.584 2.074 5.165 2.155 4.775 2.354 c -0.612 0.312 -1.11 0.809 -1.42 1.42 c -0.2 0.391 -0.28 0.81 -0.318 1.273 C 3.0 5.494 3.0 6.045 3.0 6.719 V 17.28 c 0.0 0.674 0.0 1.225 0.037 1.672 c 0.037 0.463 0.118 0.882 0.317 1.273 c 0.312 0.611 0.809 1.108 1.42 1.42 c 0.391 0.199 0.81 0.28 1.273 0.317 C 6.494 22.0 7.045 22.0 7.719 22.0 h 8.562 c 0.674 0.0 1.225 0.0 1.672 -0.037 c 0.463 -0.037 0.882 -0.118 1.273 -0.317 c 0.611 -0.312 1.108 -0.809 1.42 -1.42 c 0.199 -0.391 0.28 -0.81 0.317 -1.273 C 21.0 18.506 21.0 17.955 21.0 17.281 V 6.72 c 0.0 -0.674 0.0 -1.225 -0.037 -1.672 c -0.037 -0.463 -0.118 -0.882 -0.317 -1.272 c -0.312 -0.612 -0.809 -1.11 -1.42 -1.42 c -0.391 -0.2 -0.81 -0.28 -1.273 -0.318 C 17.506 2.0 16.955 2.0 16.281 2.0 H 7.72 Z M 5.456 3.69 C 5.6 3.618 5.799 3.563 6.169 3.533 C 6.55 3.5 7.038 3.5 7.75 3.5 h 8.5 c 0.712 0.0 1.202 0.0 1.58 0.032 c 0.371 0.03 0.57 0.085 0.715 0.159 c 0.329 0.168 0.596 0.435 0.764 0.765 c 0.074 0.144 0.13 0.343 0.16 0.713 c 0.03 0.38 0.031 0.869 0.031 1.581 V 8.0 h -15.0 V 6.75 c 0.0 -0.712 0.0 -1.202 0.032 -1.58 c 0.03 -0.371 0.085 -0.57 0.159 -0.714 c 0.168 -0.33 0.435 -0.597 0.765 -0.765 Z M 4.5 9.5 v 7.75 c 0.0 0.712 0.0 1.202 0.032 1.58 c 0.03 0.371 0.085 0.57 0.159 0.715 c 0.168 0.329 0.435 0.596 0.765 0.764 c 0.144 0.074 0.343 0.13 0.713 0.16 c 0.38 0.03 0.869 0.031 1.581 0.031 h 8.5 c 0.712 0.0 1.202 0.0 1.58 -0.032 c 0.371 -0.03 0.57 -0.085 0.715 -0.159 c 0.329 -0.168 0.596 -0.435 0.764 -0.765 c 0.074 -0.144 0.13 -0.343 0.16 -0.713 c 0.03 -0.38 0.031 -0.869 0.031 -1.581 V 9.5 h -15.0 Z")
        )
    }.build()
}
