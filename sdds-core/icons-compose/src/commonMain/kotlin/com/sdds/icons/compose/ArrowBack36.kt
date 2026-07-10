package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowBack36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowBack36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.918 7.293 c 0.39 -0.39 1.024 -0.39 1.414 0.0 c 0.39 0.39 0.39 1.023 0.0 1.414 l -3.918 3.918 h 12.774 c 4.176 0.0 7.562 3.386 7.562 7.562 c 0.0 4.177 -3.386 7.563 -7.563 7.563 H 18.5 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 h 3.688 c 3.072 0.0 5.562 -2.49 5.562 -5.563 c 0.0 -3.072 -2.49 -5.562 -5.563 -5.562 H 9.415 l 3.918 3.918 l 0.068 0.076 c 0.32 0.393 0.298 0.972 -0.068 1.338 c -0.366 0.366 -0.945 0.389 -1.338 0.068 l -0.076 -0.068 l -5.625 -5.625 C 6.105 14.144 6.0 13.89 6.0 13.625 c 0.0 -0.265 0.105 -0.52 0.293 -0.707 l 5.625 -5.625 Z")
        )
    }.build()
}
