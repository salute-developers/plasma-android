package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoorLOpenOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoorLOpenOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.615 8.7 c 0.38 0.0 0.69 -0.313 0.69 -0.7 c 0.0 -0.385 -0.31 -0.698 -0.69 -0.698 c -0.38 0.0 -0.689 0.313 -0.689 0.699 c 0.0 0.386 0.309 0.698 0.69 0.698 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.503 0.8 c 0.769 -0.226 1.538 0.35 1.538 1.15 v 0.113 h 2.254 c 0.666 0.0 1.205 0.548 1.205 1.223 v 9.43 c 0.0 0.675 -0.54 1.223 -1.205 1.223 h -2.254 v 0.112 c 0.0 0.801 -0.77 1.377 -1.538 1.152 l -5.141 -1.51 C 2.85 13.543 2.5 13.074 2.5 12.542 V 3.46 c 0.0 -0.533 0.35 -1.002 0.862 -1.152 L 8.503 0.8 Z m 0.538 1.15 v 0.113 H 9.025 v 11.875 H 9.04 v 0.113 c 0.0 0.134 -0.128 0.23 -0.256 0.192 l -5.141 -1.51 C 3.558 12.71 3.5 12.63 3.5 12.542 V 3.46 c 0.0 -0.09 0.058 -0.167 0.144 -0.192 l 5.14 -1.51 C 8.914 1.72 9.042 1.817 9.042 1.95 Z")
        )
    }.build()
}
