package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AppleFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AppleFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.54 4.615 C 8.54 4.0 9.05 3.5 9.677 3.5 c 3.434 0.0 5.772 1.57 7.248 3.516 c 0.178 0.235 0.344 0.476 0.498 0.72 c 0.027 -0.113 0.056 -0.225 0.085 -0.336 c 0.242 -0.907 0.587 -1.821 1.098 -2.533 c 0.518 -0.723 1.313 -1.367 2.422 -1.367 c 0.627 0.0 1.135 0.5 1.135 1.115 c 0.0 0.616 -0.508 1.116 -1.135 1.116 c -0.102 0.0 -0.29 0.037 -0.567 0.422 c -0.284 0.396 -0.544 1.015 -0.757 1.812 c -0.286 1.076 -0.446 2.32 -0.519 3.416 c 0.247 -0.086 0.502 -0.181 0.78 -0.286 c 0.236 -0.088 0.49 -0.182 0.77 -0.284 c 1.322 -0.477 2.994 -1.002 4.84 -0.99 c 1.621 0.01 3.248 0.641 4.465 1.922 C 31.261 13.03 32.0 14.893 32.0 17.256 c 0.0 5.426 -1.582 9.21 -3.556 11.66 c -0.982 1.22 -2.058 2.103 -3.07 2.687 c -0.99 0.57 -1.995 0.897 -2.833 0.897 c -1.43 0.0 -2.393 -0.484 -3.118 -0.89 l -0.133 -0.075 c -0.669 -0.377 -0.927 -0.522 -1.29 -0.522 s -0.621 0.145 -1.29 0.522 l -0.133 0.074 c -0.725 0.407 -1.689 0.89 -3.118 0.89 c -0.838 0.0 -1.843 -0.325 -2.832 -0.896 c -1.013 -0.584 -2.089 -1.467 -3.071 -2.686 C 5.582 26.467 4.0 22.682 4.0 17.257 c 0.0 -2.364 0.74 -4.228 1.96 -5.514 c 1.199 -1.26 2.794 -1.893 4.39 -1.922 c -0.464 -0.467 -0.855 -1.008 -1.153 -1.656 C 8.744 7.179 8.54 6.018 8.54 4.615 Z m 7.842 6.145 L 15.8 10.488 c -0.296 -0.137 -0.577 -0.268 -0.842 -0.394 c -1.026 -0.487 -1.81 -0.895 -2.422 -1.35 c -0.59 -0.437 -0.997 -0.902 -1.27 -1.497 c -0.175 -0.38 -0.308 -0.843 -0.384 -1.428 c 1.95 0.296 3.292 1.306 4.221 2.53 c 0.577 0.76 0.994 1.606 1.279 2.411 Z")
        )
    }.build()
}
