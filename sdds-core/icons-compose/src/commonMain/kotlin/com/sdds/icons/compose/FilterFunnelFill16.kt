package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FilterFunnelFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FilterFunnelFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.273 1.5 C 2.984 1.5 2.75 1.736 2.75 2.027 v 2.024 c 0.0 1.212 0.54 2.36 1.471 3.127 l 2.02 1.687 c 0.203 0.166 0.32 0.416 0.32 0.68 v 4.428 c 0.0 0.165 0.078 0.321 0.209 0.42 c 0.13 0.1 0.3 0.132 0.458 0.087 l 1.802 -0.69 c 0.225 -0.064 0.38 -0.27 0.38 -0.506 V 9.558 c 0.0 -0.263 0.117 -0.513 0.32 -0.68 l 2.049 -1.7 c 0.931 -0.767 1.471 -1.915 1.471 -3.127 V 2.027 c 0.0 -0.291 -0.234 -0.527 -0.523 -0.527 H 3.273 Z M 8.51 3.786 c -0.29 0.0 -0.525 0.235 -0.525 0.525 c 0.0 0.29 0.235 0.525 0.525 0.525 h 2.79 c 0.29 0.0 0.525 -0.235 0.525 -0.525 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 H 8.51 Z")
        )
    }.build()
}
