package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CandyFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CandyFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.534 1.233 c -0.368 -0.368 -0.995 -0.2 -1.13 0.303 l -0.458 1.71 C 9.11 2.86 8.092 3.007 7.41 3.69 L 3.737 7.362 C 3.054 8.045 2.907 9.062 3.29 9.9 l -1.708 0.457 c -0.502 0.134 -0.67 0.762 -0.303 1.13 l 3.283 3.283 c 0.368 0.367 0.995 0.2 1.13 -0.303 l 0.457 -1.708 c 0.837 0.385 1.854 0.237 2.537 -0.446 l 3.671 -3.672 c 0.683 -0.683 0.83 -1.7 0.446 -2.536 l 1.71 -0.458 c 0.502 -0.135 0.67 -0.762 0.303 -1.13 l -3.284 -3.283 Z m -9.149 9.944 l 1.565 -0.42 L 5.29 12.1 l -0.419 1.565 l -2.487 -2.487 Z m 9.76 -5.932 l 1.567 -0.42 l -2.487 -2.487 l -0.42 1.567 l 1.34 1.34 Z M 9.129 6.39 c 0.195 -0.195 0.195 -0.511 0.0 -0.707 c -0.196 -0.195 -0.512 -0.195 -0.707 0.0 L 5.729 8.376 c -0.195 0.195 -0.195 0.512 0.0 0.707 c 0.195 0.195 0.512 0.195 0.707 0.0 L 9.13 6.39 Z")
        )
    }.build()
}
