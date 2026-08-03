package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarDashFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarDashFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.007 3.825 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 c -0.293 -0.293 -0.768 -0.293 -1.06 0.0 l -4.549 4.548 l -1.511 -3.635 c -0.328 -0.788 -1.445 -0.788 -1.773 0.0 L 9.037 8.672 l -5.39 0.432 c -0.852 0.068 -1.197 1.13 -0.549 1.686 l 4.108 3.518 l -0.062 0.26 l -5.168 5.167 c -0.293 0.293 -0.293 0.768 0.0 1.06 c 0.293 0.294 0.768 0.294 1.06 0.0 l 3.443 -3.442 v 0.001 L 20.007 3.825 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.385 20.61 c -0.593 0.363 -1.302 -0.005 -1.439 -0.602 L 17.111 8.844 l 3.243 0.26 c 0.851 0.068 1.196 1.13 0.548 1.686 l -4.107 3.518 l 1.254 5.26 c 0.199 0.83 -0.705 1.487 -1.434 1.042 L 12.0 17.791 l -4.615 2.82 Z")
        )
    }.build()
}
