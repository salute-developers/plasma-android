package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BikeFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BikeFill16",
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
            pathData = addPathNodes("M 11.675 7.47 c -1.377 0.0 -2.397 -0.723 -3.102 -1.448 L 7.059 7.548 l 1.038 0.898 C 8.37 8.68 8.525 9.023 8.525 9.383 v 2.5 c 0.0 0.292 -0.235 0.529 -0.525 0.529 c -0.29 0.0 -0.525 -0.237 -0.525 -0.53 V 9.383 c 0.0 -0.051 -0.022 -0.1 -0.061 -0.133 L 5.782 7.84 C 5.24 7.37 5.21 6.536 5.713 6.027 l 1.331 -1.343 c 0.545 -0.549 1.408 -0.443 1.86 0.12 l 0.09 0.11 c 0.633 0.76 1.504 1.497 2.681 1.497 c 0.29 0.0 0.525 0.237 0.525 0.53 c 0.0 0.292 -0.235 0.529 -0.525 0.529 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.8 14.0 c 1.546 0.0 2.8 -1.264 2.8 -2.823 c 0.0 -1.56 -1.254 -2.824 -2.8 -2.824 c -1.546 0.0 -2.8 1.264 -2.8 2.824 C 1.0 12.736 2.254 14.0 3.8 14.0 Z m 0.0 -2.118 c 0.387 0.0 0.7 -0.316 0.7 -0.705 c 0.0 -0.39 -0.313 -0.706 -0.7 -0.706 c -0.387 0.0 -0.7 0.316 -0.7 0.706 c 0.0 0.39 0.313 0.705 0.7 0.705 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.0 11.177 C 15.0 12.736 13.746 14.0 12.2 14.0 c -1.546 0.0 -2.8 -1.264 -2.8 -2.823 c 0.0 -1.56 1.254 -2.824 2.8 -2.824 c 1.546 0.0 2.8 1.264 2.8 2.824 Z m -2.1 0.0 c 0.0 0.39 -0.313 0.705 -0.7 0.705 c -0.387 0.0 -0.7 -0.316 -0.7 -0.705 c 0.0 -0.39 0.313 -0.706 0.7 -0.706 c 0.387 0.0 0.7 0.316 0.7 0.706 Z")
        )
    }.build()
}
