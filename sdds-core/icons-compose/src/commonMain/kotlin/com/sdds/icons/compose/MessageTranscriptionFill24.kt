package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageTranscriptionFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageTranscriptionFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.95 11.763 c 0.0 -4.577 3.71 -8.287 8.287 -8.287 c 4.577 0.0 8.288 3.71 8.288 8.287 c 0.0 4.577 -3.71 8.288 -8.288 8.288 c -0.984 0.0 -1.93 -0.172 -2.808 -0.489 c -0.527 -0.19 -1.045 -0.244 -1.5 -0.117 l -2.503 0.701 c -0.958 0.268 -1.84 -0.614 -1.572 -1.571 l 0.701 -2.503 c 0.128 -0.456 0.073 -0.973 -0.117 -1.5 c -0.316 -0.878 -0.488 -1.824 -0.488 -2.809 Z m 9.25 -4.037 c 0.0 -0.415 -0.336 -0.75 -0.75 -0.75 S 11.7 7.31 11.7 7.726 v 8.5 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 v -8.5 Z m 2.437 1.587 c 0.414 0.0 0.75 0.336 0.75 0.75 v 3.825 c 0.0 0.415 -0.336 0.75 -0.75 0.75 s -0.75 -0.335 -0.75 -0.75 v -3.825 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z m -5.625 0.75 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 s -0.75 0.336 -0.75 0.75 v 3.825 c 0.0 0.415 0.336 0.75 0.75 0.75 s 0.75 -0.335 0.75 -0.75 v -3.825 Z")
        )
    }.build()
}
