package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PipOffFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PipOffFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.08 3.0 H 5.92 C 5.385 3.0 4.94 3.0 4.575 3.03 C 4.195 3.06 3.84 3.128 3.502 3.3 C 2.984 3.563 2.563 3.984 2.3 4.502 C 2.128 4.839 2.06 5.195 2.03 5.575 C 2.0 5.94 2.0 6.385 2.0 6.92 v 8.16 c 0.0 0.535 0.0 0.98 0.03 1.345 c 0.03 0.38 0.098 0.736 0.27 1.073 c 0.263 0.518 0.684 0.939 1.202 1.202 c 0.337 0.172 0.693 0.24 1.073 0.27 C 4.94 19.0 5.385 19.0 5.92 19.0 H 11.0 v -2.838 c 0.0 -0.528 0.0 -0.982 0.03 -1.357 c 0.033 -0.395 0.104 -0.789 0.297 -1.167 c 0.288 -0.565 0.746 -1.023 1.311 -1.311 c 0.378 -0.193 0.772 -0.264 1.167 -0.296 C 14.18 12.0 14.635 12.0 15.162 12.0 H 22.0 V 6.92 c 0.0 -0.535 0.0 -0.98 -0.03 -1.345 c -0.03 -0.38 -0.098 -0.736 -0.27 -1.073 C 21.437 3.984 21.016 3.563 20.5 3.3 c -0.338 -0.172 -0.694 -0.24 -1.074 -0.27 C 19.06 3.0 18.615 3.0 18.08 3.0 Z M 4.75 5.0 C 4.336 5.0 4.0 5.336 4.0 5.75 v 4.243 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 V 7.56 l 2.97 2.97 c 0.293 0.292 0.767 0.292 1.06 0.0 c 0.293 -0.294 0.293 -0.768 0.0 -1.061 L 6.56 6.5 h 2.433 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 9.407 5.0 8.993 5.0 H 4.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.218 14.092 C 12.0 14.52 12.0 15.08 12.0 16.2 v 1.6 c 0.0 1.12 0.0 1.68 0.218 2.108 c 0.192 0.376 0.498 0.682 0.874 0.874 C 13.52 21.0 14.08 21.0 15.2 21.0 h 4.6 c 1.12 0.0 1.68 0.0 2.108 -0.218 c 0.376 -0.192 0.682 -0.498 0.874 -0.874 C 23.0 19.48 23.0 18.92 23.0 17.8 v -1.6 c 0.0 -1.12 0.0 -1.68 -0.218 -2.108 c -0.192 -0.376 -0.498 -0.682 -0.874 -0.874 C 21.48 13.0 20.92 13.0 19.8 13.0 h -4.6 c -1.12 0.0 -1.68 0.0 -2.108 0.218 c -0.376 0.192 -0.682 0.498 -0.874 0.874 Z")
        )
    }.build()
}
