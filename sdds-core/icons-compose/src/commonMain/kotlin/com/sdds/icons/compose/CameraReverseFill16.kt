package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraReverseFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraReverseFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.25 5.0 C 14.664 5.0 15.0 5.336 15.0 5.75 v 3.754 c 0.0 0.562 0.0 1.029 -0.031 1.41 c -0.032 0.396 -0.102 0.765 -0.28 1.113 c -0.273 0.537 -0.709 0.973 -1.245 1.246 c -0.348 0.177 -0.717 0.247 -1.114 0.28 c -0.38 0.03 -0.847 0.03 -1.41 0.03 H 4.057 l 0.137 0.138 c 0.292 0.293 0.292 0.768 -0.002 1.06 c -0.293 0.293 -0.768 0.292 -1.06 -0.002 l -1.412 -1.416 c -0.292 -0.293 -0.292 -0.766 0.0 -1.06 l 1.412 -1.416 c 0.292 -0.293 0.767 -0.294 1.06 -0.002 c 0.294 0.293 0.294 0.768 0.002 1.061 l -0.137 0.137 h 6.834 c 0.6 0.0 1.006 0.0 1.318 -0.026 c 0.304 -0.025 0.454 -0.07 0.555 -0.12 c 0.254 -0.13 0.46 -0.337 0.59 -0.59 c 0.052 -0.102 0.096 -0.252 0.12 -0.556 C 13.5 10.48 13.5 10.074 13.5 9.473 V 5.75 C 13.5 5.336 13.836 5.0 14.25 5.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.809 1.219 c 0.293 -0.293 0.768 -0.292 1.06 0.002 l 1.412 1.416 c 0.292 0.293 0.292 0.766 0.0 1.06 L 12.87 5.112 c -0.292 0.293 -0.767 0.294 -1.06 0.002 c -0.294 -0.293 -0.294 -0.768 -0.002 -1.061 l 0.137 -0.137 H 5.11 c -0.6 0.0 -1.006 0.0 -1.318 0.026 c -0.304 0.025 -0.454 0.07 -0.555 0.12 c -0.254 0.13 -0.46 0.337 -0.59 0.59 c -0.051 0.102 -0.096 0.252 -0.12 0.555 C 2.5 5.521 2.5 5.926 2.5 6.527 v 3.723 C 2.5 10.664 2.164 11.0 1.75 11.0 S 1.0 10.664 1.0 10.25 V 6.496 c 0.0 -0.562 0.0 -1.029 0.031 -1.41 c 0.032 -0.396 0.102 -0.765 0.28 -1.113 C 1.584 3.437 2.02 3.0 2.556 2.727 C 2.904 2.55 3.273 2.48 3.67 2.447 c 0.38 -0.03 0.847 -0.03 1.41 -0.03 h 6.864 l -0.137 -0.138 c -0.292 -0.293 -0.292 -0.768 0.002 -1.06 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFF2C61B2)),
            pathData = addPathNodes("M 11.0 8.0 c 0.0 1.519 -1.231 2.75 -2.75 2.75 S 5.5 9.519 5.5 8.0 s 1.231 -2.75 2.75 -2.75 S 11.0 6.481 11.0 8.0 Z")
        )
    }.build()
}
