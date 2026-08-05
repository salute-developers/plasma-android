package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ThermometerFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ThermometerFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.25 8.0 c 0.0 -2.77 2.23 -5.0 5.0 -5.0 c 2.76 0.0 5.0 2.23 5.0 5.0 v 10.18 c 1.97 1.51 3.25 3.89 3.25 6.57 c 0.0 4.55 -3.7 8.25 -8.25 8.25 c -4.56 0.0 -8.25 -3.7 -8.25 -8.25 c 0.0 -2.68 1.27 -5.06 3.25 -6.57 V 8.0 Z m 9.15 16.75 c 0.0 -1.95 -1.35 -3.59 -3.15 -4.03 v -8.47 c 0.0 -0.57 -0.44 -1.0 -1.0 -1.0 c -0.57 0.0 -1.0 0.43 -1.0 1.0 v 8.47 c -1.81 0.44 -3.16 2.08 -3.16 4.03 c 0.0 2.29 1.86 4.15 4.16 4.15 c 2.29 0.0 4.15 -1.86 4.15 -4.15 Z m -6.31 0.0 c 0.0 -1.19 0.97 -2.15 2.16 -2.15 c 1.18 0.0 2.15 0.96 2.15 2.15 c 0.0 1.18 -0.97 2.15 -2.15 2.15 c -1.19 0.0 -2.16 -0.97 -2.16 -2.15 Z")
        )
    }.build()
}
