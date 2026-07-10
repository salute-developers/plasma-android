package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FileGlassFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FileGlassFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.5 4.64 c 0.0 -1.274 0.0 -1.911 0.248 -2.398 c 0.218 -0.428 0.566 -0.776 0.994 -0.994 C 4.23 1.0 4.866 1.0 6.14 1.0 h 3.72 c 1.274 0.0 1.911 0.0 2.398 0.248 c 0.428 0.218 0.776 0.566 0.994 0.994 C 13.5 2.73 13.5 3.366 13.5 4.64 v 6.72 c 0.0 1.274 0.0 1.911 -0.248 2.398 c -0.218 0.428 -0.566 0.776 -0.994 0.994 C 11.77 15.0 11.134 15.0 9.86 15.0 H 6.14 c -1.274 0.0 -1.911 0.0 -2.398 -0.248 c -0.065 -0.033 -0.128 -0.07 -0.19 -0.109 l 1.086 -1.105 c 0.374 0.245 0.82 0.388 1.3 0.388 c 1.328 0.0 2.39 -1.094 2.39 -2.425 c 0.0 -1.33 -1.062 -2.425 -2.39 -2.425 c -1.33 0.0 -2.391 1.094 -2.391 2.425 c 0.0 0.488 0.142 0.944 0.388 1.325 l -1.087 1.108 c -0.036 -0.057 -0.07 -0.116 -0.1 -0.176 C 2.5 13.27 2.5 12.634 2.5 11.36 V 4.64 Z M 4.75 3.8 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 5.5 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 h -5.5 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z m 0.0 2.8 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 5.5 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 h -5.5 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z m 4.125 2.8 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 1.375 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 9.375 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z m 0.687 2.8 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 0.688 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 h -0.688 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z m -3.624 -2.124 c -0.76 0.0 -1.391 0.63 -1.391 1.425 c 0.0 0.796 0.63 1.425 1.39 1.425 c 0.76 0.0 1.391 -0.63 1.391 -1.425 s -0.63 -1.425 -1.39 -1.425 Z")
        )
    }.build()
}
