package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GigaOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GigaOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 28.51 15.009 c 0.275 0.96 0.423 1.974 0.423 3.022 c 0.0 6.043 -4.899 10.944 -10.942 10.944 c -2.542 0.0 -4.882 -0.868 -6.74 -2.323 c 0.355 0.032 0.73 0.048 1.136 0.048 c 0.341 0.0 0.706 -0.011 1.098 -0.034 c 2.317 -0.17 4.711 -0.859 6.925 -1.994 c 2.238 -1.148 4.19 -2.7 5.646 -4.493 c 0.943 -1.195 2.074 -3.03 2.395 -5.254 l 0.059 0.084 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.557 6.466 c 0.77 0.0 1.529 0.064 2.268 0.194 c -2.756 0.256 -5.596 1.47 -8.452 3.611 c -0.121 0.09 -0.2 0.23 -0.214 0.38 c -0.015 0.15 0.035 0.303 0.137 0.415 c 0.932 1.027 1.863 2.151 2.933 3.536 c 0.177 0.23 0.503 0.279 0.742 0.109 c 2.154 -1.543 4.022 -2.686 5.832 -3.563 c -0.08 0.928 -1.322 2.365 -2.62 3.452 c -2.074 1.697 -4.572 3.462 -7.373 3.688 l -0.108 0.01 c -0.412 0.019 -0.855 -0.03 -1.315 -0.144 c -1.108 -0.284 -2.085 -1.25 -2.487 -2.456 c -0.169 -0.539 -0.192 -1.157 -0.069 -1.83 c 0.216 -1.107 0.778 -2.236 1.622 -3.264 l 0.013 -0.015 c 1.953 -2.581 5.352 -4.123 9.09 -4.123 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 3.0 c 8.284 0.0 15.0 6.715 15.0 15.0 s -6.716 15.0 -15.0 15.0 C 9.716 33.0 3.0 26.284 3.0 18.0 C 3.0 9.716 9.716 3.0 18.0 3.0 Z m 0.0 2.308 C 10.99 5.308 5.308 10.99 5.308 18.0 c 0.0 6.79 5.333 12.336 12.039 12.676 L 18.0 30.692 c 7.01 0.0 12.692 -5.682 12.692 -12.692 S 25.01 5.308 18.0 5.308 Z")
        )
    }.build()
}
