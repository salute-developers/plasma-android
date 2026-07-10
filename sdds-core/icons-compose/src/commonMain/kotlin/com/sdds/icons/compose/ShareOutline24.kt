package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShareOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShareOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.5 4.814 v 0.12 v 2.44 c 0.0 0.48 -0.382 0.87 -0.86 0.882 c -5.03 0.114 -9.157 3.793 -9.987 8.59 c 0.698 -0.847 1.465 -1.633 2.436 -2.279 c 1.601 -1.064 3.69 -1.708 6.836 -1.802 h 0.02 c 0.119 -0.004 0.25 -0.008 0.366 -0.002 c 0.133 0.008 0.304 0.03 0.483 0.117 c 0.24 0.117 0.441 0.311 0.565 0.548 c 0.092 0.178 0.12 0.35 0.131 0.483 c 0.01 0.116 0.01 0.25 0.01 0.371 v 1.79 v 0.12 l 0.085 -0.085 l 5.604 -5.604 l -5.604 -5.604 L 14.5 4.814 Z m -1.2 -1.416 c 0.26 -0.304 0.65 -0.466 1.048 -0.434 c 0.345 0.027 0.601 0.226 0.744 0.346 c 0.156 0.13 0.337 0.311 0.532 0.506 l 6.156 6.157 c 0.293 0.292 0.293 0.767 0.0 1.06 l -6.156 6.156 c -0.195 0.196 -0.376 0.376 -0.532 0.507 c -0.143 0.12 -0.4 0.319 -0.744 0.346 c -0.399 0.031 -0.789 -0.13 -1.049 -0.434 c -0.224 -0.263 -0.265 -0.586 -0.281 -0.771 C 13.0 16.634 13.0 16.379 13.0 16.102 v -1.8 v -0.039 l -0.03 0.001 c -2.957 0.089 -4.748 0.687 -6.05 1.552 c -1.311 0.872 -2.196 2.052 -3.294 3.52 L 3.59 19.382 C 3.081 20.063 2.0 19.703 2.0 18.853 v -0.225 c 0.0 -6.25 4.834 -11.392 11.0 -11.843 V 4.903 c 0.0 -0.276 0.0 -0.531 0.018 -0.734 c 0.016 -0.185 0.057 -0.508 0.281 -0.77 Z")
        )
    }.build()
}
