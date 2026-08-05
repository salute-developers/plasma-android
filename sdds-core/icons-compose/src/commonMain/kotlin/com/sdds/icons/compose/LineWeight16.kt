package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LineWeight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LineWeight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.0 4.6 h 14.0 V 2.5 H 1.0 v 2.1 Z m 14.0 3.423 H 1.0 v -1.4 h 14.0 v 1.4 Z M 1.0 11.106 h 14.0 v -1.05 H 1.0 v 1.05 Z m 0.0 2.397 h 14.0 v -0.7 H 1.0 v 0.7 Z")
        )
    }.build()
}
