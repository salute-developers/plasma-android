package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Battery10Outline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Battery10Outline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.575 1.0 c -0.386 0.0 -0.7 0.313 -0.7 0.7 v 0.73 c -0.38 0.03 -0.66 0.09 -0.902 0.214 C 4.552 2.86 4.21 3.202 3.994 3.624 C 3.75 4.101 3.75 4.728 3.75 5.983 v 5.432 c 0.0 1.255 0.0 1.882 0.244 2.36 c 0.215 0.422 0.558 0.765 0.98 0.98 C 5.451 15.0 6.078 15.0 7.333 15.0 h 1.332 c 1.255 0.0 1.882 0.0 2.36 -0.244 c 0.422 -0.215 0.765 -0.558 0.98 -0.98 c 0.244 -0.478 0.244 -1.105 0.244 -2.36 V 5.984 c 0.0 -1.255 0.0 -1.882 -0.244 -2.36 c -0.215 -0.422 -0.558 -0.765 -0.98 -0.98 c -0.241 -0.123 -0.521 -0.184 -0.9 -0.214 V 1.7 c 0.0 -0.387 -0.314 -0.7 -0.7 -0.7 h -2.85 Z M 4.812 4.85 c 0.0 -0.773 0.627 -1.4 1.4 -1.4 h 3.575 c 0.773 0.0 1.4 0.627 1.4 1.4 v 7.7 c 0.0 0.773 -0.627 1.4 -1.4 1.4 H 6.212 c -0.773 0.0 -1.4 -0.627 -1.4 -1.4 v -7.7 Z m 0.709 8.05 c 0.0 0.193 0.157 0.35 0.35 0.35 h 4.258 c 0.194 0.0 0.35 -0.157 0.35 -0.35 v -0.35 c 0.0 -0.193 -0.156 -0.35 -0.35 -0.35 H 5.871 c -0.193 0.0 -0.35 0.157 -0.35 0.35 v 0.35 Z")
        )
    }.build()
}
