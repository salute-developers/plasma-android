package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RadioOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RadioOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 7.0 16.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 15.0 14.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.0 13.0 c 0.0 -2.21 1.79 -4.0 4.0 -4.0 s 4.0 1.79 4.0 4.0 s -1.79 4.0 -4.0 4.0 s -4.0 -1.79 -4.0 -4.0 Z m 4.0 -2.5 c -1.38 0.0 -2.5 1.12 -2.5 2.5 s 1.12 2.5 2.5 2.5 s 2.5 -1.12 2.5 -2.5 s -1.12 -2.5 -2.5 -2.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.0 3.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 S 5.0 2.448 5.0 3.0 v 3.04 C 4.555 6.08 4.152 6.163 3.775 6.355 c -0.612 0.312 -1.11 0.809 -1.42 1.42 c -0.2 0.391 -0.28 0.81 -0.318 1.273 C 2.0 9.494 2.0 10.045 2.0 10.719 v 4.562 c 0.0 0.674 0.0 1.225 0.037 1.672 c 0.037 0.463 0.118 0.882 0.317 1.273 c 0.312 0.611 0.809 1.108 1.42 1.42 c 0.391 0.199 0.81 0.28 1.273 0.317 C 5.495 20.0 6.045 20.0 6.719 20.0 H 17.28 c 0.674 0.0 1.225 0.0 1.672 -0.037 c 0.463 -0.037 0.882 -0.118 1.273 -0.317 c 0.611 -0.312 1.108 -0.809 1.42 -1.42 c 0.199 -0.391 0.28 -0.81 0.317 -1.273 C 22.0 16.506 22.0 15.955 22.0 15.281 V 10.72 c 0.0 -0.674 0.0 -1.224 -0.037 -1.672 c -0.037 -0.463 -0.118 -0.882 -0.317 -1.272 c -0.312 -0.612 -0.809 -1.11 -1.42 -1.42 c -0.391 -0.2 -0.81 -0.28 -1.273 -0.318 C 18.506 6.0 17.955 6.0 17.282 6.0 H 7.0 V 3.0 Z m 11.83 15.468 c 0.371 -0.03 0.57 -0.085 0.715 -0.159 c 0.329 -0.168 0.596 -0.435 0.764 -0.765 c 0.074 -0.144 0.13 -0.343 0.16 -0.713 c 0.03 -0.38 0.031 -0.869 0.031 -1.581 v -4.5 c 0.0 -0.712 0.0 -1.202 -0.032 -1.58 c -0.03 -0.371 -0.085 -0.57 -0.159 -0.714 c -0.168 -0.33 -0.435 -0.597 -0.765 -0.765 c -0.144 -0.074 -0.343 -0.13 -0.713 -0.16 C 18.45 7.502 17.962 7.5 17.25 7.5 H 6.75 c -0.712 0.0 -1.202 0.0 -1.58 0.032 C 4.798 7.562 4.6 7.617 4.455 7.69 C 4.126 7.859 3.859 8.126 3.69 8.456 C 3.617 8.6 3.56 8.799 3.53 9.169 C 3.502 9.55 3.5 10.038 3.5 10.75 v 4.5 c 0.0 0.712 0.0 1.202 0.032 1.58 c 0.03 0.371 0.085 0.57 0.159 0.715 c 0.168 0.329 0.435 0.596 0.765 0.764 c 0.144 0.074 0.343 0.13 0.713 0.16 c 0.38 0.03 0.869 0.031 1.581 0.031 h 10.5 c 0.712 0.0 1.202 0.0 1.58 -0.032 Z")
        )
    }.build()
}
