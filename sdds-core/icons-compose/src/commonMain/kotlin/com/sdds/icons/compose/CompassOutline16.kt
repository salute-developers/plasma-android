package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CompassOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CompassOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.05 8.0 c 0.0 -3.286 2.664 -5.95 5.95 -5.95 S 13.95 4.714 13.95 8.0 S 11.286 13.95 8.0 13.95 S 2.05 11.286 2.05 8.0 Z M 8.0 1.0 C 4.134 1.0 1.0 4.134 1.0 8.0 s 3.134 7.0 7.0 7.0 s 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 Z m 2.948 3.087 c 0.172 0.13 0.247 0.35 0.191 0.557 l -1.088 4.007 C 9.92 9.128 9.613 9.537 9.19 9.793 l -3.552 2.15 c -0.184 0.112 -0.417 0.1 -0.588 -0.029 c -0.172 -0.13 -0.247 -0.35 -0.191 -0.557 L 5.948 7.35 c 0.13 -0.477 0.438 -0.886 0.861 -1.142 l 3.551 -2.15 c 0.184 -0.112 0.417 -0.1 0.588 0.03 Z M 6.962 7.626 c 0.03 -0.109 0.079 -0.21 0.145 -0.298 l 1.785 1.345 c -0.067 0.088 -0.15 0.164 -0.246 0.222 l -2.429 1.47 l 0.745 -2.74 Z")
        )
    }.build()
}
