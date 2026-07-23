package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldChildFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldChildFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.552 2.216 c -0.336 -0.22 -0.768 -0.22 -1.104 0.0 c -0.39 0.256 -1.598 1.025 -3.087 1.727 C 6.85 4.655 5.15 5.25 3.75 5.25 C 3.336 5.25 3.0 5.586 3.0 6.0 c 0.0 7.014 2.03 11.015 4.214 13.272 c 2.17 2.244 4.4 2.674 4.652 2.716 h 0.005 l 0.01 0.002 l 0.01 0.002 C 11.911 21.995 11.951 22.0 12.0 22.0 c 0.05 0.0 0.089 -0.005 0.109 -0.008 l 0.02 -0.003 h 0.004 l 0.001 -0.001 c 0.252 -0.043 2.482 -0.472 4.652 -2.716 C 18.97 17.015 21.0 13.014 21.0 6.0 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 c -1.4 0.0 -3.1 -0.595 -4.61 -1.307 c -1.49 -0.702 -2.698 -1.47 -3.088 -1.727 Z m -2.104 4.88 c 0.0 -0.858 0.696 -1.554 1.554 -1.554 c 0.859 0.0 1.555 0.696 1.555 1.554 c 0.0 0.859 -0.696 1.555 -1.555 1.555 c -0.858 0.0 -1.554 -0.696 -1.554 -1.555 Z m 0.033 2.64 c 0.248 -0.281 0.608 -0.463 1.015 -0.463 h 1.013 c 0.407 0.0 0.766 0.182 1.015 0.463 l 2.616 2.416 c 0.27 0.251 0.288 0.675 0.037 0.947 c -0.25 0.271 -0.675 0.288 -0.947 0.037 l -0.65 -0.601 c -0.272 -0.25 -0.712 -0.058 -0.712 0.312 v 0.93 l 0.254 3.682 c 0.031 0.45 -0.325 0.83 -0.774 0.83 c -0.408 0.0 -0.746 -0.316 -0.774 -0.723 l -0.159 -2.312 c -0.015 -0.217 -0.195 -0.385 -0.413 -0.385 c -0.217 0.0 -0.398 0.168 -0.412 0.385 l -0.16 2.312 c -0.028 0.407 -0.365 0.723 -0.773 0.723 c -0.45 0.0 -0.806 -0.38 -0.774 -0.83 l 0.254 -3.678 v -0.934 c 0.0 -0.37 -0.44 -0.563 -0.712 -0.312 l -0.65 0.6 C 8.501 13.388 8.077 13.37 7.827 13.1 c -0.251 -0.272 -0.234 -0.696 0.037 -0.947 l 2.616 -2.416 Z")
        )
    }.build()
}
