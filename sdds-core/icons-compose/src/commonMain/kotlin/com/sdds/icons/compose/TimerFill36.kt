package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TimerFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TimerFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.875 4.5 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 8.25 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 h -8.25 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 Z M 18.0 33.0 c 7.042 0.0 12.75 -5.785 12.75 -12.92 c 0.0 -3.367 -1.27 -6.433 -3.353 -8.733 l 1.065 -1.078 c 0.388 -0.393 0.384 -1.026 -0.01 -1.414 c -0.392 -0.388 -1.026 -0.384 -1.414 0.009 l -1.095 1.109 C 23.764 8.213 21.003 7.16 18.0 7.16 c -7.042 0.0 -12.75 5.784 -12.75 12.92 C 5.25 27.215 10.958 33.0 18.0 33.0 Z m 5.676 -17.83 c 0.436 -0.442 0.432 -1.154 -0.01 -1.59 c -0.443 -0.437 -1.155 -0.432 -1.592 0.01 L 17.2 18.53 c -0.436 0.442 -0.432 1.154 0.01 1.59 c 0.443 0.437 1.155 0.432 1.592 -0.01 l 4.875 -4.94 Z")
        )
    }.build()
}
