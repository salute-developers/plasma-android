package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ColumnCheckboxFillOff36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ColumnCheckboxFillOff36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.562 3.0 h 2.053 C 10.932 4.014 11.88 4.75 13.0 4.75 h 9.0 c 1.12 0.0 2.067 -0.736 2.386 -1.75 h 2.052 C 26.08 5.128 24.23 6.75 22.0 6.75 h -9.0 c -2.23 0.0 -4.08 -1.622 -4.438 -3.75 Z M 22.0 31.25 h -9.0 c -1.12 0.0 -2.067 0.736 -2.386 1.75 H 8.563 C 8.92 30.872 10.77 29.25 13.0 29.25 h 9.0 c 2.23 0.0 4.08 1.622 4.438 3.75 h -2.052 c -0.319 -1.014 -1.267 -1.75 -2.386 -1.75 Z M 8.5 13.5 C 8.5 11.015 10.515 9.0 13.0 9.0 h 9.0 c 0.813 0.0 1.575 0.216 2.233 0.593 l 5.513 -5.513 c 0.39 -0.39 1.024 -0.39 1.414 0.0 c 0.39 0.39 0.39 1.024 0.0 1.414 L 5.704 30.95 c -0.39 0.39 -1.023 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.024 0.0 -1.414 l 4.803 -4.803 C 8.716 24.075 8.5 23.313 8.5 22.5 v -9.0 Z m 5.628 6.198 l 1.423 -1.423 L 14.53 17.0 c -0.345 -0.431 -0.974 -0.5 -1.406 -0.156 c -0.43 0.345 -0.5 0.974 -0.156 1.406 l 1.159 1.448 Z M 26.5 13.5 c 0.0 -0.187 -0.011 -0.371 -0.034 -0.552 l -8.695 8.695 c -0.079 0.107 -0.17 0.197 -0.272 0.272 l -5.051 5.052 C 12.628 26.988 12.813 27.0 13.0 27.0 h 9.0 c 2.485 0.0 4.5 -2.015 4.5 -4.5 v -9.0 Z")
        )
    }.build()
}
