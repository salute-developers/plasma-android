package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FilterFunnelFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FilterFunnelFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.871 4.0 C 7.251 4.0 6.75 4.508 6.75 5.135 v 4.36 c 0.0 2.61 1.157 5.083 3.152 6.736 l 4.33 3.631 c 0.434 0.36 0.686 0.897 0.686 1.464 v 9.539 c 0.0 0.356 0.165 0.692 0.446 0.906 c 0.28 0.215 0.644 0.283 0.983 0.185 l 3.86 -1.483 c 0.482 -0.14 0.814 -0.585 0.814 -1.092 v -8.025 c 0.0 -0.567 0.252 -1.105 0.685 -1.464 l 4.392 -3.662 c 1.995 -1.652 3.152 -4.125 3.152 -6.735 v -4.36 C 29.25 4.508 28.748 4.0 28.129 4.0 H 7.87 Z m 11.22 4.93 c -0.622 0.0 -1.125 0.503 -1.125 1.124 c 0.0 0.621 0.503 1.125 1.125 1.125 h 5.979 c 0.621 0.0 1.125 -0.504 1.125 -1.125 S 25.69 8.93 25.07 8.93 h -5.98 Z")
        )
    }.build()
}
