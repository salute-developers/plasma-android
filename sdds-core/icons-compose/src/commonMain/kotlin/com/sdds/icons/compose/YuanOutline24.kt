package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.YuanOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "YuanOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.75 13.327 h 2.05 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -1.412 l 2.24 -3.416 c 0.226 -0.346 0.13 -0.811 -0.217 -1.038 c -0.346 -0.227 -0.811 -0.13 -1.038 0.216 L 12.0 11.209 l -2.373 -3.62 C 9.4 7.242 8.935 7.146 8.59 7.373 C 8.242 7.6 8.146 8.065 8.373 8.41 l 2.239 3.416 H 9.2 c -0.414 0.0 -0.75 0.336 -0.75 0.75 s 0.336 0.75 0.75 0.75 h 2.05 v 1.115 H 9.2 c -0.414 0.0 -0.75 0.336 -0.75 0.75 c 0.0 0.415 0.336 0.75 0.75 0.75 h 2.05 V 16.5 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 v -0.558 h 2.05 c 0.414 0.0 0.75 -0.335 0.75 -0.75 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 h -2.05 v -1.115 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 12.0 C 2.0 6.477 6.477 2.0 12.0 2.0 s 10.0 4.477 10.0 10.0 s -4.477 10.0 -10.0 10.0 S 2.0 17.523 2.0 12.0 Z m 10.0 -8.5 c -4.695 0.0 -8.5 3.806 -8.5 8.5 s 3.805 8.5 8.5 8.5 c 4.694 0.0 8.5 -3.806 8.5 -8.5 S 16.694 3.5 12.0 3.5 Z")
        )
    }.build()
}
