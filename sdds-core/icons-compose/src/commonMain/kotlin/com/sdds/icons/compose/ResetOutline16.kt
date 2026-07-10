package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ResetOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ResetOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.998 1.0 C 5.452 1.0 3.224 2.36 2.0 4.391 V 2.944 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 S 1.0 2.668 1.0 2.944 v 2.527 c 0.0 0.276 0.224 0.5 0.5 0.5 h 0.498 h 0.023 h 2.006 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 2.82 C 3.86 3.193 5.79 2.0 7.999 2.0 c 3.312 0.0 5.997 2.685 5.997 5.998 s -2.685 5.998 -5.998 5.998 c -2.484 0.0 -4.617 -1.51 -5.528 -3.665 c -0.107 -0.255 -0.4 -0.374 -0.655 -0.266 c -0.254 0.107 -0.373 0.4 -0.266 0.655 C 2.61 13.232 5.098 14.996 8.0 14.996 c 3.864 0.0 6.997 -3.133 6.997 -6.998 S 11.863 1.0 7.998 1.0 Z m 0.0 8.402 c 0.776 0.0 1.405 -0.629 1.405 -1.405 s -0.63 -1.405 -1.405 -1.405 c -0.776 0.0 -1.405 0.63 -1.405 1.405 c 0.0 0.776 0.629 1.405 1.405 1.405 Z")
        )
    }.build()
}
