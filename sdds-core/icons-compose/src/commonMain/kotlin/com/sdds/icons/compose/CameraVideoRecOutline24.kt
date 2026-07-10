package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoRecOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoRecOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 8.759 C 2.0 7.235 3.235 6.0 4.759 6.0 h 8.276 c 1.523 0.0 2.758 1.235 2.758 2.759 v 6.482 c 0.0 1.524 -1.235 2.759 -2.758 2.759 H 4.758 C 3.235 18.0 2.0 16.765 2.0 15.241 V 8.76 Z M 4.759 7.5 h 8.276 c 0.695 0.0 1.258 0.564 1.258 1.259 v 6.482 c 0.0 0.696 -0.563 1.259 -1.258 1.259 H 4.758 c -0.696 0.0 -1.259 -0.563 -1.259 -1.259 V 8.76 C 3.5 8.063 4.064 7.5 4.759 7.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 22.0 8.8 c 0.0 -0.85 -1.026 -1.274 -1.626 -0.674 L 17.15 11.35 c -0.362 0.362 -0.373 0.946 -0.025 1.321 l 3.226 3.477 c 0.588 0.635 1.65 0.218 1.65 -0.647 V 8.799 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.0 12.0 c 0.0 1.105 -0.895 2.0 -2.0 2.0 s -2.0 -0.895 -2.0 -2.0 s 0.895 -2.0 2.0 -2.0 s 2.0 0.895 2.0 2.0 Z")
        )
    }.build()
}
