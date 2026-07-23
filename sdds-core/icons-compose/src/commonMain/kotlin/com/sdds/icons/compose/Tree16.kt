package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Tree16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Tree16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.75 4.85 c 0.0 0.773 0.627 1.4 1.4 1.4 h 0.618 v 5.2 c 0.0 0.856 0.694 1.55 1.55 1.55 H 7.25 v 0.1 c 0.0 0.773 0.627 1.4 1.4 1.4 h 4.2 c 0.773 0.0 1.4 -0.627 1.4 -1.4 v -1.2 c 0.0 -0.773 -0.627 -1.4 -1.4 -1.4 h -4.2 c -0.773 0.0 -1.4 0.627 -1.4 1.4 V 12.0 H 5.318 c -0.304 0.0 -0.55 -0.246 -0.55 -0.55 V 8.5 H 7.25 v 0.1 c 0.0 0.773 0.627 1.4 1.4 1.4 h 4.2 c 0.773 0.0 1.4 -0.627 1.4 -1.4 V 7.4 c 0.0 -0.773 -0.627 -1.4 -1.4 -1.4 h -4.2 c -0.773 0.0 -1.4 0.627 -1.4 1.4 v 0.1 H 4.768 V 6.25 H 5.35 c 0.773 0.0 1.4 -0.627 1.4 -1.4 v -1.7 c 0.0 -0.773 -0.627 -1.4 -1.4 -1.4 h -2.2 c -0.773 0.0 -1.4 0.627 -1.4 1.4 v 1.7 Z m 1.0 -1.7 v 1.7 c 0.0 0.22 0.18 0.4 0.4 0.4 h 2.2 c 0.22 0.0 0.4 -0.18 0.4 -0.4 v -1.7 c 0.0 -0.22 -0.18 -0.4 -0.4 -0.4 h -2.2 c -0.22 0.0 -0.4 0.18 -0.4 0.4 Z m 5.5 4.25 v 1.2 c 0.0 0.22 0.18 0.4 0.4 0.4 h 4.2 c 0.22 0.0 0.4 -0.18 0.4 -0.4 V 7.4 c 0.0 -0.22 -0.18 -0.4 -0.4 -0.4 h -4.2 c -0.22 0.0 -0.4 0.18 -0.4 0.4 Z m 0.0 5.7 v -1.2 c 0.0 -0.22 0.18 -0.4 0.4 -0.4 h 4.2 c 0.22 0.0 0.4 0.18 0.4 0.4 v 1.2 c 0.0 0.22 -0.18 0.4 -0.4 0.4 h -4.2 c -0.22 0.0 -0.4 -0.18 -0.4 -0.4 Z")
        )
    }.build()
}
