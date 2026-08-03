package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BirrOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BirrOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 7.0 C 7.586 7.0 7.25 7.336 7.25 7.75 v 8.5 C 7.25 16.664 7.586 17.0 8.0 17.0 h 2.35 c 1.6 0.0 2.893 -1.308 2.875 -2.909 c -0.013 -1.09 -0.633 -2.034 -1.535 -2.51 c 0.352 -0.477 0.56 -1.067 0.56 -1.706 C 12.25 8.287 10.963 7.0 9.375 7.0 H 8.0 Z m 0.75 8.5 v -2.75 h 1.6 c 0.753 0.0 1.366 0.606 1.375 1.359 c 0.009 0.765 -0.61 1.391 -1.375 1.391 h -1.6 Z m 0.625 -4.25 H 8.75 V 8.5 h 0.625 c 0.76 0.0 1.375 0.616 1.375 1.375 c 0.0 0.76 -0.616 1.375 -1.375 1.375 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.0 12.5 c -0.966 0.0 -1.75 0.784 -1.75 1.75 v 2.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 V 11.5 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 s 0.75 0.336 0.75 0.75 v 0.01 C 15.755 11.189 16.356 11.0 17.0 11.0 c 0.414 0.0 0.75 0.336 0.75 0.75 S 17.414 12.5 17.0 12.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 2.0 C 6.477 2.0 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 s 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 Z M 3.5 12.0 c 0.0 -4.694 3.806 -8.5 8.5 -8.5 s 8.5 3.806 8.5 8.5 s -3.806 8.5 -8.5 8.5 s -8.5 -3.806 -8.5 -8.5 Z")
        )
    }.build()
}
