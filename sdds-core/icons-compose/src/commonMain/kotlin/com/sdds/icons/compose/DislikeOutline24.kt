package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DislikeOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DislikeOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.298 5.436 c -0.701 -1.24 -2.128 -1.879 -3.52 -1.576 L 8.085 5.097 l 0.31 6.849 c 0.004 0.067 0.004 0.134 0.001 0.2 c 0.402 0.355 0.755 0.767 1.046 1.224 l 2.36 3.708 c 0.253 0.397 0.455 0.823 0.604 1.27 l 1.023 3.069 c 0.031 0.092 0.13 0.144 0.223 0.117 c 1.073 -0.306 1.703 -1.417 1.415 -2.495 l -0.956 -3.588 c -0.297 -1.11 0.54 -2.2 1.69 -2.2 h 2.057 c 1.723 0.0 2.807 -1.858 1.959 -3.358 l -2.52 -4.457 Z m -9.541 8.185 c 0.154 0.172 0.295 0.357 0.42 0.554 l 2.36 3.709 c 0.186 0.293 0.336 0.608 0.446 0.938 l 1.023 3.069 c 0.285 0.854 1.192 1.333 2.058 1.085 c 1.86 -0.531 2.951 -2.455 2.453 -4.323 l -0.957 -3.588 c -0.042 -0.159 0.077 -0.315 0.242 -0.315 h 2.056 c 2.872 0.0 4.678 -3.095 3.265 -5.595 l -2.52 -4.457 c -1.024 -1.812 -3.11 -2.746 -5.144 -2.304 L 7.67 3.652 C 7.21 2.994 6.41 2.6 5.546 2.708 l -1.0 0.125 C 3.373 2.979 2.513 4.009 2.58 5.19 l 0.368 6.625 c 0.05 0.89 0.62 1.668 1.456 1.982 l 0.955 0.358 c 0.89 0.334 1.808 0.068 2.399 -0.534 Z M 6.544 4.724 C 6.44 4.382 6.102 4.15 5.732 4.196 l -1.0 0.125 C 4.342 4.37 4.055 4.713 4.076 5.107 l 0.368 6.624 c 0.017 0.297 0.207 0.556 0.486 0.661 l 0.955 0.358 c 0.422 0.158 0.871 -0.089 0.986 -0.495 c 0.02 -0.073 0.03 -0.154 0.026 -0.241 L 6.574 4.906 c -0.003 -0.064 -0.013 -0.125 -0.03 -0.182 Z")
        )
    }.build()
}
