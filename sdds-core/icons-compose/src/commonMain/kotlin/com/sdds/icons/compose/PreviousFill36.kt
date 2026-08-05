package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PreviousFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PreviousFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.0 28.998 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 V 7.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 S 5.0 6.448 5.0 7.0 v 21.998 Z m 7.569 -12.541 c -1.44 0.876 -1.44 2.967 0.0 3.844 l 15.012 9.136 c 1.5 0.912 3.42 -0.167 3.42 -1.922 V 9.243 c 0.0 -1.755 -1.92 -2.834 -3.42 -1.922 L 12.57 16.457 Z")
        )
    }.build()
}
