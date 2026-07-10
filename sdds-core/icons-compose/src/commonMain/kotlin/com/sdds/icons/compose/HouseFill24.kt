package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HouseFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HouseFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.609 3.649 c 0.256 -0.07 0.526 -0.07 0.782 0.0 c 0.255 0.068 0.511 0.25 1.355 0.903 l 7.795 6.04 c 0.327 0.255 0.798 0.195 1.052 -0.133 c 0.254 -0.327 0.194 -0.798 -0.134 -1.052 l -7.908 -6.129 c -0.677 -0.525 -1.185 -0.92 -1.769 -1.078 c -0.512 -0.138 -1.052 -0.138 -1.564 0.0 c -0.584 0.158 -1.092 0.553 -1.77 1.078 l -7.907 6.13 C 1.213 9.66 1.153 10.131 1.407 10.46 c 0.254 0.327 0.725 0.387 1.052 0.133 l 7.795 -6.041 c 0.844 -0.654 1.1 -0.835 1.355 -0.903 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.68 5.17 c 0.21 -0.057 0.43 -0.057 0.64 0.0 c 0.248 0.065 0.454 0.224 0.58 0.32 l 0.036 0.028 l 7.133 5.404 l 0.046 0.035 c 0.186 0.14 0.384 0.29 0.533 0.487 c 0.13 0.172 0.227 0.367 0.285 0.575 c 0.068 0.238 0.068 0.486 0.067 0.719 v 0.057 v 4.886 c 0.0 0.604 0.0 1.102 -0.033 1.508 c -0.034 0.421 -0.108 0.809 -0.294 1.173 c -0.288 0.565 -0.746 1.024 -1.311 1.311 c -0.364 0.186 -0.752 0.26 -1.173 0.294 C 17.783 22.0 17.285 22.0 16.68 22.0 H 7.319 c -0.604 0.0 -1.102 0.0 -1.508 -0.033 c -0.421 -0.034 -0.809 -0.108 -1.173 -0.294 c -0.564 -0.287 -1.023 -0.746 -1.311 -1.311 c -0.185 -0.364 -0.26 -0.752 -0.294 -1.173 C 3.0 18.783 3.0 18.285 3.0 17.68 v -4.886 v -0.057 c 0.0 -0.233 -0.001 -0.48 0.067 -0.72 c 0.059 -0.207 0.155 -0.402 0.285 -0.574 c 0.15 -0.198 0.348 -0.347 0.533 -0.487 l 0.046 -0.035 l 7.133 -5.404 l 0.037 -0.028 c 0.125 -0.096 0.331 -0.255 0.579 -0.32 Z M 9.0 15.0 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 s 3.0 1.343 3.0 3.0 v 5.5 H 9.0 V 15.0 Z")
        )
    }.build()
}
