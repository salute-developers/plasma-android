package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlaneFlyFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlaneFlyFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.952 2.268 C 5.867 1.873 6.168 1.5 6.572 1.5 c 0.473 0.0 0.906 0.263 1.125 0.682 l 2.372 4.542 l 2.775 -0.086 C 13.614 6.614 14.25 7.231 14.25 8.0 c 0.0 0.77 -0.636 1.386 -1.405 1.362 L 10.07 9.277 l -2.372 4.542 C 7.478 14.238 7.045 14.5 6.572 14.5 c -0.404 0.0 -0.705 -0.373 -0.62 -0.768 L 6.931 9.18 L 4.361 9.1 L 3.784 9.69 C 3.52 9.958 3.16 10.108 2.784 10.108 H 1.925 c -0.13 0.0 -0.214 -0.135 -0.157 -0.252 L 2.681 8.0 h 0.17 h -0.17 L 1.768 6.144 C 1.711 6.028 1.796 5.892 1.925 5.892 h 0.86 c 0.375 0.0 0.735 0.15 0.998 0.418 l 0.58 0.59 L 6.93 6.82 L 5.952 2.268 Z")
        )
    }.build()
}
