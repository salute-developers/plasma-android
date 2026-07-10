package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageChatFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageChatFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.95 11.763 c 0.0 -4.577 3.71 -8.287 8.287 -8.287 c 4.577 0.0 8.288 3.71 8.288 8.287 c 0.0 4.577 -3.71 8.288 -8.288 8.288 c -0.984 0.0 -1.93 -0.172 -2.808 -0.489 c -0.527 -0.19 -1.045 -0.244 -1.5 -0.117 l -2.503 0.701 c -0.958 0.268 -1.84 -0.614 -1.572 -1.571 l 0.701 -2.503 c 0.128 -0.456 0.073 -0.973 -0.117 -1.5 c -0.316 -0.878 -0.488 -1.824 -0.488 -2.809 Z M 8.2 13.25 c 0.704 0.0 1.275 -0.57 1.275 -1.275 c 0.0 -0.704 -0.57 -1.275 -1.275 -1.275 c -0.704 0.0 -1.275 0.571 -1.275 1.275 S 7.496 13.25 8.2 13.25 Z m 5.1 -1.275 c 0.0 0.704 -0.57 1.275 -1.275 1.275 c -0.704 0.0 -1.275 -0.57 -1.275 -1.275 c 0.0 -0.704 0.571 -1.275 1.275 -1.275 s 1.275 0.571 1.275 1.275 Z m 2.55 1.275 c 0.705 0.0 1.275 -0.57 1.275 -1.275 c 0.0 -0.704 -0.57 -1.275 -1.275 -1.275 c -0.704 0.0 -1.275 0.571 -1.275 1.275 s 0.571 1.275 1.275 1.275 Z")
        )
    }.build()
}
