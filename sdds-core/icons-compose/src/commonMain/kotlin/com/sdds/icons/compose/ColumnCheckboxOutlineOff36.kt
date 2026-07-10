package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ColumnCheckboxOutlineOff36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ColumnCheckboxOutlineOff36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.562 3.0 h 2.053 C 10.932 4.014 11.88 4.75 13.0 4.75 h 9.0 c 1.12 0.0 2.067 -0.736 2.386 -1.75 h 2.052 C 26.08 5.128 24.23 6.75 22.0 6.75 h -9.0 c -2.23 0.0 -4.08 -1.622 -4.438 -3.75 Z M 13.0 11.0 h 9.0 c 0.25 0.0 0.492 0.037 0.72 0.105 l -7.159 7.16 l -1.036 -1.272 c -0.349 -0.428 -0.979 -0.492 -1.407 -0.143 c -0.428 0.349 -0.492 0.978 -0.143 1.407 l 1.165 1.43 l -3.535 3.534 C 10.537 22.992 10.5 22.75 10.5 22.5 v -9.0 c 0.0 -1.38 1.12 -2.5 2.5 -2.5 Z M 9.093 24.733 C 8.716 24.075 8.5 23.313 8.5 22.5 v -9.0 C 8.5 11.015 10.515 9.0 13.0 9.0 h 9.0 c 0.813 0.0 1.575 0.216 2.233 0.593 l 5.513 -5.513 c 0.39 -0.39 1.024 -0.39 1.414 0.0 c 0.39 0.39 0.39 1.024 0.0 1.414 L 5.704 30.95 c -0.39 0.39 -1.023 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.024 0.0 -1.414 l 4.803 -4.803 Z M 22.0 25.0 h -7.586 l -1.966 1.966 C 12.628 26.99 12.813 27.0 13.0 27.0 h 9.0 c 2.485 0.0 4.5 -2.015 4.5 -4.5 v -9.0 c 0.0 -0.187 -0.011 -0.371 -0.034 -0.552 L 24.5 14.914 V 22.5 c 0.0 1.38 -1.12 2.5 -2.5 2.5 Z m -9.0 6.25 h 9.0 c 1.12 0.0 2.067 0.736 2.386 1.75 h 2.052 C 26.08 30.872 24.23 29.25 22.0 29.25 h -9.0 c -2.23 0.0 -4.08 1.622 -4.438 3.75 h 2.053 c 0.318 -1.014 1.266 -1.75 2.385 -1.75 Z")
        )
    }.build()
}
