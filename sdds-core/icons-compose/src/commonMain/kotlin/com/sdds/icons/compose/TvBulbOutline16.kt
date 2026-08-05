package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TvBulbOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TvBulbOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.547 11.737 H 1.77 c -0.04 0.0 -0.096 0.0 -0.147 -0.004 c -0.06 -0.005 -0.154 -0.018 -0.255 -0.07 c -0.127 -0.065 -0.23 -0.168 -0.295 -0.295 c -0.052 -0.1 -0.065 -0.196 -0.07 -0.256 C 1.0 11.062 1.0 11.006 1.0 10.966 V 3.27 c 0.0 -0.04 0.0 -0.096 0.004 -0.147 c 0.005 -0.06 0.018 -0.154 0.07 -0.255 c 0.064 -0.127 0.168 -0.23 0.295 -0.295 c 0.1 -0.052 0.195 -0.065 0.255 -0.07 C 1.674 2.5 1.731 2.5 1.771 2.5 h 12.455 c 0.04 0.0 0.096 0.0 0.146 0.004 c 0.06 0.005 0.155 0.018 0.256 0.07 c 0.127 0.064 0.23 0.168 0.295 0.295 c 0.051 0.1 0.065 0.195 0.07 0.255 c 0.003 0.05 0.003 0.107 0.003 0.147 v 3.374 c -0.274 -0.364 -0.613 -0.676 -1.0 -0.92 V 3.5 H 2.0 v 7.237 h 6.73 c 0.213 0.379 0.49 0.717 0.817 1.0 Z m 0.703 0.754 H 2.38 v 1.006 h 7.87 V 12.49 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.56 11.6 c -0.049 0.118 -0.087 0.24 -0.112 0.366 l -0.141 0.704 c -0.12 0.6 -0.646 1.03 -1.256 1.03 s -1.136 -0.43 -1.256 -1.03 l -0.14 -0.702 c -0.026 -0.127 -0.065 -0.25 -0.113 -0.368 h 3.017 Z m 0.407 -0.7 c 0.09 -0.123 0.185 -0.244 0.279 -0.363 c 0.378 -0.477 0.604 -1.08 0.604 -1.737 c 0.0 -1.546 -1.254 -2.8 -2.8 -2.8 c -1.546 0.0 -2.8 1.254 -2.8 2.8 c 0.0 0.657 0.226 1.26 0.605 1.738 c 0.094 0.119 0.188 0.239 0.278 0.362 h 3.834 Z")
        )
    }.build()
}
