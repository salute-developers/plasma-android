package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FootballFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FootballFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 12.0 C 2.0 6.477 6.477 2.0 12.0 2.0 s 10.0 4.477 10.0 10.0 s -4.477 10.0 -10.0 10.0 S 2.0 17.523 2.0 12.0 Z m 7.279 -8.055 c -1.652 0.558 -3.077 1.61 -4.098 2.98 l 0.462 2.224 l 1.833 0.599 l -0.017 0.051 L 11.313 7.0 h -0.069 l 0.003 -1.93 l -1.968 -1.124 Z M 5.066 16.917 c -0.969 -1.363 -1.545 -3.025 -1.565 -4.82 l 1.675 -1.522 l 1.834 0.599 l 0.022 -0.066 l 1.472 4.53 l -0.044 -0.031 l -1.136 1.558 l -2.258 -0.248 Z m 4.401 3.2 c 0.8 0.249 1.65 0.383 2.533 0.383 c 0.882 0.0 1.733 -0.134 2.533 -0.384 l 0.934 -2.073 l -1.13 -1.561 l 0.043 -0.032 H 9.616 l 0.056 0.04 l -1.136 1.56 l 0.931 2.066 Z m 11.033 -8.02 c -0.02 1.795 -0.597 3.457 -1.566 4.82 l -2.251 0.247 l -1.132 -1.562 l -0.056 0.04 l 1.472 -4.53 l 0.017 0.05 l 1.835 -0.592 l 1.68 1.527 Z m -1.68 -5.172 c -1.022 -1.37 -2.447 -2.422 -4.099 -2.98 l -1.974 1.128 l -0.003 1.928 H 12.69 l 3.854 2.8 l -0.021 -0.065 l 1.835 -0.594 l 0.461 -2.217 Z")
        )
    }.build()
}
