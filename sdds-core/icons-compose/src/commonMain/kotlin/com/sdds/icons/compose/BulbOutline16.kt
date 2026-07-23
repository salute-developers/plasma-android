package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BulbOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BulbOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.075 1.5 C 5.548 1.5 3.5 3.548 3.5 6.075 c 0.0 1.523 0.743 2.872 1.89 3.704 c 0.02 -0.002 0.04 -0.004 0.06 -0.004 h 5.25 c 0.02 0.0 0.04 0.002 0.06 0.004 c 1.147 -0.832 1.89 -2.181 1.89 -3.704 c 0.0 -2.527 -2.048 -4.575 -4.575 -4.575 Z m 1.798 9.275 H 6.277 c 0.061 0.138 0.108 0.285 0.135 0.441 l 0.201 1.14 C 6.69 12.786 7.063 13.1 7.5 13.1 h 1.15 c 0.437 0.0 0.81 -0.313 0.887 -0.744 l 0.2 -1.14 c 0.028 -0.156 0.075 -0.303 0.136 -0.44 Z M 2.5 6.075 C 2.5 2.996 4.996 0.5 8.075 0.5 s 5.575 2.496 5.575 5.575 c 0.0 1.904 -0.955 3.585 -2.41 4.59 c -0.285 0.197 -0.47 0.455 -0.517 0.725 l -0.202 1.14 c -0.133 0.756 -0.702 1.341 -1.421 1.516 v 0.255 c 0.0 0.469 -0.38 0.85 -0.85 0.85 H 7.9 c -0.47 0.0 -0.85 -0.381 -0.85 -0.85 v -0.255 c -0.719 -0.175 -1.288 -0.76 -1.422 -1.516 l -0.2 -1.14 c -0.048 -0.27 -0.233 -0.528 -0.518 -0.725 C 3.455 9.66 2.5 7.979 2.5 6.075 Z M 8.05 14.1 v 0.05 H 8.1 V 14.1 H 8.05 Z")
        )
    }.build()
}
