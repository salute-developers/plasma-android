package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageCloseFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageCloseFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.95 11.763 c 0.0 -4.577 3.71 -8.287 8.287 -8.287 c 4.577 0.0 8.288 3.71 8.288 8.287 c 0.0 4.577 -3.71 8.288 -8.288 8.288 c -0.985 0.0 -1.93 -0.172 -2.808 -0.489 c -0.527 -0.19 -1.045 -0.244 -1.5 -0.117 l -2.504 0.701 c -0.957 0.268 -1.84 -0.614 -1.571 -1.571 l 0.7 -2.503 c 0.128 -0.456 0.074 -0.973 -0.116 -1.5 c -0.316 -0.878 -0.488 -1.824 -0.488 -2.809 Z m 5.843 -3.08 C 9.5 8.39 9.025 8.39 8.732 8.683 c -0.293 0.292 -0.293 0.767 0.0 1.06 l 2.232 2.232 l -2.232 2.233 c -0.293 0.293 -0.293 0.767 0.0 1.06 c 0.293 0.293 0.768 0.293 1.06 0.0 l 2.233 -2.232 l 2.232 2.232 c 0.293 0.293 0.768 0.293 1.06 0.0 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 l -2.232 -2.233 l 2.232 -2.232 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 c -0.292 -0.293 -0.767 -0.293 -1.06 0.0 l -2.232 2.232 l -2.232 -2.232 Z")
        )
    }.build()
}
