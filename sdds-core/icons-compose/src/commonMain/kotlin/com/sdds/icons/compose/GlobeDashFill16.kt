package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GlobeDashFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GlobeDashFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.04 5.15 H 1.58 c 0.98 -2.26 3.13 -3.9 5.68 -4.17 c -0.04 0.05 -0.08 0.09 -0.12 0.14 c -0.28 0.35 -0.65 0.86 -1.02 1.5 c -0.4 0.69 -0.8 1.54 -1.08 2.53 Z m 3.81 -4.03 C 8.81 1.07 8.77 1.03 8.73 0.98 c 1.66 0.18 3.15 0.93 4.26 2.06 l 0.82 -0.82 c 0.2 -0.19 0.51 -0.19 0.71 0.0 c 0.19 0.2 0.19 0.51 0.0 0.71 l -0.88 0.88 l -1.33 1.34 l -1.06 1.05 l -0.98 0.97 l -2.51 2.52 l -1.05 1.05 l -0.43 0.43 l -0.8 0.8 l -1.62 1.62 l -1.01 1.01 c -0.2 0.2 -0.51 0.2 -0.71 0.0 c -0.2 -0.2 -0.2 -0.51 0.0 -0.71 l 0.95 -0.95 c -0.63 -0.63 -1.15 -1.37 -1.51 -2.2 h 3.46 l 0.06 0.2 l 1.24 -1.25 H 5.86 C 5.75 9.14 5.68 8.56 5.68 7.94 c 0.0 -0.61 0.07 -1.19 0.18 -1.74 h 3.97 l 1.11 -1.11 c -0.29 -0.96 -0.68 -1.79 -1.07 -2.47 c -0.37 -0.64 -0.74 -1.15 -1.02 -1.5 Z m 0.11 2.02 c 0.32 0.57 0.65 1.24 0.9 2.01 H 6.13 c 0.25 -0.77 0.58 -1.44 0.9 -2.01 c 0.34 -0.58 0.68 -1.05 0.93 -1.36 c 0.25 0.31 0.66 0.78 1.0 1.36 Z m 4.76 2.01 l 0.47 -0.47 c 0.08 0.15 0.15 0.31 0.22 0.47 h -0.69 Z M 4.79 9.69 H 1.21 C 1.07 9.13 1.0 8.55 1.0 7.94 c 0.0 -0.6 0.07 -1.18 0.21 -1.74 h 3.58 c -0.1 0.55 -0.16 1.13 -0.16 1.74 c 0.0 0.61 0.06 1.2 0.16 1.75 Z m 6.56 -2.17 l 1.32 -1.32 h 2.11 C 14.92 6.76 15.0 7.34 15.0 7.94 c 0.0 0.61 -0.08 1.19 -0.22 1.75 H 11.2 c 0.1 -0.55 0.16 -1.14 0.16 -1.75 c 0.0 -0.14 -0.01 -0.28 -0.01 -0.42 Z M 9.18 9.69 l 1.1 -1.11 c -0.02 0.38 -0.08 0.75 -0.15 1.11 H 9.18 Z m -2.47 2.46 l 1.42 -1.41 h 1.73 c -0.25 0.76 -0.58 1.44 -0.9 2.0 c -0.34 0.59 -0.68 1.05 -0.93 1.37 c -0.25 -0.32 -0.66 -0.78 -1.0 -1.37 c -0.11 -0.18 -0.21 -0.38 -0.32 -0.59 Z m 4.24 -1.41 h 3.46 c -0.98 2.26 -3.13 3.9 -5.68 4.16 c 0.04 -0.04 0.08 -0.09 0.12 -0.14 c 0.28 -0.34 0.65 -0.85 1.02 -1.49 c 0.4 -0.69 0.8 -1.55 1.08 -2.53 Z m -6.22 3.4 l 1.21 -1.21 c 0.06 0.12 0.12 0.23 0.18 0.34 c 0.37 0.64 0.74 1.15 1.02 1.49 c 0.04 0.05 0.08 0.1 0.12 0.14 c -0.91 -0.09 -1.76 -0.36 -2.53 -0.76 Z")
        )
    }.build()
}
