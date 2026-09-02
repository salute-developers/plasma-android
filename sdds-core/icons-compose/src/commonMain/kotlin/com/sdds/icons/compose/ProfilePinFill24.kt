package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfilePinFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfilePinFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.88 7.0 c 0.569 0.0 1.003 0.516 0.914 1.086 l -0.547 3.46 c -0.056 0.354 0.034 0.716 0.249 1.002 l 1.575 2.094 c 0.65 0.864 0.04 2.108 -1.031 2.108 h -2.637 v 4.125 L 17.565 22.0 l -0.832 -1.125 V 16.75 H 14.09 c -1.072 0.0 -1.68 -1.245 -1.03 -2.108 l 1.575 -2.094 c 0.215 -0.286 0.304 -0.648 0.248 -1.002 l -0.546 -3.46 C 14.247 7.516 14.682 7.0 15.252 7.0 h 4.627 Z M 8.57 12.172 c 1.472 0.0 2.874 0.301 4.148 0.845 l -0.657 0.874 c -1.16 1.543 -0.257 3.758 1.584 4.07 c -0.196 0.054 -0.402 0.086 -0.615 0.086 H 4.11 c -1.273 0.0 -2.306 -1.032 -2.306 -2.306 c 0.0 -0.701 0.32 -1.415 0.96 -1.835 c 1.668 -1.095 3.664 -1.734 5.807 -1.734 Z m 0.0 -8.386 c 2.126 0.0 3.85 1.724 3.85 3.85 c 0.0 2.125 -1.724 3.848 -3.85 3.848 c -2.125 0.0 -3.849 -1.723 -3.849 -3.848 c 0.0 -2.126 1.724 -3.85 3.85 -3.85 Z")
        )
    }.build()
}
