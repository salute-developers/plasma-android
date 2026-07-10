package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TimerAddFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TimerAddFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.875 4.5 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 8.25 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 h -8.25 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 Z M 18.0 33.0 c 7.042 0.0 12.75 -5.785 12.75 -12.92 c 0.0 -3.367 -1.27 -6.433 -3.353 -8.733 l 1.065 -1.078 c 0.388 -0.393 0.384 -1.026 -0.01 -1.414 c -0.392 -0.388 -1.026 -0.384 -1.414 0.009 l -1.095 1.109 C 23.764 8.213 21.003 7.16 18.0 7.16 c -7.042 0.0 -12.75 5.784 -12.75 12.92 C 5.25 27.215 10.958 33.0 18.0 33.0 Z m 1.125 -19.38 c 0.0 -0.621 -0.504 -1.125 -1.125 -1.125 s -1.125 0.504 -1.125 1.125 v 5.335 h -5.25 c -0.621 0.0 -1.125 0.503 -1.125 1.125 c 0.0 0.621 0.504 1.125 1.125 1.125 h 5.25 v 5.335 c 0.0 0.621 0.504 1.125 1.125 1.125 s 1.125 -0.504 1.125 -1.125 v -5.335 h 5.25 c 0.621 0.0 1.125 -0.504 1.125 -1.125 c 0.0 -0.622 -0.504 -1.125 -1.125 -1.125 h -5.25 V 13.62 Z")
        )
    }.build()
}
