package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NextFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NextFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 31.0 28.998 c 0.0 0.552 -0.447 1.0 -1.0 1.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 V 7.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 c 0.553 0.0 1.0 0.448 1.0 1.0 v 21.998 Z m -7.568 -12.541 c 1.44 0.876 1.44 2.967 0.0 3.844 L 8.42 29.437 C 6.92 30.349 5.0 29.27 5.0 27.515 V 9.243 C 5.0 7.488 6.92 6.41 8.42 7.321 l 15.012 9.136 Z")
        )
    }.build()
}
