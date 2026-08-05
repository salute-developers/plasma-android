package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LocationPointFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LocationPointFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.248 4.25 c 0.0 -0.69 -0.56 -1.25 -1.25 -1.25 s -1.25 0.56 -1.25 1.25 v 2.255 c -5.387 0.579 -9.665 4.86 -10.244 10.247 H 4.25 c -0.69 0.0 -1.25 0.56 -1.25 1.25 s 0.56 1.25 1.25 1.25 h 2.254 c 0.579 5.388 4.857 9.668 10.244 10.247 v 2.255 c 0.0 0.69 0.56 1.25 1.25 1.25 s 1.25 -0.56 1.25 -1.25 v -2.255 c 5.387 -0.58 9.666 -4.86 10.245 -10.247 h 2.254 c 0.69 0.0 1.25 -0.56 1.25 -1.25 s -0.56 -1.25 -1.25 -1.25 h -2.254 c -0.58 -5.388 -4.858 -9.668 -10.245 -10.247 V 4.25 Z M 8.938 18.002 c 0.0 -5.006 4.056 -9.064 9.06 -9.064 c 5.004 0.0 9.061 4.058 9.061 9.064 s -4.057 9.064 -9.06 9.064 c -5.005 0.0 -9.062 -4.058 -9.062 -9.064 Z m 9.06 6.113 c 3.375 0.0 6.11 -2.737 6.11 -6.112 c 0.0 -3.376 -2.735 -6.112 -6.11 -6.112 c -3.375 0.0 -6.11 2.736 -6.11 6.112 c 0.0 3.375 2.735 6.111 6.11 6.111 Z")
        )
    }.build()
}
