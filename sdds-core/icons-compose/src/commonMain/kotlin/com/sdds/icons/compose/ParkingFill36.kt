package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ParkingFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ParkingFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.375 4.5 C 6.683 4.5 4.5 6.683 4.5 9.375 v 17.25 c 0.0 2.692 2.183 4.875 4.875 4.875 h 17.25 c 2.692 0.0 4.875 -2.183 4.875 -4.875 V 9.375 c 0.0 -2.692 -2.183 -4.875 -4.875 -4.875 H 9.375 Z m 4.5 6.875 c -0.552 0.0 -1.0 0.448 -1.0 1.0 v 11.25 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 v -3.5 H 19.5 c 2.416 0.0 4.375 -1.959 4.375 -4.375 s -1.959 -4.375 -4.375 -4.375 h -5.625 Z m 5.625 6.75 h -4.625 v -4.75 H 19.5 c 1.312 0.0 2.375 1.063 2.375 2.375 s -1.063 2.375 -2.375 2.375 Z")
        )
    }.build()
}
