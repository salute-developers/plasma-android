package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.unit.dp

public val SddsIcons.HandAction24Line24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HandAction24Line24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        group {
            addPath(
                fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
                pathFillType = PathFillType.EvenOdd,
                pathData = addPathNodes("M 5.428 7.62 C 4.763 6.736 4.939 5.482 5.82 4.818 c 0.766 -0.577 1.812 -0.52 2.51 0.081 C 8.44 4.757 8.57 4.626 8.72 4.512 c 0.882 -0.665 2.136 -0.489 2.8 0.394 l 2.64 3.502 c -0.066 -0.91 0.5 -1.778 1.41 -2.057 c 1.057 -0.322 2.175 0.272 2.498 1.328 l 1.681 5.5 c 1.09 3.564 -0.916 7.338 -4.482 8.428 c -2.79 0.853 -5.706 -0.191 -7.365 -2.392 l -0.029 -0.04 l -3.28 -4.354 c -0.665 -0.882 -0.488 -2.136 0.394 -2.8 c 0.138 -0.104 0.285 -0.188 0.437 -0.251 l -0.79 -1.049 C 3.97 9.84 4.146 8.585 5.029 7.921 C 5.166 7.815 5.313 7.732 5.466 7.67 L 5.428 7.62 Z M 6.63 9.216 c -0.166 -0.22 -0.48 -0.265 -0.7 -0.099 c -0.22 0.166 -0.264 0.48 -0.098 0.7 l 3.761 4.992 c 0.25 0.33 0.183 0.801 -0.147 1.05 c -0.331 0.25 -0.802 0.184 -1.05 -0.147 L 6.59 13.317 c -0.166 -0.22 -0.48 -0.265 -0.7 -0.099 c -0.221 0.167 -0.265 0.48 -0.099 0.7 l 3.31 4.393 c 0.01 0.012 0.018 0.025 0.027 0.038 c 1.296 1.688 3.548 2.481 5.7 1.823 c 2.774 -0.848 4.334 -3.782 3.487 -6.555 l -1.682 -5.5 c -0.08 -0.263 -0.36 -0.412 -0.624 -0.331 c -0.264 0.08 -0.413 0.36 -0.332 0.624 l 1.073 3.51 c 0.107 0.349 -0.052 0.723 -0.376 0.888 c -0.325 0.166 -0.72 0.074 -0.94 -0.216 l -5.111 -6.784 c -0.166 -0.22 -0.48 -0.264 -0.7 -0.098 c -0.221 0.166 -0.265 0.48 -0.099 0.7 l 3.16 4.193 c 0.249 0.33 0.183 0.801 -0.148 1.05 c -0.33 0.25 -0.801 0.183 -1.05 -0.147 L 7.424 6.115 c -0.166 -0.22 -0.48 -0.265 -0.7 -0.098 c -0.22 0.166 -0.264 0.48 -0.098 0.7 l 4.513 5.99 c 0.25 0.33 0.184 0.8 -0.147 1.05 c -0.331 0.25 -0.801 0.183 -1.05 -0.148 l -3.31 -4.392 Z")
            )
        }
    }.build()
}
