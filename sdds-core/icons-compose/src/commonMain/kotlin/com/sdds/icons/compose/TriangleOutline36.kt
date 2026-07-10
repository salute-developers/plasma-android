package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TriangleOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TriangleOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 4.0 c 0.357 0.0 0.688 0.19 0.866 0.5 l 14.29 24.75 c 0.178 0.31 0.178 0.69 0.0 1.0 c -0.18 0.31 -0.51 0.5 -0.867 0.5 H 3.711 c -0.358 0.0 -0.688 -0.19 -0.866 -0.5 c -0.179 -0.31 -0.179 -0.69 0.0 -1.0 L 17.135 4.5 C 17.312 4.19 17.642 4.0 18.0 4.0 Z M 5.443 28.75 h 25.114 L 18.0 7.0 L 5.443 28.75 Z")
        )
    }.build()
}
