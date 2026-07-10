package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TriangleOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TriangleOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 3.25 c 0.268 0.0 0.515 0.143 0.65 0.375 l 9.526 16.5 c 0.134 0.232 0.134 0.518 0.0 0.75 c -0.134 0.232 -0.382 0.375 -0.65 0.375 H 2.474 c -0.268 0.0 -0.516 -0.143 -0.65 -0.375 s -0.134 -0.518 0.0 -0.75 l 9.526 -16.5 C 11.484 3.393 11.732 3.25 12.0 3.25 Z m -8.227 16.5 h 16.454 L 12.0 5.5 L 3.773 19.75 Z")
        )
    }.build()
}
