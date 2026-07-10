package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinPoundFallingFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinPoundFallingFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 24.5 5.51 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 s -1.0 0.447 -1.0 1.0 v 3.765 c 0.0 0.553 0.448 1.0 1.0 1.0 s 1.0 -0.447 1.0 -1.0 V 5.51 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.5 4.004 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 V 7.77 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 V 4.004 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.5 4.51 c 0.552 0.0 1.0 0.447 1.0 1.0 v 3.765 c 0.0 0.553 -0.448 1.0 -1.0 1.0 s -1.0 -0.447 -1.0 -1.0 V 5.51 c 0.0 -0.553 0.448 -1.0 1.0 -1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.5 33.004 c 6.213 0.0 11.25 -5.058 11.25 -11.299 c 0.0 -6.24 -5.037 -11.299 -11.25 -11.299 s -11.25 5.059 -11.25 11.3 c 0.0 6.24 5.037 11.298 11.25 11.298 Z M 13.25 17.5 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 s -0.75 0.336 -0.75 0.75 v 8.85 c 0.0 0.497 0.403 0.9 0.9 0.9 h 4.05 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -3.45 v -8.25 Z m 4.8 0.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 3.85 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 h -3.1 v 2.82 h 3.1 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 h -3.1 v 3.18 H 23.0 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 h -4.05 c -0.497 0.0 -0.9 -0.403 -0.9 -0.9 v -8.85 Z")
        )
    }.build()
}
