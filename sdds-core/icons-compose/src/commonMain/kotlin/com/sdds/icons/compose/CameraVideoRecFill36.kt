package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoRecFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoRecFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.0 13.286 C 3.0 10.919 4.919 9.0 7.286 9.0 h 12.429 C 22.08 9.0 24.0 10.919 24.0 13.286 v 9.428 C 24.0 25.081 22.081 27.0 19.715 27.0 H 7.285 C 4.92 27.0 3.0 25.081 3.0 22.714 v -9.428 Z M 13.5 21.5 c 1.933 0.0 3.5 -1.567 3.5 -3.5 s -1.567 -3.5 -3.5 -3.5 S 10.0 16.067 10.0 18.0 s 1.567 3.5 3.5 3.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 30.561 12.189 c 0.9 -0.9 2.44 -0.263 2.44 1.01 v 10.054 c 0.0 1.298 -1.593 1.923 -2.477 0.971 l -4.838 -5.215 c -0.523 -0.563 -0.506 -1.439 0.037 -1.982 l 4.838 -4.838 Z")
        )
    }.build()
}
