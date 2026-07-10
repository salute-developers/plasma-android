package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideTraceR36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideTraceR36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.734 6.294 c -0.286 -0.287 -0.716 -0.373 -1.09 -0.218 C 20.27 6.23 20.026 6.596 20.026 7.0 v 5.069 H 11.19 c -0.552 0.0 -1.0 0.447 -1.0 1.0 c 0.0 0.552 0.448 1.0 1.0 1.0 h 9.837 c 0.553 0.0 1.0 -0.448 1.0 -1.0 v -3.65 l 8.56 8.58 l -8.56 8.58 v -3.65 c 0.0 -0.551 -0.447 -1.0 -1.0 -1.0 H 4.0 c -0.552 0.0 -1.0 0.449 -1.0 1.0 c 0.0 0.553 0.448 1.0 1.0 1.0 h 16.026 V 29.0 c 0.0 0.404 0.244 0.769 0.618 0.923 c 0.374 0.155 0.805 0.069 1.09 -0.218 l 10.973 -10.999 c 0.39 -0.39 0.39 -1.022 0.0 -1.412 l -10.973 -11.0 Z M 6.648 16.999 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 5.297 c 0.553 0.0 1.0 -0.448 1.0 -1.0 s -0.447 -1.0 -1.0 -1.0 H 6.648 Z")
        )
    }.build()
}
