package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GigaOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GigaOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.904 6.604 c 0.129 0.448 0.198 0.921 0.198 1.41 c 0.0 2.82 -2.286 5.108 -5.106 5.108 c -1.186 0.0 -2.279 -0.405 -3.145 -1.084 c 0.165 0.015 0.34 0.022 0.53 0.022 c 0.16 0.0 0.33 -0.005 0.513 -0.016 c 1.08 -0.08 2.198 -0.401 3.231 -0.93 c 1.044 -0.536 1.955 -1.26 2.635 -2.097 c 0.44 -0.558 0.967 -1.415 1.117 -2.453 c 0.01 0.013 0.018 0.027 0.027 0.04 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.727 2.617 c 0.36 0.0 0.713 0.03 1.058 0.091 C 8.5 2.828 7.173 3.394 5.841 4.394 C 5.784 4.436 5.748 4.5 5.74 4.57 c -0.007 0.07 0.016 0.141 0.064 0.194 c 0.435 0.479 0.87 1.003 1.369 1.65 c 0.083 0.107 0.234 0.129 0.346 0.05 c 1.005 -0.72 1.877 -1.254 2.721 -1.663 c -0.037 0.433 -0.617 1.104 -1.222 1.611 C 8.05 7.205 6.885 8.03 5.579 8.135 l -0.05 0.004 c -0.193 0.008 -0.4 -0.013 -0.615 -0.067 C 4.397 7.94 3.94 7.488 3.753 6.926 c -0.079 -0.252 -0.09 -0.54 -0.032 -0.854 c 0.1 -0.516 0.363 -1.043 0.758 -1.523 L 4.483 4.54 c 0.912 -1.204 2.499 -1.924 4.244 -1.924 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 1.0 c 3.866 0.0 7.0 3.134 7.0 7.0 s -3.134 7.0 -7.0 7.0 s -7.0 -3.134 -7.0 -7.0 s 3.134 -7.0 7.0 -7.0 Z m 0.0 1.077 C 4.729 2.077 2.077 4.73 2.077 8.0 c 0.0 3.169 2.489 5.756 5.618 5.915 L 8.0 13.923 c 3.271 0.0 5.923 -2.652 5.923 -5.923 S 11.27 2.077 8.0 2.077 Z")
        )
    }.build()
}
