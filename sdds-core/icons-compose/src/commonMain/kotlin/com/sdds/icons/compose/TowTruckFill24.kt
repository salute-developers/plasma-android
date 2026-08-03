package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TowTruckFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TowTruckFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.12 4.26 C 9.37 4.21 9.63 4.3 9.8 4.49 l 4.5 5.0 c 0.13 0.14 0.2 0.32 0.2 0.51 v 2.25 h 0.25 V 7.5 c 0.0 -0.42 0.33 -0.75 0.75 -0.75 h 3.99 c 0.3 0.0 0.59 0.08 0.84 0.25 c 0.24 0.17 0.44 0.41 0.55 0.68 v 0.01 l 1.31 3.28 c 0.06 0.13 0.07 0.27 0.05 0.4 c 0.0 0.04 0.01 0.08 0.01 0.13 v 4.75 c 0.0 0.39 -0.16 0.77 -0.44 1.06 c -0.29 0.28 -0.67 0.44 -1.06 0.44 h -1.6 c -0.33 1.29 -1.51 2.25 -2.9 2.25 c -1.4 0.0 -2.58 -0.96 -2.91 -2.25 H 8.65 C 8.32 19.04 7.14 20.0 5.75 20.0 c -1.42 0.0 -2.61 -0.99 -2.92 -2.32 c -0.25 -0.07 -0.47 -0.19 -0.65 -0.37 c -0.28 -0.29 -0.43 -0.67 -0.43 -1.06 v -2.5 c 0.0 -0.4 0.15 -0.78 0.43 -1.07 c 0.29 -0.28 0.67 -0.43 1.07 -0.43 H 13.0 v -1.97 L 8.96 5.8 L 6.73 6.17 l -0.17 1.6 C 7.14 8.1 7.5 8.78 7.5 9.45 c 0.0 0.95 -0.7 1.89 -1.75 1.89 c -0.78 0.0 -1.49 -0.54 -1.72 -1.28 c -0.12 -0.4 0.1 -0.82 0.49 -0.94 c 0.4 -0.13 0.82 0.1 0.94 0.49 c 0.05 0.15 0.2 0.23 0.29 0.23 c 0.03 0.0 0.08 -0.01 0.14 -0.07 C 5.94 9.7 6.0 9.59 6.0 9.45 S 5.94 9.2 5.89 9.14 C 5.83 9.07 5.78 9.06 5.75 9.06 c -0.22 0.0 -0.42 -0.09 -0.56 -0.25 C 5.04 8.65 4.98 8.44 5.0 8.23 l 0.3 -2.72 c 0.03 -0.3 0.24 -0.54 0.52 -0.63 c 0.09 -0.06 0.19 -0.11 0.3 -0.12 l 3.0 -0.5 Z M 5.75 18.5 c -0.83 0.0 -1.5 -0.68 -1.5 -1.5 c 0.0 -0.83 0.67 -1.5 1.5 -1.5 c 0.82 0.0 1.5 0.67 1.5 1.5 c 0.0 0.82 -0.68 1.5 -1.5 1.5 Z m 10.5 -3.0 c -0.83 0.0 -1.5 0.67 -1.5 1.5 c 0.0 0.82 0.67 1.5 1.5 1.5 c 0.82 0.0 1.5 -0.68 1.5 -1.5 c 0.0 -0.83 -0.68 -1.5 -1.5 -1.5 Z")
        )
    }.build()
}
