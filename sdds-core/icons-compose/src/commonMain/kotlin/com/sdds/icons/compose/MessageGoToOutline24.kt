package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageGoToOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageGoToOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.318 11.762 c 0.0 -3.81 3.09 -6.9 6.9 -6.9 c 3.075 0.0 5.681 2.011 6.573 4.792 c 0.126 0.394 0.548 0.611 0.943 0.485 c 0.394 -0.126 0.611 -0.549 0.485 -0.943 c -1.085 -3.383 -4.255 -5.834 -8.0 -5.834 c -4.64 0.0 -8.4 3.761 -8.4 8.4 c 0.0 0.998 0.174 1.957 0.494 2.847 c 0.185 0.513 0.234 1.005 0.115 1.432 l -0.701 2.503 c -0.292 1.042 0.668 2.002 1.71 1.71 l 2.503 -0.7 c 0.426 -0.12 0.92 -0.071 1.432 0.114 c 0.89 0.32 1.849 0.494 2.847 0.494 c 3.57 0.0 6.619 -2.227 7.835 -5.366 c 0.15 -0.386 -0.042 -0.82 -0.429 -0.97 c -0.386 -0.15 -0.82 0.042 -0.97 0.428 c -1.0 2.58 -3.506 4.408 -6.437 4.408 c -0.822 0.0 -1.609 -0.143 -2.338 -0.406 c -0.702 -0.253 -1.527 -0.376 -2.344 -0.147 l -2.31 0.647 l 0.646 -2.311 c 0.23 -0.818 0.106 -1.642 -0.147 -2.344 c -0.263 -0.73 -0.407 -1.517 -0.407 -2.339 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.661 9.53 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 c -0.293 -0.293 -0.768 -0.293 -1.06 0.0 l -2.975 2.974 c -0.141 0.141 -0.22 0.332 -0.22 0.53 c 0.0 0.2 0.079 0.39 0.22 0.531 L 13.6 15.48 c 0.292 0.293 0.767 0.293 1.06 0.0 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 l -1.694 -1.695 h 6.689 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -6.69 l 1.695 -1.695 Z")
        )
    }.build()
}
