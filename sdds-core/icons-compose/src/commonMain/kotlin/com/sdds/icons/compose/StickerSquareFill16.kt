package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StickerSquareFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StickerSquareFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.25 9.063 V 5.027 c 0.0 -0.468 0.0 -0.85 -0.025 -1.161 c -0.027 -0.322 -0.083 -0.612 -0.221 -0.884 c -0.216 -0.424 -0.562 -0.77 -0.986 -0.986 c -0.272 -0.138 -0.562 -0.194 -0.884 -0.22 c -0.31 -0.026 -0.693 -0.026 -1.16 -0.026 H 5.026 c -0.468 0.0 -0.85 0.0 -1.161 0.025 c -0.322 0.027 -0.612 0.083 -0.884 0.221 c -0.424 0.216 -0.77 0.562 -0.986 0.986 c -0.138 0.272 -0.194 0.562 -0.22 0.884 C 1.75 4.176 1.75 4.559 1.75 5.026 v 5.947 c 0.0 0.468 0.0 0.85 0.025 1.161 c 0.027 0.322 0.083 0.612 0.221 0.884 c 0.216 0.424 0.562 0.77 0.986 0.986 c 0.272 0.138 0.562 0.194 0.884 0.22 c 0.31 0.026 0.693 0.026 1.16 0.026 h 4.037 v -2.468 c 0.0 -0.375 0.0 -0.686 0.02 -0.94 c 0.022 -0.264 0.069 -0.51 0.187 -0.742 c 0.182 -0.358 0.473 -0.648 0.83 -0.83 c 0.232 -0.119 0.478 -0.165 0.742 -0.187 c 0.254 -0.02 0.566 -0.02 0.94 -0.02 h 2.468 Z m -0.284 1.0 h -2.163 c -0.4 0.0 -0.67 0.0 -0.88 0.017 c -0.202 0.017 -0.301 0.046 -0.369 0.08 c -0.17 0.087 -0.307 0.225 -0.393 0.394 c -0.035 0.067 -0.064 0.167 -0.08 0.37 c -0.018 0.208 -0.018 0.478 -0.018 0.879 v 2.162 l 3.903 -3.902 Z")
        )
    }.build()
}
