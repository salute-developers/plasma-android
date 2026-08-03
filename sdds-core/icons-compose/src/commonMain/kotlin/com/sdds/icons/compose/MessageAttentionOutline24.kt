package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageAttentionOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageAttentionOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.237 3.476 c -4.577 0.0 -8.287 3.71 -8.287 8.287 c 0.0 0.985 0.172 1.93 0.488 2.809 c 0.19 0.527 0.245 1.044 0.117 1.5 l -0.7 2.503 c -0.269 0.957 0.613 1.84 1.57 1.571 l 2.504 -0.7 c 0.455 -0.128 0.973 -0.073 1.5 0.116 c 0.878 0.317 1.824 0.489 2.808 0.489 c 4.577 0.0 8.288 -3.71 8.288 -8.288 c 0.0 -4.577 -3.71 -8.287 -8.288 -8.287 Z M 12.0 6.15 c 0.47 0.0 0.85 0.38 0.85 0.85 v 4.0 c 0.0 0.47 -0.38 0.85 -0.85 0.85 s -0.85 -0.38 -0.85 -0.85 V 7.0 c 0.0 -0.47 0.38 -0.85 0.85 -0.85 Z m 0.025 10.075 c 0.469 0.0 0.85 -0.38 0.85 -0.85 s -0.381 -0.85 -0.85 -0.85 c -0.47 0.0 -0.85 0.38 -0.85 0.85 s 0.38 0.85 0.85 0.85 Z")
        )
    }.build()
}
