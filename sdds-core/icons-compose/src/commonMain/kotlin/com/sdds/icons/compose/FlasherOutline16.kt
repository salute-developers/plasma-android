package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlasherOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlasherOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.504 2.25 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 s -0.5 0.224 -0.5 0.5 v 2.44 c 0.0 0.275 0.224 0.5 0.5 0.5 s 0.5 -0.225 0.5 -0.5 V 2.25 Z m 4.854 2.013 c 0.194 -0.197 0.194 -0.515 0.0 -0.711 c -0.195 -0.196 -0.51 -0.196 -0.704 0.0 l -1.22 1.233 c -0.195 0.197 -0.195 0.515 0.0 0.711 c 0.194 0.196 0.509 0.196 0.703 0.0 l 1.22 -1.233 Z M 2.646 3.56 c 0.195 -0.197 0.51 -0.197 0.704 0.0 l 1.22 1.233 c 0.195 0.196 0.195 0.515 0.0 0.71 c -0.194 0.197 -0.509 0.197 -0.703 0.0 l -1.22 -1.233 c -0.195 -0.196 -0.195 -0.514 0.0 -0.71 Z m 3.006 5.26 C 5.687 8.158 6.235 7.638 6.9 7.638 h 2.2 c 0.665 0.0 1.214 0.52 1.249 1.185 l 0.23 4.431 H 5.422 l 0.231 -4.431 Z m 5.695 -0.051 l 0.234 4.483 h 0.737 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 3.69 c -0.277 0.0 -0.5 -0.224 -0.5 -0.5 s 0.223 -0.5 0.5 -0.5 h 0.73 L 4.654 8.77 C 4.716 7.574 5.704 6.637 6.9 6.637 h 2.2 c 1.197 0.0 2.185 0.937 2.247 2.133 Z")
        )
    }.build()
}
