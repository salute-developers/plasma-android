package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.344 2.274 c 0.243 -0.583 1.069 -0.583 1.312 0.0 l 1.408 3.386 l 3.655 0.293 c 0.63 0.05 0.884 0.836 0.405 1.247 l -2.785 2.385 l 0.85 3.567 c 0.147 0.614 -0.52 1.1 -1.06 0.77 L 8.0 12.011 l -3.13 1.911 c -0.538 0.33 -1.206 -0.156 -1.06 -0.77 l 0.85 -3.567 L 1.877 7.2 c -0.48 -0.411 -0.224 -1.197 0.405 -1.247 L 5.936 5.66 l 1.408 -3.386 Z M 8.0 3.302 L 6.792 6.207 c -0.103 0.246 -0.334 0.414 -0.6 0.435 L 3.057 6.894 l 2.39 2.047 c 0.202 0.173 0.29 0.445 0.229 0.704 l -0.73 3.06 l 2.685 -1.64 c 0.227 -0.138 0.513 -0.138 0.74 0.0 l 2.685 1.64 l -0.73 -3.06 c -0.061 -0.26 0.027 -0.531 0.229 -0.704 l 2.39 -2.047 l -3.137 -0.252 c -0.265 -0.02 -0.496 -0.189 -0.599 -0.435 L 8.0 3.302 Z")
        )
    }.build()
}
