package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PostFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PostFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.219 21.0 h 7.562 c 0.674 0.0 1.225 0.0 1.672 -0.037 c 0.463 -0.037 0.882 -0.118 1.273 -0.317 c 0.611 -0.312 1.108 -0.809 1.42 -1.42 c 0.199 -0.391 0.28 -0.81 0.317 -1.273 c 0.037 -0.447 0.037 -0.998 0.037 -1.672 V 7.72 c 0.0 -0.674 0.0 -1.225 -0.037 -1.672 c -0.037 -0.463 -0.118 -0.882 -0.317 -1.272 c -0.312 -0.612 -0.809 -1.11 -1.42 -1.42 c -0.391 -0.2 -0.81 -0.28 -1.273 -0.318 C 17.006 3.0 16.455 3.0 15.781 3.0 H 8.22 C 7.545 3.0 6.994 3.0 6.547 3.037 C 6.084 3.074 5.665 3.155 5.275 3.354 c -0.612 0.312 -1.11 0.809 -1.42 1.42 c -0.2 0.391 -0.28 0.81 -0.318 1.273 C 3.5 6.494 3.5 7.045 3.5 7.719 v 8.562 c 0.0 0.674 0.0 1.225 0.037 1.672 c 0.037 0.463 0.118 0.882 0.317 1.273 c 0.312 0.611 0.809 1.108 1.42 1.42 c 0.391 0.199 0.81 0.28 1.273 0.317 C 6.994 21.0 7.545 21.0 8.219 21.0 Z M 18.5 7.4 c 0.0 -0.84 0.0 -1.26 -0.163 -1.581 c -0.144 -0.282 -0.374 -0.512 -0.656 -0.656 C 17.361 5.0 16.941 5.0 16.1 5.0 H 7.9 C 7.06 5.0 6.64 5.0 6.319 5.163 C 6.037 5.307 5.807 5.537 5.663 5.82 C 5.5 6.139 5.5 6.559 5.5 7.4 v 6.2 c 0.0 0.84 0.0 1.26 0.163 1.581 c 0.144 0.282 0.374 0.512 0.656 0.655 C 6.639 16.0 7.059 16.0 7.9 16.0 h 8.2 c 0.84 0.0 1.26 0.0 1.581 -0.164 c 0.282 -0.143 0.512 -0.373 0.655 -0.655 c 0.164 -0.32 0.164 -0.74 0.164 -1.581 V 7.4 Z M 6.25 19.5 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 h 5.5 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 h -5.5 Z")
        )
    }.build()
}
