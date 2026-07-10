package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableRowOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableRowOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 30.154 19.056 C 31.74 19.136 33.0 20.446 33.0 22.052 v 2.85 c 0.0 1.604 -1.26 2.915 -2.846 2.995 L 30.0 27.902 H 6.0 c -1.657 0.0 -3.0 -1.343 -3.0 -3.0 v -2.85 c 0.0 -1.656 1.343 -3.0 3.0 -3.0 h 24.0 l 0.154 0.005 Z M 6.0 21.052 c -0.552 0.0 -1.0 0.448 -1.0 1.0 v 2.85 c 0.0 0.552 0.448 1.0 1.0 1.0 h 24.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 v -2.85 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 H 6.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 30.154 8.105 C 31.74 8.185 33.0 9.497 33.0 11.102 v 2.85 c 0.0 1.604 -1.26 2.915 -2.846 2.995 L 30.0 16.951 H 6.0 c -1.657 0.0 -3.0 -1.343 -3.0 -3.0 v -2.85 c 0.0 -1.656 1.343 -3.0 3.0 -3.0 h 24.0 l 0.154 0.004 Z M 6.0 10.102 c -0.552 0.0 -1.0 0.447 -1.0 1.0 v 2.85 c 0.0 0.552 0.448 1.0 1.0 1.0 h 24.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 v -2.85 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 H 6.0 Z")
        )
    }.build()
}
