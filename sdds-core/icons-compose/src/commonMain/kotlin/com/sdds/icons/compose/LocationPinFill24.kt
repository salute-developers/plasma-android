package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LocationPinFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LocationPinFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 2.0 c -4.418 0.0 -8.0 3.582 -8.0 8.0 c 0.0 3.017 1.702 5.813 3.423 7.886 c 1.738 2.092 3.6 3.57 4.127 3.964 c 0.267 0.2 0.633 0.2 0.9 0.0 c 0.527 -0.395 2.389 -1.872 4.127 -3.965 C 18.298 15.814 20.0 13.018 20.0 10.0 c 0.0 -4.418 -3.582 -8.0 -8.0 -8.0 Z m 0.0 11.5 c 1.933 0.0 3.5 -1.567 3.5 -3.5 S 13.933 6.5 12.0 6.5 S 8.5 8.067 8.5 10.0 s 1.567 3.5 3.5 3.5 Z")
        )
    }.build()
}
