package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProductExportFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProductExportFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.78 3.73 L 7.5 8.4 L 4.03 6.52 l 7.61 -4.35 l 0.17 -0.08 c 0.4 -0.17 0.86 -0.14 1.24 0.08 l 2.73 1.56 Z M 9.05 9.24 L 12.3 11.0 l 8.45 -4.43 l -3.45 -1.98 l -8.25 4.65 Z M 6.75 9.7 v 3.8 c 0.0 0.41 0.33 0.75 0.75 0.75 c 0.41 0.0 0.75 -0.34 0.75 -0.75 v -2.99 l 3.3 1.79 v 2.57 C 11.19 15.68 11.0 16.56 11.0 17.5 c 0.0 0.93 0.19 1.81 0.55 2.62 v 2.01 c -0.04 -0.01 -0.08 -0.03 -0.11 -0.05 l -7.69 -4.25 C 3.28 17.57 3.0 17.08 3.0 16.55 V 7.71 L 6.75 9.7 Z m 14.9 2.79 v -4.7 l -8.6 4.52 v 0.45 c 1.16 -1.1 2.72 -1.76 4.45 -1.76 c 1.57 0.0 3.02 0.56 4.15 1.49 Z M 12.0 17.5 c 0.0 -3.04 2.46 -5.5 5.5 -5.5 c 3.03 0.0 5.5 2.46 5.5 5.5 c 0.0 3.03 -2.47 5.5 -5.5 5.5 c -3.04 0.0 -5.5 -2.47 -5.5 -5.5 Z m 5.64 -2.15 c -0.2 -0.2 -0.2 -0.51 0.0 -0.71 c 0.2 -0.2 0.51 -0.2 0.71 0.0 l 2.5 2.5 c 0.1 0.1 0.15 0.22 0.15 0.36 c 0.0 0.13 -0.05 0.25 -0.15 0.35 l -2.5 2.5 c -0.2 0.2 -0.51 0.2 -0.71 0.0 c -0.2 -0.2 -0.2 -0.51 0.0 -0.71 L 19.29 18.0 H 14.5 c -0.28 0.0 -0.5 -0.22 -0.5 -0.5 c 0.0 -0.29 0.22 -0.5 0.5 -0.5 h 4.79 l -1.65 -1.65 Z")
        )
    }.build()
}
