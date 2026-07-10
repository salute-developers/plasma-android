package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ColumnCheckboxOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ColumnCheckboxOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.562 3.0 h 2.053 C 10.932 4.014 11.88 4.75 13.0 4.75 h 9.0 c 1.12 0.0 2.067 -0.736 2.386 -1.75 h 2.052 C 26.08 5.128 24.23 6.75 22.0 6.75 h -9.0 c -2.23 0.0 -4.08 -1.622 -4.438 -3.75 Z M 13.0 11.0 h 9.0 c 1.38 0.0 2.5 1.12 2.5 2.5 v 9.0 c 0.0 1.38 -1.12 2.5 -2.5 2.5 h -9.0 c -1.38 0.0 -2.5 -1.12 -2.5 -2.5 v -9.0 c 0.0 -1.38 1.12 -2.5 2.5 -2.5 Z m -4.5 2.5 C 8.5 11.015 10.515 9.0 13.0 9.0 h 9.0 c 2.485 0.0 4.5 2.015 4.5 4.5 v 9.0 c 0.0 2.485 -2.015 4.5 -4.5 4.5 h -9.0 c -2.485 0.0 -4.5 -2.015 -4.5 -4.5 v -9.0 Z M 13.0 31.25 h 9.0 c 1.12 0.0 2.067 0.736 2.386 1.75 h 2.052 C 26.08 30.872 24.23 29.25 22.0 29.25 h -9.0 c -2.23 0.0 -4.08 1.622 -4.438 3.75 h 2.053 c 0.318 -1.014 1.266 -1.75 2.385 -1.75 Z m 9.082 -16.07 c 0.306 -0.46 0.182 -1.08 -0.277 -1.387 c -0.46 -0.306 -1.08 -0.182 -1.387 0.277 l -3.741 5.612 L 14.53 17.0 c -0.345 -0.431 -0.974 -0.5 -1.406 -0.156 c -0.431 0.345 -0.5 0.974 -0.156 1.406 l 2.744 3.43 c 0.55 0.686 1.609 0.64 2.097 -0.092 l 4.272 -6.408 Z")
        )
    }.build()
}
