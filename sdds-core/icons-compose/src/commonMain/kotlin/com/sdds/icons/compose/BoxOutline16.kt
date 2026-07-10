package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BoxOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BoxOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.3 2.75 c -0.304 0.0 -0.55 0.246 -0.55 0.55 v 1.936 h 10.504 V 3.3 c 0.0 -0.304 -0.246 -0.55 -0.55 -0.55 H 3.3 Z M 1.75 3.3 c 0.0 -0.856 0.694 -1.55 1.55 -1.55 h 9.404 c 0.856 0.0 1.55 0.694 1.55 1.55 v 2.086 c 0.0 0.417 -0.3 0.764 -0.697 0.836 v 5.782 c 0.0 1.243 -1.008 2.25 -2.25 2.25 h -6.61 c -1.242 0.0 -2.25 -1.007 -2.25 -2.25 V 6.222 C 2.051 6.15 1.75 5.803 1.75 5.386 V 3.3 Z m 1.697 2.936 v 5.768 c 0.0 0.69 0.56 1.25 1.25 1.25 h 6.61 c 0.69 0.0 1.25 -0.56 1.25 -1.25 V 6.236 h -9.11 Z m 4.23 2.289 c 0.0 -0.276 0.223 -0.5 0.5 -0.5 h 2.788 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 8.176 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z m 1.894 1.591 c -0.276 0.0 -0.5 0.224 -0.5 0.5 c 0.0 0.277 0.224 0.5 0.5 0.5 h 1.394 c 0.276 0.0 0.5 -0.223 0.5 -0.5 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 H 9.571 Z")
        )
    }.build()
}
