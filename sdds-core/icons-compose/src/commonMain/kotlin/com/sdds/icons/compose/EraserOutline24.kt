package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EraserOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EraserOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.496 2.944 c 0.652 -0.212 1.356 -0.212 2.008 0.0 c 0.418 0.136 0.77 0.374 1.125 0.675 c 0.342 0.29 0.731 0.68 1.208 1.156 l 1.387 1.388 C 19.7 6.64 20.09 7.03 20.38 7.371 c 0.301 0.354 0.54 0.707 0.675 1.124 c 0.213 0.653 0.213 1.356 0.0 2.009 c -0.135 0.417 -0.374 0.77 -0.675 1.124 c -0.29 0.343 -0.68 0.732 -1.156 1.208 l -6.413 6.414 H 21.0 c 0.413 0.0 0.75 0.335 0.75 0.75 c 0.0 0.414 -0.337 0.75 -0.75 0.75 H 8.863 c -1.392 0.0 -2.728 -0.553 -3.712 -1.538 l -0.876 -0.876 C 3.8 17.86 3.41 17.471 3.12 17.128 c -0.301 -0.354 -0.54 -0.707 -0.675 -1.124 c -0.212 -0.653 -0.212 -1.356 0.0 -2.009 c 0.135 -0.417 0.374 -0.77 0.675 -1.124 c 0.29 -0.342 0.68 -0.732 1.156 -1.208 l 6.888 -6.888 C 11.64 4.3 12.029 3.91 12.37 3.62 c 0.355 -0.3 0.708 -0.54 1.125 -0.675 Z M 10.69 19.25 l 4.75 -4.75 L 9.5 8.56 L 5.36 12.701 c -0.504 0.504 -0.85 0.85 -1.096 1.14 c -0.24 0.284 -0.342 0.464 -0.392 0.618 c -0.114 0.351 -0.114 0.73 0.0 1.081 c 0.05 0.154 0.152 0.334 0.392 0.617 c 0.247 0.29 0.592 0.637 1.096 1.14 l 0.853 0.854 c 0.704 0.704 1.658 1.099 2.652 1.099 h 1.825 Z M 10.56 7.5 l 5.94 5.939 l 1.641 -1.641 c 0.504 -0.504 0.85 -0.85 1.096 -1.14 c 0.24 -0.284 0.342 -0.464 0.392 -0.618 c 0.114 -0.351 0.114 -0.73 0.0 -1.081 c -0.05 -0.154 -0.152 -0.334 -0.392 -0.617 c -0.246 -0.29 -0.592 -0.637 -1.096 -1.14 l -1.343 -1.344 c -0.504 -0.503 -0.85 -0.849 -1.14 -1.095 c -0.283 -0.24 -0.463 -0.342 -0.617 -0.392 c -0.352 -0.114 -0.73 -0.114 -1.082 0.0 c -0.153 0.05 -0.333 0.151 -0.617 0.392 c -0.29 0.246 -0.636 0.592 -1.14 1.095 L 10.561 7.5 Z")
        )
    }.build()
}
