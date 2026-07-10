package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PostFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PostFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.33 14.25 h 5.34 c 0.475 0.0 0.863 0.0 1.18 -0.025 c 0.326 -0.027 0.622 -0.083 0.897 -0.221 c 0.432 -0.216 0.783 -0.562 1.003 -0.986 c 0.14 -0.272 0.197 -0.562 0.224 -0.884 C 14.0 11.824 14.0 11.441 14.0 10.974 V 5.026 c 0.0 -0.468 0.0 -0.85 -0.026 -1.161 c -0.027 -0.322 -0.084 -0.612 -0.224 -0.884 c -0.22 -0.424 -0.57 -0.77 -1.003 -0.986 c -0.275 -0.138 -0.57 -0.194 -0.898 -0.22 c -0.316 -0.026 -0.704 -0.026 -1.18 -0.026 H 5.331 c -0.476 0.0 -0.864 0.0 -1.18 0.025 c -0.327 0.027 -0.623 0.083 -0.898 0.221 C 2.82 2.212 2.47 2.558 2.25 2.982 C 2.11 3.254 2.053 3.544 2.026 3.866 C 2.0 4.176 2.0 4.559 2.0 5.026 v 5.947 c 0.0 0.468 0.0 0.85 0.026 1.161 c 0.027 0.322 0.084 0.612 0.224 0.884 c 0.22 0.424 0.57 0.77 1.003 0.986 c 0.275 0.138 0.57 0.194 0.898 0.22 c 0.316 0.026 0.704 0.026 1.18 0.026 Z m 7.258 -9.431 c 0.0 -0.588 0.0 -0.882 -0.114 -1.107 c -0.1 -0.198 -0.261 -0.358 -0.459 -0.459 C 11.79 3.14 11.496 3.14 10.908 3.14 H 5.092 c -0.588 0.0 -0.882 0.0 -1.107 0.114 c -0.197 0.1 -0.358 0.261 -0.459 0.459 c -0.114 0.225 -0.114 0.519 -0.114 1.107 v 4.279 c 0.0 0.588 0.0 0.882 0.114 1.106 c 0.101 0.198 0.262 0.358 0.46 0.46 c 0.224 0.114 0.518 0.114 1.106 0.114 h 5.816 c 0.588 0.0 0.883 0.0 1.107 -0.115 c 0.198 -0.1 0.358 -0.261 0.459 -0.459 c 0.114 -0.224 0.114 -0.518 0.114 -1.106 v -4.28 Z m -8.647 8.295 c -0.331 0.0 -0.6 -0.269 -0.6 -0.6 c 0.0 -0.332 0.269 -0.6 0.6 -0.6 h 3.882 c 0.332 0.0 0.6 0.268 0.6 0.6 c 0.0 0.331 -0.268 0.6 -0.6 0.6 H 3.941 Z")
        )
    }.build()
}
