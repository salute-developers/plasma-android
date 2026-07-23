package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BookmarkFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BookmarkFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.533 2.0 h 2.934 C 9.9 2.0 10.254 2.0 10.54 2.026 c 0.298 0.026 0.567 0.082 0.818 0.221 c 0.393 0.217 0.713 0.564 0.913 0.99 c 0.128 0.273 0.18 0.565 0.204 0.888 C 12.5 4.438 12.5 4.822 12.5 5.292 v 7.141 c 0.0 0.35 0.0 0.65 -0.02 0.883 c -0.019 0.23 -0.063 0.503 -0.226 0.725 c -0.213 0.29 -0.538 0.46 -0.88 0.459 c -0.262 0.0 -0.486 -0.134 -0.663 -0.261 c -0.18 -0.13 -0.395 -0.316 -0.648 -0.535 l -0.758 -0.658 c -0.292 -0.254 -0.491 -0.426 -0.656 -0.55 c -0.16 -0.119 -0.262 -0.17 -0.349 -0.197 c -0.196 -0.058 -0.404 -0.058 -0.6 0.0 c -0.087 0.027 -0.189 0.079 -0.349 0.198 c -0.165 0.123 -0.364 0.295 -0.656 0.549 l -0.758 0.658 c -0.253 0.219 -0.468 0.405 -0.648 0.535 c -0.177 0.127 -0.401 0.26 -0.663 0.261 c -0.342 0.0 -0.667 -0.169 -0.88 -0.46 c -0.164 -0.221 -0.207 -0.495 -0.226 -0.724 c -0.02 -0.234 -0.02 -0.532 -0.02 -0.883 V 5.292 c 0.0 -0.47 0.0 -0.854 0.023 -1.167 C 3.548 3.802 3.6 3.51 3.728 3.238 c 0.2 -0.427 0.52 -0.774 0.913 -0.99 c 0.251 -0.14 0.52 -0.196 0.818 -0.223 C 5.746 2.0 6.1 2.0 6.533 2.0 Z")
        )
    }.build()
}
