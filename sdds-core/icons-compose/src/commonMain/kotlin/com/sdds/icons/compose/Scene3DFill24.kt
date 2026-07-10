package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Scene3DFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Scene3DFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 2.626 3.306 L 2.608 3.3 C 2.506 3.263 2.396 3.222 2.3 3.195 C 2.223 3.173 2.013 3.113 1.776 3.168 c -0.258 0.06 -0.47 0.208 -0.614 0.43 c -0.13 0.2 -0.148 0.41 -0.155 0.495 C 1.0 4.19 1.0 4.303 1.0 4.405 v 11.272 c 0.0 0.086 0.0 0.19 0.007 0.28 c 0.008 0.093 0.03 0.283 0.148 0.47 c 0.137 0.217 0.345 0.369 0.593 0.433 c 0.217 0.057 0.407 0.018 0.495 -0.003 c 0.09 -0.02 0.19 -0.053 0.275 -0.08 l 0.017 -0.006 c 0.43 -0.137 1.125 -0.337 2.066 -0.539 C 4.534 15.832 4.5 15.42 4.5 15.0 c 0.0 -4.142 3.358 -7.5 7.5 -7.5 c 4.142 0.0 7.5 3.358 7.5 7.5 c 0.0 0.42 -0.035 0.831 -0.1 1.232 c 0.94 0.202 1.636 0.402 2.065 0.54 l 0.017 0.005 c 0.084 0.027 0.186 0.06 0.274 0.08 c 0.09 0.02 0.279 0.06 0.496 0.003 c 0.248 -0.064 0.456 -0.216 0.593 -0.433 c 0.119 -0.187 0.14 -0.377 0.148 -0.47 C 23.0 15.868 23.0 15.764 23.0 15.678 V 4.405 c 0.0 -0.102 0.0 -0.216 -0.007 -0.312 c -0.007 -0.085 -0.024 -0.295 -0.154 -0.496 c -0.145 -0.221 -0.357 -0.37 -0.615 -0.43 c -0.238 -0.054 -0.447 0.006 -0.525 0.028 c -0.095 0.027 -0.205 0.068 -0.307 0.105 l -0.018 0.006 C 20.294 3.701 17.437 4.5 12.0 4.5 c -5.437 0.0 -8.294 -0.799 -9.374 -1.194 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 6.0 15.0 c 0.0 -3.314 2.686 -6.0 6.0 -6.0 s 6.0 2.686 6.0 6.0 s -2.686 6.0 -6.0 6.0 s -6.0 -2.686 -6.0 -6.0 Z")
        )
    }.build()
}
