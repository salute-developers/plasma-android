package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ColumnCheckboxFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ColumnCheckboxFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.562 3.0 h 2.053 C 10.932 4.014 11.88 4.75 13.0 4.75 h 9.0 c 1.12 0.0 2.067 -0.736 2.386 -1.75 h 2.052 C 26.08 5.128 24.23 6.75 22.0 6.75 h -9.0 c -2.23 0.0 -4.08 -1.622 -4.438 -3.75 Z M 22.0 31.25 h -9.0 c -1.12 0.0 -2.067 0.736 -2.386 1.75 H 8.563 C 8.92 30.872 10.77 29.25 13.0 29.25 h 9.0 c 2.23 0.0 4.08 1.622 4.438 3.75 h -2.052 c -0.319 -1.014 -1.267 -1.75 -2.386 -1.75 Z M 8.5 13.5 C 8.5 11.015 10.515 9.0 13.0 9.0 h 9.0 c 2.485 0.0 4.5 2.015 4.5 4.5 v 9.0 c 0.0 2.485 -2.015 4.5 -4.5 4.5 h -9.0 c -2.485 0.0 -4.5 -2.015 -4.5 -4.5 v -9.0 Z m 13.305 0.293 c 0.46 0.306 0.583 0.927 0.277 1.387 l -4.272 6.408 c -0.488 0.732 -1.547 0.778 -2.097 0.091 l -2.744 -3.43 c -0.345 -0.43 -0.275 -1.06 0.156 -1.405 c 0.432 -0.345 1.06 -0.275 1.406 0.156 l 2.146 2.682 l 3.74 -5.612 c 0.307 -0.46 0.928 -0.583 1.388 -0.277 Z")
        )
    }.build()
}
