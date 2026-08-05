package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LinkError16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LinkError16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.11 8.805 c -1.075 1.074 -1.075 2.816 0.0 3.89 c 1.074 1.075 2.816 1.075 3.89 0.0 l 0.504 -0.503 c 0.017 0.417 0.092 0.82 0.215 1.2 l -0.011 0.01 c -1.465 1.466 -3.84 1.466 -5.306 0.0 c -1.465 -1.464 -1.465 -3.84 0.0 -5.305 l 1.452 -1.451 c 0.196 -0.196 0.512 -0.196 0.707 0.0 c 0.196 0.195 0.196 0.511 0.0 0.707 L 3.11 8.805 Z m 10.28 -1.086 c 1.437 -1.467 1.428 -3.82 -0.028 -5.276 c -1.465 -1.465 -3.84 -1.465 -5.305 0.0 L 6.605 3.895 c -0.195 0.195 -0.195 0.512 0.0 0.707 c 0.195 0.195 0.512 0.195 0.707 0.0 L 8.764 3.15 c 1.075 -1.074 2.817 -1.074 3.891 0.0 c 1.075 1.074 1.075 2.816 0.0 3.89 l -0.463 0.464 c 0.417 0.018 0.819 0.092 1.199 0.215 Z M 4.78 11.026 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 l 5.502 -5.501 c 0.195 -0.196 0.511 -0.196 0.707 0.0 c 0.195 0.195 0.195 0.512 0.0 0.707 l -5.502 5.501 c -0.195 0.196 -0.512 0.196 -0.707 0.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 15.75 c 2.07 0.0 3.75 -1.679 3.75 -3.75 c 0.0 -2.071 -1.68 -3.75 -3.75 -3.75 c -2.071 0.0 -3.75 1.679 -3.75 3.75 c 0.0 2.071 1.679 3.75 3.75 3.75 Z m -1.2 -5.444 c -0.136 -0.136 -0.358 -0.136 -0.494 0.0 c -0.137 0.137 -0.137 0.359 0.0 0.495 L 11.505 12.0 l -1.2 1.199 c -0.136 0.137 -0.136 0.358 0.0 0.495 c 0.137 0.136 0.359 0.136 0.496 0.0 l 1.198 -1.199 l 1.2 1.199 c 0.136 0.136 0.358 0.136 0.494 0.0 c 0.137 -0.137 0.137 -0.358 0.0 -0.495 L 12.495 12.0 l 1.198 -1.199 c 0.137 -0.136 0.137 -0.358 0.0 -0.495 c -0.136 -0.136 -0.358 -0.136 -0.495 0.0 L 12.0 11.505 l -1.198 -1.199 Z")
        )
    }.build()
}
