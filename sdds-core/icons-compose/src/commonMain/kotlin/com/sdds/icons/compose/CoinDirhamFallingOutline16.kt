package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinDirhamFallingOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinDirhamFallingOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.326 2.225 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 c -0.29 0.0 -0.525 0.235 -0.525 0.525 v 1.75 c 0.0 0.29 0.235 0.525 0.525 0.525 c 0.29 0.0 0.525 -0.236 0.525 -0.525 v -1.75 Z m -2.8 -0.7 C 8.527 1.235 8.293 1.0 8.003 1.0 c -0.29 0.0 -0.525 0.235 -0.525 0.525 v 1.75 c 0.0 0.29 0.235 0.525 0.525 0.525 c 0.29 0.0 0.525 -0.235 0.525 -0.525 v -1.75 Z M 5.202 1.7 c 0.29 0.0 0.525 0.235 0.525 0.525 v 1.75 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.29 0.0 -0.525 -0.236 -0.525 -0.525 v -1.75 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 Z M 8.0 5.55 c 2.32 0.0 4.2 1.88 4.2 4.2 c 0.0 2.32 -1.88 4.2 -4.2 4.2 c -2.32 0.0 -4.2 -1.88 -4.2 -4.2 c 0.0 -2.32 1.88 -4.2 4.2 -4.2 Z m 5.25 4.2 c 0.0 -2.9 -2.351 -5.25 -5.25 -5.25 c -2.9 0.0 -5.25 2.35 -5.25 5.25 S 5.1 15.0 8.0 15.0 c 2.899 0.0 5.25 -2.35 5.25 -5.25 Z M 8.582 7.4 c 0.193 0.0 0.35 0.157 0.35 0.35 v 1.498 H 10.1 V 7.75 c 0.0 -0.193 0.156 -0.35 0.35 -0.35 c 0.193 0.0 0.35 0.157 0.35 0.35 v 3.85 c 0.0 0.193 -0.157 0.35 -0.35 0.35 c -0.194 0.0 -0.35 -0.157 -0.35 -0.35 V 9.948 H 8.933 V 11.6 c 0.0 0.193 -0.157 0.35 -0.35 0.35 c -0.193 0.0 -0.35 -0.157 -0.35 -0.35 V 7.75 c 0.0 -0.193 0.157 -0.35 0.35 -0.35 Z m -3.033 0.0 C 5.357 7.4 5.2 7.557 5.2 7.75 v 3.85 c 0.0 0.193 0.157 0.35 0.35 0.35 h 0.288 C 7.032 11.95 8.0 10.982 8.0 9.788 C 8.0 8.47 6.93 7.4 5.612 7.4 H 5.55 Z m 0.35 3.849 V 8.124 c 0.795 0.137 1.4 0.83 1.4 1.664 c 0.0 0.787 -0.622 1.428 -1.4 1.46 Z")
        )
    }.build()
}
