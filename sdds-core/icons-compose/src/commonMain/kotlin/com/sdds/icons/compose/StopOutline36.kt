package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StopOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StopOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.457 4.5 h 13.085 c 1.014 0.0 1.836 0.0 2.502 0.054 c 0.688 0.057 1.297 0.176 1.863 0.464 c 0.893 0.455 1.62 1.182 2.075 2.076 c 0.288 0.565 0.407 1.174 0.464 1.862 c 0.054 0.666 0.054 1.488 0.054 2.502 v 13.085 c 0.0 1.014 0.0 1.835 -0.054 2.501 c -0.057 0.688 -0.176 1.297 -0.464 1.863 c -0.455 0.893 -1.182 1.62 -2.075 2.075 c -0.566 0.288 -1.175 0.407 -1.863 0.464 c -0.666 0.054 -1.488 0.054 -2.502 0.054 H 11.457 c -1.014 0.0 -1.835 0.0 -2.501 -0.054 c -0.688 -0.057 -1.297 -0.176 -1.862 -0.464 c -0.894 -0.455 -1.62 -1.182 -2.076 -2.075 c -0.288 -0.566 -0.407 -1.175 -0.464 -1.863 C 4.5 26.378 4.5 25.556 4.5 24.542 V 11.457 c 0.0 -1.014 0.0 -1.835 0.054 -2.501 c 0.057 -0.688 0.176 -1.297 0.464 -1.862 C 5.473 6.2 6.2 5.474 7.094 5.018 C 7.659 4.73 8.268 4.61 8.956 4.554 C 9.622 4.5 10.444 4.5 11.458 4.5 Z M 9.118 6.548 C 8.555 6.594 8.238 6.679 8.002 6.8 C 7.484 7.063 7.063 7.484 6.8 8.002 C 6.68 8.238 6.594 8.555 6.548 9.118 C 6.5 9.694 6.5 10.433 6.5 11.5 v 13.0 c 0.0 1.067 0.0 1.806 0.048 2.382 c 0.046 0.563 0.131 0.88 0.252 1.116 c 0.263 0.518 0.684 0.939 1.202 1.202 c 0.236 0.12 0.553 0.206 1.116 0.252 C 9.694 29.5 10.433 29.5 11.5 29.5 h 13.0 c 1.067 0.0 1.806 0.0 2.382 -0.048 c 0.563 -0.046 0.88 -0.131 1.116 -0.252 c 0.518 -0.263 0.939 -0.684 1.202 -1.201 c 0.12 -0.237 0.206 -0.554 0.252 -1.117 C 29.5 26.306 29.5 25.567 29.5 24.5 v -13.0 c 0.0 -1.067 0.0 -1.806 -0.048 -2.382 c -0.046 -0.563 -0.131 -0.88 -0.252 -1.116 C 28.937 7.484 28.516 7.063 28.0 6.8 c -0.237 -0.12 -0.554 -0.206 -1.117 -0.252 C 26.306 6.5 25.567 6.5 24.5 6.5 h -13.0 c -1.067 0.0 -1.806 0.0 -2.382 0.048 Z")
        )
    }.build()
}
