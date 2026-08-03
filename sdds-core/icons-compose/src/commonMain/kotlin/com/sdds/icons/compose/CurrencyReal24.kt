package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CurrencyReal24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CurrencyReal24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.0 7.25 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 S 14.5 6.836 14.5 7.25 v 0.728 C 13.626 8.287 13.0 9.12 13.0 10.1 v 0.15 c 0.0 1.243 1.007 2.25 2.25 2.25 c 0.414 0.0 0.75 0.336 0.75 0.75 v 0.15 c 0.0 0.414 -0.336 0.75 -0.75 0.75 h -1.167 c -0.414 0.0 -0.75 0.336 -0.75 0.75 s 0.336 0.75 0.75 0.75 H 14.5 v 0.6 c 0.0 0.414 0.336 0.75 0.75 0.75 S 16.0 16.664 16.0 16.25 v -0.728 c 0.874 -0.309 1.5 -1.142 1.5 -2.122 v -0.15 c 0.0 -1.243 -1.007 -2.25 -2.25 -2.25 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 V 10.1 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 1.167 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 16.0 v -0.6 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.75 7.5 C 7.336 7.5 7.0 7.836 7.0 8.25 v 8.0 C 7.0 16.664 7.336 17.0 7.75 17.0 s 0.75 -0.336 0.75 -0.75 v -3.015 h 0.8 l 1.788 3.367 c 0.194 0.366 0.648 0.505 1.014 0.31 c 0.366 -0.194 0.505 -0.648 0.31 -1.014 l -1.559 -2.935 c 0.973 -0.458 1.647 -1.448 1.647 -2.595 c 0.0 -1.584 -1.284 -2.868 -2.868 -2.868 H 7.75 Z m 1.882 4.235 H 8.5 V 9.0 h 1.132 C 10.388 9.0 11.0 9.612 11.0 10.368 c 0.0 0.755 -0.612 1.367 -1.368 1.367 Z")
        )
    }.build()
}
