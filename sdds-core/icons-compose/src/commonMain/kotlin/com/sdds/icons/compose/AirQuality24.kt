package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AirQuality24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AirQuality24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.0 12.5 c 0.966 0.0 1.75 0.784 1.75 1.75 v 6.0 C 10.75 21.217 9.966 22.0 9.0 22.0 H 7.0 c -0.966 0.0 -1.75 -0.783 -1.75 -1.75 v -6.0 c 0.0 -0.966 0.784 -1.75 1.75 -1.75 h 2.0 Z M 7.0 14.0 c -0.138 0.0 -0.25 0.112 -0.25 0.25 v 6.0 c 0.0 0.138 0.112 0.25 0.25 0.25 h 2.0 c 0.138 0.0 0.25 -0.112 0.25 -0.25 v -6.0 C 9.25 14.112 9.138 14.0 9.0 14.0 H 7.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.5 12.5 c 1.519 0.0 2.75 1.231 2.75 2.75 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 c 0.0 -0.69 -0.56 -1.25 -1.25 -1.25 H 16.0 c -0.966 0.0 -1.75 0.784 -1.75 1.75 v 3.0 c 0.0 0.967 0.784 1.75 1.75 1.75 h 0.5 c 0.69 0.0 1.25 -0.56 1.25 -1.25 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 s 0.75 0.336 0.75 0.75 c 0.0 1.519 -1.231 2.75 -2.75 2.75 H 16.0 c -1.795 0.0 -3.25 -1.455 -3.25 -3.25 v -3.0 c 0.0 -1.795 1.455 -3.25 3.25 -3.25 h 0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.5 2.0 c 0.414 0.0 0.75 0.336 0.75 0.75 S 10.914 3.5 10.5 3.5 H 8.75 v 7.25 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 V 3.5 H 5.5 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 S 5.086 2.0 5.5 2.0 h 5.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.276 2.034 c 0.396 -0.123 0.816 0.097 0.94 0.492 L 16.0 8.236 l 1.784 -5.71 c 0.124 -0.395 0.544 -0.615 0.94 -0.492 c 0.395 0.124 0.615 0.544 0.492 0.94 l -2.5 8.0 C 16.618 11.287 16.328 11.5 16.0 11.5 c -0.328 0.0 -0.618 -0.213 -0.716 -0.526 l -2.5 -8.0 c -0.123 -0.396 0.097 -0.816 0.492 -0.94 Z")
        )
    }.build()
}
