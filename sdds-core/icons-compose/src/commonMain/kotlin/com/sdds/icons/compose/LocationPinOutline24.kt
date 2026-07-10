package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LocationPinOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LocationPinOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 6.5 c -1.933 0.0 -3.5 1.567 -3.5 3.5 s 1.567 3.5 3.5 3.5 s 3.5 -1.567 3.5 -3.5 s -1.567 -3.5 -3.5 -3.5 Z M 10.0 10.0 c 0.0 -1.105 0.895 -2.0 2.0 -2.0 s 2.0 0.895 2.0 2.0 s -0.895 2.0 -2.0 2.0 s -2.0 -0.895 -2.0 -2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 2.0 c -4.418 0.0 -8.0 3.582 -8.0 8.0 c 0.0 3.017 1.702 5.813 3.423 7.886 c 1.738 2.092 3.6 3.57 4.127 3.964 c 0.267 0.2 0.633 0.2 0.9 0.0 c 0.527 -0.395 2.389 -1.872 4.127 -3.965 C 18.298 15.814 20.0 13.018 20.0 10.0 c 0.0 -4.418 -3.582 -8.0 -8.0 -8.0 Z m -6.5 8.0 c 0.0 -3.59 2.91 -6.5 6.5 -6.5 s 6.5 2.91 6.5 6.5 c 0.0 2.483 -1.423 4.937 -3.077 6.927 c -1.296 1.56 -2.672 2.762 -3.423 3.37 c -0.751 -0.608 -2.127 -1.81 -3.423 -3.37 C 6.923 14.937 5.5 12.483 5.5 10.0 Z")
        )
    }.build()
}
