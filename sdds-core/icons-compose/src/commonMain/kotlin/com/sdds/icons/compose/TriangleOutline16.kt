package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TriangleOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TriangleOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 1.5 c 0.179 0.0 0.344 0.095 0.433 0.25 l 6.712 11.625 c 0.09 0.155 0.09 0.345 0.0 0.5 c -0.09 0.155 -0.255 0.25 -0.433 0.25 H 1.288 c -0.178 0.0 -0.343 -0.095 -0.433 -0.25 c -0.089 -0.155 -0.089 -0.345 0.0 -0.5 L 7.567 1.75 C 7.657 1.595 7.821 1.5 8.0 1.5 Z M 2.154 13.125 h 11.692 L 8.0 3.0 L 2.154 13.125 Z")
        )
    }.build()
}
