package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarCircleOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarCircleOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 7.998 C 2.0 4.685 4.685 2.0 7.998 2.0 s 5.998 2.685 5.998 5.998 s -2.685 5.998 -5.998 5.998 S 2.0 11.311 2.0 7.998 Z M 7.998 1.0 C 4.133 1.0 1.0 4.133 1.0 7.998 s 3.133 6.998 6.998 6.998 s 6.998 -3.133 6.998 -6.998 S 11.863 1.0 7.998 1.0 Z m 0.71 2.645 c -0.223 -0.688 -1.198 -0.688 -1.422 0.0 L 6.53 5.977 H 4.077 c -0.724 0.0 -1.025 0.927 -0.44 1.353 l 1.984 1.44 l -0.757 2.332 c -0.224 0.689 0.564 1.262 1.15 0.836 l 1.983 -1.441 l 1.984 1.441 c 0.586 0.426 1.374 -0.147 1.15 -0.836 l -0.757 -2.331 l 1.983 -1.441 c 0.586 -0.426 0.285 -1.353 -0.44 -1.353 H 9.466 L 8.708 3.645 Z M 7.426 6.464 l 0.571 -1.76 l 0.572 1.76 c 0.1 0.308 0.387 0.517 0.711 0.517 h 1.85 L 9.633 8.068 c -0.262 0.19 -0.371 0.528 -0.271 0.836 l 0.571 1.76 l -1.496 -1.088 c -0.262 -0.19 -0.617 -0.19 -0.88 0.0 l -1.496 1.087 l 0.572 -1.76 c 0.1 -0.307 -0.01 -0.645 -0.272 -0.835 L 4.865 6.98 h 1.85 c 0.324 0.0 0.61 -0.209 0.71 -0.517 Z")
        )
    }.build()
}
