package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.KeyFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "KeyFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.0 8.75 c 0.0 3.176 -2.574 5.75 -5.75 5.75 c -1.183 0.0 -2.283 -0.357 -3.197 -0.97 c -0.175 -0.117 -0.422 0.002 -0.422 0.213 V 16.0 c 0.0 0.138 -0.112 0.25 -0.25 0.25 H 9.25 C 9.112 16.25 9.0 16.362 9.0 16.5 v 1.75 c 0.0 0.138 -0.112 0.25 -0.25 0.25 H 6.308 c -0.138 0.0 -0.25 0.112 -0.25 0.25 v 2.442 c 0.0 0.139 -0.112 0.25 -0.25 0.25 H 3.25 c -0.138 0.0 -0.25 -0.111 -0.25 -0.25 v -4.256 c 0.0 -0.067 0.026 -0.13 0.073 -0.177 l 6.5 -6.5 c 0.063 -0.062 0.087 -0.153 0.068 -0.239 C 9.549 9.613 9.5 9.188 9.5 8.75 C 9.5 5.574 12.074 3.0 15.25 3.0 S 21.0 5.574 21.0 8.75 Z M 16.5 9.0 C 17.328 9.0 18.0 8.328 18.0 7.5 S 17.328 6.0 16.5 6.0 S 15.0 6.672 15.0 7.5 S 15.672 9.0 16.5 9.0 Z")
        )
    }.build()
}
