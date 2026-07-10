package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HelicopterFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HelicopterFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 31.87 7.621 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 h -12.5 v 2.5 h 4.655 c 1.252 0.0 2.692 0.085 4.013 0.705 c 4.215 1.979 4.746 6.074 4.82 8.793 l 0.009 0.492 c 0.0 0.062 -0.001 0.122 -0.007 0.182 c -0.038 0.417 -0.224 0.789 -0.502 1.066 c -0.08 0.08 -0.166 0.151 -0.26 0.214 c -0.093 0.063 -0.193 0.117 -0.297 0.161 c -0.105 0.044 -0.215 0.079 -0.329 0.102 c -0.113 0.023 -0.231 0.035 -0.351 0.035 h -1.685 l 1.5 2.5 h 0.934 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 h -16.5 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 h 2.434 l 1.514 -2.525 c -0.583 -0.099 -1.077 -0.488 -1.311 -1.035 l -1.512 -3.519 l -10.848 -1.41 c -0.424 -0.055 -0.794 -0.315 -0.989 -0.697 l -0.855 -1.672 c -0.035 -0.067 -0.06 -0.135 -0.083 -0.203 l -0.495 -0.992 c -0.247 -0.493 -0.046 -1.094 0.448 -1.341 c 0.494 -0.247 1.094 -0.047 1.341 0.447 l 0.1 0.197 h 9.228 c 0.119 -0.816 0.811 -1.5 1.73 -1.5 h 1.298 v -2.5 H 4.87 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 h 27.0 Z m -10.282 16.25 c -0.024 0.09 -0.06 0.18 -0.11 0.265 l -1.341 2.235 h 8.466 l -1.34 -2.235 c -0.051 -0.085 -0.087 -0.174 -0.11 -0.265 h -5.565 Z m 0.836 -9.75 c 0.11 0.998 0.386 1.707 0.738 2.218 c 0.455 0.66 1.102 1.09 1.922 1.366 c 0.835 0.282 1.817 0.395 2.879 0.429 c 0.805 0.026 1.575 0.009 2.348 -0.003 c -0.49 -1.417 -1.408 -2.69 -3.123 -3.494 c -0.899 -0.422 -1.962 -0.516 -3.163 -0.516 h -1.601 Z")
        )
    }.build()
}
