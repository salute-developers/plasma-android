package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HourglassTopFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HourglassTopFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.83 1.0 C 4.426 1.0 4.113 1.0 3.843 1.083 C 3.238 1.27 2.765 1.751 2.582 2.366 C 2.498 2.641 2.5 2.961 2.5 3.373 V 3.45 c 0.0 1.177 0.708 2.218 1.448 2.996 C 4.58 7.11 5.298 7.65 5.815 8.0 C 5.298 8.35 4.58 8.89 3.948 9.554 C 3.208 10.333 2.5 11.373 2.5 12.55 v 0.077 c 0.0 0.413 0.0 0.732 0.081 1.007 c 0.184 0.615 0.657 1.097 1.26 1.283 C 4.113 15.001 4.426 15.0 4.832 15.0 h 6.338 c 0.405 0.0 0.719 0.0 0.99 -0.083 c 0.603 -0.186 1.076 -0.668 1.26 -1.283 c 0.082 -0.275 0.081 -0.594 0.081 -1.007 V 12.55 c 0.0 -1.177 -0.708 -2.217 -1.448 -2.996 C 11.42 8.89 10.702 8.35 10.185 8.0 c 0.517 -0.35 1.235 -0.89 1.867 -1.554 c 0.74 -0.778 1.448 -1.819 1.448 -2.996 V 3.373 c 0.0 -0.412 0.0 -0.732 -0.082 -1.007 c -0.183 -0.615 -0.656 -1.096 -1.26 -1.283 C 11.888 0.999 11.575 1.0 11.17 1.0 H 4.831 Z m 2.36 5.405 l 0.014 0.01 c 0.442 0.282 1.078 0.327 1.59 0.0 l 0.015 -0.01 c 0.45 -0.288 1.17 -0.8 1.76 -1.42 c 0.464 -0.488 0.79 -0.977 0.854 -1.612 c 0.01 -0.084 0.014 -0.126 -0.004 -0.167 c -0.014 -0.033 -0.044 -0.067 -0.076 -0.085 c -0.038 -0.022 -0.086 -0.023 -0.18 -0.024 c -2.108 -0.027 -4.22 -0.027 -6.328 0.0 C 4.741 3.098 4.694 3.1 4.655 3.121 C 4.623 3.139 4.593 3.173 4.579 3.206 C 4.562 3.247 4.566 3.289 4.575 3.373 c 0.065 0.635 0.39 1.124 0.854 1.612 c 0.59 0.62 1.311 1.132 1.76 1.42 Z")
        )
    }.build()
}
