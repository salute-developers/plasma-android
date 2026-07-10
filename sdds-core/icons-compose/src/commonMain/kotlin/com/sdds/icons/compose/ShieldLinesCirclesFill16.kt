package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldLinesCirclesFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldLinesCirclesFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.383 1.116 c -0.233 -0.155 -0.533 -0.155 -0.766 0.0 c -0.271 0.18 -1.11 0.72 -2.144 1.212 c -1.05 0.5 -2.23 0.917 -3.202 0.917 c -0.288 0.0 -0.521 0.236 -0.521 0.526 c 0.0 1.878 0.205 3.448 0.543 4.76 l 5.538 -3.229 C 7.826 5.26 7.824 5.218 7.824 5.175 c 0.0 -0.678 0.544 -1.228 1.216 -1.228 c 0.67 0.0 1.215 0.55 1.215 1.228 c 0.0 0.678 -0.544 1.228 -1.215 1.228 c -0.267 0.0 -0.513 -0.086 -0.713 -0.233 l -5.74 3.347 c 0.548 1.6 1.304 2.748 2.09 3.569 c 1.506 1.575 3.055 1.876 3.23 1.906 H 7.91 l 0.013 0.003 C 7.938 14.997 7.966 15.0 8.0 15.0 c 0.034 0.0 0.062 -0.003 0.076 -0.005 l 0.013 -0.003 h 0.003 h 0.001 c 0.175 -0.03 1.724 -0.331 3.23 -1.906 c 1.112 -1.162 2.167 -2.98 2.65 -5.808 l -5.807 3.385 c 0.005 0.042 0.007 0.084 0.007 0.127 c 0.0 0.678 -0.544 1.228 -1.215 1.228 c -0.672 0.0 -1.216 -0.55 -1.216 -1.228 c 0.0 -0.678 0.544 -1.228 1.216 -1.228 c 0.266 0.0 0.512 0.086 0.712 0.233 l 6.473 -3.773 c 0.07 -0.696 0.107 -1.445 0.107 -2.25 c 0.0 -0.291 -0.233 -0.527 -0.52 -0.527 c -0.973 0.0 -2.154 -0.417 -3.203 -0.917 c -1.034 -0.493 -1.873 -1.032 -2.144 -1.212 Z")
        )
    }.build()
}
