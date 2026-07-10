package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Header216: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Header216",
        defaultWidth = 17.dp,
        defaultHeight = 16.dp,
        viewportWidth = 17f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.571 8.47 v 3.03 h 1.0 v -7.0 h -1.0 v 2.82 h -2.5 V 4.5 h -1.0 v 7.0 h 1.0 V 8.47 h 2.5 Z m 1.75 3.03 h 4.0 v -1.135 h -2.499 l 0.344 -0.346 c 1.484 -1.471 1.996 -2.37 1.996 -3.505 c 0.0 -1.214 -0.663 -2.004 -1.895 -2.014 c -0.83 -0.01 -1.476 0.356 -1.761 0.691 v 1.313 c 0.386 -0.523 0.939 -0.81 1.61 -0.8 c 0.629 0.0 1.014 0.386 1.014 1.067 c 0.0 0.71 -0.377 1.441 -2.809 3.88 V 11.5 Z")
        )
    }.build()
}
