package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BatteryHorizEmptyOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BatteryHorizEmptyOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.3 5.875 c 0.387 0.0 0.7 0.314 0.7 0.7 v 2.85 c 0.0 0.387 -0.313 0.7 -0.7 0.7 h -0.73 c -0.03 0.38 -0.09 0.66 -0.214 0.902 c -0.215 0.421 -0.558 0.764 -0.98 0.979 c -0.478 0.244 -1.105 0.244 -2.36 0.244 H 4.584 c -1.255 0.0 -1.882 0.0 -2.36 -0.244 c -0.422 -0.215 -0.765 -0.558 -0.98 -0.98 C 1.0 10.549 1.0 9.922 1.0 8.667 V 7.334 c 0.0 -1.255 0.0 -1.882 0.244 -2.36 c 0.215 -0.422 0.558 -0.765 0.98 -0.98 C 2.701 3.75 3.328 3.75 4.583 3.75 h 5.432 c 1.255 0.0 1.882 0.0 2.36 0.244 c 0.422 0.215 0.765 0.558 0.98 0.98 c 0.123 0.241 0.184 0.521 0.214 0.901 h 0.73 Z m -1.75 0.337 c 0.0 -0.773 -0.627 -1.4 -1.4 -1.4 h -7.7 c -0.773 0.0 -1.4 0.627 -1.4 1.4 v 3.575 c 0.0 0.773 0.627 1.4 1.4 1.4 h 7.7 c 0.773 0.0 1.4 -0.627 1.4 -1.4 V 6.212 Z")
        )
    }.build()
}
