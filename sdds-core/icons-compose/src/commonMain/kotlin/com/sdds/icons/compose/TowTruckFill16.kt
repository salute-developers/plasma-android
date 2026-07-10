package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TowTruckFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TowTruckFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.03 2.5 C 6.2 2.47 6.38 2.53 6.49 2.67 l 3.08 3.5 c 0.08 0.1 0.12 0.21 0.12 0.33 v 1.61 h 0.2 V 4.75 c 0.0 -0.28 0.22 -0.5 0.5 -0.5 h 2.73 c 0.21 0.0 0.4 0.06 0.57 0.18 c 0.17 0.11 0.3 0.28 0.37 0.46 V 4.9 l 0.9 2.3 C 15.0 7.29 15.0 7.38 14.99 7.47 C 14.99 7.5 15.0 7.53 15.0 7.56 v 3.33 c 0.0 0.27 -0.11 0.53 -0.3 0.72 c -0.19 0.19 -0.45 0.31 -0.72 0.31 h -1.1 c -0.22 0.9 -1.01 1.58 -1.98 1.58 c -0.96 0.0 -1.76 -0.68 -1.98 -1.58 H 5.7 c -0.22 0.9 -1.02 1.58 -1.98 1.58 c -0.98 0.0 -1.79 -0.7 -1.99 -1.62 c -0.17 -0.05 -0.32 -0.14 -0.44 -0.27 C 1.1 11.42 1.0 11.16 1.0 10.89 V 9.14 c 0.0 -0.27 0.1 -0.53 0.29 -0.73 c 0.19 -0.19 0.45 -0.3 0.72 -0.3 h 6.68 V 6.69 L 5.92 3.54 L 4.38 3.8 L 4.26 4.96 c 0.4 0.23 0.64 0.7 0.64 1.16 c 0.0 0.64 -0.46 1.3 -1.18 1.3 c -0.54 0.0 -1.01 -0.38 -1.16 -0.88 c -0.08 -0.27 0.07 -0.55 0.33 -0.63 c 0.26 -0.08 0.54 0.07 0.62 0.34 c 0.04 0.11 0.15 0.17 0.21 0.17 c 0.02 0.0 0.06 0.0 0.1 -0.05 C 3.86 6.31 3.9 6.23 3.9 6.12 c 0.0 -0.1 -0.04 -0.19 -0.08 -0.24 c -0.04 -0.05 -0.08 -0.06 -0.1 -0.06 c -0.14 0.0 -0.28 -0.06 -0.37 -0.16 c -0.1 -0.11 -0.14 -0.25 -0.13 -0.39 l 0.2 -1.91 C 3.45 3.16 3.59 3.0 3.77 2.94 C 3.83 2.9 3.9 2.87 3.98 2.85 L 6.03 2.5 Z m -3.35 8.92 v 0.01 c 0.0 0.6 0.48 1.07 1.04 1.07 s 1.04 -0.48 1.04 -1.08 c 0.0 -0.61 -0.48 -1.08 -1.04 -1.08 s -1.04 0.46 -1.04 1.07 v 0.01 Z m 9.26 -0.02 c -0.01 -0.6 -0.48 -1.06 -1.04 -1.06 s -1.04 0.47 -1.04 1.08 c 0.0 0.6 0.48 1.08 1.04 1.08 s 1.03 -0.47 1.04 -1.07 v -0.01 v -0.02 Z")
        )
    }.build()
}
