package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SctivityOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SctivityOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.415 4.292 l 3.86 6.683 l 1.972 -1.139 c -0.961 -1.991 -1.203 -4.169 -0.811 -6.214 c -1.658 -0.286 -3.408 -0.083 -5.02 0.67 Z m 6.475 -0.286 c -0.3 1.675 -0.101 3.446 0.66 5.078 l 3.407 -1.968 c -1.032 -1.475 -2.466 -2.532 -4.067 -3.11 Z m 4.817 4.41 L 16.3 10.382 c 1.032 1.475 2.467 2.533 4.067 3.11 c 0.3 -1.675 0.102 -3.446 -0.66 -5.078 Z m 0.266 6.529 c -1.967 -0.684 -3.732 -1.982 -4.976 -3.81 l -1.973 1.14 l 3.859 6.682 c 1.458 -1.02 2.508 -2.434 3.09 -4.012 Z m -4.39 4.762 l -3.858 -6.683 l -1.973 1.139 c 0.961 1.991 1.203 4.169 0.811 6.215 c 1.658 0.285 3.408 0.082 5.02 -0.67 Z M 9.11 19.994 c 0.3 -1.675 0.101 -3.446 -0.66 -5.078 l -3.407 1.968 c 1.032 1.475 2.467 2.533 4.067 3.11 Z m -4.817 -4.41 l 3.407 -1.967 c -1.032 -1.475 -2.467 -2.532 -4.067 -3.11 c -0.3 1.675 -0.102 3.446 0.66 5.078 Z M 4.026 9.055 c 1.967 0.684 3.732 1.982 4.976 3.81 l 1.973 -1.139 l -3.859 -6.683 c -1.458 1.02 -2.508 2.434 -3.09 4.012 Z M 7.0 3.34 c 2.371 -1.37 5.073 -1.656 7.528 -1.015 C 17.023 2.976 19.268 4.59 20.66 7.0 c 1.392 2.41 1.665 5.161 0.983 7.648 C 20.97 17.095 19.372 19.29 17.0 20.66 c -2.372 1.37 -5.074 1.656 -7.529 1.015 C 6.976 21.023 4.731 19.41 3.34 17.0 c -1.391 -2.411 -1.665 -5.162 -0.982 -7.649 C 3.028 6.905 4.627 4.71 7.0 3.34 Z")
        )
    }.build()
}
