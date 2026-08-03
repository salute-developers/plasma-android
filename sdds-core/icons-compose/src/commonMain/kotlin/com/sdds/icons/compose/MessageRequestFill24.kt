package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageRequestFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageRequestFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.967 11.226 h 7.097 L 9.369 9.531 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 c 0.293 -0.293 0.768 -0.293 1.06 0.0 l 2.976 2.975 c 0.14 0.14 0.22 0.331 0.22 0.53 s -0.08 0.39 -0.22 0.53 l -2.975 2.975 c -0.293 0.293 -0.768 0.293 -1.06 0.0 c -0.294 -0.293 -0.294 -0.768 0.0 -1.06 l 1.694 -1.695 H 4.005 c 0.074 0.64 0.221 1.258 0.433 1.846 c 0.19 0.527 0.245 1.044 0.117 1.5 l -0.7 2.503 c -0.269 0.957 0.613 1.84 1.57 1.571 l 2.504 -0.7 c 0.455 -0.128 0.973 -0.073 1.5 0.116 c 0.878 0.317 1.824 0.489 2.808 0.489 c 4.577 0.0 8.288 -3.71 8.288 -8.288 c 0.0 -4.577 -3.71 -8.287 -8.288 -8.287 c -4.396 0.0 -7.993 3.423 -8.27 7.75 Z")
        )
    }.build()
}
