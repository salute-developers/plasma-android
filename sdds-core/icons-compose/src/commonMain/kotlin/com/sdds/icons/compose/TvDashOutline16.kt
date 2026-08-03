package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TvDashOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TvDashOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.738 1.647 c 0.196 -0.196 0.512 -0.196 0.707 0.0 c 0.196 0.195 0.196 0.511 0.0 0.707 L 2.566 14.232 c -0.195 0.196 -0.512 0.196 -0.708 0.0 c -0.194 -0.195 -0.195 -0.511 0.0 -0.707 l 1.79 -1.789 H 1.77 c -0.04 0.0 -0.097 0.0 -0.147 -0.004 c -0.06 -0.005 -0.155 -0.018 -0.256 -0.069 c -0.127 -0.065 -0.23 -0.168 -0.295 -0.295 c -0.051 -0.1 -0.064 -0.196 -0.07 -0.256 C 1.0 11.062 1.0 11.006 1.0 10.966 V 3.27 c 0.0 -0.04 0.0 -0.097 0.004 -0.147 c 0.005 -0.06 0.018 -0.155 0.07 -0.256 c 0.064 -0.127 0.167 -0.23 0.294 -0.295 c 0.1 -0.051 0.196 -0.064 0.256 -0.07 C 1.674 2.5 1.73 2.5 1.771 2.5 h 11.114 l 0.853 -0.853 Z M 2.0 3.5 v 7.236 h 2.647 L 11.885 3.5 H 2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.62 13.497 H 4.71 l 1.007 -1.007 h 7.902 v 1.007 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.996 10.966 c 0.0 0.04 0.0 0.096 -0.004 0.146 c -0.005 0.06 -0.018 0.155 -0.07 0.256 c -0.064 0.127 -0.167 0.23 -0.294 0.295 c -0.101 0.051 -0.196 0.064 -0.256 0.07 c -0.05 0.004 -0.106 0.003 -0.146 0.003 H 6.47 l 1.0 -1.0 h 6.525 V 4.211 l 1.0 -1.0 v 7.755 Z")
        )
    }.build()
}
