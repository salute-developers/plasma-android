package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BackspaceFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BackspaceFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.445 3.0 C 6.07 3.0 5.795 3.0 5.532 3.064 c -0.233 0.057 -0.456 0.15 -0.66 0.278 C 4.64 3.486 4.445 3.683 4.18 3.953 L 2.147 6.02 C 1.882 6.29 1.66 6.515 1.494 6.714 c -0.173 0.208 -0.317 0.422 -0.4 0.679 c -0.126 0.395 -0.126 0.82 0.0 1.214 c 0.083 0.257 0.227 0.471 0.4 0.679 C 1.66 9.485 1.882 9.71 2.147 9.98 l 2.034 2.067 c 0.265 0.27 0.459 0.467 0.69 0.61 c 0.205 0.128 0.428 0.222 0.66 0.279 C 5.797 13.0 6.07 13.0 6.446 13.0 h 5.239 c 0.473 0.0 0.86 0.0 1.175 -0.026 c 0.325 -0.027 0.62 -0.085 0.894 -0.227 c 0.43 -0.223 0.78 -0.578 0.998 -1.014 c 0.14 -0.28 0.197 -0.579 0.223 -0.91 C 15.0 10.504 15.0 10.112 15.0 9.63 V 6.37 c 0.0 -0.48 0.0 -0.874 -0.026 -1.194 c -0.026 -0.33 -0.083 -0.63 -0.223 -0.908 c -0.219 -0.437 -0.568 -0.792 -0.998 -1.015 c -0.275 -0.142 -0.569 -0.2 -0.894 -0.227 C 12.544 3.0 12.157 3.0 11.684 3.0 H 6.445 Z m 1.181 2.506 c -0.193 -0.197 -0.51 -0.2 -0.707 -0.005 c -0.197 0.193 -0.2 0.51 -0.006 0.707 L 8.677 8.0 L 6.913 9.792 c -0.193 0.197 -0.19 0.513 0.006 0.707 c 0.197 0.194 0.514 0.191 0.707 -0.006 l 1.752 -1.78 l 1.752 1.78 c 0.194 0.197 0.51 0.2 0.707 0.006 c 0.197 -0.194 0.2 -0.51 0.006 -0.707 L 10.079 8.0 l 1.764 -1.792 c 0.193 -0.197 0.19 -0.514 -0.006 -0.707 c -0.197 -0.194 -0.513 -0.192 -0.707 0.005 l -1.752 1.78 l -1.752 -1.78 Z")
        )
    }.build()
}
