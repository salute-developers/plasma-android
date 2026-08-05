package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WhiteboardFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WhiteboardFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 15.305 9.634 l -0.602 0.602 c -0.116 -0.184 -0.254 -0.374 -0.41 -0.53 c -0.155 -0.156 -0.345 -0.293 -0.53 -0.41 l 0.603 -0.601 C 14.491 8.57 14.66 8.5 14.836 8.5 c 0.367 0.0 0.664 0.297 0.664 0.664 c 0.0 0.176 -0.07 0.345 -0.195 0.47 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 9.353 13.725 l 3.312 -3.327 c 0.244 0.125 0.459 0.26 0.568 0.37 c 0.109 0.108 0.245 0.323 0.37 0.569 l -3.32 3.32 c -0.277 0.276 -0.621 0.476 -0.999 0.58 l -0.705 0.191 l 0.202 -0.723 c 0.104 -0.37 0.301 -0.708 0.572 -0.98 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.75 4.0 C 3.231 4.0 2.0 5.231 2.0 6.75 v 10.5 C 2.0 18.769 3.231 20.0 4.75 20.0 h 14.5 c 1.519 0.0 2.75 -1.231 2.75 -2.75 V 6.75 C 22.0 5.231 20.769 4.0 19.25 4.0 H 4.75 Z m 10.086 3.0 c -0.574 0.0 -1.125 0.228 -1.53 0.634 L 11.97 8.97 h -0.002 L 8.29 12.668 C 7.838 13.12 7.51 13.684 7.337 14.3 l -0.56 1.997 c -0.072 0.26 0.0 0.539 0.19 0.73 c 0.191 0.192 0.47 0.267 0.73 0.196 l 1.982 -0.54 c 0.63 -0.172 1.203 -0.506 1.665 -0.967 l 5.022 -5.022 C 16.772 10.289 17.0 9.738 17.0 9.165 C 17.0 7.968 16.03 7.0 14.836 7.0 Z")
        )
    }.build()
}
