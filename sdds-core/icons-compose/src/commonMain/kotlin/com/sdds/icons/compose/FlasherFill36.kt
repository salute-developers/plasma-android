package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlasherFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlasherFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.998 5.5 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 v 5.3 c 0.0 0.553 0.448 1.0 1.0 1.0 s 1.0 -0.447 1.0 -1.0 V 5.5 Z m 10.708 4.31 c 0.39 -0.391 0.39 -1.024 0.0 -1.414 c -0.391 -0.39 -1.025 -0.39 -1.415 0.0 l -2.682 2.679 c -0.391 0.39 -0.391 1.023 0.0 1.413 c 0.39 0.39 1.024 0.39 1.415 0.0 l 2.682 -2.679 Z M 6.293 8.413 c 0.39 -0.39 1.024 -0.39 1.415 0.0 l 2.682 2.68 c 0.39 0.39 0.39 1.023 0.0 1.413 c -0.391 0.39 -1.025 0.39 -1.415 0.0 l -2.682 -2.68 c -0.391 -0.39 -0.391 -1.022 0.0 -1.413 Z m 19.382 19.303 l -0.428 -8.096 c -0.133 -2.523 -2.217 -4.5 -4.743 -4.5 h -5.026 c -2.526 0.0 -4.61 1.977 -4.743 4.5 l -0.427 8.096 h 15.367 Z m 1.94 1.79 c -0.043 0.007 -0.087 0.01 -0.132 0.01 H 8.513 c -0.044 0.0 -0.088 -0.003 -0.131 -0.01 c -0.49 0.065 -0.868 0.484 -0.868 0.992 c 0.0 0.552 0.447 1.0 1.0 1.0 h 18.97 c 0.551 0.0 1.0 -0.448 1.0 -1.0 c 0.0 -0.508 -0.38 -0.927 -0.87 -0.991 Z")
        )
    }.build()
}
