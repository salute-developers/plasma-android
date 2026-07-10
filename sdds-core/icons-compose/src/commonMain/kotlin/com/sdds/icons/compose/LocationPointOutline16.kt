package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LocationPointOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LocationPointOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.525 1.525 C 8.525 1.235 8.29 1.0 8.0 1.0 C 7.71 1.0 7.475 1.235 7.475 1.525 v 1.25 c -2.48 0.247 -4.453 2.22 -4.7 4.7 h -1.25 C 1.235 7.475 1.0 7.71 1.0 8.0 c 0.0 0.29 0.235 0.525 0.525 0.525 h 1.25 c 0.247 2.48 2.22 4.453 4.7 4.7 v 1.25 C 7.475 14.765 7.71 15.0 8.0 15.0 c 0.29 0.0 0.525 -0.235 0.525 -0.525 v -1.25 c 2.48 -0.247 4.453 -2.22 4.7 -4.7 h 1.25 C 14.765 8.525 15.0 8.29 15.0 8.0 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 h -1.25 c -0.247 -2.48 -2.22 -4.453 -4.7 -4.7 v -1.25 Z M 3.8 8.0 c 0.0 -2.32 1.88 -4.2 4.2 -4.2 c 2.32 0.0 4.2 1.88 4.2 4.2 c 0.0 2.32 -1.88 4.2 -4.2 4.2 c -2.32 0.0 -4.2 -1.88 -4.2 -4.2 Z M 8.0 10.1 c 1.16 0.0 2.1 -0.94 2.1 -2.1 c 0.0 -1.16 -0.94 -2.1 -2.1 -2.1 c -1.16 0.0 -2.1 0.94 -2.1 2.1 c 0.0 1.16 0.94 2.1 2.1 2.1 Z")
        )
    }.build()
}
