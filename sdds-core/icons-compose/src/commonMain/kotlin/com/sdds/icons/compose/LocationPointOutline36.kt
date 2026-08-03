package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LocationPointOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LocationPointOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.0 4.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 c -0.553 0.0 -1.0 0.448 -1.0 1.0 v 2.828 c -5.397 0.476 -9.696 4.775 -10.172 10.171 H 4.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 c 0.0 0.553 0.448 1.0 1.0 1.0 h 2.828 c 0.476 5.397 4.775 9.696 10.171 10.172 V 32.0 c 0.0 0.552 0.448 1.0 1.0 1.0 c 0.553 0.0 1.0 -0.448 1.0 -1.0 V 29.17 c 5.397 -0.476 9.696 -4.775 10.172 -10.172 H 32.0 c 0.552 0.0 1.0 -0.447 1.0 -1.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 H 29.17 C 28.695 11.603 24.396 7.304 19.0 6.828 V 4.0 Z M 8.783 18.0 c 0.0 -5.09 4.126 -9.216 9.215 -9.216 c 5.09 0.0 9.216 4.126 9.216 9.215 c 0.0 5.09 -4.126 9.216 -9.216 9.216 c -5.09 0.0 -9.215 -4.126 -9.215 -9.216 Z m 9.215 4.54 c 2.508 0.0 4.54 -2.033 4.54 -4.54 c 0.0 -2.508 -2.032 -4.541 -4.54 -4.541 c -2.507 0.0 -4.54 2.033 -4.54 4.54 c 0.0 2.508 2.033 4.54 4.54 4.54 Z")
        )
    }.build()
}
