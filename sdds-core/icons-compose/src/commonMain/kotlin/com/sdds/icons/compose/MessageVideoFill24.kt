package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageVideoFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageVideoFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.95 11.763 c 0.0 -4.577 3.71 -8.287 8.287 -8.287 c 4.577 0.0 8.288 3.71 8.288 8.287 c 0.0 4.577 -3.71 8.288 -8.288 8.288 c -0.984 0.0 -1.93 -0.172 -2.808 -0.489 c -0.527 -0.19 -1.045 -0.244 -1.5 -0.117 l -2.503 0.701 c -0.958 0.268 -1.84 -0.614 -1.572 -1.571 l 0.701 -2.503 c 0.128 -0.456 0.073 -0.973 -0.117 -1.5 c -0.316 -0.878 -0.488 -1.824 -0.488 -2.809 Z m 4.794 2.19 l -0.003 -0.008 c -0.116 -0.227 -0.116 -0.525 -0.116 -1.12 v -2.55 c 0.0 -0.595 0.0 -0.892 0.116 -1.12 c 0.101 -0.2 0.264 -0.362 0.464 -0.464 c 0.227 -0.116 0.525 -0.116 1.12 -0.116 h 2.125 c 0.595 0.0 0.892 0.0 1.12 0.116 c 0.199 0.101 0.36 0.263 0.463 0.462 m -5.289 4.8 c 0.102 0.196 0.263 0.356 0.461 0.457 c 0.227 0.116 0.525 0.116 1.12 0.116 h 2.125 c 0.595 0.0 0.893 0.0 1.12 -0.116 c 0.2 -0.102 0.362 -0.265 0.464 -0.465 c 0.116 -0.227 0.116 -0.524 0.116 -1.12 V 12.41 l 1.433 1.159 c 0.278 0.224 0.692 0.026 0.692 -0.331 V 9.864 c 0.0 -0.072 -0.017 -0.137 -0.046 -0.194 c -0.115 -0.226 -0.424 -0.316 -0.646 -0.137 l -1.433 1.158 v -0.415 c 0.0 -0.595 0.0 -0.893 -0.116 -1.12")
        )
    }.build()
}
