package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableColumnOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableColumnOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.95 30.0 c 0.0 1.657 -1.344 3.0 -3.0 3.0 H 11.1 c -1.657 0.0 -3.0 -1.343 -3.0 -3.0 V 6.0 l 0.004 -0.154 C 8.184 4.26 9.494 3.0 11.1 3.0 h 2.85 c 1.604 0.0 2.915 1.26 2.995 2.846 L 16.95 6.0 v 24.0 Z m -2.0 -24.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 H 11.1 c -0.553 0.0 -1.0 0.448 -1.0 1.0 v 24.0 c 0.0 0.552 0.447 1.0 1.0 1.0 h 2.85 c 0.552 0.0 1.0 -0.448 1.0 -1.0 V 6.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 27.9 30.0 c 0.0 1.657 -1.344 3.0 -3.0 3.0 h -2.85 c -1.657 0.0 -3.0 -1.343 -3.0 -3.0 V 6.0 l 0.004 -0.154 C 19.134 4.26 20.444 3.0 22.05 3.0 h 2.85 c 1.605 0.0 2.915 1.26 2.995 2.846 L 27.9 6.0 v 24.0 Z m -2.0 -24.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 h -2.85 c -0.552 0.0 -1.0 0.448 -1.0 1.0 v 24.0 c 0.0 0.552 0.448 1.0 1.0 1.0 h 2.85 c 0.552 0.0 1.0 -0.448 1.0 -1.0 V 6.0 Z")
        )
    }.build()
}
