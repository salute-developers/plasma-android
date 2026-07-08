package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CallMissedFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CallMissedFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.03 3.47 c 0.161 0.16 0.24 0.386 0.215 0.613 l -0.5 4.5 C 18.7 8.995 18.33 9.29 17.917 9.245 C 17.505 9.2 17.21 8.83 17.255 8.417 l 0.264 -2.375 l -3.367 3.367 c -1.465 1.464 -3.84 1.464 -5.304 0.0 L 5.47 6.03 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 c 0.293 -0.293 0.767 -0.293 1.06 0.0 L 9.91 8.348 c 0.879 0.879 2.303 0.879 3.182 0.0 l 3.367 -3.366 l -2.375 0.263 c -0.412 0.046 -0.783 -0.25 -0.828 -0.662 c -0.046 -0.412 0.25 -0.783 0.662 -0.828 l 4.5 -0.5 c 0.227 -0.026 0.452 0.054 0.613 0.215 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.827 19.928 c 0.247 -0.25 0.396 -0.597 0.396 -1.069 c 0.0 -0.75 0.0 -2.437 -1.25 -3.937 s -3.75 -2.813 -8.75 -2.813 s -7.5 1.313 -8.75 2.813 c -1.25 1.5 -1.25 3.188 -1.25 3.937 c 0.0 0.472 0.148 0.819 0.396 1.07 c 0.249 0.25 0.598 0.406 1.004 0.493 c 0.81 0.174 1.84 0.07 2.72 -0.092 c 0.286 -0.053 0.478 -0.09 0.612 -0.123 c 0.14 -0.034 0.265 -0.072 0.392 -0.144 c 0.118 -0.066 0.2 -0.12 0.273 -0.185 l 0.018 -0.017 c 0.12 -0.067 0.22 -0.184 0.29 -0.363 l 0.015 -0.078 c 0.033 -0.076 0.075 -0.184 0.128 -0.342 c 0.092 -0.272 0.203 -0.643 0.35 -1.137 c 0.184 -0.612 0.516 -1.258 1.112 -1.75 c 0.595 -0.492 1.454 -0.832 2.69 -0.832 s 2.095 0.34 2.69 0.832 c 0.595 0.492 0.928 1.137 1.111 1.75 c 0.148 0.494 0.259 0.865 0.351 1.137 c 0.098 0.291 0.159 0.416 0.192 0.476 l 0.005 -0.003 c 0.013 0.025 0.027 0.05 0.043 0.074 l -0.002 0.002 l 0.036 0.05 c 0.017 0.024 0.035 0.048 0.055 0.07 c 0.04 0.051 0.08 0.093 0.122 0.131 c 0.072 0.065 0.155 0.119 0.273 0.185 c 0.127 0.072 0.252 0.11 0.392 0.144 c 0.134 0.033 0.326 0.07 0.612 0.123 c 0.88 0.163 1.91 0.266 2.72 0.092 c 0.406 -0.087 0.755 -0.242 1.004 -0.494 Z")
        )
    }.build()
}
