package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableRowPin16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableRowPin16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.15 1.75 c 1.16 0.0 2.1 0.94 2.1 2.1 V 8.1 c -0.32 -0.18 -0.65 -0.33 -1.0 -0.43 V 6.61 h -2.83 v 1.17 C 10.05 7.92 9.7 8.1 9.38 8.33 V 6.61 H 6.61 v 2.77 h 1.72 C 8.1 9.7 7.91 10.05 7.78 10.43 H 6.61 v 2.82 h 1.06 c 0.1 0.35 0.25 0.68 0.43 1.0 H 3.84 c -1.16 0.0 -2.09 -0.95 -2.09 -2.11 V 3.85 c 0.0 -1.16 0.93 -2.1 2.09 -2.1 h 8.31 Z m 1.1 2.1 c 0.0 -0.61 -0.5 -1.1 -1.1 -1.1 H 3.84 c -0.6 0.0 -1.09 0.49 -1.09 1.1 v 1.71 h 10.5 V 3.85 Z M 5.57 6.61 H 2.75 v 2.77 h 2.82 V 6.61 Z M 12.0 8.25 c 2.07 0.0 3.75 1.67 3.75 3.75 c 0.0 2.07 -1.68 3.75 -3.75 3.75 c -2.08 0.0 -3.75 -1.68 -3.75 -3.75 c 0.0 -2.08 1.67 -3.75 3.75 -3.75 Z m 1.36 1.15 c -0.24 -0.24 -0.61 -0.27 -0.88 -0.09 L 12.37 9.4 l -1.04 1.04 c -0.29 -0.07 -0.58 -0.09 -0.85 -0.05 c -0.23 0.04 -0.44 0.12 -0.64 0.25 l -0.2 0.14 C 9.37 11.0 9.4 11.38 9.61 11.59 l 1.08 1.08 l -0.99 0.99 c -0.13 0.14 -0.13 0.36 0.0 0.5 c 0.14 0.13 0.36 0.13 0.5 0.0 l 0.99 -0.99 l 1.09 1.09 c 0.18 0.12 0.53 0.2 0.72 0.05 c 0.41 -0.51 0.57 -1.15 0.42 -1.77 l 1.04 -1.04 c 0.28 -0.28 0.28 -0.72 0.0 -1.0 l -1.1 -1.1 Z m 0.61 1.6 l -1.1 1.1 c -0.1 0.14 -0.18 0.38 -0.14 0.54 l 0.04 0.18 c 0.06 0.33 0.02 0.58 -0.12 0.82 c -0.9 -0.91 -1.67 -1.68 -2.42 -2.42 c 0.12 -0.08 0.24 -0.12 0.36 -0.14 c 0.17 -0.03 0.38 -0.01 0.63 0.06 c 0.17 0.02 0.42 -0.02 0.55 -0.15 l 1.1 -1.1 l 1.1 1.11 Z m -8.4 -0.57 H 2.75 v 1.71 c 0.0 0.61 0.49 1.11 1.09 1.11 h 1.73 v -2.82 Z")
        )
    }.build()
}
