package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CopyFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CopyFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.885 3.8 h 6.13 c 0.277 0.0 0.516 0.0 0.713 0.016 c 0.207 0.017 0.414 0.054 0.612 0.155 c 0.297 0.151 0.537 0.392 0.688 0.689 c 0.102 0.198 0.14 0.405 0.156 0.612 C 12.2 5.47 12.2 5.708 12.2 5.984 v 6.13 c 0.0 0.278 0.0 0.516 -0.016 0.713 c -0.017 0.208 -0.054 0.414 -0.155 0.613 c -0.152 0.296 -0.392 0.537 -0.689 0.688 c -0.198 0.101 -0.405 0.139 -0.612 0.156 C 10.53 14.3 10.292 14.3 10.015 14.3 h -6.13 c -0.277 0.0 -0.516 0.0 -0.712 -0.016 c -0.208 -0.017 -0.414 -0.055 -0.613 -0.156 c -0.296 -0.151 -0.537 -0.392 -0.688 -0.688 c -0.101 -0.199 -0.139 -0.405 -0.156 -0.613 C 1.7 12.63 1.7 12.392 1.7 12.115 v -6.13 c 0.0 -0.277 0.0 -0.516 0.016 -0.713 c 0.017 -0.207 0.055 -0.414 0.156 -0.612 c 0.15 -0.297 0.392 -0.538 0.688 -0.689 c 0.199 -0.1 0.405 -0.138 0.613 -0.155 C 3.369 3.8 3.608 3.8 3.885 3.8 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.855 2.75 c 0.695 0.0 1.184 0.0 1.567 0.031 c 0.376 0.031 0.601 0.089 0.777 0.179 c 0.362 0.184 0.657 0.479 0.841 0.84 c 0.09 0.176 0.148 0.402 0.179 0.778 c 0.03 0.383 0.031 0.872 0.031 1.567 v 4.83 c 0.0 0.29 0.235 0.525 0.525 0.525 c 0.29 0.0 0.525 -0.235 0.525 -0.525 V 6.122 c 0.0 -0.595 0.0 -1.084 -0.025 -1.487 v -0.75 c 0.0 -0.277 0.0 -0.515 -0.016 -0.71 c -0.017 -0.207 -0.054 -0.41 -0.153 -0.604 c -0.148 -0.292 -0.386 -0.529 -0.677 -0.677 c -0.195 -0.1 -0.398 -0.136 -0.604 -0.153 c -0.195 -0.016 -0.433 -0.016 -0.71 -0.016 h -0.75 C 10.961 1.7 10.473 1.7 9.878 1.7 H 5.025 C 4.735 1.7 4.5 1.935 4.5 2.225 c 0.0 0.29 0.235 0.525 0.525 0.525 h 4.83 Z")
        )
    }.build()
}
