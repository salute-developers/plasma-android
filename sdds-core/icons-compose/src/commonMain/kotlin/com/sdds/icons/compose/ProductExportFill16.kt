package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProductExportFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProductExportFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.55 2.43 L 8.7 1.37 C 8.44 1.22 8.14 1.21 7.87 1.32 L 7.76 1.37 L 2.65 4.29 L 5.0 5.56 l 5.55 -3.13 Z M 5.97 6.09 L 8.2 7.3 l 5.66 -2.98 l -2.36 -1.35 l -5.53 3.12 Z M 5.0 9.39 c -0.27 0.0 -0.47 -0.21 -0.47 -0.47 V 6.37 L 2.0 5.0 v 5.96 c 0.0 0.35 0.19 0.68 0.5 0.85 l 5.12 2.83 c 0.04 0.02 0.07 0.04 0.11 0.06 v -1.27 C 7.58 12.98 7.5 12.5 7.5 12.0 c 0.0 -0.51 0.08 -0.99 0.23 -1.44 V 8.1 L 5.46 6.87 v 2.05 c 0.0 0.26 -0.2 0.47 -0.46 0.47 Z m 9.43 -1.18 C 13.73 7.76 12.89 7.5 12.0 7.5 c -1.33 0.0 -2.51 0.56 -3.34 1.47 V 8.11 l 5.77 -3.03 v 3.13 Z M 8.25 12.0 c 0.0 -2.08 1.67 -3.75 3.75 -3.75 c 2.07 0.0 3.75 1.67 3.75 3.75 c 0.0 2.07 -1.68 3.75 -3.75 3.75 c -2.08 0.0 -3.75 -1.68 -3.75 -3.75 Z m 3.84 -1.46 c -0.14 -0.14 -0.14 -0.36 0.0 -0.5 s 0.35 -0.14 0.49 0.0 l 1.71 1.71 c 0.07 0.07 0.1 0.15 0.1 0.24 c 0.0 0.05 -0.01 0.1 -0.03 0.14 c -0.01 0.04 -0.04 0.08 -0.07 0.11 l -1.71 1.71 c -0.14 0.14 -0.35 0.14 -0.49 0.0 s -0.14 -0.36 0.0 -0.5 l 1.11 -1.11 H 9.95 c -0.2 0.0 -0.35 -0.15 -0.35 -0.35 c 0.0 -0.19 0.15 -0.35 0.35 -0.35 h 3.25 l -1.11 -1.1 Z")
        )
    }.build()
}
