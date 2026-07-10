package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlipHorizontalFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlipHorizontalFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.537 2.875 C 6.887 2.242 7.85 2.49 7.85 3.214 v 9.536 l -0.005 0.107 C 7.791 13.387 7.344 13.8 6.8 13.8 H 1.687 c -0.533 0.0 -0.87 -0.572 -0.613 -1.038 l 5.463 -9.887 Z M 2.196 12.8 H 6.8 c 0.028 0.0 0.05 -0.023 0.05 -0.05 V 4.377 L 2.196 12.8 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.404 2.527 c 0.18 0.038 0.35 0.15 0.459 0.348 l 5.463 9.887 c 0.258 0.466 -0.08 1.038 -0.613 1.038 H 9.6 c -0.054 0.0 -0.107 -0.006 -0.158 -0.014 l -0.05 -0.008 l -0.025 -0.006 c -0.024 -0.005 -0.048 -0.01 -0.07 -0.017 l -0.04 -0.014 l -0.056 -0.02 l -0.05 -0.023 l -0.032 -0.016 l -0.054 -0.03 c -0.011 -0.006 -0.022 -0.012 -0.033 -0.02 L 8.985 13.6 l -0.032 -0.024 l -0.04 -0.033 l -0.044 -0.04 l -0.023 -0.024 l -0.037 -0.04 l -0.03 -0.035 l -0.041 -0.056 l -0.013 -0.019 c -0.03 -0.044 -0.056 -0.09 -0.078 -0.139 c -0.02 -0.043 -0.038 -0.087 -0.052 -0.133 c -0.02 -0.064 -0.033 -0.131 -0.04 -0.2 L 8.55 12.75 V 3.214 c 0.0 -0.045 0.004 -0.089 0.01 -0.13 c 0.065 -0.372 0.403 -0.587 0.733 -0.57 c 0.037 0.001 0.074 0.006 0.11 0.013 Z")
        )
    }.build()
}
