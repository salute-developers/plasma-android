package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableRowPinFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableRowPinFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.5 3.04 h 13.0 c 1.38 0.0 2.5 1.12 2.5 2.5 v 2.5 H 3.0 v -2.5 c 0.0 -1.38 1.11 -2.5 2.5 -2.5 Z M 8.0 9.54 v 5.0 H 3.0 v -5.0 h 5.0 Z m 3.7 5.0 c 0.62 -1.2 1.6 -2.19 2.8 -2.81 V 9.54 h -5.0 v 5.0 h 2.2 Z m 9.3 -2.52 V 9.54 h -5.0 v 1.63 c 0.48 -0.11 0.98 -0.18 1.5 -0.18 c 1.28 0.0 2.49 0.38 3.5 1.03 Z m -3.5 -0.03 c 3.03 0.0 5.5 2.47 5.5 5.5 c 0.0 3.04 -2.47 5.5 -5.5 5.5 c -3.04 0.0 -5.5 -2.46 -5.5 -5.5 c 0.0 -3.03 2.46 -5.5 5.5 -5.5 Z m 2.18 1.68 c -0.36 -0.36 -0.94 -0.39 -1.33 -0.07 c -0.39 0.39 -1.1 1.08 -1.57 1.56 c -0.42 -0.1 -0.82 -0.13 -1.22 -0.07 c -0.38 0.06 -0.73 0.21 -1.05 0.44 l -0.14 0.11 c -0.39 0.32 -0.35 0.86 -0.05 1.16 l 1.56 1.55 l -1.42 1.41 c -0.2 0.2 -0.2 0.52 0.0 0.71 c 0.19 0.2 0.51 0.2 0.7 0.0 l 1.42 -1.42 l 1.56 1.56 c 0.28 0.28 0.77 0.34 1.09 0.02 c 0.6 -0.73 0.75 -1.59 0.54 -2.48 c 0.47 -0.47 1.1 -1.1 1.49 -1.48 c 0.32 -0.4 0.36 -1.05 0.0 -1.42 l -1.58 -1.58 Z m 0.87 2.29 l -1.56 1.57 c -0.16 0.2 -0.27 0.54 -0.21 0.77 c 0.15 0.6 0.12 1.03 -0.12 1.42 c -1.29 -1.29 -2.38 -2.39 -3.45 -3.45 c 0.17 -0.1 0.34 -0.16 0.51 -0.19 c 0.25 -0.04 0.54 -0.02 0.91 0.07 l 0.1 0.02 c 0.21 0.03 0.42 -0.02 0.6 -0.15 l 1.64 -1.64 l 1.58 1.58 Z M 3.0 16.04 h 5.0 v 5.0 H 5.5 c -1.39 0.0 -2.5 -1.11 -2.5 -2.5 v -2.5 Z m 8.16 0.0 H 9.5 v 5.0 h 2.55 C 11.38 20.02 11.0 18.8 11.0 17.49 c 0.0 -0.49 0.05 -0.98 0.16 -1.45 Z")
        )
    }.build()
}
