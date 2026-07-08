package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Battery100Fill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Battery100Fill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.655 1.0 c -0.387 0.0 -0.7 0.313 -0.7 0.7 v 0.784 C 5.772 2.52 5.616 2.571 5.473 2.644 C 5.052 2.86 4.71 3.202 4.494 3.624 C 4.25 4.101 4.25 4.728 4.25 5.983 v 5.432 c 0.0 1.255 0.0 1.882 0.244 2.36 c 0.215 0.422 0.558 0.765 0.98 0.98 C 5.951 15.0 6.578 15.0 7.833 15.0 h 0.332 c 1.255 0.0 1.882 0.0 2.36 -0.244 c 0.422 -0.215 0.765 -0.558 0.98 -0.98 c 0.244 -0.478 0.244 -1.105 0.244 -2.36 V 5.984 c 0.0 -1.255 0.0 -1.882 -0.244 -2.36 c -0.215 -0.422 -0.558 -0.765 -0.98 -0.98 c -0.142 -0.073 -0.298 -0.124 -0.48 -0.16 V 1.7 c 0.0 -0.387 -0.314 -0.7 -0.7 -0.7 H 6.654 Z M 5.973 13.95 c -0.387 0.0 -0.7 -0.313 -0.7 -0.7 V 12.9 c 0.0 -0.193 0.156 -0.35 0.35 -0.35 h 4.754 c 0.193 0.0 0.35 0.157 0.35 0.35 v 0.35 c 0.0 0.387 -0.313 0.7 -0.7 0.7 H 5.973 Z m -0.7 -2.17 c 0.0 0.193 0.156 0.35 0.35 0.35 h 4.754 c 0.193 0.0 0.35 -0.157 0.35 -0.35 v -0.7 c 0.0 -0.193 -0.157 -0.35 -0.35 -0.35 H 5.623 c -0.194 0.0 -0.35 0.157 -0.35 0.35 v 0.7 Z m 0.35 -1.47 c -0.194 0.0 -0.35 -0.157 -0.35 -0.35 v -0.7 c 0.0 -0.193 0.156 -0.35 0.35 -0.35 h 4.754 c 0.193 0.0 0.35 0.157 0.35 0.35 v 0.7 c 0.0 0.193 -0.157 0.35 -0.35 0.35 H 5.623 Z m -0.35 -2.17 c 0.0 0.194 0.156 0.35 0.35 0.35 h 4.754 c 0.193 0.0 0.35 -0.156 0.35 -0.35 v -0.7 c 0.0 -0.193 -0.157 -0.35 -0.35 -0.35 H 5.623 c -0.194 0.0 -0.35 0.157 -0.35 0.35 v 0.7 Z m 0.35 -1.47 c -0.194 0.0 -0.35 -0.157 -0.35 -0.35 v -0.7 c 0.0 -0.193 0.156 -0.35 0.35 -0.35 h 4.754 c 0.193 0.0 0.35 0.157 0.35 0.35 v 0.7 c 0.0 0.193 -0.157 0.35 -0.35 0.35 H 5.623 Z M 5.273 4.5 c 0.0 0.193 0.156 0.35 0.35 0.35 h 4.754 c 0.193 0.0 0.35 -0.157 0.35 -0.35 V 4.15 c 0.0 -0.387 -0.313 -0.7 -0.7 -0.7 H 5.973 c -0.387 0.0 -0.7 0.313 -0.7 0.7 V 4.5 Z")
        )
    }.build()
}
