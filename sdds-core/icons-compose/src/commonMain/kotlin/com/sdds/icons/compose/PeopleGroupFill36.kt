package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PeopleGroupFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PeopleGroupFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.75 12.0 c 0.0 2.9 -2.35 5.25 -5.25 5.25 S 8.25 14.9 8.25 12.0 s 2.35 -5.25 5.25 -5.25 S 18.75 9.1 18.75 12.0 Z M 4.606 22.172 c 2.55 -1.689 5.609 -2.672 8.894 -2.672 s 6.344 0.983 8.894 2.672 C 23.474 22.888 24.0 24.098 24.0 25.28 c 0.0 2.193 -1.777 3.97 -3.97 3.97 H 6.97 C 4.777 29.25 3.0 27.473 3.0 25.28 c 0.0 -1.182 0.527 -2.392 1.606 -3.108 Z M 25.5 25.5 c 0.0 0.563 -0.077 1.108 -0.223 1.625 h 4.704 c 1.668 0.0 3.021 -1.353 3.021 -3.021 c 0.0 -0.895 -0.399 -1.829 -1.239 -2.385 c -1.76 -1.165 -3.87 -1.844 -6.136 -1.844 c -1.077 0.0 -2.12 0.154 -3.106 0.44 c 1.782 1.04 2.98 2.973 2.98 5.185 Z m 0.0 -7.5 c 2.071 0.0 3.75 -1.679 3.75 -3.75 c 0.0 -2.071 -1.679 -3.75 -3.75 -3.75 c -2.07 0.0 -3.75 1.679 -3.75 3.75 c 0.0 2.071 1.68 3.75 3.75 3.75 Z")
        )
    }.build()
}
