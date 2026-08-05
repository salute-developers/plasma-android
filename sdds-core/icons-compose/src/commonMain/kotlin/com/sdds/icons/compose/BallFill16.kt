package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BallFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BallFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.068 8.0 c 0.0 -2.02 0.377 -3.823 0.964 -5.102 C 6.641 1.574 7.375 1.0 8.0 1.0 c 3.866 0.0 7.0 3.134 7.0 7.0 c 0.0 0.625 -0.574 1.36 -1.898 1.968 c -1.279 0.587 -3.082 0.964 -5.102 0.964 c -0.958 0.0 -1.868 -0.085 -2.696 -0.236 C 5.152 9.868 5.068 8.958 5.068 8.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.608 10.316 c -0.323 0.227 -0.685 0.43 -1.068 0.606 c -1.445 0.664 -3.404 1.06 -5.54 1.06 c -0.848 0.0 -1.668 -0.062 -2.44 -0.18 c 0.135 0.476 0.294 0.912 0.472 1.3 C 6.641 14.426 7.375 15.0 8.0 15.0 c 3.054 0.0 5.652 -1.956 6.608 -4.684 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.684 14.608 c -0.227 -0.323 -0.43 -0.685 -0.606 -1.068 c -0.265 -0.578 -0.488 -1.238 -0.66 -1.958 c -0.72 -0.172 -1.38 -0.395 -1.958 -0.66 c -0.383 -0.176 -0.745 -0.379 -1.068 -0.606 c 0.702 2.003 2.29 3.59 4.292 4.292 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.0 8.0 c 0.0 0.625 0.574 1.36 1.898 1.968 c 0.388 0.178 0.824 0.337 1.3 0.471 C 4.08 9.67 4.017 8.848 4.017 8.0 c 0.0 -2.136 0.396 -4.095 1.06 -5.54 c 0.176 -0.383 0.379 -0.745 0.606 -1.068 C 2.956 2.348 1.0 4.946 1.0 8.0 Z")
        )
    }.build()
}
