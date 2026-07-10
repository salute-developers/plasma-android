package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessagesFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessagesFill24",
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
            pathData = addPathNodes("M 14.168 13.954 c -0.28 0.279 -0.635 0.47 -1.022 0.547 l -1.616 0.323 c -1.4 0.28 -2.634 -0.954 -2.354 -2.353 L 9.5 10.854 c 0.078 -0.387 0.268 -0.742 0.547 -1.022 L 16.88 3.0 h -9.16 C 7.045 3.0 6.494 3.0 6.047 3.037 C 5.584 3.075 5.165 3.155 4.775 3.354 c -0.612 0.312 -1.11 0.81 -1.42 1.42 c -0.2 0.391 -0.28 0.81 -0.318 1.273 C 3.0 6.495 3.0 7.045 3.0 7.72 v 8.563 c 0.0 0.673 0.0 1.224 0.037 1.671 c 0.037 0.463 0.118 0.882 0.317 1.273 c 0.312 0.611 0.809 1.108 1.42 1.42 c 0.391 0.199 0.81 0.28 1.273 0.318 C 6.494 21.0 7.045 21.0 7.719 21.0 h 8.562 c 0.674 0.0 1.225 0.0 1.672 -0.036 c 0.463 -0.038 0.882 -0.119 1.273 -0.318 c 0.611 -0.312 1.108 -0.809 1.42 -1.42 c 0.199 -0.391 0.28 -0.81 0.317 -1.273 C 21.0 17.506 21.0 16.955 21.0 16.282 v -9.16 l -6.832 6.832 Z")
        )
    }.build()
}
