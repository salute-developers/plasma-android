package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Header316: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Header316",
        defaultWidth = 17.dp,
        defaultHeight = 16.dp,
        viewportWidth = 17f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.714 8.47 v 3.03 h 1.0 v -7.0 h -1.0 v 2.812 h -2.5 V 4.5 h -1.0 v 7.0 h 1.0 V 8.47 h 2.5 Z m 1.793 -3.287 C 9.797 4.851 10.445 4.5 11.341 4.5 c 1.236 0.01 1.902 0.664 1.902 1.738 c 0.0 0.81 -0.401 1.367 -1.015 1.62 c 0.793 0.166 1.236 0.703 1.236 1.63 c 0.0 1.133 -0.725 1.992 -2.183 2.012 c -0.913 0.0 -1.57 -0.4 -1.817 -0.693 V 9.508 c 0.376 0.498 1.015 0.84 1.8 0.83 c 0.793 -0.01 1.211 -0.38 1.211 -0.976 c 0.0 -0.644 -0.35 -0.967 -1.27 -0.967 H 10.53 V 7.517 h 0.495 c 0.785 0.0 1.22 -0.293 1.22 -0.947 c 0.0 -0.625 -0.35 -0.908 -1.05 -0.908 c -0.733 0.02 -1.296 0.302 -1.688 0.82 V 5.183 Z")
        )
    }.build()
}
