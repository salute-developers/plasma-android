package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TimerExpressFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TimerExpressFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.559 1.75 c 0.0 -0.276 0.223 -0.5 0.5 -0.5 H 9.94 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 6.059 c -0.277 0.0 -0.5 -0.224 -0.5 -0.5 Z M 8.0 14.754 c 3.314 0.0 6.0 -2.639 6.0 -5.895 c 0.0 -1.544 -0.605 -2.95 -1.594 -4.001 l 0.448 -0.449 c 0.196 -0.195 0.196 -0.512 0.0 -0.707 c -0.195 -0.195 -0.511 -0.195 -0.707 0.0 l -0.486 0.486 C 10.648 3.421 9.378 2.964 8.0 2.964 c -3.314 0.0 -6.0 2.64 -6.0 5.895 c 0.0 3.256 2.686 5.895 6.0 5.895 Z m 1.223 -9.02 c 0.04 -0.117 -0.01 -0.245 -0.117 -0.307 c -0.108 -0.062 -0.246 -0.041 -0.33 0.05 L 5.246 9.29 C 5.177 9.367 5.159 9.477 5.2 9.571 c 0.043 0.095 0.138 0.155 0.242 0.155 h 2.104 L 6.78 11.985 C 6.74 12.1 6.789 12.229 6.897 12.29 c 0.108 0.063 0.245 0.042 0.33 -0.049 l 3.529 -3.815 c 0.07 -0.076 0.088 -0.186 0.046 -0.28 c -0.042 -0.094 -0.137 -0.155 -0.242 -0.155 H 8.457 l 0.766 -2.258 Z")
        )
    }.build()
}
