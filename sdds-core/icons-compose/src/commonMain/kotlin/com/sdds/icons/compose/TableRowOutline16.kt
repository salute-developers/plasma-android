package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableRowOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableRowOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.6 8.5 c 0.773 0.0 1.4 0.627 1.4 1.4 v 1.2 c 0.0 0.773 -0.627 1.4 -1.4 1.4 H 2.4 l -0.143 -0.007 C 1.55 12.421 1.0 11.825 1.0 11.1 V 9.9 C 1.0 9.176 1.55 8.58 2.257 8.507 L 2.4 8.5 h 11.2 Z m -11.2 1.0 C 2.18 9.5 2.0 9.68 2.0 9.9 v 1.2 c 0.0 0.22 0.18 0.4 0.4 0.4 h 11.2 c 0.22 0.0 0.4 -0.18 0.4 -0.4 V 9.9 c 0.0 -0.22 -0.18 -0.4 -0.4 -0.4 H 2.4 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.6 3.5 c 0.773 0.0 1.4 0.627 1.4 1.4 v 1.2 c 0.0 0.773 -0.627 1.4 -1.4 1.4 H 2.4 L 2.257 7.493 C 1.55 7.421 1.0 6.824 1.0 6.1 V 4.9 C 1.0 4.176 1.55 3.58 2.257 3.507 L 2.4 3.5 h 11.2 Z m -11.2 1.0 C 2.18 4.5 2.0 4.68 2.0 4.9 v 1.2 c 0.0 0.22 0.18 0.4 0.4 0.4 h 11.2 c 0.22 0.0 0.4 -0.18 0.4 -0.4 V 4.9 c 0.0 -0.22 -0.18 -0.4 -0.4 -0.4 H 2.4 Z")
        )
    }.build()
}
