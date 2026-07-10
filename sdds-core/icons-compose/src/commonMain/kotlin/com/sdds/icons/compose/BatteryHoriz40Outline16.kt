package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BatteryHoriz40Outline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BatteryHoriz40Outline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.0 6.575 c 0.0 -0.386 -0.313 -0.7 -0.7 -0.7 h -0.73 c -0.03 -0.38 -0.09 -0.66 -0.214 -0.902 c -0.215 -0.421 -0.558 -0.764 -0.98 -0.979 c -0.478 -0.244 -1.105 -0.244 -2.36 -0.244 H 4.584 c -1.255 0.0 -1.882 0.0 -2.36 0.244 c -0.422 0.215 -0.765 0.558 -0.98 0.98 C 1.0 5.451 1.0 6.078 1.0 7.333 v 1.332 c 0.0 1.255 0.0 1.882 0.244 2.36 c 0.215 0.422 0.558 0.765 0.98 0.98 c 0.478 0.244 1.105 0.244 2.36 0.244 h 5.432 c 1.255 0.0 1.882 0.0 2.36 -0.244 c 0.422 -0.215 0.765 -0.558 0.98 -0.98 c 0.123 -0.241 0.184 -0.521 0.214 -0.9 h 0.73 c 0.387 0.0 0.7 -0.314 0.7 -0.7 v -2.85 Z m -3.85 -1.763 c 0.773 0.0 1.4 0.627 1.4 1.4 v 3.575 c 0.0 0.773 -0.627 1.4 -1.4 1.4 h -7.7 c -0.773 0.0 -1.4 -0.627 -1.4 -1.4 V 6.212 c 0.0 -0.773 0.627 -1.4 1.4 -1.4 h 7.7 Z M 3.1 5.521 c -0.193 0.0 -0.35 0.157 -0.35 0.35 v 4.258 c 0.0 0.194 0.157 0.35 0.35 0.35 h 0.35 c 0.193 0.0 0.35 -0.156 0.35 -0.35 V 5.871 c 0.0 -0.193 -0.157 -0.35 -0.35 -0.35 H 3.1 Z m 2.87 0.35 c 0.0 -0.193 0.156 -0.35 0.35 -0.35 h 0.35 c 0.193 0.0 0.35 0.157 0.35 0.35 v 4.258 c 0.0 0.194 -0.157 0.35 -0.35 0.35 H 6.32 c -0.194 0.0 -0.35 -0.156 -0.35 -0.35 V 5.871 Z M 4.71 5.52 c -0.193 0.0 -0.35 0.157 -0.35 0.35 v 4.258 c 0.0 0.194 0.157 0.35 0.35 0.35 h 0.35 c 0.193 0.0 0.35 -0.156 0.35 -0.35 V 5.871 c 0.0 -0.193 -0.157 -0.35 -0.35 -0.35 H 4.71 Z")
        )
    }.build()
}
