package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CubeFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CubeFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.34 1.164 c 0.42 -0.17 0.89 -0.17 1.31 0.0 l 5.0 2.01 c 0.28 0.12 0.53 0.31 0.72 0.54 L 8.0 6.414 l -6.44 -2.62 c 0.19 -0.23 0.5 -0.5 0.78 -0.62 l 5.0 -2.01 Z m -6.09 3.58 v 6.53 c 0.0 0.71 0.43 1.36 1.09 1.63 l 5.0 2.01 c 0.06 0.02 0.11 0.04 0.16 0.05 v -7.67 l -6.25 -2.55 Z m 7.25 10.22 c 0.05 -0.02 0.1 -0.03 0.15 -0.05 l 5.0 -2.01 c 0.66 -0.27 1.1 -0.92 1.1 -1.63 v -6.47 L 8.5 7.294 v 7.67 Z")
        )
    }.build()
}
