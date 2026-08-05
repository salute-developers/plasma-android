package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwapVert16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwapVert16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.89 5.154 C 1.695 5.352 1.7 5.67 1.897 5.861 c 0.197 0.193 0.514 0.19 0.707 -0.008 l 1.582 -1.62 V 13.0 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 V 4.232 l 1.582 1.621 c 0.193 0.198 0.51 0.201 0.707 0.008 c 0.198 -0.192 0.202 -0.509 0.009 -0.707 l -2.44 -2.499 C 4.95 2.56 4.822 2.505 4.687 2.505 c -0.135 0.0 -0.264 0.054 -0.358 0.15 l -2.44 2.5 Z m 6.623 5.696 c -0.193 -0.198 -0.189 -0.514 0.009 -0.707 c 0.197 -0.193 0.514 -0.19 0.707 0.008 l 1.582 1.621 V 3.003 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 s 0.5 0.224 0.5 0.5 v 8.77 l 1.582 -1.622 c 0.193 -0.197 0.51 -0.2 0.707 -0.008 c 0.198 0.193 0.202 0.51 0.009 0.707 l -2.44 2.5 c -0.094 0.096 -0.223 0.15 -0.358 0.15 c -0.135 0.0 -0.264 -0.054 -0.358 -0.15 l -2.44 -2.5 Z")
        )
    }.build()
}
