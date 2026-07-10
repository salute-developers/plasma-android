package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TvModeFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TvModeFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.0 3.9 c 0.0 -0.49 0.0 -0.735 0.095 -0.922 c 0.084 -0.165 0.218 -0.299 0.383 -0.383 C 1.665 2.5 1.91 2.5 2.4 2.5 h 11.2 c 0.49 0.0 0.735 0.0 0.922 0.095 c 0.165 0.084 0.299 0.218 0.383 0.383 C 15.0 3.165 15.0 3.41 15.0 3.9 v 6.48 c 0.0 0.49 0.0 0.735 -0.095 0.922 c -0.084 0.165 -0.218 0.299 -0.383 0.383 c -0.187 0.095 -0.432 0.095 -0.922 0.095 H 2.4 c -0.49 0.0 -0.735 0.0 -0.922 -0.095 c -0.165 -0.084 -0.299 -0.218 -0.383 -0.383 C 1.0 11.115 1.0 10.87 1.0 10.38 V 3.9 Z m 1.4 8.594 h 11.2 V 13.5 H 2.4 v -1.006 Z M 4.0 5.25 h 3.467 v 0.857 H 6.175 V 9.25 H 5.24 V 6.107 H 4.0 V 5.25 Z m 8.0 0.0 l -1.643 4.0 H 9.445 l -1.66 -4.0 h 0.987 l 1.135 2.874 l 1.152 -2.874 H 12.0 Z")
        )
    }.build()
}
