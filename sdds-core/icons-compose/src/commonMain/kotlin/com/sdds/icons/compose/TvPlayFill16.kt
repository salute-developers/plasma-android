package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TvPlayFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TvPlayFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.0 3.9 c 0.0 -0.49 0.0 -0.735 0.095 -0.922 c 0.084 -0.165 0.218 -0.299 0.383 -0.383 C 1.665 2.5 1.91 2.5 2.4 2.5 h 11.2 c 0.49 0.0 0.735 0.0 0.922 0.095 c 0.165 0.084 0.299 0.218 0.383 0.383 C 15.0 3.165 15.0 3.41 15.0 3.9 v 6.48 c 0.0 0.49 0.0 0.735 -0.095 0.922 c -0.084 0.165 -0.218 0.299 -0.383 0.383 c -0.187 0.095 -0.432 0.095 -0.922 0.095 H 2.4 c -0.49 0.0 -0.735 0.0 -0.922 -0.095 c -0.165 -0.084 -0.299 -0.218 -0.383 -0.383 C 1.0 11.115 1.0 10.87 1.0 10.38 V 3.9 Z m 1.4 8.594 h 11.2 V 13.5 H 2.4 v -1.006 Z m 7.575 -4.94 c 0.233 -0.136 0.233 -0.472 0.0 -0.607 L 6.9 5.172 C 6.667 5.037 6.375 5.205 6.375 5.475 v 3.55 c 0.0 0.27 0.292 0.438 0.525 0.303 l 3.075 -1.775 Z")
        )
    }.build()
}
