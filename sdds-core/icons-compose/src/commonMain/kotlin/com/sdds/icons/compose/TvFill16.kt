package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TvFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TvFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.095 2.978 C 1.0 3.165 1.0 3.41 1.0 3.9 v 6.48 c 0.0 0.49 0.0 0.735 0.095 0.922 c 0.084 0.165 0.218 0.299 0.383 0.383 C 1.665 11.78 1.91 11.78 2.4 11.78 h 11.2 c 0.49 0.0 0.735 0.0 0.922 -0.095 c 0.165 -0.084 0.299 -0.218 0.383 -0.383 C 15.0 11.115 15.0 10.87 15.0 10.38 V 3.9 c 0.0 -0.49 0.0 -0.735 -0.095 -0.922 c -0.084 -0.165 -0.218 -0.299 -0.383 -0.383 C 14.335 2.5 14.09 2.5 13.6 2.5 H 2.4 c -0.49 0.0 -0.735 0.0 -0.922 0.095 C 1.313 2.68 1.179 2.813 1.095 2.978 Z M 13.6 12.494 H 2.4 V 13.5 h 11.2 v -1.006 Z")
        )
    }.build()
}
