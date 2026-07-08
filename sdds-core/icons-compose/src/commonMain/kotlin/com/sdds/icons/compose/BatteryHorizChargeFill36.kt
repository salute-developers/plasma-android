package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BatteryHorizChargeFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BatteryHorizChargeFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 31.5 13.5 c 0.828 0.0 1.5 0.672 1.5 1.5 v 6.0 c 0.0 0.828 -0.672 1.5 -1.5 1.5 h -1.662 c -0.078 0.433 -0.192 0.797 -0.361 1.13 c -0.46 0.902 -1.195 1.637 -2.098 2.097 c -1.027 0.523 -2.37 0.523 -5.059 0.523 H 10.68 c -2.688 0.0 -4.032 0.0 -5.06 -0.523 c -0.902 -0.46 -1.637 -1.195 -2.097 -2.098 C 3.0 22.602 3.0 21.26 3.0 18.57 v -1.14 c 0.0 -2.688 0.0 -4.032 0.523 -5.06 c 0.46 -0.902 1.195 -1.637 2.098 -2.097 C 6.648 9.75 7.99 9.75 10.68 9.75 h 11.64 c 2.688 0.0 4.032 0.0 5.06 0.523 c 0.902 0.46 1.637 1.195 2.097 2.098 c 0.169 0.332 0.283 0.696 0.36 1.129 H 31.5 Z m -19.85 5.005 c -0.243 0.336 0.0 1.051 0.418 1.051 h 4.062 l -1.532 4.178 c -0.068 0.522 0.617 0.787 0.927 0.359 l 5.822 -6.485 c 0.242 -0.336 0.014 -1.052 -0.404 -1.052 h -4.11 l 1.485 -4.177 c 0.068 -0.522 -0.617 -0.787 -0.927 -0.359 l -5.74 6.485 Z")
        )
    }.build()
}
