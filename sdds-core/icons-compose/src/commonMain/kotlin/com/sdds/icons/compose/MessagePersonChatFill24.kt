package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessagePersonChatFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessagePersonChatFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.237 3.476 c -4.577 0.0 -8.287 3.71 -8.287 8.287 c 0.0 0.985 0.172 1.93 0.488 2.809 c 0.19 0.527 0.244 1.044 0.117 1.5 l -0.701 2.503 c -0.268 0.957 0.614 1.84 1.571 1.571 l 2.504 -0.7 c 0.455 -0.128 0.973 -0.073 1.5 0.116 c 0.658 0.237 1.354 0.393 2.077 0.457 C 11.18 19.244 11.0 18.393 11.0 17.5 c 0.0 -3.59 2.91 -6.5 6.5 -6.5 c 1.092 0.0 2.121 0.27 3.025 0.745 c -0.01 -4.568 -3.717 -8.27 -8.288 -8.27 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.5 23.0 c 3.038 0.0 5.5 -2.462 5.5 -5.5 c 0.0 -3.037 -2.462 -5.5 -5.5 -5.5 S 12.0 14.463 12.0 17.5 c 0.0 3.038 2.462 5.5 5.5 5.5 Z m 2.25 -7.75 c 0.0 1.243 -1.007 2.25 -2.25 2.25 s -2.25 -1.007 -2.25 -2.25 c 0.0 -1.242 1.007 -2.25 2.25 -2.25 s 2.25 1.008 2.25 2.25 Z m 1.528 4.697 C 20.476 21.183 19.083 22.0 17.5 22.0 c -1.583 0.0 -2.976 -0.817 -3.778 -2.053 C 14.848 19.343 16.134 19.0 17.5 19.0 s 2.652 0.343 3.778 0.947 Z")
        )
    }.build()
}
