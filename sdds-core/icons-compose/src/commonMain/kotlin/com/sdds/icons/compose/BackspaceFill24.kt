package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BackspaceFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BackspaceFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.827 5.0 c -0.534 0.0 -0.925 0.0 -1.3 0.09 c -0.332 0.08 -0.649 0.21 -0.94 0.389 c -0.329 0.202 -0.605 0.478 -0.983 0.856 L 3.711 9.228 C 3.333 9.606 3.018 9.921 2.78 10.2 c -0.246 0.29 -0.451 0.59 -0.568 0.95 c -0.18 0.553 -0.18 1.147 0.0 1.7 c 0.117 0.36 0.322 0.66 0.568 0.95 c 0.237 0.279 0.552 0.594 0.93 0.972 l 2.893 2.893 c 0.378 0.378 0.654 0.654 0.983 0.856 c 0.291 0.178 0.608 0.31 0.94 0.39 C 8.902 19.0 9.293 19.0 9.827 19.0 L 17.281 19.0 c 0.674 0.0 1.225 0.0 1.672 -0.037 c 0.463 -0.037 0.882 -0.118 1.272 -0.317 c 0.612 -0.312 1.11 -0.809 1.42 -1.42 c 0.2 -0.391 0.28 -0.81 0.318 -1.273 C 22.0 15.506 22.0 14.955 22.0 14.282 V 9.718 c 0.0 -0.674 0.0 -1.224 -0.037 -1.672 c -0.038 -0.463 -0.118 -0.882 -0.317 -1.272 c -0.312 -0.612 -0.81 -1.11 -1.42 -1.42 c -0.391 -0.2 -0.81 -0.28 -1.273 -0.318 C 18.505 5.0 17.955 5.0 17.281 5.0 H 9.827 Z m 1.703 3.47 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 c -0.293 0.293 -0.293 0.767 0.0 1.06 L 12.94 12.0 l -2.47 2.47 c -0.293 0.293 -0.293 0.767 0.0 1.06 c 0.293 0.293 0.767 0.293 1.06 0.0 L 14.0 13.06 l 2.47 2.47 c 0.293 0.293 0.767 0.293 1.06 0.0 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 L 15.06 12.0 l 2.47 -2.47 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 L 14.0 10.94 l -2.47 -2.47 Z")
        )
    }.build()
}
