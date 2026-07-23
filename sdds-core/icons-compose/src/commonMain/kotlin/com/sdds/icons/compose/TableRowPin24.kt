package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableRowPin24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableRowPin24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 3.0 c 1.65 0.0 3.0 1.34 3.0 3.0 v 6.02 c -0.47 -0.3 -0.97 -0.54 -1.5 -0.71 V 10.0 h -4.0 v 1.31 c -0.54 0.17 -1.04 0.41 -1.5 0.71 V 10.0 h -4.0 v 4.0 h 2.02 c -0.3 0.46 -0.54 0.96 -0.71 1.5 H 10.0 v 4.0 h 1.31 c 0.17 0.53 0.41 1.03 0.71 1.5 H 6.0 c -1.66 0.0 -3.0 -1.35 -3.0 -3.0 V 6.0 c 0.0 -1.66 1.34 -3.0 3.0 -3.0 h 12.0 Z m 1.5 3.0 c 0.0 -0.83 -0.68 -1.5 -1.5 -1.5 H 6.0 C 5.17 4.5 4.5 5.17 4.5 6.0 v 2.5 h 15.0 V 6.0 Z m -15.0 4.0 v 4.0 h 4.0 v -4.0 h -4.0 Z m 13.0 2.0 c 3.03 0.0 5.5 2.46 5.5 5.5 c 0.0 3.03 -2.47 5.5 -5.5 5.5 c -3.04 0.0 -5.5 -2.47 -5.5 -5.5 c 0.0 -3.04 2.46 -5.5 5.5 -5.5 Z m 2.18 1.67 c -0.36 -0.36 -0.94 -0.39 -1.33 -0.07 c -0.39 0.39 -1.1 1.08 -1.57 1.56 c -0.42 -0.1 -0.82 -0.13 -1.22 -0.07 c -0.38 0.06 -0.73 0.21 -1.05 0.45 l -0.14 0.1 c -0.39 0.32 -0.35 0.86 -0.05 1.16 l 1.56 1.55 l -1.42 1.41 c -0.2 0.2 -0.2 0.52 0.0 0.71 c 0.19 0.2 0.51 0.2 0.7 0.0 l 1.42 -1.42 l 1.56 1.56 c 0.28 0.28 0.77 0.34 1.09 0.02 c 0.6 -0.73 0.75 -1.59 0.54 -2.48 c 0.47 -0.47 1.1 -1.1 1.49 -1.48 c 0.32 -0.4 0.36 -1.05 0.0 -1.42 l -1.58 -1.58 Z m 0.87 2.29 l -1.56 1.57 c -0.16 0.2 -0.27 0.54 -0.21 0.77 c 0.15 0.6 0.12 1.03 -0.12 1.42 c -1.29 -1.29 -2.38 -2.39 -3.45 -3.45 c 0.17 -0.1 0.34 -0.16 0.51 -0.19 c 0.25 -0.04 0.54 -0.02 0.91 0.07 l 0.1 0.02 c 0.21 0.03 0.42 -0.02 0.6 -0.15 l 1.64 -1.64 l 1.58 1.58 Z M 8.5 19.5 v -4.0 h -4.0 V 18.0 c 0.0 0.82 0.67 1.5 1.5 1.5 h 2.5 Z")
        )
    }.build()
}
