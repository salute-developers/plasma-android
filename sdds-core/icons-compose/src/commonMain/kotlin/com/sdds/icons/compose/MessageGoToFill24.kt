package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageGoToFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageGoToFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.949 11.763 c 0.0 -4.577 3.71 -8.287 8.288 -8.287 c 4.396 0.0 7.993 3.423 8.27 7.75 h -7.523 l 1.695 -1.695 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 c -0.293 -0.293 -0.768 -0.293 -1.06 0.0 l -2.976 2.975 c -0.14 0.14 -0.22 0.331 -0.22 0.53 s 0.08 0.39 0.22 0.53 l 2.975 2.975 c 0.293 0.293 0.768 0.293 1.061 0.0 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 l -1.694 -1.695 h 7.484 c -0.478 4.123 -3.981 7.325 -8.233 7.325 c -0.984 0.0 -1.93 -0.172 -2.808 -0.489 c -0.527 -0.19 -1.045 -0.244 -1.5 -0.117 l -2.503 0.701 c -0.958 0.268 -1.84 -0.614 -1.572 -1.571 l 0.701 -2.503 c 0.128 -0.456 0.073 -0.973 -0.117 -1.5 c -0.316 -0.878 -0.488 -1.824 -0.488 -2.809 Z")
        )
    }.build()
}
