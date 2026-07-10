package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TvModeOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TvModeOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.225 11.736 c 0.04 0.0 0.097 0.0 0.147 -0.004 c 0.06 -0.005 0.155 -0.018 0.256 -0.07 c 0.127 -0.064 0.23 -0.167 0.295 -0.294 c 0.051 -0.101 0.064 -0.196 0.07 -0.256 c 0.003 -0.05 0.003 -0.106 0.003 -0.146 V 3.27 c 0.0 -0.04 0.0 -0.096 -0.004 -0.146 c -0.005 -0.06 -0.018 -0.155 -0.07 -0.256 c -0.064 -0.127 -0.167 -0.23 -0.294 -0.295 c -0.101 -0.051 -0.196 -0.064 -0.256 -0.07 C 14.322 2.5 14.266 2.5 14.225 2.5 H 1.771 c -0.04 0.0 -0.097 0.0 -0.147 0.004 c -0.06 0.005 -0.155 0.018 -0.256 0.07 c -0.127 0.064 -0.23 0.167 -0.295 0.294 C 1.022 2.97 1.01 3.064 1.003 3.124 C 1.0 3.174 1.0 3.23 1.0 3.27 v 7.696 c 0.0 0.04 0.0 0.096 0.004 0.146 c 0.005 0.06 0.018 0.155 0.07 0.256 c 0.064 0.127 0.167 0.23 0.294 0.295 c 0.101 0.051 0.196 0.064 0.256 0.07 c 0.05 0.003 0.106 0.003 0.147 0.003 h 12.454 Z M 13.996 3.5 v 7.236 H 2.0 V 3.5 h 11.996 Z m -0.377 8.99 H 2.38 v 1.006 h 11.24 V 12.49 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.467 5.25 H 4.0 v 0.857 h 1.24 V 9.25 h 0.935 V 6.107 h 1.292 V 5.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.357 9.25 l 1.643 -4.0 H 11.06 L 9.907 8.124 L 8.773 5.25 H 7.784 l 1.66 4.0 h 0.913 Z")
        )
    }.build()
}
