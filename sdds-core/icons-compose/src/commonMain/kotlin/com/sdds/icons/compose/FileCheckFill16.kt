package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FileCheckFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FileCheckFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.5 4.64 c 0.0 -1.274 0.0 -1.911 0.248 -2.398 c 0.218 -0.428 0.566 -0.776 0.994 -0.994 C 4.23 1.0 4.866 1.0 6.14 1.0 h 3.72 c 1.274 0.0 1.911 0.0 2.398 0.248 c 0.428 0.218 0.776 0.566 0.994 0.994 C 13.5 2.73 13.5 3.366 13.5 4.64 v 6.72 c 0.0 1.274 0.0 1.911 -0.248 2.398 c -0.218 0.428 -0.566 0.776 -0.994 0.994 C 11.77 15.0 11.134 15.0 9.86 15.0 H 6.14 c -1.274 0.0 -1.911 0.0 -2.398 -0.248 c -0.428 -0.218 -0.776 -0.566 -0.994 -0.994 C 2.5 13.27 2.5 12.634 2.5 11.36 V 4.64 Z M 4.75 3.8 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 5.5 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 h -5.5 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z m 0.0 2.625 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 5.5 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 h -5.5 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z m 0.0 2.625 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 1.547 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 5.25 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z m 6.7 1.75 c 0.194 -0.197 0.191 -0.513 -0.006 -0.707 c -0.197 -0.193 -0.514 -0.19 -0.707 0.007 l -1.706 1.737 l -0.674 -0.687 c -0.194 -0.197 -0.51 -0.2 -0.707 -0.007 c -0.197 0.194 -0.2 0.51 -0.007 0.707 l 1.032 1.05 c 0.094 0.096 0.222 0.15 0.356 0.15 c 0.134 0.0 0.263 -0.054 0.357 -0.15 l 2.063 -2.1 Z")
        )
    }.build()
}
