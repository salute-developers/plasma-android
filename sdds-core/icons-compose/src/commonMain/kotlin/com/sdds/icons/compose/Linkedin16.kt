package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Linkedin16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Linkedin16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.49 7.343 v 0.02 H 8.477 l 0.013 -0.02 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.5 1.5 c -1.657 0.0 -3.0 1.343 -3.0 3.0 v 7.0 c 0.0 1.657 1.343 3.0 3.0 3.0 h 7.0 c 1.657 0.0 3.0 -1.343 3.0 -3.0 v -7.0 c 0.0 -1.657 -1.343 -3.0 -3.0 -3.0 h -7.0 Z m 0.94 10.882 v -5.87 H 3.476 v 5.87 H 5.44 Z M 4.458 5.71 c 0.685 0.0 1.111 -0.45 1.111 -1.014 C 5.556 4.12 5.143 3.682 4.471 3.682 c -0.671 0.0 -1.11 0.438 -1.11 1.014 c 0.0 0.564 0.425 1.014 1.084 1.014 h 0.013 Z m 2.068 6.672 H 8.49 V 9.104 c 0.0 -0.176 0.013 -0.35 0.064 -0.476 c 0.142 -0.35 0.466 -0.714 1.008 -0.714 c 0.71 0.0 0.995 0.538 0.995 1.328 v 3.14 h 1.963 V 9.016 c 0.0 -1.803 -0.969 -2.642 -2.26 -2.642 c -1.042 0.0 -1.51 0.569 -1.77 0.969 V 6.512 H 6.526 c 0.026 0.55 0.0 5.87 0.0 5.87 Z")
        )
    }.build()
}
