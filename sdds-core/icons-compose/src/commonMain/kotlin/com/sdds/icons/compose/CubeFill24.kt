package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CubeFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CubeFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.084 2.0 c 0.58 -0.24 1.24 -0.24 1.83 0.0 l 7.2 2.88 c 0.41 0.16 0.76 0.42 1.02 0.76 c 0.07 0.08 0.14 0.18 0.2 0.27 l -9.34 3.8 l -9.33 -3.79 c 0.06 -0.1 0.12 -0.19 0.19 -0.28 c 0.27 -0.34 0.62 -0.6 1.03 -0.76 l 7.2 -2.88 Z m -8.76 5.4 v 9.04 c 0.0 1.01 0.61 1.92 1.56 2.29 l 7.2 2.88 c 0.05 0.03 0.1 0.05 0.16 0.06 V 11.02 L 2.324 7.4 Z m 10.42 14.28 c 0.06 -0.02 0.12 -0.04 0.17 -0.07 l 7.2 -2.88 c 0.94 -0.37 1.56 -1.28 1.56 -2.29 V 7.39 l -8.93 3.63 v 10.66 Z")
        )
    }.build()
}
