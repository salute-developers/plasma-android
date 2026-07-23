package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CurrencyRuble36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CurrencyRuble36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.25 11.602 c 0.0 -0.553 0.448 -1.0 1.0 -1.0 h 3.375 c 2.416 0.0 4.375 1.958 4.375 4.375 c 0.0 2.416 -1.959 4.375 -4.375 4.375 H 17.25 v 1.75 H 20.0 c 0.552 0.0 1.0 0.447 1.0 1.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 h -2.75 v 1.25 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 v -1.25 H 14.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 c 0.0 -0.553 0.448 -1.0 1.0 -1.0 h 1.25 v -1.75 H 14.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 c 0.0 -0.553 0.448 -1.0 1.0 -1.0 h 1.25 v -5.75 Z m 2.0 5.75 h 2.375 c 1.312 0.0 2.375 -1.064 2.375 -2.375 c 0.0 -1.312 -1.063 -2.375 -2.375 -2.375 H 17.25 v 4.75 Z")
        )
    }.build()
}
