package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRialFallingFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRialFallingFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.326 2.225 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 c -0.29 0.0 -0.525 0.235 -0.525 0.525 v 1.75 c 0.0 0.29 0.235 0.525 0.525 0.525 c 0.29 0.0 0.525 -0.235 0.525 -0.525 v -1.75 Z m -2.8 -0.7 C 8.527 1.235 8.293 1.0 8.003 1.0 c -0.29 0.0 -0.525 0.235 -0.525 0.525 v 1.75 c 0.0 0.29 0.235 0.525 0.525 0.525 c 0.29 0.0 0.525 -0.235 0.525 -0.525 v -1.75 Z M 5.202 1.7 c 0.29 0.0 0.525 0.235 0.525 0.525 v 1.75 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 v -1.75 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 Z M 8.0 15.0 c 2.9 0.0 5.25 -2.35 5.25 -5.25 S 10.9 4.5 8.0 4.5 S 2.75 6.85 2.75 9.75 S 5.1 15.0 8.0 15.0 Z M 7.65 7.4 C 7.457 7.4 7.3 7.557 7.3 7.75 v 4.2 c 0.0 0.193 0.157 0.35 0.35 0.35 c 0.193 0.0 0.35 -0.157 0.35 -0.35 v -1.627 h 0.49 l 0.95 1.791 c 0.092 0.17 0.303 0.236 0.474 0.145 c 0.17 -0.09 0.236 -0.303 0.145 -0.473 l -0.84 -1.582 C 9.737 9.979 10.1 9.463 10.1 8.862 C 10.1 8.054 9.446 7.4 8.638 7.4 H 7.65 Z m 0.988 2.223 H 8.0 V 8.1 h 0.638 C 9.058 8.1 9.4 8.441 9.4 8.862 c 0.0 0.42 -0.341 0.761 -0.762 0.761 Z M 6.25 7.4 c 0.193 0.0 0.35 0.157 0.35 0.35 v 4.2 c 0.0 0.193 -0.157 0.35 -0.35 0.35 c -0.193 0.0 -0.35 -0.157 -0.35 -0.35 v -4.2 c 0.0 -0.193 0.157 -0.35 0.35 -0.35 Z")
        )
    }.build()
}
