package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.OpenFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "OpenFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.281 3.0 H 7.72 C 7.045 3.0 6.494 3.0 6.047 3.037 C 5.584 3.074 5.165 3.155 4.775 3.354 c -0.612 0.312 -1.11 0.809 -1.42 1.42 c -0.2 0.391 -0.28 0.81 -0.318 1.273 C 3.0 6.494 3.0 7.045 3.0 7.719 v 8.562 c 0.0 0.674 0.0 1.225 0.037 1.672 c 0.037 0.463 0.118 0.882 0.317 1.273 c 0.312 0.611 0.809 1.108 1.42 1.42 c 0.391 0.199 0.81 0.28 1.273 0.317 C 6.494 21.0 7.045 21.0 7.719 21.0 h 8.562 c 0.674 0.0 1.225 0.0 1.672 -0.037 c 0.463 -0.037 0.882 -0.118 1.273 -0.317 c 0.611 -0.312 1.108 -0.809 1.42 -1.42 c 0.199 -0.391 0.28 -0.81 0.317 -1.273 C 21.0 17.506 21.0 16.955 21.0 16.281 V 7.72 c 0.0 -0.674 0.0 -1.225 -0.037 -1.672 c -0.037 -0.463 -0.118 -0.882 -0.317 -1.272 c -0.312 -0.612 -0.809 -1.11 -1.42 -1.42 c -0.391 -0.2 -0.81 -0.28 -1.273 -0.318 C 17.506 3.0 16.955 3.0 16.281 3.0 Z M 9.0 8.0 C 8.586 8.0 8.25 8.336 8.25 8.75 S 8.586 9.5 9.0 9.5 h 4.44 l -5.47 5.47 c -0.293 0.293 -0.293 0.767 0.0 1.06 c 0.293 0.293 0.767 0.293 1.06 0.0 l 5.47 -5.47 V 15.0 c 0.0 0.414 0.336 0.75 0.75 0.75 S 16.0 15.414 16.0 15.0 V 8.75 C 16.0 8.336 15.664 8.0 15.25 8.0 H 9.0 Z")
        )
    }.build()
}
