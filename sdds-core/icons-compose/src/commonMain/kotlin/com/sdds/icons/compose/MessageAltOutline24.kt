package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageAltOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageAltOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.662 13.462 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 3.825 c 0.415 0.0 0.75 0.336 0.75 0.75 c 0.0 0.415 -0.335 0.75 -0.75 0.75 H 8.412 c -0.414 0.0 -0.75 -0.335 -0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.412 9.737 c -0.414 0.0 -0.75 0.336 -0.75 0.75 c 0.0 0.415 0.336 0.75 0.75 0.75 h 7.65 c 0.415 0.0 0.75 -0.335 0.75 -0.75 c 0.0 -0.414 -0.335 -0.75 -0.75 -0.75 h -7.65 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.837 11.762 c 0.0 -4.639 3.761 -8.4 8.4 -8.4 c 4.64 0.0 8.4 3.761 8.4 8.4 c 0.0 4.64 -3.76 8.4 -8.4 8.4 c -0.998 0.0 -1.957 -0.174 -2.846 -0.494 c -0.513 -0.185 -1.006 -0.234 -1.432 -0.115 l -2.503 0.7 c -1.042 0.293 -2.002 -0.667 -1.71 -1.71 l 0.7 -2.502 c 0.12 -0.427 0.07 -0.92 -0.114 -1.432 c -0.32 -0.89 -0.495 -1.849 -0.495 -2.847 Z m 8.4 -6.9 c -3.81 0.0 -6.9 3.09 -6.9 6.9 c 0.0 0.822 0.144 1.61 0.406 2.339 c 0.253 0.702 0.377 1.526 0.148 2.344 l -0.647 2.31 l 2.31 -0.646 c 0.818 -0.23 1.642 -0.106 2.345 0.147 c 0.73 0.263 1.516 0.406 2.338 0.406 c 3.811 0.0 6.9 -3.089 6.9 -6.9 c 0.0 -3.81 -3.089 -6.9 -6.9 -6.9 Z")
        )
    }.build()
}
