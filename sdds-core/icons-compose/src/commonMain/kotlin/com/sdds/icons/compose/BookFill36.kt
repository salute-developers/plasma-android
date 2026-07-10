package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BookFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BookFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.75 3.25 c -2.485 0.0 -4.5 2.015 -4.5 4.5 V 29.5 l 0.115 -0.077 v 0.053 v 0.016 v 0.017 c 0.005 1.788 1.453 3.236 3.24 3.241 h 18.649 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 H 9.611 c -0.687 -0.002 -1.244 -0.559 -1.246 -1.247 v -0.022 c 0.001 -0.505 0.302 -0.94 0.734 -1.136 h 17.647 c 1.657 0.0 3.0 -1.343 3.0 -3.0 V 6.25 c 0.0 -1.657 -1.343 -3.0 -3.0 -3.0 H 10.75 Z")
        )
    }.build()
}
