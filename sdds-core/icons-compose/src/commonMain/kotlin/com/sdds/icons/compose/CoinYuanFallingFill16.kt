package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinYuanFallingFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinYuanFallingFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.324 2.225 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 c -0.29 0.0 -0.525 0.235 -0.525 0.525 v 1.75 c 0.0 0.29 0.235 0.525 0.525 0.525 c 0.29 0.0 0.525 -0.235 0.525 -0.525 v -1.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.525 1.525 C 8.525 1.235 8.29 1.0 8.0 1.0 C 7.71 1.0 7.475 1.235 7.475 1.525 v 1.75 C 7.475 3.565 7.71 3.8 8.0 3.8 c 0.29 0.0 0.525 -0.235 0.525 -0.525 v -1.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.2 1.7 c 0.29 0.0 0.524 0.235 0.524 0.525 v 1.75 C 5.724 4.265 5.49 4.5 5.2 4.5 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 v -1.75 C 4.674 1.935 4.91 1.7 5.2 1.7 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 15.0 c 2.9 0.0 5.25 -2.35 5.25 -5.25 S 10.9 4.5 8.0 4.5 S 2.75 6.85 2.75 9.75 S 5.1 15.0 8.0 15.0 Z m -0.35 -3.658 v -0.915 H 6.367 c -0.194 0.0 -0.35 -0.157 -0.35 -0.35 c 0.0 -0.193 0.156 -0.35 0.35 -0.35 h 1.005 l -1.42 -2.293 c -0.101 -0.164 -0.05 -0.38 0.114 -0.482 c 0.164 -0.101 0.38 -0.05 0.482 0.114 L 8.0 9.412 l 1.452 -2.346 C 9.554 6.9 9.77 6.85 9.934 6.952 C 10.1 7.054 10.15 7.27 10.048 7.434 l -1.42 2.293 h 1.005 c 0.194 0.0 0.35 0.157 0.35 0.35 c 0.0 0.193 -0.156 0.35 -0.35 0.35 H 8.35 v 0.915 h 1.283 c 0.194 0.0 0.35 0.157 0.35 0.35 c 0.0 0.194 -0.156 0.35 -0.35 0.35 H 8.35 V 12.5 c 0.0 0.193 -0.157 0.35 -0.35 0.35 c -0.193 0.0 -0.35 -0.157 -0.35 -0.35 v -0.458 H 6.367 c -0.194 0.0 -0.35 -0.156 -0.35 -0.35 c 0.0 -0.193 0.156 -0.35 0.35 -0.35 H 7.65 Z")
        )
    }.build()
}
