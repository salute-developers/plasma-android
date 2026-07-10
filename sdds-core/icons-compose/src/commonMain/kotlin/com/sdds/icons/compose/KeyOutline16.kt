package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.KeyOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "KeyOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.497 2.068 c 1.938 -0.005 3.504 1.561 3.499 3.5 c -0.005 1.94 -1.583 3.517 -3.523 3.522 c -0.517 0.001 -1.007 -0.109 -1.447 -0.308 C 8.602 8.591 8.058 8.876 8.056 9.4 l -0.002 0.916 l -1.246 0.003 c -0.372 0.001 -0.673 0.302 -0.674 0.673 L 6.132 11.89 l -1.595 0.005 c -0.372 0.0 -0.673 0.301 -0.674 0.673 l -0.003 1.38 l -1.75 0.005 l 0.006 -2.25 l 4.799 -4.8 c 0.136 -0.136 0.19 -0.33 0.148 -0.515 c -0.059 -0.255 -0.09 -0.522 -0.089 -0.797 c 0.005 -1.94 1.583 -3.518 3.523 -3.523 Z m 4.499 3.502 c 0.006 -2.492 -2.01 -4.508 -4.502 -4.502 c -2.49 0.007 -4.513 2.03 -4.52 4.52 c 0.0 0.265 0.022 0.525 0.065 0.777 l -4.725 4.726 c -0.126 0.126 -0.198 0.297 -0.198 0.475 l -0.007 2.711 c -0.001 0.375 0.302 0.678 0.677 0.677 l 2.4 -0.006 c 0.371 -0.001 0.672 -0.302 0.673 -0.673 l 0.003 -1.381 l 1.596 -0.005 c 0.371 0.0 0.672 -0.301 0.673 -0.673 l 0.003 -0.898 l 1.246 -0.003 c 0.372 0.0 0.673 -0.302 0.674 -0.673 l 0.002 -0.777 c 0.446 0.147 0.924 0.226 1.42 0.225 c 2.49 -0.006 4.513 -2.03 4.52 -4.52 Z m -3.814 0.358 c 0.579 -0.001 1.049 -0.471 1.05 -1.05 c 0.002 -0.578 -0.466 -1.046 -1.044 -1.044 c -0.578 0.001 -1.048 0.472 -1.05 1.05 c -0.001 0.578 0.466 1.046 1.044 1.044 Z")
        )
    }.build()
}
