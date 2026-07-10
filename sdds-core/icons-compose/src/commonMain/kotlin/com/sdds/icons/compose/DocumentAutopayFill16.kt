package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DocumentAutopayFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DocumentAutopayFill16",
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
            pathData = addPathNodes("M 12.0 15.75 c 2.071 0.0 3.75 -1.679 3.75 -3.75 c 0.0 -2.071 -1.679 -3.75 -3.75 -3.75 c -2.071 0.0 -3.75 1.679 -3.75 3.75 c 0.0 2.071 1.679 3.75 3.75 3.75 Z m 0.0 -6.35 c -0.808 0.0 -1.535 0.351 -2.036 0.909 V 10.28 c 0.0 -0.193 -0.156 -0.35 -0.35 -0.35 c -0.193 0.0 -0.35 0.157 -0.35 0.35 v 0.928 c 0.0 0.194 0.157 0.35 0.35 0.35 h 0.18 h 0.015 h 0.733 c 0.194 0.0 0.35 -0.156 0.35 -0.35 c 0.0 -0.193 -0.156 -0.35 -0.35 -0.35 h -0.127 c 0.374 -0.462 0.945 -0.758 1.586 -0.758 c 1.124 0.0 2.036 0.912 2.036 2.036 c 0.0 1.125 -0.912 2.037 -2.036 2.037 c -0.844 0.0 -1.568 -0.513 -1.877 -1.245 c -0.075 -0.178 -0.28 -0.261 -0.459 -0.186 c -0.178 0.075 -0.261 0.28 -0.186 0.459 c 0.415 0.982 1.387 1.672 2.522 1.672 c 1.51 0.0 2.736 -1.225 2.736 -2.737 c 0.0 -1.51 -1.225 -2.736 -2.736 -2.736 Z")
        )
    }.build()
}
