package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WindowMaximizeLFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WindowMaximizeLFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 17.281 4.0 H 10.0 v 1.5 h 7.25 c 0.712 0.0 1.202 0.0 1.58 0.032 c 0.371 0.03 0.57 0.085 0.715 0.159 c 0.329 0.168 0.596 0.435 0.764 0.765 c 0.074 0.144 0.13 0.343 0.16 0.713 c 0.03 0.38 0.031 0.869 0.031 1.581 V 11.0 h -7.9 c -1.26 0.0 -1.89 0.0 -2.371 0.245 c -0.424 0.216 -0.768 0.56 -0.984 0.984 C 9.0 12.709 9.0 13.338 9.0 14.6 v 3.9 H 6.75 c -0.712 0.0 -1.202 0.0 -1.58 -0.032 c -0.371 -0.03 -0.57 -0.085 -0.714 -0.159 c -0.33 -0.168 -0.597 -0.435 -0.765 -0.765 c -0.074 -0.144 -0.13 -0.343 -0.16 -0.713 C 3.502 16.45 3.5 15.962 3.5 15.25 V 12.0 H 2.0 v 3.281 c 0.0 0.674 0.0 1.225 0.037 1.672 c 0.037 0.463 0.118 0.882 0.317 1.273 c 0.312 0.611 0.809 1.108 1.42 1.42 c 0.391 0.199 0.81 0.28 1.273 0.317 C 5.494 20.0 6.045 20.0 6.719 20.0 H 17.28 c 0.674 0.0 1.225 0.0 1.672 -0.037 c 0.463 -0.037 0.882 -0.118 1.273 -0.317 c 0.611 -0.312 1.108 -0.809 1.42 -1.42 c 0.199 -0.391 0.28 -0.81 0.317 -1.273 C 22.0 16.506 22.0 15.955 22.0 15.281 V 8.72 c 0.0 -0.674 0.0 -1.225 -0.037 -1.672 c -0.037 -0.463 -0.118 -0.882 -0.317 -1.272 c -0.312 -0.612 -0.809 -1.11 -1.42 -1.42 c -0.391 -0.2 -0.81 -0.28 -1.273 -0.318 C 18.506 4.0 17.955 4.0 17.281 4.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 8.25 4.75 C 8.25 4.336 7.914 4.0 7.5 4.0 H 2.75 C 2.336 4.0 2.0 4.336 2.0 4.75 V 9.5 c 0.0 0.414 0.336 0.75 0.75 0.75 S 3.5 9.914 3.5 9.5 V 6.56 l 3.97 3.97 c 0.293 0.293 0.767 0.293 1.06 0.0 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 L 4.56 5.5 H 7.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 Z")
        )
    }.build()
}
