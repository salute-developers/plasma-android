package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CalendarOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CalendarOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.424 3.0 c 0.553 0.0 1.0 0.448 1.0 1.0 v 2.029 h 13.152 V 4.0 c 0.0 -0.552 0.447 -1.0 1.0 -1.0 c 0.552 0.0 1.0 0.448 1.0 1.0 v 2.033 c 0.524 0.01 0.948 0.042 1.33 0.138 c 1.699 0.427 3.025 1.753 3.451 3.451 c 0.144 0.572 0.143 1.235 0.143 2.19 v 0.14 v 12.59 c 0.0 1.014 0.0 1.836 -0.054 2.502 c -0.056 0.688 -0.176 1.297 -0.464 1.863 c -0.455 0.893 -1.182 1.62 -2.075 2.075 c -0.566 0.288 -1.175 0.407 -1.863 0.464 c -0.666 0.054 -1.488 0.054 -2.502 0.054 H 11.459 c -1.014 0.0 -1.836 0.0 -2.502 -0.054 c -0.688 -0.057 -1.297 -0.176 -1.862 -0.464 c -0.894 -0.455 -1.62 -1.182 -2.076 -2.075 c -0.288 -0.566 -0.407 -1.175 -0.464 -1.863 C 4.5 26.378 4.5 25.556 4.5 24.542 v -12.59 v -0.14 c 0.0 -0.955 0.0 -1.618 0.143 -2.19 c 0.426 -1.698 1.752 -3.024 3.45 -3.45 C 8.477 6.074 8.9 6.043 9.425 6.032 V 4.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 Z m 0.0 5.029 c -1.152 0.0 -1.544 0.007 -1.843 0.082 C 7.597 8.358 6.83 9.126 6.583 10.11 C 6.508 10.41 6.5 10.801 6.5 11.953 V 13.6 h 23.0 v -1.647 c 0.0 -1.152 -0.008 -1.544 -0.083 -1.844 c -0.247 -0.983 -1.014 -1.75 -1.997 -1.998 c -0.3 -0.075 -0.692 -0.082 -1.844 -0.082 H 10.424 Z M 29.5 15.6 h -23.0 v 8.9 c 0.0 1.067 0.0 1.806 0.048 2.382 c 0.046 0.563 0.131 0.88 0.252 1.116 c 0.263 0.518 0.684 0.939 1.202 1.202 c 0.236 0.12 0.553 0.206 1.116 0.252 C 9.694 29.5 10.434 29.5 11.5 29.5 h 13.0 c 1.067 0.0 1.806 0.0 2.382 -0.048 c 0.563 -0.046 0.88 -0.131 1.116 -0.252 c 0.518 -0.263 0.939 -0.684 1.202 -1.201 c 0.12 -0.237 0.206 -0.554 0.252 -1.117 C 29.5 26.306 29.5 25.567 29.5 24.5 v -8.9 Z")
        )
    }.build()
}
