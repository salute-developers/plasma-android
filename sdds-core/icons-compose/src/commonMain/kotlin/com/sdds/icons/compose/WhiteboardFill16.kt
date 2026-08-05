package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WhiteboardFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WhiteboardFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.925 2.5 C 1.862 2.5 1.0 3.362 1.0 4.425 v 7.15 C 1.0 12.638 1.862 13.5 2.925 13.5 h 10.15 c 1.063 0.0 1.925 -0.862 1.925 -1.925 v -7.15 C 15.0 3.362 14.138 2.5 13.075 2.5 H 2.925 Z m 7.056 2.078 c -0.392 0.0 -0.767 0.154 -1.047 0.428 L 8.0 5.925 L 5.43 8.46 C 5.11 8.774 4.879 9.166 4.756 9.597 l -0.387 1.36 c -0.05 0.173 -0.002 0.36 0.124 0.487 c 0.127 0.129 0.312 0.18 0.486 0.133 l 1.391 -0.373 c 0.433 -0.116 0.83 -0.342 1.15 -0.656 l 3.515 -3.453 c 0.281 -0.277 0.44 -0.654 0.44 -1.048 c 0.0 -0.811 -0.658 -1.469 -1.47 -1.469 H 9.982 Z M 9.635 5.72 c 0.092 -0.091 0.217 -0.142 0.346 -0.142 h 0.025 c 0.259 0.0 0.469 0.21 0.469 0.469 c 0.0 0.126 -0.051 0.246 -0.14 0.334 l -0.448 0.44 C 9.802 6.686 9.7 6.545 9.584 6.43 c -0.112 -0.11 -0.248 -0.207 -0.38 -0.287 L 9.634 5.72 Z M 8.883 7.144 c 0.08 0.079 0.177 0.23 0.265 0.402 l -2.33 2.288 c -0.196 0.194 -0.44 0.333 -0.707 0.404 l -0.539 0.145 l 0.146 -0.512 c 0.076 -0.265 0.219 -0.506 0.415 -0.7 l 2.326 -2.295 l 0.005 0.003 c 0.178 0.088 0.338 0.186 0.42 0.265 Z")
        )
    }.build()
}
