package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldChildOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldChildOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 10.448 7.096 c 0.0 -0.858 0.696 -1.554 1.554 -1.554 c 0.859 0.0 1.555 0.696 1.555 1.554 c 0.0 0.859 -0.696 1.555 -1.555 1.555 c -0.858 0.0 -1.554 -0.696 -1.554 -1.555 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 10.48 9.737 c 0.25 -0.282 0.609 -0.464 1.016 -0.464 h 1.013 c 0.407 0.0 0.766 0.182 1.015 0.464 l 2.616 2.415 c 0.27 0.252 0.288 0.676 0.037 0.948 c -0.25 0.27 -0.675 0.287 -0.947 0.036 l -0.65 -0.6 c -0.272 -0.252 -0.712 -0.059 -0.712 0.31 v 0.931 l 0.254 3.682 c 0.031 0.45 -0.325 0.83 -0.774 0.83 c -0.408 0.0 -0.746 -0.316 -0.774 -0.723 l -0.159 -2.312 c -0.015 -0.217 -0.195 -0.385 -0.413 -0.385 c -0.217 0.0 -0.398 0.168 -0.412 0.385 l -0.16 2.312 c -0.028 0.407 -0.365 0.723 -0.773 0.723 c -0.45 0.0 -0.806 -0.38 -0.774 -0.83 l 0.254 -3.678 v -0.934 c 0.0 -0.37 -0.44 -0.563 -0.712 -0.312 l -0.65 0.6 C 8.501 13.388 8.077 13.37 7.827 13.1 c -0.251 -0.272 -0.234 -0.696 0.037 -0.948 l 2.616 -2.415 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.552 2.216 c -0.336 -0.22 -0.768 -0.22 -1.104 0.0 c -0.39 0.256 -1.598 1.025 -3.087 1.727 C 6.85 4.655 5.15 5.25 3.75 5.25 C 3.336 5.25 3.0 5.586 3.0 6.0 c 0.0 7.014 2.03 11.015 4.214 13.272 c 2.17 2.244 4.4 2.674 4.652 2.716 h 0.005 l 0.01 0.002 l 0.01 0.002 C 11.911 21.995 11.951 22.0 12.0 22.0 c 0.05 0.0 0.089 -0.005 0.109 -0.008 l 0.02 -0.003 h 0.004 l 0.001 -0.001 c 0.252 -0.043 2.482 -0.472 4.652 -2.716 C 18.97 17.015 21.0 13.014 21.0 6.0 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 c -1.4 0.0 -3.1 -0.595 -4.61 -1.307 c -1.49 -0.702 -2.698 -1.47 -3.088 -1.727 Z M 9.0 5.3 c 1.32 -0.622 2.428 -1.29 3.0 -1.654 c 0.572 0.364 1.68 1.032 3.0 1.654 c 1.333 0.629 2.957 1.246 4.493 1.41 c -0.131 6.256 -1.992 9.667 -3.785 11.52 c -1.626 1.682 -3.264 2.154 -3.708 2.256 c -0.444 -0.102 -2.082 -0.574 -3.708 -2.256 C 6.5 16.376 4.638 12.965 4.507 6.71 C 6.043 6.544 7.667 5.928 9.0 5.298 Z")
        )
    }.build()
}
