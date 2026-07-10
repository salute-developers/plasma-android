package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Nested36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Nested36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.0 5.0 c 0.552 0.0 1.0 0.448 1.0 1.0 v 3.0 c 0.0 2.117 0.0 3.644 0.099 4.845 c 0.097 1.188 0.285 1.968 0.61 2.606 c 0.623 1.223 1.617 2.217 2.84 2.84 c 0.638 0.325 1.418 0.513 2.606 0.61 C 14.355 20.0 15.883 20.0 18.0 20.0 h 9.586 l -4.657 -4.657 c -0.39 -0.39 -0.39 -1.024 0.0 -1.414 c 0.39 -0.39 1.024 -0.39 1.414 0.0 l 6.364 6.364 c 0.39 0.39 0.39 1.024 0.0 1.414 l -6.364 6.364 c -0.39 0.39 -1.023 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.024 0.0 -1.414 L 27.586 22.0 h -9.631 c -2.062 0.0 -3.671 0.0 -4.962 -0.105 c -1.313 -0.108 -2.385 -0.329 -3.352 -0.821 c -1.6 -0.815 -2.9 -2.116 -3.715 -3.715 c -0.492 -0.967 -0.713 -2.04 -0.82 -3.352 C 5.0 12.716 5.0 11.107 5.0 9.045 V 6.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 Z")
        )
    }.build()
}
