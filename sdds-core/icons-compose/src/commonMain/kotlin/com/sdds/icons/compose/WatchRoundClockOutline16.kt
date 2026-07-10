package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WatchRoundClockOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WatchRoundClockOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.166 1.927 c 0.128 -0.542 0.611 -0.925 1.168 -0.925 h 3.101 c 0.557 0.0 1.041 0.383 1.168 0.925 l 0.575 2.446 l -0.012 0.003 c 0.738 0.67 1.27 1.562 1.491 2.57 h 0.668 c 0.096 0.0 0.175 0.078 0.175 0.175 V 8.88 c 0.0 0.096 -0.079 0.175 -0.175 0.175 h -0.668 c -0.221 1.008 -0.754 1.9 -1.492 2.57 l 0.013 0.003 l -0.575 2.446 c -0.127 0.542 -0.61 0.925 -1.168 0.925 h -3.1 c -0.558 0.0 -1.041 -0.383 -1.169 -0.925 l -0.575 -2.446 l 0.014 -0.003 C 3.62 10.729 3.0 9.437 3.0 8.0 C 3.0 6.563 3.619 5.27 4.604 4.376 L 4.591 4.373 l 0.575 -2.446 Z m 0.64 1.646 c 0.631 -0.298 1.336 -0.464 2.08 -0.464 c 0.742 0.0 1.446 0.166 2.077 0.463 L 9.63 2.156 c -0.021 -0.09 -0.102 -0.154 -0.195 -0.154 h -3.1 c -0.093 0.0 -0.174 0.064 -0.195 0.154 L 5.807 3.573 Z m 0.0 8.854 l 0.334 1.417 c 0.02 0.09 0.102 0.154 0.194 0.154 h 3.101 c 0.093 0.0 0.174 -0.063 0.195 -0.154 l 0.333 -1.417 c -0.63 0.297 -1.335 0.463 -2.078 0.463 c -0.743 0.0 -1.448 -0.166 -2.078 -0.463 Z M 4.0 8.0 c 0.0 -2.15 1.74 -3.89 3.885 -3.89 c 2.146 0.0 3.886 1.74 3.886 3.89 c 0.0 2.149 -1.74 3.89 -3.886 3.89 C 5.74 11.89 4.0 10.15 4.0 8.0 Z m 4.385 -2.458 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 s -0.5 0.224 -0.5 0.5 v 2.81 c 0.0 0.167 0.083 0.323 0.222 0.416 L 9.186 9.82 c 0.23 0.154 0.54 0.092 0.693 -0.138 c 0.154 -0.23 0.092 -0.54 -0.138 -0.693 L 8.385 8.084 V 5.542 Z")
        )
    }.build()
}
