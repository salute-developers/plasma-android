package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ThermometerFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ThermometerFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.6 2.836 c -0.58 -0.58 -1.45 -0.86 -2.6 -0.86 c -0.49 0.0 -0.93 0.08 -1.34 0.25 c -0.41 0.17 -0.78 0.42 -1.12 0.76 c -0.34 0.34 -0.6 0.72 -0.77 1.13 c -0.17 0.41 -0.25 0.85 -0.25 1.33 v 6.24 c -0.71 0.52 -1.25 1.13 -1.62 1.83 c -0.44 0.8 -0.65 1.72 -0.65 2.76 c 0.0 0.79 0.14 1.52 0.42 2.2 c 0.28 0.68 0.7 1.3 1.26 1.86 s 1.18 0.98 1.86 1.26 c 0.68 0.28 1.41 0.43 2.21 0.43 c 0.79 0.0 1.52 -0.15 2.2 -0.43 c 0.68 -0.28 1.3 -0.7 1.86 -1.26 s 0.98 -1.18 1.26 -1.86 c 0.28 -0.68 0.43 -1.41 0.43 -2.2 c 0.0 -1.04 -0.22 -1.96 -0.66 -2.76 c -0.37 -0.7 -0.91 -1.31 -1.62 -1.83 v -6.24 c 0.0 -1.16 -0.29 -2.03 -0.87 -2.61 Z m -0.1 13.44 c 0.0 -1.12 -0.74 -2.07 -1.75 -2.39 v -5.94 c 0.0 -0.42 -0.34 -0.75 -0.75 -0.75 c -0.42 0.0 -0.75 0.33 -0.75 0.75 v 5.94 c -1.02 0.32 -1.75 1.27 -1.75 2.39 c 0.0 1.38 1.11 2.5 2.5 2.5 c 1.38 0.0 2.5 -1.12 2.5 -2.5 Z m -3.5 0.0 c 0.0 -0.56 0.44 -1.0 1.0 -1.0 c 0.55 0.0 1.0 0.44 1.0 1.0 c 0.0 0.55 -0.45 1.0 -1.0 1.0 c -0.56 0.0 -1.0 -0.45 -1.0 -1.0 Z")
        )
    }.build()
}
