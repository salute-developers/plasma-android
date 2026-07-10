package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DocumentBackwardFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DocumentBackwardFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.5 4.64 c 0.0 -1.274 0.0 -1.911 0.248 -2.398 c 0.218 -0.428 0.566 -0.776 0.994 -0.994 C 4.23 1.0 4.866 1.0 6.14 1.0 h 3.72 c 1.274 0.0 1.911 0.0 2.398 0.248 c 0.428 0.218 0.776 0.566 0.994 0.994 C 13.5 2.73 13.5 3.366 13.5 4.64 v 3.116 C 13.03 7.59 12.526 7.5 12.0 7.5 c -2.485 0.0 -4.5 2.015 -4.5 4.5 c 0.0 1.152 0.433 2.204 1.146 3.0 H 6.14 c -1.274 0.0 -1.911 0.0 -2.398 -0.248 c -0.428 -0.218 -0.776 -0.566 -0.994 -0.994 C 2.5 13.27 2.5 12.634 2.5 11.36 V 4.64 Z m 2.25 -0.315 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 5.5 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 h -5.5 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z m 0.0 2.275 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 H 8.0 c 0.276 0.0 0.5 0.224 0.5 0.5 S 8.276 7.1 8.0 7.1 H 5.25 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 15.75 c 2.071 0.0 3.75 -1.679 3.75 -3.75 c 0.0 -2.071 -1.679 -3.75 -3.75 -3.75 c -2.071 0.0 -3.75 1.679 -3.75 3.75 c 0.0 2.071 1.679 3.75 3.75 3.75 Z m -0.093 -5.208 c 0.136 -0.136 0.136 -0.358 0.0 -0.495 c -0.137 -0.136 -0.359 -0.136 -0.495 0.0 l -1.705 1.705 c -0.137 0.137 -0.137 0.358 0.0 0.495 l 1.705 1.704 c 0.136 0.137 0.358 0.137 0.495 0.0 c 0.136 -0.136 0.136 -0.358 0.0 -0.495 L 10.8 12.35 h 3.245 c 0.194 0.0 0.35 -0.157 0.35 -0.35 c 0.0 -0.194 -0.156 -0.35 -0.35 -0.35 H 10.8 l 1.107 -1.108 Z")
        )
    }.build()
}
