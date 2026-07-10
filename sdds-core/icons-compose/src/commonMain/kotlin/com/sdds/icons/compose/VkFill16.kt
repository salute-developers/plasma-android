package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VkFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VkFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.251 1.672 c 2.835 0.0 4.253 0.0 5.134 0.89 c 0.88 0.89 0.88 2.322 0.88 5.185 v 0.506 c 0.0 2.864 0.0 4.296 -0.88 5.185 c -0.881 0.89 -2.299 0.89 -5.134 0.89 H 7.75 c -2.835 0.0 -4.253 0.0 -5.134 -0.89 c -0.88 -0.89 -0.88 -2.322 -0.88 -5.185 V 7.747 c 0.0 -2.863 0.0 -4.296 0.88 -5.185 c 0.881 -0.89 2.299 -0.89 5.134 -0.89 h 0.501 Z M 3.85 5.522 C 3.917 8.811 5.546 10.79 8.4 10.79 h 0.162 V 8.907 c 1.05 0.106 1.843 0.881 2.162 1.883 h 1.483 c -0.407 -1.497 -1.478 -2.326 -2.146 -2.643 c 0.668 -0.39 1.608 -1.339 1.833 -2.626 h -1.348 c -0.293 1.045 -1.159 1.994 -1.984 2.083 V 5.521 H 7.217 v 3.65 C 6.38 8.96 5.327 7.937 5.279 5.52 H 3.85 Z")
        )
    }.build()
}
