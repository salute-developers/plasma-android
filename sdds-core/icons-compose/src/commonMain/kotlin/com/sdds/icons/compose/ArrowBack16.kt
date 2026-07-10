package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowBack16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowBack16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.191 2.847 c 0.196 -0.196 0.512 -0.196 0.707 0.0 c 0.196 0.195 0.196 0.511 0.0 0.707 L 4.127 5.325 h 5.88 c 1.968 0.0 3.563 1.595 3.563 3.563 c 0.0 1.967 -1.595 3.562 -3.562 3.562 H 8.5 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 1.508 c 1.415 0.0 2.562 -1.147 2.562 -2.562 c 0.0 -1.415 -1.147 -2.563 -2.562 -2.563 H 4.127 l 1.771 1.772 l 0.065 0.078 C 6.09 8.369 6.069 8.633 5.898 8.804 c -0.17 0.17 -0.434 0.192 -0.628 0.064 L 5.19 8.804 L 2.566 6.179 C 2.473 6.085 2.42 5.958 2.42 5.825 c 0.0 -0.132 0.053 -0.26 0.146 -0.353 l 2.625 -2.625 Z")
        )
    }.build()
}
