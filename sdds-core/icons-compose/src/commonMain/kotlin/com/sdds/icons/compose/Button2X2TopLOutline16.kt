package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Button2X2TopLOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Button2X2TopLOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.575 1.0 C 1.705 1.0 1.0 1.705 1.0 2.575 v 3.249 c 0.0 0.87 0.705 1.575 1.575 1.575 h 3.247 c 0.87 0.0 1.575 -0.706 1.575 -1.575 V 2.575 C 7.397 1.705 6.692 1.0 5.822 1.0 H 2.575 Z m 8.188 0.744 c -0.663 0.0 -1.2 0.537 -1.2 1.2 v 2.51 c 0.0 0.663 0.537 1.2 1.2 1.2 h 2.509 c 0.663 0.0 1.2 -0.537 1.2 -1.2 v -2.51 c 0.0 -0.663 -0.537 -1.2 -1.2 -1.2 h -2.51 Z m -0.2 1.2 c 0.0 -0.11 0.089 -0.2 0.2 -0.2 h 2.509 c 0.11 0.0 0.2 0.09 0.2 0.2 v 2.51 c 0.0 0.11 -0.09 0.2 -0.2 0.2 h -2.51 c -0.11 0.0 -0.2 -0.09 -0.2 -0.2 v -2.51 Z m -1.0 7.82 c 0.0 -0.662 0.537 -1.2 1.2 -1.2 h 2.509 c 0.663 0.0 1.2 0.538 1.2 1.2 v 2.511 c 0.0 0.663 -0.537 1.2 -1.2 1.2 h -2.51 c -0.662 0.0 -1.2 -0.537 -1.2 -1.2 v -2.51 Z m 1.2 -0.2 c -0.111 0.0 -0.2 0.09 -0.2 0.2 v 2.511 c 0.0 0.11 0.089 0.2 0.2 0.2 h 2.509 c 0.11 0.0 0.2 -0.09 0.2 -0.2 v -2.51 c 0.0 -0.11 -0.09 -0.2 -0.2 -0.2 h -2.51 Z m -7.82 -1.0 c -0.664 0.0 -1.2 0.538 -1.2 1.2 v 2.511 c 0.0 0.663 0.536 1.2 1.2 1.2 h 2.509 c 0.662 0.0 1.2 -0.537 1.2 -1.2 v -2.51 c 0.0 -0.663 -0.538 -1.2 -1.2 -1.2 h -2.51 Z m -0.2 1.2 c 0.0 -0.11 0.089 -0.2 0.2 -0.2 h 2.509 c 0.11 0.0 0.2 0.09 0.2 0.2 v 2.511 c 0.0 0.11 -0.09 0.2 -0.2 0.2 h -2.51 c -0.11 0.0 -0.2 -0.09 -0.2 -0.2 v -2.51 Z")
        )
    }.build()
}
