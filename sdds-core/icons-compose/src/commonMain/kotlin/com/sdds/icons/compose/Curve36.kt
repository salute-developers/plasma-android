package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Curve36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Curve36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 32.755 8.014 c 0.432 0.343 0.505 0.972 0.161 1.405 l -8.02 10.107 c -1.319 1.662 -3.705 2.006 -5.439 0.783 l -3.66 -2.58 c -0.867 -0.612 -2.06 -0.44 -2.72 0.39 l -8.02 10.108 C 4.712 28.66 4.083 28.733 3.65 28.39 c -0.432 -0.343 -0.505 -0.972 -0.161 -1.405 l 8.02 -10.108 c 1.319 -1.661 3.705 -2.005 5.439 -0.782 l 3.66 2.58 c 0.867 0.612 2.06 0.44 2.72 -0.39 l 8.02 -10.109 c 0.344 -0.432 0.973 -0.505 1.406 -0.161 Z")
        )
    }.build()
}
