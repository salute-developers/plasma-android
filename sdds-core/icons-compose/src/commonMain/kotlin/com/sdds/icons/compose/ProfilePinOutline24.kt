package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfilePinOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfilePinOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.88 7.0 c 0.569 0.0 1.003 0.516 0.914 1.086 l -0.547 3.46 c -0.056 0.354 0.034 0.716 0.249 1.002 l 1.575 2.094 c 0.65 0.864 0.04 2.108 -1.031 2.108 h -2.637 v 4.125 L 17.565 22.0 l -0.832 -1.125 V 16.75 H 14.09 c -1.072 0.0 -1.68 -1.245 -1.03 -2.108 l 1.575 -2.094 c 0.215 -0.286 0.304 -0.648 0.248 -1.002 l -0.546 -3.46 C 14.247 7.516 14.682 7.0 15.252 7.0 h 4.627 Z M 8.57 12.172 c 1.472 0.0 2.874 0.301 4.148 0.845 l -0.657 0.874 c -0.093 0.123 -0.172 0.252 -0.24 0.382 c -0.907 -0.348 -1.885 -0.556 -2.907 -0.594 L 8.57 13.672 c -1.841 0.0 -3.553 0.548 -4.984 1.488 c -0.165 0.109 -0.283 0.32 -0.283 0.581 c 0.0 0.445 0.362 0.806 0.807 0.806 h 7.686 c 0.337 0.711 0.99 1.268 1.848 1.414 c -0.196 0.054 -0.401 0.086 -0.614 0.086 H 4.11 c -1.274 0.0 -2.307 -1.032 -2.307 -2.306 c 0.0 -0.701 0.32 -1.415 0.96 -1.835 c 1.668 -1.095 3.664 -1.734 5.807 -1.734 Z m 7.796 -0.86 c 0.119 0.753 -0.072 1.526 -0.532 2.138 l -1.355 1.8 h 6.172 l -1.355 -1.8 c -0.46 -0.612 -0.65 -1.384 -0.53 -2.138 L 19.21 8.5 H 15.92 l 0.445 2.812 Z M 8.57 3.786 c 2.125 0.0 3.848 1.724 3.848 3.85 c 0.0 2.125 -1.723 3.848 -3.848 3.848 c -2.126 0.0 -3.85 -1.723 -3.85 -3.848 c 0.0 -2.126 1.724 -3.85 3.85 -3.85 Z m 0.0 1.5 c -1.298 0.0 -2.35 1.052 -2.35 2.35 c 0.0 1.297 1.053 2.348 2.35 2.348 c 1.297 0.0 2.348 -1.051 2.348 -2.348 s -1.051 -2.35 -2.348 -2.35 Z")
        )
    }.build()
}
