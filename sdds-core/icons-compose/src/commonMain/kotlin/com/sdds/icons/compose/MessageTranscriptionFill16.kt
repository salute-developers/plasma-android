package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageTranscriptionFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageTranscriptionFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.051 2.05 c -3.257 0.0 -5.898 2.64 -5.898 5.899 c 0.0 0.7 0.122 1.374 0.347 1.999 c 0.135 0.375 0.174 0.743 0.083 1.067 l -0.499 1.782 c -0.19 0.681 0.438 1.31 1.119 1.118 l 1.782 -0.498 c 0.324 -0.091 0.692 -0.052 1.067 0.083 c 0.625 0.225 1.298 0.347 2.0 0.347 c 3.257 0.0 5.898 -2.64 5.898 -5.898 c 0.0 -3.258 -2.641 -5.899 -5.899 -5.899 Z m 0.576 3.025 c 0.0 -0.235 -0.19 -0.425 -0.425 -0.425 c -0.234 0.0 -0.425 0.19 -0.425 0.425 v 6.05 c 0.0 0.234 0.19 0.425 0.425 0.425 s 0.425 -0.19 0.425 -0.425 v -6.05 Z m 1.845 1.238 c 0.235 0.0 0.425 0.19 0.425 0.425 v 2.723 c 0.0 0.235 -0.19 0.425 -0.425 0.425 s -0.425 -0.19 -0.425 -0.425 V 6.738 c 0.0 -0.234 0.19 -0.425 0.425 -0.425 Z M 6.36 6.738 c 0.0 -0.234 -0.19 -0.425 -0.425 -0.425 S 5.51 6.503 5.51 6.738 v 2.723 c 0.0 0.235 0.19 0.425 0.425 0.425 c 0.234 0.0 0.425 -0.19 0.425 -0.425 V 6.738 Z")
        )
    }.build()
}
