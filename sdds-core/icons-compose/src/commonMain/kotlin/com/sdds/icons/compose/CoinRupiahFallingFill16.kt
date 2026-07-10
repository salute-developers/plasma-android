package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRupiahFallingFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRupiahFallingFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.324 2.225 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 c -0.29 0.0 -0.525 0.235 -0.525 0.525 v 1.75 c 0.0 0.29 0.235 0.525 0.525 0.525 c 0.29 0.0 0.525 -0.235 0.525 -0.525 v -1.75 Z m -2.799 -0.7 C 8.525 1.235 8.29 1.0 8.0 1.0 C 7.71 1.0 7.475 1.235 7.475 1.525 v 1.75 C 7.475 3.565 7.71 3.8 8.0 3.8 c 0.29 0.0 0.525 -0.235 0.525 -0.525 v -1.75 Z M 5.199 1.7 c 0.29 0.0 0.525 0.235 0.525 0.525 v 1.75 C 5.724 4.265 5.49 4.5 5.2 4.5 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 v -1.75 C 4.674 1.935 4.91 1.7 5.2 1.7 Z m 8.051 8.05 C 13.25 12.65 10.9 15.0 8.0 15.0 s -5.25 -2.35 -5.25 -5.25 S 5.1 4.5 8.0 4.5 s 5.25 2.35 5.25 5.25 Z m -7.0 -2.8 c -0.193 0.0 -0.35 0.148 -0.35 0.33 c 0.0 0.181 0.157 0.329 0.35 0.329 h 1.3 c 0.427 0.0 0.74 0.17 0.953 0.4 C 8.62 8.14 8.706 8.283 8.758 8.42 H 6.576 c -0.194 0.0 -0.35 0.147 -0.35 0.33 c 0.0 0.181 0.156 0.328 0.35 0.328 h 2.183 C 8.706 9.217 8.62 9.361 8.503 9.488 c -0.211 0.229 -0.52 0.4 -0.942 0.402 H 7.55 H 6.423 c -0.378 0.0 -0.564 0.433 -0.291 0.68 l 2.475 2.238 c 0.14 0.126 0.36 0.122 0.495 -0.009 c 0.134 -0.13 0.13 -0.34 -0.01 -0.465 l -1.974 -1.786 H 7.55 c 0.65 0.0 1.15 -0.27 1.481 -0.627 c 0.233 -0.252 0.387 -0.553 0.455 -0.843 h 0.665 c 0.193 0.0 0.35 -0.147 0.35 -0.329 c 0.0 -0.182 -0.157 -0.329 -0.35 -0.329 H 9.486 C 9.42 8.142 9.276 7.854 9.059 7.61 h 1.091 c 0.194 0.0 0.35 -0.148 0.35 -0.33 c 0.0 -0.181 -0.156 -0.329 -0.35 -0.329 h -3.9 Z")
        )
    }.build()
}
