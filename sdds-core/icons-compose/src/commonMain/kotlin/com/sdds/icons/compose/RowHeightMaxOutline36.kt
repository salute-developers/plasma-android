package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RowHeightMaxOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RowHeightMaxOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 5.998 5.5 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 22.0 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 h -22.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 8.5 h 20.0 c 1.933 0.0 3.5 1.567 3.5 3.5 v 12.0 c 0.0 1.933 -1.567 3.5 -3.5 3.5 H 8.0 c -1.933 0.0 -3.5 -1.567 -3.5 -3.5 V 12.0 c 0.0 -1.933 1.567 -3.5 3.5 -3.5 Z m 0.0 2.0 c -0.828 0.0 -1.5 0.672 -1.5 1.5 v 12.0 c 0.0 0.828 0.672 1.5 1.5 1.5 h 20.0 c 0.828 0.0 1.5 -0.672 1.5 -1.5 V 12.0 c 0.0 -0.828 -0.672 -1.5 -1.5 -1.5 H 8.0 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 6.998 29.5 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 22.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -22.0 Z")
        )
    }.build()
}
