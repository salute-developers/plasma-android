package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessagePersonFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessagePersonFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.95 11.763 c 0.0 -4.577 3.71 -8.287 8.287 -8.287 c 4.577 0.0 8.288 3.71 8.288 8.287 c 0.0 4.577 -3.71 8.288 -8.288 8.288 c -0.984 0.0 -1.93 -0.172 -2.808 -0.489 c -0.527 -0.19 -1.045 -0.244 -1.5 -0.117 l -2.503 0.701 c -0.958 0.268 -1.84 -0.614 -1.572 -1.571 l 0.701 -2.503 c 0.128 -0.456 0.073 -0.973 -0.117 -1.5 c -0.316 -0.878 -0.488 -1.824 -0.488 -2.809 Z m 12.887 3.43 c -1.047 1.401 -2.717 2.308 -4.6 2.308 c -1.882 0.0 -3.553 -0.907 -4.599 -2.307 c 1.382 -0.7 2.945 -1.093 4.6 -1.093 c 1.654 0.0 3.217 0.394 4.599 1.093 Z m -4.6 -2.155 c 1.643 0.0 2.976 -1.332 2.976 -2.975 s -1.332 -2.975 -2.975 -2.975 c -1.644 0.0 -2.976 1.332 -2.976 2.975 s 1.332 2.975 2.976 2.975 Z")
        )
    }.build()
}
