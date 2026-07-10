package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoneCircleOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoneCircleOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.002 7.998 C 2.002 4.685 4.687 2.0 8.0 2.0 s 5.998 2.685 5.998 5.998 S 11.313 13.996 8.0 13.996 s -5.998 -2.685 -5.998 -5.998 Z M 8.0 1.0 C 4.135 1.0 1.002 4.133 1.002 7.998 S 4.135 14.996 8.0 14.996 s 6.998 -3.133 6.998 -6.998 S 11.865 1.0 8.0 1.0 Z m 3.859 5.25 c 0.198 -0.192 0.204 -0.508 0.012 -0.707 c -0.192 -0.198 -0.509 -0.204 -0.707 -0.012 l -4.74 4.582 l -1.59 -1.538 C 4.635 8.383 4.319 8.39 4.127 8.587 C 3.935 8.786 3.94 9.102 4.139 9.294 l 1.938 1.874 c 0.194 0.187 0.501 0.187 0.695 0.0 l 5.087 -4.918 Z")
        )
    }.build()
}
