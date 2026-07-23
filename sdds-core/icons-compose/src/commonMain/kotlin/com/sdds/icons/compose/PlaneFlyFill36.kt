package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlaneFlyFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlaneFlyFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.583 5.66 C 13.398 4.806 14.049 4.0 14.923 4.0 c 1.02 0.0 1.955 0.566 2.429 1.47 l 5.122 9.78 l 6.004 -0.184 c 1.656 -0.051 3.026 1.277 3.026 2.934 c 0.0 1.656 -1.37 2.985 -3.026 2.934 l -6.002 -0.185 l -5.123 9.781 C 16.88 31.434 15.945 32.0 14.925 32.0 c -0.874 0.0 -1.525 -0.806 -1.34 -1.66 l 2.113 -9.8 l -5.554 -0.17 l -1.26 1.277 c -0.563 0.572 -1.333 0.894 -2.136 0.894 H 4.876 c -0.277 0.0 -0.459 -0.292 -0.336 -0.54 l 1.972 -4.0 h 0.373 h -0.373 L 4.54 14.0 c -0.123 -0.25 0.059 -0.541 0.336 -0.541 h 1.872 c 0.803 0.0 1.573 0.322 2.137 0.894 l 1.258 1.276 l 5.553 -0.17 l -2.113 -9.8 Z")
        )
    }.build()
}
