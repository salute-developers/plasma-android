package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LocationPinOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LocationPinOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.25 15.0 c 0.0 -5.385 4.365 -9.75 9.75 -9.75 s 9.75 4.365 9.75 9.75 c 0.0 3.724 -2.135 7.405 -4.615 10.39 c -1.945 2.341 -4.008 4.143 -5.135 5.056 c -1.127 -0.913 -3.19 -2.715 -5.135 -5.056 C 10.385 22.405 8.25 18.724 8.25 15.0 Z M 18.0 3.0 C 11.373 3.0 6.0 8.373 6.0 15.0 c 0.0 4.526 2.552 8.72 5.135 11.828 c 2.607 3.139 5.4 5.355 6.19 5.947 c 0.4 0.3 0.95 0.3 1.35 0.0 c 0.79 -0.592 3.583 -2.808 6.19 -5.947 C 27.448 23.72 30.0 19.526 30.0 15.0 c 0.0 -6.627 -5.373 -12.0 -12.0 -12.0 Z m -3.0 12.0 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 s 3.0 1.343 3.0 3.0 s -1.343 3.0 -3.0 3.0 s -3.0 -1.343 -3.0 -3.0 Z m 3.0 -5.25 c -2.9 0.0 -5.25 2.35 -5.25 5.25 s 2.35 5.25 5.25 5.25 s 5.25 -2.35 5.25 -5.25 S 20.9 9.75 18.0 9.75 Z")
        )
    }.build()
}
