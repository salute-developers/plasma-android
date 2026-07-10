package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BatteryHoriz40Outline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BatteryHoriz40Outline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 33.0 15.0 c 0.0 -0.828 -0.672 -1.5 -1.5 -1.5 h -1.568 c -0.066 -0.787 -0.197 -1.372 -0.455 -1.88 c -0.46 -0.902 -1.195 -1.637 -2.098 -2.097 C 26.352 9.0 25.01 9.0 22.32 9.0 H 10.68 C 7.992 9.0 6.648 9.0 5.62 9.523 c -0.902 0.46 -1.637 1.195 -2.097 2.098 C 3.0 12.648 3.0 13.99 3.0 16.68 v 2.64 c 0.0 2.688 0.0 4.032 0.523 5.06 c 0.46 0.902 1.195 1.637 2.098 2.097 C 6.648 27.0 7.99 27.0 10.68 27.0 h 11.64 c 2.688 0.0 4.032 0.0 5.06 -0.523 c 0.902 -0.46 1.637 -1.195 2.097 -2.098 c 0.258 -0.507 0.39 -1.092 0.455 -1.879 H 31.5 c 0.828 0.0 1.5 -0.672 1.5 -1.5 v -6.0 Z m -8.25 -3.75 c 1.657 0.0 3.0 1.343 3.0 3.0 v 7.5 c 0.0 1.657 -1.343 3.0 -3.0 3.0 H 8.25 c -1.657 0.0 -3.0 -1.343 -3.0 -3.0 v -7.5 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 h 16.5 Z M 7.5 12.75 c -0.414 0.0 -0.75 0.336 -0.75 0.75 v 9.0 c 0.0 0.414 0.336 0.75 0.75 0.75 h 0.75 C 8.664 23.25 9.0 22.914 9.0 22.5 v -9.0 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 H 7.5 Z m 6.15 0.75 c 0.0 -0.414 0.335 -0.75 0.75 -0.75 h 0.75 c 0.414 0.0 0.75 0.336 0.75 0.75 v 9.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 H 14.4 c -0.415 0.0 -0.75 -0.336 -0.75 -0.75 v -9.0 Z m -2.7 -0.75 c -0.414 0.0 -0.75 0.336 -0.75 0.75 v 9.0 c 0.0 0.414 0.336 0.75 0.75 0.75 h 0.75 c 0.414 0.0 0.75 -0.336 0.75 -0.75 v -9.0 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 h -0.75 Z")
        )
    }.build()
}
