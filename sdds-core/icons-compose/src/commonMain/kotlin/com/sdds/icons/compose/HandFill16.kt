package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HandFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HandFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.52 2.464 c 0.0 -0.395 0.319 -0.714 0.712 -0.714 c 0.392 0.0 0.71 0.32 0.71 0.714 V 7.82 C 8.943 7.92 9.023 8.0 9.122 8.0 c 0.098 0.0 0.177 -0.08 0.177 -0.179 V 3.892 c 0.0 -0.394 0.319 -0.714 0.712 -0.714 c 0.393 0.0 0.711 0.32 0.711 0.714 v 4.464 c 0.0 0.099 0.08 0.179 0.178 0.179 c 0.098 0.0 0.178 -0.08 0.178 -0.179 V 6.213 c 0.0 -0.394 0.318 -0.714 0.71 -0.714 c 0.394 0.0 0.712 0.32 0.712 0.714 v 3.929 l 0.001 0.02 c -0.008 1.67 -1.038 3.234 -2.692 3.839 c -2.122 0.776 -4.47 -0.323 -5.242 -2.455 L 3.167 7.687 c -0.134 -0.37 0.056 -0.78 0.425 -0.915 c 0.02 -0.008 0.041 -0.014 0.062 -0.02 c 0.292 -0.057 0.59 0.042 0.716 0.308 c 0.12 0.254 0.22 0.448 0.311 0.628 l 0.716 1.974 c 0.03 0.082 0.113 0.13 0.198 0.115 s 0.147 -0.09 0.147 -0.176 V 3.535 c 0.0 -0.394 0.319 -0.714 0.711 -0.714 c 0.393 0.0 0.712 0.32 0.712 0.714 v 3.75 c 0.0 0.098 0.08 0.178 0.177 0.178 c 0.099 0.0 0.178 -0.08 0.178 -0.178 V 2.464 Z")
        )
    }.build()
}
