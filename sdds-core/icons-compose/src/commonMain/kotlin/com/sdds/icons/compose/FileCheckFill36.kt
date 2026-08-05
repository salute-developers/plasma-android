package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FileCheckFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FileCheckFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.0 10.8 c 0.0 -2.73 0.0 -4.095 0.531 -5.138 C 7.0 4.745 7.745 3.999 8.661 3.532 C 9.706 3.0 11.07 3.0 13.8 3.0 h 8.4 c 2.73 0.0 4.095 0.0 5.138 0.531 c 0.918 0.468 1.663 1.214 2.13 2.13 C 30.0 6.706 30.0 8.07 30.0 10.8 v 14.4 c 0.0 2.73 0.0 4.095 -0.531 5.138 c -0.468 0.918 -1.213 1.663 -2.13 2.13 C 26.294 33.0 24.93 33.0 22.2 33.0 h -8.4 c -2.73 0.0 -4.095 0.0 -5.138 -0.531 c -0.917 -0.468 -1.663 -1.213 -2.13 -2.13 C 6.0 29.294 6.0 27.93 6.0 25.2 V 10.8 Z M 11.0 9.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 12.0 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 H 12.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 Z m 0.0 5.625 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 12.0 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 H 12.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 Z m 0.0 5.625 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 3.375 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 H 12.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 Z m 14.457 3.707 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 c -0.39 -0.39 -1.024 -0.39 -1.414 0.0 l -3.793 3.793 l -1.543 -1.543 c -0.39 -0.39 -1.024 -0.39 -1.414 0.0 c -0.39 0.39 -0.39 1.024 0.0 1.414 l 2.25 2.25 c 0.39 0.39 1.024 0.39 1.414 0.0 l 4.5 -4.5 Z")
        )
    }.build()
}
