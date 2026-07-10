package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GlobeFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GlobeFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.04 5.21 H 1.58 c 0.98 -2.26 3.13 -3.9 5.68 -4.17 c -0.04 0.05 -0.08 0.09 -0.12 0.14 c -0.28 0.35 -0.65 0.86 -1.02 1.5 c -0.4 0.69 -0.8 1.54 -1.08 2.53 Z m 3.81 -4.03 C 8.81 1.13 8.77 1.09 8.73 1.04 c 2.55 0.27 4.7 1.91 5.68 4.17 h -3.46 c -0.28 -0.99 -0.68 -1.84 -1.08 -2.53 c -0.37 -0.64 -0.74 -1.15 -1.02 -1.5 Z M 8.96 3.2 c 0.32 0.57 0.65 1.24 0.9 2.01 H 6.13 c 0.25 -0.77 0.58 -1.44 0.9 -2.01 c 0.34 -0.58 0.68 -1.05 0.93 -1.36 L 8.0 1.8 l 0.03 0.04 C 8.28 2.15 8.62 2.62 8.96 3.2 Z M 4.79 9.75 H 1.21 C 1.07 9.19 1.0 8.61 1.0 8.0 c 0.0 -0.6 0.07 -1.18 0.21 -1.74 h 3.58 C 4.69 6.81 4.63 7.39 4.63 8.0 c 0.0 0.61 0.06 1.2 0.16 1.75 Z M 5.68 8.0 c 0.0 -0.61 0.07 -1.19 0.18 -1.74 h 4.27 c 0.11 0.55 0.18 1.13 0.18 1.74 c 0.0 0.62 -0.07 1.2 -0.18 1.75 H 5.86 C 5.75 9.2 5.68 8.62 5.68 8.0 Z m 5.52 -1.74 h 3.58 C 14.92 6.82 15.0 7.4 15.0 8.0 c 0.0 0.61 -0.08 1.19 -0.22 1.75 H 11.2 C 11.3 9.2 11.36 8.61 11.36 8.0 c 0.0 -0.61 -0.06 -1.19 -0.16 -1.74 Z m -4.06 8.56 c 0.04 0.05 0.08 0.1 0.12 0.14 c -2.55 -0.26 -4.7 -1.9 -5.68 -4.16 h 3.46 c 0.28 0.98 0.68 1.84 1.08 2.53 c 0.37 0.64 0.74 1.15 1.02 1.49 Z M 7.03 12.8 c -0.32 -0.56 -0.65 -1.24 -0.9 -2.0 h 3.73 c -0.25 0.76 -0.58 1.44 -0.9 2.0 c -0.34 0.59 -0.68 1.05 -0.93 1.37 L 8.0 14.21 l -0.04 -0.04 c -0.25 -0.32 -0.59 -0.78 -0.93 -1.37 Z m 3.92 -2.0 h 3.46 c -0.98 2.26 -3.13 3.9 -5.68 4.16 c 0.04 -0.04 0.08 -0.09 0.12 -0.14 c 0.28 -0.34 0.65 -0.85 1.02 -1.49 c 0.4 -0.69 0.8 -1.55 1.08 -2.53 Z")
        )
    }.build()
}
