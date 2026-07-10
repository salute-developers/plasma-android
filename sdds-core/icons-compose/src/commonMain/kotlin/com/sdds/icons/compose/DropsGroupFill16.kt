package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DropsGroupFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DropsGroupFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.782 8.063 c 0.099 -0.084 0.237 -0.084 0.335 0.0 L 8.17 8.11 l 0.11 0.103 C 8.341 8.27 8.406 8.335 8.476 8.406 c 0.263 0.27 0.527 0.575 0.774 0.907 c 0.716 0.967 1.15 1.975 1.15 2.987 c 0.0 1.49 -1.097 2.7 -2.45 2.7 c -1.353 0.0 -2.45 -1.21 -2.45 -2.7 c 0.0 -1.012 0.434 -2.02 1.15 -2.987 c 0.247 -0.332 0.511 -0.637 0.775 -0.907 c 0.07 -0.07 0.135 -0.136 0.196 -0.194 l 0.06 -0.057 l 0.101 -0.092 Z m -3.5 -7.0 c 0.099 -0.084 0.237 -0.084 0.335 0.0 L 4.67 1.11 l 0.11 0.103 C 4.841 1.27 4.906 1.335 4.976 1.406 c 0.263 0.27 0.527 0.575 0.774 0.907 C 6.466 3.28 6.9 4.288 6.9 5.3 C 6.9 6.79 5.803 8.0 4.45 8.0 C 3.097 8.0 2.0 6.79 2.0 5.3 c 0.0 -1.012 0.434 -2.02 1.15 -2.987 c 0.247 -0.332 0.511 -0.637 0.775 -0.907 c 0.07 -0.07 0.135 -0.136 0.196 -0.194 l 0.06 -0.057 l 0.101 -0.092 Z m 7.0 0.0 c 0.099 -0.084 0.237 -0.084 0.335 0.0 L 11.67 1.11 l 0.11 0.103 c 0.062 0.058 0.127 0.123 0.197 0.194 c 0.263 0.27 0.527 0.575 0.774 0.907 C 13.466 3.28 13.9 4.288 13.9 5.3 c 0.0 1.49 -1.097 2.7 -2.45 2.7 C 10.097 8.0 9.0 6.79 9.0 5.3 c 0.0 -1.012 0.434 -2.02 1.15 -2.987 c 0.247 -0.332 0.511 -0.637 0.775 -0.907 c 0.07 -0.07 0.135 -0.136 0.196 -0.194 l 0.06 -0.057 l 0.101 -0.092 Z")
        )
    }.build()
}
