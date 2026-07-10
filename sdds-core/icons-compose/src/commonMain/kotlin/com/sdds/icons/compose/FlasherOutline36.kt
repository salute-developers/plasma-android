package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlasherOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlasherOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.998 5.5 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 v 5.3 c 0.0 0.553 0.448 1.0 1.0 1.0 s 1.0 -0.447 1.0 -1.0 V 5.5 Z m 10.708 4.31 c 0.39 -0.391 0.39 -1.024 0.0 -1.414 c -0.391 -0.39 -1.025 -0.39 -1.415 0.0 l -2.682 2.679 c -0.391 0.39 -0.391 1.023 0.0 1.413 c 0.39 0.39 1.024 0.39 1.415 0.0 l 2.682 -2.679 Z M 6.293 8.413 c 0.39 -0.39 1.024 -0.39 1.415 0.0 l 2.682 2.68 c 0.39 0.39 0.39 1.023 0.0 1.413 c -0.391 0.39 -1.025 0.39 -1.415 0.0 l -2.682 -2.68 c -0.391 -0.39 -0.391 -1.022 0.0 -1.413 Z m 6.44 11.312 c 0.076 -1.46 1.283 -2.605 2.745 -2.605 h 5.026 c 1.463 0.0 2.67 1.145 2.746 2.605 l 0.516 9.773 h -11.55 l 0.516 -9.773 Z m 12.514 -0.105 l 0.522 9.878 h 1.714 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 H 8.513 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 h 1.7 l 0.522 -9.878 c 0.133 -2.523 2.217 -4.5 4.743 -4.5 h 5.026 c 2.526 0.0 4.61 1.977 4.743 4.5 Z")
        )
    }.build()
}
