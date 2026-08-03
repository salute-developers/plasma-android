package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DishwasherBrillianceOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DishwasherBrillianceOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 2.75 c -1.795 0.0 -3.25 1.455 -3.25 3.25 h -5.0 C 3.336 6.0 3.0 6.336 3.0 6.75 S 3.336 7.5 3.75 7.5 H 5.0 v 6.781 c 0.0 0.674 0.0 1.224 0.037 1.672 c 0.037 0.463 0.118 0.882 0.317 1.273 c 0.312 0.611 0.809 1.108 1.42 1.42 c 0.391 0.199 0.81 0.28 1.273 0.317 C 8.494 19.0 9.045 19.0 9.718 19.0 h 1.032 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -1.0 c -0.712 0.0 -1.202 0.0 -1.58 -0.032 c -0.371 -0.03 -0.57 -0.085 -0.714 -0.159 c -0.33 -0.168 -0.597 -0.435 -0.765 -0.765 c -0.074 -0.144 -0.13 -0.343 -0.16 -0.713 C 6.502 15.45 6.5 14.962 6.5 14.25 V 7.5 h 11.0 v 3.25 c 0.0 0.414 0.336 0.75 0.75 0.75 S 19.0 11.164 19.0 10.75 V 7.5 h 1.25 C 20.664 7.5 21.0 7.164 21.0 6.75 S 20.664 6.0 20.25 6.0 h -5.0 c 0.0 -1.795 -1.455 -3.25 -3.25 -3.25 Z m 0.0 1.5 c -0.966 0.0 -1.75 0.784 -1.75 1.75 h 3.5 c 0.0 -0.966 -0.784 -1.75 -1.75 -1.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.238 12.722 c -0.076 -0.23 -0.4 -0.23 -0.476 0.0 l -0.526 1.601 c -0.298 0.905 -1.008 1.615 -1.913 1.913 l -1.6 0.526 c -0.23 0.076 -0.23 0.4 0.0 0.476 l 1.6 0.526 c 0.905 0.298 1.615 1.008 1.913 1.913 l 0.526 1.6 c 0.076 0.23 0.4 0.23 0.476 0.0 l 0.526 -1.6 c 0.298 -0.905 1.008 -1.615 1.913 -1.913 l 1.6 -0.526 c 0.23 -0.076 0.23 -0.4 0.0 -0.476 l -1.6 -0.526 c -0.905 -0.298 -1.615 -1.008 -1.913 -1.913 l -0.526 -1.6 Z")
        )
    }.build()
}
