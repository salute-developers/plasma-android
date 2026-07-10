package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DeliveryFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DeliveryFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.03 2.31 c 0.1 -0.26 0.39 -0.38 0.65 -0.28 L 4.13 2.6 C 4.22 2.63 4.3 2.68 4.37 2.73 c 0.08 0.05 0.15 0.11 0.21 0.18 c 0.06 0.07 0.11 0.14 0.16 0.22 c 0.04 0.08 0.08 0.16 0.1 0.25 l 1.48 5.06 c 0.03 0.11 0.07 0.22 0.13 0.32 c 0.04 0.08 0.09 0.16 0.15 0.23 s 0.12 0.14 0.19 0.2 c 0.08 0.07 0.17 0.13 0.26 0.19 c 0.1 0.05 0.2 0.1 0.3 0.13 c 0.08 0.03 0.17 0.05 0.27 0.06 c 0.09 0.02 0.17 0.02 0.26 0.02 c 0.12 0.0 0.24 -0.02 0.35 -0.05 l 5.15 -1.26 c 0.27 -0.06 0.53 0.1 0.6 0.37 c 0.07 0.27 -0.09 0.54 -0.37 0.6 l -5.14 1.27 c -0.18 0.04 -0.36 0.06 -0.54 0.07 c -0.15 0.0 -0.31 0.0 -0.46 -0.03 c -0.16 -0.02 -0.31 -0.06 -0.45 -0.11 c -0.16 -0.05 -0.32 -0.12 -0.47 -0.21 c -0.15 -0.08 -0.29 -0.18 -0.41 -0.29 c -0.12 -0.11 -0.23 -0.22 -0.32 -0.34 c -0.1 -0.12 -0.19 -0.25 -0.26 -0.39 c -0.08 -0.16 -0.15 -0.33 -0.21 -0.5 L 3.88 3.66 c 0.0 -0.03 -0.09 -0.11 -0.12 -0.13 L 2.31 2.96 c -0.26 -0.1 -0.38 -0.39 -0.28 -0.65 Z m 5.15 2.06 L 10.1 3.6 c 0.75 -0.2 1.52 0.25 1.73 1.0 l 0.51 1.87 c 0.2 0.75 -0.24 1.51 -0.99 1.71 L 8.43 8.94 C 7.68 9.14 6.91 8.7 6.71 7.95 L 6.2 6.08 C 6.0 5.33 6.44 4.57 7.18 4.37 Z m -3.27 7.88 c 0.0 -0.96 0.8 -1.74 1.78 -1.74 s 1.77 0.78 1.77 1.74 s -0.79 1.74 -1.77 1.74 s -1.78 -0.78 -1.78 -1.74 Z")
        )
    }.build()
}
