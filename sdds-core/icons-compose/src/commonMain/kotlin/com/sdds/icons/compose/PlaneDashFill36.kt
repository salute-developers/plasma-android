package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlaneDashFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlaneDashFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 28.478 15.067 c 1.655 -0.05 3.025 1.279 3.025 2.935 c 0.0 1.656 -1.37 2.984 -3.025 2.933 l -6.003 -0.184 l -5.122 9.781 c -0.473 0.904 -1.41 1.47 -2.429 1.47 c -0.873 0.0 -1.525 -0.806 -1.34 -1.66 l 1.238 -5.744 l 9.4 -9.4 l 4.256 -0.13 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 29.75 4.082 c 0.39 -0.39 1.023 -0.39 1.413 0.0 c 0.39 0.39 0.39 1.024 0.0 1.414 L 5.707 30.952 c -0.39 0.39 -1.023 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.024 0.0 -1.414 l 9.067 -9.067 l -3.217 -0.099 l -1.259 1.277 c -0.564 0.572 -1.334 0.894 -2.137 0.894 H 4.875 c -0.277 0.0 -0.459 -0.292 -0.336 -0.541 L 6.511 18.0 l -1.972 -4.0 c -0.123 -0.248 0.059 -0.54 0.336 -0.54 h 1.872 c 0.803 0.0 1.573 0.322 2.137 0.893 l 1.258 1.277 l 5.553 -0.17 l -2.114 -9.799 c -0.184 -0.854 0.468 -1.66 1.341 -1.66 c 1.02 0.0 1.956 0.566 2.429 1.47 l 3.783 7.224 l 8.615 -8.614 Z")
        )
    }.build()
}
