package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlaskFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlaskFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 22.5 13.12 V 5.0 H 24.0 c 0.56 0.0 1.0 -0.44 1.0 -1.0 c 0.0 -0.57 -0.44 -1.0 -1.0 -1.0 H 12.0 c -0.56 0.0 -1.0 0.43 -1.0 1.0 c 0.0 0.56 0.44 1.0 1.0 1.0 h 1.5 v 8.12 c 0.0 0.25 -0.07 0.49 -0.18 0.71 L 5.38 28.57 C 4.3 30.57 5.75 33.0 8.02 33.0 h 19.95 c 2.27 0.0 3.72 -2.43 2.64 -4.43 l -7.94 -14.74 c -0.11 -0.22 -0.17 -0.46 -0.17 -0.71 Z")
        )
    }.build()
}
