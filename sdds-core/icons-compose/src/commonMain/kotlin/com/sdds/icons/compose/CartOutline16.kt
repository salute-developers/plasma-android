package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CartOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CartOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.002 2.75 c 0.487 0.0 0.625 0.005 0.733 0.038 C 1.948 2.85 2.13 2.99 2.245 3.18 C 2.304 3.274 2.344 3.4 2.46 3.838 l 0.167 0.629 l 1.268 4.745 l 0.04 0.15 l 0.096 0.356 l 0.013 -0.003 c 0.057 0.16 0.126 0.304 0.223 0.43 c 0.166 0.216 0.385 0.385 0.637 0.489 c 0.287 0.12 0.615 0.119 0.997 0.118 h 5.482 c 0.382 0.0 0.71 0.001 0.998 -0.118 c 0.251 -0.104 0.471 -0.273 0.637 -0.489 c 0.19 -0.247 0.273 -0.564 0.371 -0.933 l 0.972 -3.637 C 14.407 5.4 14.45 5.237 14.474 5.1 c 0.026 -0.145 0.04 -0.32 -0.014 -0.504 c -0.074 -0.25 -0.239 -0.466 -0.462 -0.602 c -0.164 -0.1 -0.337 -0.131 -0.484 -0.144 c -0.138 -0.012 -0.306 -0.012 -0.488 -0.012 H 3.494 L 3.419 3.557 C 3.32 3.183 3.244 2.896 3.1 2.657 C 2.853 2.259 2.47 1.964 2.02 1.83 C 1.754 1.75 1.457 1.75 1.07 1.75 H 1.002 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 Z M 4.85 8.914 L 3.76 4.838 h 9.246 c 0.208 0.0 0.33 0.0 0.42 0.008 c 0.03 0.003 0.049 0.006 0.059 0.008 c 0.005 0.004 0.009 0.01 0.012 0.015 c 0.0 0.01 -0.003 0.03 -0.008 0.06 c -0.015 0.088 -0.046 0.206 -0.1 0.407 l -0.946 3.54 c -0.131 0.491 -0.168 0.593 -0.22 0.66 c -0.059 0.077 -0.137 0.137 -0.226 0.174 c -0.079 0.033 -0.187 0.042 -0.694 0.042 H 5.98 c -0.507 0.0 -0.616 -0.01 -0.694 -0.042 c -0.09 -0.037 -0.168 -0.097 -0.226 -0.173 C 5.01 9.47 4.973 9.372 4.85 8.914 Z m 1.948 4.121 c 0.0 0.673 -0.55 1.218 -1.23 1.218 c -0.679 0.0 -1.23 -0.545 -1.23 -1.218 c 0.0 -0.672 0.551 -1.217 1.23 -1.217 c 0.68 0.0 1.23 0.545 1.23 1.217 Z m 4.741 1.218 c 0.68 0.0 1.23 -0.545 1.23 -1.218 c 0.0 -0.672 -0.55 -1.217 -1.23 -1.217 c -0.679 0.0 -1.23 0.545 -1.23 1.217 c 0.0 0.673 0.551 1.218 1.23 1.218 Z")
        )
    }.build()
}
