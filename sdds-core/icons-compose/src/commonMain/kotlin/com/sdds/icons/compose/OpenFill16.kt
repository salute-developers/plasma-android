package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.OpenFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "OpenFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.054 1.775 h 5.896 c 0.472 0.0 0.857 0.0 1.169 0.026 C 12.442 1.827 12.73 1.883 13.0 2.02 c 0.424 0.215 0.768 0.56 0.984 0.983 c 0.137 0.27 0.193 0.559 0.22 0.881 c 0.025 0.313 0.025 0.697 0.025 1.17 v 5.892 c 0.0 0.472 0.0 0.857 -0.026 1.17 c -0.026 0.322 -0.082 0.611 -0.22 0.88 c -0.215 0.424 -0.56 0.768 -0.983 0.984 c -0.27 0.137 -0.558 0.193 -0.881 0.22 c -0.312 0.025 -0.697 0.025 -1.17 0.025 H 5.055 c -0.472 0.0 -0.857 0.0 -1.17 -0.025 c -0.322 -0.027 -0.611 -0.083 -0.88 -0.22 c -0.424 -0.216 -0.768 -0.56 -0.984 -0.983 c -0.137 -0.27 -0.193 -0.56 -0.22 -0.882 c -0.025 -0.312 -0.025 -0.697 -0.025 -1.169 V 5.054 c 0.0 -0.472 0.0 -0.856 0.025 -1.169 c 0.027 -0.322 0.083 -0.612 0.22 -0.881 C 2.236 2.58 2.58 2.236 3.003 2.02 c 0.27 -0.138 0.559 -0.194 0.882 -0.22 c 0.312 -0.026 0.697 -0.026 1.169 -0.026 Z m 0.866 3.47 c -0.276 0.0 -0.5 0.223 -0.5 0.5 c 0.0 0.275 0.224 0.5 0.5 0.5 H 9.05 l -3.832 3.83 c -0.195 0.195 -0.195 0.512 0.0 0.707 c 0.195 0.195 0.512 0.195 0.707 0.0 l 3.832 -3.831 v 3.13 c 0.0 0.277 0.224 0.5 0.5 0.5 c 0.277 0.0 0.5 -0.223 0.5 -0.5 V 5.745 c 0.0 -0.276 -0.223 -0.5 -0.5 -0.5 H 5.92 Z")
        )
    }.build()
}
