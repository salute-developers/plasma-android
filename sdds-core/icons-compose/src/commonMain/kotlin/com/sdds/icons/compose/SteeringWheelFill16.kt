package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SteeringWheelFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SteeringWheelFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.925 13.632 c 1.738 -0.594 3.113 -1.97 3.707 -3.707 H 11.5 c -0.87 0.0 -1.575 0.705 -1.575 1.575 v 2.132 Z M 6.075 11.5 v 2.132 c -1.738 -0.594 -3.113 -1.97 -3.707 -3.707 H 4.5 c 0.87 0.0 1.575 0.705 1.575 1.575 Z m 7.663 -5.079 c -1.115 -0.044 -1.762 -0.438 -2.49 -0.882 l -0.006 -0.005 C 10.44 5.044 9.547 4.5 8.0 4.5 c -1.515 0.0 -2.322 0.524 -3.06 1.003 L 4.87 5.546 c -0.369 0.24 -0.71 0.452 -1.138 0.61 c -0.381 0.142 -0.848 0.247 -1.47 0.266 C 2.953 3.902 5.26 2.05 8.0 2.05 s 5.046 1.851 5.738 4.371 Z M 15.0 8.0 c 0.0 3.866 -3.134 7.0 -7.0 7.0 s -7.0 -3.134 -7.0 -7.0 s 3.134 -7.0 7.0 -7.0 s 7.0 3.134 7.0 7.0 Z M 8.0 9.4 c 0.773 0.0 1.4 -0.627 1.4 -1.4 c 0.0 -0.773 -0.627 -1.4 -1.4 -1.4 c -0.773 0.0 -1.4 0.627 -1.4 1.4 c 0.0 0.773 0.627 1.4 1.4 1.4 Z")
        )
    }.build()
}
