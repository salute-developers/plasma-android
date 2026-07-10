package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloudErrorOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloudErrorOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 23.0 6.5 c 0.0 3.038 -2.462 5.5 -5.5 5.5 S 12.0 9.538 12.0 6.5 S 14.462 1.0 17.5 1.0 S 23.0 3.462 23.0 6.5 Z m -7.975 -2.475 c 0.195 -0.195 0.512 -0.195 0.707 0.0 L 17.5 5.793 l 1.768 -1.768 c 0.195 -0.195 0.512 -0.195 0.707 0.0 c 0.195 0.195 0.195 0.512 0.0 0.707 L 18.207 6.5 l 1.768 1.768 c 0.195 0.195 0.195 0.512 0.0 0.707 c -0.195 0.195 -0.512 0.195 -0.707 0.0 L 17.5 7.207 l -1.768 1.768 c -0.195 0.195 -0.512 0.195 -0.707 0.0 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 L 16.793 6.5 l -1.768 -1.768 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.324 8.678 c 0.745 -2.311 2.702 -4.08 5.123 -4.552 c -0.205 0.523 -0.345 1.08 -0.408 1.66 c -1.34 0.461 -2.436 1.45 -3.037 2.72 c 3.059 0.132 5.498 2.653 5.498 5.744 c 0.0 0.414 -0.336 0.75 -0.75 0.75 S 12.0 14.664 12.0 14.25 C 12.0 11.903 10.097 10.0 7.75 10.0 c -0.24 0.0 -0.476 0.02 -0.705 0.058 C 5.034 10.393 3.5 12.143 3.5 14.25 c 0.0 2.347 1.903 4.25 4.25 4.25 h 9.75 c 1.657 0.0 3.0 -1.343 3.0 -3.0 c 0.0 -1.149 -0.646 -2.148 -1.596 -2.652 c 0.595 -0.13 1.159 -0.343 1.68 -0.625 C 21.456 13.043 22.0 14.208 22.0 15.5 c 0.0 2.485 -2.015 4.5 -4.5 4.5 H 7.75 C 4.574 20.0 2.0 17.426 2.0 14.25 c 0.0 -2.684 1.838 -4.937 4.324 -5.572 Z")
        )
    }.build()
}
