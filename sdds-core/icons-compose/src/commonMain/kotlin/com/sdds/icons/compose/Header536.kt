package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Header536: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Header536",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.0 19.074 V 26.0 h 2.25 V 10.0 H 16.0 v 6.36 h -5.285 V 10.0 H 8.5 v 16.0 h 2.215 v -6.926 H 16.0 Z m 4.0 2.61 c 0.852 0.994 2.28 1.65 3.905 1.627 c 1.844 0.0 2.657 -1.13 2.657 -2.644 c 0.0 -1.695 -1.19 -2.554 -3.192 -2.554 c -1.21 0.0 -2.26 0.249 -2.993 0.542 L 20.852 10.0 h 7.434 v 2.599 h -5.431 l -0.199 3.39 c 0.417 -0.113 1.15 -0.204 1.666 -0.204 c 3.072 0.0 4.678 2.012 4.678 4.882 C 29.0 24.124 26.859 26.0 23.985 26.0 c -1.983 0.0 -3.39 -0.836 -3.985 -1.446 v -2.87 Z")
        )
    }.build()
}
