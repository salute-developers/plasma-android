package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BatteryChargeOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BatteryChargeOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.0 3.0 c -0.828 0.0 -1.5 0.672 -1.5 1.5 v 1.568 c -0.787 0.066 -1.372 0.197 -1.88 0.455 c -0.902 0.46 -1.637 1.195 -2.097 2.098 C 9.0 9.648 9.0 10.99 9.0 13.68 v 11.64 c 0.0 2.688 0.0 4.032 0.523 5.06 c 0.46 0.902 1.195 1.637 2.098 2.097 C 12.648 33.0 13.99 33.0 16.68 33.0 h 2.64 c 2.688 0.0 4.032 0.0 5.06 -0.523 c 0.902 -0.46 1.637 -1.195 2.097 -2.098 C 27.0 29.352 27.0 28.01 27.0 25.32 V 13.68 c 0.0 -2.688 0.0 -4.032 -0.523 -5.06 c -0.46 -0.902 -1.195 -1.637 -2.098 -2.097 c -0.507 -0.258 -1.092 -0.39 -1.879 -0.455 V 4.5 C 22.5 3.672 21.828 3.0 21.0 3.0 h -6.0 Z m -3.75 8.25 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 h 7.5 c 1.657 0.0 3.0 1.343 3.0 3.0 v 16.5 c 0.0 1.657 -1.343 3.0 -3.0 3.0 h -7.5 c -1.657 0.0 -3.0 -1.343 -3.0 -3.0 v -16.5 Z m 1.85 8.253 c -0.243 0.335 0.0 1.05 0.418 1.05 h 4.062 l -1.532 4.178 c -0.068 0.522 0.617 0.788 0.927 0.359 l 5.822 -6.485 c 0.242 -0.335 0.014 -1.052 -0.404 -1.052 h -4.11 l 1.485 -4.176 c 0.068 -0.523 -0.617 -0.788 -0.927 -0.36 l -5.74 6.486 Z")
        )
    }.build()
}
