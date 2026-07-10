package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BatteryEmptyOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BatteryEmptyOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.875 1.7 c 0.0 -0.387 0.314 -0.7 0.7 -0.7 h 2.85 c 0.387 0.0 0.7 0.313 0.7 0.7 v 0.73 c 0.38 0.03 0.66 0.09 0.902 0.214 c 0.421 0.215 0.764 0.558 0.979 0.98 c 0.244 0.478 0.244 1.105 0.244 2.36 v 5.432 c 0.0 1.255 0.0 1.882 -0.244 2.36 c -0.215 0.422 -0.558 0.765 -0.98 0.98 C 10.549 15.0 9.922 15.0 8.667 15.0 H 7.334 c -1.255 0.0 -1.882 0.0 -2.36 -0.244 c -0.422 -0.215 -0.765 -0.558 -0.98 -0.98 c -0.244 -0.478 -0.244 -1.105 -0.244 -2.36 V 5.984 c 0.0 -1.255 0.0 -1.882 0.244 -2.36 c 0.215 -0.422 0.558 -0.765 0.98 -0.98 C 5.214 2.521 5.494 2.46 5.874 2.43 V 1.7 Z m 0.337 1.75 c -0.773 0.0 -1.4 0.627 -1.4 1.4 v 7.7 c 0.0 0.773 0.627 1.4 1.4 1.4 h 3.575 c 0.773 0.0 1.4 -0.627 1.4 -1.4 v -7.7 c 0.0 -0.773 -0.627 -1.4 -1.4 -1.4 H 6.212 Z")
        )
    }.build()
}
