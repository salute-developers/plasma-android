package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarCircleFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarCircleFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 15.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 s -7.0 3.134 -7.0 7.0 s 3.134 7.0 7.0 7.0 Z M 8.333 2.724 c -0.105 -0.322 -0.561 -0.322 -0.666 0.0 L 6.664 5.811 C 6.617 5.956 6.483 6.053 6.331 6.053 H 3.086 c -0.34 0.0 -0.48 0.434 -0.206 0.633 l 2.626 1.908 c 0.122 0.09 0.174 0.247 0.127 0.391 L 4.63 12.072 c -0.105 0.323 0.264 0.59 0.538 0.392 l 2.626 -1.908 c 0.123 -0.09 0.29 -0.09 0.412 0.0 l 2.626 1.908 c 0.274 0.199 0.643 -0.07 0.538 -0.392 l -1.003 -3.087 c -0.047 -0.144 0.005 -0.302 0.127 -0.39 l 2.626 -1.909 c 0.275 -0.199 0.134 -0.633 -0.205 -0.633 H 9.668 c -0.152 0.0 -0.286 -0.097 -0.333 -0.242 L 8.333 2.724 Z")
        )
    }.build()
}
