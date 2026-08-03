package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WrenchOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WrenchOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.115 2.181 c 1.224 -1.225 3.04 -1.496 4.527 -0.818 c 0.149 0.068 0.255 0.205 0.284 0.366 c 0.03 0.161 -0.023 0.327 -0.138 0.442 l -1.846 1.846 c -0.078 0.078 -0.078 0.205 0.0 0.283 l 0.76 0.76 c 0.077 0.077 0.204 0.077 0.282 0.0 l 1.845 -1.846 c 0.116 -0.116 0.281 -0.168 0.442 -0.139 c 0.162 0.03 0.299 0.136 0.367 0.285 c 0.677 1.487 0.405 3.301 -0.82 4.526 c -1.034 1.035 -2.492 1.39 -3.815 1.065 l -5.436 5.436 c -0.816 0.816 -2.14 0.816 -2.955 0.0 c -0.817 -0.816 -0.817 -2.14 0.0 -2.956 l 5.437 -5.438 C 6.726 4.671 7.08 3.215 8.115 2.181 Z m 3.383 -0.135 C 10.556 1.88 9.55 2.161 8.822 2.888 C 7.985 3.725 7.739 4.93 8.085 5.983 c 0.059 0.18 0.012 0.376 -0.121 0.51 l -5.645 5.645 c -0.426 0.426 -0.426 1.116 0.0 1.542 c 0.425 0.426 1.116 0.426 1.541 0.0 l 5.644 -5.644 c 0.133 -0.134 0.33 -0.18 0.51 -0.121 c 1.055 0.347 2.26 0.101 3.098 -0.736 c 0.727 -0.728 1.008 -1.733 0.842 -2.676 L 12.69 5.766 c -0.469 0.469 -1.228 0.469 -1.697 0.0 l -0.759 -0.759 c -0.469 -0.468 -0.469 -1.228 0.0 -1.697 l 1.264 -1.264 Z")
        )
    }.build()
}
