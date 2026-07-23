package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableColumnOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableColumnOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.5 13.6 l -0.007 0.143 C 7.421 14.45 6.824 15.0 6.1 15.0 H 4.9 c -0.724 0.0 -1.321 -0.55 -1.393 -1.257 L 3.5 13.6 V 2.4 C 3.5 1.627 4.127 1.0 4.9 1.0 h 1.2 c 0.773 0.0 1.4 0.627 1.4 1.4 v 11.2 Z m -1.0 -11.2 C 6.5 2.18 6.32 2.0 6.1 2.0 H 4.9 C 4.68 2.0 4.5 2.18 4.5 2.4 v 11.2 c 0.0 0.22 0.18 0.4 0.4 0.4 h 1.2 c 0.22 0.0 0.4 -0.18 0.4 -0.4 V 2.4 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.5 13.6 l -0.007 0.143 C 12.421 14.45 11.825 15.0 11.1 15.0 H 9.9 c -0.724 0.0 -1.321 -0.55 -1.393 -1.257 L 8.5 13.6 V 2.4 C 8.5 1.627 9.127 1.0 9.9 1.0 h 1.2 c 0.773 0.0 1.4 0.627 1.4 1.4 v 11.2 Z m -1.0 -11.2 c 0.0 -0.22 -0.18 -0.4 -0.4 -0.4 H 9.9 C 9.68 2.0 9.5 2.18 9.5 2.4 v 11.2 c 0.0 0.22 0.18 0.4 0.4 0.4 h 1.2 c 0.22 0.0 0.4 -0.18 0.4 -0.4 V 2.4 Z")
        )
    }.build()
}
