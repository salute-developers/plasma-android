package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageCloseOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageCloseOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.793 8.683 C 9.5 8.39 9.025 8.39 8.732 8.683 c -0.293 0.293 -0.293 0.768 0.0 1.06 l 2.232 2.233 l -2.232 2.232 c -0.293 0.293 -0.293 0.768 0.0 1.06 c 0.293 0.293 0.768 0.293 1.06 0.0 l 2.233 -2.232 l 2.232 2.232 c 0.293 0.293 0.768 0.293 1.06 0.0 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 l -2.232 -2.232 l 2.232 -2.233 c 0.293 -0.292 0.293 -0.767 0.0 -1.06 c -0.292 -0.293 -0.767 -0.293 -1.06 0.0 l -2.232 2.232 l -2.232 -2.232 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.237 3.476 c -4.577 0.0 -8.287 3.71 -8.287 8.287 c 0.0 0.985 0.172 1.93 0.488 2.809 c 0.19 0.527 0.244 1.044 0.117 1.5 l -0.701 2.503 c -0.268 0.957 0.614 1.84 1.571 1.571 l 2.504 -0.7 c 0.455 -0.128 0.973 -0.073 1.5 0.116 c 0.877 0.317 1.823 0.489 2.808 0.489 c 4.577 0.0 8.288 -3.71 8.288 -8.288 c 0.0 -4.577 -3.71 -8.287 -8.288 -8.287 Z m -7.012 8.287 c 0.0 -3.873 3.14 -7.012 7.012 -7.012 c 3.873 0.0 7.013 3.14 7.013 7.012 c 0.0 3.873 -3.14 7.013 -7.013 7.013 c -0.835 0.0 -1.635 -0.146 -2.376 -0.413 c -0.689 -0.248 -1.488 -0.366 -2.276 -0.145 l -2.503 0.7 l 0.7 -2.502 c 0.221 -0.789 0.103 -1.588 -0.145 -2.276 c -0.267 -0.742 -0.412 -1.542 -0.412 -2.377 Z")
        )
    }.build()
}
