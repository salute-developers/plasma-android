package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoRecOffOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoRecOffOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.44 2.47 c 0.293 -0.293 0.768 -0.293 1.061 0.0 c 0.293 0.293 0.293 0.767 0.0 1.06 L 3.531 20.5 c -0.294 0.294 -0.768 0.294 -1.061 0.0 c -0.293 -0.292 -0.293 -0.767 0.0 -1.06 l 1.543 -1.545 C 2.852 17.57 2.0 16.506 2.0 15.241 V 8.76 C 2.0 7.33 3.086 6.156 4.477 6.015 L 4.759 6.0 h 8.275 c 0.792 0.0 1.503 0.335 2.005 0.87 l 4.401 -4.4 Z M 4.76 7.5 C 4.064 7.5 3.5 8.064 3.5 8.759 v 6.482 c 0.0 0.695 0.564 1.259 1.259 1.259 h 0.65 l 2.708 -2.708 C 7.456 13.466 7.0 12.787 7.0 12.0 c 0.0 -1.105 0.895 -2.0 2.0 -2.0 c 0.787 0.0 1.466 0.456 1.792 1.117 L 13.98 7.93 C 13.748 7.667 13.41 7.5 13.034 7.5 H 4.76 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.793 15.241 c 0.0 1.524 -1.235 2.759 -2.759 2.759 h -4.88 l 1.5 -1.5 h 3.38 c 0.695 0.0 1.259 -0.564 1.259 -1.259 v -3.38 l 1.5 -1.5 v 4.88 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.374 8.126 C 20.974 7.526 22.0 7.95 22.0 8.799 v 6.703 c 0.0 0.865 -1.062 1.282 -1.65 0.647 l -3.226 -3.476 c -0.348 -0.376 -0.337 -0.96 0.024 -1.322 l 3.226 -3.225 Z")
        )
    }.build()
}
