package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RubleFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RubleFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 33.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 Z m -1.875 -22.375 c -0.552 0.0 -1.0 0.448 -1.0 1.0 v 5.75 h -1.25 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 1.25 v 1.75 h -1.25 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 1.25 V 25.5 h 2.0 v -2.375 h 2.75 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -2.75 v -1.75 H 19.5 c 2.416 0.0 4.375 -1.959 4.375 -4.375 s -1.959 -4.375 -4.375 -4.375 h -3.375 Z m 3.375 6.75 h -2.375 v -4.75 H 19.5 c 1.312 0.0 2.375 1.063 2.375 2.375 s -1.063 2.375 -2.375 2.375 Z")
        )
    }.build()
}
