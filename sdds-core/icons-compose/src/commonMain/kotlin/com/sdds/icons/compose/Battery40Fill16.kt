package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Battery40Fill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Battery40Fill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.955 1.7 c 0.0 -0.387 0.313 -0.7 0.7 -0.7 h 2.69 c 0.387 0.0 0.7 0.313 0.7 0.7 v 0.784 c 0.183 0.036 0.339 0.087 0.482 0.16 c 0.421 0.215 0.764 0.558 0.979 0.98 c 0.244 0.478 0.244 1.105 0.244 2.36 v 5.432 c 0.0 1.255 0.0 1.882 -0.244 2.36 c -0.215 0.422 -0.558 0.765 -0.98 0.98 C 10.049 15.0 9.422 15.0 8.167 15.0 H 7.834 c -1.255 0.0 -1.882 0.0 -2.36 -0.244 c -0.422 -0.215 -0.765 -0.558 -0.98 -0.98 c -0.244 -0.478 -0.244 -1.105 -0.244 -2.36 V 5.984 c 0.0 -1.255 0.0 -1.882 0.244 -2.36 c 0.215 -0.422 0.558 -0.765 0.98 -0.98 c 0.142 -0.073 0.298 -0.124 0.48 -0.16 V 1.7 Z M 5.273 13.25 c 0.0 0.387 0.313 0.7 0.7 0.7 h 4.054 c 0.387 0.0 0.7 -0.313 0.7 -0.7 V 12.9 c 0.0 -0.193 -0.157 -0.35 -0.35 -0.35 H 5.623 c -0.194 0.0 -0.35 0.157 -0.35 0.35 v 0.35 Z m 0.35 -1.12 c -0.194 0.0 -0.35 -0.157 -0.35 -0.35 v -0.7 c 0.0 -0.193 0.156 -0.35 0.35 -0.35 h 4.754 c 0.193 0.0 0.35 0.157 0.35 0.35 v 0.7 c 0.0 0.193 -0.157 0.35 -0.35 0.35 H 5.623 Z m -0.35 -2.17 c 0.0 0.193 0.156 0.35 0.35 0.35 h 4.754 c 0.193 0.0 0.35 -0.157 0.35 -0.35 v -0.7 c 0.0 -0.193 -0.157 -0.35 -0.35 -0.35 H 5.623 c -0.194 0.0 -0.35 0.157 -0.35 0.35 v 0.7 Z")
        )
    }.build()
}
