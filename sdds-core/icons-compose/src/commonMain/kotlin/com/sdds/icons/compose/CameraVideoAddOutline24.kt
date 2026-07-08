package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoAddOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoAddOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.034 7.5 H 4.76 C 4.063 7.5 3.5 8.063 3.5 8.759 v 2.973 C 2.949 12.02 2.444 12.383 2.0 12.81 V 8.759 C 2.0 7.235 3.235 6.0 4.759 6.0 h 8.276 c 1.523 0.0 2.758 1.235 2.758 2.759 v 6.482 c 0.0 1.524 -1.235 2.759 -2.758 2.759 H 12.98 C 12.994 17.835 13.0 17.668 13.0 17.5 c 0.0 -0.34 -0.026 -0.674 -0.076 -1.0 h 0.11 c 0.696 0.0 1.26 -0.563 1.26 -1.259 V 8.76 c 0.0 -0.695 -0.564 -1.259 -1.26 -1.259 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.374 8.126 C 20.974 7.526 22.0 7.95 22.0 8.799 v 6.703 c 0.0 0.865 -1.062 1.282 -1.65 0.647 l -3.226 -3.477 c -0.348 -0.375 -0.337 -0.959 0.025 -1.32 l 3.225 -3.226 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.5 23.0 c 3.038 0.0 5.5 -2.462 5.5 -5.5 S 9.538 12.0 6.5 12.0 S 1.0 14.462 1.0 17.5 S 3.462 23.0 6.5 23.0 Z M 7.0 14.5 C 7.0 14.224 6.776 14.0 6.5 14.0 S 6.0 14.224 6.0 14.5 V 17.0 H 3.5 C 3.224 17.0 3.0 17.224 3.0 17.5 S 3.224 18.0 3.5 18.0 H 6.0 v 2.5 C 6.0 20.776 6.224 21.0 6.5 21.0 S 7.0 20.776 7.0 20.5 V 18.0 h 2.5 c 0.276 0.0 0.5 -0.224 0.5 -0.5 S 9.776 17.0 9.5 17.0 H 7.0 v -2.5 Z")
        )
    }.build()
}
