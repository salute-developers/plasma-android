package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRupiahFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRupiahFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.24 11.8 c 0.67 -1.001 1.06 -2.205 1.06 -3.5 C 14.3 4.82 11.48 2.0 8.0 2.0 C 4.522 2.0 1.7 4.82 1.7 8.3 c 0.0 1.295 0.392 2.499 1.062 3.5 h 5.545 L 5.704 9.196 c -0.05 -0.05 -0.089 -0.108 -0.114 -0.17 c -0.026 -0.062 -0.04 -0.13 -0.04 -0.2 c 0.0 -0.072 0.014 -0.14 0.04 -0.202 c 0.025 -0.062 0.063 -0.12 0.114 -0.17 c 0.05 -0.05 0.108 -0.088 0.17 -0.114 c 0.062 -0.026 0.13 -0.04 0.201 -0.04 h 1.4 c 0.404 0.0 0.7 -0.177 0.907 -0.424 c 0.073 -0.087 0.133 -0.181 0.18 -0.276 H 6.425 C 6.135 7.6 5.9 7.365 5.9 7.075 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 h 2.137 c -0.047 -0.094 -0.107 -0.188 -0.18 -0.276 C 8.176 6.027 7.88 5.85 7.475 5.85 h -1.4 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 h 4.2 c 0.29 0.0 0.525 0.235 0.525 0.525 c 0.0 0.29 -0.235 0.525 -0.525 0.525 H 9.37 c 0.142 0.222 0.246 0.462 0.309 0.7 h 0.596 c 0.29 0.0 0.525 0.235 0.525 0.525 c 0.0 0.29 -0.235 0.525 -0.525 0.525 H 9.679 C 9.592 7.93 9.426 8.264 9.188 8.55 c -0.379 0.452 -0.957 0.8 -1.713 0.8 H 7.342 l 1.904 1.904 c 0.148 0.148 0.19 0.361 0.124 0.546 h 3.87 Z M 1.525 12.85 C 1.235 12.85 1.0 13.085 1.0 13.375 c 0.0 0.29 0.235 0.525 0.525 0.525 h 12.95 c 0.29 0.0 0.525 -0.235 0.525 -0.525 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 H 1.525 Z")
        )
    }.build()
}
