package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarDashOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarDashOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 20.25 3.825 c 0.294 -0.293 0.294 -0.768 0.0 -1.06 c -0.292 -0.293 -0.767 -0.293 -1.06 0.0 l -4.548 4.548 l -1.512 -3.635 c -0.328 -0.788 -1.444 -0.788 -1.772 0.0 L 9.28 8.672 L 3.89 9.104 c -0.852 0.068 -1.197 1.13 -0.549 1.686 l 4.107 3.518 l -0.061 0.26 l -5.168 5.167 c -0.293 0.293 -0.293 0.768 0.0 1.06 c 0.293 0.294 0.767 0.294 1.06 0.0 l 3.443 -3.442 v 0.001 l 2.025 -2.025 v -0.001 l 5.438 -5.438 l 6.065 -6.065 Z M 13.496 8.46 l -1.251 -3.007 l -1.705 4.1 c -0.138 0.331 -0.45 0.559 -0.81 0.587 l -4.425 0.355 l 3.316 2.84 l 4.875 -4.875 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.961 10.237 l 1.394 -1.393 l 3.243 0.26 c 0.851 0.068 1.196 1.13 0.548 1.686 l -4.107 3.518 l 1.254 5.26 c 0.198 0.83 -0.705 1.487 -1.434 1.042 l -4.615 -2.819 l -4.615 2.82 c -0.593 0.362 -1.302 -0.006 -1.439 -0.603 l 1.893 -1.893 l -0.128 0.539 l 3.789 -2.315 c 0.307 -0.187 0.693 -0.187 1.0 0.0 l 3.79 2.315 l -1.031 -4.319 c -0.084 -0.35 0.036 -0.718 0.31 -0.952 l 3.37 -2.888 l -3.222 -0.258 Z")
        )
    }.build()
}
