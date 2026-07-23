package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowForward36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowForward36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 22.418 7.293 c 0.39 -0.39 1.024 -0.39 1.414 0.0 l 5.625 5.625 c 0.188 0.187 0.293 0.442 0.293 0.707 c 0.0 0.265 -0.105 0.52 -0.293 0.707 l -5.625 5.625 l -0.076 0.068 c -0.393 0.32 -0.972 0.298 -1.338 -0.068 c -0.366 -0.366 -0.389 -0.945 -0.068 -1.338 l 0.068 -0.076 l 3.918 -3.918 H 13.563 C 10.49 14.625 8.0 17.115 8.0 20.187 s 2.49 5.563 5.563 5.563 h 3.687 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 h -3.688 C 9.386 27.75 6.0 24.364 6.0 20.187 c 0.0 -4.176 3.386 -7.562 7.563 -7.562 h 12.773 l -3.918 -3.918 c -0.39 -0.39 -0.39 -1.024 0.0 -1.414 Z")
        )
    }.build()
}
