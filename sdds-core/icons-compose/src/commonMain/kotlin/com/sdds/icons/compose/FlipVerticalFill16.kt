package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlipVerticalFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlipVerticalFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.125 6.337 c 0.633 0.35 0.384 1.313 -0.339 1.313 H 3.25 L 3.143 7.645 C 2.613 7.591 2.2 7.144 2.2 6.6 V 1.487 c 0.0 -0.533 0.572 -0.87 1.038 -0.613 l 9.887 5.463 Z M 3.2 1.996 V 6.6 c 0.0 0.028 0.023 0.05 0.05 0.05 h 8.373 L 3.2 1.996 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.473 9.204 L 13.44 9.31 c -0.055 0.14 -0.158 0.265 -0.316 0.353 l -9.887 5.463 c -0.261 0.145 -0.557 0.102 -0.765 -0.058 c -0.024 -0.018 -0.046 -0.038 -0.068 -0.059 c -0.041 -0.04 -0.078 -0.087 -0.108 -0.139 c -0.03 -0.05 -0.055 -0.107 -0.071 -0.166 c -0.017 -0.06 -0.026 -0.124 -0.026 -0.19 V 9.4 c 0.0 -0.054 0.006 -0.107 0.014 -0.158 l 0.008 -0.05 l 0.006 -0.025 c 0.005 -0.024 0.01 -0.048 0.017 -0.07 l 0.014 -0.04 L 2.279 9.0 l 0.013 -0.028 c 0.01 -0.023 0.021 -0.046 0.033 -0.068 l 0.01 -0.017 l 0.034 -0.056 C 2.38 8.815 2.39 8.8 2.401 8.785 l 0.023 -0.032 l 0.033 -0.04 l 0.04 -0.044 l 0.024 -0.023 l 0.04 -0.037 l 0.035 -0.03 c 0.018 -0.014 0.037 -0.028 0.057 -0.041 L 2.67 8.525 l 0.052 -0.032 l 0.04 -0.023 l 0.034 -0.016 C 2.844 8.43 2.893 8.41 2.944 8.395 c 0.063 -0.02 0.13 -0.033 0.199 -0.04 L 3.25 8.35 h 9.536 c 0.046 0.0 0.089 0.004 0.13 0.01 c 0.331 0.058 0.537 0.331 0.568 0.624 c 0.007 0.073 0.004 0.147 -0.011 0.22 Z")
        )
    }.build()
}
