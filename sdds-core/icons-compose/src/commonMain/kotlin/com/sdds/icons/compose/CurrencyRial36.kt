package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CurrencyRial36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CurrencyRial36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.87 11.75 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 3.375 c 2.416 0.0 4.375 1.959 4.375 4.375 c 0.0 1.87 -1.173 3.466 -2.824 4.092 l 2.696 4.793 c 0.27 0.481 0.1 1.09 -0.382 1.362 c -0.481 0.27 -1.09 0.1 -1.361 -0.382 L 19.66 19.5 h -1.79 v 5.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 V 11.75 Z m 2.0 5.75 h 2.355 h 0.035 c 1.305 -0.008 2.36 -1.068 2.36 -2.375 c 0.0 -1.312 -1.063 -2.375 -2.375 -2.375 H 17.87 v 4.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.37 10.75 c 0.552 0.0 1.0 0.448 1.0 1.0 V 24.5 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 V 11.75 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 Z")
        )
    }.build()
}
