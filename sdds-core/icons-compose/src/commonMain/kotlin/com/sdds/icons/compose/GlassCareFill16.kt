package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GlassCareFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GlassCareFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.416 1.62 c 0.053 -0.16 0.279 -0.16 0.332 0.0 l 0.38 1.144 c 0.21 0.632 0.71 1.128 1.343 1.334 l 1.16 0.377 c 0.16 0.052 0.16 0.28 0.0 0.333 l -1.16 0.377 c -0.634 0.206 -1.132 0.701 -1.343 1.334 l -0.38 1.144 c -0.053 0.16 -0.28 0.16 -0.332 0.0 l -0.38 -1.144 c -0.211 -0.633 -0.71 -1.128 -1.344 -1.334 L 8.534 4.808 c -0.162 -0.053 -0.162 -0.28 0.0 -0.333 l 1.158 -0.377 c 0.634 -0.206 1.133 -0.702 1.343 -1.334 l 0.38 -1.144 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.767 10.24 C 4.97 9.987 3.626 8.394 3.76 6.548 l 0.269 -3.723 c 0.006 -0.08 0.012 -0.168 0.024 -0.244 c 0.013 -0.087 0.038 -0.2 0.105 -0.314 c 0.09 -0.154 0.224 -0.278 0.385 -0.355 c 0.12 -0.057 0.236 -0.074 0.324 -0.081 c 0.078 -0.006 0.167 -0.006 0.248 -0.006 h 4.307 c 0.081 0.0 0.17 0.0 0.248 0.006 c 0.088 0.007 0.203 0.024 0.324 0.081 c 0.06 0.029 0.115 0.064 0.167 0.104 l -0.137 0.41 c -0.106 0.32 -0.358 0.57 -0.68 0.674 l -1.14 0.37 c -1.143 0.372 -1.143 1.97 0.0 2.342 l 1.14 0.37 c 0.322 0.106 0.574 0.356 0.68 0.674 l 0.375 1.128 c 0.02 0.058 0.046 0.118 0.078 0.178 h 0.027 c -0.473 1.092 -1.496 1.904 -2.736 2.078 v 2.873 c 1.335 0.117 2.348 0.693 2.348 1.386 H 4.42 c 0.0 -0.693 1.014 -1.27 2.348 -1.386 V 10.24 Z")
        )
    }.build()
}
