package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MobileVibrationFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MobileVibrationFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.537 7.875 c 0.0 -1.864 1.511 -3.375 3.375 -3.375 h 8.178 c 1.864 0.0 3.375 1.511 3.375 3.375 v 20.25 c 0.0 1.864 -1.51 3.375 -3.375 3.375 h -8.178 c -1.864 0.0 -3.375 -1.511 -3.375 -3.375 V 7.875 Z m 4.598 1.5 c 0.0 -0.552 0.447 -1.0 1.0 -1.0 h 3.732 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 h -3.732 c -0.553 0.0 -1.0 -0.448 -1.0 -1.0 Z M 4.606 9.041 c -0.391 0.39 -0.393 1.023 -0.003 1.414 L 6.14 12.0 l -1.968 1.977 c -0.563 0.566 -0.563 1.48 0.0 2.046 L 6.14 18.0 l -1.968 1.977 c -0.563 0.566 -0.563 1.48 0.0 2.046 L 6.14 24.0 l -1.537 1.545 c -0.39 0.391 -0.388 1.024 0.003 1.414 c 0.392 0.39 1.025 0.388 1.414 -0.004 l 1.924 -1.932 c 0.563 -0.566 0.563 -1.48 0.0 -2.046 L 5.976 21.0 l 1.968 -1.977 c 0.563 -0.566 0.563 -1.48 0.0 -2.046 L 5.976 15.0 l 1.968 -1.977 c 0.563 -0.566 0.563 -1.48 0.0 -2.046 L 6.02 9.045 C 5.63 8.653 4.998 8.652 4.606 9.04 Z m 26.79 0.0 c 0.391 0.39 0.393 1.023 0.003 1.414 L 29.862 12.0 l 1.968 1.977 c 0.563 0.566 0.563 1.48 0.0 2.046 L 29.862 18.0 l 1.968 1.977 c 0.563 0.566 0.563 1.48 0.0 2.046 L 29.862 24.0 l 1.537 1.545 c 0.39 0.391 0.388 1.024 -0.003 1.414 c -0.392 0.39 -1.025 0.388 -1.414 -0.004 l -1.924 -1.932 c -0.563 -0.566 -0.563 -1.48 0.0 -2.046 L 30.026 21.0 l -1.968 -1.977 c -0.563 -0.566 -0.563 -1.48 0.0 -2.046 L 30.026 15.0 l -1.968 -1.977 c -0.563 -0.566 -0.563 -1.48 0.0 -2.046 l 1.924 -1.932 c 0.39 -0.392 1.022 -0.393 1.414 -0.004 Z")
        )
    }.build()
}
