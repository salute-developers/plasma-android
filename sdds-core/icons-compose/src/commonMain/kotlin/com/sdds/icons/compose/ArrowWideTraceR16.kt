package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideTraceR16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideTraceR16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.755 2.643 C 9.612 2.503 9.397 2.461 9.212 2.54 C 9.026 2.617 8.905 2.799 8.905 3.0 v 2.259 H 4.84 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 4.566 c 0.276 0.0 0.5 -0.224 0.5 -0.5 V 4.192 L 13.785 8.0 l -3.88 3.809 v -1.568 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 H 1.502 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 7.403 v 2.26 c 0.0 0.2 0.121 0.382 0.307 0.46 c 0.185 0.078 0.4 0.037 0.543 -0.104 l 5.094 -5.0 c 0.095 -0.095 0.15 -0.223 0.15 -0.357 c 0.0 -0.135 -0.055 -0.263 -0.15 -0.357 l -5.094 -5.0 Z M 2.73 7.501 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 2.46 c 0.275 0.0 0.5 -0.224 0.5 -0.5 s -0.225 -0.5 -0.5 -0.5 H 2.73 Z")
        )
    }.build()
}
