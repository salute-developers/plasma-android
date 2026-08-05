package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WindowFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WindowFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 26.042 6.0 c 1.014 0.0 1.836 0.0 2.502 0.054 c 0.688 0.057 1.297 0.176 1.862 0.464 c 0.894 0.455 1.62 1.182 2.076 2.076 c 0.288 0.565 0.407 1.174 0.464 1.862 C 33.0 11.122 33.0 11.944 33.0 12.958 V 23.04 c 0.0 1.014 0.0 1.835 -0.054 2.502 c -0.057 0.687 -0.176 1.296 -0.464 1.862 c -0.455 0.893 -1.182 1.62 -2.076 2.075 c -0.565 0.289 -1.174 0.408 -1.862 0.464 c -0.666 0.054 -1.488 0.054 -2.502 0.054 H 9.957 c -1.014 0.0 -1.835 0.0 -2.501 -0.054 c -0.688 -0.056 -1.297 -0.175 -1.862 -0.463 c -0.894 -0.456 -1.62 -1.183 -2.076 -2.076 c -0.288 -0.566 -0.407 -1.175 -0.464 -1.862 C 3.0 24.877 3.0 24.055 3.0 23.04 V 12.957 c 0.0 -1.014 0.0 -1.835 0.054 -2.501 c 0.057 -0.688 0.176 -1.297 0.464 -1.862 C 3.973 7.7 4.7 6.974 5.594 6.518 C 6.159 6.23 6.768 6.11 7.456 6.054 C 8.122 6.0 8.943 6.0 9.957 6.0 h 16.085 Z m 3.456 2.3 c -0.236 -0.12 -0.553 -0.206 -1.117 -0.252 C 27.806 8.0 27.067 8.0 26.0 8.0 H 10.0 C 8.933 8.0 8.194 8.0 7.618 8.048 C 7.055 8.094 6.738 8.179 6.502 8.3 C 5.984 8.563 5.563 8.984 5.3 9.502 c -0.12 0.236 -0.206 0.553 -0.252 1.116 C 5.0 11.194 5.0 11.933 5.0 13.0 v 9.998 c 0.0 1.067 0.0 1.807 0.048 2.382 c 0.046 0.563 0.131 0.88 0.252 1.117 c 0.263 0.517 0.684 0.938 1.202 1.201 c 0.236 0.121 0.553 0.206 1.116 0.253 c 0.576 0.046 1.315 0.047 2.382 0.047 h 3.46 v -6.116 c 0.0 -1.89 0.0 -2.835 0.367 -3.557 c 0.324 -0.635 0.84 -1.152 1.475 -1.475 c 0.722 -0.368 1.667 -0.368 3.558 -0.368 H 31.0 V 13.0 c 0.0 -1.067 0.0 -1.806 -0.048 -2.382 c -0.046 -0.563 -0.131 -0.88 -0.252 -1.116 c -0.264 -0.518 -0.684 -0.939 -1.202 -1.202 Z")
        )
    }.build()
}
