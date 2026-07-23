package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideForwardBack36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideForwardBack36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.734 6.294 c -0.286 -0.287 -0.716 -0.373 -1.09 -0.218 C 20.27 6.23 20.026 6.596 20.026 7.0 v 7.586 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 V 9.418 L 30.586 18.0 l -8.56 8.58 v -3.65 c 0.0 -0.551 -0.448 -1.0 -1.0 -1.0 H 10.432 c -0.553 0.0 -1.0 0.449 -1.0 1.0 c 0.0 0.553 0.447 1.0 1.0 1.0 h 9.594 V 29.0 c 0.0 0.404 0.244 0.769 0.618 0.923 c 0.374 0.155 0.804 0.069 1.09 -0.218 l 10.972 -10.999 c 0.39 -0.39 0.39 -1.022 0.0 -1.412 l -10.972 -11.0 Z m -13.62 5.584 c 0.39 -0.391 0.389 -1.024 -0.002 -1.414 c -0.391 -0.39 -1.025 -0.39 -1.415 0.001 L 3.292 13.88 c -0.39 0.39 -0.39 1.022 0.0 1.412 l 3.405 3.414 c 0.39 0.39 1.024 0.392 1.415 0.002 c 0.39 -0.39 0.391 -1.024 0.001 -1.415 L 6.41 15.585 h 10.076 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 H 6.41 l 1.703 -1.707 Z")
        )
    }.build()
}
