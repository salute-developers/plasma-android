package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PinDashOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PinDashOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.618 12.19 C 19.496 13.34 18.675 15.0 17.227 15.0 h -4.232 v 5.5 l -1.0 1.5 l -1.0 -1.5 v -4.318 l 2.682 -2.682 h 3.55 c 0.206 0.0 0.323 -0.237 0.198 -0.401 l -1.447 -1.9 l 1.07 -1.07 l 1.57 2.06 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.66 2.0 c 0.768 0.0 1.355 0.688 1.234 1.447 L 16.4 6.535 l 3.55 -3.55 c 0.293 -0.293 0.768 -0.293 1.06 0.0 c 0.294 0.292 0.294 0.767 0.0 1.06 L 4.04 21.015 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.292 -0.293 -0.767 0.0 -1.06 L 7.935 15.0 h -1.17 c -1.448 0.0 -2.27 -1.659 -1.393 -2.81 L 7.5 9.396 c 0.29 -0.38 0.412 -0.864 0.336 -1.336 L 7.098 3.447 C 6.976 2.687 7.563 2.0 8.332 2.0 h 7.327 Z M 9.316 7.823 c 0.14 0.878 -0.085 1.776 -0.624 2.484 l -2.127 2.792 C 6.44 13.263 6.558 13.5 6.765 13.5 h 2.67 l 5.198 -5.198 c 0.002 -0.16 0.016 -0.32 0.041 -0.479 L 15.365 3.5 h -6.74 l 0.692 4.323 Z")
        )
    }.build()
}
