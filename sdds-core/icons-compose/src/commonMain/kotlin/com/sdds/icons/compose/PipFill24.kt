package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PipFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PipFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.92 3.0 h 12.16 c 0.535 0.0 0.98 0.0 1.345 0.03 c 0.38 0.03 0.736 0.098 1.073 0.27 c 0.518 0.263 0.939 0.684 1.202 1.202 c 0.172 0.337 0.24 0.693 0.27 1.073 C 22.0 5.94 22.0 6.385 22.0 6.92 V 12.0 h -6.838 c -0.528 0.0 -0.982 0.0 -1.357 0.03 c -0.395 0.033 -0.789 0.104 -1.167 0.297 c -0.565 0.288 -1.023 0.746 -1.311 1.311 c -0.193 0.378 -0.264 0.772 -0.296 1.167 C 11.0 15.18 11.0 15.635 11.0 16.162 V 19.0 H 5.92 c -0.535 0.0 -0.98 0.0 -1.345 -0.03 c -0.38 -0.03 -0.736 -0.098 -1.073 -0.27 C 2.984 18.437 2.563 18.016 2.3 17.5 c -0.172 -0.338 -0.24 -0.694 -0.27 -1.074 C 2.0 16.06 2.0 15.615 2.0 15.08 V 6.92 c 0.0 -0.535 0.0 -0.98 0.03 -1.345 c 0.03 -0.38 0.098 -0.736 0.27 -1.073 C 2.563 3.984 2.984 3.563 3.502 3.3 c 0.337 -0.172 0.693 -0.24 1.073 -0.27 C 4.94 3.0 5.385 3.0 5.92 3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.218 14.092 C 12.0 14.52 12.0 15.08 12.0 16.2 v 1.6 c 0.0 1.12 0.0 1.68 0.218 2.108 c 0.192 0.376 0.498 0.682 0.874 0.874 C 13.52 21.0 14.08 21.0 15.2 21.0 h 4.6 c 1.12 0.0 1.68 0.0 2.108 -0.218 c 0.376 -0.192 0.682 -0.498 0.874 -0.874 C 23.0 19.48 23.0 18.92 23.0 17.8 v -1.6 c 0.0 -1.12 0.0 -1.68 -0.218 -2.108 c -0.192 -0.376 -0.498 -0.682 -0.874 -0.874 C 21.48 13.0 20.92 13.0 19.8 13.0 h -4.6 c -1.12 0.0 -1.68 0.0 -2.108 0.218 c -0.376 0.192 -0.682 0.498 -0.874 0.874 Z")
        )
    }.build()
}
