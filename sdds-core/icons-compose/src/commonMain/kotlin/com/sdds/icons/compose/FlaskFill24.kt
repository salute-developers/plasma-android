package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlaskFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlaskFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.0 8.74 V 3.5 h 1.0 c 0.41 0.0 0.75 -0.33 0.75 -0.75 C 16.75 2.32 16.41 2.0 16.0 2.0 H 8.0 C 7.58 2.0 7.25 2.32 7.25 2.75 C 7.25 3.17 7.58 3.5 8.0 3.5 h 1.0 v 5.24 c 0.0 0.17 -0.05 0.33 -0.12 0.48 l -5.3 9.83 C 2.86 20.38 3.83 22.0 5.34 22.0 h 13.31 c 1.51 0.0 2.48 -1.62 1.76 -2.95 l -5.3 -9.83 C 15.04 9.07 15.0 8.91 15.0 8.74 Z")
        )
    }.build()
}
