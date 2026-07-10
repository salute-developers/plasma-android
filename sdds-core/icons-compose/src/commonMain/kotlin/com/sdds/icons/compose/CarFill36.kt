package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CarFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CarFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.973 5.75 h 8.054 c 1.65 0.0 2.788 -0.001 3.785 0.391 c 0.878 0.346 1.654 0.906 2.258 1.63 c 0.535 0.642 0.87 1.44 1.238 2.503 h 1.067 c 0.621 0.0 1.125 0.504 1.125 1.125 c 0.0 0.622 -0.504 1.125 -1.125 1.125 h -0.317 l 0.616 1.856 C 32.069 15.237 33.0 16.778 33.0 18.537 v 9.088 c 0.0 1.45 -1.175 2.625 -2.625 2.625 s -2.625 -1.175 -2.625 -2.625 V 26.48 H 8.25 v 1.145 c 0.0 1.45 -1.175 2.625 -2.625 2.625 S 3.0 29.075 3.0 27.625 v -9.088 c 0.0 -1.759 0.93 -3.3 2.327 -4.157 l 0.615 -1.856 H 5.625 c -0.621 0.0 -1.125 -0.503 -1.125 -1.125 c 0.0 -0.621 0.504 -1.125 1.125 -1.125 h 1.067 C 7.059 9.211 7.395 8.413 7.93 7.771 c 0.604 -0.724 1.38 -1.284 2.258 -1.63 c 0.997 -0.392 2.135 -0.392 3.785 -0.39 Z m 13.595 6.413 l 0.497 1.499 H 7.935 l 0.497 -1.499 c 0.618 -1.865 0.848 -2.498 1.225 -2.95 c 0.363 -0.434 0.829 -0.77 1.355 -0.978 C 11.56 8.019 12.233 8.0 14.198 8.0 h 7.604 c 1.965 0.0 2.638 0.02 3.186 0.235 c 0.526 0.207 0.992 0.544 1.355 0.978 c 0.377 0.452 0.607 1.085 1.225 2.95 Z m -1.318 9.793 c 1.243 0.0 2.25 -1.013 2.25 -2.262 c 0.0 -1.25 -1.007 -2.262 -2.25 -2.262 S 24.0 18.444 24.0 19.694 c 0.0 1.249 1.007 2.262 2.25 2.262 Z M 12.0 19.694 c 0.0 1.249 -1.007 2.262 -2.25 2.262 S 7.5 20.943 7.5 19.694 c 0.0 -1.25 1.007 -2.262 2.25 -2.262 S 12.0 18.444 12.0 19.694 Z m 3.758 -1.508 c -0.833 0.0 -1.508 0.675 -1.508 1.507 c 0.0 0.833 0.675 1.508 1.508 1.508 h 4.484 c 0.833 0.0 1.508 -0.675 1.508 -1.508 c 0.0 -0.832 -0.675 -1.507 -1.508 -1.507 h -4.484 Z")
        )
    }.build()
}
