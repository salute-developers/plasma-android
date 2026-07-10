package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RuTubeFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RuTubeFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.178 9.415 c 0.319 0.0 0.54 0.055 0.652 0.152 c 0.111 0.098 0.18 0.278 0.18 0.541 v 0.777 c 0.0 0.277 -0.069 0.457 -0.18 0.555 c -0.111 0.097 -0.333 0.137 -0.652 0.137 H 8.712 V 9.415 h 5.466 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.788 2.75 c 2.464 0.0 4.462 1.998 4.462 4.462 v 9.576 c 0.0 2.464 -1.998 4.462 -4.462 4.462 H 7.212 c -2.464 0.0 -4.462 -1.998 -4.462 -4.462 V 7.212 c 0.0 -2.464 1.998 -4.462 4.462 -4.462 h 9.576 Z M 6.395 16.625 h 2.317 v -3.009 h 4.271 l 2.028 3.009 h 2.595 l -2.235 -3.023 c 0.824 -0.123 1.194 -0.375 1.5 -0.79 c 0.304 -0.417 0.457 -1.082 0.457 -1.97 v -0.694 c 0.0 -0.526 -0.055 -0.942 -0.152 -1.261 c -0.098 -0.32 -0.264 -0.597 -0.5 -0.846 c -0.25 -0.236 -0.527 -0.401 -0.86 -0.513 c -0.334 -0.097 -0.75 -0.152 -1.263 -0.152 H 6.395 v 9.249 Z M 12.12 4.25 c 0.122 0.749 0.335 1.467 0.625 2.145 l 0.825 -0.001 h 0.982 c 0.58 0.0 1.093 0.062 1.537 0.192 c 0.466 0.156 0.905 0.407 1.26 0.742 c 0.333 0.352 0.62 0.798 0.764 1.273 c 0.134 0.44 0.196 0.959 0.196 1.547 v 0.694 c 0.0 0.226 -0.009 0.451 -0.029 0.67 c 0.474 0.161 0.965 0.285 1.469 0.367 V 7.212 c 0.0 -1.636 -1.326 -2.962 -2.962 -2.962 h -4.667 Z")
        )
    }.build()
}
