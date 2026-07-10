package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldLinesOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldLinesOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 7.75 8.0 C 7.336 8.0 7.0 8.336 7.0 8.75 S 7.336 9.5 7.75 9.5 h 8.5 C 16.664 9.5 17.0 9.164 17.0 8.75 S 16.664 8.0 16.25 8.0 h -8.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 7.75 11.5 C 7.336 11.5 7.0 11.836 7.0 12.25 S 7.336 13.0 7.75 13.0 h 8.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -8.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 10.75 15.0 C 10.336 15.0 10.0 15.336 10.0 15.75 s 0.336 0.75 0.75 0.75 h 2.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 13.664 15.0 13.25 15.0 h -2.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.552 2.216 c -0.336 -0.22 -0.768 -0.22 -1.104 0.0 c -0.39 0.256 -1.598 1.025 -3.087 1.727 C 6.85 4.655 5.15 5.25 3.75 5.25 C 3.336 5.25 3.0 5.586 3.0 6.0 c 0.0 7.014 2.03 11.015 4.214 13.272 c 2.17 2.244 4.4 2.674 4.652 2.716 h 0.005 l 0.01 0.002 l 0.01 0.002 C 11.911 21.995 11.951 22.0 12.0 22.0 c 0.05 0.0 0.089 -0.005 0.109 -0.008 l 0.02 -0.003 h 0.004 l 0.001 -0.001 c 0.252 -0.043 2.482 -0.472 4.652 -2.716 C 18.97 17.015 21.0 13.014 21.0 6.0 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 c -1.4 0.0 -3.1 -0.595 -4.61 -1.307 c -1.49 -0.702 -2.698 -1.47 -3.088 -1.727 Z M 9.0 5.3 c 1.32 -0.622 2.428 -1.29 3.0 -1.654 c 0.572 0.364 1.68 1.032 3.0 1.654 c 1.333 0.629 2.957 1.246 4.493 1.41 c -0.131 6.256 -1.992 9.667 -3.785 11.52 c -1.626 1.682 -3.264 2.154 -3.708 2.256 c -0.444 -0.102 -2.082 -0.574 -3.708 -2.256 C 6.5 16.376 4.638 12.965 4.507 6.71 C 6.043 6.544 7.667 5.928 9.0 5.298 Z")
        )
    }.build()
}
