package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SbboxFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SbboxFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.249 2.984 c -0.098 -0.097 -0.256 -0.097 -0.354 0.0 l -1.59 1.591 c -0.33 0.33 -0.382 0.832 -0.155 1.216 l -3.913 3.912 c -0.49 -0.482 -0.805 -0.763 -1.13 -0.95 c -1.16 -0.67 -2.589 -0.67 -3.75 0.0 c -0.427 0.246 -0.838 0.657 -1.66 1.48 l -2.475 2.474 C 3.4 13.53 2.99 13.94 2.742 14.367 c -0.67 1.161 -0.67 2.59 0.0 3.75 c 0.247 0.428 0.658 0.84 1.48 1.661 c 0.822 0.822 1.233 1.233 1.661 1.48 c 1.16 0.67 2.59 0.67 3.75 0.0 c 0.428 -0.247 0.839 -0.658 1.66 -1.48 l 2.475 -2.474 c 0.822 -0.822 1.233 -1.233 1.48 -1.661 c 0.67 -1.16 0.67 -2.59 0.0 -3.75 c -0.187 -0.324 -0.468 -0.638 -0.95 -1.129 l 3.912 -3.913 c 0.384 0.227 0.886 0.175 1.215 -0.154 l 1.591 -1.591 c 0.098 -0.098 0.098 -0.256 0.0 -0.354 L 19.25 2.984 Z")
        )
    }.build()
}
