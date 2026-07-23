package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PictureFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PictureFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.697 2.5 H 4.303 c -0.471 0.0 -0.857 0.0 -1.17 0.025 c -0.324 0.026 -0.617 0.082 -0.89 0.219 C 1.813 2.958 1.465 3.3 1.247 3.72 c -0.14 0.269 -0.196 0.556 -0.222 0.875 C 1.0 4.902 1.0 5.28 1.0 5.744 v 4.512 c 0.0 0.463 0.0 0.841 0.026 1.15 c 0.026 0.318 0.083 0.605 0.222 0.874 c 0.06 0.115 0.129 0.224 0.207 0.326 c 0.207 0.272 0.476 0.495 0.787 0.65 c 0.274 0.137 0.567 0.193 0.89 0.219 c 0.314 0.025 0.7 0.025 1.17 0.025 h 7.395 c 0.471 0.0 0.857 0.0 1.17 -0.025 c 0.324 -0.026 0.617 -0.082 0.89 -0.218 c 0.429 -0.215 0.777 -0.557 0.995 -0.977 c 0.2 -0.385 0.234 -0.823 0.244 -1.352 C 15.0 10.726 15.0 10.496 15.0 10.238 V 5.744 c 0.0 -0.463 0.0 -0.842 -0.026 -1.15 c -0.026 -0.318 -0.083 -0.605 -0.222 -0.874 c -0.218 -0.42 -0.566 -0.762 -0.994 -0.976 c -0.274 -0.137 -0.567 -0.193 -0.89 -0.219 C 12.553 2.5 12.167 2.5 11.696 2.5 Z m -0.278 6.15 l 2.52 2.475 c -0.016 0.38 -0.056 0.558 -0.123 0.687 c -0.117 0.226 -0.304 0.41 -0.535 0.526 c -0.1 0.05 -0.24 0.088 -0.5 0.109 c -0.265 0.021 -0.607 0.022 -1.106 0.022 H 6.292 l 3.89 -3.82 c 0.341 -0.335 0.895 -0.335 1.237 0.0 Z m -5.036 2.272 l -1.575 1.547 H 4.325 c -0.499 0.0 -0.841 0.0 -1.107 -0.022 c -0.259 -0.02 -0.398 -0.059 -0.5 -0.11 c -0.03 -0.015 -0.06 -0.032 -0.09 -0.05 l 1.953 -1.919 c 0.342 -0.335 0.896 -0.335 1.238 0.0 l 0.564 0.554 Z M 4.85 7.312 c 0.58 0.0 1.05 -0.461 1.05 -1.03 c 0.0 -0.57 -0.47 -1.032 -1.05 -1.032 c -0.58 0.0 -1.05 0.462 -1.05 1.031 c 0.0 0.57 0.47 1.032 1.05 1.032 Z")
        )
    }.build()
}
