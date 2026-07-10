package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DeliveryFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DeliveryFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.55 3.97 C 3.7 3.58 4.13 3.39 4.52 3.55 l 2.05 0.82 c 0.12 0.05 0.24 0.11 0.35 0.19 c 0.11 0.07 0.21 0.16 0.3 0.26 s 0.17 0.21 0.23 0.32 C 7.51 5.26 7.56 5.38 7.6 5.51 l 2.07 7.24 c 0.05 0.16 0.11 0.32 0.19 0.46 c 0.06 0.11 0.13 0.22 0.21 0.32 c 0.08 0.1 0.17 0.2 0.26 0.28 c 0.12 0.1 0.24 0.19 0.38 0.27 c 0.13 0.08 0.27 0.14 0.41 0.19 c 0.13 0.04 0.25 0.07 0.38 0.09 c 0.13 0.02 0.26 0.02 0.38 0.02 c 0.17 0.0 0.33 -0.02 0.5 -0.07 l 7.18 -1.79 c 0.41 -0.1 0.81 0.14 0.91 0.54 c 0.11 0.41 -0.14 0.81 -0.54 0.91 l -7.19 1.8 c -0.26 0.06 -0.52 0.1 -0.78 0.11 c -0.23 0.01 -0.45 -0.01 -0.67 -0.04 c -0.23 -0.03 -0.45 -0.08 -0.66 -0.16 c -0.23 -0.07 -0.46 -0.18 -0.67 -0.3 c -0.22 -0.13 -0.42 -0.27 -0.61 -0.43 c -0.16 -0.15 -0.32 -0.31 -0.46 -0.49 s -0.26 -0.37 -0.37 -0.56 c -0.12 -0.24 -0.22 -0.48 -0.29 -0.74 L 6.16 5.92 C 6.15 5.88 6.04 5.79 6.01 5.76 L 3.97 4.94 C 3.58 4.79 3.39 4.36 3.55 3.97 Z m 7.33 2.96 l 4.06 -1.09 c 1.07 -0.29 2.16 0.35 2.45 1.41 l 0.72 2.7 c 0.29 1.07 -0.34 2.17 -1.41 2.45 l -4.06 1.09 c -1.07 0.29 -2.17 -0.34 -2.45 -1.41 l -0.73 -2.7 c -0.28 -1.07 0.35 -2.17 1.42 -2.45 Z M 6.25 18.25 c 0.0 -1.39 1.11 -2.5 2.5 -2.5 c 1.38 0.0 2.5 1.11 2.5 2.5 c 0.0 1.38 -1.12 2.5 -2.5 2.5 c -1.39 0.0 -2.5 -1.12 -2.5 -2.5 Z")
        )
    }.build()
}
