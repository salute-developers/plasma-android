package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GigaFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GigaFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 1.0 c 3.866 0.0 7.0 3.134 7.0 7.0 s -3.134 7.0 -7.0 7.0 s -7.0 -3.134 -7.0 -7.0 s 3.134 -7.0 7.0 -7.0 Z m 5.764 5.304 c -0.177 1.226 -0.8 2.238 -1.32 2.897 c -0.804 0.99 -1.88 1.846 -3.115 2.479 c -1.221 0.626 -2.542 1.006 -3.82 1.1 c -0.215 0.012 -0.416 0.019 -0.605 0.019 c -0.224 0.0 -0.43 -0.009 -0.626 -0.026 c 0.96 0.752 2.155 1.218 3.455 1.274 l 0.262 0.006 c 3.333 0.0 6.035 -2.703 6.035 -6.035 c 0.0 -0.579 -0.081 -1.139 -0.233 -1.668 l -0.033 -0.046 Z M 8.858 1.639 c -2.062 0.0 -3.936 0.85 -5.013 2.273 L 3.838 3.921 c -0.466 0.567 -0.775 1.19 -0.895 1.8 c -0.068 0.371 -0.055 0.712 0.038 1.01 c 0.222 0.664 0.76 1.197 1.372 1.354 c 0.254 0.063 0.498 0.09 0.725 0.08 l 0.06 -0.006 C 6.684 8.035 8.06 7.061 9.205 6.125 c 0.716 -0.6 1.401 -1.392 1.445 -1.904 c -0.998 0.484 -2.028 1.113 -3.216 1.965 C 7.3 6.279 7.12 6.254 7.023 6.126 c -0.59 -0.764 -1.103 -1.384 -1.617 -1.95 C 5.35 4.114 5.322 4.03 5.33 3.947 c 0.008 -0.083 0.051 -0.16 0.118 -0.21 c 1.575 -1.18 3.142 -1.85 4.661 -1.99 c -0.407 -0.072 -0.825 -0.108 -1.25 -0.108 Z")
        )
    }.build()
}
