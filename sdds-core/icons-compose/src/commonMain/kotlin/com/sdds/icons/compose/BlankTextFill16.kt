package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BlankTextFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BlankTextFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.36 1.005 C 8.247 1.0 8.13 1.0 7.997 1.0 H 5.744 c -0.463 0.0 -0.842 0.0 -1.15 0.026 C 4.277 1.052 3.99 1.109 3.72 1.248 C 3.3 1.466 2.958 1.814 2.744 2.242 C 2.607 2.516 2.55 2.81 2.525 3.132 C 2.5 3.447 2.5 3.833 2.5 4.304 v 7.394 c 0.0 0.471 0.0 0.857 0.025 1.17 c 0.026 0.324 0.082 0.617 0.219 0.89 c 0.214 0.429 0.556 0.777 0.976 0.995 c 0.269 0.14 0.556 0.196 0.875 0.223 C 4.902 15.0 5.28 15.0 5.744 15.0 h 4.512 c 0.463 0.0 0.841 0.0 1.15 -0.025 c 0.318 -0.027 0.605 -0.084 0.874 -0.223 c 0.42 -0.218 0.762 -0.566 0.976 -0.994 c 0.137 -0.274 0.193 -0.566 0.219 -0.89 c 0.025 -0.314 0.025 -0.7 0.025 -1.17 V 6.601 c 0.0 -0.137 0.0 -0.261 -0.005 -0.377 h -2.416 c -0.375 0.0 -0.686 0.0 -0.94 -0.02 c -0.264 -0.022 -0.51 -0.069 -0.742 -0.187 c -0.358 -0.182 -0.648 -0.473 -0.83 -0.83 C 8.447 4.956 8.401 4.71 8.38 4.445 C 8.36 4.191 8.36 3.88 8.36 3.505 v -2.5 Z m 1.0 2.48 V 1.34 c 0.157 0.113 0.3 0.258 0.473 0.435 l 2.907 2.96 c 0.177 0.18 0.322 0.327 0.434 0.491 h -2.075 c -0.4 0.0 -0.67 0.0 -0.878 -0.017 c -0.203 -0.017 -0.303 -0.046 -0.37 -0.08 C 9.68 5.04 9.544 4.902 9.457 4.733 c -0.034 -0.068 -0.064 -0.167 -0.08 -0.37 C 9.36 4.156 9.359 3.885 9.359 3.485 Z M 5.25 8.0 c -0.276 0.0 -0.5 0.224 -0.5 0.5 S 4.974 9.0 5.25 9.0 h 5.5 c 0.276 0.0 0.5 -0.224 0.5 -0.5 S 11.026 8.0 10.75 8.0 h -5.5 Z m 0.0 3.0 c -0.276 0.0 -0.5 0.224 -0.5 0.5 S 4.974 12.0 5.25 12.0 h 5.5 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 h -5.5 Z")
        )
    }.build()
}
