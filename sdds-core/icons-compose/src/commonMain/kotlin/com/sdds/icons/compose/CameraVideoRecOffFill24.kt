package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoRecOffFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoRecOffFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.44 2.47 c 0.293 -0.293 0.768 -0.293 1.061 0.0 c 0.293 0.293 0.293 0.767 0.0 1.06 L 3.531 20.5 c -0.294 0.294 -0.768 0.294 -1.061 0.0 c -0.293 -0.292 -0.293 -0.767 0.0 -1.06 l 1.562 -1.563 C 2.857 17.523 2.0 16.433 2.0 15.143 V 8.857 C 2.0 7.28 3.28 6.0 4.857 6.0 h 8.286 c 0.766 0.0 1.46 0.303 1.972 0.795 L 19.44 2.47 Z M 9.0 9.75 c -1.243 0.0 -2.25 1.007 -2.25 2.25 c 0.0 0.855 0.477 1.599 1.18 1.98 l 3.05 -3.05 C 10.598 10.227 9.854 9.75 9.0 9.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.0 15.143 C 16.0 16.72 14.72 18.0 13.143 18.0 h -4.99 L 16.0 10.153 v 4.99 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.374 8.126 C 20.974 7.526 22.0 7.95 22.0 8.799 v 6.703 c 0.0 0.865 -1.062 1.282 -1.65 0.647 l -3.226 -3.476 c -0.348 -0.376 -0.337 -0.96 0.024 -1.322 l 3.226 -3.225 Z")
        )
    }.build()
}
