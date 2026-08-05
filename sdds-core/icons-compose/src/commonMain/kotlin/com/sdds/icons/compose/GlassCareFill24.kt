package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GlassCareFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GlassCareFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.762 2.723 c 0.076 -0.23 0.4 -0.23 0.476 0.0 l 0.526 1.6 c 0.298 0.906 1.008 1.616 1.913 1.913 l 1.6 0.527 c 0.23 0.075 0.23 0.4 0.0 0.475 l -1.6 0.527 c -0.905 0.297 -1.615 1.007 -1.913 1.912 l -0.526 1.601 c -0.076 0.23 -0.4 0.23 -0.476 0.0 l -0.526 -1.6 c -0.298 -0.906 -1.008 -1.616 -1.913 -1.913 l -1.6 -0.527 c -0.23 -0.075 -0.23 -0.4 0.0 -0.475 l 1.6 -0.527 c 0.905 -0.297 1.615 -1.007 1.913 -1.912 l 0.526 -1.601 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.19 14.944 c -2.5 -0.38 -4.363 -2.63 -4.177 -5.235 L 6.39 4.42 C 6.4 4.307 6.407 4.182 6.424 4.074 c 0.018 -0.123 0.054 -0.283 0.148 -0.446 c 0.125 -0.218 0.314 -0.394 0.54 -0.503 c 0.17 -0.082 0.332 -0.106 0.456 -0.116 c 0.109 -0.008 0.234 -0.008 0.348 -0.008 h 6.049 c 0.114 0.0 0.239 0.0 0.348 0.008 c 0.124 0.01 0.286 0.034 0.455 0.116 c 0.084 0.04 0.163 0.09 0.235 0.147 L 14.81 3.855 c -0.149 0.453 -0.504 0.808 -0.956 0.957 l -1.601 0.526 c -1.605 0.528 -1.605 2.797 0.0 3.325 l 1.6 0.527 c 0.453 0.148 0.808 0.503 0.957 0.956 l 0.527 1.601 c 0.027 0.083 0.063 0.168 0.108 0.254 h 0.039 c -0.658 1.536 -2.075 2.682 -3.795 2.943 v 4.092 c 1.851 0.175 3.25 0.988 3.25 1.965 h -8.0 c 0.0 -0.977 1.4 -1.79 3.25 -1.965 v -4.092 Z")
        )
    }.build()
}
