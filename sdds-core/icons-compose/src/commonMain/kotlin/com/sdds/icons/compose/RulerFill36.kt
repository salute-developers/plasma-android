package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RulerFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RulerFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 28.842 3.757 c -1.03 -1.014 -2.685 -1.009 -3.708 0.013 L 3.77 25.125 C 2.75 26.146 2.742 27.8 3.756 28.828 l 3.334 3.387 c 1.026 1.041 2.704 1.047 3.737 0.014 l 21.404 -21.416 c 1.031 -1.033 1.025 -2.706 -0.015 -3.73 l -3.374 -3.326 Z M 25.54 9.99 l -1.913 -1.912 l 1.414 -1.414 l 1.914 1.913 c 0.39 0.39 0.39 1.023 0.0 1.413 c -0.39 0.39 -1.024 0.39 -1.415 0.0 Z m -6.165 2.337 l 1.913 1.913 c 0.391 0.39 1.024 0.39 1.415 0.0 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 l -1.914 -1.912 l -1.414 1.413 Z m -2.339 6.162 l -1.913 -1.913 l 1.414 -1.413 l 1.914 1.912 c 0.39 0.39 0.39 1.023 0.0 1.414 c -0.39 0.39 -1.024 0.39 -1.415 0.0 Z M 6.617 25.076 l 1.913 1.912 c 0.391 0.39 1.025 0.39 1.415 0.0 c 0.39 -0.39 0.39 -1.023 0.0 -1.414 l -1.913 -1.912 l -1.415 1.414 Z m 4.252 -4.249 l 1.913 1.913 c 0.391 0.39 1.024 0.39 1.415 0.0 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 l -1.913 -1.912 l -1.415 1.413 Z")
        )
    }.build()
}
