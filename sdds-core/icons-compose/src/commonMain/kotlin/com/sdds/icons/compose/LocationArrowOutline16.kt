package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LocationArrowOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LocationArrowOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 2.886 c 0.68 -0.253 1.345 0.411 1.092 1.093 l -3.92 10.555 c -0.295 0.793 -1.44 0.717 -1.627 -0.108 L 6.44 9.54 L 1.552 8.433 C 0.727 8.246 0.652 7.1 1.444 6.807 l 10.555 -3.92 Z m 0.04 1.051 L 2.265 7.57 l 4.488 1.016 c 0.32 0.072 0.569 0.322 0.641 0.641 l 1.016 4.488 l 3.632 -9.777 Z")
        )
    }.build()
}
