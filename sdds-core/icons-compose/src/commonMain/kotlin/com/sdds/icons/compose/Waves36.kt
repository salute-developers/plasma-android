package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Waves36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Waves36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.972 3.55 c 0.386 -0.394 1.02 -0.4 1.414 -0.014 c 1.936 1.897 3.473 4.151 4.522 6.633 c 1.049 2.482 1.589 5.143 1.589 7.831 c 0.0 2.688 -0.54 5.349 -1.59 7.831 c -1.048 2.482 -2.585 4.736 -4.521 6.634 c -0.394 0.386 -1.027 0.38 -1.414 -0.015 c -0.387 -0.394 -0.38 -1.027 0.014 -1.414 c 1.748 -1.714 3.134 -3.747 4.08 -5.984 c 0.945 -2.236 1.43 -4.632 1.43 -7.052 s -0.485 -4.816 -1.43 -7.052 c -0.946 -2.237 -2.331 -4.27 -4.08 -5.984 c -0.394 -0.386 -0.4 -1.02 -0.014 -1.414 Z M 9.884 13.57 c 0.434 -0.34 1.063 -0.264 1.403 0.171 c 0.955 1.22 1.474 2.716 1.474 4.259 c 0.0 1.542 -0.519 3.04 -1.473 4.259 c -0.341 0.434 -0.97 0.511 -1.404 0.17 c -0.435 -0.34 -0.512 -0.968 -0.171 -1.403 c 0.681 -0.87 1.049 -1.934 1.049 -3.026 c 0.0 -1.092 -0.368 -2.156 -1.05 -3.026 c -0.34 -0.435 -0.263 -1.063 0.172 -1.404 Z m 5.377 -5.01 c -0.394 -0.386 -1.027 -0.38 -1.414 0.015 c -0.386 0.394 -0.38 1.027 0.014 1.414 c 1.076 1.054 1.928 2.304 2.508 3.678 c 0.581 1.375 0.88 2.847 0.88 4.334 c 0.0 1.486 -0.299 2.958 -0.88 4.333 c -0.58 1.374 -1.432 2.625 -2.508 3.679 c -0.394 0.386 -0.4 1.02 -0.014 1.414 c 0.387 0.394 1.02 0.4 1.414 0.014 c 1.263 -1.238 2.266 -2.709 2.95 -4.329 c 0.685 -1.62 1.038 -3.357 1.038 -5.111 c 0.0 -1.755 -0.353 -3.492 -1.037 -5.112 c -0.685 -1.62 -1.688 -3.09 -2.95 -4.329 Z")
        )
    }.build()
}
