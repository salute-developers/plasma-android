package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WatchRoundOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WatchRoundOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.334 1.0 c -0.557 0.0 -1.04 0.383 -1.168 0.925 L 4.591 4.371 l 0.014 0.003 C 3.619 5.27 3.0 6.561 3.0 7.998 c 0.0 1.437 0.619 2.729 1.605 3.624 L 4.59 11.625 l 0.575 2.446 c 0.128 0.542 0.611 0.925 1.168 0.925 h 3.101 c 0.557 0.0 1.041 -0.383 1.168 -0.925 l 0.575 -2.446 l -0.012 -0.003 c 0.738 -0.67 1.27 -1.562 1.491 -2.57 h 0.668 c 0.096 0.0 0.175 -0.079 0.175 -0.175 V 7.119 c 0.0 -0.096 -0.079 -0.175 -0.175 -0.175 h -0.668 c -0.221 -1.008 -0.753 -1.9 -1.49 -2.57 l 0.011 -0.003 l -0.575 -2.446 C 10.476 1.383 9.993 1.0 9.435 1.0 h -3.1 Z m 1.551 2.107 c -0.743 0.0 -1.448 0.167 -2.078 0.464 L 6.14 2.154 C 6.16 2.064 6.242 2.0 6.334 2.0 h 3.101 C 9.528 2.0 9.61 2.064 9.63 2.154 L 9.963 3.57 c -0.63 -0.297 -1.335 -0.463 -2.078 -0.463 Z M 6.14 13.842 l -0.333 -1.417 c 0.63 0.297 1.335 0.464 2.078 0.464 c 0.743 0.0 1.447 -0.166 2.078 -0.463 L 9.63 13.842 c -0.021 0.09 -0.102 0.154 -0.195 0.154 h -3.1 c -0.093 0.0 -0.174 -0.064 -0.195 -0.154 Z m 1.745 -9.735 C 5.74 4.107 4.0 5.85 4.0 7.998 c 0.0 2.15 1.74 3.89 3.885 3.89 c 2.146 0.0 3.886 -1.74 3.886 -3.89 c 0.0 -2.15 -1.74 -3.89 -3.886 -3.89 Z")
        )
    }.build()
}
