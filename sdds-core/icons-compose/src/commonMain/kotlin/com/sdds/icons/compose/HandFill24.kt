package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HandFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HandFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.355 4.0 c 0.0 -0.552 0.447 -1.0 1.0 -1.0 c 0.552 0.0 1.0 0.448 1.0 1.0 v 7.5 c 0.0 0.138 0.112 0.25 0.25 0.25 s 0.25 -0.112 0.25 -0.25 V 6.0 c 0.0 -0.552 0.447 -1.0 1.0 -1.0 c 0.552 0.0 1.0 0.448 1.0 1.0 v 6.25 c 0.0 0.138 0.112 0.25 0.25 0.25 s 0.25 -0.112 0.25 -0.25 v -3.0 c 0.0 -0.552 0.447 -1.0 1.0 -1.0 c 0.552 0.0 1.0 0.448 1.0 1.0 v 5.5 l 0.001 0.028 c -0.011 2.338 -1.46 4.529 -3.785 5.375 c -2.984 1.086 -6.283 -0.452 -7.37 -3.436 l -1.966 -5.404 c -0.189 -0.519 0.079 -1.092 0.598 -1.281 c 0.03 -0.012 0.062 -0.021 0.093 -0.03 c 0.407 -0.076 0.823 0.064 0.998 0.433 c 0.17 0.359 0.311 0.633 0.442 0.887 L 8.37 14.08 c 0.041 0.114 0.159 0.182 0.278 0.16 c 0.12 -0.02 0.207 -0.124 0.207 -0.246 V 5.5 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 v 5.25 c 0.0 0.138 0.112 0.25 0.25 0.25 s 0.25 -0.112 0.25 -0.25 V 4.0 Z")
        )
    }.build()
}
