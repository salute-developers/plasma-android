package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Header516: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Header516",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.0 8.47 v 3.03 h 1.0 v -7.0 H 7.0 v 2.783 H 4.5 V 4.5 h -1.0 v 7.0 h 1.0 V 8.47 H 7.0 Z m 1.75 1.142 c 0.379 0.435 1.013 0.721 1.736 0.711 c 0.82 0.0 1.18 -0.494 1.18 -1.156 c 0.0 -0.742 -0.528 -1.118 -1.418 -1.118 c -0.538 0.0 -1.005 0.11 -1.33 0.238 L 9.127 4.5 h 3.305 v 1.137 h -2.414 L 9.93 7.12 c 0.185 -0.05 0.51 -0.089 0.74 -0.089 c 1.365 0.0 2.079 0.88 2.079 2.136 c 0.0 1.512 -0.951 2.333 -2.23 2.333 c -0.88 0.0 -1.506 -0.366 -1.77 -0.633 V 9.612 Z")
        )
    }.build()
}
