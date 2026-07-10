package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.unit.dp

public val SddsIcons.GyroOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GyroOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        group {
            addPath(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd,
                pathData = addPathNodes("M 7.861 14.685 c -0.577 -0.066 -1.288 -0.547 -1.923 -1.711 c -0.16 -0.294 -0.307 -0.619 -0.439 -0.97 c 0.732 0.135 1.513 0.213 2.325 0.223 V 11.17 C 5.9 11.145 4.21 10.708 3.026 10.062 c -1.26 -0.687 -1.72 -1.462 -1.72 -2.061 c 0.0 -0.57 0.416 -1.297 1.536 -1.957 c 0.059 -0.45 0.138 -0.886 0.236 -1.309 C 1.35 5.511 0.25 6.685 0.25 8.001 c 0.0 1.601 1.632 2.994 4.038 3.712 C 5.006 14.118 6.398 15.75 8.0 15.75 c 0.19 0.0 0.379 -0.023 0.563 -0.068 c -0.358 -0.226 -0.61 -0.586 -0.702 -0.997 Z m 4.366 -6.779 c -0.006 -0.84 -0.084 -1.65 -0.225 -2.406 c 0.353 0.132 0.678 0.279 0.972 0.44 c 1.26 0.686 1.72 1.462 1.72 2.06 c 0.0 0.444 -0.252 0.984 -0.893 1.512 l 0.74 0.756 c 0.766 -0.655 1.209 -1.433 1.209 -2.267 c 0.0 -1.601 -1.632 -2.995 -4.038 -3.712 C 10.994 1.882 9.602 0.25 8.0 0.25 C 5.665 0.25 3.772 3.72 3.772 8.0 c 0.0 0.457 0.022 0.905 0.064 1.34 c 0.328 0.148 0.7 0.28 1.108 0.39 C 4.87 9.182 4.829 8.602 4.829 8.0 c 0.0 -1.026 0.117 -1.99 0.322 -2.848 C 6.01 4.948 6.973 4.83 8.0 4.83 c 0.601 0.0 1.18 0.04 1.73 0.115 c -0.111 -0.408 -0.243 -0.78 -0.39 -1.109 C 8.905 3.796 8.457 3.774 8.0 3.774 c -0.875 0.0 -1.717 0.079 -2.501 0.225 c 0.131 -0.353 0.279 -0.679 0.44 -0.973 c 0.686 -1.26 1.461 -1.72 2.06 -1.72 c 0.6 0.0 1.375 0.46 2.062 1.72 c 0.525 0.962 0.912 2.258 1.052 3.744 l 1.114 1.136 Z m -2.44 -0.98 C 9.638 6.771 9.41 6.724 9.21 6.805 C 9.012 6.887 8.883 7.08 8.883 7.296 v 7.045 c 0.0 0.214 0.13 0.408 0.329 0.489 c 0.198 0.08 0.426 0.034 0.577 -0.12 l 1.817 -1.854 h 2.737 c 0.213 0.0 0.405 -0.128 0.487 -0.324 c 0.083 -0.196 0.04 -0.422 -0.11 -0.574 L 9.788 6.925 Z")
            )
        }
    }.build()
}
