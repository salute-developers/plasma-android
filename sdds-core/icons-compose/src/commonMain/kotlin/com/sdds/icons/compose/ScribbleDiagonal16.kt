package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ScribbleDiagonal16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ScribbleDiagonal16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.124 8.375 c 0.66 -0.883 4.717 -5.38 7.126 -6.423 c 1.665 -0.717 2.694 0.615 2.421 1.788 c -0.34 1.458 -1.125 2.807 -2.307 4.578 c -0.813 1.212 -1.67 2.533 -2.057 3.296 c -0.38 0.752 0.04 0.57 0.426 0.257 c 0.864 -0.706 2.398 -2.079 2.859 -2.443 c 0.795 -0.632 2.085 -1.304 2.795 -0.683 c 0.71 0.62 0.239 1.668 -0.187 2.505 s -1.301 2.164 -1.091 2.329 c 0.21 0.165 1.29 -0.513 1.602 -0.934 c 0.284 -0.376 0.71 -0.063 0.466 0.302 c -0.187 0.279 -1.66 1.833 -2.591 1.116 c -0.745 -0.575 0.392 -2.255 0.739 -2.921 c 0.346 -0.666 0.704 -1.407 0.494 -1.646 c -0.199 -0.227 -1.108 0.257 -1.858 1.03 c -0.557 0.576 -2.131 2.102 -2.83 2.643 c -1.603 1.23 -3.035 0.04 -2.239 -1.817 c 0.614 -1.429 1.392 -2.681 2.0 -3.65 c 0.665 -1.058 1.512 -2.487 1.91 -3.535 c 0.085 -0.216 -0.125 -0.387 -0.324 -0.25 c -0.802 0.569 -2.41 2.305 -3.075 3.097 c -0.83 0.99 -2.006 2.54 -2.443 3.04 c -0.438 0.501 -1.267 0.598 -1.807 0.086 C 1.562 9.57 1.68 8.973 2.124 8.375 Z")
        )
    }.build()
}
