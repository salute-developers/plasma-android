package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfileOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfileOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.253 6.0 c -2.935 0.0 -5.34 2.42 -5.34 5.436 s 2.405 5.435 5.34 5.435 c 2.934 0.0 5.339 -2.419 5.339 -5.435 c 0.0 -3.017 -2.405 -5.436 -5.34 -5.436 Z m -7.34 5.436 c 0.0 -4.093 3.272 -7.436 7.34 -7.436 c 4.067 0.0 7.339 3.343 7.339 7.436 c 0.0 4.092 -3.272 7.435 -7.34 7.435 c -4.067 0.0 -7.339 -3.343 -7.339 -7.435 Z m 7.337 11.978 c -3.899 0.0 -7.524 1.184 -10.548 3.218 c -0.49 0.33 -0.75 0.88 -0.694 1.412 c 0.048 0.464 0.128 0.742 0.236 0.954 c 0.264 0.517 0.685 0.938 1.202 1.202 c 0.237 0.12 0.554 0.206 1.117 0.252 c 0.575 0.047 1.315 0.047 2.382 0.047 h 12.61 c 1.067 0.0 1.807 0.0 2.382 -0.047 c 0.563 -0.046 0.88 -0.132 1.117 -0.252 c 0.517 -0.264 0.938 -0.685 1.202 -1.202 c 0.108 -0.212 0.188 -0.49 0.236 -0.954 c 0.056 -0.533 -0.205 -1.084 -0.694 -1.413 c -3.024 -2.033 -6.649 -3.217 -10.547 -3.217 Z M 6.585 24.973 c 3.343 -2.248 7.355 -3.559 11.665 -3.559 c 4.31 0.0 8.322 1.31 11.664 3.558 c 1.058 0.711 1.706 1.958 1.568 3.28 c -0.063 0.602 -0.185 1.145 -0.444 1.654 c -0.456 0.894 -1.183 1.62 -2.076 2.076 c -0.566 0.288 -1.175 0.407 -1.862 0.463 c -0.667 0.054 -1.488 0.054 -2.502 0.054 H 11.902 c -1.014 0.0 -1.836 0.0 -2.502 -0.054 c -0.687 -0.056 -1.296 -0.175 -1.862 -0.463 c -0.894 -0.456 -1.62 -1.182 -2.076 -2.076 c -0.259 -0.509 -0.38 -1.051 -0.444 -1.654 c -0.138 -1.32 0.51 -2.567 1.567 -3.28 Z")
        )
    }.build()
}
