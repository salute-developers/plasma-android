package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlaneFlyOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlaneFlyOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.463 2.373 C 5.312 1.667 5.85 1.0 6.573 1.0 C 7.23 1.0 7.836 1.366 8.14 1.95 l 2.226 4.264 l 2.462 -0.076 c 1.05 -0.032 1.92 0.81 1.92 1.862 c 0.0 1.051 -0.87 1.894 -1.92 1.862 l -2.462 -0.076 l -2.226 4.264 C 7.836 14.634 7.23 15.0 6.573 15.0 c -0.723 0.0 -1.261 -0.666 -1.11 -1.373 l 0.853 -3.966 l -1.75 -0.054 L 4.14 10.04 c -0.358 0.364 -0.846 0.568 -1.355 0.568 h -0.86 c -0.5 0.0 -0.826 -0.524 -0.605 -0.972 L 2.124 8.0 L 1.32 6.364 C 1.1 5.916 1.426 5.392 1.926 5.392 h 0.859 c 0.51 0.0 0.997 0.204 1.355 0.568 l 0.426 0.433 l 1.75 -0.054 l -0.853 -3.966 Z m -2.46 5.15 L 2.448 6.392 h 0.338 c 0.24 0.0 0.472 0.097 0.641 0.269 l 0.58 0.589 c 0.097 0.1 0.232 0.154 0.372 0.15 l 2.569 -0.08 c 0.148 -0.004 0.287 -0.075 0.378 -0.192 C 7.416 7.012 7.451 6.86 7.42 6.715 L 6.441 2.163 C 6.423 2.079 6.487 2.0 6.573 2.0 c 0.286 0.0 0.549 0.16 0.681 0.413 l 2.372 4.542 c 0.089 0.17 0.267 0.274 0.459 0.268 l 2.775 -0.085 C 13.347 7.123 13.75 7.513 13.75 8.0 s -0.403 0.877 -0.89 0.862 l -2.775 -0.085 C 9.893 8.77 9.715 8.875 9.626 9.045 l -2.372 4.542 C 7.122 13.841 6.86 14.0 6.573 14.0 c -0.086 0.0 -0.15 -0.079 -0.132 -0.163 L 7.42 9.285 C 7.451 9.14 7.416 8.99 7.325 8.872 C 7.233 8.755 7.095 8.685 6.947 8.68 l -2.57 -0.079 c -0.139 -0.004 -0.274 0.05 -0.372 0.15 L 3.426 9.338 c -0.169 0.172 -0.4 0.27 -0.641 0.27 H 2.447 l 0.557 -1.132 C 3.205 8.412 3.352 8.223 3.352 8.0 c 0.0 -0.132 -0.053 -0.26 -0.147 -0.354 C 3.148 7.59 3.08 7.547 3.004 7.523 Z")
        )
    }.build()
}
