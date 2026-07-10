package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BatteryHoriz40Fill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BatteryHoriz40Fill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.3 5.955 c 0.387 0.0 0.7 0.313 0.7 0.7 v 2.69 c 0.0 0.387 -0.313 0.7 -0.7 0.7 h -0.784 c -0.036 0.183 -0.087 0.339 -0.16 0.482 c -0.215 0.421 -0.558 0.764 -0.98 0.979 c -0.478 0.244 -1.105 0.244 -2.36 0.244 H 4.584 c -1.255 0.0 -1.882 0.0 -2.36 -0.244 c -0.422 -0.215 -0.765 -0.558 -0.98 -0.98 C 1.0 10.049 1.0 9.422 1.0 8.167 V 7.834 c 0.0 -1.255 0.0 -1.882 0.244 -2.36 c 0.215 -0.422 0.558 -0.765 0.98 -0.98 C 2.701 4.25 3.328 4.25 4.583 4.25 h 5.432 c 1.255 0.0 1.882 0.0 2.36 0.244 c 0.422 0.215 0.765 0.558 0.98 0.98 c 0.073 0.142 0.124 0.298 0.16 0.48 H 14.3 Z M 2.75 5.273 c -0.387 0.0 -0.7 0.313 -0.7 0.7 v 4.054 c 0.0 0.387 0.313 0.7 0.7 0.7 H 3.1 c 0.193 0.0 0.35 -0.157 0.35 -0.35 V 5.623 c 0.0 -0.194 -0.157 -0.35 -0.35 -0.35 H 2.75 Z m 1.12 0.35 c 0.0 -0.194 0.157 -0.35 0.35 -0.35 h 0.7 c 0.193 0.0 0.35 0.156 0.35 0.35 v 4.754 c 0.0 0.193 -0.157 0.35 -0.35 0.35 h -0.7 c -0.193 0.0 -0.35 -0.157 -0.35 -0.35 V 5.623 Z m 2.17 -0.35 c -0.193 0.0 -0.35 0.156 -0.35 0.35 v 4.754 c 0.0 0.193 0.157 0.35 0.35 0.35 h 0.7 c 0.193 0.0 0.35 -0.157 0.35 -0.35 V 5.623 c 0.0 -0.194 -0.157 -0.35 -0.35 -0.35 h -0.7 Z")
        )
    }.build()
}
