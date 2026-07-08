package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CallMissedFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CallMissedFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.579 13.05 c 0.173 -0.176 0.277 -0.418 0.277 -0.749 c 0.0 -0.524 0.0 -1.706 -0.875 -2.756 c -0.875 -1.05 -2.625 -1.969 -6.125 -1.969 s -5.25 0.92 -6.125 1.969 c -0.875 1.05 -0.875 2.232 -0.875 2.756 c 0.0 0.33 0.104 0.573 0.277 0.749 c 0.174 0.175 0.419 0.284 0.703 0.345 c 0.567 0.122 1.288 0.05 1.904 -0.064 c 0.2 -0.037 0.335 -0.063 0.428 -0.086 c 0.098 -0.024 0.186 -0.051 0.275 -0.101 c 0.082 -0.047 0.14 -0.084 0.19 -0.13 l 0.014 -0.012 c 0.084 -0.047 0.153 -0.129 0.202 -0.254 l 0.01 -0.053 c 0.023 -0.053 0.053 -0.13 0.09 -0.24 c 0.065 -0.191 0.143 -0.45 0.246 -0.796 c 0.128 -0.429 0.361 -0.881 0.778 -1.226 C 6.39 10.09 6.99 9.851 7.856 9.851 s 1.466 0.238 1.883 0.582 c 0.417 0.345 0.65 0.797 0.778 1.225 c 0.103 0.346 0.18 0.606 0.245 0.797 c 0.07 0.203 0.111 0.29 0.135 0.332 l 0.003 -0.002 l 0.03 0.053 H 10.93 c 0.008 0.013 0.017 0.024 0.025 0.035 c 0.012 0.017 0.025 0.034 0.039 0.05 c 0.028 0.035 0.055 0.065 0.085 0.091 c 0.05 0.046 0.108 0.083 0.191 0.13 c 0.09 0.05 0.176 0.077 0.274 0.1 c 0.094 0.024 0.229 0.05 0.43 0.087 c 0.615 0.114 1.336 0.186 1.903 0.064 c 0.284 -0.06 0.529 -0.17 0.703 -0.345 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.104 1.646 c 0.107 0.108 0.16 0.258 0.143 0.41 l -0.35 3.15 c -0.03 0.274 -0.278 0.471 -0.552 0.44 c -0.275 -0.03 -0.473 -0.277 -0.442 -0.551 l 0.193 -1.734 L 9.688 5.77 c -1.015 1.015 -2.661 1.015 -3.677 0.0 L 3.646 3.404 c -0.195 -0.196 -0.195 -0.512 0.0 -0.708 c 0.196 -0.195 0.512 -0.195 0.708 0.0 l 2.365 2.366 c 0.624 0.624 1.637 0.624 2.262 0.0 l 2.408 -2.408 l -1.734 0.193 C 9.381 2.877 9.134 2.68 9.103 2.405 C 9.073 2.131 9.27 1.884 9.545 1.853 l 3.15 -0.35 c 0.15 -0.017 0.301 0.036 0.409 0.143 Z")
        )
    }.build()
}
