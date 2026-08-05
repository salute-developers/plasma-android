package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BatteryHorizChargeOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BatteryHorizChargeOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.0 6.575 c 0.0 -0.386 -0.313 -0.7 -0.7 -0.7 h -0.73 c -0.03 -0.38 -0.09 -0.66 -0.214 -0.902 c -0.215 -0.421 -0.558 -0.764 -0.98 -0.979 c -0.478 -0.244 -1.105 -0.244 -2.36 -0.244 H 4.584 c -1.255 0.0 -1.882 0.0 -2.36 0.244 c -0.422 0.215 -0.765 0.558 -0.98 0.98 C 1.0 5.451 1.0 6.078 1.0 7.333 v 1.332 c 0.0 1.255 0.0 1.882 0.244 2.36 c 0.215 0.422 0.558 0.765 0.98 0.98 c 0.478 0.244 1.105 0.244 2.36 0.244 h 5.432 c 1.255 0.0 1.882 0.0 2.36 -0.244 c 0.422 -0.215 0.765 -0.558 0.98 -0.98 c 0.123 -0.241 0.184 -0.521 0.214 -0.9 h 0.73 c 0.387 0.0 0.7 -0.314 0.7 -0.7 v -2.85 Z m -3.85 -1.763 c 0.773 0.0 1.4 0.627 1.4 1.4 v 3.575 c 0.0 0.773 -0.627 1.4 -1.4 1.4 h -7.7 c -0.773 0.0 -1.4 -0.627 -1.4 -1.4 V 6.212 c 0.0 -0.773 0.627 -1.4 1.4 -1.4 h 7.7 Z M 5.245 8.188 c -0.113 0.158 0.0 0.496 0.195 0.496 h 1.896 l -0.715 1.973 c -0.032 0.247 0.288 0.372 0.433 0.17 L 9.77 7.764 c 0.114 -0.158 0.007 -0.496 -0.188 -0.496 H 7.664 l 0.693 -1.973 C 8.39 5.05 8.07 4.923 7.924 5.125 L 5.245 8.189 Z")
        )
    }.build()
}
