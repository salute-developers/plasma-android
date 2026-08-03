package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableCornerPinFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableCornerPinFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.25 1.75 h 9.5 c 0.82 0.0 1.5 0.67 1.5 1.5 v 2.0 h -9.0 v 9.0 h -2.0 c -0.83 0.0 -1.5 -0.68 -1.5 -1.5 v -9.5 c 0.0 -0.83 0.67 -1.5 1.5 -1.5 Z m 3.0 4.5 h 3.5 V 8.1 C 9.06 8.49 8.49 9.06 8.1 9.75 H 6.25 v -3.5 Z m 8.0 1.85 V 6.25 h -3.5 v 1.42 C 11.14 7.56 11.56 7.5 12.0 7.5 c 0.82 0.0 1.58 0.21 2.25 0.6 Z M 12.0 8.25 c 2.07 0.0 3.75 1.67 3.75 3.75 c 0.0 2.07 -1.68 3.75 -3.75 3.75 c -2.08 0.0 -3.75 -1.68 -3.75 -3.75 c 0.0 -2.08 1.67 -3.75 3.75 -3.75 Z m 1.36 1.15 c -0.24 -0.24 -0.61 -0.27 -0.88 -0.09 L 12.37 9.4 l -1.04 1.04 c -0.29 -0.07 -0.58 -0.09 -0.85 -0.05 c -0.23 0.04 -0.44 0.12 -0.64 0.25 l -0.2 0.14 C 9.37 11.0 9.4 11.38 9.61 11.59 l 1.08 1.08 l -0.99 0.99 c -0.13 0.14 -0.13 0.36 0.0 0.5 c 0.14 0.13 0.36 0.13 0.5 0.0 l 0.99 -0.99 l 1.09 1.09 c 0.18 0.12 0.53 0.2 0.72 0.05 c 0.41 -0.51 0.57 -1.15 0.42 -1.77 l 1.04 -1.04 c 0.28 -0.28 0.28 -0.72 0.0 -1.0 l -1.1 -1.1 Z m 0.61 1.6 l -1.1 1.1 c -0.1 0.14 -0.18 0.38 -0.14 0.54 l 0.04 0.18 c 0.06 0.33 0.02 0.58 -0.12 0.82 c -0.9 -0.91 -1.67 -1.68 -2.42 -2.42 c 0.12 -0.08 0.24 -0.12 0.36 -0.14 c 0.17 -0.03 0.38 -0.01 0.63 0.06 c 0.17 0.02 0.42 -0.02 0.55 -0.15 l 1.1 -1.1 l 1.1 1.11 Z m -6.3 -0.25 H 6.25 v 3.5 H 8.1 C 7.71 13.58 7.5 12.81 7.5 12.0 c 0.0 -0.44 0.06 -0.86 0.17 -1.25 Z")
        )
    }.build()
}
