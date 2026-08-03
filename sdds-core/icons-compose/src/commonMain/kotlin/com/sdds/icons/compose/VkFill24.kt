package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VkFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VkFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.364 2.75 c 4.145 0.0 6.218 0.0 7.505 1.3 c 1.288 1.301 1.287 3.394 1.287 7.58 v 0.74 c 0.0 4.186 0.0 6.279 -1.287 7.58 c -1.287 1.3 -3.36 1.3 -7.505 1.3 h -0.732 c -4.145 0.0 -6.217 0.0 -7.505 -1.3 c -1.287 -1.301 -1.287 -3.394 -1.287 -7.58 v -0.74 c 0.0 -4.186 0.0 -6.279 1.287 -7.58 c 1.288 -1.3 3.36 -1.3 7.505 -1.3 h 0.732 Z M 5.931 8.377 c 0.099 4.81 2.48 7.7 6.655 7.7 h 0.236 v -2.752 c 1.534 0.154 2.695 1.288 3.16 2.752 h 2.167 c -0.595 -2.189 -2.16 -3.399 -3.136 -3.861 c 0.977 -0.57 2.35 -1.958 2.678 -3.839 h -1.968 c -0.428 1.526 -1.695 2.914 -2.9 3.045 V 8.377 h -1.97 v 5.334 c -1.22 -0.308 -2.763 -1.804 -2.832 -5.334 h -2.09 Z")
        )
    }.build()
}
