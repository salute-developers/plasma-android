package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WarningTriangleFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WarningTriangleFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.71 8.39 c 1.46 -2.53 5.11 -2.53 6.57 0.0 l 9.2 15.94 c 1.46 2.53 -0.36 5.69 -3.28 5.69 H 8.79 c -2.92 0.0 -4.74 -3.16 -3.28 -5.69 l 9.2 -15.94 Z m 4.6 1.13 c -0.58 -1.01 -2.05 -1.01 -2.63 0.0 l -9.2 15.94 c -0.58 1.01 0.15 2.28 1.32 2.28 h 18.4 c 1.16 0.0 1.89 -1.27 1.31 -2.28 l -9.2 -15.94 Z M 18.0 11.8 l -7.89 13.66 h 15.77 L 18.0 11.8 Z")
        )
    }.build()
}
