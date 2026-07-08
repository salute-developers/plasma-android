package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRandFallingOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRandFallingOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.8 1.7 c 0.29 0.0 0.526 0.235 0.526 0.525 v 1.75 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 v -1.75 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.002 1.0 c 0.29 0.0 0.525 0.235 0.525 0.525 v 1.75 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 v -1.75 C 7.477 1.235 7.712 1.0 8.002 1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.726 2.225 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 c -0.29 0.0 -0.525 0.235 -0.525 0.525 v 1.75 c 0.0 0.29 0.235 0.525 0.525 0.525 c 0.29 0.0 0.525 -0.235 0.525 -0.525 v -1.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.75 6.9 C 6.557 6.9 6.4 7.057 6.4 7.25 v 4.9 c 0.0 0.193 0.157 0.35 0.35 0.35 c 0.193 0.0 0.35 -0.157 0.35 -0.35 v -1.956 h 0.853 l 1.298 2.138 c 0.1 0.165 0.315 0.217 0.48 0.117 c 0.166 -0.1 0.218 -0.315 0.118 -0.48 l -1.12 -1.845 C 9.407 9.92 9.9 9.291 9.9 8.547 C 9.9 7.637 9.163 6.9 8.254 6.9 H 6.75 Z M 7.1 9.494 V 7.6 h 1.153 C 8.776 7.6 9.2 8.024 9.2 8.547 c 0.0 0.523 -0.424 0.947 -0.947 0.947 H 7.1 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 4.5 c 2.899 0.0 5.25 2.35 5.25 5.25 S 10.898 15.0 8.0 15.0 c -2.9 0.0 -5.25 -2.35 -5.25 -5.25 S 5.1 4.5 8.0 4.5 Z m 4.2 5.25 c 0.0 -2.32 -1.88 -4.2 -4.2 -4.2 c -2.32 0.0 -4.2 1.88 -4.2 4.2 c 0.0 2.32 1.88 4.2 4.2 4.2 c 2.32 0.0 4.2 -1.88 4.2 -4.2 Z")
        )
    }.build()
}
