package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FileTextFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FileTextFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.281 2.0 H 8.72 C 8.045 2.0 7.494 2.0 7.047 2.037 C 6.584 2.074 6.165 2.155 5.775 2.354 c -0.612 0.312 -1.11 0.809 -1.42 1.42 c -0.2 0.391 -0.28 0.81 -0.318 1.273 C 4.0 5.495 4.0 6.045 4.0 6.719 V 17.28 c 0.0 0.674 0.0 1.225 0.037 1.672 c 0.037 0.463 0.118 0.882 0.317 1.273 c 0.312 0.611 0.809 1.108 1.42 1.42 c 0.391 0.199 0.81 0.28 1.273 0.317 C 7.494 22.0 8.045 22.0 8.719 22.0 h 6.562 c 0.674 0.0 1.225 0.0 1.672 -0.037 c 0.463 -0.037 0.882 -0.118 1.273 -0.317 c 0.611 -0.312 1.108 -0.809 1.42 -1.42 c 0.199 -0.391 0.28 -0.81 0.317 -1.273 C 20.0 18.506 20.0 17.955 20.0 17.282 V 6.719 c 0.0 -0.674 0.0 -1.225 -0.037 -1.672 c -0.037 -0.463 -0.118 -0.882 -0.317 -1.272 c -0.312 -0.612 -0.809 -1.11 -1.42 -1.42 c -0.391 -0.2 -0.81 -0.28 -1.273 -0.318 C 16.506 2.0 15.955 2.0 15.281 2.0 Z M 8.0 5.25 C 7.586 5.25 7.25 5.586 7.25 6.0 S 7.586 6.75 8.0 6.75 h 3.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 11.414 5.25 11.0 5.25 H 8.0 Z m 0.0 4.0 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 7.586 10.75 8.0 10.75 h 8.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 16.414 9.25 16.0 9.25 H 8.0 Z m 0.0 4.0 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 7.586 14.75 8.0 14.75 h 8.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 8.0 Z m 0.0 4.0 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 7.586 18.75 8.0 18.75 h 8.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 8.0 Z")
        )
    }.build()
}
