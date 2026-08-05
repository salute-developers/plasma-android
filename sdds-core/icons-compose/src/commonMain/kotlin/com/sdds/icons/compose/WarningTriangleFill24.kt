package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WarningTriangleFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WarningTriangleFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.16 5.75 c -0.96 -1.67 -3.37 -1.67 -4.33 0.0 l -6.06 10.5 C 2.81 17.91 4.01 20.0 5.93 20.0 h 12.13 c 1.92 0.0 3.12 -2.09 2.16 -3.75 l -6.06 -10.5 Z M 12.85 6.5 c -0.38 -0.67 -1.34 -0.67 -1.73 0.0 L 5.06 17.0 c -0.39 0.66 0.1 1.5 0.87 1.5 h 12.12 c 0.77 0.0 1.25 -0.84 0.87 -1.5 L 12.85 6.5 Z M 11.99 8.0 l -5.2 9.0 h 10.39 l -5.19 -9.0 Z")
        )
    }.build()
}
