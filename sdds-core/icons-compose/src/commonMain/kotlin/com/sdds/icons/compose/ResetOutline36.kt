package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ResetOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ResetOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.875 3.0 C 12.375 3.0 7.574 5.985 5.0 10.42 V 7.084 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 v 5.396 c 0.0 0.553 0.448 1.0 1.0 1.0 h 1.065 h 0.046 h 4.285 c 0.552 0.0 1.0 -0.447 1.0 -1.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 H 6.698 C 8.92 7.607 13.094 5.0 17.875 5.0 c 7.11 0.0 12.875 5.764 12.875 12.875 c 0.0 7.11 -5.764 12.875 -12.875 12.875 c -5.333 0.0 -9.911 -3.243 -11.866 -7.868 c -0.215 -0.51 -0.801 -0.747 -1.31 -0.532 c -0.509 0.215 -0.747 0.801 -0.532 1.31 c 2.256 5.34 7.543 9.09 13.708 9.09 c 8.215 0.0 14.875 -6.66 14.875 -14.875 S 26.09 3.0 17.875 3.0 Z m 0.0 17.875 c 1.657 0.0 3.0 -1.343 3.0 -3.0 s -1.343 -3.0 -3.0 -3.0 s -3.0 1.343 -3.0 3.0 s 1.343 3.0 3.0 3.0 Z")
        )
    }.build()
}
