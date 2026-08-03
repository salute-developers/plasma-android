package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Clip24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Clip24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.586 4.93 c 2.343 -2.344 6.142 -2.344 8.485 0.0 c 2.343 2.342 2.343 6.141 0.0 8.484 l -7.04 7.04 c -1.195 1.196 -3.076 1.365 -4.466 0.402 c -1.796 -1.243 -2.027 -3.808 -0.483 -5.352 l 7.04 -7.04 c 0.292 -0.292 0.767 -0.292 1.06 0.0 c 0.293 0.294 0.293 0.768 0.0 1.061 l -7.04 7.04 c -0.882 0.882 -0.75 2.348 0.277 3.058 c 0.794 0.55 1.869 0.453 2.552 -0.23 l 7.04 -7.04 c 1.757 -1.757 1.757 -4.606 0.0 -6.363 c -1.758 -1.758 -4.607 -1.758 -6.365 0.0 l -7.778 7.778 c -0.293 0.293 -0.768 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.768 0.0 -1.06 l 7.778 -7.779 Z")
        )
    }.build()
}
