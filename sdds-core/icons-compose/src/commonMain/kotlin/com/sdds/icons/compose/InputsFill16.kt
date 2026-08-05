package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.InputsFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "InputsFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.248 3.742 C 1.0 4.23 1.0 4.866 1.0 6.14 V 7.5 h 7.702 L 7.124 5.95 c -0.197 -0.193 -0.2 -0.51 -0.006 -0.707 c 0.193 -0.197 0.51 -0.2 0.707 -0.006 l 2.45 2.406 c 0.095 0.094 0.15 0.223 0.15 0.357 c 0.0 0.134 -0.055 0.263 -0.15 0.357 l -2.45 2.406 c -0.197 0.194 -0.514 0.19 -0.708 -0.006 c -0.193 -0.197 -0.19 -0.514 0.007 -0.707 L 8.702 8.5 H 1.0 v 1.36 c 0.0 1.274 0.0 1.911 0.248 2.398 c 0.218 0.428 0.566 0.776 0.994 0.994 C 2.73 13.5 3.366 13.5 4.64 13.5 h 6.72 c 1.274 0.0 1.911 0.0 2.398 -0.248 c 0.428 -0.218 0.776 -0.566 0.994 -0.994 C 15.0 11.77 15.0 11.134 15.0 9.86 V 6.14 c 0.0 -1.274 0.0 -1.911 -0.248 -2.398 c -0.218 -0.428 -0.566 -0.776 -0.994 -0.994 C 13.27 2.5 12.634 2.5 11.36 2.5 H 4.64 c -1.274 0.0 -1.911 0.0 -2.398 0.248 c -0.428 0.218 -0.776 0.566 -0.994 0.994 Z")
        )
    }.build()
}
