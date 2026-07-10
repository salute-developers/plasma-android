package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Silent224: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Silent224",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 1.9 c -0.497 0.0 -0.9 -0.403 -0.9 -0.9 s 0.403 -0.9 0.9 -0.9 h 4.5 c 0.364 0.0 0.692 0.219 0.832 0.555 c 0.139 0.337 0.062 0.724 -0.195 0.981 L 20.173 4.6 H 22.5 c 0.497 0.0 0.9 0.403 0.9 0.9 s -0.403 0.9 -0.9 0.9 H 18.0 c -0.364 0.0 -0.692 -0.22 -0.831 -0.556 c -0.14 -0.336 -0.063 -0.723 0.195 -0.98 L 20.327 1.9 H 18.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 12.0 C 2.0 6.477 6.477 2.0 12.0 2.0 c 1.864 0.0 3.609 0.51 5.102 1.398 L 16.5 4.0 c -1.333 1.334 -0.5 3.5 1.0 3.5 h 3.433 C 21.615 8.853 22.0 10.381 22.0 12.0 c 0.0 5.523 -4.477 10.0 -10.0 10.0 S 2.0 17.523 2.0 12.0 Z m 9.0 -4.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 v 4.423 l 2.098 1.211 c 0.478 0.276 0.642 0.888 0.366 1.366 c -0.276 0.478 -0.888 0.642 -1.366 0.366 l -2.58 -1.49 c -0.04 -0.022 -0.08 -0.047 -0.116 -0.075 c -0.226 -0.169 -0.379 -0.432 -0.4 -0.73 C 11.0 13.04 11.0 13.012 11.0 12.983 V 8.0 Z")
        )
    }.build()
}
