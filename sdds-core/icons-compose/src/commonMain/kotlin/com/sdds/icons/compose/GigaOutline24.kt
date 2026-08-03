package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GigaOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GigaOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.006 10.006 c 0.183 0.64 0.283 1.316 0.283 2.015 c 0.0 4.029 -3.266 7.295 -7.295 7.295 c -1.695 0.0 -3.255 -0.578 -4.493 -1.547 c 0.237 0.02 0.486 0.03 0.757 0.03 c 0.227 0.0 0.47 -0.007 0.732 -0.022 c 1.544 -0.113 3.14 -0.572 4.616 -1.329 c 1.493 -0.765 2.793 -1.8 3.764 -2.996 c 0.629 -0.796 1.383 -2.02 1.597 -3.502 l 0.039 0.056 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.038 4.31 c 0.514 0.0 1.02 0.043 1.512 0.13 c -1.837 0.17 -3.731 0.98 -5.635 2.408 C 8.835 6.908 8.782 7.0 8.772 7.102 c -0.01 0.1 0.025 0.2 0.092 0.276 c 0.622 0.685 1.243 1.434 1.955 2.356 c 0.119 0.154 0.335 0.186 0.494 0.074 c 1.436 -1.03 2.683 -1.791 3.89 -2.376 c -0.054 0.619 -0.883 1.577 -1.748 2.301 c -1.383 1.132 -3.048 2.309 -4.915 2.46 l -0.071 0.005 c -0.275 0.013 -0.571 -0.018 -0.878 -0.095 c -0.739 -0.189 -1.39 -0.833 -1.657 -1.637 c -0.113 -0.36 -0.128 -0.772 -0.046 -1.22 c 0.144 -0.739 0.518 -1.49 1.08 -2.177 l 0.009 -0.01 c 1.302 -1.72 3.569 -2.748 6.061 -2.748 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 2.0 c 5.522 0.0 10.0 4.477 10.0 10.0 s -4.478 10.0 -10.0 10.0 C 6.477 22.0 2.0 17.523 2.0 12.0 S 6.477 2.0 12.0 2.0 Z m 0.0 1.538 c -4.673 0.0 -8.462 3.79 -8.462 8.462 c 0.0 4.527 3.556 8.223 8.027 8.45 L 12.0 20.462 c 4.673 0.0 8.462 -3.788 8.462 -8.462 c 0.0 -4.673 -3.79 -8.462 -8.462 -8.462 Z")
        )
    }.build()
}
