package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CubeOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CubeOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.278 2.054 c -0.179 -0.072 -0.377 -0.072 -0.556 0.0 L 3.132 3.9 L 8.0 5.89 l 4.869 -1.99 l -4.591 -1.846 Z m 5.459 2.571 L 8.5 6.765 v 7.092 l 4.778 -1.921 c 0.284 -0.114 0.472 -0.392 0.472 -0.703 V 4.767 c 0.0 -0.048 -0.005 -0.096 -0.013 -0.142 Z M 7.5 13.857 V 6.765 l -5.237 -2.14 C 2.255 4.671 2.25 4.72 2.25 4.767 v 6.466 c 0.0 0.31 0.188 0.589 0.472 0.703 l 4.778 1.92 Z M 7.35 1.126 c 0.417 -0.168 0.883 -0.168 1.3 0.0 l 5.0 2.01 c 0.29 0.117 0.537 0.306 0.722 0.54 c 0.24 0.304 0.378 0.686 0.378 1.091 v 6.466 c 0.0 0.717 -0.434 1.363 -1.1 1.63 l -5.0 2.011 C 8.443 14.958 8.222 15.0 8.0 15.0 c -0.221 0.0 -0.442 -0.042 -0.65 -0.126 l -5.0 -2.01 c -0.666 -0.268 -1.1 -0.914 -1.1 -1.631 V 4.767 c 0.0 -0.405 0.138 -0.787 0.378 -1.09 c 0.185 -0.235 0.432 -0.424 0.721 -0.54 l 5.0 -2.011 Z")
        )
    }.build()
}
