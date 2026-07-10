package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LocationPinFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LocationPinFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 3.0 C 11.373 3.0 6.0 8.373 6.0 15.0 c 0.0 4.526 2.552 8.72 5.135 11.828 c 2.607 3.139 5.4 5.355 6.19 5.947 c 0.4 0.3 0.95 0.3 1.35 0.0 c 0.79 -0.592 3.583 -2.808 6.19 -5.947 C 27.448 23.72 30.0 19.526 30.0 15.0 c 0.0 -6.627 -5.373 -12.0 -12.0 -12.0 Z m 0.0 17.25 c 2.9 0.0 5.25 -2.35 5.25 -5.25 S 20.9 9.75 18.0 9.75 S 12.75 12.1 12.75 15.0 s 2.35 5.25 5.25 5.25 Z")
        )
    }.build()
}
