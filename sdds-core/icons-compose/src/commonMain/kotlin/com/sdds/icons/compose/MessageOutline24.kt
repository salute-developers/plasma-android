package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.144 16.268 l -0.722 -0.202 l 0.722 0.202 Z m 13.969 -4.48 c 0.0 3.81 -3.09 6.9 -6.9 6.9 v 1.5 c 4.639 0.0 8.4 -3.761 8.4 -8.4 h -1.5 Z m -13.8 0.0 c 0.0 -3.811 3.089 -6.9 6.9 -6.9 v -1.5 c -4.64 0.0 -8.4 3.76 -8.4 8.4 h 1.5 Z m 6.9 -6.9 c 3.81 0.0 6.9 3.089 6.9 6.9 h 1.5 c 0.0 -4.64 -3.761 -8.4 -8.4 -8.4 v 1.5 Z M 4.421 16.066 L 3.72 18.569 l 1.444 0.405 l 0.701 -2.504 l -1.444 -0.404 Z m 1.297 -1.94 c -0.263 -0.73 -0.407 -1.516 -0.407 -2.338 h -1.5 c 0.0 0.998 0.175 1.956 0.495 2.846 l 1.412 -0.508 Z m 6.494 4.562 c -0.823 0.0 -1.61 -0.144 -2.339 -0.406 l -0.508 1.41 c 0.89 0.321 1.848 0.496 2.847 0.496 v -1.5 Z M 5.43 20.279 l 2.503 -0.7 l -0.404 -1.445 l -2.503 0.7 l 0.404 1.445 Z m 4.443 -1.997 c -0.702 -0.253 -1.527 -0.377 -2.344 -0.148 l 0.404 1.444 c 0.426 -0.119 0.92 -0.07 1.432 0.115 l 0.508 -1.411 Z M 5.866 16.47 c 0.229 -0.817 0.106 -1.641 -0.147 -2.344 l -1.412 0.508 c 0.185 0.513 0.234 1.006 0.115 1.432 l 1.444 0.404 Z m -2.145 2.1 c -0.292 1.041 0.668 2.001 1.71 1.71 l -0.404 -1.445 c 0.084 -0.024 0.162 0.054 0.138 0.139 l -1.444 -0.405 Z")
        )
    }.build()
}
