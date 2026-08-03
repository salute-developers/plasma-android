package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Battery20Outline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Battery20Outline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.5 4.5 C 13.5 3.672 14.172 3.0 15.0 3.0 h 6.0 c 0.828 0.0 1.5 0.672 1.5 1.5 v 1.568 c 0.787 0.066 1.372 0.197 1.88 0.455 c 0.902 0.46 1.637 1.195 2.097 2.098 C 27.0 9.648 27.0 10.99 27.0 13.68 v 11.64 c 0.0 2.688 0.0 4.032 -0.523 5.06 c -0.46 0.902 -1.195 1.637 -2.098 2.097 C 23.352 33.0 22.01 33.0 19.32 33.0 h -2.64 c -2.688 0.0 -4.032 0.0 -5.06 -0.523 c -0.902 -0.46 -1.637 -1.195 -2.097 -2.098 C 9.0 29.352 9.0 28.01 9.0 25.32 V 13.68 c 0.0 -2.688 0.0 -4.032 0.523 -5.06 c 0.46 -0.902 1.195 -1.637 2.098 -2.097 c 0.507 -0.258 1.092 -0.39 1.879 -0.455 V 4.5 Z m 0.75 3.75 c -1.657 0.0 -3.0 1.343 -3.0 3.0 v 16.5 c 0.0 1.657 1.343 3.0 3.0 3.0 h 7.5 c 1.657 0.0 3.0 -1.343 3.0 -3.0 v -16.5 c 0.0 -1.657 -1.343 -3.0 -3.0 -3.0 h -7.5 Z m -0.75 21.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 v -0.75 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 9.0 c 0.414 0.0 0.75 0.336 0.75 0.75 v 0.75 c 0.0 0.414 -0.336 0.75 -0.75 0.75 h -9.0 Z m -0.75 -4.2 c 0.0 0.415 0.336 0.75 0.75 0.75 h 9.0 c 0.414 0.0 0.75 -0.335 0.75 -0.75 V 24.3 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 h -9.0 c -0.414 0.0 -0.75 0.336 -0.75 0.75 v 0.75 Z")
        )
    }.build()
}
