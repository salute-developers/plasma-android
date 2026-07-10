package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ColumnCheckboxOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ColumnCheckboxOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.041 2.0 h 1.544 C 7.791 2.583 8.347 3.0 9.0 3.0 h 6.0 c 0.653 0.0 1.209 -0.417 1.415 -1.0 h 1.544 C 17.72 3.419 16.486 4.5 15.0 4.5 H 9.0 C 7.513 4.5 6.28 3.419 6.041 2.0 Z M 9.0 7.5 h 6.0 c 0.828 0.0 1.5 0.672 1.5 1.5 v 6.0 c 0.0 0.828 -0.672 1.5 -1.5 1.5 H 9.0 c -0.828 0.0 -1.5 -0.672 -1.5 -1.5 V 9.0 c 0.0 -0.828 0.672 -1.5 1.5 -1.5 Z M 6.0 9.0 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 h 6.0 c 1.657 0.0 3.0 1.343 3.0 3.0 v 6.0 c 0.0 1.657 -1.343 3.0 -3.0 3.0 H 9.0 c -1.657 0.0 -3.0 -1.343 -3.0 -3.0 V 9.0 Z m 3.0 12.0 h 6.0 c 0.653 0.0 1.209 0.417 1.415 1.0 h 1.544 c -0.238 -1.419 -1.473 -2.5 -2.959 -2.5 H 9.0 c -1.487 0.0 -2.72 1.081 -2.959 2.5 h 1.544 C 7.791 21.417 8.347 21.0 9.0 21.0 Z m 6.124 -10.834 c 0.23 -0.345 0.137 -0.81 -0.208 -1.04 c -0.345 -0.23 -0.81 -0.137 -1.04 0.208 l -2.431 3.647 l -1.36 -1.7 c -0.258 -0.323 -0.73 -0.375 -1.054 -0.117 c -0.323 0.26 -0.375 0.731 -0.117 1.055 l 1.83 2.286 c 0.401 0.502 1.175 0.468 1.532 -0.067 l 2.848 -4.272 Z")
        )
    }.build()
}
