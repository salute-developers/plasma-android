package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloudOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloudOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.515 13.076 C 5.773 13.998 3.0 17.382 3.0 21.414 C 3.0 26.154 6.834 30.0 11.568 30.0 h 14.756 C 30.014 30.0 33.0 27.003 33.0 23.31 c 0.0 -2.681 -1.575 -4.994 -3.848 -6.061 c 0.043 -0.376 0.064 -0.758 0.064 -1.146 C 29.216 10.526 24.706 6.0 19.136 6.0 c -4.518 0.0 -8.338 2.977 -9.621 7.076 Z m 2.226 -0.247 c 4.654 0.093 8.394 3.903 8.394 8.585 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 c 0.0 -3.64 -2.943 -6.586 -6.567 -6.586 c -0.372 0.0 -0.736 0.03 -1.089 0.09 C 7.372 15.437 5.0 18.146 5.0 21.413 C 5.0 25.054 7.943 28.0 11.568 28.0 h 14.756 C 28.904 28.0 31.0 25.903 31.0 23.31 c 0.0 -2.095 -1.37 -3.87 -3.26 -4.471 c -0.486 -0.154 -0.778 -0.648 -0.679 -1.147 c 0.102 -0.513 0.155 -1.044 0.155 -1.589 c 0.0 -4.477 -3.62 -8.103 -8.08 -8.103 c -3.3 0.0 -6.14 1.984 -7.395 4.83 Z")
        )
    }.build()
}
