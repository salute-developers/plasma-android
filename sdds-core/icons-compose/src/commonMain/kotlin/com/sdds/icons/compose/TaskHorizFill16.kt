package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TaskHorizFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TaskHorizFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.242 13.252 C 2.73 13.5 3.366 13.5 4.64 13.5 h 6.72 c 1.274 0.0 1.911 0.0 2.398 -0.248 c 0.428 -0.218 0.776 -0.566 0.994 -0.994 C 15.0 11.77 15.0 11.134 15.0 9.86 V 6.14 c 0.0 -1.274 0.0 -1.911 -0.248 -2.398 c -0.218 -0.428 -0.566 -0.776 -0.994 -0.994 C 13.27 2.5 12.634 2.5 11.36 2.5 H 4.64 c -1.274 0.0 -1.911 0.0 -2.398 0.248 c -0.428 0.218 -0.776 0.566 -0.994 0.994 C 1.0 4.23 1.0 4.866 1.0 6.14 v 3.72 c 0.0 1.274 0.0 1.911 0.248 2.398 c 0.218 0.428 0.566 0.776 0.994 0.994 Z m 8.908 -6.614 c 0.197 -0.194 0.2 -0.51 0.006 -0.707 c -0.194 -0.197 -0.51 -0.2 -0.707 -0.007 l -3.5 3.437 l -1.4 -1.374 c -0.196 -0.194 -0.513 -0.19 -0.707 0.006 C 4.65 8.19 4.652 8.507 4.85 8.7 l 1.75 1.719 c 0.194 0.191 0.506 0.191 0.7 0.0 l 3.85 -3.781 Z")
        )
    }.build()
}
