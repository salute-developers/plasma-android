package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VideoArchive24Fill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VideoArchive24Fill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.0 3.247 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 10.5 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 6.75 C 6.336 3.997 6.0 3.661 6.0 3.247 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.92 5.0 h 10.16 c 0.535 0.0 0.98 0.0 1.345 0.03 c 0.38 0.03 0.736 0.098 1.073 0.27 c 0.518 0.263 0.939 0.684 1.202 1.201 c 0.172 0.338 0.24 0.694 0.27 1.074 C 21.0 7.94 21.0 8.385 21.0 8.92 v 8.161 c 0.0 0.535 0.0 0.98 -0.03 1.345 c -0.03 0.38 -0.098 0.736 -0.27 1.073 c -0.263 0.518 -0.684 0.938 -1.201 1.202 c -0.338 0.172 -0.694 0.24 -1.074 0.27 C 18.06 21.0 17.615 21.0 17.08 21.0 H 6.92 c -0.535 0.0 -0.98 0.0 -1.345 -0.03 c -0.38 -0.03 -0.736 -0.098 -1.073 -0.27 c -0.518 -0.264 -0.939 -0.684 -1.202 -1.202 c -0.172 -0.337 -0.24 -0.694 -0.27 -1.073 C 3.0 18.06 3.0 17.615 3.0 17.08 V 8.92 c 0.0 -0.535 0.0 -0.98 0.03 -1.345 c 0.03 -0.38 0.098 -0.736 0.27 -1.074 C 3.563 5.984 3.984 5.563 4.502 5.3 c 0.337 -0.172 0.693 -0.24 1.073 -0.27 C 5.94 5.0 6.385 5.0 6.92 5.0 Z m 8.33 7.573 c 0.333 0.193 0.333 0.674 0.0 0.867 l -4.5 2.598 C 10.417 16.23 10.0 15.989 10.0 15.604 v -5.196 c 0.0 -0.384 0.417 -0.625 0.75 -0.433 l 4.5 2.598 Z")
        )
    }.build()
}
