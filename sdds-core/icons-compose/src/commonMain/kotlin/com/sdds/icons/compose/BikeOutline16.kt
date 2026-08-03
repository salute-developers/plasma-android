package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BikeOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BikeOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.925 4.47 c 0.676 0.0 1.225 -0.552 1.225 -1.235 C 11.15 2.553 10.601 2.0 9.925 2.0 C 9.248 2.0 8.7 2.553 8.7 3.235 c 0.0 0.683 0.548 1.236 1.225 1.236 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.573 6.022 c 0.705 0.725 1.725 1.449 3.102 1.449 c 0.29 0.0 0.525 -0.237 0.525 -0.53 c 0.0 -0.292 -0.235 -0.53 -0.525 -0.53 c -1.177 0.0 -2.048 -0.736 -2.682 -1.497 l -0.09 -0.11 C 8.453 4.242 7.59 4.136 7.044 4.685 l -1.33 1.343 C 5.208 6.537 5.24 7.37 5.781 7.839 l 1.632 1.41 c 0.039 0.034 0.061 0.083 0.061 0.134 v 2.5 c 0.0 0.292 0.235 0.529 0.525 0.529 c 0.29 0.0 0.525 -0.237 0.525 -0.53 V 9.383 c 0.0 -0.36 -0.156 -0.703 -0.428 -0.937 L 7.06 7.548 l 1.514 -1.526 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.8 8.353 c -1.546 0.0 -2.8 1.264 -2.8 2.824 C 1.0 12.736 2.254 14.0 3.8 14.0 c 1.546 0.0 2.8 -1.264 2.8 -2.823 c 0.0 -1.56 -1.254 -2.824 -2.8 -2.824 Z m -1.75 2.824 c 0.0 -0.975 0.784 -1.765 1.75 -1.765 s 1.75 0.79 1.75 1.764 c 0.0 0.975 -0.784 1.765 -1.75 1.765 s -1.75 -0.79 -1.75 -1.764 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.2 8.353 c -1.546 0.0 -2.8 1.264 -2.8 2.824 C 9.4 12.736 10.654 14.0 12.2 14.0 c 1.546 0.0 2.8 -1.264 2.8 -2.823 c 0.0 -1.56 -1.254 -2.824 -2.8 -2.824 Z m -1.75 2.824 c 0.0 -0.975 0.784 -1.765 1.75 -1.765 s 1.75 0.79 1.75 1.764 c 0.0 0.975 -0.784 1.765 -1.75 1.765 s -1.75 -0.79 -1.75 -1.764 Z")
        )
    }.build()
}
