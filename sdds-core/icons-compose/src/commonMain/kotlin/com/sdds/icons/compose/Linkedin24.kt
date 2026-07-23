package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Linkedin24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Linkedin24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.68 11.09 v 0.028 h -0.018 l 0.018 -0.027 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.0 3.0 C 4.79 3.0 3.0 4.79 3.0 7.0 v 10.0 c 0.0 2.21 1.79 4.0 4.0 4.0 h 10.0 c 2.21 0.0 4.0 -1.79 4.0 -4.0 V 7.0 c 0.0 -2.21 -1.79 -4.0 -4.0 -4.0 H 7.0 Z m 1.457 15.068 V 9.94 h -2.72 v 8.128 h 2.72 Z M 7.097 8.83 c 0.948 0.0 1.538 -0.624 1.538 -1.404 c -0.017 -0.798 -0.59 -1.405 -1.52 -1.405 S 5.577 6.628 5.577 7.426 c 0.0 0.78 0.59 1.404 1.503 1.404 h 0.017 Z m 2.864 9.238 h 2.719 v -4.54 c 0.0 -0.242 0.017 -0.485 0.09 -0.659 c 0.196 -0.485 0.643 -0.988 1.394 -0.988 c 0.984 0.0 1.377 0.746 1.377 1.838 v 4.349 h 2.719 v -4.66 c 0.0 -2.497 -1.341 -3.659 -3.13 -3.659 c -1.442 0.0 -2.089 0.788 -2.45 1.341 V 9.94 H 9.96 c 0.036 0.762 0.0 8.128 0.0 8.128 Z")
        )
    }.build()
}
