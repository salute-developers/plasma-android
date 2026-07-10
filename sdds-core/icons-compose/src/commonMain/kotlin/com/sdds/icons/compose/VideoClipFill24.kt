package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VideoClipFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VideoClipFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.883 4.0 H 9.117 C 8.025 4.0 7.159 4.0 6.462 4.057 c -0.714 0.058 -1.317 0.18 -1.868 0.46 C 3.7 4.974 2.974 5.7 2.518 6.595 c -0.281 0.55 -0.403 1.154 -0.461 1.868 C 2.0 9.159 2.0 10.025 2.0 11.117 v 1.766 c 0.0 1.092 0.0 1.958 0.057 2.655 c 0.058 0.714 0.18 1.317 0.46 1.869 c 0.456 0.893 1.183 1.62 2.077 2.075 c 0.55 0.281 1.154 0.403 1.868 0.461 C 7.159 20.0 8.025 20.0 9.117 20.0 h 5.766 c 1.092 0.0 1.958 0.0 2.655 -0.057 c 0.714 -0.058 1.317 -0.18 1.869 -0.46 c 0.893 -0.456 1.62 -1.183 2.075 -2.076 c 0.281 -0.552 0.403 -1.155 0.461 -1.869 C 22.0 14.841 22.0 13.975 22.0 12.883 v -1.766 c 0.0 -1.092 0.0 -1.958 -0.057 -2.655 c -0.058 -0.714 -0.18 -1.317 -0.46 -1.868 c -0.456 -0.894 -1.183 -1.62 -2.076 -2.076 c -0.552 -0.281 -1.155 -0.403 -1.869 -0.461 C 16.841 4.0 15.975 4.0 14.883 4.0 Z m 0.367 8.866 c 0.667 -0.385 0.667 -1.347 0.0 -1.732 l -4.5 -2.598 c -0.667 -0.385 -1.5 0.096 -1.5 0.866 v 5.196 c 0.0 0.77 0.833 1.251 1.5 0.866 l 4.5 -2.598 Z")
        )
    }.build()
}
