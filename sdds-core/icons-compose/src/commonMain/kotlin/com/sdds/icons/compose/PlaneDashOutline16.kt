package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlaneDashOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlaneDashOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.828 6.139 C 13.88 6.106 14.75 6.949 14.75 8.0 s -0.87 1.895 -1.92 1.862 l -2.463 -0.076 L 8.14 14.05 C 7.835 14.634 7.23 15.0 6.573 15.0 c -0.723 0.0 -1.262 -0.667 -1.11 -1.373 l 0.242 -1.125 l 1.303 -1.303 l -0.567 2.638 C 6.423 13.92 6.487 14.0 6.573 14.0 c 0.286 0.0 0.548 -0.16 0.68 -0.413 l 2.372 -4.542 c 0.09 -0.17 0.268 -0.274 0.46 -0.268 l 2.775 0.085 C 13.346 8.877 13.75 8.487 13.75 8.0 s -0.404 -0.877 -0.89 -0.862 l -1.848 0.056 l 1.032 -1.032 l 0.784 -0.023 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.573 1.0 C 7.23 1.0 7.835 1.366 8.14 1.95 l 1.815 3.478 l 3.784 -3.782 c 0.195 -0.195 0.511 -0.195 0.707 0.0 c 0.195 0.196 0.195 0.512 0.0 0.708 l -11.88 11.88 c -0.196 0.194 -0.512 0.194 -0.707 0.0 c -0.196 -0.196 -0.196 -0.513 0.0 -0.709 L 5.74 9.643 L 4.565 9.607 L 4.139 10.04 c -0.357 0.363 -0.845 0.568 -1.355 0.568 H 1.925 c -0.5 0.0 -0.826 -0.524 -0.605 -0.972 L 2.123 8.0 L 1.32 6.364 C 1.1 5.916 1.425 5.392 1.925 5.392 h 0.86 c 0.509 0.0 0.997 0.205 1.354 0.568 l 0.426 0.433 l 1.75 -0.054 l -0.852 -3.966 C 5.311 1.667 5.85 1.0 6.573 1.0 Z m 0.0 1.0 C 6.487 2.0 6.423 2.08 6.44 2.163 l 0.978 4.552 C 7.45 6.86 7.416 7.012 7.324 7.129 c -0.09 0.116 -0.23 0.187 -0.377 0.191 L 4.377 7.4 c -0.14 0.004 -0.274 -0.05 -0.372 -0.15 L 3.426 6.661 c -0.17 -0.172 -0.4 -0.27 -0.642 -0.27 H 2.447 l 0.556 1.132 C 3.078 7.547 3.147 7.59 3.204 7.646 C 3.298 7.74 3.351 7.867 3.351 8.0 c 0.0 0.223 -0.146 0.412 -0.348 0.477 L 2.447 9.608 h 0.337 c 0.242 0.0 0.473 -0.097 0.642 -0.27 l 0.58 -0.588 c 0.097 -0.1 0.232 -0.154 0.371 -0.15 L 6.71 8.674 l 2.504 -2.504 l -1.96 -3.756 C 7.12 2.16 6.858 2.0 6.572 2.0 Z")
        )
    }.build()
}
