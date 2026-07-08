package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BatteryHoriz60Fill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BatteryHoriz60Fill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 33.0 15.0 c 0.0 -0.828 -0.672 -1.5 -1.5 -1.5 h -1.662 c -0.078 -0.433 -0.192 -0.797 -0.361 -1.13 c -0.46 -0.902 -1.195 -1.637 -2.098 -2.097 C 26.352 9.75 25.01 9.75 22.32 9.75 H 10.68 c -2.688 0.0 -4.032 0.0 -5.06 0.523 c -0.902 0.46 -1.637 1.195 -2.097 2.098 C 3.0 13.398 3.0 14.74 3.0 17.43 v 1.14 c 0.0 2.688 0.0 4.032 0.523 5.06 c 0.46 0.902 1.195 1.637 2.098 2.097 c 1.027 0.523 2.37 0.523 5.059 0.523 h 11.64 c 2.688 0.0 4.032 0.0 5.06 -0.523 c 0.902 -0.46 1.637 -1.195 2.097 -2.098 c 0.169 -0.332 0.283 -0.696 0.36 -1.129 H 31.5 c 0.828 0.0 1.5 -0.672 1.5 -1.5 v -6.0 Z M 5.25 13.5 c 0.0 -0.828 0.672 -1.5 1.5 -1.5 H 7.5 c 0.414 0.0 0.75 0.336 0.75 0.75 v 10.5 C 8.25 23.664 7.914 24.0 7.5 24.0 H 6.75 c -0.828 0.0 -1.5 -0.672 -1.5 -1.5 v -9.0 Z M 9.9 12.0 c -0.414 0.0 -0.75 0.336 -0.75 0.75 v 10.5 C 9.15 23.664 9.486 24.0 9.9 24.0 h 1.5 c 0.415 0.0 0.75 -0.336 0.75 -0.75 v -10.5 c 0.0 -0.414 -0.335 -0.75 -0.75 -0.75 H 9.9 Z m 3.15 0.75 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 1.5 c 0.414 0.0 0.75 0.336 0.75 0.75 v 10.5 c 0.0 0.414 -0.336 0.75 -0.75 0.75 h -1.5 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 v -10.5 Z M 17.7 12.0 c -0.415 0.0 -0.75 0.336 -0.75 0.75 v 10.5 c 0.0 0.414 0.335 0.75 0.75 0.75 h 1.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 v -10.5 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 h -1.5 Z")
        )
    }.build()
}
