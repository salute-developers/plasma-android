package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessagesOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessagesOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 10.647 12.765 l 0.323 -1.616 c 0.02 -0.097 0.067 -0.186 0.137 -0.256 L 19.0 3.0 c 0.552 -0.552 1.448 -0.552 2.0 0.0 s 0.552 1.448 0.0 2.0 l -7.893 7.893 c -0.07 0.07 -0.159 0.117 -0.255 0.137 l -1.617 0.323 c -0.35 0.07 -0.658 -0.238 -0.588 -0.588 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 7.719 3.0 C 7.045 3.0 6.495 3.0 6.047 3.037 C 5.584 3.075 5.165 3.155 4.775 3.354 c -0.612 0.312 -1.11 0.81 -1.42 1.42 c -0.2 0.391 -0.28 0.81 -0.318 1.273 C 3.0 6.495 3.0 7.045 3.0 7.72 v 8.563 c 0.0 0.673 0.0 1.224 0.037 1.671 c 0.037 0.463 0.118 0.882 0.317 1.273 c 0.312 0.611 0.809 1.108 1.42 1.42 c 0.391 0.199 0.81 0.28 1.273 0.318 C 6.494 21.0 7.045 21.0 7.719 21.0 h 8.562 c 0.674 0.0 1.225 0.0 1.672 -0.036 c 0.463 -0.038 0.882 -0.119 1.273 -0.318 c 0.611 -0.312 1.108 -0.809 1.42 -1.42 c 0.199 -0.391 0.28 -0.81 0.317 -1.273 C 21.0 17.506 21.0 16.955 21.0 16.282 V 9.0 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 S 19.5 8.586 19.5 9.0 v 7.25 c 0.0 0.713 0.0 1.202 -0.032 1.581 c -0.03 0.37 -0.085 0.57 -0.159 0.714 c -0.168 0.329 -0.435 0.597 -0.765 0.764 c -0.144 0.074 -0.343 0.13 -0.713 0.16 c -0.38 0.03 -0.869 0.031 -1.581 0.031 h -8.5 c -0.712 0.0 -1.202 0.0 -1.58 -0.031 c -0.371 -0.03 -0.57 -0.086 -0.714 -0.16 c -0.33 -0.167 -0.597 -0.435 -0.765 -0.764 c -0.074 -0.144 -0.13 -0.343 -0.16 -0.714 c -0.03 -0.38 -0.031 -0.868 -0.031 -1.58 v -8.5 c 0.0 -0.713 0.0 -1.203 0.032 -1.582 C 4.562 5.8 4.617 5.6 4.69 5.456 c 0.168 -0.33 0.435 -0.597 0.765 -0.765 C 5.6 4.617 5.799 4.562 6.169 4.53 c 0.38 -0.03 0.869 -0.03 1.581 -0.03 H 15.0 c 0.414 0.0 0.75 -0.337 0.75 -0.75 C 15.75 3.335 15.414 3.0 15.0 3.0 H 7.719 Z")
        )
    }.build()
}
