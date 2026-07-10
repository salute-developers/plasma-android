package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarCircleOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarCircleOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.046 5.793 c -0.33 -1.014 -1.763 -1.014 -2.092 0.0 l -1.07 3.294 H 6.42 c -1.066 0.0 -1.509 1.364 -0.647 1.99 l 2.802 2.036 l -1.07 3.294 c -0.33 1.013 0.83 1.856 1.693 1.23 L 12.0 15.6 l 2.802 2.036 c 0.862 0.626 2.022 -0.217 1.693 -1.23 l -1.07 -3.294 l 2.802 -2.036 c 0.862 -0.626 0.419 -1.99 -0.647 -1.99 h -3.463 l -1.07 -3.294 Z M 11.22 9.827 l 0.78 -2.4 l 0.78 2.4 c 0.147 0.453 0.57 0.76 1.046 0.76 h 2.523 l -2.041 1.483 c -0.386 0.28 -0.547 0.777 -0.4 1.23 l 0.78 2.4 l -2.041 -1.483 c -0.386 -0.28 -0.908 -0.28 -1.294 0.0 L 9.313 15.7 l 0.779 -2.4 c 0.147 -0.453 -0.014 -0.95 -0.4 -1.23 l -2.041 -1.483 h 2.523 c 0.477 0.0 0.899 -0.307 1.046 -0.76 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 2.0 C 6.477 2.0 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 s 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 Z M 3.5 12.0 c 0.0 -4.694 3.806 -8.5 8.5 -8.5 s 8.5 3.806 8.5 8.5 s -3.806 8.5 -8.5 8.5 s -8.5 -3.806 -8.5 -8.5 Z")
        )
    }.build()
}
