package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShadowRightOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShadowRightOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.665 2.411 c 0.045 0.005 0.09 0.012 0.135 0.02 V 2.4 h 2.1 l 0.214 0.01 c 0.989 0.1 1.775 0.887 1.875 1.875 L 15.0 4.501 v 7.0 l -0.01 0.214 c -0.108 1.059 -1.003 1.886 -2.09 1.886 h -2.1 v -0.032 c -0.045 0.008 -0.09 0.016 -0.135 0.02 l -0.215 0.012 H 3.1 c -1.16 0.0 -2.1 -0.94 -2.1 -2.1 v -7.0 c 0.0 -1.16 0.94 -2.1 2.1 -2.1 h 7.35 l 0.215 0.01 Z m 1.883 9.112 c -0.006 0.53 -0.205 1.011 -0.533 1.377 h 0.129 l 2.156 -2.156 V 9.772 l -1.752 1.751 Z m 0.339 1.377 h 0.012 c 0.773 0.0 1.4 -0.626 1.4 -1.399 v -0.014 L 12.888 12.9 Z M 3.1 3.4 C 2.492 3.4 2.0 3.894 2.0 4.501 v 7.0 c 0.0 0.607 0.493 1.1 1.1 1.1 h 7.35 c 0.607 0.0 1.1 -0.493 1.1 -1.1 v -7.0 c 0.0 -0.607 -0.492 -1.1 -1.1 -1.1 H 3.1 Z m 9.45 6.023 v 1.356 l 1.75 -1.75 V 7.671 l -1.75 1.75 Z m 0.0 -2.1 v 1.356 l 1.75 -1.75 V 5.572 l -1.75 1.75 Z m 0.0 -2.1 v 1.356 l 1.75 -1.75 V 4.5 c 0.0 -0.291 -0.09 -0.562 -0.242 -0.786 L 12.55 5.223 Z m -0.3 -1.802 c 0.186 0.31 0.294 0.671 0.298 1.058 l 1.137 -1.136 C 13.461 3.19 13.191 3.1 12.9 3.1 h -0.328 L 12.25 3.42 Z")
        )
    }.build()
}
