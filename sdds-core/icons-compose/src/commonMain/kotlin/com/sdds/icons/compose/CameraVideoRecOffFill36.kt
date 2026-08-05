package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoRecOffFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoRecOffFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 29.749 4.492 c 0.39 -0.39 1.024 -0.39 1.414 0.0 c 0.39 0.39 0.39 1.024 0.0 1.414 L 5.707 31.362 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.024 0.0 -1.415 l 2.95 -2.95 C 4.895 26.973 3.0 25.065 3.0 22.713 v -9.428 C 3.0 10.918 4.92 9.0 7.286 9.0 h 12.429 c 1.5 0.0 2.82 0.772 3.585 1.94 l 6.449 -6.447 Z M 13.5 14.5 c -1.933 0.0 -3.5 1.567 -3.5 3.5 c 0.0 1.697 1.207 3.11 2.81 3.43 l 4.12 -4.12 c -0.32 -1.603 -1.733 -2.81 -3.43 -2.81 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 24.0 22.713 c 0.0 2.367 -1.918 4.286 -4.285 4.286 H 12.82 L 24.0 15.82 v 6.893 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 30.561 12.187 c 0.9 -0.9 2.439 -0.261 2.439 1.011 v 10.054 c 0.0 1.298 -1.592 1.923 -2.476 0.972 l -4.838 -5.216 c -0.523 -0.563 -0.506 -1.438 0.037 -1.982 l 4.838 -4.839 Z")
        )
    }.build()
}
