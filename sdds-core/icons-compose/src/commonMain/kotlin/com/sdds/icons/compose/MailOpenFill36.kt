package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MailOpenFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MailOpenFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.108 3.36 c -0.731 -0.147 -1.484 -0.147 -2.216 0.0 c -0.828 0.168 -1.595 0.584 -2.703 1.186 l -6.986 3.79 c -1.215 0.66 -2.056 1.115 -2.683 1.788 c -0.554 0.593 -0.973 1.3 -1.23 2.07 C 3.0 13.07 3.0 14.027 3.0 15.414 v 9.027 c 0.0 1.224 0.0 2.211 0.065 3.01 c 0.067 0.824 0.209 1.547 0.548 2.216 c 0.54 1.062 1.4 1.926 2.458 2.468 c 0.667 0.34 1.387 0.482 2.207 0.55 c 0.796 0.065 1.78 0.065 2.999 0.065 h 13.446 c 1.22 0.0 2.203 0.0 3.0 -0.065 c 0.82 -0.068 1.54 -0.21 2.206 -0.55 c 1.058 -0.542 1.919 -1.406 2.458 -2.468 c 0.34 -0.67 0.481 -1.392 0.548 -2.216 C 33.0 26.652 33.0 25.665 33.0 24.441 v -9.026 c 0.0 -1.388 0.001 -2.346 -0.29 -3.22 c -0.257 -0.771 -0.676 -1.478 -1.23 -2.07 c -0.627 -0.674 -1.467 -1.13 -2.683 -1.788 L 21.81 4.546 c -1.108 -0.602 -1.875 -1.018 -2.703 -1.185 Z M 8.776 14.583 c -0.47 -0.29 -1.086 -0.145 -1.377 0.325 c -0.29 0.47 -0.144 1.086 0.325 1.376 l 7.385 4.563 c 1.772 1.094 4.01 1.094 5.782 0.0 l 7.385 -4.563 c 0.47 -0.29 0.615 -0.906 0.325 -1.376 c -0.29 -0.47 -0.907 -0.616 -1.377 -0.325 l -7.384 4.562 c -1.128 0.697 -2.552 0.697 -3.68 0.0 l -7.384 -4.562 Z")
        )
    }.build()
}
