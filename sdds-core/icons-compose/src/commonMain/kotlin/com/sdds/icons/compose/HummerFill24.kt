package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HummerFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HummerFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.94 12.475 l -1.415 -1.414 l -7.48 7.48 c -0.39 0.39 -0.39 1.024 0.0 1.414 c 0.39 0.39 1.024 0.39 1.415 0.0 l 7.48 -7.48 Z M 10.995 9.47 l -8.01 8.01 c -0.977 0.977 -0.977 2.56 0.0 3.536 c 0.976 0.976 2.559 0.976 3.535 0.0 l 8.01 -8.01 c 0.217 -0.217 0.288 -0.286 0.346 -0.335 c 0.646 -0.53 1.577 -0.53 2.223 0.0 c 0.058 0.049 0.129 0.118 0.345 0.335 l 1.026 1.025 c 0.14 0.14 0.331 0.22 0.53 0.22 s 0.39 -0.08 0.53 -0.22 l 3.0 -3.0 c 0.293 -0.293 0.293 -0.768 0.0 -1.061 l -6.5 -6.5 c -1.949 -1.95 -5.11 -1.95 -7.06 0.0 C 8.829 3.61 8.75 3.802 8.75 4.0 c 0.0 0.2 0.079 0.39 0.22 0.53 l 2.025 2.026 c 0.216 0.217 0.286 0.287 0.334 0.346 c 0.53 0.646 0.53 1.577 0.0 2.222 c -0.048 0.059 -0.118 0.13 -0.334 0.346 Z")
        )
    }.build()
}
