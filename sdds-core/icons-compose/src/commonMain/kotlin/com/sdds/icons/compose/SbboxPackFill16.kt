package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SbboxPackFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SbboxPackFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.925 1.175 C 10.925 1.078 11.003 1.0 11.1 1.0 h 1.4 c 0.097 0.0 0.175 0.078 0.175 0.175 V 2.4 c 0.0 0.27 -0.152 0.503 -0.375 0.62 v 4.281 c 0.497 0.005 0.797 0.027 1.048 0.12 c 0.523 0.195 0.935 0.608 1.13 1.131 C 14.6 8.878 14.6 9.285 14.6 10.1 v 2.1 c 0.0 0.815 0.0 1.222 -0.121 1.548 c -0.195 0.523 -0.608 0.936 -1.131 1.13 C 13.022 15.0 12.615 15.0 11.8 15.0 c -0.815 0.0 -1.222 0.0 -1.548 -0.121 c -0.523 -0.195 -0.936 -0.608 -1.13 -1.131 C 9.0 13.422 9.0 13.015 9.0 12.2 v -2.1 c 0.0 -0.815 0.0 -1.222 0.121 -1.548 c 0.195 -0.523 0.608 -0.936 1.131 -1.13 c 0.251 -0.094 0.55 -0.116 1.048 -0.12 V 3.02 c -0.223 -0.117 -0.375 -0.35 -0.375 -0.62 V 1.175 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.4 1.7 C 2.627 1.7 2.0 2.327 2.0 3.1 v 10.5 C 2.0 14.373 2.627 15.0 3.4 15.0 h 2.8 c 0.773 0.0 1.4 -0.627 1.4 -1.4 V 3.1 c 0.0 -0.773 -0.627 -1.4 -1.4 -1.4 H 3.4 Z m 1.4 4.9 c 0.58 0.0 1.05 -0.47 1.05 -1.05 c 0.0 -0.58 -0.47 -1.05 -1.05 -1.05 c -0.58 0.0 -1.05 0.47 -1.05 1.05 c 0.0 0.58 0.47 1.05 1.05 1.05 Z m 0.525 1.225 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 C 4.275 7.535 4.51 7.3 4.8 7.3 c 0.29 0.0 0.525 0.235 0.525 0.525 Z")
        )
    }.build()
}
