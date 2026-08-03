package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FootballOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FootballOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 12.0 C 2.0 6.477 6.477 2.0 12.0 2.0 s 10.0 4.477 10.0 10.0 s -4.477 10.0 -10.0 10.0 S 2.0 17.523 2.0 12.0 Z m 7.279 -8.055 c -1.652 0.558 -3.077 1.61 -4.098 2.98 l 0.462 2.224 l 1.465 0.478 l 4.137 -3.005 l 0.002 -1.552 l -1.968 -1.125 Z M 5.066 16.917 c -0.969 -1.363 -1.545 -3.025 -1.565 -4.82 l 1.675 -1.522 l 1.476 0.482 l 1.58 4.863 l -0.908 1.245 l -2.258 -0.248 Z m 4.401 3.2 c 0.8 0.249 1.65 0.383 2.533 0.383 c 0.882 0.0 1.733 -0.134 2.533 -0.384 l 0.934 -2.073 l -0.904 -1.248 H 9.45 L 8.536 18.05 l 0.931 2.067 Z m 11.033 -8.02 c -0.02 1.795 -0.597 3.457 -1.566 4.82 l -2.251 0.247 l -0.91 -1.257 l 1.58 -4.863 l 1.466 -0.474 l 1.68 1.527 Z m -1.68 -5.172 c -1.022 -1.37 -2.447 -2.422 -4.099 -2.98 l -1.974 1.128 l -0.002 1.54 l 4.136 3.007 l 1.477 -0.478 l 0.461 -2.217 Z M 8.125 10.741 l 1.48 4.554 h 4.788 l 1.48 -4.554 L 12.0 7.927 l -3.874 2.814 Z")
        )
    }.build()
}
