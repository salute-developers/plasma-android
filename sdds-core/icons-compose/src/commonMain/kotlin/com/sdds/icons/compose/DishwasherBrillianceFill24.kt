package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DishwasherBrillianceFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DishwasherBrillianceFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.75 6.0 c 0.0 -1.795 1.455 -3.25 3.25 -3.25 S 15.25 4.205 15.25 6.0 h 5.0 C 20.664 6.0 21.0 6.336 21.0 6.75 S 20.664 7.5 20.25 7.5 H 19.0 v 5.78 l -0.337 -1.027 c -0.528 -1.604 -2.798 -1.604 -3.325 0.0 l -0.527 1.602 c -0.149 0.452 -0.504 0.807 -0.956 0.956 l -1.601 0.527 c -1.605 0.527 -1.605 2.797 0.0 3.324 L 13.28 19.0 H 9.72 c -0.674 0.0 -1.225 0.0 -1.672 -0.037 c -0.463 -0.037 -0.882 -0.118 -1.272 -0.317 c -0.612 -0.312 -1.11 -0.809 -1.42 -1.42 c -0.2 -0.391 -0.28 -0.81 -0.318 -1.273 C 5.0 15.506 5.0 14.955 5.0 14.281 V 7.5 H 3.75 C 3.336 7.5 3.0 7.164 3.0 6.75 S 3.336 6.0 3.75 6.0 h 5.0 Z m 1.5 0.0 c 0.0 -0.966 0.784 -1.75 1.75 -1.75 S 13.75 5.034 13.75 6.0 h -3.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.238 12.722 c -0.076 -0.23 -0.4 -0.23 -0.476 0.0 l -0.526 1.601 c -0.298 0.905 -1.008 1.615 -1.913 1.913 l -1.6 0.526 c -0.23 0.076 -0.23 0.4 0.0 0.476 l 1.6 0.526 c 0.905 0.298 1.615 1.008 1.913 1.913 l 0.526 1.6 c 0.076 0.23 0.4 0.23 0.476 0.0 l 0.526 -1.6 c 0.298 -0.905 1.008 -1.615 1.913 -1.913 l 1.6 -0.526 c 0.23 -0.076 0.23 -0.4 0.0 -0.476 l -1.6 -0.526 c -0.905 -0.298 -1.615 -1.008 -1.913 -1.913 l -0.526 -1.6 Z")
        )
    }.build()
}
