package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AttentionTriangleOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AttentionTriangleOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.356 2.55 c -0.59 -1.067 -2.123 -1.067 -2.713 0.0 l -5.197 9.398 c -0.571 1.033 0.176 2.3 1.356 2.3 h 10.394 c 1.18 0.0 1.928 -1.267 1.357 -2.3 L 9.355 2.55 Z M 7.518 3.034 c 0.21 -0.379 0.753 -0.379 0.962 0.0 l 5.197 9.398 c 0.203 0.366 -0.062 0.816 -0.48 0.816 H 2.801 c -0.419 0.0 -0.684 -0.45 -0.481 -0.816 l 5.197 -9.398 Z m 0.476 2.304 c 0.387 0.0 0.7 0.313 0.7 0.7 v 2.804 c 0.0 0.387 -0.313 0.7 -0.7 0.7 c -0.386 0.0 -0.7 -0.313 -0.7 -0.7 V 6.038 c 0.0 -0.387 0.314 -0.7 0.7 -0.7 Z m 0.7 6.308 c 0.0 0.387 -0.312 0.7 -0.697 0.7 c -0.386 0.0 -0.698 -0.313 -0.698 -0.7 c 0.0 -0.387 0.312 -0.701 0.698 -0.701 c 0.385 0.0 0.697 0.314 0.697 0.7 Z")
        )
    }.build()
}
