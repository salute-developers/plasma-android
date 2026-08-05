package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ScissorsFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ScissorsFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.175 3.0 C 8.205 3.0 9.85 4.645 9.85 6.675 c 0.0 0.487 -0.097 0.95 -0.269 1.376 l 2.223 2.222 L 16.78 5.3 s 0.468 -0.606 2.1 -1.051 c 1.619 -0.441 2.437 -0.007 2.45 0.0 L 9.637 15.94 c 0.137 0.386 0.213 0.802 0.213 1.235 c 0.0 2.03 -1.646 3.675 -3.675 3.675 c -2.03 0.0 -3.675 -1.646 -3.675 -3.675 c 0.0 -2.03 1.645 -3.675 3.675 -3.675 c 0.688 0.0 1.332 0.19 1.883 0.52 l 1.996 -1.997 l -2.121 -2.12 C 7.41 10.186 6.812 10.35 6.175 10.35 c -2.03 0.0 -3.675 -1.646 -3.675 -3.675 C 2.5 4.645 4.145 3.0 6.175 3.0 Z m 0.0 12.0 C 4.974 15.0 4.0 15.974 4.0 17.175 c 0.0 1.201 0.974 2.174 2.175 2.175 c 1.201 0.0 2.175 -0.974 2.175 -2.175 C 8.35 15.974 7.376 15.0 6.175 15.0 Z m 5.53 -3.6 c -0.386 0.0 -0.7 0.314 -0.7 0.7 c 0.0 0.387 0.314 0.7 0.7 0.7 c 0.048 0.0 0.095 -0.006 0.14 -0.015 c 0.092 -0.018 0.177 -0.054 0.252 -0.104 c 0.186 -0.126 0.308 -0.339 0.308 -0.58 c 0.0 -0.097 -0.019 -0.19 -0.054 -0.273 c -0.036 -0.084 -0.087 -0.16 -0.15 -0.223 c -0.128 -0.126 -0.303 -0.205 -0.496 -0.205 Z m -5.53 -6.9 C 4.974 4.5 4.0 5.474 4.0 6.675 C 4.0 7.876 4.974 8.85 6.175 8.85 c 1.201 0.0 2.175 -0.974 2.175 -2.175 C 8.35 5.474 7.376 4.5 6.175 4.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.33 19.8 c -0.01 0.005 -0.828 0.442 -2.45 0.0 c -1.617 -0.441 -2.091 -1.04 -2.1 -1.05 l -4.025 -4.025 l 1.75 -1.75 L 21.33 19.8 Z")
        )
    }.build()
}
