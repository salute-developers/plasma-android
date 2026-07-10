package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HandActionDashFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HandActionDashFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.525 1.646 c 0.196 -0.195 0.512 -0.195 0.707 0.0 c 0.196 0.196 0.196 0.512 0.0 0.707 L 2.354 14.233 c -0.196 0.194 -0.512 0.194 -0.707 0.0 c -0.196 -0.196 -0.196 -0.513 0.0 -0.708 l 2.816 -2.817 l -1.366 -1.465 C 2.828 8.955 2.843 8.504 3.13 8.236 c 0.287 -0.268 0.739 -0.252 1.008 0.036 l 1.332 1.43 l 0.252 -0.253 l -2.907 -3.117 c -0.27 -0.289 -0.254 -0.74 0.033 -1.007 c 0.287 -0.268 0.739 -0.251 1.008 0.037 l 2.678 2.872 c 0.068 0.072 0.18 0.077 0.252 0.01 c 0.071 -0.067 0.075 -0.18 0.008 -0.252 L 3.141 4.074 C 2.872 3.786 2.887 3.335 3.174 3.067 C 3.46 2.8 3.912 2.817 4.18 3.105 l 3.288 3.526 c 0.067 0.071 0.18 0.076 0.252 0.01 C 7.792 6.574 7.797 6.46 7.73 6.388 L 5.172 3.645 C 4.903 3.357 4.918 2.906 5.205 2.64 C 5.492 2.37 5.943 2.387 6.212 2.676 l 3.031 3.252 l 0.685 -0.685 l -0.1 -0.237 C 9.77 4.806 9.71 4.59 9.621 4.316 C 9.537 4.05 9.672 3.785 9.903 3.625 C 9.932 3.608 9.96 3.59 9.991 3.577 c 0.362 -0.153 0.781 0.016 0.936 0.379 l 0.086 0.202 l 2.512 -2.512 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.536 7.733 c 0.888 2.086 -0.08 4.49 -2.16 5.37 c -1.605 0.678 -3.403 0.251 -4.55 -0.936 l 6.03 -6.03 l 0.68 1.596 Z")
        )
    }.build()
}
