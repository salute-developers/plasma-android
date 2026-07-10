package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BatteryHoriz20Outline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BatteryHoriz20Outline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 31.5 13.5 c 0.828 0.0 1.5 0.672 1.5 1.5 v 6.0 c 0.0 0.828 -0.672 1.5 -1.5 1.5 h -1.568 c -0.066 0.787 -0.197 1.372 -0.455 1.88 c -0.46 0.902 -1.195 1.637 -2.098 2.097 C 26.352 27.0 25.01 27.0 22.32 27.0 H 10.68 c -2.688 0.0 -4.032 0.0 -5.06 -0.523 c -0.902 -0.46 -1.637 -1.195 -2.097 -2.098 C 3.0 23.352 3.0 22.01 3.0 19.32 v -2.64 c 0.0 -2.688 0.0 -4.032 0.523 -5.06 c 0.46 -0.902 1.195 -1.637 2.098 -2.097 C 6.648 9.0 7.99 9.0 10.68 9.0 h 11.64 c 2.688 0.0 4.032 0.0 5.06 0.523 c 0.902 0.46 1.637 1.195 2.097 2.098 c 0.258 0.507 0.39 1.092 0.455 1.879 H 31.5 Z m -3.75 0.75 c 0.0 -1.657 -1.343 -3.0 -3.0 -3.0 H 8.25 c -1.657 0.0 -3.0 1.343 -3.0 3.0 v 7.5 c 0.0 1.657 1.343 3.0 3.0 3.0 h 16.5 c 1.657 0.0 3.0 -1.343 3.0 -3.0 v -7.5 Z m -21.0 -0.75 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 0.75 C 8.664 12.75 9.0 13.086 9.0 13.5 v 9.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 H 7.5 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 v -9.0 Z m 4.2 -0.75 c -0.414 0.0 -0.75 0.336 -0.75 0.75 v 9.0 c 0.0 0.414 0.336 0.75 0.75 0.75 h 0.75 c 0.414 0.0 0.75 -0.336 0.75 -0.75 v -9.0 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 h -0.75 Z")
        )
    }.build()
}
