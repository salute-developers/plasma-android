package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GlassFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GlassFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.976 3.0 C 4.86 3.0 4.736 3.0 4.627 3.009 c -0.124 0.01 -0.286 0.034 -0.455 0.115 c -0.227 0.11 -0.415 0.285 -0.54 0.504 C 3.537 3.79 3.501 3.95 3.482 4.074 C 3.467 4.182 3.458 4.306 3.45 4.42 L 3.072 9.708 c -0.186 2.605 1.677 4.856 4.178 5.236 v 4.091 C 5.4 19.211 4.0 20.024 4.0 21.0 h 8.0 c 0.0 -0.976 -1.4 -1.79 -3.25 -1.965 v -4.091 c 2.5 -0.38 4.363 -2.631 4.177 -5.236 L 12.55 4.42 c -0.009 -0.114 -0.017 -0.238 -0.034 -0.346 c -0.018 -0.123 -0.054 -0.283 -0.148 -0.446 c -0.125 -0.219 -0.313 -0.394 -0.54 -0.504 c -0.17 -0.081 -0.332 -0.106 -0.456 -0.115 C 11.264 2.999 11.138 3.0 11.024 3.0 H 4.976 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.53 5.0 c -0.122 0.0 -0.255 0.0 -0.37 0.01 c -0.13 0.01 -0.3 0.036 -0.478 0.126 c -0.235 0.12 -0.426 0.311 -0.546 0.547 c -0.09 0.176 -0.116 0.348 -0.127 0.478 C 15.0 6.275 15.0 6.408 15.0 6.53 V 14.0 c 0.0 1.398 0.956 2.573 2.25 2.905 v 2.158 C 15.956 19.285 15.0 20.068 15.0 21.0 h 6.0 c 0.0 -0.932 -0.956 -1.715 -2.25 -1.937 v -2.157 C 20.044 16.573 21.0 15.398 21.0 14.0 V 6.53 c 0.0 -0.122 0.0 -0.255 -0.01 -0.37 c -0.01 -0.13 -0.036 -0.3 -0.126 -0.477 c -0.12 -0.236 -0.311 -0.427 -0.547 -0.547 c -0.176 -0.09 -0.348 -0.116 -0.477 -0.127 C 19.725 5.0 19.591 5.0 19.47 5.0 h -2.94 Z")
        )
    }.build()
}
