package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GlassCareOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GlassCareOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.238 2.723 c -0.076 -0.23 -0.4 -0.23 -0.475 0.0 l -0.527 1.6 c -0.298 0.906 -1.008 1.616 -1.913 1.913 l -1.6 0.527 c -0.23 0.075 -0.23 0.4 0.0 0.475 l 1.6 0.527 c 0.905 0.297 1.615 1.007 1.913 1.912 l 0.527 1.601 c 0.075 0.23 0.4 0.23 0.475 0.0 l 0.526 -1.6 c 0.298 -0.906 1.008 -1.616 1.913 -1.913 l 1.601 -0.527 c 0.23 -0.075 0.23 -0.4 0.0 -0.475 l -1.601 -0.527 c -0.905 -0.297 -1.615 -1.007 -1.913 -1.912 l -0.526 -1.601 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.916 3.0 c -0.114 0.0 -0.24 0.0 -0.348 0.01 c -0.124 0.009 -0.286 0.033 -0.456 0.115 c -0.226 0.11 -0.415 0.285 -0.54 0.503 c -0.094 0.163 -0.13 0.323 -0.148 0.446 C 6.407 4.182 6.399 4.307 6.39 4.421 L 6.013 9.709 c -0.186 2.605 1.677 4.855 4.177 5.235 v 4.092 C 8.34 19.21 6.94 20.024 6.94 21.0 h 8.0 c 0.0 -0.977 -1.4 -1.79 -3.25 -1.965 v -4.092 c 2.018 -0.306 3.62 -1.831 4.066 -3.776 c 0.093 -0.403 -0.16 -0.806 -0.563 -0.898 c -0.404 -0.093 -0.806 0.16 -0.899 0.563 c -0.349 1.519 -1.71 2.668 -3.354 2.668 c -1.996 0.0 -3.573 -1.694 -3.431 -3.686 l 0.38 -5.314 h 6.801 c 0.415 0.0 0.75 -0.336 0.75 -0.75 c 0.0 -0.415 -0.335 -0.75 -0.75 -0.75 H 7.916 Z")
        )
    }.build()
}
