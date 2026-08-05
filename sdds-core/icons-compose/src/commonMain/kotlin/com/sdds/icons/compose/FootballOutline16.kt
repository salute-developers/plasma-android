package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FootballOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FootballOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.0 8.0 c 0.0 -3.866 3.134 -7.0 7.0 -7.0 s 7.0 3.134 7.0 7.0 s -3.134 7.0 -7.0 7.0 s -7.0 -3.134 -7.0 -7.0 Z m 5.095 -5.639 C 4.94 2.752 3.941 3.488 3.226 4.448 L 3.55 6.004 L 4.575 6.34 l 2.896 -2.104 l 0.002 -1.086 L 6.095 2.36 Z m -2.949 9.081 C 2.468 10.488 2.064 9.325 2.05 8.068 l 1.173 -1.066 L 4.256 7.34 l 1.106 3.404 l -0.635 0.871 l -1.58 -0.173 Z m 3.08 2.24 C 6.787 13.855 7.383 13.95 8.0 13.95 c 0.618 0.0 1.213 -0.094 1.773 -0.269 l 0.654 -1.45 l -0.633 -0.874 H 6.215 l -0.64 0.878 l 0.652 1.446 Z m 7.724 -5.614 c -0.014 1.257 -0.418 2.42 -1.096 3.374 l -1.576 0.173 l -0.637 -0.88 l 1.106 -3.404 l 1.026 -0.332 l 1.177 1.069 Z m -1.176 -3.62 c -0.715 -0.96 -1.713 -1.696 -2.87 -2.087 l -1.381 0.79 L 8.52 4.23 l 2.896 2.104 L 12.451 6.0 l 0.323 -1.552 Z M 5.288 7.119 l 1.036 3.188 h 3.352 l 1.035 -3.188 L 8.0 5.149 l -2.712 1.97 Z")
        )
    }.build()
}
