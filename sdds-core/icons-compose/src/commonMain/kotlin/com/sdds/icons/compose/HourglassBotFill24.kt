package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HourglassBotFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HourglassBotFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.39 2.0 C 6.8 2.0 6.345 2.0 5.952 2.119 c -0.88 0.266 -1.567 0.954 -1.833 1.833 C 3.999 4.345 3.999 4.8 4.0 5.39 V 5.5 c 0.0 1.682 1.03 3.168 2.106 4.28 c 0.92 0.95 1.964 1.72 2.716 2.22 c -0.752 0.5 -1.796 1.27 -2.716 2.22 C 5.03 15.332 4.0 16.818 4.0 18.5 v 0.11 c 0.0 0.59 0.0 1.045 0.119 1.438 c 0.266 0.88 0.954 1.567 1.833 1.834 C 6.345 22.0 6.8 22.0 7.39 22.0 h 9.22 c 0.59 0.0 1.045 0.0 1.438 -0.118 c 0.88 -0.267 1.567 -0.955 1.834 -1.834 C 20.0 19.655 20.0 19.2 20.0 18.61 V 18.5 c 0.0 -1.682 -1.03 -3.168 -2.106 -4.28 c -0.92 -0.95 -1.964 -1.72 -2.716 -2.22 c 0.752 -0.5 1.796 -1.27 2.716 -2.22 C 18.97 8.668 20.0 7.182 20.0 5.5 V 5.39 c 0.0 -0.59 0.0 -1.045 -0.118 -1.438 c -0.267 -0.88 -0.955 -1.567 -1.834 -1.833 C 17.655 1.999 17.2 1.999 16.61 2.0 H 7.39 Z m 5.788 12.278 l -0.022 -0.013 c -0.643 -0.404 -1.567 -0.469 -2.312 0.0 l -0.022 0.013 c -0.653 0.412 -1.701 1.142 -2.56 2.029 c -0.675 0.698 -1.148 1.396 -1.243 2.303 C 7.006 18.73 7.0 18.788 7.025 18.848 c 0.02 0.048 0.063 0.096 0.108 0.122 c 0.056 0.03 0.123 0.032 0.258 0.033 c 3.07 0.04 6.147 0.04 9.218 0.0 c 0.135 -0.001 0.202 -0.002 0.258 -0.033 c 0.045 -0.026 0.088 -0.074 0.108 -0.122 c 0.025 -0.06 0.018 -0.119 0.006 -0.238 c -0.095 -0.907 -0.568 -1.605 -1.243 -2.303 c -0.859 -0.887 -1.907 -1.617 -2.56 -2.029 Z")
        )
    }.build()
}
