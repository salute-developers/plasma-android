package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.KeyFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "KeyFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.25 5.553 c 0.0 2.238 -1.788 4.053 -3.993 4.053 c -0.822 0.0 -1.586 -0.252 -2.22 -0.684 c -0.122 -0.082 -0.294 0.002 -0.294 0.15 v 1.592 c 0.0 0.097 -0.077 0.176 -0.173 0.176 H 6.09 c -0.096 0.0 -0.173 0.08 -0.173 0.176 v 1.234 c 0.0 0.097 -0.078 0.176 -0.174 0.176 H 4.048 c -0.096 0.0 -0.174 0.079 -0.174 0.176 v 1.722 c 0.0 0.097 -0.078 0.176 -0.174 0.176 H 1.924 c -0.096 0.0 -0.174 -0.079 -0.174 -0.176 v -3.0 c 0.0 -0.047 0.018 -0.092 0.051 -0.125 l 4.514 -4.582 C 6.358 6.573 6.375 6.51 6.362 6.45 C 6.297 6.161 6.264 5.861 6.264 5.553 c 0.0 -2.238 1.787 -4.053 3.993 -4.053 c 2.205 0.0 3.993 1.815 3.993 4.053 Z M 11.125 5.73 c 0.575 0.0 1.042 -0.474 1.042 -1.058 c 0.0 -0.584 -0.467 -1.057 -1.042 -1.057 s -1.042 0.473 -1.042 1.057 s 0.467 1.058 1.042 1.058 Z")
        )
    }.build()
}
