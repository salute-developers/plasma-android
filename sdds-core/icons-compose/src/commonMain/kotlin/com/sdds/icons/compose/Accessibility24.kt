package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Accessibility24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Accessibility24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 6.5 c 1.243 0.0 2.25 -1.007 2.25 -2.25 S 13.243 2.0 12.0 2.0 c -1.242 0.0 -2.25 1.007 -2.25 2.25 S 10.758 6.5 12.0 6.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.46 6.272 C 3.92 6.156 3.39 6.5 3.273 7.04 C 3.156 7.58 3.5 8.112 4.04 8.228 c 1.357 0.291 2.618 0.518 3.83 0.678 l 0.215 0.027 C 8.673 9.03 8.822 9.25 8.877 9.347 C 8.985 9.54 9.0 9.787 9.0 10.107 V 21.0 c 0.0 0.552 0.448 1.0 1.0 1.0 c 0.553 0.0 1.0 -0.448 1.0 -1.0 v -3.45 c 0.0 -1.038 0.19 -1.55 0.359 -1.78 c 0.123 -0.17 0.288 -0.27 0.641 -0.27 c 0.353 0.0 0.519 0.1 0.641 0.27 c 0.169 0.23 0.36 0.742 0.36 1.78 V 21.0 c 0.0 0.552 0.447 1.0 1.0 1.0 c 0.551 0.0 1.0 -0.448 1.0 -1.0 V 10.108 c 0.0 -0.322 0.015 -0.569 0.122 -0.76 c 0.055 -0.099 0.205 -0.32 0.793 -0.415 l 0.215 -0.027 c 1.211 -0.16 2.472 -0.387 3.83 -0.678 c 0.54 -0.116 0.883 -0.648 0.767 -1.188 c -0.116 -0.54 -0.648 -0.884 -1.188 -0.768 c -1.311 0.282 -2.514 0.498 -3.656 0.649 c -0.082 0.008 -0.162 0.019 -0.24 0.03 c -2.515 0.315 -4.773 0.315 -7.287 0.0 c -0.078 -0.011 -0.158 -0.022 -0.24 -0.03 C 6.974 6.77 5.772 6.554 4.46 6.272 Z")
        )
    }.build()
}
