package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StickerSquareFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StickerSquareFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 21.0 13.5 V 7.719 c 0.0 -0.674 0.0 -1.225 -0.037 -1.672 c -0.037 -0.463 -0.118 -0.882 -0.317 -1.272 c -0.312 -0.612 -0.809 -1.11 -1.42 -1.42 c -0.391 -0.2 -0.81 -0.28 -1.273 -0.318 C 17.506 3.0 16.955 3.0 16.281 3.0 H 7.72 C 7.045 3.0 6.494 3.0 6.047 3.037 C 5.584 3.074 5.165 3.155 4.775 3.354 c -0.612 0.312 -1.11 0.809 -1.42 1.42 c -0.2 0.391 -0.28 0.81 -0.318 1.273 C 3.0 6.494 3.0 7.045 3.0 7.719 v 8.562 c 0.0 0.674 0.0 1.225 0.037 1.672 c 0.037 0.463 0.118 0.882 0.317 1.273 c 0.312 0.611 0.809 1.108 1.42 1.42 c 0.391 0.199 0.81 0.28 1.273 0.317 C 6.494 21.0 7.045 21.0 7.719 21.0 H 13.5 v -3.58 c 0.0 -0.535 0.0 -0.98 0.03 -1.345 c 0.03 -0.38 0.098 -0.736 0.27 -1.073 c 0.263 -0.518 0.684 -0.939 1.201 -1.202 c 0.338 -0.172 0.694 -0.24 1.074 -0.27 c 0.365 -0.03 0.81 -0.03 1.345 -0.03 H 21.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 20.56 15.0 h -3.11 c -0.572 0.0 -0.957 0.0 -1.252 0.025 c -0.288 0.023 -0.425 0.065 -0.516 0.111 c -0.235 0.12 -0.426 0.311 -0.546 0.546 c -0.046 0.091 -0.088 0.228 -0.111 0.516 C 15.0 16.493 15.0 16.878 15.0 17.45 v 3.11 L 20.56 15.0 Z")
        )
    }.build()
}
