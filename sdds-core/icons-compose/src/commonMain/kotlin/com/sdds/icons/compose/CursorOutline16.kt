package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CursorOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CursorOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.261 2.416 c -0.648 -0.315 -1.369 0.27 -1.196 0.969 l 2.72 11.002 c 0.202 0.82 1.347 0.874 1.627 0.077 L 9.11 9.626 l 5.085 -0.655 c 0.838 -0.107 1.022 -1.239 0.262 -1.607 L 4.261 2.416 Z m -0.148 1.04 l 9.455 4.588 L 8.89 8.646 C 8.571 8.687 8.303 8.904 8.197 9.208 l -1.562 4.45 L 4.113 3.455 Z")
        )
    }.build()
}
