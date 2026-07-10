package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Sb16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Sb16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 2.617 c -1.388 0.0 -2.654 0.527 -3.61 1.393 C 3.302 4.995 2.618 6.419 2.617 8.0 c 0.0 1.388 0.528 2.654 1.393 3.61 c 0.986 1.088 2.41 1.773 3.99 1.773 c 1.388 0.0 2.655 -0.529 3.61 -1.394 C 12.7 11.004 13.384 9.58 13.384 8.0 c 0.0 -0.048 0.0 -0.095 -0.002 -0.143 l 1.507 -1.11 C 14.96 7.152 15.0 7.571 15.0 8.0 c 0.0 1.933 -0.784 3.683 -2.05 4.95 C 11.683 14.215 9.933 15.0 8.0 15.0 H 7.983 c -1.926 -0.005 -3.67 -0.787 -4.932 -2.05 C 1.784 11.681 1.0 9.931 1.0 8.0 c 0.0 -1.933 0.783 -3.683 2.05 -4.95 C 4.317 1.783 6.067 1.0 8.0 1.0 c 1.665 0.0 3.195 0.582 4.397 1.553 l -1.362 1.003 C 10.24 3.011 9.292 2.674 8.27 2.624 C 8.22 2.62 8.173 2.62 8.125 2.619 L 8.0 2.617 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.378 5.111 C 14.152 4.614 13.87 4.147 13.54 3.72 L 8.0 7.802 l -2.664 -1.67 v 2.01 L 8.0 9.812 l 6.378 -4.7 Z")
        )
    }.build()
}
