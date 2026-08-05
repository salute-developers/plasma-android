package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HelicopterFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HelicopterFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.47 3.12 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 h -5.8 v 1.1 h 2.139 c 0.585 0.0 1.263 0.04 1.886 0.332 c 2.11 0.99 2.26 3.107 2.274 4.363 c 0.005 0.477 -0.383 0.855 -0.849 0.855 h -0.727 l 0.66 1.1 h 0.418 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 h -7.7 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 1.116 l 0.674 -1.124 c -0.02 -0.005 -0.041 -0.008 -0.06 -0.014 c -0.119 -0.036 -0.227 -0.097 -0.317 -0.178 c -0.03 -0.027 -0.059 -0.057 -0.085 -0.088 c -0.052 -0.063 -0.096 -0.134 -0.13 -0.211 L 7.273 8.63 L 2.23 7.976 C 2.02 7.948 1.838 7.819 1.742 7.632 l -0.4 -0.78 c -0.016 -0.033 -0.03 -0.066 -0.04 -0.1 L 1.073 6.295 C 0.95 6.047 1.05 5.747 1.297 5.624 C 1.544 5.5 1.844 5.6 1.967 5.846 L 2.005 5.92 h 4.258 l 0.006 -0.037 c 0.007 -0.034 0.017 -0.067 0.029 -0.099 c 0.069 -0.192 0.205 -0.357 0.386 -0.458 c 0.06 -0.034 0.126 -0.06 0.195 -0.078 C 6.948 5.23 7.02 5.22 7.097 5.22 H 7.67 v -1.1 h -5.8 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 12.6 Z m -4.775 7.65 c -0.011 0.036 -0.026 0.073 -0.046 0.107 L 9.053 11.87 h 3.834 l -0.596 -0.993 c -0.02 -0.035 -0.035 -0.07 -0.047 -0.107 H 9.695 Z M 10.1 6.22 c 0.053 0.442 0.179 0.755 0.335 0.982 c 0.207 0.301 0.503 0.498 0.88 0.625 c 0.386 0.13 0.84 0.183 1.334 0.198 c 0.358 0.012 0.7 0.005 1.045 0.0 c -0.23 -0.637 -0.65 -1.206 -1.422 -1.568 c -0.413 -0.194 -0.903 -0.237 -1.462 -0.237 h -0.71 Z")
        )
    }.build()
}
