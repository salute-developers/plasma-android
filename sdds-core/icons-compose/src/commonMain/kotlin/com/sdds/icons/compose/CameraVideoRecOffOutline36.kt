package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoRecOffOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoRecOffOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 29.749 4.492 c 0.39 -0.39 1.024 -0.39 1.414 0.0 c 0.39 0.39 0.39 1.024 0.0 1.414 L 5.707 31.362 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.024 0.0 -1.415 L 7.241 27.0 H 7.138 c -2.214 0.0 -4.021 -1.739 -4.132 -3.925 L 3.0 22.861 v -9.724 c 0.0 -2.286 1.853 -4.138 4.138 -4.138 h 12.414 l 0.213 0.006 c 1.45 0.073 2.704 0.895 3.383 2.086 l 6.601 -6.599 Z M 7.138 11.0 C 5.958 10.999 5.0 11.956 5.0 13.137 v 9.724 C 5.0 24.041 5.957 25.0 7.138 25.0 H 9.24 l 3.583 -3.583 c -1.445 -0.33 -2.523 -1.622 -2.523 -3.167 c 0.0 -1.795 1.455 -3.25 3.25 -3.25 c 1.545 0.0 2.837 1.078 3.167 2.523 l 4.905 -4.906 C 21.39 11.688 20.552 11.0 19.552 11.0 H 7.138 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 23.69 22.861 l -0.005 0.213 c -0.108 2.116 -1.805 3.812 -3.92 3.92 l -0.213 0.005 h -6.73 l 2.0 -2.0 h 4.73 c 1.18 0.0 2.137 -0.957 2.137 -2.138 v -4.73 l 2.0 -2.0 v 6.73 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 30.561 12.187 c 0.9 -0.9 2.439 -0.261 2.439 1.011 v 10.054 c 0.0 1.298 -1.592 1.923 -2.476 0.972 l -4.838 -5.216 c -0.523 -0.563 -0.506 -1.439 0.037 -1.982 l 4.838 -4.839 Z")
        )
    }.build()
}
