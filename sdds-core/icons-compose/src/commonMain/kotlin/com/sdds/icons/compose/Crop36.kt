package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Crop36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Crop36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.495 3.0 c 0.552 0.0 1.0 0.448 1.0 1.0 v 3.5 h 14.5 l 0.232 0.006 c 2.377 0.12 4.268 2.086 4.268 4.494 v 14.5 h 3.375 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 h -3.5 V 32.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 v -3.5 H 11.995 c -2.408 0.0 -4.374 -1.89 -4.494 -4.269 L 7.495 24.0 V 9.5 H 4.12 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 h 3.375 V 4.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 Z m 1.0 21.0 c 0.0 1.38 1.12 2.5 2.5 2.5 h 14.5 V 12.0 c 0.0 -1.38 -1.12 -2.5 -2.5 -2.5 h -14.5 V 24.0 Z")
        )
    }.build()
}
