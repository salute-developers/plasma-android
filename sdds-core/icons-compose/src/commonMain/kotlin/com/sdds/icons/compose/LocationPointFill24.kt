package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LocationPointFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LocationPointFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 16.0 c 2.21 0.0 4.0 -1.79 4.0 -4.0 s -1.79 -4.0 -4.0 -4.0 s -4.0 1.79 -4.0 4.0 s 1.79 4.0 4.0 4.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.0 3.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 v 1.314 C 7.52 4.762 4.762 7.52 4.314 11.0 H 3.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 1.314 C 4.762 16.48 7.52 19.238 11.0 19.686 V 21.0 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 v -1.314 c 3.48 -0.448 6.238 -3.206 6.686 -6.686 H 21.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -1.314 C 19.238 7.52 16.48 4.762 13.0 4.314 V 3.0 Z m -6.75 9.0 c 0.0 -3.176 2.574 -5.75 5.75 -5.75 s 5.75 2.574 5.75 5.75 s -2.574 5.75 -5.75 5.75 S 6.25 15.176 6.25 12.0 Z")
        )
    }.build()
}
