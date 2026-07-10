package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarHalfFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarHalfFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.656 2.274 c -0.243 -0.583 -1.069 -0.583 -1.312 0.0 L 5.936 5.66 L 2.281 5.953 C 1.651 6.003 1.397 6.789 1.876 7.2 l 2.785 2.385 l -0.85 3.567 c -0.147 0.614 0.521 1.1 1.06 0.77 L 8.0 12.011 l 3.13 1.911 c 0.538 0.33 1.206 -0.156 1.06 -0.77 l -0.85 -3.567 L 14.123 7.2 c 0.48 -0.411 0.224 -1.197 -0.405 -1.247 L 10.064 5.66 L 8.656 2.274 Z M 8.0 10.961 c 0.128 0.0 0.256 0.035 0.37 0.104 l 2.685 1.64 l -0.73 -3.06 c -0.061 -0.26 0.027 -0.531 0.229 -0.704 l 2.39 -2.047 l -3.137 -0.252 c -0.265 -0.02 -0.496 -0.189 -0.599 -0.435 L 8.0 3.302 v 7.66 Z")
        )
    }.build()
}
