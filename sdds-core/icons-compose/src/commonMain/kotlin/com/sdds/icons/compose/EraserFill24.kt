package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EraserFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EraserFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 15.504 2.944 c -0.652 -0.212 -1.355 -0.212 -2.008 0.0 c -0.417 0.136 -0.77 0.374 -1.125 0.675 c -0.342 0.29 -0.731 0.68 -1.207 1.156 L 9.5 6.44 l 8.06 8.06 l 1.664 -1.663 c 0.476 -0.476 0.866 -0.865 1.156 -1.208 c 0.301 -0.354 0.54 -0.707 0.675 -1.124 c 0.213 -0.653 0.213 -1.356 0.0 -2.009 c -0.135 -0.417 -0.374 -0.77 -0.675 -1.124 c -0.29 -0.342 -0.68 -0.732 -1.156 -1.208 l -1.387 -1.388 C 17.36 4.3 16.97 3.91 16.629 3.62 c -0.355 -0.3 -0.708 -0.54 -1.125 -0.675 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 16.5 15.56 L 8.44 7.5 l -4.164 4.163 C 3.8 12.14 3.41 12.53 3.12 12.871 c -0.301 0.354 -0.54 0.707 -0.675 1.124 c -0.212 0.653 -0.212 1.356 0.0 2.009 c 0.135 0.417 0.374 0.77 0.675 1.124 c 0.29 0.343 0.68 0.732 1.156 1.208 l 0.876 0.876 c 0.984 0.985 2.32 1.538 3.712 1.538 H 21.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 c 0.0 -0.415 -0.336 -0.75 -0.75 -0.75 h -8.19 l 3.69 -3.69 Z")
        )
    }.build()
}
