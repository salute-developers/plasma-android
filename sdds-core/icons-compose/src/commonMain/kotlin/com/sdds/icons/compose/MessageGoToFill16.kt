package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageGoToFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageGoToFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.051 2.05 c -3.257 0.0 -5.898 2.64 -5.898 5.899 c 0.0 0.7 0.122 1.374 0.347 1.999 c 0.135 0.375 0.174 0.743 0.083 1.067 l -0.499 1.782 c -0.19 0.681 0.438 1.31 1.119 1.118 l 1.782 -0.498 c 0.324 -0.091 0.692 -0.052 1.067 0.083 c 0.625 0.225 1.298 0.347 2.0 0.347 c 3.063 0.0 5.58 -2.335 5.87 -5.322 H 8.32 l 1.392 1.391 c 0.166 0.166 0.166 0.435 0.0 0.601 c -0.166 0.166 -0.435 0.166 -0.6 0.0 L 6.993 8.4 c -0.08 -0.08 -0.125 -0.188 -0.125 -0.3 c 0.0 -0.113 0.045 -0.221 0.125 -0.301 L 9.11 5.682 c 0.166 -0.166 0.435 -0.166 0.601 0.0 c 0.166 0.166 0.166 0.435 0.0 0.6 L 8.32 7.676 h 5.624 C 13.8 4.543 11.217 2.05 8.05 2.05 Z m 5.898 5.802 v 0.193 v -0.096 v -0.097 Z")
        )
    }.build()
}
