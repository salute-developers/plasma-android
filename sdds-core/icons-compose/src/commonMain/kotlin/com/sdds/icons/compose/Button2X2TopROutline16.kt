package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Button2X2TopROutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Button2X2TopROutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.425 1.0 C 14.295 1.0 15.0 1.705 15.0 2.575 v 3.26 c 0.0 0.87 -0.705 1.576 -1.575 1.576 h -3.26 c -0.87 0.0 -1.575 -0.706 -1.575 -1.575 V 2.575 C 8.59 1.705 9.295 1.0 10.165 1.0 h 3.26 Z M 5.218 1.746 c 0.663 0.0 1.2 0.537 1.2 1.2 v 2.518 c 0.0 0.662 -0.537 1.2 -1.2 1.2 H 2.7 c -0.662 0.0 -1.2 -0.538 -1.2 -1.2 V 2.946 c 0.0 -0.663 0.538 -1.2 1.2 -1.2 h 2.518 Z m 0.2 1.2 c 0.0 -0.11 -0.09 -0.2 -0.2 -0.2 H 2.7 c -0.11 0.0 -0.2 0.09 -0.2 0.2 v 2.518 c 0.0 0.11 0.09 0.2 0.2 0.2 h 2.518 c 0.11 0.0 0.2 -0.09 0.2 -0.2 V 2.946 Z m 1.0 7.835 c 0.0 -0.663 -0.537 -1.2 -1.2 -1.2 H 2.7 c -0.662 0.0 -1.2 0.537 -1.2 1.2 V 13.3 c 0.0 0.662 0.538 1.2 1.2 1.2 h 2.518 c 0.663 0.0 1.2 -0.538 1.2 -1.2 V 10.78 Z m -1.2 -0.2 c 0.11 0.0 0.2 0.09 0.2 0.2 V 13.3 c 0.0 0.11 -0.09 0.2 -0.2 0.2 H 2.7 c -0.11 0.0 -0.2 -0.09 -0.2 -0.2 V 10.78 c 0.0 -0.11 0.09 -0.2 0.2 -0.2 h 2.518 Z m 7.838 -1.0 c 0.663 0.0 1.2 0.537 1.2 1.2 V 13.3 c 0.0 0.662 -0.537 1.2 -1.2 1.2 h -2.518 c -0.662 0.0 -1.2 -0.538 -1.2 -1.2 V 10.78 c 0.0 -0.663 0.538 -1.2 1.2 -1.2 h 2.518 Z m 0.2 1.2 c 0.0 -0.11 -0.09 -0.2 -0.2 -0.2 h -2.518 c -0.11 0.0 -0.2 0.09 -0.2 0.2 V 13.3 c 0.0 0.11 0.09 0.2 0.2 0.2 h 2.518 c 0.11 0.0 0.2 -0.09 0.2 -0.2 V 10.78 Z")
        )
    }.build()
}
