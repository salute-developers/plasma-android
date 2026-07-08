package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoorROpenOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoorROpenOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.082 19.5 c -0.833 0.0 -1.508 -0.672 -1.508 -1.5 c 0.0 -0.827 0.675 -1.499 1.508 -1.499 s 1.508 0.672 1.508 1.5 c 0.0 0.827 -0.675 1.499 -1.508 1.499 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.864 2.599 c -1.599 -0.46 -3.192 0.74 -3.192 2.403 v 0.256 H 8.64 C 7.182 5.258 6.0 6.432 6.0 7.88 V 28.12 c 0.0 1.449 1.182 2.623 2.64 2.623 h 5.032 V 31.0 c 0.0 1.663 1.593 2.862 3.192 2.402 l 11.327 -3.26 C 29.262 29.836 30.0 28.856 30.0 27.74 V 8.261 c 0.0 -1.114 -0.738 -2.094 -1.809 -2.403 L 16.864 2.6 Z m -1.192 2.403 c 0.0 -0.333 0.319 -0.573 0.639 -0.481 l 11.327 3.26 C 27.852 7.842 28.0 8.038 28.0 8.26 v 19.48 c 0.0 0.222 -0.148 0.418 -0.362 0.48 L 16.31 31.48 c -0.32 0.091 -0.638 -0.149 -0.638 -0.481 V 5.002 Z")
        )
    }.build()
}
