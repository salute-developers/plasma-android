package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CurrencyRuble24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CurrencyRuble24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.0 7.75 C 10.0 7.336 10.336 7.0 10.75 7.0 H 13.0 c 1.657 0.0 3.0 1.343 3.0 3.0 s -1.343 3.0 -3.0 3.0 h -1.5 v 1.0 h 1.75 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 11.5 v 0.75 c 0.0 0.414 -0.336 0.75 -0.75 0.75 S 10.0 16.664 10.0 16.25 V 15.5 H 9.25 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 S 8.836 14.0 9.25 14.0 H 10.0 v -1.0 H 9.25 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 s 0.336 -0.75 0.75 -0.75 H 10.0 V 7.75 Z m 1.5 3.75 H 13.0 c 0.828 0.0 1.5 -0.672 1.5 -1.5 S 13.828 8.5 13.0 8.5 h -1.5 v 3.0 Z")
        )
    }.build()
}
