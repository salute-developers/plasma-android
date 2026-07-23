package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CubeFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CubeFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.62 3.329 c 0.88 -0.35 1.87 -0.35 2.75 0.0 l 10.8 4.33 c 0.61 0.25 1.13 0.64 1.52 1.14 c 0.12 0.14 0.22 0.29 0.31 0.44 l -14.01 5.69 L 4.0 9.239 c 0.08 -0.15 0.18 -0.3 0.3 -0.44 c 0.39 -0.5 0.91 -0.89 1.52 -1.14 l 10.8 -4.33 Z M 3.5 11.199 v 13.83 c 0.0 1.51 0.91 2.88 2.32 3.44 l 10.8 4.33 c 0.12 0.05 0.25 0.09 0.37 0.13 v -16.25 L 3.5 11.199 Z m 15.49 21.73 c 0.13 -0.04 0.26 -0.08 0.38 -0.13 l 10.8 -4.33 c 1.41 -0.56 2.33 -1.93 2.33 -3.44 v -13.83 l -13.51 5.48 v 16.25 Z")
        )
    }.build()
}
