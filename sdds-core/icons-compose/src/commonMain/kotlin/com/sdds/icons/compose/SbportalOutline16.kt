package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SbportalOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SbportalOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.365 2.929 h 4.431 c 0.663 0.0 1.2 0.537 1.2 1.2 v 6.658 c 0.0 0.663 -0.537 1.2 -1.2 1.2 H 11.91 c -0.015 0.027 -0.031 0.056 -0.05 0.086 c -0.135 0.229 -0.349 0.53 -0.661 0.83 c -0.634 0.61 -1.655 1.196 -3.2 1.196 c -1.547 0.0 -2.568 -0.586 -3.201 -1.196 c -0.313 -0.3 -0.526 -0.601 -0.662 -0.83 l -0.05 -0.086 H 2.2 c -0.663 0.0 -1.2 -0.537 -1.2 -1.2 V 4.129 c 0.0 -0.663 0.537 -1.2 1.2 -1.2 h 4.431 C 6.778 2.31 7.334 1.85 7.998 1.85 s 1.22 0.46 1.367 1.078 Z M 7.998 4.656 c 0.531 0.0 0.993 -0.294 1.232 -0.727 h 4.566 c 0.11 0.0 0.2 0.09 0.2 0.2 v 6.658 c 0.0 0.11 -0.09 0.2 -0.2 0.2 H 2.2 c -0.11 0.0 -0.2 -0.09 -0.2 -0.2 V 4.129 c 0.0 -0.11 0.09 -0.2 0.2 -0.2 h 4.566 c 0.24 0.433 0.701 0.727 1.232 0.727 Z m -2.507 7.527 c -0.068 -0.066 -0.13 -0.132 -0.186 -0.196 h 5.387 c -0.056 0.064 -0.118 0.13 -0.187 0.196 c -0.464 0.447 -1.243 0.916 -2.507 0.916 s -2.043 -0.47 -2.507 -0.916 Z")
        )
    }.build()
}
