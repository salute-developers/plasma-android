package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowForward16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowForward16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.092 2.847 c 0.195 -0.196 0.512 -0.196 0.707 0.0 l 2.625 2.625 c 0.094 0.093 0.146 0.22 0.146 0.353 c 0.0 0.133 -0.053 0.26 -0.146 0.354 l -2.625 2.625 l -0.078 0.064 c -0.194 0.128 -0.458 0.106 -0.63 -0.064 c -0.17 -0.171 -0.192 -0.435 -0.064 -0.63 l 0.065 -0.077 l 1.771 -1.772 h -5.88 c -1.416 0.0 -2.563 1.148 -2.563 2.563 c 0.0 1.415 1.147 2.562 2.562 2.562 H 7.49 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 5.982 c -1.967 0.0 -3.562 -1.595 -3.562 -3.562 c 0.0 -1.968 1.595 -3.563 3.562 -3.563 h 5.881 l -1.771 -1.771 c -0.195 -0.196 -0.195 -0.512 0.0 -0.707 Z")
        )
    }.build()
}
