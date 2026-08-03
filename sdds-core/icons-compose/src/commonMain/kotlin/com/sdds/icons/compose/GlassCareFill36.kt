package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GlassCareFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GlassCareFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 25.02 4.508 c 0.112 -0.344 0.599 -0.344 0.712 0.0 l 0.777 2.366 c 0.446 1.358 1.51 2.423 2.867 2.87 l 2.362 0.778 c 0.343 0.113 0.343 0.599 0.0 0.712 l -2.362 0.778 c -1.357 0.447 -2.421 1.512 -2.867 2.87 l -0.777 2.366 c -0.113 0.344 -0.6 0.344 -0.713 0.0 l -0.776 -2.366 c -0.446 -1.358 -1.51 -2.423 -2.868 -2.87 l -2.361 -0.778 c -0.344 -0.113 -0.344 -0.6 0.0 -0.712 l 2.361 -0.778 c 1.357 -0.447 2.422 -1.512 2.867 -2.87 l 0.777 -2.366 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.354 22.738 c -3.78 -0.513 -6.615 -3.898 -6.335 -7.822 l 0.562 -7.884 c 0.012 -0.17 0.026 -0.356 0.05 -0.517 c 0.028 -0.184 0.08 -0.422 0.22 -0.665 c 0.187 -0.326 0.467 -0.587 0.805 -0.75 c 0.252 -0.122 0.493 -0.159 0.678 -0.173 c 0.162 -0.013 0.348 -0.013 0.518 -0.013 h 9.005 c 0.17 0.0 0.356 0.0 0.518 0.013 c 0.185 0.014 0.426 0.05 0.678 0.172 c 0.125 0.06 0.242 0.135 0.35 0.22 l -0.286 0.87 c -0.222 0.674 -0.75 1.203 -1.424 1.425 L 18.31 8.399 c -2.389 0.787 -2.389 4.17 0.0 4.957 l 2.383 0.786 c 0.674 0.221 1.202 0.75 1.424 1.425 l 0.784 2.388 c 0.04 0.123 0.095 0.25 0.162 0.378 h 0.057 c -0.994 2.326 -3.154 4.05 -5.766 4.405 v 6.073 c 2.813 0.239 4.955 1.464 4.955 2.94 H 10.4 c 0.0 -1.476 2.143 -2.701 4.955 -2.94 v -6.073 Z")
        )
    }.build()
}
